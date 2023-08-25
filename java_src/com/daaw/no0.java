package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import com.google.android.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.List;
@TargetApi(16)
/* loaded from: classes.dex */
public final class no0 {
    /* renamed from: a */
    public static void m14908a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* renamed from: b */
    public static void m14907b(MediaFormat mediaFormat, ColorInfo colorInfo) {
        if (colorInfo != null) {
            m14905d(mediaFormat, "color-transfer", colorInfo.f35984r);
            m14905d(mediaFormat, "color-standard", colorInfo.f35982p);
            m14905d(mediaFormat, "color-range", colorInfo.f35983q);
            m14908a(mediaFormat, "hdr-static-info", colorInfo.f35985s);
        }
    }

    /* renamed from: c */
    public static void m14906c(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    /* renamed from: d */
    public static void m14905d(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: e */
    public static void m14904e(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer("csd-" + i, ByteBuffer.wrap(list.get(i)));
        }
    }
}
