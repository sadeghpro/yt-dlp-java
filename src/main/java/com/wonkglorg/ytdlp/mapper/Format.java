package com.wonkglorg.ytdlp.mapper;

import java.util.ArrayList;
import java.util.List;

public class Format {
    private String id;
    private String ext;
    private String resolution;
    private int fps;
    private String fileSize;
    private String tbr;
    private String proto;
    private String vCodec;
    private String vbr;
    private String aCodec;
    private String abr;
    private String asr;
    private String moreInfo;

    // Constructor
    public Format(String id, String ext, String resolution, int fps, String fileSize, String tbr, String proto, String vCodec, String vbr, String aCodec, String abr, String asr, String moreInfo) {
        this.id = id;
        this.ext = ext;
        this.resolution = resolution;
        this.fps = fps;
        this.fileSize = fileSize;
        this.tbr = tbr;
        this.proto = proto;
        this.vCodec = vCodec;
        this.vbr = vbr;
        this.aCodec = aCodec;
        this.abr = abr;
        this.asr = asr;
        this.moreInfo = moreInfo;
    }

    public static List<Format> parse(String input) {
        List<Format> formats = new ArrayList<>();
        String[] lines = input.split("\n");

        for (String line : lines) {
            if (line.startsWith("ID") || line.startsWith("---")) {
                continue; // Skip the header and separator
            }

            String[] parts = line.split("\\|");
            if (parts.length < 2) {
                continue; // Skip malformed lines
            }

            // Split parts into individual fields
            String[] leftParts = parts[0].trim().split("\\s+");
            String[] rightParts = parts[1].trim().split("\\s+");

            String id = leftParts[0];
            String ext = leftParts[1];
            String resolution = leftParts[2];
            int fps = 0;

            // Check if resolution is actually "audio only" or similar
            if (resolution.matches("\\d+x\\d+")) {
                try {
                    fps = leftParts.length > 3 ? Integer.parseInt(leftParts[3]) : 0;
                } catch (NumberFormatException e) {
                    fps = 0; // Default value if FPS is not a number
                }
            } else {
                // If resolution is not a valid resolution (like "audio"), adjust parsing
                resolution = resolution + " " + (leftParts.length > 3 ? leftParts[3] : "");
            }

            String fileSize = rightParts.length > 0 ? rightParts[0] : "";
            String tbr = rightParts.length > 1 ? rightParts[1] : "";
            String proto = rightParts.length > 2 ? rightParts[2] : "";
            String vCodec = rightParts.length > 3 ? rightParts[3] : "";
            String vbr = rightParts.length > 4 ? rightParts[4] : "";
            String aCodec = rightParts.length > 5 ? rightParts[5] : "";
            String abr = rightParts.length > 6 ? rightParts[6] : "";
            String asr = rightParts.length > 7 ? rightParts[7] : "";
            String moreInfo = rightParts.length > 8 ? rightParts[8] : "";

            formats.add(new Format(id, ext, resolution, fps, fileSize, tbr, proto, vCodec, vbr, aCodec, abr, asr, moreInfo));
        }

        return formats;
    }

    public String getId() {
        return id;
    }

    public String getExt() {
        return ext;
    }

    public String getResolution() {
        return resolution;
    }

    public int getFps() {
        return fps;
    }

    public String getFileSize() {
        return fileSize;
    }

    public String getTbr() {
        return tbr;
    }

    public String getProto() {
        return proto;
    }

    public String getvCodec() {
        return vCodec;
    }

    public String getVbr() {
        return vbr;
    }

    public String getaCodec() {
        return aCodec;
    }

    public String getAbr() {
        return abr;
    }

    public String getAsr() {
        return asr;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    @Override
    public String toString() {
        return "Format{" +
                "id='" + id + '\'' +
                ", ext='" + ext + '\'' +
                ", resolution='" + resolution + '\'' +
                ", fps=" + fps +
                ", fileSize='" + fileSize + '\'' +
                ", tbr='" + tbr + '\'' +
                ", proto='" + proto + '\'' +
                ", vCodec='" + vCodec + '\'' +
                ", vbr='" + vbr + '\'' +
                ", aCodec='" + aCodec + '\'' +
                ", abr='" + abr + '\'' +
                ", asr='" + asr + '\'' +
                ", moreInfo='" + moreInfo + '\'' +
                '}';
    }


}
