package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzavc;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class nq2 {

    /* renamed from: a */
    public static final int[] f20572a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f20573b = {48000, 44100, 32000};

    /* renamed from: c */
    public static final int[] f20574c = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: d */
    public static final /* synthetic */ int f20575d = 0;

    /* renamed from: a */
    public static int m14882a(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? f20572a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    /* renamed from: b */
    public static zzatd m14881b(iz2 iz2Var, String str, String str2, zzavc zzavcVar) {
        int i = f20573b[(iz2Var.m19240g() & 192) >> 6];
        int m19240g = iz2Var.m19240g();
        int i2 = f20574c[(m19240g & 56) >> 3];
        if ((m19240g & 4) != 0) {
            i2++;
        }
        return zzatd.m1126l(str, "audio/ac3", null, -1, -1, i2, i, null, zzavcVar, 0, str2);
    }

    /* renamed from: c */
    public static zzatd m14880c(iz2 iz2Var, String str, String str2, zzavc zzavcVar) {
        iz2Var.m19224w(2);
        int i = f20573b[(iz2Var.m19240g() & 192) >> 6];
        int m19240g = iz2Var.m19240g();
        int i2 = f20574c[(m19240g & 14) >> 1];
        if ((m19240g & 1) != 0) {
            i2++;
        }
        return zzatd.m1126l(str, "audio/eac3", null, -1, -1, i2, i, null, zzavcVar, 0, str2);
    }
}
