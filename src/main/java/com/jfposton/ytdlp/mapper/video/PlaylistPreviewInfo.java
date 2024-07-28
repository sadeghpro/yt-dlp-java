package com.jfposton.ytdlp.mapper.video;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaylistPreviewInfo extends PlaylistData {

    @JsonProperty("entries")
    private List<VideoEntry> entries;

    public List<VideoEntry> getEntries() {
        return entries;
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
                ", entries=" + entries +
                '}';
    }
}
