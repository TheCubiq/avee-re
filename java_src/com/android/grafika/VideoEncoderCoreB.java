package com.android.grafika;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import com.daaw.avee.comp.VisualizerExporter.EncodingUtils;
import com.daaw.avee.comp.VisualizerExporter.MediaMuxerWrapper;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class VideoEncoderCoreB {
    private static final String MIME_TYPE0 = "video/avc";
    private static final String TAG = "VideoEncoderCoreB";
    private static final boolean VERBOSE = false;
    private MediaCodec.BufferInfo mBufferInfo = new MediaCodec.BufferInfo();
    private MediaCodec mEncoder;
    private Surface mInputSurface;
    private MediaMuxerWrapper mMuxer;
    private int mTrackIndex;

    private static MediaCodecInfo selectCodec(String str) {
        printAvailableCodecs();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        Log.d(TAG, "Codec selected: " + codecInfoAt.getName());
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    private static void printAvailableCodecs() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                Log.d(TAG, "Codec available: " + codecInfoAt.getName());
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (int i2 = 0; i2 < supportedTypes.length; i2++) {
                    Log.d(TAG, "    supported type: " + supportedTypes[i2]);
                }
            }
        }
    }

    private static MediaCodecInfo selectCodecByName(String str) {
        printAvailableCodecs();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder() && codecInfoAt.getName().equalsIgnoreCase(str)) {
                Log.d(TAG, "Codec selected: " + codecInfoAt.getName());
                return codecInfoAt;
            }
        }
        return null;
    }

    public VideoEncoderCoreB(MediaMuxerWrapper mediaMuxerWrapper, int i, int i2, int i3, int i4, int i5, String str, String str2, int i6) throws Exception {
        String name;
        int i7;
        String str3 = str;
        String str4 = str2 == null ? "video/avc" : str2;
        boolean z = str3 == null || str3.equalsIgnoreCase(EncodingUtils.DEFAULT_CODEC_NAME);
        if (Build.VERSION.SDK_INT <= 21 || !z) {
            str3 = str3 == null ? "" : str3;
            MediaCodecInfo selectCodecByName = z ? null : selectCodecByName(str3);
            if (selectCodecByName == null && (selectCodecByName = selectCodec(str4)) == null) {
                selectCodecByName = selectCodec("video/avc");
            }
            name = selectCodecByName != null ? selectCodecByName.getName() : null;
            i7 = i2;
        } else {
            i7 = i2;
            name = null;
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str4, i, i7);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", i3);
        createVideoFormat.setInteger("i-frame-interval", i5);
        createVideoFormat.setString("frame-rate", null);
        if (Build.VERSION.SDK_INT > 21 && z) {
            name = new MediaCodecList(0).findEncoderForFormat(createVideoFormat);
        }
        if (i6 != 0 && i6 == 1 && Build.VERSION.SDK_INT > 21) {
            createVideoFormat.setInteger(Scopes.PROFILE, 2);
            if (Build.VERSION.SDK_INT > 23) {
                createVideoFormat.setInteger(FirebaseAnalytics.Param.LEVEL, 512);
            }
        }
        createVideoFormat.setInteger("frame-rate", i4);
        Log.d(TAG, "format: " + createVideoFormat);
        if (name == null) {
            MediaCodecInfo selectCodec = selectCodec("video/avc");
            name = selectCodec != null ? selectCodec.getName() : null;
            if (name == null) {
                throw new Exception("MediaCodec not available for " + str3);
            }
        }
        MediaCodec createByCodecName = MediaCodec.createByCodecName(name);
        this.mEncoder = createByCodecName;
        createByCodecName.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.mInputSurface = this.mEncoder.createInputSurface();
        this.mEncoder.start();
        this.mMuxer = mediaMuxerWrapper;
        this.mTrackIndex = -1;
    }

    public Surface getInputSurface() {
        return this.mInputSurface;
    }

    public void release() {
        MediaCodec mediaCodec = this.mEncoder;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mEncoder.release();
            this.mEncoder = null;
        }
    }

    public void drainEncoder(boolean z) {
        if (z) {
            this.mEncoder.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = this.mEncoder.getOutputBuffers();
        while (true) {
            int dequeueOutputBuffer = this.mEncoder.dequeueOutputBuffer(this.mBufferInfo, 10000L);
            if (dequeueOutputBuffer == -1) {
                if (!z) {
                    return;
                }
            } else if (dequeueOutputBuffer == -3) {
                outputBuffers = this.mEncoder.getOutputBuffers();
            } else if (dequeueOutputBuffer == -2) {
                MediaFormat outputFormat = this.mEncoder.getOutputFormat();
                Log.d(TAG, "encoder output format changed: " + outputFormat);
                this.mTrackIndex = this.mMuxer.addTrack(outputFormat, MimeTypes.BASE_TYPE_VIDEO);
            } else if (dequeueOutputBuffer < 0) {
                Log.w(TAG, "unexpected result from encoder.dequeueOutputBuffer: " + dequeueOutputBuffer);
            } else {
                ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                if (byteBuffer == null) {
                    throw new RuntimeException("encoderOutputBuffer " + dequeueOutputBuffer + " was null");
                }
                if ((this.mBufferInfo.flags & 2) != 0) {
                    this.mBufferInfo.size = 0;
                }
                if (this.mBufferInfo.size > 0) {
                    if (this.mBufferInfo.size < 0 || this.mBufferInfo.offset < 0 || this.mBufferInfo.presentationTimeUs < 0) {
                        Log.w(TAG, "Invalid bufferInfo, size:  " + this.mBufferInfo.size + " offset: " + this.mBufferInfo.offset + " presentationTimeUs: " + this.mBufferInfo.presentationTimeUs);
                    }
                    byteBuffer.position(this.mBufferInfo.offset);
                    byteBuffer.limit(this.mBufferInfo.offset + this.mBufferInfo.size);
                    this.mMuxer.writeSampleData(this.mTrackIndex, byteBuffer, this.mBufferInfo);
                }
                this.mEncoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                if ((this.mBufferInfo.flags & 4) != 0) {
                    if (z) {
                        return;
                    }
                    Log.w(TAG, "reached end of stream unexpectedly");
                    return;
                }
            }
        }
    }
}
