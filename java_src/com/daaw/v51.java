package com.daaw;

import android.graphics.RectF;
import android.opengl.GLES20;
import com.daaw.avee.R;
import com.daaw.vv;
/* loaded from: classes.dex */
public class v51 extends tv {
    public static final String[] Y = {"composition:0"};
    public int G;
    public int H;
    public vv I;
    public boolean J;
    public boolean K;
    public dm0 L;
    public dm0 M;
    public float[] N;
    public float[] O;
    public float[] P;
    public bs1[] Q;
    public i2 R;
    public boolean S;
    public final pr1 T;
    public g0<y31, sr1, w31> U;
    public f0<y31, sr1> V;
    public g0<y31, sr1, w31> W;
    public g0<y31, sr1, w31> X;

    /* loaded from: classes.dex */
    public class a implements vv.b {
        public a() {
        }

        @Override // com.daaw.vv.b
        public void a() {
            v51.this.m();
        }
    }

    /* loaded from: classes.dex */
    public class b implements r40<de0, i2> {
        public b() {
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public i2 a(de0 de0Var) {
            if (de0Var != null) {
                v51.this.R = de0Var.b().b().k();
            }
            return v51.this.R;
        }
    }

    /* loaded from: classes.dex */
    public class c implements g0<y31, sr1, w31> {
        public c() {
        }

        @Override // com.daaw.g0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
        }
    }

    /* loaded from: classes.dex */
    public class d implements f0<y31, sr1> {
        public d() {
        }

