package com.daaw;
/* loaded from: classes.dex */
public final class y34 {

    /* renamed from: a */
    public final nx2 f33320a = new nx2(true, 65536);

    /* renamed from: b */
    public long f33321b = 15000000;

    /* renamed from: c */
    public long f33322c = 30000000;

    /* renamed from: d */
    public long f33323d = 2500000;

    /* renamed from: e */
    public long f33324e = 5000000;

    /* renamed from: f */
    public int f33325f;

    /* renamed from: g */
    public boolean f33326g;

    /* renamed from: a */
    public final void m4158a() {
        m4154e(false);
    }

    /* renamed from: b */
    public final void m4157b() {
        m4154e(true);
    }

    /* renamed from: c */
    public final void m4156c() {
        m4154e(true);
    }

    /* renamed from: d */
    public final void m4155d(gq2[] gq2VarArr, rw2 rw2Var, dx2 dx2Var) {
        this.f33325f = 0;
        for (int i = 0; i < 2; i++) {
            if (dx2Var.m23830a(i) != null) {
                this.f33325f += pz2.m12844f(gq2VarArr[i].zzc());
            }
        }
        this.f33320a.m14746f(this.f33325f);
    }

    /* renamed from: e */
    public final void m4154e(boolean z) {
        this.f33325f = 0;
        this.f33326g = false;
        if (z) {
            this.f33320a.m14747e();
        }
    }

    /* renamed from: f */
    public final synchronized void m4153f(int i) {
        this.f33323d = i * 1000;
    }

    /* renamed from: g */
    public final synchronized void m4152g(int i) {
        this.f33324e = i * 1000;
    }

    /* renamed from: h */
    public final synchronized void m4151h(int i) {
        this.f33322c = i * 1000;
    }

    /* renamed from: i */
    public final synchronized void m4150i(int i) {
        this.f33321b = i * 1000;
    }

    /* renamed from: j */
    public final synchronized boolean m4149j(long j) {
        boolean z;
        z = true;
        char c = j > this.f33322c ? (char) 0 : j < this.f33321b ? (char) 2 : (char) 1;
        int m14751a = this.f33320a.m14751a();
        int i = this.f33325f;
        if (c != 2 && (c != 1 || !this.f33326g || m14751a >= i)) {
            z = false;
        }
        this.f33326g = z;
        return z;
    }

    /* renamed from: k */
    public final synchronized boolean m4148k(long j, boolean z) {
        long j2;
        j2 = z ? this.f33324e : this.f33323d;
        return j2 <= 0 || j >= j2;
    }

    /* renamed from: l */
    public final nx2 m4147l() {
        return this.f33320a;
    }
}
