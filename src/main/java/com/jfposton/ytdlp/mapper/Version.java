package com.jfposton.ytdlp.mapper;

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

    public void setVersion(String version) {
        this.version = version;
    }

    public Object getCurrentGitHead() {
        return currentGitHead;
    }

    public void setCurrentGitHead(Object currentGitHead) {
        this.currentGitHead = currentGitHead;
    }

    public String getReleaseGitHead() {
        return releaseGitHead;
    }

    public void setReleaseGitHead(String releaseGitHead) {
        this.releaseGitHead = releaseGitHead;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }
}
