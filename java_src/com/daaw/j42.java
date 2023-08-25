package com.daaw;
/* loaded from: classes.dex */
public final class j42 {

    /* renamed from: c */
    public static final j42 f14255c = new j42(0, 0);

    /* renamed from: a */
    public final long f14256a;

    /* renamed from: b */
    public final long f14257b;

    public j42(long j, long j2) {
        this.f14256a = j;
        this.f14257b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j42.class == obj.getClass()) {
            j42 j42Var = (j42) obj;
            if (this.f14256a == j42Var.f14256a && this.f14257b == j42Var.f14257b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14256a) * 31) + ((int) this.f14257b);
    }

    public final String toString() {
        long j = this.f14256a;
        long j2 = this.f14257b;
        return "[timeUs=" + j + ", position=" + j2 + "]";
    }
}
