package com.daaw;

import com.daaw.ft;
/* loaded from: classes.dex */
public class ab0 extends kx1 {
    public ab0(qj qjVar) {
        super(qjVar);
    }

    @Override // com.daaw.kx1, com.daaw.zs
    public void a(zs zsVar) {
        ja jaVar = (ja) this.b;
        int I0 = jaVar.I0();
        int i = 0;
        int i2 = -1;
        for (ft ftVar : this.h.l) {
            int i3 = ftVar.g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (I0 == 0 || I0 == 2) {
            this.h.d(i2 + jaVar.J0());
        } else {
            this.h.d(i + jaVar.J0());
        }
    }

    @Override // com.daaw.kx1
    public void d() {
        kx1 kx1Var;
        qj qjVar = this.b;
        if (qjVar instanceof ja) {
            this.h.b = true;
            ja jaVar = (ja) qjVar;
            int I0 = jaVar.I0();
            boolean H0 = jaVar.H0();
            int i = 0;
            if (I0 == 0) {
                this.h.e = ft.a.LEFT;
                while (i < jaVar.x0) {
                    qj qjVar2 = jaVar.w0[i];
                    if (H0 || qjVar2.M() != 8) {
                        ft ftVar = qjVar2.e.h;
                        ftVar.k.add(this.h);
                        this.h.l.add(ftVar);
                    }
                    i++;
                }
            } else if (I0 != 1) {
                if (I0 == 2) {
                    this.h.e = ft.a.TOP;
                    while (i < jaVar.x0) {
                        qj qjVar3 = jaVar.w0[i];
                        if (H0 || qjVar3.M() != 8) {
                            ft ftVar2 = qjVar3.f.h;
                            ftVar2.k.add(this.h);
                            this.h.l.add(ftVar2);
                        }
                        i++;
                    }
                } else if (I0 != 3) {
                    return;
                } else {
                    this.h.e = ft.a.BOTTOM;
                    while (i < jaVar.x0) {
                        qj qjVar4 = jaVar.w0[i];
                        if (H0 || qjVar4.M() != 8) {
                            ft ftVar3 = qjVar4.f.i;
                            ftVar3.k.add(this.h);
                            this.h.l.add(ftVar3);
                        }
                        i++;
                    }
                }
                q(this.b.f.h);
                kx1Var = this.b.f;
                q(kx1Var.i);
            } else {
                this.h.e = ft.a.RIGHT;
                while (i < jaVar.x0) {
                    qj qjVar5 = jaVar.w0[i];
                    if (H0 || qjVar5.M() != 8) {
                        ft ftVar4 = qjVar5.e.i;
                        ftVar4.k.add(this.h);
                        this.h.l.add(ftVar4);
                    }
                    i++;
                }
            }
            q(this.b.e.h);
            kx1Var = this.b.e;
            q(kx1Var.i);
        }
    }

    @Override // com.daaw.kx1
    public void e() {
        qj qjVar = this.b;
        if (qjVar instanceof ja) {
            int I0 = ((ja) qjVar).I0();
            if (I0 == 0 || I0 == 1) {
                this.b.C0(this.h.g);
            } else {
                this.b.D0(this.h.g);
            }
        }
    }

    @Override // com.daaw.kx1
    public void f() {
        this.c = null;
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
