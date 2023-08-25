package com.daaw;

import java.util.UUID;
/* loaded from: classes.dex */
public final class jp2 {

    /* renamed from: a */
    public static final int f15305a;

    /* renamed from: b */
    public static final UUID f15306b;

    /* renamed from: c */
    public static final UUID f15307c;

    /* renamed from: d */
    public static final UUID f15308d;

    /* renamed from: e */
    public static final UUID f15309e;

    static {
        f15305a = pz2.f23547a < 23 ? 1020 : 6396;
        f15306b = new UUID(0L, 0L);
        f15307c = new UUID(1186680826959645954L, -5988876978535335093L);
        f15308d = new UUID(-1301668207276963122L, -6645017420763422227L);
        f15309e = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    /* renamed from: a */
    public static long m18345a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j * 1000;
    }

    /* renamed from: b */
    public static long m18344b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j / 1000;
    }
}
