package com.daaw;
/* loaded from: classes.dex */
public final class qm1 {
    public qr a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public long[] k;
    public boolean[] l;
    public boolean m;
    public boolean[] n;
    public pm1 o;
    public int p;
    public rv0 q;
    public boolean r;
    public long s;

    public void a(a00 a00Var) {
        a00Var.f(this.q.a, 0, this.p);
        this.q.J(0);
        this.r = false;
    }

    public void b(rv0 rv0Var) {
        rv0Var.g(this.q.a, 0, this.p);
        this.q.J(0);
        this.r = false;
    }

    public long c(int i) {
        return this.k[i] + this.j[i];
    }

    public void d(int i) {
        rv0 rv0Var = this.q;
        if (rv0Var == null || rv0Var.d() < i) {
            this.q = new rv0(i);
        }
        this.p = i;
        this.m = true;
        this.r = true;
    }

    public void e(int i, int i2) {
        this.e = i;
        this.f = i2;
        int[] iArr = this.h;
        if (iArr == null || iArr.length < i) {
            this.g = new long[i];
            this.h = new int[i];
        }
        int[] iArr2 = this.i;
        if (iArr2 == null || iArr2.length < i2) {
            int i3 = (i2 * x21.L0) / 100;
            this.i = new int[i3];
            this.j = new int[i3];
            this.k = new long[i3];
            this.l = new boolean[i3];
            this.n = new boolean[i3];
        }
    }

    public void f() {
        this.e = 0;
        this.s = 0L;
        this.m = false;
        this.r = false;
        this.o = null;
    }
}
