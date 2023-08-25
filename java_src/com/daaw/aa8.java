package com.daaw;
/* loaded from: classes.dex */
public final class aa8 {
    public static final aa8 c;
    public static final aa8 d;
    public static final aa8 e;
    public static final aa8 f;
    public static final aa8 g;
    public final long a;
    public final long b;

    static {
        aa8 aa8Var = new aa8(0L, 0L);
        c = aa8Var;
        d = new aa8(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new aa8(Long.MAX_VALUE, 0L);
        f = new aa8(0L, Long.MAX_VALUE);
        g = aa8Var;
    }

    public aa8(long j, long j2) {
        uo4.d(j >= 0);
        uo4.d(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aa8.class == obj.getClass()) {
            aa8 aa8Var = (aa8) obj;
            if (this.a == aa8Var.a && this.b == aa8Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
