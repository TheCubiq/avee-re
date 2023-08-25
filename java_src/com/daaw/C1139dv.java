package com.daaw;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.conscrypt.NativeConstants;
/* renamed from: com.daaw.dv */
/* loaded from: classes.dex */
public final class C1139dv {

    /* renamed from: a */
    public static final int[] f7832a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    public static final int[] f7833b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    public static final int[] f7834c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m23938a(byte[] bArr) {
        int i;
        byte b;
        int i2;
        int i3;
        byte b2;
        boolean z = false;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i3 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[9];
            } else if (b3 != 31) {
                i = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b = bArr[7];
            } else {
                i3 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b2 = bArr[8];
            }
            i2 = (((b2 & 60) >> 2) | i3) + 1;
            z = true;
            return !z ? (i2 * 16) / 14 : i2;
        }
        i = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b = bArr[6];
        i2 = (((b & 240) >> 4) | i) + 1;
        if (!z) {
        }
    }

    /* renamed from: b */
    public static qv0 m23937b(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new qv0(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (m23936c(copyOf)) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b;
            }
        }
        qv0 qv0Var = new qv0(copyOf);
        if (copyOf[0] == 31) {
            qv0 qv0Var2 = new qv0(copyOf);
            while (qv0Var2.m12131b() >= 16) {
                qv0Var2.m12118o(2);
                qv0Var.m12127f(qv0Var2.m12125h(14), 14);
            }
        }
        qv0Var.m12122k(copyOf);
        return qv0Var;
    }

    /* renamed from: c */
    public static boolean m23936c(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }

    /* renamed from: d */
    public static boolean m23935d(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    /* renamed from: e */
    public static int m23934e(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        int i4;
        int position = byteBuffer.position();
        byte b = byteBuffer.get(position);
        if (b != -2) {
            if (b == -1) {
                i = (byteBuffer.get(position + 4) & 7) << 4;
                i4 = position + 7;
            } else if (b != 31) {
                i = (byteBuffer.get(position + 4) & 1) << 6;
                i2 = position + 5;
            } else {
                i = (byteBuffer.get(position + 5) & 7) << 4;
                i4 = position + 6;
            }
            i3 = byteBuffer.get(i4) & 60;
            return (((i3 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(position + 5) & 1) << 6;
        i2 = position + 4;
        i3 = byteBuffer.get(i2) & 252;
        return (((i3 >> 2) | i) + 1) * 32;
    }

    /* renamed from: f */
    public static int m23933f(byte[] bArr) {
        int i;
        byte b;
        int i2;
        byte b2;
        byte b3 = bArr[0];
        if (b3 != -2) {
            if (b3 == -1) {
                i = (bArr[4] & 7) << 4;
                b2 = bArr[7];
            } else if (b3 != 31) {
                i = (bArr[4] & 1) << 6;
                b = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b2 = bArr[6];
            }
            i2 = b2 & 60;
            return (((i2 >> 2) | i) + 1) * 32;
        }
        i = (bArr[5] & 1) << 6;
        b = bArr[4];
        i2 = b & 252;
        return (((i2 >> 2) | i) + 1) * 32;
    }

    /* renamed from: g */
    public static Format m23932g(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        qv0 m23937b = m23937b(bArr);
        m23937b.m12118o(60);
        int i = f7832a[m23937b.m12125h(6)];
        int i2 = f7833b[m23937b.m12125h(4)];
        int m12125h = m23937b.m12125h(5);
        int[] iArr = f7834c;
        int i3 = m12125h >= iArr.length ? -1 : (iArr[m12125h] * 1000) / 2;
        m23937b.m12118o(10);
        return Format.m1722u(str, "audio/vnd.dts", null, i3, -1, i + (m23937b.m12125h(2) > 0 ? 1 : 0), i2, null, drmInitData, 0, str2);
    }
}
