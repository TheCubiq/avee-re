package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class q88 {
    public static final pr8 s = new pr8(new Object());
    public final l64 a;
    public final pr8 b;
    public final long c;
    public final long d;
    public final int e;
    public final vu7 f;
    public final boolean g;
    public final au8 h;
    public final fw8 i;
    public final List j;
    public final pr8 k;
    public final boolean l;
    public final int m;
    public final pp3 n;
    public final boolean o;
    public volatile long p;
    public volatile long q;
    public volatile long r;

    public q88(l64 l64Var, pr8 pr8Var, long j, long j2, int i, vu7 vu7Var, boolean z, au8 au8Var, fw8 fw8Var, List list, pr8 pr8Var2, boolean z2, int i2, pp3 pp3Var, long j3, long j4, long j5, boolean z3) {
        this.a = l64Var;
        this.b = pr8Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = vu7Var;
        this.g = z;
        this.h = au8Var;
        this.i = fw8Var;
        this.j = list;
        this.k = pr8Var2;
        this.l = z2;
        this.m = i2;
        this.n = pp3Var;
        this.p = j3;
        this.q = j4;
        this.r = j5;
        this.o = z3;
    }

    public static q88 g(fw8 fw8Var) {
        l64 l64Var = l64.a;
        pr8 pr8Var = s;
        return new q88(l64Var, pr8Var, -9223372036854775807L, 0L, 1, null, false, au8.d, fw8Var, y17.u(), pr8Var, false, 0, pp3.d, 0L, 0L, 0L, false);
    }

    public static pr8 h() {
        return s;
    }

    public final q88 a(pr8 pr8Var) {
        return new q88(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, pr8Var, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }

    public final q88 b(pr8 pr8Var, long j, long j2, long j3, long j4, au8 au8Var, fw8 fw8Var, List list) {
        return new q88(this.a, pr8Var, j2, j3, this.e, this.f, this.g, au8Var, fw8Var, list, this.k, this.l, this.m, this.n, this.p, j4, j, this.o);
    }

    public final q88 c(boolean z, int i) {
        return new q88(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, this.n, this.p, this.q, this.r, this.o);
    }

    public final q88 d(vu7 vu7Var) {
        return new q88(this.a, this.b, this.c, this.d, this.e, vu7Var, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }

    public final q88 e(int i) {
        return new q88(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }

    public final q88 f(l64 l64Var) {
        return new q88(l64Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q, this.r, this.o);
    }
}
