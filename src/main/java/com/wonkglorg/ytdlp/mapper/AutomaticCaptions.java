package com.wonkglorg.ytdlp.mapper;

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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Caption {
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

    @Override
    public String toString() {
        return "AutomaticCaptions{" + "automaticCaptions=" + automaticCaptions + '}';
    }
}

