package com.jfposton.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VideoFormat {

    @JsonProperty("format_id")
    private String formatId;

    @JsonProperty("format_note")
    private String formatNote;

    @JsonProperty("ext")
    private String ext;

    @JsonProperty("protocol")
    private String protocol;

    @JsonProperty("acodec")
    private String acodec;

    @JsonProperty("vcodec")
    private String vcodec;

    @JsonProperty("url")
    private String url;

    @JsonProperty("width")
    private Integer width;

    @JsonProperty("height")
    private Integer height;

    @JsonProperty("fps")
    private Double fps;

    @JsonProperty("rows")
    private Integer rows;

    @JsonProperty("columns")
    private Integer columns;

    @JsonProperty("fragments")
    private List<Fragment> fragments;

    @JsonProperty("resolution")
    private String resolution;

    @JsonProperty("aspect_ratio")
    private Double aspectRatio;

    @JsonProperty("filesize_approx")
    private Integer filesizeApprox;

    @JsonProperty("http_headers")
    private Map<String, String> httpHeaders;

    @JsonProperty("audio_ext")
    private String audioExt;

    @JsonProperty("video_ext")
    private String videoExt;

    @JsonProperty("vbr")
    private Integer vbr;

    @JsonProperty("abr")
    private Integer abr;

    @JsonProperty("tbr")
    private Integer tbr;

    @JsonProperty("format")
    private String format;


    public String getFormatId() {
        return formatId;
    }

    public String getFormatNote() {
        return formatNote;
    }

    public String getExt() {
        return ext;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getAcodec() {
        return acodec;
    }

    public String getVcodec() {
        return vcodec;
    }

    public String getUrl() {
        return url;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public Double getFps() {
        return fps;
    }

    public Integer getRows() {
        return rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public List<Fragment> getFragments() {
        return fragments;
    }

    public String getResolution() {
        return resolution;
    }

    public Double getAspectRatio() {
        return aspectRatio;
    }

    public Integer getFilesizeApprox() {
        return filesizeApprox;
    }

    public Map<String, String> getHttpHeaders() {
        return httpHeaders;
    }

    public String getAudioExt() {
        return audioExt;
    }

    public String getVideoExt() {
        return videoExt;
    }

    public Integer getVbr() {
        return vbr;
    }

    public Integer getAbr() {
        return abr;
    }

    public Integer getTbr() {
        return tbr;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return "VideoFormat{" +
                "formatId='" + formatId + '\'' +
                ", formatNote='" + formatNote + '\'' +
                ", ext='" + ext + '\'' +
                ", protocol='" + protocol + '\'' +
                ", acodec='" + acodec + '\'' +
                ", vcodec='" + vcodec + '\'' +
                ", url='" + url + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", fps=" + fps +
                ", rows=" + rows +
                ", columns=" + columns +
                ", fragments=" + fragments +
                ", resolution='" + resolution + '\'' +
                ", aspectRatio=" + aspectRatio +
                ", filesizeApprox=" + filesizeApprox +
                ", httpHeaders=" + httpHeaders +
                ", audioExt='" + audioExt + '\'' +
                ", videoExt='" + videoExt + '\'' +
                ", vbr=" + vbr +
                ", abr=" + abr +
                ", tbr=" + tbr +
                ", format='" + format + '\'' +
                '}';
    }
}
