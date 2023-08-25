package com.daaw;
/* loaded from: classes.dex */
public final class ea1 {

    /* renamed from: c */
    public static final ea1 f8282c;

    /* renamed from: d */
    public static final ea1 f8283d;

    /* renamed from: e */
    public static final ea1 f8284e;

    /* renamed from: f */
    public static final ea1 f8285f;

    /* renamed from: g */
    public static final ea1 f8286g;

    /* renamed from: a */
    public final long f8287a;

    /* renamed from: b */
    public final long f8288b;

    static {
        ea1 ea1Var = new ea1(0L, 0L);
        f8282c = ea1Var;
        f8283d = new ea1(Long.MAX_VALUE, Long.MAX_VALUE);
        f8284e = new ea1(Long.MAX_VALUE, 0L);
        f8285f = new ea1(0L, Long.MAX_VALUE);
        f8286g = ea1Var;
    }

    public ea1(long j, long j2) {
        C2914s6.m10690a(j >= 0);
        C2914s6.m10690a(j2 >= 0);
        this.f8287a = j;
        this.f8288b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ea1.class != obj.getClass()) {
            return false;
        }
        ea1 ea1Var = (ea1) obj;
        return this.f8287a == ea1Var.f8287a && this.f8288b == ea1Var.f8288b;
    }

    public int hashCode() {
        return (((int) this.f8287a) * 31) + ((int) this.f8288b);
    }
}
