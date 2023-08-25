package com.daaw;

import android.media.MediaCodec;
/* loaded from: classes.dex */
public class cp8 extends g87 {

    /* renamed from: p */
    public final ep8 f6068p;

    /* renamed from: q */
    public final String f6069q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp8(Throwable th, ep8 ep8Var) {
        super("Decoder failed: ".concat(String.valueOf(ep8Var == null ? null : ep8Var.f8666a)), th);
        String str = null;
        this.f6068p = ep8Var;
        if (it5.f13991a >= 21 && (th instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.f6069q = str;
    }
}
