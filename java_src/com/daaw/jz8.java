package com.daaw;
/* loaded from: classes.dex */
public final class jz8 {
    public final long a;
    public final long b;
    public final long c;
    public long d = 0;
    public long e;
    public long f;
    public long g;
    public long h;

    public jz8(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.c = j7;
        this.h = f(j2, 0L, j4, j5, j6, j7);
    }

    public static long f(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
        return it5.b0(((j4 + j7) - j6) - (j7 / 20), j4, (-1) + j5);
    }

    public static /* bridge */ /* synthetic */ void g(jz8 jz8Var, long j, long j2) {
        jz8Var.e = j;
        jz8Var.g = j2;
        jz8Var.i();
    }

    public static /* bridge */ /* synthetic */ void h(jz8 jz8Var, long j, long j2) {
        jz8Var.d = j;
        jz8Var.f = j2;
        jz8Var.i();
    }

    public final void i() {
        this.h = f(this.b, this.d, this.e, this.f, this.g, this.c);
    }
}
