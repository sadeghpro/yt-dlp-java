package com.wonkglorg.ytdlp;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.wonkglorg.ytdlp.exception.YtDlpException;
import com.wonkglorg.ytdlp.mapper.PlaylistInfo;
import com.wonkglorg.ytdlp.mapper.VideoInfo;
import com.wonkglorg.ytdlp.mapper.PlaylistPreviewInfo;
import com.wonkglorg.ytdlp.utils.StreamGobbler;
import com.wonkglorg.ytdlp.utils.StreamProcessExtractor;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Provide an interface for yt-dlp executable
 *
 * <p>For more information on yt-dlp, please see <a
 * href="https://github.com/yt-dlp/yt-dlp/blob/master/README.md">yt-dlp Documentation</a>
 */
public class YtDlp {

    private YtDlp() {
        // Private constructor is here to encourage static usage of this class
    }

    /**
     * yt-dlp executable name
     */
    protected static String executablePath = "yt-dlp";

    /**
     * Append executable name to command
     *
     * @param command Command string
     * @return Command string
     */
    protected static String buildCommand(String command) {
        return String.format("%s %s", executablePath, command);
    }

    /**
     * Execute yt-dlp request
     *
     * @param request request object
     * @return response object
     * @throws YtDlpException
     */
    public static YtDlpResponse execute(YtDlpRequest request) throws YtDlpException {
        return execute(request, null);
    }

    /**
     * Execute yt-dlp request
     *
     * @param request  request object
     * @param callback callback
     * @return response object
     * @throws YtDlpException
     */
    public static YtDlpResponse execute(YtDlpRequest request, DownloadProgressCallback callback) throws YtDlpException {

        String command = buildCommand(request.buildOptions());
        String directory = request.getDirectory();
        Map<String, String> options = request.getOption();

        YtDlpResponse ytDlpResponse;
        Process process;
        int exitCode;
        StringBuilder outBuffer = new StringBuilder(); // stdout
        StringBuilder errBuffer = new StringBuilder(); // stderr
        long startTime = System.nanoTime();

        String[] split = command.split(" ");

        ProcessBuilder processBuilder = new ProcessBuilder(split);

        // Define directory if one is passed
        if (directory != null) processBuilder.directory(new File(directory));

        try {
            process = processBuilder.start();
        } catch (IOException e) {
            throw new YtDlpException(e);
        }

        InputStream outStream = process.getInputStream();
        InputStream errStream = process.getErrorStream();

        StreamProcessExtractor stdOutProcessor = new StreamProcessExtractor(outBuffer, outStream, callback);
        StreamGobbler stdErrProcessor = new StreamGobbler(errBuffer, errStream);

        try {
            stdOutProcessor.join();
            stdErrProcessor.join();
            exitCode = process.waitFor();
        } catch (InterruptedException e) {

            // process exited for some reason
            throw new YtDlpException(e);
        }

        String out = outBuffer.toString();
        String err = errBuffer.toString();

        if (exitCode > 0) {
            throw new YtDlpException(err);
        }

        int elapsedTime = (int) ((System.nanoTime() - startTime) / 1000000);

        ytDlpResponse = new YtDlpResponse(command, options, directory, exitCode, elapsedTime, out, err);

        return ytDlpResponse;
    }

    /**
     * Get yt-dlp executable version
     *
     * @return version string
     * @throws YtDlpException
     */
    public static String getVersion() throws YtDlpException {
        YtDlpRequest request = new YtDlpRequest();
        request.setOption("version");
        return YtDlp.execute(request).getOut();
    }

    /**
     * Returns the full Information regarding all videos in a playlist as seen in {@link #getVideoInfo(String)}
     *
     * @param url
     * @return
     * @throws YtDlpException
     */
    public static Optional<PlaylistInfo> getPlaylistInfo(String url) throws YtDlpException {
        Optional<PlaylistInfo> optionalPlaylistPreviewInfo = getPlaylistInfoSetup(url);

        if (optionalPlaylistPreviewInfo.isEmpty()) {
            return Optional.empty();
        }

        PlaylistInfo playlistPreviewInfo = optionalPlaylistPreviewInfo.get();

        YtDlpRequest request = new YtDlpRequest(url);
        request.setOption("dump-json");
        YtDlpResponse response = YtDlp.execute(request);

        ObjectMapper objectMapper = new ObjectMapper();
        List<VideoInfo> videoInfos = new ArrayList<>();
        String responseOutput = response.getOut();

        //splits them by their outer brackets, because the format is not valid json but each video entry is a seperate json all in 1 response.
        String[] jsonObjects = responseOutput.split("}\\s*\\{");

        if (jsonObjects.length < 1) return Optional.empty();

        for (int i = 0; i < jsonObjects.length; i++) {
            if (i == 0) {
                jsonObjects[i] = jsonObjects[i] + "}";
            } else if (i == jsonObjects.length - 1) {
                jsonObjects[i] = "{" + jsonObjects[i] + "}";
            } else {
                jsonObjects[i] = "{" + jsonObjects[i];
            }
        }

        try {
            for (String jsonObject : jsonObjects) {
                VideoInfo videoInfo = objectMapper.readValue(jsonObject + "}", VideoInfo.class);
                videoInfos.add(videoInfo);
            }
        } catch (IOException e) {
            throw new YtDlpException("Unable to parse video information: " + e.getMessage());
        }

        playlistPreviewInfo.setEntries(videoInfos);

        return Optional.of(playlistPreviewInfo);
    }

