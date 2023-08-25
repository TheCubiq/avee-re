package com.daaw;
/* loaded from: classes.dex */
public final class fa1 {
    public static final fa1 c = new fa1(0, 0);
    public final long a;
    public final long b;

    public fa1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fa1.class != obj.getClass()) {
            return false;
        }
        fa1 fa1Var = (fa1) obj;
        return this.a == fa1Var.a && this.b == fa1Var.b;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public String toString() {
        return "[timeUs=" + this.a + ", position=" + this.b + "]";
    }
}
