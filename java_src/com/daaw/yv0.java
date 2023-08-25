package com.daaw;

import android.graphics.RectF;
import com.daaw.avee.R;
import com.daaw.vv;
/* loaded from: classes.dex */
public class yv0 extends tv {
    public static final String[] r0 = {"internalres:particle_blur01", "internalres:particle_circle_blur4", "internalres:particle_circle_w_a_64", "internalres:particle_sharp", "composition:0"};
    public static final String[] s0 = {"internalres:particle_blur01", "internalres:particle_circle_blur4", "internalres:particle_circle_w_a_64", "internalres:particle_sharp", "internalres:snowflake", "internalres:year2018", "composition:0"};
    public int G;
    public zd0[] H;
    public float I;
    public pc0 J;
    public float K;
    public ae0 L;
    public int M;
    public float N;
    public float O;
    public xn0 P;
    public xn0 Q;
    public boolean R;
    public boolean S;
    public qd0 T;
    public float U;
    public float V;
    public z6 W;
    public ds1 X;
    public ds1 Y;
    public bs1 Z;
    public bs1 a0;
    public bs1 b0;
    public bs1 c0;
    public bs1 d0;
    public float[] e0;
    public final float[] f0;
    public float g0;
    public float h0;
    public final float i0;
    public vv j0;
    public final pr1 k0;
    public float l0;
    public g0<y31, sr1, w31> m0;
    public t40<Integer, float[], float[], Boolean> n0;
    public t40<Integer, float[], int[], Boolean> o0;
    public t40<Integer, float[], int[], Boolean> p0;
    public t40<Integer, float[], int[], Boolean> q0;

    /* loaded from: classes.dex */
    public class a implements vv.b {
        public a() {
        }

        @Override // com.daaw.vv.b
        public void a() {
            yv0.this.m();
        }
    }

    /* loaded from: classes.dex */
    public class b implements g0<y31, sr1, w31> {
        public b() {
        }

