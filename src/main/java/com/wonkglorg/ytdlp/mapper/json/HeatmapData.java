package com.wonkglorg.ytdlp.mapper.json;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class representing a Heatmap segment
 */
public class HeatmapData {
    /**
     * Start time of the Heatmap segment
     */
    @JsonProperty("start_time")
    private double startTime;

    /**
     * End time of the Heatmap segment
     */
    @JsonProperty("end_time")
    private double endTime;

    /**
     * Value of the Heatmap segment
     */
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
