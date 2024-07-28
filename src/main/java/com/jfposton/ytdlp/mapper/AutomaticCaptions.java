package com.jfposton.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AutomaticCaptions {

    @JsonProperty("automatic_captions")
    private Map<String, List<Caption>> automaticCaptions;

    public Map<String, List<Caption>> getAutomaticCaptions() {
        return automaticCaptions;
    }

    public void setAutomaticCaptions(Map<String, List<Caption>> automaticCaptions) {
        this.automaticCaptions = automaticCaptions;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Caption {

        @JsonProperty("ext")
        private String ext;

        @JsonProperty("url")
        private String url;

        @JsonProperty("name")
        private String name;

        public String getExt() {
            return ext;
        }

        public void setExt(String ext) {
            this.ext = ext;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

