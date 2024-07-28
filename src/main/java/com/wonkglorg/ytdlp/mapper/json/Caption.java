package com.wonkglorg.ytdlp.mapper.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Caption {
    /**
     * The Extension this Caption file is in
     */
    @JsonProperty("ext")
    private String ext;

    /**
     * The url to download this Caption from
     */
    @JsonProperty("url")
    private String url;

    /**
     * Full caption language name
     */
    @JsonProperty("name")
    private String name;

    public String getExt() {
        return ext;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Caption{" + "ext='" + ext + '\'' + ", url='" + url + '\'' + ", name='" + name + '\'' + '}';
    }

}

