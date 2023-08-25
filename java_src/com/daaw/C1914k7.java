package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.daaw.nc1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
@TargetApi(18)
/* renamed from: com.daaw.k7 */
/* loaded from: classes.dex */
public class C1914k7 {

    /* renamed from: a */
    public po0 f15720a;

    /* renamed from: b */
    public MediaCodec f15721b;

    /* renamed from: c */
    public MediaCodec.BufferInfo f15722c = new MediaCodec.BufferInfo();

    /* renamed from: d */
    public int f15723d;

    /* renamed from: e */
    public int f15724e;

    /* renamed from: com.daaw.k7$a */
    /* loaded from: classes.dex */
    public static class C1915a {

        /* renamed from: a */
        public nc1.C2283a f15725a = null;

        /* renamed from: b */
        public int f15726b = 0;

        /* renamed from: c */
        public long f15727c = 0;
    }

    public C1914k7(po0 po0Var, int i, int i2, int i3, int i4) {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
        createAudioFormat.setInteger("bitrate", i3);
        createAudioFormat.setInteger("channel-count", i2);
        if (i4 > 0) {
            createAudioFormat.setInteger("max-input-size", i4 * i2 * 2);
        }
        MediaCodec createByCodecName = MediaCodec.createByCodecName(m18010e("audio/mp4a-latm").getName());
        this.f15721b = createByCodecName;
        createByCodecName.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        this.f15721b.start();
        this.f15720a = po0Var;
        this.f15724e = i2;
        this.f15723d = -1;
    }

    /* renamed from: e */
    public static MediaCodecInfo m18010e(String str) {
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

    /* renamed from: a */
    public void m18014a(boolean z, boolean z2) {
        if (z2) {
            this.f15721b.signalEndOfInputStream();
        }
        while (true) {
            ByteBuffer[] outputBuffers = this.f15721b.getOutputBuffers();
            while (true) {
                int dequeueOutputBuffer = this.f15721b.dequeueOutputBuffer(this.f15722c, 33333L);
                if (dequeueOutputBuffer == -1) {
                    if (!z2) {
                        return;
                    }
                } else if (dequeueOutputBuffer == -3) {
                    break;
                } else if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = this.f15721b.getOutputFormat();
                    StringBuilder sb = new StringBuilder();
                    sb.append("encoder output format changed: ");
                    sb.append(outputFormat);
                    this.f15723d = this.f15720a.m13262a(outputFormat, "audio");
                } else if (dequeueOutputBuffer < 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("unexpected result from encoder.dequeueOutputBuffer: ");
                    sb2.append(dequeueOutputBuffer);
                } else if (this.f15720a.m13261b()) {
                    ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                    if (byteBuffer == null) {
                        throw new RuntimeException("encoderOutputBuffer " + dequeueOutputBuffer + " was null");
                    }
                    MediaCodec.BufferInfo bufferInfo = this.f15722c;
                    if ((bufferInfo.flags & 2) != 0) {
                        bufferInfo.size = 0;
                    }
                    int i = bufferInfo.size;
                    if (i > 0) {
                        if (i < 0 || bufferInfo.offset < 0 || bufferInfo.presentationTimeUs < 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Invalid bufferInfo, size:  ");
                            sb3.append(this.f15722c.size);
                            sb3.append(" offset: ");
                            sb3.append(this.f15722c.offset);
                            sb3.append(" presentationTimeUs: ");
                            sb3.append(this.f15722c.presentationTimeUs);
                        }
                        byteBuffer.position(this.f15722c.offset);
                        MediaCodec.BufferInfo bufferInfo2 = this.f15722c;
                        byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                        this.f15720a.m13259d(this.f15723d, byteBuffer, this.f15722c);
                    }
                    this.f15721b.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((this.f15722c.flags & 4) != 0) {
                        return;
                    }
                } else {
                    this.f15721b.releaseOutputBuffer(dequeueOutputBuffer, false);
                }
            }
        }
    }

    /* renamed from: b */
    public boolean m18013b(C1915a c1915a, boolean z, boolean z2) {
        int dequeueInputBuffer;
        MediaCodec mediaCodec;
        int i;
        int i2;
        long j;
        int i3;
        ByteBuffer[] inputBuffers = this.f15721b.getInputBuffers();
        do {
            dequeueInputBuffer = this.f15721b.dequeueInputBuffer(33333L);
            int i4 = 0;
            if (dequeueInputBuffer >= 0) {
                ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                byteBuffer.clear();
                if (c1915a.f15725a != null) {
                    int min = Math.min(byteBuffer.capacity() / 2, c1915a.f15726b);
                    if (byteBuffer.capacity() / 2 < c1915a.f15726b) {
                        lz1.m16363c("inputBuffer too small: " + byteBuffer.capacity() + " encodeData.length: " + c1915a.f15726b);
                    }
                    if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                        while (i4 < min) {
                            short s = c1915a.f15725a.f20017a[i4];
                            byteBuffer.put((byte) (s & 255));
                            byteBuffer.put((byte) ((s & 65280) >> 8));
                            i4++;
                        }
                    } else {
                        while (i4 < min) {
                            short s2 = c1915a.f15725a.f20017a[i4];
                            byteBuffer.put((byte) ((s2 & 65280) >> 8));
                            byteBuffer.put((byte) (s2 & 255));
                            i4++;
                        }
                    }
                    c1915a.f15725a.m15243a();
                    c1915a.f15725a = null;
                }
                if (c1915a.f15726b <= 0 || z) {
                    mediaCodec = this.f15721b;
                    i = 0;
                    i2 = 0;
                    j = c1915a.f15727c;
                    i3 = 4;
                } else {
                    mediaCodec = this.f15721b;
                    i = 0;
                    i2 = byteBuffer.position();
                    j = c1915a.f15727c;
                    i3 = 0;
                }
                mediaCodec.queueInputBuffer(dequeueInputBuffer, i, i2, j, i3);
                return true;
            }
        } while (dequeueInputBuffer != -1);
        return false;
    }

    /* renamed from: c */
    public int m18012c() {
        return this.f15724e;
    }

    /* renamed from: d */
    public void m18011d() {
        MediaCodec mediaCodec = this.f15721b;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.f15721b.release();
            this.f15721b = null;
        }
    }
}
