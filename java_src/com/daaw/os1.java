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
    public Surface a;
    public po0 b;
    public MediaCodec c;
    public MediaCodec.BufferInfo d = new MediaCodec.BufferInfo();
    public int e;

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
            MediaCodecInfo f = z ? null : f(str3);
            if (f == null && (f = e(str4)) == null) {
                f = e("video/avc");
            }
            name = f != null ? f.getName() : null;
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
            MediaCodecInfo e = e("video/avc");
            name = e != null ? e.getName() : null;
            if (name == null) {
                throw new Exception("MediaCodec not available for " + str3);
            }
        }
        MediaCodec createByCodecName = MediaCodec.createByCodecName(name);
        this.c = createByCodecName;
        createByCodecName.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.a = this.c.createInputSurface();
        this.c.start();
        this.b = po0Var;
        this.e = -1;
    }

    public static void c() {
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

    public static MediaCodecInfo e(String str) {
        c();
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

    public static MediaCodecInfo f(String str) {
        c();
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

    public void a(boolean z) {
        if (z) {
            this.c.signalEndOfInputStream();
        }
        while (true) {
            ByteBuffer[] outputBuffers = this.c.getOutputBuffers();
            while (true) {
                int dequeueOutputBuffer = this.c.dequeueOutputBuffer(this.d, 10000L);
                if (dequeueOutputBuffer == -1) {
                    if (!z) {
                        return;
                    }
                } else if (dequeueOutputBuffer == -3) {
                    break;
                } else if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = this.c.getOutputFormat();
                    StringBuilder sb = new StringBuilder();
                    sb.append("encoder output format changed: ");
                    sb.append(outputFormat);
                    this.e = this.b.a(outputFormat, "video");
                } else if (dequeueOutputBuffer < 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("unexpected result from encoder.dequeueOutputBuffer: ");
                    sb2.append(dequeueOutputBuffer);
                } else {
                    ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                    if (byteBuffer == null) {
                        throw new RuntimeException("encoderOutputBuffer " + dequeueOutputBuffer + " was null");
                    }
                    MediaCodec.BufferInfo bufferInfo = this.d;
                    if ((bufferInfo.flags & 2) != 0) {
                        bufferInfo.size = 0;
                    }
                    int i = bufferInfo.size;
                    if (i > 0) {
                        if (i < 0 || bufferInfo.offset < 0 || bufferInfo.presentationTimeUs < 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Invalid bufferInfo, size:  ");
                            sb3.append(this.d.size);
                            sb3.append(" offset: ");
                            sb3.append(this.d.offset);
                            sb3.append(" presentationTimeUs: ");
                            sb3.append(this.d.presentationTimeUs);
                        }
                        byteBuffer.position(this.d.offset);
                        MediaCodec.BufferInfo bufferInfo2 = this.d;
                        byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                        this.b.d(this.e, byteBuffer, this.d);
                    }
                    this.c.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((this.d.flags & 4) != 0) {
                        return;
                    }
                }
            }
        }
    }

    public Surface b() {
        return this.a;
    }

    public void d() {
        MediaCodec mediaCodec = this.c;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.c.release();
            this.c = null;
        }
    }
}