    /**
     * Returns limited Information regarding a playlist if more information is needed use {@link #getPlaylistInfo(String)} instead at the cost of time needed to obtain
     *
     * @param url The Playlist url
     * @return {@link PlaylistPreviewInfo}
     * @throws YtDlpException If the
     */
    public static Optional<PlaylistPreviewInfo> getPlaylistPreviewInfo(String url) throws YtDlpException {
        YtDlpRequest request = new YtDlpRequest(url);
        request.setOption("dump-single-json");
        request.setOption("flat-playlist");
        request.setOption("skip-download");
        YtDlpResponse response = YtDlp.execute(request);

        ObjectMapper objectMapper = new ObjectMapper();
        PlaylistPreviewInfo videoInfo;

        try {
            videoInfo = objectMapper.readValue(response.getOut(), PlaylistPreviewInfo.class);
        } catch (IOException e) {
            throw new YtDlpException("Unable to parse video information: " + e.getMessage());
        }

        return Optional.of(videoInfo);
    }

    /**
     * Returns limited Information regarding a playlist if more information is needed use {@link #getPlaylistInfo(String)} instead at the cost of time needed to obtain
     *
     * @param url The Playlist url
     * @return {@link PlaylistPreviewInfo}
     * @throws YtDlpException If the
     */
    private static Optional<PlaylistInfo> getPlaylistInfoSetup(String url) throws YtDlpException {
        YtDlpRequest request = new YtDlpRequest(url);
        request.setOption("dump-single-json");
        request.setOption("flat-playlist");
        request.setOption("skip-download");
        YtDlpResponse response = YtDlp.execute(request);

        ObjectMapper objectMapper = new ObjectMapper();
        PlaylistInfo videoInfo;

        try {
            videoInfo = objectMapper.readValue(response.getOut(), PlaylistInfo.class);
        } catch (IOException e) {
            throw new YtDlpException("Unable to parse video information: " + e.getMessage());
        }

        return Optional.of(videoInfo);
    }

    /**
     * Checks weather the URL is a playlist or not (do not call too often, takes a few seconds on average to calculate)
     *
     * @param url Video Url
     * @return true if the video url belongs to a playlist, false if the video is not a playlist or an invalid link
     * @throws YtDlpException
     */
    public static boolean isPlaylist(String url) throws YtDlpException {
        //works faster on playlists than individual videos duo to the data retrieved is there a flag to set that doesn't output as much info?
        YtDlpRequest request = new YtDlpRequest(url);
        request.setOption("dump-single-json");
        request.setOption("flat-playlist");
        request.setOption("skip-download");
        YtDlpResponse response = YtDlp.execute(request);

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode;

        try {
            jsonNode = objectMapper.readTree(response.getOut());
        } catch (IOException e) {
            throw new YtDlpException("Unable to parse video information: " + e.getMessage());
        }

        // Check if the JSON response contains playlist-specific fields
        return jsonNode.has("entries");
    }

    /**
     * Retrieve all information available on a video (if the link refers to a playlist get information about the first video in the list)
     *
     * @param url Video url
     * @return Video info
     * @throws YtDlpException
     */
    public static Optional<VideoInfo> getVideoInfo(String url) throws YtDlpException {

        // Build request
        YtDlpRequest request = new YtDlpRequest(url);
        request.setOption("dump-json");
        request.setOption("no-playlist");
        YtDlpResponse response = YtDlp.execute(request);

        // Parse result
        ObjectMapper objectMapper = new ObjectMapper();
        VideoInfo videoInfo;

        try {
            videoInfo = objectMapper.readValue(response.getOut(), VideoInfo.class);
        } catch (IOException e) {
            throw new YtDlpException("Unable to parse video information: " + e.getMessage());
        }

        return Optional.of(videoInfo);
    }

    private static String formatRawJson(String rawJson) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayNode videosArray = objectMapper.createArrayNode();

        String[] jsonObjects = rawJson.split("\n");
        for (String jsonObject : jsonObjects) {
            JsonNode videoNode = objectMapper.readTree(jsonObject);
            videosArray.add(videoNode);
        }

        ObjectNode result = objectMapper.createObjectNode();
        result.set("videos", videosArray);

        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
    }


    /**
     * Get command executable or path to the executable
     *
     * @return path string
     */
    public static String getExecutablePath() {
        return executablePath;
    }

    /**
     * Set path to use for the command
     *
     * @param path String path to the executable
     */
    public static void setExecutablePath(String path) {
        executablePath = path;
    }
}
