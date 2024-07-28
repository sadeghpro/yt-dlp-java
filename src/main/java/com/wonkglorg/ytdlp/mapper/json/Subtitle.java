package com.wonkglorg.ytdlp.mapper.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Subtitle {

    @JsonProperty("url")
    private String url;

    @JsonProperty("video_id")
    private String video_id;

    @JsonProperty("ext")
    private String ext;

    @JsonProperty("protocol")
    private String protocol;

    public String getUrl() {
        return url;
    }

    public String getVideo_id() {
        return video_id;
    }

    public String getExt() {
        return ext;
    }

    public String getProtocol() {
        return protocol;
    }

    @Override
    public String toString() {
        return "Subtitle{" +
                "url='" + url + '\'' +
                ", video_id='" + video_id + '\'' +
                ", ext='" + ext + '\'' +
                ", protocol='" + protocol + '\'' +
                '}';
    }

}

