package com.daaw;

import android.media.MediaCodec;
/* loaded from: classes.dex */
public class cp8 extends g87 {
    public final ep8 p;
    public final String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp8(Throwable th, ep8 ep8Var) {
        super("Decoder failed: ".concat(String.valueOf(ep8Var == null ? null : ep8Var.a)), th);
        String str = null;
        this.p = ep8Var;
        if (it5.a >= 21 && (th instanceof MediaCodec.CodecException)) {
            str = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.q = str;
    }
}
