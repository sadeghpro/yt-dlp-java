package com.wonkglorg.ytdlp;


import com.wonkglorg.ytdlp.exception.YtDlpException;
import com.wonkglorg.ytdlp.mapper.VideoInfo;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class YtDlpResponseTest {

    @Test
    public void getFormatsCanHandleLargerVideos() throws YtDlpException {
        Optional<VideoInfo> videoInfoOptional = YtDlp.getVideoInfo("https://www.youtube.com/watch?v=jPTO3lcPpik");
        assertTrue(videoInfoOptional.isPresent());
        VideoInfo videoInfo = videoInfoOptional.get();
        assertEquals("jPTO3lcPpik", videoInfo.getId());
        assertNotNull(videoInfo.getFormats());
        assertFalse(videoInfo.getFormats().isEmpty());
    }
}
