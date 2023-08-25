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
/* loaded from: classes.dex */
public class k7 {
    public po0 a;
    public MediaCodec b;
    public MediaCodec.BufferInfo c = new MediaCodec.BufferInfo();
    public int d;
    public int e;

    /* loaded from: classes.dex */
    public static class a {
        public nc1.a a = null;
        public int b = 0;
        public long c = 0;
    }

    public k7(po0 po0Var, int i, int i2, int i3, int i4) {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
        createAudioFormat.setInteger("bitrate", i3);
        createAudioFormat.setInteger("channel-count", i2);
        if (i4 > 0) {
            createAudioFormat.setInteger("max-input-size", i4 * i2 * 2);
        }
        MediaCodec createByCodecName = MediaCodec.createByCodecName(e("audio/mp4a-latm").getName());
        this.b = createByCodecName;
        createByCodecName.configure(createAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        this.b.start();
        this.a = po0Var;
        this.e = i2;
        this.d = -1;
    }

    public static MediaCodecInfo e(String str) {
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

    public void a(boolean z, boolean z2) {
        if (z2) {
            this.b.signalEndOfInputStream();
        }
        while (true) {
            ByteBuffer[] outputBuffers = this.b.getOutputBuffers();
            while (true) {
                int dequeueOutputBuffer = this.b.dequeueOutputBuffer(this.c, 33333L);
                if (dequeueOutputBuffer == -1) {
                    if (!z2) {
                        return;
                    }
                } else if (dequeueOutputBuffer == -3) {
                    break;
                } else if (dequeueOutputBuffer == -2) {
                    MediaFormat outputFormat = this.b.getOutputFormat();
                    StringBuilder sb = new StringBuilder();
                    sb.append("encoder output format changed: ");
                    sb.append(outputFormat);
                    this.d = this.a.a(outputFormat, "audio");
                } else if (dequeueOutputBuffer < 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("unexpected result from encoder.dequeueOutputBuffer: ");
                    sb2.append(dequeueOutputBuffer);
                } else if (this.a.b()) {
                    ByteBuffer byteBuffer = outputBuffers[dequeueOutputBuffer];
                    if (byteBuffer == null) {
                        throw new RuntimeException("encoderOutputBuffer " + dequeueOutputBuffer + " was null");
                    }
                    MediaCodec.BufferInfo bufferInfo = this.c;
                    if ((bufferInfo.flags & 2) != 0) {
                        bufferInfo.size = 0;
                    }
                    int i = bufferInfo.size;
                    if (i > 0) {
                        if (i < 0 || bufferInfo.offset < 0 || bufferInfo.presentationTimeUs < 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Invalid bufferInfo, size:  ");
                            sb3.append(this.c.size);
                            sb3.append(" offset: ");
                            sb3.append(this.c.offset);
                            sb3.append(" presentationTimeUs: ");
                            sb3.append(this.c.presentationTimeUs);
                        }
                        byteBuffer.position(this.c.offset);
                        MediaCodec.BufferInfo bufferInfo2 = this.c;
                        byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                        this.a.d(this.d, byteBuffer, this.c);
                    }
                    this.b.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((this.c.flags & 4) != 0) {
                        return;
                    }
                } else {
                    this.b.releaseOutputBuffer(dequeueOutputBuffer, false);
                }
            }
        }
    }

    public boolean b(a aVar, boolean z, boolean z2) {
        int dequeueInputBuffer;
        MediaCodec mediaCodec;
        int i;
        int i2;
        long j;
        int i3;
        ByteBuffer[] inputBuffers = this.b.getInputBuffers();
        do {
            dequeueInputBuffer = this.b.dequeueInputBuffer(33333L);
            int i4 = 0;
            if (dequeueInputBuffer >= 0) {
                ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
                byteBuffer.clear();
                if (aVar.a != null) {
                    int min = Math.min(byteBuffer.capacity() / 2, aVar.b);
                    if (byteBuffer.capacity() / 2 < aVar.b) {
                        lz1.c("inputBuffer too small: " + byteBuffer.capacity() + " encodeData.length: " + aVar.b);
                    }
                    if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                        while (i4 < min) {
                            short s = aVar.a.a[i4];
                            byteBuffer.put((byte) (s & 255));
                            byteBuffer.put((byte) ((s & 65280) >> 8));
                            i4++;
                        }
                    } else {
                        while (i4 < min) {
                            short s2 = aVar.a.a[i4];
                            byteBuffer.put((byte) ((s2 & 65280) >> 8));
                            byteBuffer.put((byte) (s2 & 255));
                            i4++;
                        }
                    }
                    aVar.a.a();
                    aVar.a = null;
                }
                if (aVar.b <= 0 || z) {
                    mediaCodec = this.b;
                    i = 0;
                    i2 = 0;
                    j = aVar.c;
                    i3 = 4;
                } else {
                    mediaCodec = this.b;
                    i = 0;
                    i2 = byteBuffer.position();
                    j = aVar.c;
                    i3 = 0;
                }
                mediaCodec.queueInputBuffer(dequeueInputBuffer, i, i2, j, i3);
                return true;
            }
        } while (dequeueInputBuffer != -1);
        return false;
    }

    public int c() {
        return this.e;
    }

    public void d() {
        MediaCodec mediaCodec = this.b;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.b.release();
            this.b = null;
        }
    }
}
