package com.jfposton.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestedFormat {
    @JsonProperty("format_id")
    private String formatId;
    @JsonProperty("format_index")
    private Object formatIndex;  // Assuming formatIndex can be null, Object type can be adjusted
    @JsonProperty("url")
    private String url;
    @JsonProperty("manifest_url")
    private String manifestUrl;
    @JsonProperty("tbr")
    private double tbr;
    @JsonProperty("ext")
    private String ext;
    @JsonProperty("fps")
    private Double fps;  // Assuming fps can be null
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("preference")
    private Object preference;  // Assuming preference can be null, Object type can be adjusted
    @JsonProperty("quality")
    private int quality;
    @JsonProperty("has_drm")
    private boolean hasDrm;
    @JsonProperty("width")
    private Integer width;  // Assuming width can be null
    @JsonProperty("height")
    private Integer height;  // Assuming height can be null
    @JsonProperty("vcodec")
    private String vcodec;
    @JsonProperty("acodec")
    private String acodec;
    @JsonProperty("dynamic_range")
    private String dynamicRange;
    @JsonProperty("source_preference")
    private int sourcePreference;
    @JsonProperty("format_note")
    private String formatNote;
    @JsonProperty("resolution")
    private String resolution;
    @JsonProperty("aspect_ratio")
    private Double aspectRatio;  // Assuming aspectRatio can be null
    @JsonProperty("http_headers")
    private HttpHeaders httpHeaders;
    @JsonProperty("video_ext")
    private String videoExt;
    @JsonProperty("audio_ext")
    private String audioExt;
    @JsonProperty("abr")
    private double abr;
    @JsonProperty("vbr")
    private double vbr;
    @JsonProperty("format")
    private String format;

    public static class HttpHeaders {
        @JsonProperty("User-Agent")
        private String userAgent;
        @JsonProperty("Accept")
        private String accept;
        @JsonProperty("Accept-Language")
        private String acceptLanguage;
        @JsonProperty("Sec-Fetch-Mode")
        private String secFetchMode;

    }
}
