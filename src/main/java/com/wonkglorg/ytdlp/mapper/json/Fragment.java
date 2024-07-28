package com.wonkglorg.ytdlp.mapper.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the small preview image fragments of a video
 */
public class Fragment {

    /**
     * Link to an image of all fragmented image parts in 1
     */
    @JsonProperty("url")
    private String url;

    /**
     * Duration of the fragment in seconds
     */
    @JsonProperty("duration")
    private Double duration;


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
