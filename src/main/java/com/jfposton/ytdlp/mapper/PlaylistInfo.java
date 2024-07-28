package com.jfposton.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jfposton.ytdlp.mapper.video.PlaylistData;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaylistInfo extends PlaylistData {

    @JsonProperty("entries")
    private List<VideoInfo> entries;


    public List<VideoInfo> getEntries() {
        return entries;
    }

    public void setEntries(List<VideoInfo> entries) {
        this.entries = entries;
    }
}
