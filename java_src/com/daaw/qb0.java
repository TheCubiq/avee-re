package com.daaw;
/* loaded from: classes.dex */
public final class qb0 implements d81 {
    public final int p;
    public final rb0 q;
    public int r = -1;

    public qb0(rb0 rb0Var, int i) {
        this.q = rb0Var;
        this.p = i;
    }

    @Override // com.daaw.d81
    public void a() {
        if (this.r == -2) {
            throw new c81(this.q.s().a(this.p).a(0).u);
        }
        this.q.K();
    }

    public void b() {
        s6.a(this.r == -1);
        this.r = this.q.w(this.p);
    }

    public final boolean c() {
        int i = this.r;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }

    @Override // com.daaw.d81
    public boolean d() {
        return this.r == -3 || (c() && this.q.H(this.r));
    }

    public void e() {
        if (this.r != -1) {
            this.q.a0(this.p);
            this.r = -1;
        }
    }

    @Override // com.daaw.d81
    public int j(k30 k30Var, gq gqVar, boolean z) {
        if (c()) {
            return this.q.R(this.r, k30Var, gqVar, z);
        }
        return -3;
    }

    @Override // com.daaw.d81
    public int n(long j) {
        if (c()) {
            return this.q.Z(this.r, j);
        }
        return 0;
    }
}
