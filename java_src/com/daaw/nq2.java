package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzavc;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class nq2 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final /* synthetic */ int d = 0;

    public static int a(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    public static zzatd b(iz2 iz2Var, String str, String str2, zzavc zzavcVar) {
        int i = b[(iz2Var.g() & 192) >> 6];
        int g = iz2Var.g();
        int i2 = c[(g & 56) >> 3];
        if ((g & 4) != 0) {
            i2++;
        }
        return zzatd.l(str, "audio/ac3", null, -1, -1, i2, i, null, zzavcVar, 0, str2);
    }

    public static zzatd c(iz2 iz2Var, String str, String str2, zzavc zzavcVar) {
        iz2Var.w(2);
        int i = b[(iz2Var.g() & 192) >> 6];
        int g = iz2Var.g();
        int i2 = c[(g & 14) >> 1];
        if ((g & 1) != 0) {
            i2++;
        }
        return zzatd.l(str, "audio/eac3", null, -1, -1, i2, i, null, zzavcVar, 0, str2);
    }
}
