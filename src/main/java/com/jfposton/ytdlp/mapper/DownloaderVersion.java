package com.jfposton.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Version information
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DownloaderVersion {
    @JsonProperty("version")
    private String version;
    @JsonProperty("release_git_head")
    private String releaseGitHead;

    @JsonProperty("repository")
    private String repository;

    public String getVersion() {
        return version;
    }

    public String getReleaseGitHead() {
        return releaseGitHead;
    }

    public String getRepository() {
        return repository;
    }

    @Override
    public String toString() {
        return "DownloaderVersion{" +
                "version='" + version + '\'' +
                ", releaseGitHead='" + releaseGitHead + '\'' +
                ", repository='" + repository + '\'' +
                '}';
    }
}
