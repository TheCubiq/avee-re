package com.daaw;

import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class ek1 {
    public static final long a;
    public static final int b;
    public static final int c;
    public static final long d;
    public static u81 e;
    public static final uj1 f;
    public static final uj1 g;

    static {
        long e2;
        int d2;
        int d3;
        long e3;
        e2 = fj1.e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        a = e2;
        d2 = fj1.d("kotlinx.coroutines.scheduler.core.pool.size", f31.a(dj1.a(), 2), 1, 0, 8, null);
        b = d2;
        d3 = fj1.d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        c = d3;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e3 = fj1.e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        d = timeUnit.toNanos(e3);
        e = tr0.a;
        f = new vj1(0);
        g = new vj1(1);
    }
}
