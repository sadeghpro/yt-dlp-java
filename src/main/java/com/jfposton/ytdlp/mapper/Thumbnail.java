package com.jfposton.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Thumbnail {
    @JsonProperty("url")
    private String url;

    @JsonProperty("height")
    private int height;

    @JsonProperty("width")
    private int width;

    // Getters and Setters
}
