package com.daaw;

import java.util.UUID;
/* renamed from: com.daaw.dd */
/* loaded from: classes.dex */
public final class C1075dd {

    /* renamed from: a */
    public static final int f6941a;

    /* renamed from: b */
    public static final UUID f6942b;

    /* renamed from: c */
    public static final UUID f6943c;

    /* renamed from: d */
    public static final UUID f6944d;

    /* renamed from: e */
    public static final UUID f6945e;

    /* renamed from: f */
    public static final UUID f6946f;

    static {
        f6941a = sq1.f26525a < 23 ? 1020 : 6396;
        f6942b = new UUID(0L, 0L);
        f6943c = new UUID(1186680826959645954L, -5988876978535335093L);
        f6944d = new UUID(-2129748144642739255L, 8654423357094679310L);
        f6945e = new UUID(-1301668207276963122L, -6645017420763422227L);
        f6946f = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    /* renamed from: a */
    public static long m24527a(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: b */
    public static long m24526b(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }
}
