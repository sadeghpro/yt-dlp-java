package com.jfposton.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PlaylistData {

    @JsonProperty("id")
    protected String id;

    @JsonProperty("title")
    protected String title;

    @JsonProperty("availability")
    protected String availability;

    @JsonProperty("channel_follower_count")
    protected Integer channelFollowerCount;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("tags")
    protected List<String> tags;

    @JsonProperty("thumbnails")
    protected List<Thumbnail> thumbnails;

    @JsonProperty("modified_date")
    protected String modifiedDate;

    @JsonProperty("view_count")
    protected Integer viewCount;

    @JsonProperty("playlist_count")
    protected Integer playlistCount;

    @JsonProperty("channel")
    protected String channel;

    @JsonProperty("channel_id")
    protected String channelId;

    @JsonProperty("uploader_id")
    protected String uploaderId;

    @JsonProperty("uploader")
    protected String uploader;

    @JsonProperty("channel_url")
    protected String channelUrl;

    @JsonProperty("uploader_url")
    protected String uploaderUrl;

    @JsonProperty("_type")
    protected String type;

    @JsonProperty("extractor_key")
    protected String extractorKey;

    @JsonProperty("extractor")
    protected String extractor;

    @JsonProperty("webpage_url")
    protected String webpageUrl;

    @JsonProperty("original_url")
    protected String originalUrl;

    @JsonProperty("webpage_url_basename")
    protected String webpageUrlBasename;

    @JsonProperty("webpage_url_domain")
    protected String webpageUrlDomain;

    @JsonProperty("release_year")
    protected Integer releaseYear;

    @JsonProperty("epoch")
    protected Long epoch;

    @JsonProperty("__files_to_move")
    protected Object filesToMove;

    @JsonProperty("_version")
    protected Version version;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAvailability() {
        return availability;
    }

    public Integer getChannelFollowerCount() {
        return channelFollowerCount;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getTags() {
        return tags;
    }

    public List<Thumbnail> getThumbnails() {
        return thumbnails;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public Integer getPlaylistCount() {
        return playlistCount;
    }

    public String getChannel() {
        return channel;
    }

    public String getChannelId() {
        return channelId;
    }

    public String getUploaderId() {
        return uploaderId;
    }

    public String getUploader() {
        return uploader;
    }

    public String getChannelUrl() {
        return channelUrl;
    }

    public String getUploaderUrl() {
        return uploaderUrl;
    }

    public String getType() {
        return type;
    }

    public String getExtractorKey() {
        return extractorKey;
    }

    public String getExtractor() {
        return extractor;
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

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public Long getEpoch() {
        return epoch;
    }

    public Object getFilesToMove() {
        return filesToMove;
    }

    public Version getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "PlaylistPreviewInfo{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", availability='" + availability + '\'' +
                ", channelFollowerCount=" + channelFollowerCount +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                ", thumbnails=" + thumbnails +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", viewCount=" + viewCount +
                ", playlistCount=" + playlistCount +
                ", channel='" + channel + '\'' +
                ", channelId='" + channelId + '\'' +
                ", uploaderId='" + uploaderId + '\'' +
                ", uploader='" + uploader + '\'' +
                ", channelUrl='" + channelUrl + '\'' +
                ", uploaderUrl='" + uploaderUrl + '\'' +
                ", type='" + type + '\'' +
                ", extractorKey='" + extractorKey + '\'' +
                ", extractor='" + extractor + '\'' +
                ", webpageUrl='" + webpageUrl + '\'' +
                ", originalUrl='" + originalUrl + '\'' +
                ", webpageUrlBasename='" + webpageUrlBasename + '\'' +
                ", webpageUrlDomain='" + webpageUrlDomain + '\'' +
                ", releaseYear=" + releaseYear +
                ", epoch=" + epoch +
                ", filesToMove=" + filesToMove +
                ", version=" + version +
                '}';
    }
}
