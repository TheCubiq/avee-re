package com.daaw;

import android.media.MediaCodec;
import com.google.android.gms.internal.ads.zzatd;
/* loaded from: classes.dex */
public final class pu2 extends Exception {

    /* renamed from: p */
    public final String f23284p;

    /* renamed from: q */
    public final String f23285q;

    /* renamed from: r */
    public final String f23286r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pu2(zzatd zzatdVar, Throwable th, boolean z, int i) {
        super("Decoder init failed: [" + i + "], " + r5, th);
        String valueOf = String.valueOf(zzatdVar);
        this.f23284p = zzatdVar.f36794u;
        this.f23285q = null;
        int abs = Math.abs(i);
        this.f23286r = "com.google.android.exoplayer.MediaCodecTrackRenderer_neg_" + abs;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pu2(zzatd zzatdVar, Throwable th, boolean z, String str) {
        super("Decoder init failed: " + str + ", " + r5, th);
        String valueOf = String.valueOf(zzatdVar);
        this.f23284p = zzatdVar.f36794u;
        this.f23285q = str;
        String str2 = null;
        if (pz2.f23547a >= 21 && (th instanceof MediaCodec.CodecException)) {
            str2 = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.f23286r = str2;
    }
}
