package com.wonkglorg.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HttpHeader {

    @JsonProperty("Accept-Charset")
    public String acceptCharset;

    @JsonProperty("Accept-Language")
    public String acceptLanguage;

    @JsonProperty("Accept-Encoding")
    public String acceptEncoding;

    @JsonProperty("Accept")
    public String accept;

    @JsonProperty("User-Agent")
    public String userAgent;

    public String getAcceptCharset() {
        return acceptCharset;
    }

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public String getAcceptEncoding() {
        return acceptEncoding;
    }

    public String getAccept() {
        return accept;
    }

    public String getUserAgent() {
        return userAgent;
    }

    @Override
    public String toString() {
        return "HttpHeader{" +
                "acceptCharset='" + acceptCharset + '\'' +
                ", acceptLanguage='" + acceptLanguage + '\'' +
                ", acceptEncoding='" + acceptEncoding + '\'' +
                ", accept='" + accept + '\'' +
                ", userAgent='" + userAgent + '\'' +
                '}';
    }
}
