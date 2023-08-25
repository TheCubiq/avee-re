package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class j52 {
    public final m42 a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public j52(int i, int i2, long j, int i3, m42 m42Var) {
        i2 = i2 != 1 ? 2 : i2;
        this.d = j;
        this.e = i3;
        this.a = m42Var;
        this.b = i(i, i2 == 2 ? 1667497984 : 1651965952);
        this.c = i2 == 2 ? i(i, 1650720768) : -1;
        this.k = new long[512];
        this.l = new int[512];
    }

    public static int i(int i, int i2) {
        return ((i / 10) + 48) | (((i % 10) + 48) << 8) | i2;
    }

    public final g42 a(long j) {
        int j2 = (int) (j / j(1));
        int M = it5.M(this.l, j2, true, true);
        if (this.l[M] == j2) {
            j42 k = k(M);
            return new g42(k, k);
        }
        j42 k2 = k(M);
        int i = M + 1;
        return i < this.k.length ? new g42(k2, k(i)) : new g42(k2, k2);
    }

    public final void b(long j) {
        if (this.j == this.l.length) {
            long[] jArr = this.k;
            this.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.l;
            this.l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.k;
        int i = this.j;
        jArr2[i] = j;
        this.l[i] = this.i;
        this.j = i + 1;
    }

    public final void c() {
        this.k = Arrays.copyOf(this.k, this.j);
        this.l = Arrays.copyOf(this.l, this.j);
    }

    public final void d() {
        this.i++;
    }

    public final void e(int i) {
        this.f = i;
        this.g = i;
    }

    public final void f(long j) {
        int i;
        if (this.j == 0) {
            i = 0;
        } else {
            i = this.l[it5.N(this.k, j, true, true)];
        }
        this.h = i;
    }

    public final boolean g(int i) {
        return this.b == i || this.c == i;
    }

    public final boolean h(k09 k09Var) {
        int i = this.g;
        int e = i - this.a.e(k09Var, i, false);
        this.g = e;
        boolean z = e == 0;
        if (z) {
            if (this.f > 0) {
                this.a.b(j(this.h), Arrays.binarySearch(this.l, this.h) >= 0 ? 1 : 0, this.f, 0, null);
            }
            this.h++;
        }
        return z;
    }

    public final long j(int i) {
        return (this.d * i) / this.e;
    }

    public final j42 k(int i) {
        return new j42(this.l[i] * j(1), this.k[i]);
    }
}
