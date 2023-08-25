package com.daaw;

import com.daaw.da1;
/* loaded from: classes.dex */
public final class fw1 implements da1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public long g;
    public long h;

    public fw1(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public int a() {
        return this.b * this.e * this.a;
    }

    public long b(long j) {
        return (Math.max(0L, j - this.g) * 1000000) / this.c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.f;
    }

    @Override // com.daaw.da1
    public boolean e() {
        return true;
    }

    public int f() {
        return this.a;
    }

    @Override // com.daaw.da1
    public da1.a g(long j) {
        int i = this.d;
        long m = sq1.m((((this.c * j) / 1000000) / i) * i, 0L, this.h - i);
        long j2 = this.g + m;
        long b = b(j2);
        fa1 fa1Var = new fa1(b, j2);
        if (b < j) {
            long j3 = this.h;
            int i2 = this.d;
            if (m != j3 - i2) {
                long j4 = j2 + i2;
                return new da1.a(fa1Var, new fa1(b(j4), j4));
            }
        }
        return new da1.a(fa1Var);
    }

    @Override // com.daaw.da1
    public long h() {
        return ((this.h / this.d) * 1000000) / this.b;
    }

    public int i() {
        return this.b;
    }

    public boolean j() {
        return (this.g == 0 || this.h == 0) ? false : true;
    }

    public void k(long j, long j2) {
        this.g = j;
        this.h = j2;
    }
}
