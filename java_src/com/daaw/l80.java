package com.daaw;
/* loaded from: classes.dex */
public class l80 extends kx1 {
    public l80(qj qjVar) {
        super(qjVar);
        qjVar.e.f();
        qjVar.f.f();
        this.f = ((k80) qjVar).H0();
    }

    @Override // com.daaw.kx1, com.daaw.zs
    public void a(zs zsVar) {
        ft ftVar = this.h;
        if (ftVar.c && !ftVar.j) {
            this.h.d((int) ((ftVar.l.get(0).g * ((k80) this.b).K0()) + 0.5f));
        }
    }

    @Override // com.daaw.kx1
    public void d() {
        ft ftVar;
        kx1 kx1Var;
        ft ftVar2;
        k80 k80Var = (k80) this.b;
        int I0 = k80Var.I0();
        int J0 = k80Var.J0();
        k80Var.K0();
        if (k80Var.H0() == 1) {
            ft ftVar3 = this.h;
            if (I0 != -1) {
                ftVar3.l.add(this.b.N.e.h);
                this.b.N.e.h.k.add(this.h);
                ftVar2 = this.h;
            } else if (J0 != -1) {
                ftVar3.l.add(this.b.N.e.i);
                this.b.N.e.i.k.add(this.h);
                ftVar2 = this.h;
                I0 = -J0;
            } else {
                ftVar3.b = true;
                ftVar3.l.add(this.b.N.e.i);
                this.b.N.e.i.k.add(this.h);
                q(this.b.e.h);
                kx1Var = this.b.e;
            }
            ftVar2.f = I0;
            q(this.b.e.h);
            kx1Var = this.b.e;
        } else {
            ft ftVar4 = this.h;
            if (I0 != -1) {
                ftVar4.l.add(this.b.N.f.h);
                this.b.N.f.h.k.add(this.h);
                ftVar = this.h;
            } else if (J0 != -1) {
                ftVar4.l.add(this.b.N.f.i);
                this.b.N.f.i.k.add(this.h);
                ftVar = this.h;
                I0 = -J0;
            } else {
                ftVar4.b = true;
                ftVar4.l.add(this.b.N.f.i);
                this.b.N.f.i.k.add(this.h);
                q(this.b.f.h);
                kx1Var = this.b.f;
            }
            ftVar.f = I0;
            q(this.b.f.h);
            kx1Var = this.b.f;
        }
        q(kx1Var.i);
    }

    @Override // com.daaw.kx1
    public void e() {
        if (((k80) this.b).H0() == 1) {
            this.b.C0(this.h.g);
        } else {
            this.b.D0(this.h.g);
        }
    }

    @Override // com.daaw.kx1
    public void f() {
        this.h.c();
    }

    @Override // com.daaw.kx1
    public boolean m() {
        return false;
    }

    public final void q(ft ftVar) {
        this.h.k.add(ftVar);
        ftVar.l.add(this.h);
    }
}
