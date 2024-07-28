package com.wonkglorg.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fragment {


    @JsonProperty("url")
    private String url;

    @JsonProperty("duration")
    private Double duration;

    // Getters and Setters

    public String getUrl() {
        return url;
    }


    public Double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "VideoFragment{" +
                "url='" + url + '\'' +
                ", duration=" + duration +
                '}';
    }
}
