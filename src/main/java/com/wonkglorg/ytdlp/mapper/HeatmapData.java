package com.wonkglorg.ytdlp.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeatmapData {
    @JsonProperty("start_time")
    private double startTime;
    @JsonProperty("end_time")
    private double endTime;
    @JsonProperty("value")
    private double value;

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "HeatmapData{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", value=" + value +
                '}';
    }
}
