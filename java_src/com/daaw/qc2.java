package com.daaw;
/* loaded from: classes.dex */
public final class qc2 implements gd2 {
    public f92 a;
    public cr5 b;
    public m42 c;

    public qc2(String str) {
        b72 b72Var = new b72();
        b72Var.s(str);
        this.a = b72Var.y();
    }

    @Override // com.daaw.gd2
    public final void a(ik5 ik5Var) {
        uo4.b(this.b);
        int i = it5.a;
        long d = this.b.d();
        long e = this.b.e();
        if (d == -9223372036854775807L || e == -9223372036854775807L) {
            return;
        }
        f92 f92Var = this.a;
        if (e != f92Var.p) {
            b72 b = f92Var.b();
            b.w(e);
            f92 y = b.y();
            this.a = y;
            this.c.f(y);
        }
        int i2 = ik5Var.i();
        this.c.c(ik5Var, i2);
        this.c.b(d, 1, i2, 0, null);
    }

    @Override // com.daaw.gd2
    public final void b(cr5 cr5Var, m09 m09Var, td2 td2Var) {
        this.b = cr5Var;
        td2Var.c();
        m42 n = m09Var.n(td2Var.a(), 5);
        this.c = n;
        n.f(this.a);
    }
}
