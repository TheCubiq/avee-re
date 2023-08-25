package com.daaw;
/* loaded from: classes.dex */
public class nz8 {
    public final hz8 a;
    public final mz8 b;
    public jz8 c;
    public final int d;

    public nz8(kz8 kz8Var, mz8 mz8Var, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.b = mz8Var;
        this.d = i;
        this.a = new hz8(kz8Var, j, 0L, j3, j4, j5, j6);
    }

    public static final int f(k09 k09Var, long j, f42 f42Var) {
        if (j == k09Var.zzf()) {
            return 0;
        }
        f42Var.a = j;
        return 1;
    }

    public static final boolean g(k09 k09Var, long j) {
        long zzf = j - k09Var.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        ((rz8) k09Var).l((int) zzf, false);
        return true;
    }

    public final int a(k09 k09Var, f42 f42Var) {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        while (true) {
            jz8 jz8Var = this.c;
            uo4.b(jz8Var);
            j = jz8Var.f;
            j2 = jz8Var.g;
            j3 = jz8Var.h;
            if (j2 - j <= this.d) {
                c(false, j);
                return f(k09Var, j, f42Var);
            } else if (!g(k09Var, j3)) {
                return f(k09Var, j3, f42Var);
            } else {
                k09Var.zzj();
                mz8 mz8Var = this.b;
                j4 = jz8Var.b;
                lz8 a = mz8Var.a(k09Var, j4);
                i = a.a;
                if (i == -3) {
                    c(false, j3);
                    return f(k09Var, j3, f42Var);
                } else if (i == -2) {
                    j10 = a.b;
                    j11 = a.c;
                    jz8.h(jz8Var, j10, j11);
                } else if (i != -1) {
                    j5 = a.c;
                    g(k09Var, j5);
                    j6 = a.c;
                    c(true, j6);
                    j7 = a.c;
                    return f(k09Var, j7, f42Var);
                } else {
                    j8 = a.b;
                    j9 = a.c;
                    jz8.g(jz8Var, j8, j9);
                }
            }
        }
    }

    public final i42 b() {
        return this.a;
    }

    public final void c(boolean z, long j) {
        this.c = null;
        this.b.zzb();
    }

    public final void d(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        jz8 jz8Var = this.c;
        if (jz8Var != null) {
            j6 = jz8Var.a;
            if (j6 == j) {
                return;
            }
        }
        long g = this.a.g(j);
        hz8 hz8Var = this.a;
        j2 = hz8Var.c;
        j3 = hz8Var.d;
        j4 = hz8Var.e;
        j5 = hz8Var.f;
        this.c = new jz8(j, g, 0L, j2, j3, j4, j5);
    }

    public final boolean e() {
        return this.c != null;
    }
}