        @Override // com.daaw.g0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.E("u_projView", false, yv0.this.k0.a());
        }
    }

    /* loaded from: classes.dex */
    public class c implements t40<Integer, float[], int[], Boolean> {
        public final /* synthetic */ RectF a;
        public final /* synthetic */ y31 b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;
        public final /* synthetic */ float e;
        public final /* synthetic */ float f;
        public final /* synthetic */ bs1 g;
        public final /* synthetic */ float h;

        public c(RectF rectF, y31 y31Var, float f, float f2, float f3, float f4, bs1 bs1Var, float f5) {
            this.a = rectF;
            this.b = y31Var;
            this.c = f;
            this.d = f2;
            this.e = f3;
            this.f = f4;
            this.g = bs1Var;
            this.h = f5;
        }

        @Override // com.daaw.t40
        /* renamed from: a */
        public Boolean j(Integer num, float[] fArr, int[] iArr) {
            float f;
            if (yv0.this.H[num.intValue()].e()) {
                if (yv0.this.T != null) {
                    ds1 position = yv0.this.H[num.intValue()].getPosition();
                    f = yv0.this.T.p(position.a - this.a.centerX(), position.b - this.a.centerY(), yv0.this.b0);
                } else {
                    f = 0.0f;
                }
                if (yv0.this.H[num.intValue()].d(this.b.E(), this.c, yv0.this.Z, yv0.this.a0, this.d, this.e, yv0.this.b0, f, this.f, this.g, yv0.this.k0, this.h)) {
                    if (!this.b.L(yv0.this.Z, Math.max(yv0.this.a0.a, yv0.this.a0.b))) {
                        yv0.this.H[num.intValue()].setVisible(false);
                        return Boolean.FALSE;
                    }
                    yv0.this.H[num.intValue()].setVisible(true);
                    yv0.this.H[num.intValue()].f(this.b.E());
                    f80.d(yv0.this.e0, yv0.this.H[num.intValue()].a(), yv0.this.f0);
                    iArr[0] = f80.g(yv0.this.e0, 0);
                    ds1 position2 = yv0.this.H[num.intValue()].getPosition();
                    yv0 yv0Var = yv0.this;
                    yv0Var.k0(yv0Var.H[num.intValue()], position2.a, position2.b, position2.c, yv0.this.H[num.intValue()].g(), fArr);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes.dex */
    public class d implements t40<Integer, float[], float[], Boolean> {
        public d() {
        }

        @Override // com.daaw.t40
        /* renamed from: a */
        public Boolean j(Integer num, float[] fArr, float[] fArr2) {
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes.dex */
    public class e implements t40<Integer, float[], int[], Boolean> {
        public e() {
        }

        @Override // com.daaw.t40
        /* renamed from: a */
        public Boolean j(Integer num, float[] fArr, int[] iArr) {
            ds1 position = yv0.this.H[num.intValue()].getPosition();
            yv0 yv0Var = yv0.this;
            zd0 zd0Var = yv0Var.H[num.intValue()];
            yv0 yv0Var2 = yv0.this;
            float f = yv0Var2.g0;
            yv0Var.k0(zd0Var, f + (f - position.a), position.b, position.c, -yv0Var2.H[num.intValue()].g(), fArr);
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public class f implements t40<Integer, float[], int[], Boolean> {
        public f() {
        }

        @Override // com.daaw.t40
        /* renamed from: a */
        public Boolean j(Integer num, float[] fArr, int[] iArr) {
            ds1 position = yv0.this.H[num.intValue()].getPosition();
            yv0 yv0Var = yv0.this;
            zd0 zd0Var = yv0Var.H[num.intValue()];
            float f = position.a;
            yv0 yv0Var2 = yv0.this;
            float f2 = yv0Var2.h0;
            yv0Var.k0(zd0Var, f, f2 + (f2 - position.b), position.c, -yv0Var2.H[num.intValue()].g(), fArr);
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes.dex */
    public class g implements t40<Integer, float[], int[], Boolean> {
        public g() {
        }

        @Override // com.daaw.t40
        /* renamed from: a */
        public Boolean j(Integer num, float[] fArr, int[] iArr) {
            ds1 position = yv0.this.H[num.intValue()].getPosition();
            yv0 yv0Var = yv0.this;
            zd0 zd0Var = yv0Var.H[num.intValue()];
            yv0 yv0Var2 = yv0.this;
            float f = yv0Var2.g0;
            float f2 = f + (f - position.a);
            float f3 = yv0Var2.h0;
            yv0Var.k0(zd0Var, f2, f3 + (f3 - position.b), position.c, -yv0Var2.H[num.intValue()].g(), fArr);
            return Boolean.TRUE;
        }
    }

    public yv0() {
        super(2, 0.5f, 0.5f);
        this.G = 0;
        this.H = new zd0[0];
        this.I = 0.0f;
        this.J = null;
        this.K = 0.03f;
        this.L = null;
        this.M = -1;
        this.N = 1.0f;
        this.O = 1.0f;
        this.P = xn0.a();
        this.Q = xn0.a();
        this.R = false;
        this.S = false;
        this.T = null;
        this.U = 0.0f;
        this.V = 90.0f;
        this.W = null;
        this.X = new ds1(0.0f, 0.0f, 0.0f);
        this.Y = new ds1(0.0f, 0.0f, 0.0f);
        this.Z = new bs1(0.0f, 0.0f);
        this.a0 = new bs1(0.0f, 0.0f);
        this.b0 = new bs1(0.0f, 0.0f);
        this.c0 = new bs1(0.0f, 0.0f);
        this.d0 = new bs1(0.0f, 0.0f);
        this.e0 = new float[4];
        this.f0 = new float[4];
        this.i0 = 6.2831855f;
        this.k0 = new pr1();
        this.l0 = 40.0f;
        this.m0 = new b();
        this.n0 = new d();
        this.o0 = new e();
        this.p0 = new f();
        this.q0 = new g();
        this.j0 = new vv(new a(), null, null, null);
        String[] strArr = r0;
        m0(strArr[0]);
        Y(new hb());
        J(2);
        R(0.5f, 0.5f);
        r0(1500);
        t0(0.02f);
        l0(new w5().r(1.0f));
        J(2);
        n0(new xn0("Beat", 1.5f));
        s0(2.0f);
        m0(strArr[1]);
        u0(900.0f);
        v0(150.0f);
        hb j0 = j0();
        j0.y(0.5f);
        j0.z(0.25f);
        j0.r(-1);
        j0.s(-2139062144);
        j0.x(8.0f);
        j0.v(0.1f);
        j0.A(0.0f);
        j0.w(4.0f);
        j0.t(4.0f);
        j0.u(10.0f);
        j0.c(100.0f);
        j0.j(60.0f);
        j0.q(0.0f);
    }

    @Override // com.daaw.tv
    public void B(y31 y31Var, e40 e40Var) {
        g0<y31, sr1, w31> g0Var;
        float f2;
        float f3;
        float f4;
        float b2;
        bs1 bs1Var;
        bs1 bs1Var2;
        bs1 bs1Var3;
        RectF rectF;
        g0<y31, sr1, w31> g0Var2;
        super.B(y31Var, e40Var);
        this.j0.u(y31Var, e40Var);
        if (this.H.length != this.G) {
            return;
        }
        RectF n = n(y31Var.u.b);
        bs1 bs1Var4 = new bs1(0.0f, 0.0f);
        bs1 bs1Var5 = new bs1(0.0f, 0.0f);
        float f5 = this.U;
        if (f5 > 1.0f) {
            g0<y31, sr1, w31> g0Var3 = this.m0;
            y31Var.s(this.k0, bs1Var4, e40Var, this.V, 0.01f, f5 - (-20.0f), -0.5f, -0.5f, -10.0f);
            f3 = n.width() / bs1Var4.a;
            f4 = n.height() / bs1Var4.b;
            g0Var = g0Var3;
            f2 = -f5;
        } else {
            g0Var = null;
            f2 = 0.0f;
            f3 = 1.0f;
            f4 = 1.0f;
        }
        this.I += y31Var.E();
        if (this.L == null || this.J == null) {
            return;
        }
        float max = Math.max(0.01f, this.K);
        this.K = max;
        float f6 = this.I;
        this.I = Math.min(max * f6 * 100.0f, f6);
        while (true) {
            float f7 = this.I;
            float f8 = this.K;
            if (f7 <= f8) {
                break;
            }
            this.I = f7 - f8;
            int g0 = g0();
            if (g0 < 0 || g0 >= this.H.length) {
                bs1Var2 = bs1Var5;
                bs1Var3 = bs1Var4;
                rectF = n;
                g0Var2 = g0Var;
            } else {
                this.J.l(n, this.X, this.Y, this.U > 1.0f);
                if (this.U > 1.0f) {
                    bs1Var2 = bs1Var5;
                    g0Var2 = g0Var;
                    bs1Var3 = bs1Var4;
                    rectF = n;
                    y31Var.t(bs1Var5, f2, e40Var, bs1Var4.a / bs1Var4.b, this.V);
                    float width = (bs1Var2.a * 2.0f) / rectF.width();
                    float height = (bs1Var2.b * 2.0f) / rectF.height();
                    ds1 ds1Var = this.X;
                    ds1Var.a = ((ds1Var.a - rectF.centerX()) * width * f3) + rectF.centerX();
                    ds1 ds1Var2 = this.X;
                    ds1Var2.b = ((ds1Var2.b - rectF.centerY()) * height * f4) + rectF.centerY();
                } else {
                    bs1Var2 = bs1Var5;
                    bs1Var3 = bs1Var4;
                    rectF = n;
                    g0Var2 = g0Var;
                    this.Y.c = 0.0f;
                }
                ae0 ae0Var = this.L;
                zd0 zd0Var = this.H[g0];
                ds1 ds1Var3 = this.X;
                ae0Var.g(y31Var, zd0Var, new ds1(ds1Var3.a, ds1Var3.b, f2), this.Y);
            }
            bs1Var5 = bs1Var2;
            g0Var = g0Var2;
            n = rectF;
            bs1Var4 = bs1Var3;
        }
        bs1 bs1Var6 = bs1Var4;
        RectF rectF2 = n;
        g0<y31, sr1, w31> g0Var4 = g0Var;
        qc0 m = this.j0.m(y31Var);
        if (m == null) {
            m = y31Var.u.c();
        }
        w31 w31Var = new w31(f(), m, y31Var.u.t(), g0Var4);
        if (this.U > 1.0f) {
            b2 = this.L.b();
            bs1Var = new bs1(bs1Var6.a * 0.5f, bs1Var6.b * 0.5f);
        } else {
            b2 = this.L.b();
            bs1Var = null;
        }
        w0(y31Var, e40Var, rectF2, b2, w31Var, bs1Var);
    }

    public void Y(ae0 ae0Var) {
        this.L = ae0Var;
        l();
    }

    public int g0() {
        int i = 0;
        while (true) {
            zd0[] zd0VarArr = this.H;
            if (i >= zd0VarArr.length || !zd0VarArr[i].e()) {
                break;
            }
            i++;
        }
        if (i < this.H.length) {
            return i;
        }
        return -1;
    }

    @Override // com.daaw.tv
    public String h() {
        return "Particles";
    }

    public float h0() {
        return this.l0;
    }

    public int i0() {
        return this.G;
    }

    public hb j0() {
        return (hb) this.L;
    }

    public void k0(zd0 zd0Var, float f2, float f3, float f4, float f5, float[] fArr) {
        this.c0.a = -zd0Var.b();
        this.c0.b = -zd0Var.c();
        this.c0.r(f5);
        this.d0.a = zd0Var.b();
        this.d0.b = -zd0Var.c();
        this.d0.r(f5);
        bs1 bs1Var = this.c0;
        float f6 = bs1Var.a;
        fArr[0] = f2 + f6;
        float f7 = bs1Var.b;
        fArr[1] = f3 + f7;
        bs1 bs1Var2 = this.d0;
        float f8 = bs1Var2.a;
        fArr[2] = f2 + f8;
        float f9 = bs1Var2.b;
        fArr[3] = f3 + f9;
        fArr[4] = f2 - f8;
        fArr[5] = f3 - f9;
        fArr[6] = f2 - f6;
        fArr[7] = f3 - f7;
        fArr[8] = f4;
    }

    @Override // com.daaw.tv
    public void l() {
        super.l();
        vv vvVar = this.j0;
        if (vvVar != null) {
            vvVar.p();
        }
    }

    public void l0(pc0 pc0Var) {
        this.J = pc0Var;
    }

    public void m0(String str) {
        this.j0.C(str);
    }

    public void n0(xn0 xn0Var) {
        this.Q = xn0Var;
    }

    public void o0(boolean z) {
        this.S = z;
    }

    public void p0(boolean z) {
        this.R = z;
    }

    public void q0(float f2) {
        this.l0 = f2;
    }

    public void r0(int i) {
        if (this.G == i) {
            return;
        }
        this.G = i;
        l();
    }

    public void s0(float f2) {
        this.N = f2;
    }

    @Override // com.daaw.tv
    public void t(un unVar) {
        super.t(unVar);
        m0(unVar.w("customImage", r0[0]));
        this.M = unVar.r("color", -1);
        r0(unVar.r("CountLimit", 1500));
        this.N = unVar.o("particleScale", 2.0f);
        this.K = unVar.o("spawnTime", 0.02f);
        o0(unVar.n("mirrorX", false));
        p0(unVar.n("mirrorY", false));
        u0(unVar.o("perspectiveDepth", 900.0f));
        v0(unVar.o("perspectiveFov", 150.0f));
        un h = unVar.h("SpawnArea");
        l0(s5.a(h.C("Rectangle"), this.J));
        pc0 pc0Var = this.J;
        if (pc0Var != null) {
            pc0Var.a(h);
        }
        this.Q.m(unVar.h("MeasureOverallSpeed"), "Beat", 1.5f);
        ae0 ae0Var = this.L;
        if (ae0Var != null) {
            ae0Var.a(unVar);
        }
        un h2 = unVar.h("ForceField");
        qd0 a2 = e30.a(h2.C("None"), this.T);
        this.T = a2;
        if (a2 != null) {
            a2.a(h2);
        }
        q0(unVar.o("nearCameraFadeOutDistance", h0()));
    }

    public void t0(float f2) {
        this.K = f2;
    }

    public void u0(float f2) {
        this.U = f2;
    }

    @Override // com.daaw.tv
    public boolean v(y31 y31Var) {
        super.v(y31Var);
        int length = this.H.length;
        int i = this.G;
        if (length != i) {
            if (this.L != null) {
                this.H = new zd0[i];
                int i2 = 0;
                while (true) {
                    zd0[] zd0VarArr = this.H;
                    if (i2 >= zd0VarArr.length) {
                        break;
                    }
                    zd0VarArr[i2] = this.L.h();
                    i2++;
                }
            } else {
                this.H = new zd0[0];
            }
        }
        this.j0.q(y31Var, new RectF(0.0f, 0.0f, 256.0f, 256.0f), 0);
        return true;
    }

    public void v0(float f2) {
        this.V = f2;
    }

    @Override // com.daaw.tv
    public void w(y31 y31Var, int i) {
        super.w(y31Var, i);
        this.j0.r(y31Var, i);
    }

    public final void w0(y31 y31Var, e40 e40Var, RectF rectF, float f2, w31 w31Var, bs1 bs1Var) {
        float i = this.N + this.P.i(y31Var.u.b);
        float i2 = this.O + (this.Q.i(y31Var.u.b) * 5.0f);
        float e2 = y31Var.b().a().e(i) * 0.001f;
        float e3 = y31Var.b().a().e(f2) * 0.0013888889f;
        float e4 = y31Var.b().a().e(0.0013888889f);
        rectF.centerX();
        rectF.centerY();
        this.g0 = rectF.centerX();
        this.h0 = rectF.centerY();
        f80.n(this.f0, this.M);
        float max = Math.max(1.0E-6f, this.l0);
        tc o = y31Var.u.o();
        c cVar = new c(rectF, y31Var, e4, e2, i2, e3, bs1Var, max);
        boolean z = this.S;
        t40<Integer, float[], int[], Boolean> t40Var = z ? this.o0 : null;
        boolean z2 = this.R;
        o.j(y31Var, cVar, t40Var, z2 ? this.p0 : null, (z && z2) ? this.q0 : null, this.G, 0.0f, new bs1(0.0f, 1.0f), new bs1(1.0f, 0.0f), w31Var);
    }

    @Override // com.daaw.tv
    public void x(y31 y31Var) {
        super.x(y31Var);
        vv vvVar = this.j0;
        if (vvVar != null) {
            vvVar.s(y31Var);
        }
    }

    @Override // com.daaw.tv
    public void y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.y(de0Var, e40Var, vc0Var);
        this.j0.t(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.tv
    public void z(un unVar, od0 od0Var) {
        super.z(unVar, od0Var);
        unVar.p0(j(R.string.title_particles));
        od0Var.a(this.j0.j());
        unVar.g0("customImage", this.j0.j(), "appearance", c60.m ? s0 : r0);
        unVar.T("color", this.M, "1_overall");
        unVar.W("CountLimit", i0(), "1_overall", 1, 5000);
        unVar.O("particleScale", this.N, "appearance", 0.25f, 8.0f);
        unVar.O("spawnTime", this.K, "behaviour", 0.005f, 0.05f);
        unVar.L("mirrorX", this.S, "1_overall");
        unVar.L("mirrorY", this.R, "1_overall");
        unVar.O("perspectiveDepth", this.U, "1_overall", 0.0f, 1000.0f);
        unVar.O("perspectiveFov", this.V, "1_overall", 30.0f, 180.0f);
        un F = unVar.F("SpawnArea", s5.b(this.J), "1_overall", s5.a);
        pc0 pc0Var = this.J;
        if (pc0Var != null) {
            pc0Var.o(F);
        }
        un F2 = unVar.F("MeasureOverallSpeed", "", "behaviour", new String[0]);
        xn0 xn0Var = this.Q;
        if (xn0Var != null) {
            xn0Var.r(F2);
        }
        ae0 ae0Var = this.L;
        if (ae0Var != null) {
            ae0Var.o(unVar);
        }
        un F3 = unVar.F("ForceField", e30.b(this.T), "1_overall", e30.a);
        qd0 qd0Var = this.T;
        if (qd0Var != null) {
            qd0Var.o(F3);
        }
        unVar.O("nearCameraFadeOutDistance", h0(), "appearance", 0.0f, 500.0f);
    }
}
