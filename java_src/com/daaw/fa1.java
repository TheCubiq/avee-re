package com.daaw;
/* loaded from: classes.dex */
public final class fa1 {

    /* renamed from: c */
    public static final fa1 f9301c = new fa1(0, 0);

    /* renamed from: a */
    public final long f9302a;

    /* renamed from: b */
    public final long f9303b;

    public fa1(long j, long j2) {
        this.f9302a = j;
        this.f9303b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fa1.class != obj.getClass()) {
            return false;
        }
        fa1 fa1Var = (fa1) obj;
        return this.f9302a == fa1Var.f9302a && this.f9303b == fa1Var.f9303b;
    }

    public int hashCode() {
        return (((int) this.f9302a) * 31) + ((int) this.f9303b);
    }

    public String toString() {
        return "[timeUs=" + this.f9302a + ", position=" + this.f9303b + "]";
    }
}
