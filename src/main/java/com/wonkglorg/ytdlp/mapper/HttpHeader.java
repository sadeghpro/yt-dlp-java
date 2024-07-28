package com.wonkglorg.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HttpHeader: The HttpHeader class is a data class that represents the HTTP headers of a request.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HttpHeader {

    /**
     * Accept-Charset: The Accept-Charset request HTTP header advertises which character encodings the client understands.
     */
    @JsonProperty("Accept-Charset")
    public String acceptCharset;

    /**
     * Accept-Language: The Accept-Language request HTTP header advertises which languages the client is able to understand, and which locale variant is preferred.
     */
    @JsonProperty("Accept-Language")
    public String acceptLanguage;

    /**
     * Accept-Encoding: The Accept-Encoding request HTTP header advertises which content encoding, usually a compression algorithm, the client is able to understand.
     */
    @JsonProperty("Accept-Encoding")
    public String acceptEncoding;

    /**
     * Accept: The Accept request HTTP header advertises which content types, expressed as MIME types, the client is able to understand.
     */
    @JsonProperty("Accept")
    public String accept;

    /**
     * User-Agent: The User-Agent request header contains a characteristic string that allows the network protocol peers to identify the application type, operating system, software vendor or software version of the requesting software user agent.
     */
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
