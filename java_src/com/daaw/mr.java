package com.daaw;
/* loaded from: classes.dex */
public final class mr implements ao0 {
    public final gf1 p;
    public final a q;
    public a41 r;
    public ao0 s;

    /* loaded from: classes.dex */
    public interface a {
        void c(zw0 zw0Var);
    }

    public mr(a aVar, zf zfVar) {
        this.q = aVar;
        this.p = new gf1(zfVar);
    }

    public final void a() {
        this.p.a(this.s.o());
        zw0 h = this.s.h();
        if (h.equals(this.p.h())) {
            return;
        }
        this.p.f(h);
        this.q.c(h);
    }

    public final boolean b() {
        a41 a41Var = this.r;
        return (a41Var == null || a41Var.c() || (!this.r.d() && this.r.j())) ? false : true;
    }

    public void c(a41 a41Var) {
        if (a41Var == this.r) {
            this.s = null;
            this.r = null;
        }
    }

    public void d(a41 a41Var) {
        ao0 ao0Var;
        ao0 v = a41Var.v();
        if (v == null || v == (ao0Var = this.s)) {
            return;
        }
        if (ao0Var != null) {
            throw qz.c(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.s = v;
        this.r = a41Var;
        v.f(this.p.h());
        a();
    }

    public void e(long j) {
        this.p.a(j);
    }

    @Override // com.daaw.ao0
    public zw0 f(zw0 zw0Var) {
        ao0 ao0Var = this.s;
        if (ao0Var != null) {
            zw0Var = ao0Var.f(zw0Var);
        }
        this.p.f(zw0Var);
        this.q.c(zw0Var);
        return zw0Var;
    }

    public void g() {
        this.p.b();
    }

    @Override // com.daaw.ao0
    public zw0 h() {
        ao0 ao0Var = this.s;
        return ao0Var != null ? ao0Var.h() : this.p.h();
    }

    public void i() {
        this.p.c();
    }

    public long j() {
        if (b()) {
            a();
            return this.s.o();
        }
        return this.p.o();
    }

    @Override // com.daaw.ao0
    public long o() {
        return b() ? this.s.o() : this.p.o();
    }
}
