package com.daaw;

import com.daaw.C1325ft;
/* loaded from: classes.dex */
public class ab0 extends kx1 {
    public ab0(C2716qj c2716qj) {
        super(c2716qj);
    }

    @Override // com.daaw.kx1, com.daaw.InterfaceC3891zs
    /* renamed from: a */
    public void mo1956a(InterfaceC3891zs interfaceC3891zs) {
        C1815ja c1815ja = (C1815ja) this.f16805b;
        int m18698I0 = c1815ja.m18698I0();
        int i = 0;
        int i2 = -1;
        for (C1325ft c1325ft : this.f16811h.f9873l) {
            int i3 = c1325ft.f9868g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (m18698I0 == 0 || m18698I0 == 2) {
            this.f16811h.mo13161d(i2 + c1815ja.m18697J0());
        } else {
            this.f16811h.mo13161d(i + c1815ja.m18697J0());
        }
    }

    @Override // com.daaw.kx1
    /* renamed from: d */
    public void mo10451d() {
        kx1 kx1Var;
        C2716qj c2716qj = this.f16805b;
        if (c2716qj instanceof C1815ja) {
            this.f16811h.f9863b = true;
            C1815ja c1815ja = (C1815ja) c2716qj;
            int m18698I0 = c1815ja.m18698I0();
            boolean m18699H0 = c1815ja.m18699H0();
            int i = 0;
            if (m18698I0 == 0) {
                this.f16811h.f9866e = C1325ft.EnumC1326a.LEFT;
                while (i < c1815ja.f4591x0) {
                    C2716qj c2716qj2 = c1815ja.f4590w0[i];
                    if (m18699H0 || c2716qj2.m12451M() != 8) {
                        C1325ft c1325ft = c2716qj2.f24023e.f16811h;
                        c1325ft.f9872k.add(this.f16811h);
                        this.f16811h.f9873l.add(c1325ft);
                    }
                    i++;
                }
            } else if (m18698I0 != 1) {
                if (m18698I0 == 2) {
                    this.f16811h.f9866e = C1325ft.EnumC1326a.TOP;
                    while (i < c1815ja.f4591x0) {
                        C2716qj c2716qj3 = c1815ja.f4590w0[i];
                        if (m18699H0 || c2716qj3.m12451M() != 8) {
                            C1325ft c1325ft2 = c2716qj3.f24025f.f16811h;
                            c1325ft2.f9872k.add(this.f16811h);
                            this.f16811h.f9873l.add(c1325ft2);
                        }
                        i++;
                    }
                } else if (m18698I0 != 3) {
                    return;
                } else {
                    this.f16811h.f9866e = C1325ft.EnumC1326a.BOTTOM;
                    while (i < c1815ja.f4591x0) {
                        C2716qj c2716qj4 = c1815ja.f4590w0[i];
                        if (m18699H0 || c2716qj4.m12451M() != 8) {
                            C1325ft c1325ft3 = c2716qj4.f24025f.f16812i;
                            c1325ft3.f9872k.add(this.f16811h);
                            this.f16811h.f9873l.add(c1325ft3);
                        }
                        i++;
                    }
                }
                m27541q(this.f16805b.f24025f.f16811h);
                kx1Var = this.f16805b.f24025f;
                m27541q(kx1Var.f16812i);
            } else {
                this.f16811h.f9866e = C1325ft.EnumC1326a.RIGHT;
                while (i < c1815ja.f4591x0) {
                    C2716qj c2716qj5 = c1815ja.f4590w0[i];
                    if (m18699H0 || c2716qj5.m12451M() != 8) {
                        C1325ft c1325ft4 = c2716qj5.f24023e.f16812i;
                        c1325ft4.f9872k.add(this.f16811h);
                        this.f16811h.f9873l.add(c1325ft4);
                    }
                    i++;
                }
            }
            m27541q(this.f16805b.f24023e.f16811h);
            kx1Var = this.f16805b.f24023e;
            m27541q(kx1Var.f16812i);
        }
    }

    @Override // com.daaw.kx1
    /* renamed from: e */
    public void mo10450e() {
        C2716qj c2716qj = this.f16805b;
        if (c2716qj instanceof C1815ja) {
            int m18698I0 = ((C1815ja) c2716qj).m18698I0();
            if (m18698I0 == 0 || m18698I0 == 1) {
                this.f16805b.m12464C0(this.f16811h.f9868g);
            } else {
                this.f16805b.m12462D0(this.f16811h.f9868g);
            }
        }
    }

    @Override // com.daaw.kx1
    /* renamed from: f */
    public void mo10449f() {
        this.f16806c = null;
        this.f16811h.m22310c();
    }

    @Override // com.daaw.kx1
    /* renamed from: m */
    public boolean mo10447m() {
        return false;
    }

    /* renamed from: q */
    public final void m27541q(C1325ft c1325ft) {
        this.f16811h.f9872k.add(c1325ft);
        c1325ft.f9873l.add(this.f16811h);
    }
}
