package com.daaw;

import android.content.Context;
import android.media.metrics.LogSessionId;
/* loaded from: classes.dex */
public final class d48 {
    public static lh8 a(Context context, j58 j58Var, boolean z) {
        dh8 f = dh8.f(context);
        if (f == null) {
            s95.e("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new lh8(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            j58Var.s(f);
        }
        return new lh8(f.d());
    }
}
