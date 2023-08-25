package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodec;
@TargetApi(24)
/* loaded from: classes.dex */
public final class yr2 {
    public final MediaCodec.CryptoInfo a;
    public final MediaCodec.CryptoInfo.Pattern b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* bridge */ /* synthetic */ void a(yr2 yr2Var, int i, int i2) {
        yr2Var.b.set(0, 0);
        yr2Var.a.setPattern(yr2Var.b);
    }
}
