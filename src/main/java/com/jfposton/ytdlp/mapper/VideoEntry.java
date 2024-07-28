package com.jfposton.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VideoEntry {

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
    private Integer duration;

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
    private Integer viewCount;

    @JsonProperty("live_status")
    private String liveStatus;

    @JsonProperty("channel_is_verified")
    private Boolean channelIsVerified;

    @JsonProperty("__x_forwarded_for_ip")
    private String xForwardedForIp;

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

    public Integer getDuration() {
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

    public Integer getViewCount() {
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

    @Override
    public String toString() {
        return "VideoEntry{" +
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
                '}';
    }
}
