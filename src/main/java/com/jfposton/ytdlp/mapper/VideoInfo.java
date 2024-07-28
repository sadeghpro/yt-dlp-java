package com.jfposton.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VideoInfo {
    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("formats")
    private List<VideoFormat> formats;
    @JsonProperty("thumbnails")
    private List<Thumbnail> thumbnails;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("description")
    private String description;
    @JsonProperty("channel_id")
    private String channelId;
    @JsonProperty("channel_url")
    private String channelUrl;
    @JsonProperty("duration")
    private int duration;
    @JsonProperty("view_count")
    private long viewCount;
    @JsonProperty("average_rating")
    private String averageRating;
    @JsonProperty("age_limit")
    private int ageLimit;
    @JsonProperty("webpage_url")
    private String webpageUrl;
    @JsonProperty("categories")
    private List<String> categories;
    @JsonProperty("tags")
    private List<String> tags;
    @JsonProperty("playable_in_embed")
    private boolean playableInEmbed;
    @JsonProperty("live_status")
    private String liveStatus;
    @JsonProperty("release_timestamp")
    private long releaseTimestamp;
    @JsonProperty("_format_sort_fields")
    private List<String> formatSortFields;
    @JsonProperty("automatic_captions")
    private AutomaticCaptions automaticCaptions;
    @JsonProperty("subtitles")
    private Subtitles subtitles;
    @JsonProperty("comment_count")
    private long commentCount;
    @JsonProperty("chapters")
    private Object chapters;  // Assuming chapters can be null, Object type can be adjusted
    @JsonProperty("heatmap")
    private List<HeatmapData> heatmap;
    @JsonProperty("like_count")
    private long likeCount;
    @JsonProperty("channel")
    private String channel;
    @JsonProperty("channel_follower_count")
    private long channelFollowerCount;
    @JsonProperty("channel_is_verified")
    private boolean channelIsVerified;
    @JsonProperty("uploader")
    private String uploader;
    @JsonProperty("uploader_id")
    private String uploaderId;
    @JsonProperty("uploader_url")
    private String uploaderUrl;
    @JsonProperty("upload_date")
    private String uploadDate;
    @JsonProperty("timestamp")
    private long timestamp;
    @JsonProperty("availability")
    private String availability;
    @JsonProperty("original_url")
    private String originalUrl;
    @JsonProperty("webpage_url_basename")
    private String webpageUrlBasename;
    @JsonProperty("webpage_url_domain")
    private String webpageUrlDomain;
    @JsonProperty("extractor")
    private String extractor;
    @JsonProperty("extractor_key")
    private String extractorKey;
    @JsonProperty("playlist")
    private String playlist;
    @JsonProperty("playlist_uploader")
    private String playlistUploader;

    @JsonProperty("playlist_uploader_id")
    private String playlistUploaderId;

    @JsonProperty("playlist_channel")
    private String playlistChannel;

    @JsonProperty("playlist_channel_id")
    private String playlistChannelId;

    @JsonProperty("playlist_autonumber")
    private int playlistAutonumber;
    @JsonProperty("playlist_index")
    private Object playlistIndex;  // Assuming playlistIndex can be null, Object type can be adjusted
    @JsonProperty("display_id")
    private String displayId;
    @JsonProperty("fulltitle")
    private String fullTitle;
    @JsonProperty("duration_string")
    private String durationString;
    @JsonProperty("release_date")
    private String releaseDate;
    @JsonProperty("release_year")
    private int releaseYear;
    @JsonProperty("is_live")
    private boolean isLive;
    @JsonProperty("was_live")
    private boolean wasLive;
    @JsonProperty("requested_subtitles")
    private Object requestedSubtitles;  // Assuming requestedSubtitles can be null, Object type can be adjusted
    @JsonProperty("_has_drm")
    private Object hasDrm;  // Assuming hasDrm can be null, Object type can be adjusted
    @JsonProperty("epoch")
    private long epoch;
    @JsonProperty("requested_formats")
    private List<RequestedFormat> requestedFormats;
    @JsonProperty("format")
    private String format;
    @JsonProperty("format_id")
    private String formatId;
    @JsonProperty("ext")
    private String ext;
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("language")
    private String language;
    @JsonProperty("format_note")
    private String formatNote;
    @JsonProperty("filesize_approx")
    private long filesizeApprox;
    @JsonProperty("tbr")
    private double tbr;
    @JsonProperty("width")
    private int width;
    @JsonProperty("height")
    private int height;
    @JsonProperty("resolution")
    private String resolution;
    @JsonProperty("fps")
    private double fps;
    @JsonProperty("dynamic_range")
    private String dynamicRange;
    @JsonProperty("vcodec")
    private String vcodec;
    @JsonProperty("vbr")
    private double vbr;
    @JsonProperty("stretched_ratio")
    private Object stretchedRatio;  // Assuming stretchedRatio can be null, Object type can be adjusted
    @JsonProperty("aspect_ratio")
    private double aspectRatio;
    @JsonProperty("acodec")
    private String acodec;
    @JsonProperty("abr")
    private double abr;
    @JsonProperty("asr")
    private int asr;
    @JsonProperty("audio_channels")
    private int audioChannels;
    @JsonProperty("_filename")
    private String filename;
    @JsonProperty("filename")
    private String fileName;
    @JsonProperty("_type")
    private String type;
    @JsonProperty("_version")
    private Version version;


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<VideoFormat> getFormats() {
        return formats;
    }

    public List<Thumbnail> getThumbnails() {
        return thumbnails;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getChannelUrl() {
        return channelUrl;
    }

    public int getDuration() {
        return duration;
    }

    public long getViewCount() {
        return viewCount;
    }

    public String getAverageRating() {
        return averageRating;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public String getWebpageUrl() {
        return webpageUrl;
    }

    public List<String> getCategories() {
        return categories;
    }

    public List<String> getTags() {
        return tags;
    }

    public boolean isPlayableInEmbed() {
        return playableInEmbed;
    }

    public String getLiveStatus() {
        return liveStatus;
    }

    public long getReleaseTimestamp() {
        return releaseTimestamp;
    }

    public List<String> getFormatSortFields() {
        return formatSortFields;
    }

    public AutomaticCaptions getAutomaticCaptions() {
        return automaticCaptions;
    }

    public Subtitles getSubtitles() {
        return subtitles;
    }

    public long getCommentCount() {
        return commentCount;
    }

    public Object getChapters() {
        return chapters;
    }

    public List<HeatmapData> getHeatmap() {
        return heatmap;
    }

    public long getLikeCount() {
        return likeCount;
    }

    public String getChannel() {
        return channel;
    }

    public long getChannelFollowerCount() {
        return channelFollowerCount;
    }

    public boolean isChannelIsVerified() {
        return channelIsVerified;
    }

    public String getUploader() {
        return uploader;
    }

    public String getUploaderId() {
        return uploaderId;
    }

    public String getUploaderUrl() {
        return uploaderUrl;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getAvailability() {
        return availability;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public String getWebpageUrlBasename() {
        return webpageUrlBasename;
    }

    public String getWebpageUrlDomain() {
        return webpageUrlDomain;
    }

    public String getExtractor() {
        return extractor;
    }

    public String getExtractorKey() {
        return extractorKey;
    }

    public String getPlaylist() {
        return playlist;
    }

    public Object getPlaylistIndex() {
        return playlistIndex;
    }

    public String getDisplayId() {
        return displayId;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public String getDurationString() {
        return durationString;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isLive() {
        return isLive;
    }

    public boolean isWasLive() {
        return wasLive;
    }

    public Object getRequestedSubtitles() {
        return requestedSubtitles;
    }

    public Object getHasDrm() {
        return hasDrm;
    }

    public long getEpoch() {
        return epoch;
    }

    public List<RequestedFormat> getRequestedFormats() {
        return requestedFormats;
    }

    public String getFormat() {
        return format;
    }

    public String getFormatId() {
        return formatId;
    }

    public String getExt() {
        return ext;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getLanguage() {
        return language;
    }

    public String getFormatNote() {
        return formatNote;
    }

    public long getFilesizeApprox() {
        return filesizeApprox;
    }

    public double getTbr() {
        return tbr;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getResolution() {
        return resolution;
    }

    public double getFps() {
        return fps;
    }

    public String getDynamicRange() {
        return dynamicRange;
    }

    public String getVcodec() {
        return vcodec;
    }

    public double getVbr() {
        return vbr;
    }

    public Object getStretchedRatio() {
        return stretchedRatio;
    }

    public double getAspectRatio() {
        return aspectRatio;
    }

    public String getAcodec() {
        return acodec;
    }

    public double getAbr() {
        return abr;
    }

    public int getAsr() {
        return asr;
    }

    public int getAudioChannels() {
        return audioChannels;
    }

    public String getFilename() {
        return filename;
    }

    public String getFileName() {
        return fileName;
    }

    public String getType() {
        return type;
    }

    public Version getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "VideoInfo{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", formats=" + formats +
                ", thumbnails=" + thumbnails +
                ", thumbnail='" + thumbnail + '\'' +
                ", description='" + description + '\'' +
                ", channelId='" + channelId + '\'' +
                ", channelUrl='" + channelUrl + '\'' +
                ", duration=" + duration +
                ", viewCount=" + viewCount +
                ", averageRating='" + averageRating + '\'' +
                ", ageLimit=" + ageLimit +
                ", webpageUrl='" + webpageUrl + '\'' +
                ", categories=" + categories +
                ", tags=" + tags +
                ", playableInEmbed=" + playableInEmbed +
                ", liveStatus='" + liveStatus + '\'' +
                ", releaseTimestamp=" + releaseTimestamp +
                ", formatSortFields=" + formatSortFields +
                ", automaticCaptions=" + automaticCaptions +
                ", subtitles=" + subtitles +
                ", commentCount=" + commentCount +
                ", chapters=" + chapters +
                ", heatmap=" + heatmap +
                ", likeCount=" + likeCount +
                ", channel='" + channel + '\'' +
                ", channelFollowerCount=" + channelFollowerCount +
                ", channelIsVerified=" + channelIsVerified +
                ", uploader='" + uploader + '\'' +
                ", uploaderId='" + uploaderId + '\'' +
                ", uploaderUrl='" + uploaderUrl + '\'' +
                ", uploadDate='" + uploadDate + '\'' +
                ", timestamp=" + timestamp +
                ", availability='" + availability + '\'' +
                ", originalUrl='" + originalUrl + '\'' +
                ", webpageUrlBasename='" + webpageUrlBasename + '\'' +
                ", webpageUrlDomain='" + webpageUrlDomain + '\'' +
                ", extractor='" + extractor + '\'' +
                ", extractorKey='" + extractorKey + '\'' +
                ", playlist='" + playlist + '\'' +
                ", playlistUploader='" + playlistUploader + '\'' +
                ", playlistUploaderId='" + playlistUploaderId + '\'' +
                ", playlistChannel='" + playlistChannel + '\'' +
                ", playlistChannelId='" + playlistChannelId + '\'' +
                ", playlistAutonumber=" + playlistAutonumber +
                ", playlistIndex=" + playlistIndex +
                ", displayId='" + displayId + '\'' +
                ", fullTitle='" + fullTitle + '\'' +
                ", durationString='" + durationString + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", releaseYear=" + releaseYear +
                ", isLive=" + isLive +
                ", wasLive=" + wasLive +
                ", requestedSubtitles=" + requestedSubtitles +
                ", hasDrm=" + hasDrm +
                ", epoch=" + epoch +
                ", requestedFormats=" + requestedFormats +
                ", format='" + format + '\'' +
                ", formatId='" + formatId + '\'' +
                ", ext='" + ext + '\'' +
                ", protocol='" + protocol + '\'' +
                ", language='" + language + '\'' +
                ", formatNote='" + formatNote + '\'' +
                ", filesizeApprox=" + filesizeApprox +
                ", tbr=" + tbr +
                ", width=" + width +
                ", height=" + height +
                ", resolution='" + resolution + '\'' +
                ", fps=" + fps +
                ", dynamicRange='" + dynamicRange + '\'' +
                ", vcodec='" + vcodec + '\'' +
                ", vbr=" + vbr +
                ", stretchedRatio=" + stretchedRatio +
                ", aspectRatio=" + aspectRatio +
                ", acodec='" + acodec + '\'' +
                ", abr=" + abr +
                ", asr=" + asr +
                ", audioChannels=" + audioChannels +
                ", filename='" + filename + '\'' +
                ", fileName='" + fileName + '\'' +
                ", type='" + type + '\'' +
                ", version=" + version +
                '}';
    }
}
