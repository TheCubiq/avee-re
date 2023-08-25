package com.daaw;

import android.graphics.RectF;
import android.opengl.GLES20;
import com.daaw.avee.R;
import com.daaw.vv;
/* loaded from: classes.dex */
public class kc extends tv {
    public boolean G;
    public float H;
    public float I;
    public or1[] J;
    public int K;
    public bs1[] L;
    public int[] M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public final pr1 R;
    public int S;
    public int T;
    public vv U;
    public boolean V;
    public vk1 W;
    public g0<y31, sr1, w31> X;
    public g0<y31, sr1, w31> Y;
    public g0<y31, sr1, w31> Z;
    public g0<y31, sr1, w31> a0;

    /* loaded from: classes.dex */
    public class a implements vv.b {
        public a() {
        }

        @Override // com.daaw.vv.b
        public void a() {
            kc.this.m();
        }
    }

    /* loaded from: classes.dex */
    public class b implements g0<y31, sr1, w31> {
        public b() {
        }

        @Override // com.daaw.g0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.E("u_projView", false, kc.this.R.a());
            sr1Var.v("Color2", 0.0f, 0.0f, 0.0f, 1.0f);
            sr1Var.s("saturation", 1.0f);
            sr1Var.s("maskadd", 1.0f);
            sr1Var.s("maskmul", -1.0f);
            sr1Var.s("mask_l_add", 1.0f);
            sr1Var.s("mask_l_mul", 0.0f);
            if (w31Var.e(0) == w31Var.e(1)) {
                sr1Var.s("tex2_y_add", 0.0f);
                sr1Var.s("tex2_y_mul", 1.0f);
                return;
            }
            sr1Var.s("tex2_y_add", 1.0f);
            sr1Var.s("tex2_y_mul", -1.0f);
        }
    }

    /* loaded from: classes.dex */
    public class c implements g0<y31, sr1, w31> {
        public c() {
        }

        @Override // com.daaw.g0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.E("u_projView", false, kc.this.R.a());
            sr1Var.v("Color2", 0.0f, 0.0f, 0.0f, 1.0f);
            sr1Var.s("saturation", 1.0f);
            sr1Var.s("maskadd", 0.0f);
            sr1Var.s("maskmul", 1.0f);
            sr1Var.s("mask_l_add", 1.0f);
            sr1Var.s("mask_l_mul", 0.0f);
            if (w31Var.e(0) == w31Var.e(1)) {
                sr1Var.s("tex2_y_add", 0.0f);
                sr1Var.s("tex2_y_mul", 1.0f);
                return;
            }
            sr1Var.s("tex2_y_add", 1.0f);
            sr1Var.s("tex2_y_mul", -1.0f);
        }
    }

    /* loaded from: classes.dex */
    public class d implements g0<y31, sr1, w31> {
        public d() {
        }

        @Override // com.daaw.g0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.E("u_projView", false, kc.this.R.a());
            float[] fArr = new float[4];
            f80.n(fArr, kc.this.K);
            sr1Var.v("Color2", fArr[0], fArr[1], fArr[2], fArr[3]);
            sr1Var.s("saturation", 1.0f);
            sr1Var.s("maskadd", 0.0f);
            sr1Var.s("maskmul", 1.0f);
            sr1Var.s("mask_l_add", 1.0f);
            sr1Var.s("mask_l_mul", 0.0f);
            if (w31Var.e(0) == w31Var.e(1)) {
                sr1Var.s("tex2_y_add", 0.0f);
                sr1Var.s("tex2_y_mul", 1.0f);
                return;
            }
            sr1Var.s("tex2_y_add", 1.0f);
            sr1Var.s("tex2_y_mul", -1.0f);
        }
    }

    /* loaded from: classes.dex */
    public class e implements g0<y31, sr1, w31> {
        public e() {
        }

        @Override // com.daaw.g0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.E("u_projView", false, y31Var.K());
            qc0 f = w31Var.f();
            sr1Var.t("resolution", 1.0f / f.getWidth(), 1.0f / f.getHeight());
            sr1Var.s("blurWH", kc.this.H * 2.0f);
        }
    }

    public kc() {
        super(2, 1.0f, 1.0f);
        this.G = false;
        this.H = 1.0f;
        this.I = 4.1f;
        this.J = new or1[0];
        this.K = -16777216;
        this.L = new bs1[3];
        this.M = new int[3];
        this.N = false;
        this.O = false;
        this.P = 2;
        int i = 1;
        this.Q = 1;
        this.R = new pr1();
        this.S = 100;
        this.T = 100;
        this.V = true;
        this.X = new b();
        this.Y = new c();
        this.Z = new d();
        this.a0 = new e();
        R(1.0f, 1.0f);
        this.L[0] = new bs1(1.0f, 1.0f);
        while (true) {
            bs1[] bs1VarArr = this.L;
            if (i >= bs1VarArr.length) {
                break;
            }
            bs1VarArr[i] = new bs1(0.0f, 0.0f);
            i++;
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.M;
            if (i2 >= iArr.length) {
                this.U = new vv(new a(), null, null, null);
                j0(vv.t[0]);
                return;
            }
            iArr[i2] = -1;
            i2++;
        }
    }

    @Override // com.daaw.tv
    public void B(y31 y31Var, e40 e40Var) {
        RectF rectF;
        this.U.u(y31Var, e40Var);
        or1 B = y31Var.B(this.Q);
        n0(y31Var.u.a.e());
        C(y31Var);
        if (B == null || this.W == null) {
            super.B(y31Var, e40Var);
            return;
        }
        RectF n = n(y31Var.b().a());
        b(y31Var, this.R, n.centerX(), n.centerY(), s(y31Var.b().a()));
        o0(y31Var);
        vk1 vk1Var = this.W;
        this.W = null;
        super.B(y31Var, e40Var);
        char c2 = 1;
        if (this.O) {
            y31Var.u(n.left, n.top, -1, new w31(c0(), new qc0[]{new z6(B, false), this.U.m(y31Var)}, y31Var.u.s(), this.X));
        }
        int length = this.L.length - 1;
        while (length >= 0) {
            bs1 bs1Var = this.L[length];
            float f = bs1Var.a;
            if (f != 0.0f) {
                float f2 = bs1Var.b;
                if (f2 != 0.0f) {
                    float f3 = (1.0f / f) * 0.5f;
                    float f4 = (1.0f / f2) * 0.5f;
                    bs1 bs1Var2 = new bs1(0.5f - f3, 0.5f - f4);
                    bs1 bs1Var3 = new bs1(f3 + 0.5f, f4 + 0.5f);
                    qr1 s = y31Var.u.s();
                    int i = this.M[length];
                    qc0[] qc0VarArr = new qc0[2];
                    qc0VarArr[0] = new z6(vk1Var, false);
                    qc0VarArr[c2] = this.U.m(y31Var);
                    rectF = n;
                    y31Var.v(n.left, n.top, i, bs1Var2, bs1Var3, new w31(f(), qc0VarArr, s, this.Z));
                    length--;
                    n = rectF;
                    c2 = 1;
                }
            }
            rectF = n;
            length--;
            n = rectF;
            c2 = 1;
        }
        RectF rectF2 = n;
        if (this.N) {
            y31Var.u(rectF2.left, rectF2.top, -1, new w31(c0(), new qc0[]{new z6(B.b(), false), y31Var.u.c()}, y31Var.u.s(), this.Y));
        }
    }

    @Override // com.daaw.tv
    public void F(y31 y31Var) {
        vk1 b2;
        or1[] or1VarArr;
        super.F(y31Var);
        this.W = null;
        if (this.V) {
            or1 B = y31Var.B(this.Q);
            n0(y31Var.u.a.e());
            C(y31Var);
            if (B == null) {
                return;
            }
            if (this.H > 0.0f) {
                or1[] or1VarArr2 = this.J;
                if (or1VarArr2.length > 0) {
                    p0(y31Var, or1VarArr2[0], B.b());
                    int i = 1;
                    while (true) {
                        or1VarArr = this.J;
                        if (i >= or1VarArr.length) {
                            break;
                        }
                        p0(y31Var, or1VarArr[i], or1VarArr[i - 1].b());
                        i++;
                    }
                    b2 = or1VarArr[or1VarArr.length - 1].b();
                    this.W = b2;
                }
            }
            b2 = B.b();
            this.W = b2;
        }
    }

    public int c0() {
        return this.P;
    }

    public boolean d0() {
        return this.N;
    }

    public boolean e0() {
        return this.O;
    }

    public void f0(int i) {
        this.P = i;
    }

    public void g0(float f) {
        if (this.I == f) {
            return;
        }
        this.I = f;
        l();
    }

    @Override // com.daaw.tv
    public String h() {
        return "BlurEffect";
    }

    public void h0(float f) {
        this.H = f;
    }

    public void i0(int i) {
        this.K = i;
    }

    public void j0(String str) {
        this.U.C(str);
    }

    public void k0(int i) {
        this.Q = i;
    }

    @Override // com.daaw.tv
    public void l() {
        super.l();
        vv vvVar = this.U;
        if (vvVar != null) {
            vvVar.p();
        }
    }

    public void l0(boolean z) {
        this.N = z;
    }

    public void m0(boolean z) {
        this.O = z;
    }

    public void n0(boolean z) {
        if (this.G == z) {
            return;
        }
        this.G = z;
        l();
    }

    public final void o0(y31 y31Var) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        y31Var.T(1);
    }

    public final void p0(y31 y31Var, e40 e40Var, vk1 vk1Var) {
        y31Var.i(e40Var);
        y31Var.y(-1, bs1.s(), bs1.q(), new w31(3, new z6(vk1Var, false), y31Var.u.u(), this.a0, 2));
    }

    @Override // com.daaw.tv
    public void t(un unVar) {
        super.t(unVar);
        super.u(unVar);
        R(1.0f, 1.0f);
        f0(fc.a(unVar.h("blendModeContent").B(), 2));
        i0(unVar.r("color", -16777216));
        k0(unVar.r("sourceCompositionIndex", 1));
        this.U.C(unVar.w("MaskImage", vv.t[0]));
        h0(unVar.o("blurRadius", 2.0f));
        g0(unVar.o("blurMultiplier", 4.1f));
        l0(unVar.n("showUnblurredContent", false));
        m0(unVar.n("showUnblurredContentUnder", false));
        this.L[0] = unVar.z("1layerScale", new bs1(1.0f, 1.0f));
        this.L[1] = unVar.z("2layerScale", new bs1(0.0f, 0.0f));
        this.L[2] = unVar.z("3layerScale", new bs1(0.0f, 0.0f));
        this.M[0] = unVar.r("1layerColor", -1);
        this.M[1] = unVar.r("2layerColor", -1);
        this.M[2] = unVar.r("3layerColor", -1);
    }

    @Override // com.daaw.tv
    public boolean v(y31 y31Var) {
        or1[] or1VarArr;
        this.G = y31Var.u.a.e();
        this.U.q(y31Var, q(y31Var.u.b), 0);
        int round = Math.round(this.I);
        try {
            cs1 I = y31Var.I();
            int i = 0;
            while (true) {
                or1VarArr = this.J;
                if (i >= or1VarArr.length) {
                    break;
                }
                if (or1VarArr[i] != null) {
                    or1VarArr[i].a();
                }
                i++;
            }
            if (or1VarArr.length != round) {
                this.J = new or1[round];
            }
            int i2 = I.a;
            int i3 = I.b;
            for (int i4 = 0; i4 < this.J.length; i4++) {
                i2 = Math.max(2, i2 / 2);
                i3 = Math.max(2, i3 / 2);
                this.J[i4] = or1.g(i2, i3, 9729, 10497, false);
                or1[] or1VarArr2 = this.J;
                if (or1VarArr2[i4] != null) {
                    or1VarArr2[i4] = or1VarArr2[i4].f();
                }
            }
        } catch (Exception e2) {
            lz1.c(e2.getMessage());
        }
        return super.v(y31Var);
    }

    @Override // com.daaw.tv
    public void w(y31 y31Var, int i) {
        super.w(y31Var, i);
        this.U.r(y31Var, i);
    }

    @Override // com.daaw.tv
    public void x(y31 y31Var) {
        super.x(y31Var);
        vv vvVar = this.U;
        if (vvVar != null) {
            vvVar.s(y31Var);
        }
        int i = 0;
        while (true) {
            or1[] or1VarArr = this.J;
            if (i >= or1VarArr.length) {
                return;
            }
            if (or1VarArr[i] != null) {
                or1VarArr[i].a();
            }
            this.J[i] = null;
            i++;
        }
    }

    @Override // com.daaw.tv
    public void y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.y(de0Var, e40Var, vc0Var);
        vc0Var.a(this.Q);
        this.U.t(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.tv
    public void z(un unVar, od0 od0Var) {
        super.z(unVar, od0Var);
        super.A(unVar);
        unVar.p0(j(R.string.title_blur_effect));
        unVar.F("blendModeContent", fc.b(this.P), "1_appearance", fc.a);
        unVar.T("color", this.K, "1_appearance");
        unVar.W("sourceCompositionIndex", this.Q, "1_appearance", 1, 5);
        od0Var.a(this.U.j());
        unVar.f0("MaskImage", this.U.j(), "1_appearance", vv.t);
        unVar.O("blurRadius", this.H, "2_blur", 0.0f, 3.0f);
        unVar.O("blurMultiplier", this.I, "2_blur", 1.0f, 6.0f);
        unVar.L("showUnblurredContent", d0(), "1_appearance");
        unVar.L("showUnblurredContentUnder", e0(), "1_appearance");
        unVar.k0("1layerScale", this.L[0], "2_blur", 0.0f, 10.0f);
        unVar.k0("2layerScale", this.L[1], "2_blur", 0.0f, 10.0f);
        unVar.k0("3layerScale", this.L[2], "2_blur", 0.0f, 10.0f);
        unVar.T("1layerColor", this.M[0], "2_blur");
        unVar.T("2layerColor", this.M[1], "2_blur");
        unVar.T("3layerColor", this.M[2], "2_blur");
    }
}