        @Override // com.daaw.f0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var) {
        }
    }

    /* loaded from: classes.dex */
    public class e implements g0<y31, sr1, w31> {
        public e() {
        }

        @Override // com.daaw.g0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.E("u_projView", false, v51.this.T.a());
        }
    }

    /* loaded from: classes.dex */
    public class f implements g0<y31, sr1, w31> {
        public f() {
        }

        @Override // com.daaw.g0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.E("u_projView", false, v51.this.T.a());
            float i = v51.this.L.i(y31Var.b().a());
            bs1 bs1Var = new bs1(0.0f, 0.0f);
            v51.this.M.j(y31Var.b().a(), bs1Var);
            sr1Var.t("dirAmount", bs1Var.a * i, bs1Var.b * i);
            sr1Var.u("splitColor0", v51.this.N[0], v51.this.N[1], v51.this.N[2]);
            sr1Var.u("splitColor1", v51.this.O[0], v51.this.O[1], v51.this.O[2]);
            sr1Var.u("splitColor2", v51.this.P[0], v51.this.P[1], v51.this.P[2]);
        }
    }

    public v51() {
        super(4, 1.0f, 1.0f);
        this.G = -1;
        this.H = 2;
        this.J = false;
        this.K = false;
        this.L = dm0.a(6.0f);
        this.M = new dm0(new xn0("BeatRandomShake", 0.5f, 0.5f));
        this.N = new float[]{1.0f, 0.0f, 0.0f, 1.0f};
        this.O = new float[]{0.0f, 1.0f, 0.0f, 1.0f};
        this.P = new float[]{0.0f, 0.0f, 1.0f, 1.0f};
        this.Q = new bs1[3];
        this.R = null;
        int i = 1;
        this.S = true;
        this.T = new pr1();
        this.U = new c();
        this.V = new d();
        this.W = new e();
        this.X = new f();
        R(1.0f, 1.0f);
        J(4);
        this.Q[0] = new bs1(1.0f, 1.0f);
        while (true) {
            bs1[] bs1VarArr = this.Q;
            if (i >= bs1VarArr.length) {
                this.I = new vv(new a(), new b(), null, null);
                u0("composition:1");
                return;
            }
            bs1VarArr[i] = new bs1(0.0f, 0.0f);
            i++;
        }
    }

    @Override // com.daaw.tv
    public void B(y31 y31Var, e40 e40Var) {
        RectF rectF;
        this.I.u(y31Var, e40Var);
        qc0 m = this.I.m(y31Var);
        if (m == null) {
            super.B(y31Var, e40Var);
            return;
        }
        C(y31Var);
        RectF n = n(y31Var.b().a());
        b(y31Var, this.T, n.centerX(), n.centerY(), s(y31Var.b().a()));
        v0(y31Var);
        super.B(y31Var, e40Var);
        if (this.K) {
            y31Var.u(n.left, n.top, -1, new w31(e0(), m, y31Var.u.t(), this.W));
        }
        int length = this.Q.length - 1;
        while (length >= 0) {
            bs1 bs1Var = this.Q[length];
            float f2 = bs1Var.a;
            if (f2 != 0.0f) {
                float f3 = bs1Var.b;
                if (f3 != 0.0f) {
                    float f4 = (1.0f / f2) * 0.5f;
                    float f5 = (1.0f / f3) * 0.5f;
                    rectF = n;
                    y31Var.v(n.left, n.top, this.G, new bs1(0.5f - f4, 0.5f - f5), new bs1(f4 + 0.5f, f5 + 0.5f), new w31(f(), m, y31Var.u.q(), this.X));
                    length--;
                    n = rectF;
                }
            }
            rectF = n;
            length--;
            n = rectF;
        }
        RectF rectF2 = n;
        if (this.J) {
            y31Var.u(rectF2.left, rectF2.top, -1, new w31(e0(), m, (qr1) null, (g0<y31, sr1, w31>) null));
        }
    }

    @Override // com.daaw.tv
    public void F(y31 y31Var) {
        super.F(y31Var);
    }

    public int e0() {
        return this.H;
    }

    public boolean f0() {
        return this.J;
    }

    public boolean g0() {
        return this.K;
    }

    @Override // com.daaw.tv
    public String h() {
        return "RgbSplitEffect";
    }

    public int h0() {
        return f80.f(this.N);
    }

    public int i0() {
        return f80.f(this.O);
    }

    public int j0() {
        return f80.f(this.P);
    }

    public String k0() {
        return this.I.j();
    }

    @Override // com.daaw.tv
    public void l() {
        super.l();
        vv vvVar = this.I;
        if (vvVar != null) {
            vvVar.p();
        }
    }

    public void l0(int i) {
        this.H = i;
    }

    public void m0(int i) {
        this.G = i;
    }

    public void n0(boolean z) {
        this.J = z;
    }

    public void o0(boolean z) {
        this.K = z;
    }

    public void p0(dm0 dm0Var) {
        this.M = dm0Var;
    }

    public void q0(int i) {
        f80.n(this.N, i);
    }

    public void r0(int i) {
        f80.n(this.O, i);
    }

    public void s0(int i) {
        f80.n(this.P, i);
    }

    @Override // com.daaw.tv
    public void t(un unVar) {
        super.t(unVar);
        super.u(unVar);
        l0(fc.a(unVar.h("blendModeContent").C("Add"), this.H));
        m0(unVar.r("color", -1));
        u0(unVar.w("targetImage", "composition:1"));
        n0(unVar.n("showUnblurredContent", false));
        o0(unVar.n("showUnblurredContentUnder", false));
        t0(unVar.s("splitMultiplier", dm0.a(6.0f)));
        p0(unVar.s("splitAmount", new dm0(new xn0("BeatRandomShake", 0.5f, 0.5f))));
        q0(unVar.r("splitColor0", -65536));
        r0(unVar.r("splitColor1", -16711936));
        s0(unVar.r("splitColor2", -16776961));
        this.Q[0] = new bs1(1.0f, 1.0f);
    }

    public void t0(dm0 dm0Var) {
        this.L = dm0Var;
    }

    public void u0(String str) {
        this.I.C(str);
    }

    @Override // com.daaw.tv
    public boolean v(y31 y31Var) {
        this.I.q(y31Var, q(y31Var.u.b), 0);
        return super.v(y31Var);
    }

    public final void v0(y31 y31Var) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        y31Var.T(1);
    }

    @Override // com.daaw.tv
    public void w(y31 y31Var, int i) {
        this.I.r(y31Var, i);
        super.w(y31Var, i);
    }

    @Override // com.daaw.tv
    public void x(y31 y31Var) {
        super.x(y31Var);
        vv vvVar = this.I;
        if (vvVar != null) {
            vvVar.s(y31Var);
        }
    }

    @Override // com.daaw.tv
    public void y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.y(de0Var, e40Var, vc0Var);
        this.I.t(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.tv
    public void z(un unVar, od0 od0Var) {
        super.z(unVar, od0Var);
        super.A(unVar);
        unVar.p0(j(R.string.title_rgb_split_effect));
        unVar.F("blendModeContent", fc.b(this.H), "1_appearance", fc.a);
        unVar.S("color", this.G, "1_appearance");
        od0Var.a(k0());
        unVar.f0("targetImage", k0(), "1_appearance", Y);
        unVar.L("showUnblurredContent", f0(), "1_appearance");
        unVar.L("showUnblurredContentUnder", g0(), "1_appearance");
        unVar.Z("splitMultiplier", this.L, "2_splitEffect", 0.0f, 6.0f);
        unVar.b0("splitAmount", this.M, "2_splitEffect", -0.5f, 0.5f);
        unVar.S("splitColor0", h0(), "2_splitEffect");
        unVar.S("splitColor1", i0(), "2_splitEffect");
        unVar.S("splitColor2", j0(), "2_splitEffect");
    }
}
