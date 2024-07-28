package com.jfposton.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jfposton.ytdlp.mapper.video.Fragment;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VideoFormat {

    @JsonProperty("format_id")
    private String formatId;

    @JsonProperty("format_note")
    private String formatNote;

    @JsonProperty("ext")
    private String ext;

    @JsonProperty("protocol")
    private String protocol;

    @JsonProperty("acodec")
    private String acodec;

    @JsonProperty("vcodec")
    private String vcodec;

    @JsonProperty("url")
    private String url;

    @JsonProperty("width")
    private Integer width;

    @JsonProperty("height")
    private Integer height;

    @JsonProperty("fps")
    private Double fps;

    @JsonProperty("rows")
    private Integer rows;

    @JsonProperty("columns")
    private Integer columns;

    @JsonProperty("fragments")
    private List<Fragment> fragments;

    @JsonProperty("resolution")
    private String resolution;

    @JsonProperty("aspect_ratio")
    private Double aspectRatio;

    @JsonProperty("filesize_approx")
    private Integer filesizeApprox;

    @JsonProperty("http_headers")
    private Map<String, String> httpHeaders;

    @JsonProperty("audio_ext")
    private String audioExt;

    @JsonProperty("video_ext")
    private String videoExt;

    @JsonProperty("vbr")
    private Integer vbr;

    @JsonProperty("abr")
    private Integer abr;

    @JsonProperty("tbr")
    private Integer tbr;

    @JsonProperty("format")
    private String format;
}
