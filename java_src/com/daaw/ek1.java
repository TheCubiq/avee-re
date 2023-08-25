package com.daaw;

import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class ek1 {

    /* renamed from: a */
    public static final long f8528a;

    /* renamed from: b */
    public static final int f8529b;

    /* renamed from: c */
    public static final int f8530c;

    /* renamed from: d */
    public static final long f8531d;

    /* renamed from: e */
    public static u81 f8532e;

    /* renamed from: f */
    public static final uj1 f8533f;

    /* renamed from: g */
    public static final uj1 f8534g;

    static {
        long m22603e;
        int m22604d;
        int m22604d2;
        long m22603e2;
        m22603e = fj1.m22603e("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f8528a = m22603e;
        m22604d = fj1.m22604d("kotlinx.coroutines.scheduler.core.pool.size", f31.m22948a(dj1.m24356a(), 2), 1, 0, 8, null);
        f8529b = m22604d;
        m22604d2 = fj1.m22604d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f8530c = m22604d2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m22603e2 = fj1.m22603e("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f8531d = timeUnit.toNanos(m22603e2);
        f8532e = tr0.f27992a;
        f8533f = new vj1(0);
        f8534g = new vj1(1);
    }
}
