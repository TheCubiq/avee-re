package com.daaw;
/* loaded from: classes.dex */
public final class j42 {
    public static final j42 c = new j42(0, 0);
    public final long a;
    public final long b;

    public j42(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j42.class == obj.getClass()) {
            j42 j42Var = (j42) obj;
            if (this.a == j42Var.a && this.b == j42Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        long j = this.a;
        long j2 = this.b;
        return "[timeUs=" + j + ", position=" + j2 + "]";
    }
}
