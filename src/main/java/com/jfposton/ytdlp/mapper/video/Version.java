package com.jfposton.ytdlp.mapper.video;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Version {
    @JsonProperty("version")
    private String version;
    @JsonProperty("current_git_head")
    private Object currentGitHead;  // Assuming currentGitHead can be null, Object type can be adjusted
    @JsonProperty("release_git_head")
    private String releaseGitHead;
    @JsonProperty("repository")
    private String repository;

    public String getVersion() {
        return version;
    }

    public Object getCurrentGitHead() {
        return currentGitHead;
    }

    public String getReleaseGitHead() {
        return releaseGitHead;
    }

    public String getRepository() {
        return repository;
    }

    @Override
    public String toString() {
        return "Version{" +
                "version='" + version + '\'' +
                ", currentGitHead=" + currentGitHead +
                ", releaseGitHead='" + releaseGitHead + '\'' +
                ", repository='" + repository + '\'' +
                '}';
    }
}
