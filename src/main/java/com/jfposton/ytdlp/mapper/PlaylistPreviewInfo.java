package com.jfposton.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaylistPreviewInfo {
    @JsonProperty("videos")
    private List<VideoPreviewInfo> videos;

    public List<VideoPreviewInfo> getVideos() {
        return videos;
    }


    public String getPlaylistName() {
        return videos.get(0).getPlaylist();
    }

    public String getPlaylistId() {
        return videos.get(0).getPlaylistId();
    }
}
