package com.daaw;
/* loaded from: classes.dex */
public class l80 extends kx1 {
    public l80(C2716qj c2716qj) {
        super(c2716qj);
        c2716qj.f24023e.mo10449f();
        c2716qj.f24025f.mo10449f();
        this.f16809f = ((k80) c2716qj).m17981H0();
    }

    @Override // com.daaw.kx1, com.daaw.InterfaceC3891zs
    /* renamed from: a */
    public void mo1956a(InterfaceC3891zs interfaceC3891zs) {
        C1325ft c1325ft = this.f16811h;
        if (c1325ft.f9864c && !c1325ft.f9871j) {
            this.f16811h.mo13161d((int) ((c1325ft.f9873l.get(0).f9868g * ((k80) this.f16805b).m17978K0()) + 0.5f));
        }
    }

    @Override // com.daaw.kx1
    /* renamed from: d */
    public void mo10451d() {
        C1325ft c1325ft;
        kx1 kx1Var;
        C1325ft c1325ft2;
        k80 k80Var = (k80) this.f16805b;
        int m17980I0 = k80Var.m17980I0();
        int m17979J0 = k80Var.m17979J0();
        k80Var.m17978K0();
        if (k80Var.m17981H0() == 1) {
            C1325ft c1325ft3 = this.f16811h;
            if (m17980I0 != -1) {
                c1325ft3.f9873l.add(this.f16805b.f24002N.f24023e.f16811h);
                this.f16805b.f24002N.f24023e.f16811h.f9872k.add(this.f16811h);
                c1325ft2 = this.f16811h;
            } else if (m17979J0 != -1) {
                c1325ft3.f9873l.add(this.f16805b.f24002N.f24023e.f16812i);
                this.f16805b.f24002N.f24023e.f16812i.f9872k.add(this.f16811h);
                c1325ft2 = this.f16811h;
                m17980I0 = -m17979J0;
            } else {
                c1325ft3.f9863b = true;
                c1325ft3.f9873l.add(this.f16805b.f24002N.f24023e.f16812i);
                this.f16805b.f24002N.f24023e.f16812i.f9872k.add(this.f16811h);
                m17108q(this.f16805b.f24023e.f16811h);
                kx1Var = this.f16805b.f24023e;
            }
            c1325ft2.f9867f = m17980I0;
            m17108q(this.f16805b.f24023e.f16811h);
            kx1Var = this.f16805b.f24023e;
        } else {
            C1325ft c1325ft4 = this.f16811h;
            if (m17980I0 != -1) {
                c1325ft4.f9873l.add(this.f16805b.f24002N.f24025f.f16811h);
                this.f16805b.f24002N.f24025f.f16811h.f9872k.add(this.f16811h);
                c1325ft = this.f16811h;
            } else if (m17979J0 != -1) {
                c1325ft4.f9873l.add(this.f16805b.f24002N.f24025f.f16812i);
                this.f16805b.f24002N.f24025f.f16812i.f9872k.add(this.f16811h);
                c1325ft = this.f16811h;
                m17980I0 = -m17979J0;
            } else {
                c1325ft4.f9863b = true;
                c1325ft4.f9873l.add(this.f16805b.f24002N.f24025f.f16812i);
                this.f16805b.f24002N.f24025f.f16812i.f9872k.add(this.f16811h);
                m17108q(this.f16805b.f24025f.f16811h);
                kx1Var = this.f16805b.f24025f;
            }
            c1325ft.f9867f = m17980I0;
            m17108q(this.f16805b.f24025f.f16811h);
            kx1Var = this.f16805b.f24025f;
        }
        m17108q(kx1Var.f16812i);
    }

    @Override // com.daaw.kx1
    /* renamed from: e */
    public void mo10450e() {
        if (((k80) this.f16805b).m17981H0() == 1) {
            this.f16805b.m12464C0(this.f16811h.f9868g);
        } else {
            this.f16805b.m12462D0(this.f16811h.f9868g);
        }
    }

    @Override // com.daaw.kx1
    /* renamed from: f */
    public void mo10449f() {
        this.f16811h.m22310c();
    }

    @Override // com.daaw.kx1
    /* renamed from: m */
    public boolean mo10447m() {
        return false;
    }

    /* renamed from: q */
    public final void m17108q(C1325ft c1325ft) {
        this.f16811h.f9872k.add(c1325ft);
        c1325ft.f9873l.add(this.f16811h);
    }
}
