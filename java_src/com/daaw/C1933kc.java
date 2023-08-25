package com.daaw;

import android.graphics.RectF;
import android.opengl.GLES20;
import com.daaw.C3376vv;
import com.daaw.avee.R;
/* renamed from: com.daaw.kc */
/* loaded from: classes.dex */
public class C1933kc extends AbstractC3118tv {

    /* renamed from: G */
    public boolean f16132G;

    /* renamed from: H */
    public float f16133H;

    /* renamed from: I */
    public float f16134I;

    /* renamed from: J */
    public or1[] f16135J;

    /* renamed from: K */
    public int f16136K;

    /* renamed from: L */
    public bs1[] f16137L;

    /* renamed from: M */
    public int[] f16138M;

    /* renamed from: N */
    public boolean f16139N;

    /* renamed from: O */
    public boolean f16140O;

    /* renamed from: P */
    public int f16141P;

    /* renamed from: Q */
    public int f16142Q;

    /* renamed from: R */
    public final pr1 f16143R;

    /* renamed from: S */
    public int f16144S;

    /* renamed from: T */
    public int f16145T;

    /* renamed from: U */
    public C3376vv f16146U;

    /* renamed from: V */
    public boolean f16147V;

    /* renamed from: W */
    public vk1 f16148W;

    /* renamed from: X */
    public InterfaceC1348g0<y31, sr1, w31> f16149X;

    /* renamed from: Y */
    public InterfaceC1348g0<y31, sr1, w31> f16150Y;

    /* renamed from: Z */
    public InterfaceC1348g0<y31, sr1, w31> f16151Z;

    /* renamed from: a0 */
    public InterfaceC1348g0<y31, sr1, w31> f16152a0;

    /* renamed from: com.daaw.kc$a */
    /* loaded from: classes.dex */
    public class C1934a implements C3376vv.InterfaceC3378b {
        public C1934a() {
        }

        @Override // com.daaw.C3376vv.InterfaceC3378b
        /* renamed from: a */
        public void mo2430a() {
            C1933kc.this.m8788m();
        }
    }

    /* renamed from: com.daaw.kc$b */
    /* loaded from: classes.dex */
    public class C1935b implements InterfaceC1348g0<y31, sr1, w31> {
        public C1935b() {
        }

