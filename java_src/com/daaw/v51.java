package com.daaw;

import android.graphics.RectF;
import android.opengl.GLES20;
import com.daaw.C3376vv;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class v51 extends AbstractC3118tv {

    /* renamed from: Y */
    public static final String[] f29875Y = {"composition:0"};

    /* renamed from: G */
    public int f29876G;

    /* renamed from: H */
    public int f29877H;

    /* renamed from: I */
    public C3376vv f29878I;

    /* renamed from: J */
    public boolean f29879J;

    /* renamed from: K */
    public boolean f29880K;

    /* renamed from: L */
    public dm0 f29881L;

    /* renamed from: M */
    public dm0 f29882M;

    /* renamed from: N */
    public float[] f29883N;

    /* renamed from: O */
    public float[] f29884O;

    /* renamed from: P */
    public float[] f29885P;

    /* renamed from: Q */
    public bs1[] f29886Q;

    /* renamed from: R */
    public C1652i2 f29887R;

    /* renamed from: S */
    public boolean f29888S;

    /* renamed from: T */
    public final pr1 f29889T;

    /* renamed from: U */
    public InterfaceC1348g0<y31, sr1, w31> f29890U;

    /* renamed from: V */
    public InterfaceC1240f0<y31, sr1> f29891V;

    /* renamed from: W */
    public InterfaceC1348g0<y31, sr1, w31> f29892W;

    /* renamed from: X */
    public InterfaceC1348g0<y31, sr1, w31> f29893X;

    /* renamed from: com.daaw.v51$a */
    /* loaded from: classes.dex */
    public class C3291a implements C3376vv.InterfaceC3378b {
        public C3291a() {
        }

        @Override // com.daaw.C3376vv.InterfaceC3378b
        /* renamed from: a */
        public void mo2430a() {
            v51.this.m8788m();
        }
    }

    /* renamed from: com.daaw.v51$b */
    /* loaded from: classes.dex */
    public class C3292b implements r40<de0, C1652i2> {
        public C3292b() {
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public C1652i2 mo5050a(de0 de0Var) {
            if (de0Var != null) {
                v51.this.f29887R = de0Var.mo2889b().mo4184b().mo2866k();
            }
            return v51.this.f29887R;
        }
    }

    /* renamed from: com.daaw.v51$c */
    /* loaded from: classes.dex */
    public class C3293c implements InterfaceC1348g0<y31, sr1, w31> {
        public C3293c() {
        }

        @Override // com.daaw.InterfaceC1348g0
        /* renamed from: b */
        public void mo2428a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
        }
    }

    /* renamed from: com.daaw.v51$d */
    /* loaded from: classes.dex */
    public class C3294d implements InterfaceC1240f0<y31, sr1> {
        public C3294d() {
        }

        @Override // com.daaw.InterfaceC1240f0
        /* renamed from: b */
        public void mo4189a(y31 y31Var, sr1 sr1Var) {
        }
    }

    /* renamed from: com.daaw.v51$e */
    /* loaded from: classes.dex */
    public class C3295e implements InterfaceC1348g0<y31, sr1, w31> {
        public C3295e() {
        }

        @Override // com.daaw.InterfaceC1348g0
        /* renamed from: b */
        public void mo2428a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.m9964E("u_projView", false, v51.this.f29889T.m13202a());
        }
    }

    /* renamed from: com.daaw.v51$f */
    /* loaded from: classes.dex */
    public class C3296f implements InterfaceC1348g0<y31, sr1, w31> {
        public C3296f() {
        }

        @Override // com.daaw.InterfaceC1348g0
        /* renamed from: b */
        public void mo2428a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.m9964E("u_projView", false, v51.this.f29889T.m13202a());
            float m24224i = v51.this.f29881L.m24224i(y31Var.mo2889b().mo4185a());
            bs1 bs1Var = new bs1(0.0f, 0.0f);
            v51.this.f29882M.m24223j(y31Var.mo2889b().mo4185a(), bs1Var);
            sr1Var.m24538t("dirAmount", bs1Var.f5090a * m24224i, bs1Var.f5091b * m24224i);
            sr1Var.m24537u("splitColor0", v51.this.f29883N[0], v51.this.f29883N[1], v51.this.f29883N[2]);
            sr1Var.m24537u("splitColor1", v51.this.f29884O[0], v51.this.f29884O[1], v51.this.f29884O[2]);
            sr1Var.m24537u("splitColor2", v51.this.f29885P[0], v51.this.f29885P[1], v51.this.f29885P[2]);
        }
    }

    public v51() {
        super(4, 1.0f, 1.0f);
        this.f29876G = -1;
        this.f29877H = 2;
        this.f29879J = false;
        this.f29880K = false;
        this.f29881L = dm0.m24232a(6.0f);
        this.f29882M = new dm0(new xn0("BeatRandomShake", 0.5f, 0.5f));
        this.f29883N = new float[]{1.0f, 0.0f, 0.0f, 1.0f};
        this.f29884O = new float[]{0.0f, 1.0f, 0.0f, 1.0f};
        this.f29885P = new float[]{0.0f, 0.0f, 1.0f, 1.0f};
        this.f29886Q = new bs1[3];
        this.f29887R = null;
        int i = 1;
        this.f29888S = true;
        this.f29889T = new pr1();
        this.f29890U = new C3293c();
        this.f29891V = new C3294d();
        this.f29892W = new C3295e();
        this.f29893X = new C3296f();
        m8800R(1.0f, 1.0f);
        m8807J(4);
        this.f29886Q[0] = new bs1(1.0f, 1.0f);
        while (true) {
            bs1[] bs1VarArr = this.f29886Q;
            if (i >= bs1VarArr.length) {
                this.f29878I = new C3376vv(new C3291a(), new C3292b(), null, null);
                m7428u0("composition:1");
                return;
            }
            bs1VarArr[i] = new bs1(0.0f, 0.0f);
            i++;
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: B */
    public void mo2460B(y31 y31Var, e40 e40Var) {
        RectF rectF;
        this.f29878I.m6746u(y31Var, e40Var);
        qc0 m6754m = this.f29878I.m6754m(y31Var);
        if (m6754m == null) {
            super.mo2460B(y31Var, e40Var);
            return;
        }
        m8812C(y31Var);
        RectF m8787n = m8787n(y31Var.mo2889b().mo4185a());
        m8794b(y31Var, this.f29889T, m8787n.centerX(), m8787n.centerY(), m8782s(y31Var.mo2889b().mo4185a()));
        m7427v0(y31Var);
        super.mo2460B(y31Var, e40Var);
        if (this.f29880K) {
            y31Var.m4196u(m8787n.left, m8787n.top, -1, new w31(m7444e0(), m6754m, y31Var.f33263u.m4166t(), this.f29892W));
        }
        int length = this.f29886Q.length - 1;
        while (length >= 0) {
            bs1 bs1Var = this.f29886Q[length];
            float f = bs1Var.f5090a;
            if (f != 0.0f) {
                float f2 = bs1Var.f5091b;
                if (f2 != 0.0f) {
                    float f3 = (1.0f / f) * 0.5f;
                    float f4 = (1.0f / f2) * 0.5f;
                    rectF = m8787n;
                    y31Var.m4195v(m8787n.left, m8787n.top, this.f29876G, new bs1(0.5f - f3, 0.5f - f4), new bs1(f3 + 0.5f, f4 + 0.5f), new w31(m8792f(), m6754m, y31Var.f33263u.m4169q(), this.f29893X));
                    length--;
                    m8787n = rectF;
                }
            }
            rectF = m8787n;
            length--;
            m8787n = rectF;
        }
        RectF rectF2 = m8787n;
        if (this.f29879J) {
            y31Var.m4196u(rectF2.left, rectF2.top, -1, new w31(m7444e0(), m6754m, (qr1) null, (InterfaceC1348g0<y31, sr1, w31>) null));
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: F */
    public void mo5090F(y31 y31Var) {
        super.mo5090F(y31Var);
    }

    /* renamed from: e0 */
    public int m7444e0() {
        return this.f29877H;
    }

    /* renamed from: f0 */
    public boolean m7443f0() {
        return this.f29879J;
    }

    /* renamed from: g0 */
    public boolean m7442g0() {
        return this.f29880K;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: h */
    public String mo2456h() {
        return "RgbSplitEffect";
    }

    /* renamed from: h0 */
    public int m7441h0() {
        return f80.m22868f(this.f29883N);
    }

    /* renamed from: i0 */
    public int m7440i0() {
        return f80.m22868f(this.f29884O);
    }

    /* renamed from: j0 */
    public int m7439j0() {
        return f80.m22868f(this.f29885P);
    }

    /* renamed from: k0 */
    public String m7438k0() {
        return this.f29878I.m6757j();
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: l */
    public void mo2451l() {
        super.mo2451l();
        C3376vv c3376vv = this.f29878I;
        if (c3376vv != null) {
            c3376vv.m6751p();
        }
    }

    /* renamed from: l0 */
    public void m7437l0(int i) {
        this.f29877H = i;
    }

    /* renamed from: m0 */
    public void m7436m0(int i) {
        this.f29876G = i;
    }

    /* renamed from: n0 */
    public void m7435n0(boolean z) {
        this.f29879J = z;
    }

    /* renamed from: o0 */
    public void m7434o0(boolean z) {
        this.f29880K = z;
    }

    /* renamed from: p0 */
    public void m7433p0(dm0 dm0Var) {
        this.f29882M = dm0Var;
    }

    /* renamed from: q0 */
    public void m7432q0(int i) {
        f80.m22860n(this.f29883N, i);
    }

    /* renamed from: r0 */
    public void m7431r0(int i) {
        f80.m22860n(this.f29884O, i);
    }

    /* renamed from: s0 */
    public void m7430s0(int i) {
        f80.m22860n(this.f29885P, i);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: t */
    public void mo2442t(C3239un c3239un) {
        super.mo2442t(c3239un);
        super.m8781u(c3239un);
        m7437l0(C1268fc.m22807a(c3239un.m7967h("blendModeContent").m8002C("Add"), this.f29877H));
        m7436m0(c3239un.m7947r("color", -1));
        m7428u0(c3239un.m7940w("targetImage", "composition:1"));
        m7435n0(c3239un.m7955n("showUnblurredContent", false));
        m7434o0(c3239un.m7955n("showUnblurredContentUnder", false));
        m7429t0(c3239un.m7945s("splitMultiplier", dm0.m24232a(6.0f)));
        m7433p0(c3239un.m7945s("splitAmount", new dm0(new xn0("BeatRandomShake", 0.5f, 0.5f))));
        m7432q0(c3239un.m7947r("splitColor0", -65536));
        m7431r0(c3239un.m7947r("splitColor1", -16711936));
        m7430s0(c3239un.m7947r("splitColor2", -16776961));
        this.f29886Q[0] = new bs1(1.0f, 1.0f);
    }

    /* renamed from: t0 */
    public void m7429t0(dm0 dm0Var) {
        this.f29881L = dm0Var;
    }

    /* renamed from: u0 */
    public void m7428u0(String str) {
        this.f29878I.m6768C(str);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: v */
    public boolean mo2439v(y31 y31Var) {
        this.f29878I.m6750q(y31Var, m8784q(y31Var.f33263u.f33286b), 0);
        return super.mo2439v(y31Var);
    }

    /* renamed from: v0 */
    public final void m7427v0(y31 y31Var) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        y31Var.m4210T(1);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: w */
    public void mo2437w(y31 y31Var, int i) {
        this.f29878I.m6749r(y31Var, i);
        super.mo2437w(y31Var, i);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: x */
    public void mo2436x(y31 y31Var) {
        super.mo2436x(y31Var);
        C3376vv c3376vv = this.f29878I;
        if (c3376vv != null) {
            c3376vv.m6748s(y31Var);
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: y */
    public void mo2435y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.mo2435y(de0Var, e40Var, vc0Var);
        this.f29878I.m6747t(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: z */
    public void mo2434z(C3239un c3239un, od0 od0Var) {
        super.mo2434z(c3239un, od0Var);
        super.m8813A(c3239un);
        c3239un.m7950p0(m8790j(R.string.title_rgb_split_effect));
        c3239un.m7999F("blendModeContent", C1268fc.m22806b(this.f29877H), "1_appearance", C1268fc.f9420a);
        c3239un.m7986S("color", this.f29876G, "1_appearance");
        od0Var.mo14380a(m7438k0());
        c3239un.m7970f0("targetImage", m7438k0(), "1_appearance", f29875Y);
        c3239un.m7993L("showUnblurredContent", m7443f0(), "1_appearance");
        c3239un.m7993L("showUnblurredContentUnder", m7442g0(), "1_appearance");
        c3239un.m7979Z("splitMultiplier", this.f29881L, "2_splitEffect", 0.0f, 6.0f);
        c3239un.m7977b0("splitAmount", this.f29882M, "2_splitEffect", -0.5f, 0.5f);
        c3239un.m7986S("splitColor0", m7441h0(), "2_splitEffect");
        c3239un.m7986S("splitColor1", m7440i0(), "2_splitEffect");
        c3239un.m7986S("splitColor2", m7439j0(), "2_splitEffect");
    }
}
