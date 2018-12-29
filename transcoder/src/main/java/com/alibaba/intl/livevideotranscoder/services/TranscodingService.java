package com.alibaba.intl.livevideotranscoder.services;

import com.alibaba.intl.livevideocommons.models.RtpToRtmpTranscodingContext;
import com.alibaba.intl.livevideotranscoder.exceptions.TranscodingException;

import java.util.List;

/**
 * Handle transcoding operations.
 *
 * @author Alibaba Cloud
 */
public interface TranscodingService {

    /**
     * Start transcoding a video stream from RTP to RTMP.
     */
    void startTranscoding(RtpToRtmpTranscodingContext context) throws TranscodingException;

    /**
     * @return Contexts of running transcoding processes.
     */
    List<RtpToRtmpTranscodingContext> getRunningTranscodingContexts();
}