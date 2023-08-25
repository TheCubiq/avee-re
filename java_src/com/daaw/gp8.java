package com.daaw;

import android.media.MediaCodec;
/* loaded from: classes.dex */
public final class gp8 extends Exception {

    /* renamed from: p */
    public final String f11559p;

    /* renamed from: q */
    public final boolean f11560q;

    /* renamed from: r */
    public final ep8 f11561r;

    /* renamed from: s */
    public final String f11562s;

    /* renamed from: t */
    public final gp8 f11563t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gp8(f92 f92Var, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + r13, th, r5, false, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_" + r11, null);
        String valueOf = String.valueOf(f92Var);
        String str = f92Var.f9275l;
        int abs = Math.abs(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gp8(f92 f92Var, Throwable th, boolean z, ep8 ep8Var) {
        this("Decoder init failed: " + r13 + ", " + r0, th, f92Var.f9275l, false, ep8Var, (it5.f13991a < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo(), null);
        String str = ep8Var.f8666a;
        String valueOf = String.valueOf(f92Var);
    }

    public gp8(String str, Throwable th, String str2, boolean z, ep8 ep8Var, String str3, gp8 gp8Var) {
        super(str, th);
        this.f11559p = str2;
        this.f11560q = false;
        this.f11561r = ep8Var;
        this.f11562s = str3;
        this.f11563t = gp8Var;
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ gp8 m21353a(gp8 gp8Var, gp8 gp8Var2) {
        return new gp8(gp8Var.getMessage(), gp8Var.getCause(), gp8Var.f11559p, false, gp8Var.f11561r, gp8Var.f11562s, gp8Var2);
    }
}
