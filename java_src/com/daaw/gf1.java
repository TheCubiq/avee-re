package com.daaw;
/* loaded from: classes.dex */
public final class gf1 implements ao0 {
    public final zf p;
    public boolean q;
    public long r;
    public long s;
    public zw0 t = zw0.e;

    public gf1(zf zfVar) {
        this.p = zfVar;
    }

    public void a(long j) {
        this.r = j;
        if (this.q) {
            this.s = this.p.b();
        }
    }

    public void b() {
        if (this.q) {
            return;
        }
        this.s = this.p.b();
        this.q = true;
    }

    public void c() {
        if (this.q) {
            a(o());
            this.q = false;
        }
    }

    @Override // com.daaw.ao0
    public zw0 f(zw0 zw0Var) {
        if (this.q) {
            a(o());
        }
        this.t = zw0Var;
        return zw0Var;
    }

    @Override // com.daaw.ao0
    public zw0 h() {
        return this.t;
    }

    @Override // com.daaw.ao0
    public long o() {
        long j = this.r;
        if (this.q) {
            long b = this.p.b() - this.s;
            zw0 zw0Var = this.t;
            return j + (zw0Var.a == 1.0f ? dd.a(b) : zw0Var.a(b));
        }
        return j;
    }
}
