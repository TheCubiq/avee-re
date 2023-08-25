package com.daaw;

import android.view.Surface;
/* loaded from: classes.dex */
public final class xx8 {
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            s95.c("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
