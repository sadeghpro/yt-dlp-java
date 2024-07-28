package com.wonkglorg.ytdlp.mapper.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestedFormat {
    @JsonProperty("format_id")
    private String formatId;
    @JsonProperty("format_index")
    private Object formatIndex;  // Assuming formatIndex can be null, Object type can be adjusted
    @JsonProperty("url")
    private String url;
    @JsonProperty("manifest_url")
    private String manifestUrl;
    @JsonProperty("tbr")
    private double tbr;
    @JsonProperty("ext")
    private String ext;
    @JsonProperty("fps")
    private Double fps;  // Assuming fps can be null
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("preference")
    private Object preference;  // Assuming preference can be null, Object type can be adjusted
    @JsonProperty("quality")
    private int quality;
    @JsonProperty("has_drm")
    private boolean hasDrm;
    @JsonProperty("width")
    private Integer width;  // Assuming width can be null
    @JsonProperty("height")
    private Integer height;  // Assuming height can be null
    @JsonProperty("vcodec")
    private String vcodec;
    @JsonProperty("acodec")
    private String acodec;
    @JsonProperty("dynamic_range")
    private String dynamicRange;
    @JsonProperty("source_preference")
    private int sourcePreference;
    @JsonProperty("format_note")
    private String formatNote;
    @JsonProperty("resolution")
    private String resolution;
    @JsonProperty("aspect_ratio")
    private Double aspectRatio;  // Assuming aspectRatio can be null
    @JsonProperty("http_headers")
    private HttpHeader httpHeaders;
    @JsonProperty("video_ext")
    private String videoExt;
    @JsonProperty("audio_ext")
    private String audioExt;
    @JsonProperty("abr")
    private double abr;
    @JsonProperty("vbr")
    private double vbr;
    @JsonProperty("format")
    private String format;


    public String getFormatId() {
        return formatId;
    }

    public Object getFormatIndex() {
        return formatIndex;
    }

    public String getUrl() {
        return url;
    }

    public String getManifestUrl() {
        return manifestUrl;
    }

    public double getTbr() {
        return tbr;
    }

    public String getExt() {
        return ext;
    }

    public Double getFps() {
        return fps;
    }

    public String getProtocol() {
        return protocol;
    }

    public Object getPreference() {
        return preference;
    }

    public int getQuality() {
        return quality;
    }

    public boolean isHasDrm() {
        return hasDrm;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public String getVcodec() {
        return vcodec;
    }

    public String getAcodec() {
        return acodec;
    }

    public String getDynamicRange() {
        return dynamicRange;
    }

    public int getSourcePreference() {
        return sourcePreference;
    }

    public String getFormatNote() {
        return formatNote;
    }

    public String getResolution() {
        return resolution;
    }

    public Double getAspectRatio() {
        return aspectRatio;
    }

    public HttpHeader getHttpHeaders() {
        return httpHeaders;
    }

    public String getVideoExt() {
        return videoExt;
    }

    public String getAudioExt() {
        return audioExt;
    }

    public double getAbr() {
        return abr;
    }

    public double getVbr() {
        return vbr;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return "RequestedFormat{" +
                "formatId='" + formatId + '\'' +
                ", formatIndex=" + formatIndex +
                ", url='" + url + '\'' +
                ", manifestUrl='" + manifestUrl + '\'' +
                ", tbr=" + tbr +
                ", ext='" + ext + '\'' +
                ", fps=" + fps +
                ", protocol='" + protocol + '\'' +
                ", preference=" + preference +
                ", quality=" + quality +
                ", hasDrm=" + hasDrm +
                ", width=" + width +
                ", height=" + height +
                ", vcodec='" + vcodec + '\'' +
                ", acodec='" + acodec + '\'' +
                ", dynamicRange='" + dynamicRange + '\'' +
                ", sourcePreference=" + sourcePreference +
                ", formatNote='" + formatNote + '\'' +
                ", resolution='" + resolution + '\'' +
                ", aspectRatio=" + aspectRatio +
                ", httpHeaders=" + httpHeaders +
                ", videoExt='" + videoExt + '\'' +
                ", audioExt='" + audioExt + '\'' +
                ", abr=" + abr +
                ", vbr=" + vbr +
                ", format='" + format + '\'' +
                '}';
    }
}
