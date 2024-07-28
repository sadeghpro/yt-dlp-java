package com.wonkglorg.ytdlp;

public interface DownloadProgressCallback {
    void onProgressUpdate(float progress, long etaInSeconds);
}
