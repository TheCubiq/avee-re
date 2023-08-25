package com.daaw;

import com.google.android.gms.internal.ads.zzx;
import java.util.Arrays;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class g09 {

    /* renamed from: a */
    public static final int[] f10134a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    public static final int[] f10135b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    public static final int[] f10136c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d */
    public static final /* synthetic */ int f10137d = 0;

    /* renamed from: a */
    public static f92 m22102a(byte[] bArr, String str, String str2, zzx zzxVar) {
        cj5 cj5Var;
        if (bArr[0] == Byte.MAX_VALUE) {
            cj5Var = new cj5(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b = copyOf[0];
            if (b == -2 || b == -1) {
                for (int i = 0; i < copyOf.length - 1; i += 2) {
                    byte b2 = copyOf[i];
                    int i2 = i + 1;
                    copyOf[i] = copyOf[i2];
                    copyOf[i2] = b2;
                }
            }
            int length = copyOf.length;
            cj5Var = new cj5(copyOf, length);
            if (copyOf[0] == 31) {
                cj5 cj5Var2 = new cj5(copyOf, length);
                while (cj5Var2.m25331a() >= 16) {
                    cj5Var2.m25322j(2);
                    cj5Var.m25327e(cj5Var2.m25329c(14), 14);
                }
            }
            cj5Var.m25325g(copyOf, copyOf.length);
        }
        cj5Var.m25322j(60);
        int i3 = f10134a[cj5Var.m25329c(6)];
        int i4 = f10135b[cj5Var.m25329c(4)];
        int m25329c = cj5Var.m25329c(5);
        int i5 = m25329c < 29 ? (f10136c[m25329c] * 1000) / 2 : -1;
        cj5Var.m25322j(10);
        int i6 = cj5Var.m25329c(2) > 0 ? 1 : 0;
        b72 b72Var = new b72();
        b72Var.m26384h(str);
        b72Var.m26372s("audio/vnd.dts");
        b72Var.m26391d0(i5);
        b72Var.m26389e0(i3 + i6);
        b72Var.m26371t(i4);
        b72Var.m26396b(null);
        b72Var.m26380k(str2);
        return b72Var.m26366y();
    }
}
