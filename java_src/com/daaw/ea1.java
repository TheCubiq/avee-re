package com.daaw;
/* loaded from: classes.dex */
public final class ea1 {
    public static final ea1 c;
    public static final ea1 d;
    public static final ea1 e;
    public static final ea1 f;
    public static final ea1 g;
    public final long a;
    public final long b;

    static {
        ea1 ea1Var = new ea1(0L, 0L);
        c = ea1Var;
        d = new ea1(Long.MAX_VALUE, Long.MAX_VALUE);
        e = new ea1(Long.MAX_VALUE, 0L);
        f = new ea1(0L, Long.MAX_VALUE);
        g = ea1Var;
    }

    public ea1(long j, long j2) {
        s6.a(j >= 0);
        s6.a(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ea1.class != obj.getClass()) {
            return false;
        }
        ea1 ea1Var = (ea1) obj;
        return this.a == ea1Var.a && this.b == ea1Var.b;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
