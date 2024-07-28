package com.jfposton.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Subtitles {

    @JsonProperty("subtitles")
    private Map<String, List<Subtitle>> automaticCaptions;

    public Map<String, List<Subtitle>> getAutomaticCaptions() {
        return automaticCaptions;
    }

    public void setAutomaticCaptions(Map<String, List<Subtitle>> automaticCaptions) {
        this.automaticCaptions = automaticCaptions;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Subtitle {

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

        public void setUrl(String url) {
            this.url = url;
        }

        public String getVideo_id() {
            return video_id;
        }

        public void setVideo_id(String video_id) {
            this.video_id = video_id;
        }

        public String getExt() {
            return ext;
        }

        public void setExt(String ext) {
            this.ext = ext;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }
    }
}

