package com.jfposton.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VideoPreviewInfo {

    @JsonProperty("_type")
    private String type;

    @JsonProperty("ie_key")
    private String ieKey;

    @JsonProperty("id")
    private String id;

    @JsonProperty("url")
    private String url;

    @JsonProperty("title")
    private String title;

    @JsonProperty("description")
    private String description;

    @JsonProperty("duration")
    private int duration;

    @JsonProperty("channel_id")
    private String channelId;

    @JsonProperty("channel")
    private String channel;

    @JsonProperty("channel_url")
    private String channelUrl;

    @JsonProperty("uploader")
    private String uploader;

    @JsonProperty("uploader_id")
    private String uploaderId;

    @JsonProperty("uploader_url")
    private String uploaderUrl;

    @JsonProperty("thumbnails")
    private List<Thumbnail> thumbnails;

    @JsonProperty("timestamp")
    private Long timestamp;

    @JsonProperty("release_timestamp")
    private Long releaseTimestamp;

    @JsonProperty("availability")
    private String availability;

    @JsonProperty("view_count")
    private int viewCount;

    @JsonProperty("live_status")
    private String liveStatus;

    @JsonProperty("channel_is_verified")
    private Boolean channelIsVerified;

    @JsonProperty("__x_forwarded_for_ip")
    private String xForwardedForIp;

    @JsonProperty("webpage_url")
    private String webpageUrl;

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

    @JsonProperty("playlist_count")
    private int playlistCount;

    @JsonProperty("playlist")
    private String playlist;

    @JsonProperty("playlist_id")
    private String playlistId;

    @JsonProperty("playlist_title")
    private String playlistTitle;

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

    @JsonProperty("n_entries")
    private int nEntries;

    @JsonProperty("playlist_index")
    private int playlistIndex;

    @JsonProperty("__last_playlist_index")
    private int lastPlaylistIndex;

    @JsonProperty("epoch")
    private long epoch;

    @JsonProperty("duration_string")
    private String durationString;

    @JsonProperty("release_year")
    private Integer releaseYear;

    @JsonProperty("_version")
    private Version version;

    public String getType() {
        return type;
    }

    public String getIeKey() {
        return ieKey;
    }

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getChannel() {
        return channel;
    }

    public String getChannelUrl() {
        return channelUrl;
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

    public List<Thumbnail> getThumbnails() {
        return thumbnails;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public Long getReleaseTimestamp() {
        return releaseTimestamp;
    }

    public String getAvailability() {
        return availability;
    }

    public int getViewCount() {
        return viewCount;
    }

    public String getLiveStatus() {
        return liveStatus;
    }

    public Boolean getChannelIsVerified() {
        return channelIsVerified;
    }

    public String getxForwardedForIp() {
        return xForwardedForIp;
    }

    public String getWebpageUrl() {
        return webpageUrl;
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

    public int getPlaylistCount() {
        return playlistCount;
    }

    public String getPlaylist() {
        return playlist;
    }

    public String getPlaylistId() {
        return playlistId;
    }

    public String getPlaylistTitle() {
        return playlistTitle;
    }

    public String getPlaylistUploader() {
        return playlistUploader;
    }

    public String getPlaylistUploaderId() {
        return playlistUploaderId;
    }

    public String getPlaylistChannel() {
        return playlistChannel;
    }

    public String getPlaylistChannelId() {
        return playlistChannelId;
    }

    public int getPlaylistAutonumber() {
        return playlistAutonumber;
    }

    public int getnEntries() {
        return nEntries;
    }

    public int getPlaylistIndex() {
        return playlistIndex;
    }

    public int getLastPlaylistIndex() {
        return lastPlaylistIndex;
    }

    public long getEpoch() {
        return epoch;
    }

    public String getDurationString() {
        return durationString;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public Version getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "VideoPreviewInfo{" +
                "type='" + type + '\'' +
                ", ieKey='" + ieKey + '\'' +
                ", id='" + id + '\'' +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                ", channelId='" + channelId + '\'' +
                ", channel='" + channel + '\'' +
                ", channelUrl='" + channelUrl + '\'' +
                ", uploader='" + uploader + '\'' +
                ", uploaderId='" + uploaderId + '\'' +
                ", uploaderUrl='" + uploaderUrl + '\'' +
                ", thumbnails=" + thumbnails +
                ", timestamp=" + timestamp +
                ", releaseTimestamp=" + releaseTimestamp +
                ", availability='" + availability + '\'' +
                ", viewCount=" + viewCount +
                ", liveStatus='" + liveStatus + '\'' +
                ", channelIsVerified=" + channelIsVerified +
                ", xForwardedForIp='" + xForwardedForIp + '\'' +
                ", webpageUrl='" + webpageUrl + '\'' +
                ", originalUrl='" + originalUrl + '\'' +
                ", webpageUrlBasename='" + webpageUrlBasename + '\'' +
                ", webpageUrlDomain='" + webpageUrlDomain + '\'' +
                ", extractor='" + extractor + '\'' +
                ", extractorKey='" + extractorKey + '\'' +
                ", playlistCount=" + playlistCount +
                ", playlist='" + playlist + '\'' +
                ", playlistId='" + playlistId + '\'' +
                ", playlistTitle='" + playlistTitle + '\'' +
                ", playlistUploader='" + playlistUploader + '\'' +
                ", playlistUploaderId='" + playlistUploaderId + '\'' +
                ", playlistChannel='" + playlistChannel + '\'' +
                ", playlistChannelId='" + playlistChannelId + '\'' +
                ", playlistAutonumber=" + playlistAutonumber +
                ", nEntries=" + nEntries +
                ", playlistIndex=" + playlistIndex +
                ", lastPlaylistIndex=" + lastPlaylistIndex +
                ", epoch=" + epoch +
                ", durationString='" + durationString + '\'' +
                ", releaseYear=" + releaseYear +
                ", version=" + version +
                '}';
    }
}
