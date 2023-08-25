package com.daaw;

import android.graphics.RectF;
import com.daaw.avee.R;
import com.daaw.vv;
/* loaded from: classes.dex */
public class iq0 extends tv {
    public static final String[] M = {"composition:0"};
    public static final String[] N = {"Horizontal", "Vertical", "HorizontalAndVertical"};
    public int G;
    public vv H;
    public int I;
    public boolean J;
    public final pr1 K;
    public g0<y31, sr1, w31> L;

    /* loaded from: classes.dex */
    public class a implements vv.b {
        public a() {
        }

        @Override // com.daaw.vv.b
        public void a() {
            iq0.this.m();
        }
    }

    /* loaded from: classes.dex */
    public class b implements g0<y31, sr1, w31> {
        public b() {
        }

        @Override // com.daaw.g0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.E("u_projView", false, iq0.this.K.a());
        }
    }

    public iq0() {
        super(4, 1.0f, 1.0f);
        this.G = -1;
        this.I = 0;
        this.J = false;
        this.K = new pr1();
        this.L = new b();
        J(4);
        R(1.0f, 1.0f);
        this.H = new vv(new a(), null, null, null);
        f0("composition:1");
    }

    @Override // com.daaw.tv
    public void B(y31 y31Var, e40 e40Var) {
        w31 w31Var;
        tc j;
        float centerX;
        float centerY;
        float f;
        float centerY2;
        float f2;
        float f3;
        float centerX2;
        float f4;
        float f5;
        int i;
        de0 de0Var;
        this.H.u(y31Var, e40Var);
        super.B(y31Var, e40Var);
        RectF n = n(y31Var.b().a());
        b(y31Var, this.K, n.centerX(), n.centerY(), s(y31Var.b().a()));
        bs1 bs1Var = new bs1(0.0f, 0.0f);
        bs1 bs1Var2 = new bs1(1.0f, 0.0f);
        qr1 t = y31Var.u.t();
        w31 w31Var2 = new w31(f(), this.H.m(y31Var), t, this.L);
        int i2 = this.I;
        if (i2 == 0) {
            float centerX3 = n.centerX();
            if (this.J) {
                bs1Var.a = 0.0f;
            } else {
                bs1Var.a = 1.0f;
            }
            bs1Var.b = 1.0f;
            bs1Var2.a = 0.5f;
            bs1Var2.b = 0.0f;
            tc j2 = y31Var.j();
            float f6 = n.left;
            float f7 = n.top;
            float f8 = n.bottom;
            w31Var = w31Var2;
            j2.l(y31Var, f6, f7, centerX3, f7, centerX3, f8, f6, f8, 0.0f, this.G, bs1Var, bs1Var2, w31Var);
            boolean z = this.J;
            bs1Var.a = 0.5f;
            bs1Var.b = 1.0f;
            if (z) {
                bs1Var2.a = 0.0f;
            } else {
                bs1Var2.a = 1.0f;
            }
            bs1Var2.b = 0.0f;
            j = y31Var.j();
            centerY2 = n.top;
            f2 = n.right;
            f4 = n.bottom;
            f5 = 0.0f;
            i = this.G;
            de0Var = y31Var;
            centerX = centerX3;
            centerY = centerY2;
            f = f2;
            f3 = f4;
            centerX2 = centerX3;
        } else {
            w31Var = w31Var2;
            if (i2 == 1) {
                boolean z2 = this.J;
                bs1Var.a = 0.0f;
                if (z2) {
                    bs1Var.b = 0.0f;
                } else {
                    bs1Var.b = 1.0f;
                }
                bs1Var2.a = 1.0f;
                bs1Var2.b = 0.5f;
                tc j3 = y31Var.j();
                float f9 = n.left;
                float f10 = n.top;
                float f11 = n.right;
                j3.l(y31Var, f9, f10, f11, f10, f11, n.centerY(), n.left, n.centerY(), 0.0f, this.G, bs1Var, bs1Var2, w31Var);
                boolean z3 = this.J;
                bs1Var.a = 0.0f;
                bs1Var.b = 0.5f;
                bs1Var2.a = 1.0f;
                if (z3) {
                    bs1Var2.b = 0.0f;
                } else {
                    bs1Var2.b = 1.0f;
                }
                j = y31Var.j();
                centerX = n.left;
                centerY = n.centerY();
                f = n.right;
                centerY2 = n.centerY();
                f2 = n.right;
                f4 = n.bottom;
                centerX2 = n.left;
                f5 = 0.0f;
                i = this.G;
                de0Var = y31Var;
                f3 = f4;
            } else if (i2 != 2) {
                return;
            } else {
                if (this.J) {
                    bs1Var.a = 0.0f;
                } else {
                    bs1Var.a = 1.0f;
                }
                bs1Var.b = 1.0f;
                bs1Var2.a = 0.5f;
                bs1Var2.b = 0.5f;
                y31Var.j().l(y31Var, n.left, n.top, n.centerX(), n.top, n.centerX(), n.centerY(), n.left, n.centerY(), 0.0f, this.G, bs1Var, bs1Var2, w31Var);
                boolean z4 = this.J;
                bs1Var.a = 0.5f;
                bs1Var.b = 1.0f;
                if (z4) {
                    bs1Var2.a = 0.0f;
                } else {
                    bs1Var2.a = 1.0f;
                }
                bs1Var2.b = 0.5f;
                tc j4 = y31Var.j();
                float centerX4 = n.centerX();
                float f12 = n.top;
                float f13 = n.right;
                j4.l(y31Var, centerX4, f12, f13, f12, f13, n.centerY(), n.centerX(), n.centerY(), 0.0f, this.G, bs1Var, bs1Var2, w31Var);
                if (this.J) {
                    bs1Var.a = 0.0f;
                } else {
                    bs1Var.a = 1.0f;
                }
                bs1Var.b = 0.5f;
                bs1Var2.a = 0.5f;
                bs1Var2.b = 1.0f;
                tc j5 = y31Var.j();
                float f14 = n.left;
                float centerY3 = n.centerY();
                float centerX5 = n.centerX();
                float centerY4 = n.centerY();
                float centerX6 = n.centerX();
                float f15 = n.bottom;
                j5.l(y31Var, f14, centerY3, centerX5, centerY4, centerX6, f15, n.left, f15, 0.0f, this.G, bs1Var, bs1Var2, w31Var);
                boolean z5 = this.J;
                bs1Var.a = 0.5f;
                bs1Var.b = 0.5f;
                if (z5) {
                    bs1Var2.a = 0.0f;
                } else {
                    bs1Var2.a = 1.0f;
                }
                bs1Var2.b = 1.0f;
                j = y31Var.j();
                centerX = n.centerX();
                centerY = n.centerY();
                f = n.right;
                centerY2 = n.centerY();
                f2 = n.right;
                f3 = n.bottom;
                centerX2 = n.centerX();
                f4 = n.bottom;
                f5 = 0.0f;
                i = this.G;
                de0Var = y31Var;
            }
        }
        j.l(de0Var, centerX, centerY, f, centerY2, f2, f3, centerX2, f4, f5, i, bs1Var, bs1Var2, w31Var);
    }

    public boolean Z() {
        return this.J;
    }

    public int a0() {
        return this.I;
    }

    public String b0() {
        return this.H.j();
    }

    public void c0(int i) {
        this.G = i;
    }

    public void d0(boolean z) {
        this.J = z;
    }

    public void e0(int i) {
        this.I = i;
    }

    public void f0(String str) {
        this.H.C(str);
    }

    @Override // com.daaw.tv
    public String h() {
        return "MirrorEffect";
    }

    @Override // com.daaw.tv
    public void l() {
        super.l();
        vv vvVar = this.H;
        if (vvVar != null) {
            vvVar.p();
        }
    }

    @Override // com.daaw.tv
    public void t(un unVar) {
        super.t(unVar);
        super.u(unVar);
        f0(unVar.w("TargetImage", "composition:1"));
        String[] strArr = N;
        e0(br1.e(strArr, unVar.u("mirrorMode", strArr[0])));
        d0(unVar.n("flipMirror", false));
        c0(unVar.r("color", -1));
    }

    @Override // com.daaw.tv
    public boolean v(y31 y31Var) {
        this.H.q(y31Var, q(y31Var.u.b), 0);
        return super.v(y31Var);
    }

    @Override // com.daaw.tv
    public void w(y31 y31Var, int i) {
        this.H.r(y31Var, i);
        super.w(y31Var, i);
    }

    @Override // com.daaw.tv
    public void x(y31 y31Var) {
        super.x(y31Var);
        vv vvVar = this.H;
        if (vvVar != null) {
            vvVar.s(y31Var);
        }
    }

    @Override // com.daaw.tv
    public void y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.y(de0Var, e40Var, vc0Var);
        this.H.t(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.tv
    public void z(un unVar, od0 od0Var) {
        super.z(unVar, od0Var);
        super.A(unVar);
        unVar.p0(j(R.string.title_mirror_effect));
        od0Var.a(b0());
        unVar.f0("TargetImage", b0(), "1_appearance", M);
        String[] strArr = N;
        unVar.m0("mirrorMode", br1.a(strArr, a0(), strArr[0]), "1_appearance", strArr);
        unVar.L("flipMirror", Z(), "1_appearance");
        unVar.T("color", this.G, "1_appearance");
    }
}
