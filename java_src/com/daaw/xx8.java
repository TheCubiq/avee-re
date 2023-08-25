package com.daaw;

import android.view.Surface;
/* loaded from: classes.dex */
public final class xx8 {
    /* renamed from: a */
    public static void m4412a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            s95.m10495c("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
