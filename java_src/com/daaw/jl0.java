package com.daaw;

import android.annotation.TargetApi;
import android.os.SystemClock;
/* loaded from: classes.dex */
public final class jl0 {
    public static final double a = 1.0d / Math.pow(10.0d, 6.0d);

    public static double a(long j) {
        double b = b() - j;
        double d = a;
        Double.isNaN(b);
        return b * d;
    }

    @TargetApi(17)
    public static long b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
