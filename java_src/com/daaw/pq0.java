package com.daaw;

import android.graphics.RectF;
import android.opengl.GLES20;
import com.daaw.avee.R;
import com.daaw.vv;
/* loaded from: classes.dex */
public class pq0 extends tv {
    public static final String[] d0 = {"composition:0"};
    public static final String[] e0 = {"EffectTransform", "Manual"};
    public String G;
    public int H;
    public int I;
    public vv J;
    public boolean K;
    public boolean L;
    public boolean M;
    public dm0 N;
    public dm0 O;
    public dm0 P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public float X;
    public final pr1 Y;
    public g0<y31, sr1, w31> Z;
    public f0<y31, sr1> a0;
    public g0<y31, sr1, w31> b0;
    public g0<y31, sr1, w31> c0;

    /* loaded from: classes.dex */
    public class a implements vv.b {
        public a() {
        }

        @Override // com.daaw.vv.b
        public void a() {
            pq0.this.m();
        }
    }

    /* loaded from: classes.dex */
    public class b implements g0<y31, sr1, w31> {
        public b() {
        }

        @Override // com.daaw.g0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
        }
    }

    /* loaded from: classes.dex */
    public class c implements f0<y31, sr1> {
        public c() {
        }

        @Override // com.daaw.f0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var) {
        }
    }

    /* loaded from: classes.dex */
    public class d implements g0<y31, sr1, w31> {
        public d() {
        }

        @Override // com.daaw.g0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.E("u_projView", false, pq0.this.Y.a());
        }
    }

    /* loaded from: classes.dex */
    public class e implements g0<y31, sr1, w31> {
        public e() {
        }

        @Override // com.daaw.g0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            qc0 f = w31Var.f();
            float width = 1.0f / f.getWidth();
            float height = 1.0f / f.getHeight();
            sr1Var.E("u_projView", false, pq0.this.Y.a());
            float i = pq0.this.N.i(y31Var.b().a());
            bs1 bs1Var = new bs1(pq0.this.S, pq0.this.T);
            bs1Var.a = bs1Var.a * i * width;
            bs1Var.b = bs1Var.b * i * height;
            if (bs1Var.k() > 4.0f) {
                bs1Var.o();
                bs1Var.a *= 4.0f;
                bs1Var.b *= 4.0f;
            }
            sr1Var.t("posAmount", (-bs1Var.a) * 2.0f, bs1Var.b * 2.0f);
            bs1 bs1Var2 = new bs1(pq0.this.W, pq0.this.X);
            float f2 = bs1Var2.a * i * width;
            bs1Var2.a = f2;
            float f3 = bs1Var2.b * i * height;
            bs1Var2.b = f3;
            sr1Var.t("scaleAmount", (-f2) * 2.0f, f3 * 2.0f);
        }
    }

    public pq0() {
        super(4, 1.0f, 1.0f);
        this.G = "";
        this.H = -1;
        this.I = 2;
        this.K = false;
        this.L = false;
        this.M = true;
        this.N = dm0.a(1.0f);
        this.O = dm0.b(0.5f, 0.5f);
        this.P = dm0.b(0.0f, 0.0f);
        this.Q = 0.0f;
        this.R = 0.0f;
        this.S = 0.0f;
        this.T = 0.0f;
        this.U = 0.0f;
        this.V = 0.0f;
        this.W = 0.0f;
        this.X = 0.0f;
        this.Y = new pr1();
        this.Z = new b();
        this.a0 = new c();
        this.b0 = new d();
        this.c0 = new e();
        this.d = "BeatCamShakeMore";
        J(4);
        R(1.0f, 1.0f);
        this.J = new vv(new a(), null, null, null);
        r0("composition:1");
    }

    @Override // com.daaw.tv
    public void B(y31 y31Var, e40 e40Var) {
        RectF rectF;
        float height;
        RectF rectF2;
        qc0 qc0Var;
        y31 y31Var2;
        this.J.u(y31Var, e40Var);
        qc0 m = this.J.m(y31Var);
        C(y31Var);
        if (m == null) {
            super.B(y31Var, e40Var);
            return;
        }
        boolean z = this.M;
        RectF n = n(y31Var.b().a());
        b(y31Var, this.Y, n.centerX(), n.centerY(), s(y31Var.b().a()));
        if (e0[1].equals(this.G)) {
            rectF = tv.r(y31Var.b().a(), this.O, this.P);
        } else {
            rectF = n;
            z = true;
        }
        if (z) {
            this.S = this.Q - rectF.centerX();
            this.T = this.R - rectF.centerY();
            this.Q = rectF.centerX();
            this.R = rectF.centerY();
            this.W = this.U - rectF.width();
            height = this.V - rectF.height();
        } else {
            this.S = rectF.centerX();
            this.T = rectF.centerY();
            this.Q = rectF.centerX();
            this.R = rectF.centerY();
            this.W = rectF.width();
            height = rectF.height();
        }
        this.X = height;
        this.U = rectF.width();
        this.V = rectF.height();
        s0(y31Var);
        super.B(y31Var, e40Var);
        if (this.L) {
            qr1 t = y31Var.u.t();
            w31 w31Var = new w31(e0(), this.J.m(y31Var), t, this.b0);
            rectF2 = n;
            qc0Var = m;
            y31Var2 = y31Var;
            y31Var.j().o(y31Var, n.left, n.top, 0.0f, n.width(), n.height(), -1, bs1.s(), bs1.q(), w31Var, true);
        } else {
            rectF2 = n;
            qc0Var = m;
            y31Var2 = y31Var;
        }
        f80.n(new float[4], this.H);
        y31Var.j().o(y31Var, rectF2.left, rectF2.top, 0.0f, rectF2.width(), rectF2.height(), -1, bs1.s(), bs1.q(), new w31(f(), qc0Var, y31Var2.u.p(), this.c0), true);
        if (this.K) {
            y31Var.j().o(y31Var, rectF2.left, rectF2.top, 0.0f, rectF2.width(), rectF2.height(), -1, bs1.s(), bs1.q(), new w31(e0(), qc0Var, (qr1) null, (g0<y31, sr1, w31>) null), true);
        }
    }

    @Override // com.daaw.tv
    public void F(y31 y31Var) {
        super.F(y31Var);
    }

    public int e0() {
        return this.I;
    }

    public boolean f0() {
        return this.M;
    }

    public boolean g0() {
        return this.K;
    }

    @Override // com.daaw.tv
    public String h() {
        return "MotionBlurEffect";
    }

    public boolean h0() {
        return this.L;
    }

    public String i0() {
        return this.J.j();
    }

    public void j0(int i) {
        this.I = i;
    }

    public void k0(int i) {
        this.H = i;
    }

    @Override // com.daaw.tv
    public void l() {
        super.l();
        vv vvVar = this.J;
        if (vvVar != null) {
            vvVar.p();
        }
    }

    public void l0(boolean z) {
        this.M = z;
    }

    public void m0(boolean z) {
        this.K = z;
    }

    public void n0(boolean z) {
        this.L = z;
    }

    public void o0(dm0 dm0Var) {
        this.P = dm0Var;
    }

    public void p0(dm0 dm0Var) {
        this.O = dm0Var;
    }

    public void q0(dm0 dm0Var) {
        this.N = dm0Var;
    }

    public void r0(String str) {
        this.J.C(str);
    }

    public final void s0(y31 y31Var) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        y31Var.T(1);
    }

    @Override // com.daaw.tv
    public void t(un unVar) {
        super.t(unVar);
        super.u(unVar);
        j0(fc.a(unVar.h("blendModeContent").B(), 2));
        k0(unVar.r("color", -1));
        r0(unVar.w("TargetImage", "composition:1"));
        m0(unVar.n("showUnblurredContent", false));
        n0(unVar.n("showUnblurredContentUnder", false));
        q0(unVar.s("blurAmountMultiplier", dm0.a(1.0f)));
        un h = unVar.h("motionSource");
        this.G = h.C(e0[0]);
        p0(h.s("posBlurAmount", dm0.b(0.5f, 0.5f)));
        o0(h.s("scaleBlurAmount", dm0.b(0.0f, 0.0f)));
        l0(unVar.n("relativeMotionMode", true));
    }

    @Override // com.daaw.tv
    public boolean v(y31 y31Var) {
        this.J.q(y31Var, q(y31Var.u.b), 0);
        return super.v(y31Var);
    }

    @Override // com.daaw.tv
    public void w(y31 y31Var, int i) {
        this.J.r(y31Var, i);
        super.w(y31Var, i);
    }

    @Override // com.daaw.tv
    public void x(y31 y31Var) {
        super.x(y31Var);
        vv vvVar = this.J;
        if (vvVar != null) {
            vvVar.s(y31Var);
        }
    }

    @Override // com.daaw.tv
    public void y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.y(de0Var, e40Var, vc0Var);
        this.J.t(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.tv
    public void z(un unVar, od0 od0Var) {
        super.z(unVar, od0Var);
        super.A(unVar);
        unVar.p0(j(R.string.title_motion_blur_effect));
        unVar.F("blendModeContent", fc.b(this.I), "1_appearance", fc.a);
        unVar.S("color", this.H, "1_appearance");
        od0Var.a(i0());
        unVar.f0("TargetImage", i0(), "1_appearance", d0);
        unVar.L("showUnblurredContent", g0(), "1_appearance");
        unVar.L("showUnblurredContentUnder", h0(), "1_appearance");
        unVar.Z("blurAmountMultiplier", this.N, "2_motionBlur", 0.0f, 2.0f);
        String str = this.G;
        String[] strArr = e0;
        un F = unVar.F("motionSource", str, "2_motionBlur", strArr);
        if (strArr[1].equals(this.G)) {
            F.b0("posBlurAmount", this.O, "2_motionBlur", 0.0f, 2.0f);
            F.b0("scaleBlurAmount", this.P, "2_motionBlur", -1.0f, 1.0f);
        }
        unVar.L("relativeMotionMode", f0(), "2_motionBlur");
    }
}
