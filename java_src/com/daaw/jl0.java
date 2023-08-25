package com.daaw;

import android.annotation.TargetApi;
import android.os.SystemClock;
/* loaded from: classes.dex */
public final class jl0 {

    /* renamed from: a */
    public static final double f15177a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: a */
    public static double m18441a(long j) {
        double m18440b = m18440b() - j;
        double d = f15177a;
        Double.isNaN(m18440b);
        return m18440b * d;
    }

    @TargetApi(17)
    /* renamed from: b */
    public static long m18440b() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
