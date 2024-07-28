package com.jfposton.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeatmapData {
    @JsonProperty("start_time")
    private double startTime;
    @JsonProperty("end_time")
    private double endTime;
    @JsonProperty("value")
    private double value;
}
