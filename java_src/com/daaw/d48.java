package com.daaw;

import android.content.Context;
import android.media.metrics.LogSessionId;
/* loaded from: classes.dex */
public final class d48 {
    /* renamed from: a */
    public static lh8 m24644a(Context context, j58 j58Var, boolean z) {
        dh8 m24375f = dh8.m24375f(context);
        if (m24375f == null) {
            s95.m10493e("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new lh8(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            j58Var.m18802s(m24375f);
        }
        return new lh8(m24375f.m24376d());
    }
}
