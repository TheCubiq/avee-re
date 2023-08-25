package com.daaw;

import android.graphics.RectF;
import android.net.Uri;
import com.daaw.C3376vv;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class pl0 extends ok1 {

    /* renamed from: X */
    public static ww1<Object, Boolean> f23009X = new ww1<>();

    /* renamed from: Q */
    public C3376vv f23011Q;

    /* renamed from: P */
    public C1652i2 f23010P = new C1652i2(Uri.EMPTY, "internalres:anim128_g_m10_15", "");

    /* renamed from: R */
    public int f23012R = 0;

    /* renamed from: S */
    public float f23013S = 0.0f;

    /* renamed from: T */
    public float[] f23014T = new float[4];

    /* renamed from: U */
    public float f23015U = 0.0f;

    /* renamed from: V */
    public final float f23016V = 2.4f;

    /* renamed from: W */
    public final int f23017W = 26;

    /* renamed from: com.daaw.pl0$a */
    /* loaded from: classes.dex */
    public class C2560a implements C3376vv.InterfaceC3378b {
        public C2560a() {
        }

        @Override // com.daaw.C3376vv.InterfaceC3378b
        /* renamed from: a */
        public void mo2430a() {
            pl0.this.m8788m();
        }
    }

    /* renamed from: com.daaw.pl0$b */
    /* loaded from: classes.dex */
    public class C2561b implements r40<de0, C1652i2> {
        public C2561b() {
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public C1652i2 mo5050a(de0 de0Var) {
            return pl0.this.f23010P;
        }
    }

    public pl0() {
        C3376vv c3376vv = new C3376vv(new C2560a(), new C2561b(), null, null);
        this.f23011Q = c3376vv;
        c3376vv.m6741z(true);
        mo13309f0(-1869574000);
        m8807J(4);
        mo13308h0(26);
        m14212g0("internal_3");
        m14211i0("{MarkedArtistAndTitle}");
        m8804N(0.0f, 1.0f);
        m8806L(0.0f, 1.2f);
        m8802P(true, false);
    }

    @Override // com.daaw.ok1, com.daaw.AbstractC3118tv
    /* renamed from: B */
    public void mo2460B(y31 y31Var, e40 e40Var) {
        super.mo2460B(y31Var, e40Var);
        this.f23011Q.m6746u(y31Var, e40Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: M */
    public void mo8805M(bs1 bs1Var) {
        super.mo8805M(bs1Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: O */
    public void mo8803O(bs1 bs1Var) {
        super.mo8803O(bs1Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: W */
    public boolean mo5088W() {
        return super.mo5088W();
    }

    @Override // com.daaw.ok1
    /* renamed from: Z */
    public bs1 mo13311Z(RectF rectF) {
        float m15759a = C2213mv.m15759a(0.0f, this.f23013S, 0.0f, 1.0f, 1.0f);
        float height = rectF.height() * 0.0f;
        return new bs1((-height) + (((rectF.height() * 1.05f * 2.4f) + (rectF.height() * 0.15f * 2.4f) + height) * ((m15759a * 0.5f) + 0.5f)), rectF.height() * (-0.16f) * 2.4f);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    @Override // com.daaw.ok1
    /* renamed from: e0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo13310e0(y31 y31Var, RectF rectF) {
        int m22868f;
        qc0 m6754m;
        super.mo13310e0(y31Var, rectF);
        if (y31Var.m4220J() == 1) {
            m13306k0();
        } else if (y31Var.m4220J() == 2) {
            m13307j0();
        }
        if (this.f23015U > 3.5f) {
            m13307j0();
        }
        int i = this.f23012R;
        if (i == 0) {
            m13303n0(0);
            this.f23013S = 0.0f;
            this.f23015U = 0.0f;
            return;
        }
        if (i != 1) {
            if (i == 2) {
                this.f23015U += y31Var.mo2887d();
                float[] fArr = this.f23014T;
                m13303n0(f80.m22868f(new float[]{fArr[0], fArr[1], fArr[2], fArr[3]}));
                this.f23013S = 0.999f;
            } else if (i == 3) {
                float mo2887d = this.f23013S - (y31Var.mo2887d() * 1.25f);
                this.f23013S = mo2887d;
                if (mo2887d <= 0.0f) {
                    this.f23013S = 0.0f;
                    this.f23012R = 0;
                }
                float m15759a = C2213mv.m15759a(0.0f, Math.max(0.0f, (this.f23013S - 0.25f) * 1.3333334f), 0.0f, 1.0f, 1.0f);
                float[] fArr2 = this.f23014T;
                m22868f = f80.m22868f(new float[]{fArr2[0] * m15759a, fArr2[1] * m15759a, fArr2[2] * m15759a, fArr2[3] * m15759a});
            }
            m6754m = this.f23011Q.m6754m(y31Var);
            if (m6754m != null) {
                return;
            }
            qc0 mo2799c = m6754m.mo2799c(this.f23013S);
            float height = rectF.height() * 2.4f;
            y31Var.f33263u.m4171o().m9354o(y31Var, (rectF.height() * 0.15f * 2.4f) + rectF.left, rectF.bottom - height, 0.0f, height, height, -1, bs1.m25844s(), bs1.m25846q(), new w31(m8792f(), mo2799c, (qr1) null, (InterfaceC1348g0<y31, sr1, w31>) null), false);
            return;
        }
        float mo2887d2 = this.f23013S + (y31Var.mo2887d() * 1.25f);
        this.f23013S = mo2887d2;
        if (mo2887d2 >= 0.999f) {
            this.f23013S = 0.999f;
            this.f23012R = 2;
        }
        Math.max(0.0f, (this.f23013S - 0.5f) * 2.0f);
        float m15759a2 = C2213mv.m15759a(0.0f, this.f23013S, 0.0f, 1.0f, 1.0f);
        float[] fArr3 = this.f23014T;
        m22868f = f80.m22868f(new float[]{fArr3[0] * m15759a2, fArr3[1] * m15759a2, fArr3[2] * m15759a2, fArr3[3] * m15759a2});
        m13303n0(m22868f);
        m6754m = this.f23011Q.m6754m(y31Var);
        if (m6754m != null) {
        }
    }

    @Override // com.daaw.ok1
    /* renamed from: f0 */
    public void mo13309f0(int i) {
        super.mo13309f0(i);
        f80.m22860n(this.f23014T, i);
    }

    @Override // com.daaw.ok1, com.daaw.AbstractC3118tv
    /* renamed from: h */
    public String mo2456h() {
        return "AppLogo";
    }

    @Override // com.daaw.ok1
    /* renamed from: h0 */
    public void mo13308h0(int i) {
        super.mo13308h0(i);
    }

    /* renamed from: j0 */
    public void m13307j0() {
        if (this.f23012R == 0) {
            return;
        }
        this.f23012R = 3;
    }

    /* renamed from: k0 */
    public void m13306k0() {
        if (this.f23012R == 2) {
            return;
        }
        this.f23012R = 1;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: l */
    public void mo2451l() {
        super.mo2451l();
        C3376vv c3376vv = this.f23011Q;
        if (c3376vv != null) {
            c3376vv.m6751p();
        }
    }

    /* renamed from: n0 */
    public void m13303n0(int i) {
        super.mo13309f0(i);
    }

    @Override // com.daaw.ok1, com.daaw.AbstractC3118tv
    /* renamed from: t */
    public void mo2442t(C3239un c3239un) {
        super.m14214c0(c3239un);
        m8796V(c3239un.m7955n("visible", true));
        mo13309f0(c3239un.m7947r("color", -1869574000));
        m8802P(true, false);
        if (f23009X.m5753a(this, Boolean.FALSE).booleanValue()) {
            return;
        }
        m14216a0(0.56f, 0.56f);
        m14215b0(26);
        m8804N(0.0f, 1.0f);
        m8806L(0.0f, 1.2f);
    }

    @Override // com.daaw.ok1, com.daaw.AbstractC3118tv
    /* renamed from: v */
    public boolean mo2439v(y31 y31Var) {
        super.mo2439v(y31Var);
        this.f23011Q.m6750q(y31Var, m8784q(y31Var.f33263u.f33286b), 0);
        return false;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: w */
    public void mo2437w(y31 y31Var, int i) {
        this.f23011Q.m6749r(y31Var, i);
    }

    @Override // com.daaw.ok1, com.daaw.AbstractC3118tv
    /* renamed from: x */
    public void mo2436x(y31 y31Var) {
        super.mo2436x(y31Var);
        C3376vv c3376vv = this.f23011Q;
        if (c3376vv != null) {
            c3376vv.m6748s(y31Var);
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: y */
    public void mo2435y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.mo2435y(de0Var, e40Var, vc0Var);
        this.f23011Q.m6747t(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.ok1, com.daaw.AbstractC3118tv
    /* renamed from: z */
    public void mo2434z(C3239un c3239un, od0 od0Var) {
        super.m14213d0(c3239un);
        c3239un.m7950p0(m8790j(R.string.title_app_logo));
        c3239un.m7993L("visible", this.f28126k, "0_general");
        c3239un.m7944s0("visible", "pb", "AppLogo");
        c3239un.m7985T("color", f80.m22868f(this.f23014T), "0_general");
        if (f23009X.m5753a(this, Boolean.FALSE).booleanValue()) {
            return;
        }
        c3239un.m7954n0("position");
    }
}