        @Override // com.daaw.InterfaceC1348g0
        /* renamed from: b */
        public void mo2428a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.m9964E("u_projView", false, C1933kc.this.f16143R.m13202a());
            sr1Var.m24536v("Color2", 0.0f, 0.0f, 0.0f, 1.0f);
            sr1Var.m24539s("saturation", 1.0f);
            sr1Var.m24539s("maskadd", 1.0f);
            sr1Var.m24539s("maskmul", -1.0f);
            sr1Var.m24539s("mask_l_add", 1.0f);
            sr1Var.m24539s("mask_l_mul", 0.0f);
            if (w31Var.m6553e(0) == w31Var.m6553e(1)) {
                sr1Var.m24539s("tex2_y_add", 0.0f);
                sr1Var.m24539s("tex2_y_mul", 1.0f);
                return;
            }
            sr1Var.m24539s("tex2_y_add", 1.0f);
            sr1Var.m24539s("tex2_y_mul", -1.0f);
        }
    }

    /* renamed from: com.daaw.kc$c */
    /* loaded from: classes.dex */
    public class C1936c implements InterfaceC1348g0<y31, sr1, w31> {
        public C1936c() {
        }

        @Override // com.daaw.InterfaceC1348g0
        /* renamed from: b */
        public void mo2428a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.m9964E("u_projView", false, C1933kc.this.f16143R.m13202a());
            sr1Var.m24536v("Color2", 0.0f, 0.0f, 0.0f, 1.0f);
            sr1Var.m24539s("saturation", 1.0f);
            sr1Var.m24539s("maskadd", 0.0f);
            sr1Var.m24539s("maskmul", 1.0f);
            sr1Var.m24539s("mask_l_add", 1.0f);
            sr1Var.m24539s("mask_l_mul", 0.0f);
            if (w31Var.m6553e(0) == w31Var.m6553e(1)) {
                sr1Var.m24539s("tex2_y_add", 0.0f);
                sr1Var.m24539s("tex2_y_mul", 1.0f);
                return;
            }
            sr1Var.m24539s("tex2_y_add", 1.0f);
            sr1Var.m24539s("tex2_y_mul", -1.0f);
        }
    }

    /* renamed from: com.daaw.kc$d */
    /* loaded from: classes.dex */
    public class C1937d implements InterfaceC1348g0<y31, sr1, w31> {
        public C1937d() {
        }

        @Override // com.daaw.InterfaceC1348g0
        /* renamed from: b */
        public void mo2428a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.m9964E("u_projView", false, C1933kc.this.f16143R.m13202a());
            float[] fArr = new float[4];
            f80.m22860n(fArr, C1933kc.this.f16136K);
            sr1Var.m24536v("Color2", fArr[0], fArr[1], fArr[2], fArr[3]);
            sr1Var.m24539s("saturation", 1.0f);
            sr1Var.m24539s("maskadd", 0.0f);
            sr1Var.m24539s("maskmul", 1.0f);
            sr1Var.m24539s("mask_l_add", 1.0f);
            sr1Var.m24539s("mask_l_mul", 0.0f);
            if (w31Var.m6553e(0) == w31Var.m6553e(1)) {
                sr1Var.m24539s("tex2_y_add", 0.0f);
                sr1Var.m24539s("tex2_y_mul", 1.0f);
                return;
            }
            sr1Var.m24539s("tex2_y_add", 1.0f);
            sr1Var.m24539s("tex2_y_mul", -1.0f);
        }
    }

    /* renamed from: com.daaw.kc$e */
    /* loaded from: classes.dex */
    public class C1938e implements InterfaceC1348g0<y31, sr1, w31> {
        public C1938e() {
        }

        @Override // com.daaw.InterfaceC1348g0
        /* renamed from: b */
        public void mo2428a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.m9964E("u_projView", false, y31Var.m4219K());
            qc0 m6552f = w31Var.m6552f();
            sr1Var.m24538t("resolution", 1.0f / m6552f.getWidth(), 1.0f / m6552f.getHeight());
            sr1Var.m24539s("blurWH", C1933kc.this.f16133H * 2.0f);
        }
    }

    public C1933kc() {
        super(2, 1.0f, 1.0f);
        this.f16132G = false;
        this.f16133H = 1.0f;
        this.f16134I = 4.1f;
        this.f16135J = new or1[0];
        this.f16136K = -16777216;
        this.f16137L = new bs1[3];
        this.f16138M = new int[3];
        this.f16139N = false;
        this.f16140O = false;
        this.f16141P = 2;
        int i = 1;
        this.f16142Q = 1;
        this.f16143R = new pr1();
        this.f16144S = 100;
        this.f16145T = 100;
        this.f16147V = true;
        this.f16149X = new C1935b();
        this.f16150Y = new C1936c();
        this.f16151Z = new C1937d();
        this.f16152a0 = new C1938e();
        m8800R(1.0f, 1.0f);
        this.f16137L[0] = new bs1(1.0f, 1.0f);
        while (true) {
            bs1[] bs1VarArr = this.f16137L;
            if (i >= bs1VarArr.length) {
                break;
            }
            bs1VarArr[i] = new bs1(0.0f, 0.0f);
            i++;
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.f16138M;
            if (i2 >= iArr.length) {
                this.f16146U = new C3376vv(new C1934a(), null, null, null);
                m17820j0(C3376vv.f30615t[0]);
                return;
            }
            iArr[i2] = -1;
            i2++;
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: B */
    public void mo2460B(y31 y31Var, e40 e40Var) {
        RectF rectF;
        this.f16146U.m6746u(y31Var, e40Var);
        or1 m4228B = y31Var.m4228B(this.f16142Q);
        m17816n0(y31Var.f33263u.f33285a.mo2872e());
        m8812C(y31Var);
        if (m4228B == null || this.f16148W == null) {
            super.mo2460B(y31Var, e40Var);
            return;
        }
        RectF m8787n = m8787n(y31Var.mo2889b().mo4185a());
        m8794b(y31Var, this.f16143R, m8787n.centerX(), m8787n.centerY(), m8782s(y31Var.mo2889b().mo4185a()));
        m17815o0(y31Var);
        vk1 vk1Var = this.f16148W;
        this.f16148W = null;
        super.mo2460B(y31Var, e40Var);
        char c = 1;
        if (this.f16140O) {
            y31Var.m4196u(m8787n.left, m8787n.top, -1, new w31(m17827c0(), new qc0[]{new C3812z6(m4228B, false), this.f16146U.m6754m(y31Var)}, y31Var.f33263u.m4167s(), this.f16149X));
        }
        int length = this.f16137L.length - 1;
        while (length >= 0) {
            bs1 bs1Var = this.f16137L[length];
            float f = bs1Var.f5090a;
            if (f != 0.0f) {
                float f2 = bs1Var.f5091b;
                if (f2 != 0.0f) {
                    float f3 = (1.0f / f) * 0.5f;
                    float f4 = (1.0f / f2) * 0.5f;
                    bs1 bs1Var2 = new bs1(0.5f - f3, 0.5f - f4);
                    bs1 bs1Var3 = new bs1(f3 + 0.5f, f4 + 0.5f);
                    qr1 m4167s = y31Var.f33263u.m4167s();
                    int i = this.f16138M[length];
                    qc0[] qc0VarArr = new qc0[2];
                    qc0VarArr[0] = new C3812z6(vk1Var, false);
                    qc0VarArr[c] = this.f16146U.m6754m(y31Var);
                    rectF = m8787n;
                    y31Var.m4195v(m8787n.left, m8787n.top, i, bs1Var2, bs1Var3, new w31(m8792f(), qc0VarArr, m4167s, this.f16151Z));
                    length--;
                    m8787n = rectF;
                    c = 1;
                }
            }
            rectF = m8787n;
            length--;
            m8787n = rectF;
            c = 1;
        }
        RectF rectF2 = m8787n;
        if (this.f16139N) {
            y31Var.m4196u(rectF2.left, rectF2.top, -1, new w31(m17827c0(), new qc0[]{new C3812z6(m4228B.mo7095b(), false), y31Var.f33263u.mo4183c()}, y31Var.f33263u.m4167s(), this.f16150Y));
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: F */
    public void mo5090F(y31 y31Var) {
        vk1 mo7095b;
        or1[] or1VarArr;
        super.mo5090F(y31Var);
        this.f16148W = null;
        if (this.f16147V) {
            or1 m4228B = y31Var.m4228B(this.f16142Q);
            m17816n0(y31Var.f33263u.f33285a.mo2872e());
            m8812C(y31Var);
            if (m4228B == null) {
                return;
            }
            if (this.f16133H > 0.0f) {
                or1[] or1VarArr2 = this.f16135J;
                if (or1VarArr2.length > 0) {
                    m17814p0(y31Var, or1VarArr2[0], m4228B.mo7095b());
                    int i = 1;
                    while (true) {
                        or1VarArr = this.f16135J;
                        if (i >= or1VarArr.length) {
                            break;
                        }
                        m17814p0(y31Var, or1VarArr[i], or1VarArr[i - 1].mo7095b());
                        i++;
                    }
                    mo7095b = or1VarArr[or1VarArr.length - 1].mo7095b();
                    this.f16148W = mo7095b;
                }
            }
            mo7095b = m4228B.mo7095b();
            this.f16148W = mo7095b;
        }
    }

    /* renamed from: c0 */
    public int m17827c0() {
        return this.f16141P;
    }

    /* renamed from: d0 */
    public boolean m17826d0() {
        return this.f16139N;
    }

    /* renamed from: e0 */
    public boolean m17825e0() {
        return this.f16140O;
    }

    /* renamed from: f0 */
    public void m17824f0(int i) {
        this.f16141P = i;
    }

    /* renamed from: g0 */
    public void m17823g0(float f) {
        if (this.f16134I == f) {
            return;
        }
        this.f16134I = f;
        mo2451l();
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: h */
    public String mo2456h() {
        return "BlurEffect";
    }

    /* renamed from: h0 */
    public void m17822h0(float f) {
        this.f16133H = f;
    }

    /* renamed from: i0 */
    public void m17821i0(int i) {
        this.f16136K = i;
    }

    /* renamed from: j0 */
    public void m17820j0(String str) {
        this.f16146U.m6768C(str);
    }

    /* renamed from: k0 */
    public void m17819k0(int i) {
        this.f16142Q = i;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: l */
    public void mo2451l() {
        super.mo2451l();
        C3376vv c3376vv = this.f16146U;
        if (c3376vv != null) {
            c3376vv.m6751p();
        }
    }

    /* renamed from: l0 */
    public void m17818l0(boolean z) {
        this.f16139N = z;
    }

    /* renamed from: m0 */
    public void m17817m0(boolean z) {
        this.f16140O = z;
    }

    /* renamed from: n0 */
    public void m17816n0(boolean z) {
        if (this.f16132G == z) {
            return;
        }
        this.f16132G = z;
        mo2451l();
    }

    /* renamed from: o0 */
    public final void m17815o0(y31 y31Var) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        y31Var.m4210T(1);
    }

    /* renamed from: p0 */
    public final void m17814p0(y31 y31Var, e40 e40Var, vk1 vk1Var) {
        y31Var.mo2882i(e40Var);
        y31Var.m4192y(-1, bs1.m25844s(), bs1.m25846q(), new w31(3, new C3812z6(vk1Var, false), y31Var.f33263u.m4165u(), this.f16152a0, 2));
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: t */
    public void mo2442t(C3239un c3239un) {
        super.mo2442t(c3239un);
        super.m8781u(c3239un);
        m8800R(1.0f, 1.0f);
        m17824f0(BlendMode.m22807a(c3239un.m7967h("blendModeContent").m8003B(), 2));
        m17821i0(c3239un.m7947r("color", -16777216));
        m17819k0(c3239un.m7947r("sourceCompositionIndex", 1));
        this.f16146U.m6768C(c3239un.m7940w("MaskImage", C3376vv.f30615t[0]));
        m17822h0(c3239un.m7953o("blurRadius", 2.0f));
        m17823g0(c3239un.m7953o("blurMultiplier", 4.1f));
        m17818l0(c3239un.m7955n("showUnblurredContent", false));
        m17817m0(c3239un.m7955n("showUnblurredContentUnder", false));
        this.f16137L[0] = c3239un.m7937z("1layerScale", new bs1(1.0f, 1.0f));
        this.f16137L[1] = c3239un.m7937z("2layerScale", new bs1(0.0f, 0.0f));
        this.f16137L[2] = c3239un.m7937z("3layerScale", new bs1(0.0f, 0.0f));
        this.f16138M[0] = c3239un.m7947r("1layerColor", -1);
        this.f16138M[1] = c3239un.m7947r("2layerColor", -1);
        this.f16138M[2] = c3239un.m7947r("3layerColor", -1);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: v */
    public boolean mo2439v(y31 y31Var) {
        or1[] or1VarArr;
        this.f16132G = y31Var.f33263u.f33285a.mo2872e();
        this.f16146U.m6750q(y31Var, m8784q(y31Var.f33263u.f33286b), 0);
        int round = Math.round(this.f16134I);
        try {
            cs1 m4221I = y31Var.m4221I();
            int i = 0;
            while (true) {
                or1VarArr = this.f16135J;
                if (i >= or1VarArr.length) {
                    break;
                }
                if (or1VarArr[i] != null) {
                    or1VarArr[i].mo7096a();
                }
                i++;
            }
            if (or1VarArr.length != round) {
                this.f16135J = new or1[round];
            }
            int i2 = m4221I.f6162a;
            int i3 = m4221I.f6163b;
            for (int i4 = 0; i4 < this.f16135J.length; i4++) {
                i2 = Math.max(2, i2 / 2);
                i3 = Math.max(2, i3 / 2);
                this.f16135J[i4] = or1.m14054g(i2, i3, 9729, 10497, false);
                or1[] or1VarArr2 = this.f16135J;
                if (or1VarArr2[i4] != null) {
                    or1VarArr2[i4] = or1VarArr2[i4].m14055f();
                }
            }
        } catch (Exception e) {
            lz1.m16363c(e.getMessage());
        }
        return super.mo2439v(y31Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: w */
    public void mo2437w(y31 y31Var, int i) {
        super.mo2437w(y31Var, i);
        this.f16146U.m6749r(y31Var, i);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: x */
    public void mo2436x(y31 y31Var) {
        super.mo2436x(y31Var);
        C3376vv c3376vv = this.f16146U;
        if (c3376vv != null) {
            c3376vv.m6748s(y31Var);
        }
        int i = 0;
        while (true) {
            or1[] or1VarArr = this.f16135J;
            if (i >= or1VarArr.length) {
                return;
            }
            if (or1VarArr[i] != null) {
                or1VarArr[i].mo7096a();
            }
            this.f16135J[i] = null;
            i++;
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: y */
    public void mo2435y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.mo2435y(de0Var, e40Var, vc0Var);
        vc0Var.mo5086a(this.f16142Q);
        this.f16146U.m6747t(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: z */
    public void generalItemGen(C3239un c3239un, od0 od0Var) {
        super.generalItemGen(c3239un, od0Var);
        super.m8813A(c3239un);
        c3239un.m7950p0(m8790j(R.string.title_blur_effect));
        c3239un.add_Dropdown("blendModeContent", BlendMode.m22806b(this.f16141P), "1_appearance", BlendMode.f9420a);
        c3239un.m7985T("color", this.f16136K, "1_appearance");
        c3239un.m7982W("sourceCompositionIndex", this.f16142Q, "1_appearance", 1, 5);
        od0Var.mo14380a(this.f16146U.m6757j());
        c3239un.m7970f0("MaskImage", this.f16146U.m6757j(), "1_appearance", C3376vv.f30615t);
        c3239un.m7990O("blurRadius", this.f16133H, "2_blur", 0.0f, 3.0f);
        c3239un.m7990O("blurMultiplier", this.f16134I, "2_blur", 1.0f, 6.0f);
        c3239un.add_Checkbox("showUnblurredContent", m17826d0(), "1_appearance");
        c3239un.add_Checkbox("showUnblurredContentUnder", m17825e0(), "1_appearance");
        c3239un.add_Vec2Slider("1layerScale", this.f16137L[0], "2_blur", 0.0f, 10.0f);
        c3239un.add_Vec2Slider("2layerScale", this.f16137L[1], "2_blur", 0.0f, 10.0f);
        c3239un.add_Vec2Slider("3layerScale", this.f16137L[2], "2_blur", 0.0f, 10.0f);
        c3239un.m7985T("1layerColor", this.f16138M[0], "2_blur");
        c3239un.m7985T("2layerColor", this.f16138M[1], "2_blur");
        c3239un.m7985T("3layerColor", this.f16138M[2], "2_blur");
    }
}
