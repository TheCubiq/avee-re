package com.daaw;
/* loaded from: classes.dex */
public final class hc4 implements lk4 {
    public final mk4 a;
    public final bb4 b;
    public final zb4 c;
    public final hc4 d = this;
    public final m08 e;
    public final m08 f;
    public final m08 g;
    public final m08 h;
    public final m08 i;
    public final m08 j;
    public final m08 k;
    public final m08 l;
    public final m08 m;
    public final m08 n;
    public final m08 o;
    public final m08 p;
    public final m08 q;
    public final m08 r;
    public final m08 s;
    public final m08 t;

    public /* synthetic */ hc4(bb4 bb4Var, zb4 zb4Var, rm4 rm4Var, mk4 mk4Var, gc4 gc4Var) {
        m08 m08Var;
        this.b = bb4Var;
        this.c = zb4Var;
        this.a = mk4Var;
        vm4 vm4Var = new vm4(rm4Var);
        this.e = vm4Var;
        sm4 sm4Var = new sm4(rm4Var);
        this.f = sm4Var;
        g08 a = k08.a(0, 2);
        a.a(zb4.U(zb4Var));
        a.a(zb4.e0(zb4Var));
        k08 c = a.c();
        this.g = c;
        m08 b = vz7.b(new or4(c));
        this.h = b;
        g08 a2 = k08.a(4, 3);
        a2.b(zb4.b0(zb4Var));
        a2.b(zb4.m(zb4Var));
        a2.b(zb4.o(zb4Var));
        a2.a(zb4.V(zb4Var));
        a2.a(zb4.t(zb4Var));
        a2.a(zb4.g(zb4Var));
        a2.b(zb4.B(zb4Var));
        k08 c2 = a2.c();
        this.i = c2;
        m08 b2 = vz7.b(new es4(c2));
        this.j = b2;
        tm4 tm4Var = new tm4(rm4Var);
        this.k = tm4Var;
        um4 um4Var = new um4(rm4Var);
        this.l = um4Var;
        fq4 fq4Var = new fq4(sm4Var, tm4Var, zb4.R(zb4Var), um4Var, zb4.z(zb4Var));
        this.m = fq4Var;
        m08 b3 = vz7.b(gv4.a());
        this.n = b3;
        g08 a3 = k08.a(1, 1);
        a3.a(zb4.u(zb4Var));
        a3.b(zb4.h(zb4Var));
        k08 c3 = a3.c();
        this.o = c3;
        is4 is4Var = new is4(c3);
        this.p = is4Var;
        eo4 eo4Var = new eo4(vm4Var, sm4Var, b, b2, zb4.E(zb4Var), fq4Var, b3, is4Var);
        this.q = eo4Var;
        ok4 ok4Var = new ok4(mk4Var);
        this.r = ok4Var;
        nk4 nk4Var = new nk4(mk4Var);
        this.s = nk4Var;
        m08Var = bb4Var.q;
        this.t = vz7.b(new pk4(eo4Var, ok4Var, nk4Var, m08Var));
    }

    @Override // com.daaw.lk4
    public final zi4 zza() {
        kk4 kk4Var = (kk4) this.t.zzb();
        e08.b(kk4Var);
        return kk4Var;
    }
}
