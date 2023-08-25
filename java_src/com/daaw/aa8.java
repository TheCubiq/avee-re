package com.daaw;
/* loaded from: classes.dex */
public final class aa8 {

    /* renamed from: c */
    public static final aa8 f3023c;

    /* renamed from: d */
    public static final aa8 f3024d;

    /* renamed from: e */
    public static final aa8 f3025e;

    /* renamed from: f */
    public static final aa8 f3026f;

    /* renamed from: g */
    public static final aa8 f3027g;

    /* renamed from: a */
    public final long f3028a;

    /* renamed from: b */
    public final long f3029b;

    static {
        aa8 aa8Var = new aa8(0L, 0L);
        f3023c = aa8Var;
        f3024d = new aa8(Long.MAX_VALUE, Long.MAX_VALUE);
        f3025e = new aa8(Long.MAX_VALUE, 0L);
        f3026f = new aa8(0L, Long.MAX_VALUE);
        f3027g = aa8Var;
    }

    public aa8(long j, long j2) {
        uo4.m7874d(j >= 0);
        uo4.m7874d(j2 >= 0);
        this.f3028a = j;
        this.f3029b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aa8.class == obj.getClass()) {
            aa8 aa8Var = (aa8) obj;
            if (this.f3028a == aa8Var.f3028a && this.f3029b == aa8Var.f3029b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f3028a) * 31) + ((int) this.f3029b);
    }
}
