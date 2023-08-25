package com.daaw;

import android.graphics.RectF;
import com.daaw.C3376vv;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class iq0 extends AbstractC3118tv {

    /* renamed from: M */
    public static final String[] f13913M = {"composition:0"};

    /* renamed from: N */
    public static final String[] f13914N = {"Horizontal", "Vertical", "HorizontalAndVertical"};

    /* renamed from: G */
    public int f13915G;

    /* renamed from: H */
    public C3376vv f13916H;

    /* renamed from: I */
    public int f13917I;

    /* renamed from: J */
    public boolean f13918J;

    /* renamed from: K */
    public final pr1 f13919K;

    /* renamed from: L */
    public InterfaceC1348g0<y31, sr1, w31> f13920L;

    /* renamed from: com.daaw.iq0$a */
    /* loaded from: classes.dex */
    public class C1746a implements C3376vv.InterfaceC3378b {
        public C1746a() {
        }

        @Override // com.daaw.C3376vv.InterfaceC3378b
        /* renamed from: a */
        public void mo2430a() {
            iq0.this.m8788m();
        }
    }

    /* renamed from: com.daaw.iq0$b */
    /* loaded from: classes.dex */
    public class C1747b implements InterfaceC1348g0<y31, sr1, w31> {
        public C1747b() {
        }

        @Override // com.daaw.InterfaceC1348g0
        /* renamed from: b */
        public void mo2428a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.m9964E("u_projView", false, iq0.this.f13919K.m13202a());
        }
    }

    public iq0() {
        super(4, 1.0f, 1.0f);
        this.f13915G = -1;
        this.f13917I = 0;
        this.f13918J = false;
        this.f13919K = new pr1();
        this.f13920L = new C1747b();
        m8807J(4);
        m8800R(1.0f, 1.0f);
        this.f13916H = new C3376vv(new C1746a(), null, null, null);
        m19496f0("composition:1");
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: B */
    public void mo2460B(y31 y31Var, e40 e40Var) {
        w31 w31Var;
        AbstractC3044tc mo2881j;
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
        this.f13916H.m6746u(y31Var, e40Var);
        super.mo2460B(y31Var, e40Var);
        RectF m8787n = m8787n(y31Var.mo2889b().mo4185a());
        m8794b(y31Var, this.f13919K, m8787n.centerX(), m8787n.centerY(), m8782s(y31Var.mo2889b().mo4185a()));
        bs1 bs1Var = new bs1(0.0f, 0.0f);
        bs1 bs1Var2 = new bs1(1.0f, 0.0f);
        qr1 m4166t = y31Var.f33263u.m4166t();
        w31 w31Var2 = new w31(m8792f(), this.f13916H.m6754m(y31Var), m4166t, this.f13920L);
        int i2 = this.f13917I;
        if (i2 == 0) {
            float centerX3 = m8787n.centerX();
            if (this.f13918J) {
                bs1Var.f5090a = 0.0f;
            } else {
                bs1Var.f5090a = 1.0f;
            }
            bs1Var.f5091b = 1.0f;
            bs1Var2.f5090a = 0.5f;
            bs1Var2.f5091b = 0.0f;
            AbstractC3044tc mo2881j2 = y31Var.mo2881j();
            float f6 = m8787n.left;
            float f7 = m8787n.top;
            float f8 = m8787n.bottom;
            w31Var = w31Var2;
            mo2881j2.m9357l(y31Var, f6, f7, centerX3, f7, centerX3, f8, f6, f8, 0.0f, this.f13915G, bs1Var, bs1Var2, w31Var);
            boolean z = this.f13918J;
            bs1Var.f5090a = 0.5f;
            bs1Var.f5091b = 1.0f;
            if (z) {
                bs1Var2.f5090a = 0.0f;
            } else {
                bs1Var2.f5090a = 1.0f;
            }
            bs1Var2.f5091b = 0.0f;
            mo2881j = y31Var.mo2881j();
            centerY2 = m8787n.top;
            f2 = m8787n.right;
            f4 = m8787n.bottom;
            f5 = 0.0f;
            i = this.f13915G;
            de0Var = y31Var;
            centerX = centerX3;
            centerY = centerY2;
            f = f2;
            f3 = f4;
            centerX2 = centerX3;
        } else {
            w31Var = w31Var2;
            if (i2 == 1) {
                boolean z2 = this.f13918J;
                bs1Var.f5090a = 0.0f;
                if (z2) {
                    bs1Var.f5091b = 0.0f;
                } else {
                    bs1Var.f5091b = 1.0f;
                }
                bs1Var2.f5090a = 1.0f;
                bs1Var2.f5091b = 0.5f;
                AbstractC3044tc mo2881j3 = y31Var.mo2881j();
                float f9 = m8787n.left;
                float f10 = m8787n.top;
                float f11 = m8787n.right;
                mo2881j3.m9357l(y31Var, f9, f10, f11, f10, f11, m8787n.centerY(), m8787n.left, m8787n.centerY(), 0.0f, this.f13915G, bs1Var, bs1Var2, w31Var);
                boolean z3 = this.f13918J;
                bs1Var.f5090a = 0.0f;
                bs1Var.f5091b = 0.5f;
                bs1Var2.f5090a = 1.0f;
                if (z3) {
                    bs1Var2.f5091b = 0.0f;
                } else {
                    bs1Var2.f5091b = 1.0f;
                }
                mo2881j = y31Var.mo2881j();
                centerX = m8787n.left;
                centerY = m8787n.centerY();
                f = m8787n.right;
                centerY2 = m8787n.centerY();
                f2 = m8787n.right;
                f4 = m8787n.bottom;
                centerX2 = m8787n.left;
                f5 = 0.0f;
                i = this.f13915G;
                de0Var = y31Var;
                f3 = f4;
            } else if (i2 != 2) {
                return;
            } else {
                if (this.f13918J) {
                    bs1Var.f5090a = 0.0f;
                } else {
                    bs1Var.f5090a = 1.0f;
                }
                bs1Var.f5091b = 1.0f;
                bs1Var2.f5090a = 0.5f;
                bs1Var2.f5091b = 0.5f;
                y31Var.mo2881j().m9357l(y31Var, m8787n.left, m8787n.top, m8787n.centerX(), m8787n.top, m8787n.centerX(), m8787n.centerY(), m8787n.left, m8787n.centerY(), 0.0f, this.f13915G, bs1Var, bs1Var2, w31Var);
                boolean z4 = this.f13918J;
                bs1Var.f5090a = 0.5f;
                bs1Var.f5091b = 1.0f;
                if (z4) {
                    bs1Var2.f5090a = 0.0f;
                } else {
                    bs1Var2.f5090a = 1.0f;
                }
                bs1Var2.f5091b = 0.5f;
                AbstractC3044tc mo2881j4 = y31Var.mo2881j();
                float centerX4 = m8787n.centerX();
                float f12 = m8787n.top;
                float f13 = m8787n.right;
                mo2881j4.m9357l(y31Var, centerX4, f12, f13, f12, f13, m8787n.centerY(), m8787n.centerX(), m8787n.centerY(), 0.0f, this.f13915G, bs1Var, bs1Var2, w31Var);
                if (this.f13918J) {
                    bs1Var.f5090a = 0.0f;
                } else {
                    bs1Var.f5090a = 1.0f;
                }
                bs1Var.f5091b = 0.5f;
                bs1Var2.f5090a = 0.5f;
                bs1Var2.f5091b = 1.0f;
                AbstractC3044tc mo2881j5 = y31Var.mo2881j();
                float f14 = m8787n.left;
                float centerY3 = m8787n.centerY();
                float centerX5 = m8787n.centerX();
                float centerY4 = m8787n.centerY();
                float centerX6 = m8787n.centerX();
                float f15 = m8787n.bottom;
                mo2881j5.m9357l(y31Var, f14, centerY3, centerX5, centerY4, centerX6, f15, m8787n.left, f15, 0.0f, this.f13915G, bs1Var, bs1Var2, w31Var);
                boolean z5 = this.f13918J;
                bs1Var.f5090a = 0.5f;
                bs1Var.f5091b = 0.5f;
                if (z5) {
                    bs1Var2.f5090a = 0.0f;
                } else {
                    bs1Var2.f5090a = 1.0f;
                }
                bs1Var2.f5091b = 1.0f;
                mo2881j = y31Var.mo2881j();
                centerX = m8787n.centerX();
                centerY = m8787n.centerY();
                f = m8787n.right;
                centerY2 = m8787n.centerY();
                f2 = m8787n.right;
                f3 = m8787n.bottom;
                centerX2 = m8787n.centerX();
                f4 = m8787n.bottom;
                f5 = 0.0f;
                i = this.f13915G;
                de0Var = y31Var;
            }
        }
        mo2881j.m9357l(de0Var, centerX, centerY, f, centerY2, f2, f3, centerX2, f4, f5, i, bs1Var, bs1Var2, w31Var);
    }

    /* renamed from: Z */
    public boolean m19502Z() {
        return this.f13918J;
    }

    /* renamed from: a0 */
    public int m19501a0() {
        return this.f13917I;
    }

    /* renamed from: b0 */
    public String m19500b0() {
        return this.f13916H.m6757j();
    }

    /* renamed from: c0 */
    public void m19499c0(int i) {
        this.f13915G = i;
    }

    /* renamed from: d0 */
    public void m19498d0(boolean z) {
        this.f13918J = z;
    }

    /* renamed from: e0 */
    public void m19497e0(int i) {
        this.f13917I = i;
    }

    /* renamed from: f0 */
    public void m19496f0(String str) {
        this.f13916H.m6768C(str);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: h */
    public String mo2456h() {
        return "MirrorEffect";
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: l */
    public void mo2451l() {
        super.mo2451l();
        C3376vv c3376vv = this.f13916H;
        if (c3376vv != null) {
            c3376vv.m6751p();
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: t */
    public void mo2442t(C3239un c3239un) {
        super.mo2442t(c3239un);
        super.m8781u(c3239un);
        m19496f0(c3239un.m7940w("TargetImage", "composition:1"));
        String[] strArr = f13914N;
        m19497e0(br1.m25904e(strArr, c3239un.m7942u("mirrorMode", strArr[0])));
        m19498d0(c3239un.m7955n("flipMirror", false));
        m19499c0(c3239un.m7947r("color", -1));
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: v */
    public boolean mo2439v(y31 y31Var) {
        this.f13916H.m6750q(y31Var, m8784q(y31Var.f33263u.f33286b), 0);
        return super.mo2439v(y31Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: w */
    public void mo2437w(y31 y31Var, int i) {
        this.f13916H.m6749r(y31Var, i);
        super.mo2437w(y31Var, i);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: x */
    public void mo2436x(y31 y31Var) {
        super.mo2436x(y31Var);
        C3376vv c3376vv = this.f13916H;
        if (c3376vv != null) {
            c3376vv.m6748s(y31Var);
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: y */
    public void mo2435y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.mo2435y(de0Var, e40Var, vc0Var);
        this.f13916H.m6747t(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: z */
    public void generalItemGen(C3239un c3239un, od0 od0Var) {
        super.generalItemGen(c3239un, od0Var);
        super.m8813A(c3239un);
        c3239un.m7950p0(m8790j(R.string.title_mirror_effect));
        od0Var.mo14380a(m19500b0());
        c3239un.m7970f0("TargetImage", m19500b0(), "1_appearance", f13913M);
        String[] strArr = f13914N;
        c3239un.m7956m0("mirrorMode", br1.m25908a(strArr, m19501a0(), strArr[0]), "1_appearance", strArr);
        c3239un.add_Checkbox("flipMirror", m19502Z(), "1_appearance");
        c3239un.m7985T("color", this.f13915G, "1_appearance");
    }
}
