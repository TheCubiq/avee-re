package com.daaw;

import android.media.MediaCodec;
/* loaded from: classes.dex */
public final class a67 {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* bridge */ /* synthetic */ void a(a67 a67Var, int i, int i2) {
        a67Var.b.set(i, i2);
        a67Var.a.setPattern(a67Var.b);
    }
}
