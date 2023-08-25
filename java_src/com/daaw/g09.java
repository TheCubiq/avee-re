package com.daaw;

import com.google.android.gms.internal.ads.zzx;
import java.util.Arrays;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class g09 {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final /* synthetic */ int d = 0;

    public static f92 a(byte[] bArr, String str, String str2, zzx zzxVar) {
        cj5 cj5Var;
        if (bArr[0] == Byte.MAX_VALUE) {
            cj5Var = new cj5(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b2 = copyOf[0];
            if (b2 == -2 || b2 == -1) {
                for (int i = 0; i < copyOf.length - 1; i += 2) {
                    byte b3 = copyOf[i];
                    int i2 = i + 1;
                    copyOf[i] = copyOf[i2];
                    copyOf[i2] = b3;
                }
            }
            int length = copyOf.length;
            cj5Var = new cj5(copyOf, length);
            if (copyOf[0] == 31) {
                cj5 cj5Var2 = new cj5(copyOf, length);
                while (cj5Var2.a() >= 16) {
                    cj5Var2.j(2);
                    cj5Var.e(cj5Var2.c(14), 14);
                }
            }
            cj5Var.g(copyOf, copyOf.length);
        }
        cj5Var.j(60);
        int i3 = a[cj5Var.c(6)];
        int i4 = b[cj5Var.c(4)];
        int c2 = cj5Var.c(5);
        int i5 = c2 < 29 ? (c[c2] * 1000) / 2 : -1;
        cj5Var.j(10);
        int i6 = cj5Var.c(2) > 0 ? 1 : 0;
        b72 b72Var = new b72();
        b72Var.h(str);
        b72Var.s("audio/vnd.dts");
        b72Var.d0(i5);
        b72Var.e0(i3 + i6);
        b72Var.t(i4);
        b72Var.b(null);
        b72Var.k(str2);
        return b72Var.y();
    }
}
