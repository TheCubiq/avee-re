package com.daaw;
/* loaded from: classes.dex */
public final class y34 {
    public final nx2 a = new nx2(true, 65536);
    public long b = 15000000;
    public long c = 30000000;
    public long d = 2500000;
    public long e = 5000000;
    public int f;
    public boolean g;

    public final void a() {
        e(false);
    }

    public final void b() {
        e(true);
    }

    public final void c() {
        e(true);
    }

    public final void d(gq2[] gq2VarArr, rw2 rw2Var, dx2 dx2Var) {
        this.f = 0;
        for (int i = 0; i < 2; i++) {
            if (dx2Var.a(i) != null) {
                this.f += pz2.f(gq2VarArr[i].zzc());
            }
        }
        this.a.f(this.f);
    }

    public final void e(boolean z) {
        this.f = 0;
        this.g = false;
        if (z) {
            this.a.e();
        }
    }

    public final synchronized void f(int i) {
        this.d = i * 1000;
    }

    public final synchronized void g(int i) {
        this.e = i * 1000;
    }

    public final synchronized void h(int i) {
        this.c = i * 1000;
    }

    public final synchronized void i(int i) {
        this.b = i * 1000;
    }

    public final synchronized boolean j(long j) {
        boolean z;
        z = true;
        char c = j > this.c ? (char) 0 : j < this.b ? (char) 2 : (char) 1;
        int a = this.a.a();
        int i = this.f;
        if (c != 2 && (c != 1 || !this.g || a >= i)) {
            z = false;
        }
        this.g = z;
        return z;
    }

    public final synchronized boolean k(long j, boolean z) {
        long j2;
        j2 = z ? this.e : this.d;
        return j2 <= 0 || j >= j2;
    }

    public final nx2 l() {
        return this.a;
    }
}
