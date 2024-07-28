package com.jfposton.ytdlp;

import com.jfposton.ytdlp.exception.YtDlpException;
import com.jfposton.ytdlp.mapper.VideoFormat;
import com.jfposton.ytdlp.mapper.VideoInfo;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class YtDlpTest {

    private static final String DIRECTORY = System.getProperty("java.io.tmpdir");
    private static final String VIDEO_URL = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
    private static final String NONE_EXISTENT_VIDEO_URL =
            "https://www.youtube.com/watch?v=dQw4w9WgXcZ";

    private static final String PLAYLIST_URL = "https://www.youtube.com/playlist?list=OLAK5uy_nh1X4KzCgR37rgmHGTDx8u_R95S0vX4jA";
    private static final String PLAYLIST_SPECIFIC_VIDEO_URL = "https://www.youtube.com/watch?v=3NpjfRKOblg&list=OLAK5uy_nh1X4KzCgR37rgmHGTDx8u_R95S0vX4jA&index=1";

    /**
     * @Test public void testUsingOwnExecutablePath() throws YtDlpException {
     * YtDlp.setExecutablePath("/usr/bin/yt-dlp"); Assert.assertNotNull(YtDlp.getVersion()); }
     */
    @Test
    public void testGetVersion() throws YtDlpException {
        Assert.assertNotNull(YtDlp.getVersion());
    }

    @Test
    public void testElapsedTime() throws YtDlpException {

        long startTime = System.nanoTime();

        YtDlpRequest request = new YtDlpRequest();
        request.setOption("version");
        YtDlpResponse response = YtDlp.execute(request);

        int elapsedTime = (int) (System.nanoTime() - startTime);

        Assert.assertTrue(elapsedTime > response.getElapsedTime());
    }

    @Test
    public void testSimulateDownload() throws YtDlpException {

        YtDlpRequest request = new YtDlpRequest();
        request.setUrl(VIDEO_URL);
        request.setOption("simulate");

        YtDlpResponse response = YtDlp.execute(request);

        Assert.assertEquals("yt-dlp " + VIDEO_URL + " --simulate", response.getCommand());
    }

    @Test
    public void testDirectory() throws YtDlpException {

        YtDlpRequest request = new YtDlpRequest(VIDEO_URL, DIRECTORY);
        request.setOption("simulate");

        YtDlpResponse response = YtDlp.execute(request);

        Assert.assertEquals(DIRECTORY, response.getDirectory());
    }

    @Test
    public void testGetVideoInfo() throws YtDlpException {
        VideoInfo videoInfo = YtDlp.getVideoInfo(VIDEO_URL);
        Assert.assertNotNull(videoInfo);
    }

    @Test
    public void testGetFormats() throws YtDlpException {
        List<VideoFormat> formats = YtDlp.getFormats(VIDEO_URL);
        Assert.assertNotNull(formats);
        Assert.assertTrue(formats.size() > 0);
    }

    @Test
    public void testGetThumbnails() throws YtDlpException {
        List<Thumb> thumbnails = YtDlp.getThumbnails(VIDEO_URL);
        Assert.assertNotNull(thumbnails);
        Assert.assertTrue(thumbnails.size() > 0);
    }

    @Test
    public void testGetTags() throws YtDlpException {
        List<String> tags = YtDlp.getTags(VIDEO_URL);
        Assert.assertNotNull(tags);
        Assert.assertTrue(tags.size() > 0);
    }

    @Test
    public void testGetCategories() throws YtDlpException {
        List<String> categories = YtDlp.getCategories(VIDEO_URL);
        Assert.assertNotNull(categories);
        Assert.assertTrue(categories.size() > 0);
    }

    @Test(expected = YtDlpException.class)
    public void testFailGetNonExistentVideoInfo() throws YtDlpException {
        YtDlp.getVideoInfo(NONE_EXISTENT_VIDEO_URL);
    }

    @Test
    public void shouldBeValidPlaylist() throws YtDlpException {
        boolean isPlaylist = YtDlp.isPlaylist(PLAYLIST_URL);
        Assert.assertTrue(isPlaylist);
    }

    @Test
    public void shouldBeValidPlaylistFromSpecificIndex() throws YtDlpException {
        boolean isPlaylist = YtDlp.isPlaylist(PLAYLIST_SPECIFIC_VIDEO_URL);
        Assert.assertTrue(isPlaylist);
    }

    @Test
    public void shouldNotBeValidPlaylist() throws YtDlpException {
        boolean isPlaylist = YtDlp.isPlaylist(VIDEO_URL);
        Assert.assertFalse(isPlaylist);
    }


}
