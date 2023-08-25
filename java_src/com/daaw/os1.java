package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import java.nio.ByteBuffer;
@TargetApi(18)
/* loaded from: classes.dex */
public class os1 {

    /* renamed from: a */
    public Surface f21916a;

    /* renamed from: b */
    public po0 f21917b;

    /* renamed from: c */
    public MediaCodec f21918c;

    /* renamed from: d */
    public MediaCodec.BufferInfo f21919d = new MediaCodec.BufferInfo();

    /* renamed from: e */
    public int f21920e;

    public os1(po0 po0Var, int i, int i2, int i3, int i4, int i5, String str, String str2, int i6) {
        String name;
        int i7;
        int i8;
        int i9;
        String str3 = str;
        String str4 = str2 == null ? "video/avc" : str2;
        boolean z = str3 == null || str3.equalsIgnoreCase("default");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 21 || !z) {
            str3 = str3 == null ? "" : str3;
            MediaCodecInfo m14012f = z ? null : m14012f(str3);
            if (m14012f == null && (m14012f = m14013e(str4)) == null) {
                m14012f = m14013e("video/avc");
            }
            name = m14012f != null ? m14012f.getName() : null;
            i7 = i;
            i8 = i2;
        } else {
            i7 = i;
            i8 = i2;
            name = null;
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str4, i7, i8);
        createVideoFormat.setInteger("color-format", 2130708361);
        createVideoFormat.setInteger("bitrate", i3);
        createVideoFormat.setInteger("i-frame-interval", i5);
        createVideoFormat.setString("frame-rate", null);
        if (i10 > 21 && z) {
            name = new MediaCodecList(0).findEncoderForFormat(createVideoFormat);
        }
        if (i10 > 23) {
            if (i6 == 1) {
                createVideoFormat.setInteger("profile", 2);
                i9 = 512;
            } else if (i6 == 2) {
                if (i10 >= 27) {
                    createVideoFormat.setInteger("profile", 524288);
                }
                i9 = 32768;
            }
            createVideoFormat.setInteger("level", i9);
        }
        createVideoFormat.setInteger("frame-rate", i4);
        StringBuilder sb = new StringBuilder();
        sb.append("format: ");
        sb.append(createVideoFormat);
        if (name == null) {
            MediaCodecInfo m14013e = m14013e("video/avc");
            name = m14013e != null ? m14013e.getName() : null;
            if (name == null) {
                throw new Exception("MediaCodec not available for " + str3);
            }
        }
        MediaCodec createByCodecName = MediaCodec.createByCodecName(name);
        this.f21918c = createByCodecName;
        createByCodecName.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.f21916a = this.f21918c.createInputSurface();
        this.f21918c.start();
        this.f21917b = po0Var;
        this.f21920e = -1;
    }

    /* renamed from: c */
    public static void m14015c() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Codec available: ");
                sb.append(codecInfoAt.getName());
                for (String str : codecInfoAt.getSupportedTypes()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("    supported type: ");
                    sb2.append(str);
                }
            }
        }
    }

    /* renamed from: e */
    public static MediaCodecInfo m14013e(String str) {
        m14015c();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Codec selected: ");
                        sb.append(codecInfoAt.getName());
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static MediaCodecInfo m14012f(String str) {
        m14015c();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder() && codecInfoAt.getName().equalsIgnoreCase(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Codec selected: ");
                sb.append(codecInfoAt.getName());
                return codecInfoAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m14017a(boolean z) {
        if (z) {
            this.f21918c.signalEndOfInputStream();
        }
        while (true) {
            ByteBuffer[] outputBuffers = this.f21918c.getOutputBuffers();
            while (true) {
                int dequeueOutputBuffer = this.f21918c.dequeueOutputBuffer(this.f21919d, 10000L);
                if (dequeueOutputBuffer == -1) {
                    if (!z) {
                        return;
                    }
                } else if (dequeueOutputBuffer == -3) {
                    break;
                } else if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = this.f21918c.getOutputFormat();
                    StringBuilder sb = new StringBuilder();
                    sb.append("encoder output format changed: ");
                    sb.append(outputFormat);
                    this.f21920e = this.f21917b.m13262a(outputFormat, "video");
                } else if (dequeueOutputBuffer < 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("unexpected result from encoder.dequeueOutputBuffer: ");
                    sb2.append(dequeueOutputBuffer);
                } else {
                    ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                    if (byteBuffer == null) {
                        throw new RuntimeException("encoderOutputBuffer " + dequeueOutputBuffer + " was null");
                    }
                    MediaCodec.BufferInfo bufferInfo = this.f21919d;
                    if ((bufferInfo.flags & 2) != 0) {
                        bufferInfo.size = 0;
                    }
                    int i = bufferInfo.size;
                    if (i > 0) {
                        if (i < 0 || bufferInfo.offset < 0 || bufferInfo.presentationTimeUs < 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Invalid bufferInfo, size:  ");
                            sb3.append(this.f21919d.size);
                            sb3.append(" offset: ");
                            sb3.append(this.f21919d.offset);
                            sb3.append(" presentationTimeUs: ");
                            sb3.append(this.f21919d.presentationTimeUs);
                        }
                        byteBuffer.position(this.f21919d.offset);
                        MediaCodec.BufferInfo bufferInfo2 = this.f21919d;
                        byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                        this.f21917b.m13259d(this.f21920e, byteBuffer, this.f21919d);
                    }
                    this.f21918c.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((this.f21919d.flags & 4) != 0) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public Surface m14016b() {
        return this.f21916a;
    }

    /* renamed from: d */
    public void m14014d() {
        MediaCodec mediaCodec = this.f21918c;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.f21918c.release();
            this.f21918c = null;
        }
    }
}
