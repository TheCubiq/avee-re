package com.daaw;

import android.graphics.RectF;
import android.opengl.GLES20;
import com.daaw.C3376vv;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class pq0 extends AbstractC3118tv {

    /* renamed from: d0 */
    public static final String[] f23150d0 = {"composition:0"};

    /* renamed from: e0 */
    public static final String[] f23151e0 = {"EffectTransform", "Manual"};

    /* renamed from: G */
    public String f23152G;

    /* renamed from: H */
    public int f23153H;

    /* renamed from: I */
    public int f23154I;

    /* renamed from: J */
    public C3376vv f23155J;

    /* renamed from: K */
    public boolean f23156K;

    /* renamed from: L */
    public boolean f23157L;

    /* renamed from: M */
    public boolean f23158M;

    /* renamed from: N */
    public dm0 f23159N;

    /* renamed from: O */
    public dm0 f23160O;

    /* renamed from: P */
    public dm0 f23161P;

    /* renamed from: Q */
    public float f23162Q;

    /* renamed from: R */
    public float f23163R;

    /* renamed from: S */
    public float f23164S;

    /* renamed from: T */
    public float f23165T;

    /* renamed from: U */
    public float f23166U;

    /* renamed from: V */
    public float f23167V;

    /* renamed from: W */
    public float f23168W;

    /* renamed from: X */
    public float f23169X;

    /* renamed from: Y */
    public final pr1 f23170Y;

    /* renamed from: Z */
    public InterfaceC1348g0<y31, sr1, w31> f23171Z;

    /* renamed from: a0 */
    public InterfaceC1240f0<y31, sr1> f23172a0;

    /* renamed from: b0 */
    public InterfaceC1348g0<y31, sr1, w31> f23173b0;

    /* renamed from: c0 */
    public InterfaceC1348g0<y31, sr1, w31> f23174c0;

    /* renamed from: com.daaw.pq0$a */
    /* loaded from: classes.dex */
    public class C2576a implements C3376vv.InterfaceC3378b {
        public C2576a() {
        }

        @Override // com.daaw.C3376vv.InterfaceC3378b
        /* renamed from: a */
        public void mo2430a() {
            pq0.this.m8788m();
        }
    }

    /* renamed from: com.daaw.pq0$b */
    /* loaded from: classes.dex */
    public class C2577b implements InterfaceC1348g0<y31, sr1, w31> {
        public C2577b() {
        }

        @Override // com.daaw.InterfaceC1348g0
        /* renamed from: b */
        public void mo2428a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
        }
    }

    /* renamed from: com.daaw.pq0$c */
    /* loaded from: classes.dex */
    public class C2578c implements InterfaceC1240f0<y31, sr1> {
        public C2578c() {
        }

        @Override // com.daaw.InterfaceC1240f0
        /* renamed from: b */
        public void mo4189a(y31 y31Var, sr1 sr1Var) {
        }
    }

    /* renamed from: com.daaw.pq0$d */
    /* loaded from: classes.dex */
    public class C2579d implements InterfaceC1348g0<y31, sr1, w31> {
        public C2579d() {
        }

        @Override // com.daaw.InterfaceC1348g0
        /* renamed from: b */
        public void mo2428a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.m9964E("u_projView", false, pq0.this.f23170Y.m13202a());
        }
    }

    /* renamed from: com.daaw.pq0$e */
    /* loaded from: classes.dex */
    public class C2580e implements InterfaceC1348g0<y31, sr1, w31> {
        public C2580e() {
        }

        @Override // com.daaw.InterfaceC1348g0
        /* renamed from: b */
        public void mo2428a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            qc0 m6552f = w31Var.m6552f();
            float width = 1.0f / m6552f.getWidth();
            float height = 1.0f / m6552f.getHeight();
            sr1Var.m9964E("u_projView", false, pq0.this.f23170Y.m13202a());
            float m24224i = pq0.this.f23159N.m24224i(y31Var.mo2889b().mo4185a());
            bs1 bs1Var = new bs1(pq0.this.f23164S, pq0.this.f23165T);
            bs1Var.f5090a = bs1Var.f5090a * m24224i * width;
            bs1Var.f5091b = bs1Var.f5091b * m24224i * height;
            if (bs1Var.m25852k() > 4.0f) {
                bs1Var.m25848o();
                bs1Var.f5090a *= 4.0f;
                bs1Var.f5091b *= 4.0f;
            }
            sr1Var.m24538t("posAmount", (-bs1Var.f5090a) * 2.0f, bs1Var.f5091b * 2.0f);
            bs1 bs1Var2 = new bs1(pq0.this.f23168W, pq0.this.f23169X);
            float f = bs1Var2.f5090a * m24224i * width;
            bs1Var2.f5090a = f;
            float f2 = bs1Var2.f5091b * m24224i * height;
            bs1Var2.f5091b = f2;
            sr1Var.m24538t("scaleAmount", (-f) * 2.0f, f2 * 2.0f);
        }
    }

    public pq0() {
        super(4, 1.0f, 1.0f);
        this.f23152G = "";
        this.f23153H = -1;
        this.f23154I = 2;
        this.f23156K = false;
        this.f23157L = false;
        this.f23158M = true;
        this.f23159N = dm0.m24232a(1.0f);
        this.f23160O = dm0.m24231b(0.5f, 0.5f);
        this.f23161P = dm0.m24231b(0.0f, 0.0f);
        this.f23162Q = 0.0f;
        this.f23163R = 0.0f;
        this.f23164S = 0.0f;
        this.f23165T = 0.0f;
        this.f23166U = 0.0f;
        this.f23167V = 0.0f;
        this.f23168W = 0.0f;
        this.f23169X = 0.0f;
        this.f23170Y = new pr1();
        this.f23171Z = new C2577b();
        this.f23172a0 = new C2578c();
        this.f23173b0 = new C2579d();
        this.f23174c0 = new C2580e();
        this.f28119d = "BeatCamShakeMore";
        m8807J(4);
        m8800R(1.0f, 1.0f);
        this.f23155J = new C3376vv(new C2576a(), null, null, null);
        m13211r0("composition:1");
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: B */
    public void mo2460B(y31 y31Var, e40 e40Var) {
        RectF rectF;
        float height;
        RectF rectF2;
        qc0 qc0Var;
        y31 y31Var2;
        this.f23155J.m6746u(y31Var, e40Var);
        qc0 m6754m = this.f23155J.m6754m(y31Var);
        m8812C(y31Var);
        if (m6754m == null) {
            super.mo2460B(y31Var, e40Var);
            return;
        }
        boolean z = this.f23158M;
        RectF m8787n = m8787n(y31Var.mo2889b().mo4185a());
        m8794b(y31Var, this.f23170Y, m8787n.centerX(), m8787n.centerY(), m8782s(y31Var.mo2889b().mo4185a()));
        if (f23151e0[1].equals(this.f23152G)) {
            rectF = AbstractC3118tv.m8783r(y31Var.mo2889b().mo4185a(), this.f23160O, this.f23161P);
        } else {
            rectF = m8787n;
            z = true;
        }
        if (z) {
            this.f23164S = this.f23162Q - rectF.centerX();
            this.f23165T = this.f23163R - rectF.centerY();
            this.f23162Q = rectF.centerX();
            this.f23163R = rectF.centerY();
            this.f23168W = this.f23166U - rectF.width();
            height = this.f23167V - rectF.height();
        } else {
            this.f23164S = rectF.centerX();
            this.f23165T = rectF.centerY();
            this.f23162Q = rectF.centerX();
            this.f23163R = rectF.centerY();
            this.f23168W = rectF.width();
            height = rectF.height();
        }
        this.f23169X = height;
        this.f23166U = rectF.width();
        this.f23167V = rectF.height();
        m13210s0(y31Var);
        super.mo2460B(y31Var, e40Var);
        if (this.f23157L) {
            qr1 m4166t = y31Var.f33263u.m4166t();
            w31 w31Var = new w31(m13224e0(), this.f23155J.m6754m(y31Var), m4166t, this.f23173b0);
            rectF2 = m8787n;
            qc0Var = m6754m;
            y31Var2 = y31Var;
            y31Var.mo2881j().m9354o(y31Var, m8787n.left, m8787n.top, 0.0f, m8787n.width(), m8787n.height(), -1, bs1.m25844s(), bs1.m25846q(), w31Var, true);
        } else {
            rectF2 = m8787n;
            qc0Var = m6754m;
            y31Var2 = y31Var;
        }
        f80.m22860n(new float[4], this.f23153H);
        y31Var.mo2881j().m9354o(y31Var, rectF2.left, rectF2.top, 0.0f, rectF2.width(), rectF2.height(), -1, bs1.m25844s(), bs1.m25846q(), new w31(m8792f(), qc0Var, y31Var2.f33263u.m4170p(), this.f23174c0), true);
        if (this.f23156K) {
            y31Var.mo2881j().m9354o(y31Var, rectF2.left, rectF2.top, 0.0f, rectF2.width(), rectF2.height(), -1, bs1.m25844s(), bs1.m25846q(), new w31(m13224e0(), qc0Var, (qr1) null, (InterfaceC1348g0<y31, sr1, w31>) null), true);
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: F */
    public void mo5090F(y31 y31Var) {
        super.mo5090F(y31Var);
    }

    /* renamed from: e0 */
    public int m13224e0() {
        return this.f23154I;
    }

    /* renamed from: f0 */
    public boolean m13223f0() {
        return this.f23158M;
    }

    /* renamed from: g0 */
    public boolean m13222g0() {
        return this.f23156K;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: h */
    public String mo2456h() {
        return "MotionBlurEffect";
    }

    /* renamed from: h0 */
    public boolean m13221h0() {
        return this.f23157L;
    }

    /* renamed from: i0 */
    public String m13220i0() {
        return this.f23155J.m6757j();
    }

    /* renamed from: j0 */
    public void m13219j0(int i) {
        this.f23154I = i;
    }

    /* renamed from: k0 */
    public void m13218k0(int i) {
        this.f23153H = i;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: l */
    public void mo2451l() {
        super.mo2451l();
        C3376vv c3376vv = this.f23155J;
        if (c3376vv != null) {
            c3376vv.m6751p();
        }
    }

    /* renamed from: l0 */
    public void m13217l0(boolean z) {
        this.f23158M = z;
    }

    /* renamed from: m0 */
    public void m13216m0(boolean z) {
        this.f23156K = z;
    }

    /* renamed from: n0 */
    public void m13215n0(boolean z) {
        this.f23157L = z;
    }

    /* renamed from: o0 */
    public void m13214o0(dm0 dm0Var) {
        this.f23161P = dm0Var;
    }

    /* renamed from: p0 */
    public void m13213p0(dm0 dm0Var) {
        this.f23160O = dm0Var;
    }

    /* renamed from: q0 */
    public void m13212q0(dm0 dm0Var) {
        this.f23159N = dm0Var;
    }

    /* renamed from: r0 */
    public void m13211r0(String str) {
        this.f23155J.m6768C(str);
    }

    /* renamed from: s0 */
    public final void m13210s0(y31 y31Var) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        y31Var.m4210T(1);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: t */
    public void mo2442t(C3239un c3239un) {
        super.mo2442t(c3239un);
        super.m8781u(c3239un);
        m13219j0(C1268fc.m22807a(c3239un.m7967h("blendModeContent").m8003B(), 2));
        m13218k0(c3239un.m7947r("color", -1));
        m13211r0(c3239un.m7940w("TargetImage", "composition:1"));
        m13216m0(c3239un.m7955n("showUnblurredContent", false));
        m13215n0(c3239un.m7955n("showUnblurredContentUnder", false));
        m13212q0(c3239un.m7945s("blurAmountMultiplier", dm0.m24232a(1.0f)));
        C3239un m7967h = c3239un.m7967h("motionSource");
        this.f23152G = m7967h.m8002C(f23151e0[0]);
        m13213p0(m7967h.m7945s("posBlurAmount", dm0.m24231b(0.5f, 0.5f)));
        m13214o0(m7967h.m7945s("scaleBlurAmount", dm0.m24231b(0.0f, 0.0f)));
        m13217l0(c3239un.m7955n("relativeMotionMode", true));
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: v */
    public boolean mo2439v(y31 y31Var) {
        this.f23155J.m6750q(y31Var, m8784q(y31Var.f33263u.f33286b), 0);
        return super.mo2439v(y31Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: w */
    public void mo2437w(y31 y31Var, int i) {
        this.f23155J.m6749r(y31Var, i);
        super.mo2437w(y31Var, i);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: x */
    public void mo2436x(y31 y31Var) {
        super.mo2436x(y31Var);
        C3376vv c3376vv = this.f23155J;
        if (c3376vv != null) {
            c3376vv.m6748s(y31Var);
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: y */
    public void mo2435y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.mo2435y(de0Var, e40Var, vc0Var);
        this.f23155J.m6747t(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: z */
    public void mo2434z(C3239un c3239un, od0 od0Var) {
        super.mo2434z(c3239un, od0Var);
        super.m8813A(c3239un);
        c3239un.m7950p0(m8790j(R.string.title_motion_blur_effect));
        c3239un.m7999F("blendModeContent", C1268fc.m22806b(this.f23154I), "1_appearance", C1268fc.f9420a);
        c3239un.m7986S("color", this.f23153H, "1_appearance");
        od0Var.mo14380a(m13220i0());
        c3239un.m7970f0("TargetImage", m13220i0(), "1_appearance", f23150d0);
        c3239un.m7993L("showUnblurredContent", m13222g0(), "1_appearance");
        c3239un.m7993L("showUnblurredContentUnder", m13221h0(), "1_appearance");
        c3239un.m7979Z("blurAmountMultiplier", this.f23159N, "2_motionBlur", 0.0f, 2.0f);
        String str = this.f23152G;
        String[] strArr = f23151e0;
        C3239un m7999F = c3239un.m7999F("motionSource", str, "2_motionBlur", strArr);
        if (strArr[1].equals(this.f23152G)) {
            m7999F.m7977b0("posBlurAmount", this.f23160O, "2_motionBlur", 0.0f, 2.0f);
            m7999F.m7977b0("scaleBlurAmount", this.f23161P, "2_motionBlur", -1.0f, 1.0f);
        }
        c3239un.m7993L("relativeMotionMode", m13223f0(), "2_motionBlur");
    }
}
