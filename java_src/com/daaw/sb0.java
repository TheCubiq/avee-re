package com.daaw;

import com.daaw.ft;
import com.daaw.kx1;
import com.daaw.lj;
import com.daaw.qj;
import java.util.List;
/* loaded from: classes.dex */
public class sb0 extends kx1 {
    public static int[] k = new int[2];

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[kx1.b.values().length];
            a = iArr;
            try {
                iArr[kx1.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[kx1.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[kx1.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public sb0(qj qjVar) {
        super(qjVar);
        this.h.e = ft.a.LEFT;
        this.i.e = ft.a.RIGHT;
        this.f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0295, code lost:
        if (r14 != 1) goto L130;
     */
    @Override // com.daaw.kx1, com.daaw.zs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.daaw.zs r17) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.sb0.a(com.daaw.zs):void");
    }

    @Override // com.daaw.kx1
    public void d() {
        qj E;
        ft ftVar;
        ft ftVar2;
        int O;
        ft ftVar3;
        lj ljVar;
        List<zs> list;
        zs zsVar;
        ft ftVar4;
        ft ftVar5;
        ft ftVar6;
        int O2;
        ft ftVar7;
        ft ftVar8;
        int i;
        qj E2;
        qj qjVar = this.b;
        if (qjVar.a) {
            this.e.d(qjVar.N());
        }
        if (this.e.j) {
            qj.b bVar = this.d;
            qj.b bVar2 = qj.b.MATCH_PARENT;
            if (bVar == bVar2 && (((E = this.b.E()) != null && E.w() == qj.b.FIXED) || E.w() == bVar2)) {
                b(this.h, E.e.h, this.b.B.b());
                b(this.i, E.e.i, -this.b.D.b());
                return;
            }
        } else {
            qj.b w = this.b.w();
            this.d = w;
            if (w != qj.b.MATCH_CONSTRAINT) {
                qj.b bVar3 = qj.b.MATCH_PARENT;
                if (w == bVar3 && (((E2 = this.b.E()) != null && E2.w() == qj.b.FIXED) || E2.w() == bVar3)) {
                    int N = (E2.N() - this.b.B.b()) - this.b.D.b();
                    b(this.h, E2.e.h, this.b.B.b());
                    b(this.i, E2.e.i, -this.b.D.b());
                    this.e.d(N);
                    return;
                } else if (this.d == qj.b.FIXED) {
                    this.e.d(this.b.N());
                }
            }
        }
        pt ptVar = this.e;
        if (ptVar.j) {
            qj qjVar2 = this.b;
            if (qjVar2.a) {
                lj[] ljVarArr = qjVar2.J;
                if (ljVarArr[0].d != null && ljVarArr[1].d != null) {
                    if (qjVar2.T()) {
                        this.h.f = this.b.J[0].b();
                        ftVar3 = this.i;
                        ljVar = this.b.J[1];
                        ftVar3.f = -ljVar.b();
                        return;
                    }
                    ft h = h(this.b.J[0]);
                    if (h != null) {
                        b(this.h, h, this.b.J[0].b());
                    }
                    ft h2 = h(this.b.J[1]);
                    if (h2 != null) {
                        b(this.i, h2, -this.b.J[1].b());
                    }
                    this.h.b = true;
                    this.i.b = true;
                    return;
                }
                if (ljVarArr[0].d != null) {
                    ftVar5 = h(ljVarArr[0]);
                    if (ftVar5 == null) {
                        return;
                    }
                    ftVar6 = this.h;
                    O2 = this.b.J[0].b();
                } else if (ljVarArr[1].d != null) {
                    ft h3 = h(ljVarArr[1]);
                    if (h3 != null) {
                        b(this.i, h3, -this.b.J[1].b());
                        ftVar7 = this.h;
                        ftVar8 = this.i;
                        i = -this.e.g;
                        b(ftVar7, ftVar8, i);
                        return;
                    }
                    return;
                } else if ((qjVar2 instanceof za0) || qjVar2.E() == null || this.b.k(lj.b.CENTER).d != null) {
                    return;
                } else {
                    ftVar5 = this.b.E().e.h;
                    ftVar6 = this.h;
                    O2 = this.b.O();
                }
                b(ftVar6, ftVar5, O2);
                ftVar7 = this.i;
                ftVar8 = this.h;
                i = this.e.g;
                b(ftVar7, ftVar8, i);
                return;
            }
        }
        if (this.d == qj.b.MATCH_CONSTRAINT) {
            qj qjVar3 = this.b;
            int i2 = qjVar3.l;
            if (i2 == 2) {
                qj E3 = qjVar3.E();
                if (E3 != null) {
                    pt ptVar2 = E3.f.e;
                    this.e.l.add(ptVar2);
                    ptVar2.k.add(this.e);
                    pt ptVar3 = this.e;
                    ptVar3.b = true;
                    ptVar3.k.add(this.h);
                    list = this.e.k;
                    zsVar = this.i;
                    list.add(zsVar);
                }
            } else if (i2 == 3) {
                if (qjVar3.m == 3) {
                    this.h.a = this;
                    this.i.a = this;
                    ms1 ms1Var = qjVar3.f;
                    ms1Var.h.a = this;
                    ms1Var.i.a = this;
                    ptVar.a = this;
                    if (qjVar3.V()) {
                        this.e.l.add(this.b.f.e);
                        this.b.f.e.k.add(this.e);
                        ms1 ms1Var2 = this.b.f;
                        ms1Var2.e.a = this;
                        this.e.l.add(ms1Var2.h);
                        this.e.l.add(this.b.f.i);
                        this.b.f.h.k.add(this.e);
                        list = this.b.f.i.k;
                        zsVar = this.e;
                        list.add(zsVar);
                    } else if (this.b.T()) {
                        this.b.f.e.l.add(this.e);
                        list = this.e.k;
                        zsVar = this.b.f.e;
                        list.add(zsVar);
                    } else {
                        ftVar4 = this.b.f.e;
                    }
                } else {
                    pt ptVar4 = qjVar3.f.e;
                    ptVar.l.add(ptVar4);
                    ptVar4.k.add(this.e);
                    this.b.f.h.k.add(this.e);
                    this.b.f.i.k.add(this.e);
                    pt ptVar5 = this.e;
                    ptVar5.b = true;
                    ptVar5.k.add(this.h);
                    this.e.k.add(this.i);
                    this.h.l.add(this.e);
                    ftVar4 = this.i;
                }
                list = ftVar4.l;
                zsVar = this.e;
                list.add(zsVar);
            }
            ftVar3.f = -ljVar.b();
            return;
        }
        qj qjVar4 = this.b;
        lj[] ljVarArr2 = qjVar4.J;
        if (ljVarArr2[0].d != null && ljVarArr2[1].d != null) {
            if (qjVar4.T()) {
                this.h.f = this.b.J[0].b();
                ftVar3 = this.i;
                ljVar = this.b.J[1];
                ftVar3.f = -ljVar.b();
                return;
            }
            ft h4 = h(this.b.J[0]);
            ft h5 = h(this.b.J[1]);
            h4.b(this);
            h5.b(this);
            this.j = kx1.b.CENTER;
            return;
        }
        if (ljVarArr2[0].d != null) {
            ftVar = h(ljVarArr2[0]);
            if (ftVar == null) {
                return;
            }
            ftVar2 = this.h;
            O = this.b.J[0].b();
        } else if (ljVarArr2[1].d != null) {
            ft h6 = h(ljVarArr2[1]);
            if (h6 != null) {
                b(this.i, h6, -this.b.J[1].b());
                c(this.h, this.i, -1, this.e);
                return;
            }
            return;
        } else if ((qjVar4 instanceof za0) || qjVar4.E() == null) {
            return;
        } else {
            ftVar = this.b.E().e.h;
            ftVar2 = this.h;
            O = this.b.O();
        }
        b(ftVar2, ftVar, O);
        c(this.i, this.h, 1, this.e);
    }

    @Override // com.daaw.kx1
    public void e() {
        ft ftVar = this.h;
        if (ftVar.j) {
            this.b.C0(ftVar.g);
        }
    }

    @Override // com.daaw.kx1
    public void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // com.daaw.kx1
    public boolean m() {
        return this.d != qj.b.MATCH_CONSTRAINT || this.b.l == 0;
    }

    public final void q(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else if (i5 != 1) {
                return;
            } else {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public void r() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.e.j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.b.p();
    }
}
