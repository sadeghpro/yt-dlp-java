package com.wonkglorg.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Version information
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DownloaderVersion {
    /**
     * The Ytdlp version
     */
    @JsonProperty("version")
    private String version;
    /**
     * Commit hash of the release
     */
    @JsonProperty("release_git_head")
    private String releaseGitHead;
    /**
     * Commit hash of the current git head
     */
    @JsonProperty("current_git_head")
    private String currentGitHead;

    /**
     * Repository of the release
     */
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

    public String getCurrentGitHead() {
        return currentGitHead;
    }

    @Override
    public String toString() {
        return "DownloaderVersion{" +
                "version='" + version + '\'' +
                ", releaseGitHead='" + releaseGitHead + '\'' +
                ", currentGitHead='" + currentGitHead + '\'' +
                ", repository='" + repository + '\'' +
                '}';
    }
}
