package com.android.grafika;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import android.view.Surface;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class VideoEncoderCore21 {
    private static final String MIME_TYPE = "video/avc";
    private static final String TAG = "VideoEncoderCore";
    private static final boolean VERBOSE = false;
    private MediaCodec mEncoder;
    private Surface mInputSurface;
    private MediaMuxer mMuxer;
    private boolean mMuxerStarted;
    private int mTrackIndex;

    private static MediaCodecInfo selectCodec(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    private static int findNonSurfaceColorFormat(MediaCodecInfo mediaCodecInfo, String str) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
        for (int i = 0; i < capabilitiesForType.colorFormats.length; i++) {
            int i2 = capabilitiesForType.colorFormats[i];
            if (i2 != 2130708361) {
                return i2;
            }
        }
        return 0;
    }

    public VideoEncoderCore21(int i, int i2, int i3, File file) throws IOException {
        this(i, i2, i3, file, 30, 5);
    }

    public VideoEncoderCore21(int i, int i2, int i3, File file, int i4, int i5) throws IOException {
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", i3);
        createVideoFormat.setInteger("frame-rate", i4);
        createVideoFormat.setInteger("i-frame-interval", i5);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        this.mEncoder = createEncoderByType;
        createEncoderByType.setCallback(new MediaCodec.Callback() { // from class: com.android.grafika.VideoEncoderCore21.1
            @Override // android.media.MediaCodec.Callback
            public void onInputBufferAvailable(MediaCodec mediaCodec, int i6) {
                Log.w(VideoEncoderCore21.TAG, "onInputBufferAvailable");
            }

            @Override // android.media.MediaCodec.Callback
            public void onOutputBufferAvailable(MediaCodec mediaCodec, int i6, MediaCodec.BufferInfo bufferInfo) {
                ByteBuffer outputBuffer = VideoEncoderCore21.this.mEncoder.getOutputBuffer(i6);
                VideoEncoderCore21.this.mEncoder.getOutputFormat(i6);
                if ((bufferInfo.flags & 2) == 0) {
                    if (VideoEncoderCore21.this.mMuxerStarted) {
                        VideoEncoderCore21.this.mMuxer.writeSampleData(VideoEncoderCore21.this.mTrackIndex, outputBuffer, bufferInfo);
                    } else {
                        Log.w(VideoEncoderCore21.TAG, "Muxer not started yet");
                    }
                }
                VideoEncoderCore21.this.mEncoder.releaseOutputBuffer(i6, false);
            }

            @Override // android.media.MediaCodec.Callback
            public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
                Log.d(VideoEncoderCore21.TAG, "encoder error: " + codecException.getMessage());
            }

            @Override // android.media.MediaCodec.Callback
            public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
                Log.d(VideoEncoderCore21.TAG, "encoder output format changed: " + mediaFormat);
                VideoEncoderCore21 videoEncoderCore21 = VideoEncoderCore21.this;
                videoEncoderCore21.mTrackIndex = videoEncoderCore21.mMuxer.addTrack(mediaFormat);
                VideoEncoderCore21.this.mMuxer.start();
                VideoEncoderCore21.this.mMuxerStarted = true;
            }
        });
        this.mEncoder.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.mInputSurface = this.mEncoder.createInputSurface();
        this.mEncoder.start();
        this.mMuxer = new MediaMuxer(file.toString(), 0);
        this.mTrackIndex = -1;
        this.mMuxerStarted = false;
    }

    public Surface getInputSurface() {
        return this.mInputSurface;
    }

    public void signalEndOfInputStream() {
        this.mEncoder.signalEndOfInputStream();
    }

    public void release() {
        MediaCodec mediaCodec = this.mEncoder;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mEncoder.release();
            this.mEncoder = null;
        }
        MediaMuxer mediaMuxer = this.mMuxer;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
            this.mMuxer.release();
            this.mMuxer = null;
        }
    }
}
