package com.daaw;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
/* renamed from: com.daaw.tv */
/* loaded from: classes.dex */
public abstract class AbstractC3118tv {

    /* renamed from: C */
    public static String f28110C = "10";

    /* renamed from: D */
    public static final String[] f28111D = {"Na", "Start", "Center", "End"};

    /* renamed from: E */
    public static ge0 f28112E = new qa1();

    /* renamed from: F */
    public static za1 f28113F = (za1) new za1().m5337s(-1, -1, -1);

    /* renamed from: a */
    public int f28116a;

    /* renamed from: b */
    public float f28117b;

    /* renamed from: c */
    public float f28118c;

    /* renamed from: e */
    public int f28120e;

    /* renamed from: g */
    public AbstractC3261uv f28122g;

    /* renamed from: u */
    public boolean f28136u;

    /* renamed from: d */
    public String f28119d = "Nothing";

    /* renamed from: f */
    public String f28121f = "";

    /* renamed from: h */
    public boolean f28123h = false;

    /* renamed from: i */
    public int f28124i = 0;

    /* renamed from: j */
    public int f28125j = 0;

    /* renamed from: k */
    public boolean f28126k = true;

    /* renamed from: l */
    public xn0 f28127l = xn0.m4972a();

    /* renamed from: m */
    public float f28128m = 0.0f;

    /* renamed from: n */
    public xn0 f28129n = xn0.m4972a();

    /* renamed from: o */
    public int f28130o = 0;

    /* renamed from: p */
    public int f28131p = 0;

    /* renamed from: q */
    public float f28132q = 0.5f;

    /* renamed from: r */
    public float f28133r = 0.5f;

    /* renamed from: s */
    public float f28134s = 0.5f;

    /* renamed from: t */
    public float f28135t = 0.5f;

    /* renamed from: v */
    public boolean f28137v = false;

    /* renamed from: w */
    public boolean f28138w = false;

    /* renamed from: x */
    public float f28139x = 0.5f;

    /* renamed from: y */
    public float f28140y = 0.5f;

    /* renamed from: z */
    public xn0 f28141z = xn0.m4972a();

    /* renamed from: A */
    public boolean f28114A = false;

    /* renamed from: B */
    public float f28115B = Float.MAX_VALUE;

    /* renamed from: com.daaw.tv$a */
    /* loaded from: classes.dex */
    public static class C3119a {

        /* renamed from: a */
        public static int f28142a = 1;

        /* renamed from: a */
        public static int m8780a() {
            int i = f28142a;
            f28142a = i + 1;
            return i;
        }
    }

    public AbstractC3118tv(int i, float f, float f2) {
        this.f28120e = -1;
        this.f28120e = C3119a.m8780a();
        this.f28116a = i;
        this.f28117b = f;
        this.f28118c = f2;
    }

    /* renamed from: H */
    public static void m8809H(PointF pointF, float f, float f2, PointF pointF2, float f3) {
        double d = f;
        double d2 = pointF2.x - f;
        double d3 = f3;
        double cos = Math.cos(d3);
        Double.isNaN(d2);
        Double.isNaN(d);
        double d4 = d + (d2 * cos);
        double d5 = pointF2.y - f2;
        double sin = Math.sin(d3);
        Double.isNaN(d5);
        pointF.x = (float) (d4 - (d5 * sin));
        double d6 = f2;
        double d7 = pointF2.x - f;
        double sin2 = Math.sin(d3);
        Double.isNaN(d7);
        Double.isNaN(d6);
        double d8 = pointF2.y - f2;
        double cos2 = Math.cos(d3);
        Double.isNaN(d8);
        pointF.y = (float) (d6 + (d7 * sin2) + (d8 * cos2));
    }

    /* renamed from: I */
    public static void m8808I(PointF pointF, PointF pointF2, float f) {
        double d = pointF2.x;
        double d2 = f;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        double d3 = d * cos;
        double d4 = pointF2.y;
        double sin = Math.sin(d2);
        Double.isNaN(d4);
        pointF.x = (float) (d3 - (d4 * sin));
        double d5 = pointF2.x;
        double sin2 = Math.sin(d2);
        Double.isNaN(d5);
        double d6 = pointF2.y;
        double cos2 = Math.cos(d2);
        Double.isNaN(d6);
        pointF.y = (float) ((d5 * sin2) + (d6 * cos2));
    }

    /* renamed from: r */
    public static RectF m8783r(aq0 aq0Var, dm0 dm0Var, dm0 dm0Var2) {
        bs1 bs1Var = new bs1(0.0f, 0.0f);
        dm0Var.m24223j(aq0Var, bs1Var);
        float m27214k = aq0Var.m27214k(0.5f, true) - aq0Var.m27214k(bs1Var.f5090a, true);
        dm0Var2.m24223j(aq0Var, bs1Var);
        float m27219f = aq0Var.m27219f(bs1Var.f5090a, false);
        float m27218g = aq0Var.m27218g(bs1Var.f5091b, false);
        float m27222c = m27214k - aq0Var.m27222c(0.5f, false, m27219f, m27218g);
        float m27213l = (aq0Var.m27213l(0.5f, true) - aq0Var.m27213l(bs1Var.f5091b, true)) - aq0Var.m27221d(0.5f, false, m27219f, m27218g);
        return new RectF(m27222c, m27213l, m27219f + m27222c, m27218g + m27213l);
    }

    /* renamed from: A */
    public void m8813A(C3239un c3239un) {
        c3239un.m7990O("rotation", this.f28128m * 360.0f, "0_general", 0.0f, 300.0f);
        this.f28127l.m4958o(c3239un.m7999F("measureRot", "", "0_general", new String[0]));
    }

    /* renamed from: B */
    public void mo2460B(y31 y31Var, e40 e40Var) {
        m8812C(y31Var);
        y31Var.mo2882i(e40Var);
        y31Var.mo2886e(this.f28124i);
    }

    /* renamed from: C */
    public void m8812C(y31 y31Var) {
        if (!this.f28123h) {
            mo2439v(y31Var);
            y31Var.m4203n();
        }
        this.f28123h = true;
        if (this.f28125j == 0) {
            y31Var.m4205l();
        }
        mo2437w(y31Var, this.f28125j);
        this.f28125j++;
    }

    /* renamed from: D */
    public void m8811D(y31 y31Var) {
        float f = this.f28115B / 1.0f;
        if (f > 1.0f) {
            return;
        }
        RectF m8787n = m8787n(y31Var.f33263u.f33286b);
        this.f28115B += y31Var.mo2887d();
        float f2 = 1.0f - f;
        f28113F.m5338r(f80.m22869e(f2, f2, f2, f2));
        na1.m15369Z(y31Var, 0, m8787n, 8, 2.5f, f28113F, f28112E);
    }

    /* renamed from: E */
    public void m8810E(y31 y31Var, e40 e40Var) {
        m8812C(y31Var);
    }

    /* renamed from: F */
    public void mo5090F(y31 y31Var) {
        m8812C(y31Var);
    }

    /* renamed from: G */
    public void mo7700G(de0 de0Var, e40 e40Var) {
        de0Var.mo2882i(e40Var);
        de0Var.mo2886e(this.f28124i);
    }

    /* renamed from: J */
    public void m8807J(int i) {
        this.f28124i = i;
    }

    /* renamed from: K */
    public boolean mo5089K(C3239un c3239un, int i) {
        if (c3239un == null) {
            return false;
        }
        mo2442t(c3239un);
        return true;
    }

    /* renamed from: L */
    public void m8806L(float f, float f2) {
        this.f28134s = f;
        this.f28135t = f2;
    }

    /* renamed from: M */
    public void mo8805M(bs1 bs1Var) {
        this.f28134s = bs1Var.f5090a;
        this.f28135t = bs1Var.f5091b;
    }

    /* renamed from: N */
    public void m8804N(float f, float f2) {
        this.f28132q = f;
        this.f28133r = f2;
    }

    /* renamed from: O */
    public void mo8803O(bs1 bs1Var) {
        this.f28132q = bs1Var.f5090a;
        this.f28133r = bs1Var.f5091b;
    }

    /* renamed from: P */
    public void m8802P(boolean z, boolean z2) {
        this.f28136u = z;
        this.f28137v = z2;
    }

    /* renamed from: Q */
    public void m8801Q(float f) {
        this.f28128m = f;
    }

    /* renamed from: R */
    public void m8800R(float f, float f2) {
        this.f28139x = f;
        this.f28140y = f2;
    }

    /* renamed from: S */
    public void m8799S(bs1 bs1Var) {
        this.f28139x = bs1Var.f5090a;
        this.f28140y = bs1Var.f5091b;
    }

    /* renamed from: T */
    public void m8798T(boolean z) {
        this.f28114A = z;
    }

    /* renamed from: U */
    public void m8797U(int i) {
        m8795X();
    }

    /* renamed from: V */
    public void m8796V(boolean z) {
        this.f28126k = z;
    }

    /* renamed from: W */
    public boolean mo5088W() {
        return this.f28126k;
    }

    /* renamed from: X */
    public void m8795X() {
        this.f28115B = 0.0f;
    }

    /* renamed from: b */
    public void m8794b(y31 y31Var, pr1 pr1Var, float f, float f2, float f3) {
        m8793c(y31Var, pr1Var, f, f2, f3, -10.0f);
    }

    /* renamed from: c */
    public void m8793c(y31 y31Var, pr1 pr1Var, float f, float f2, float f3, float f4) {
        pr1 pr1Var2 = y31Var.f33238A;
        pr1Var2.m13199d();
        pr1Var2.m13200c(f3 * 360.0f);
        y31Var.f33240C.m13199d();
        y31Var.f33240C.m13198e(-f, -f2, f4);
        y31Var.f33239B.m13201b(pr1Var2, y31Var.f33240C);
        pr1Var2.m13199d();
        pr1Var2.m13198e(f, f2, 0.0f);
        y31Var.f33240C.m13201b(pr1Var2, y31Var.f33239B);
        y31Var.m4199r(pr1Var, y31Var.f33240C);
    }

    /* renamed from: d */
    public void mo7695d() {
        m8789k(null);
    }

    /* renamed from: e */
    public AbstractC3118tv mo7693e(int i) {
        if (this.f28120e == i) {
            return this;
        }
        return null;
    }

    /* renamed from: f */
    public int m8792f() {
        return this.f28124i;
    }

    /* renamed from: g */
    public boolean mo5085g(C3239un c3239un, int i, od0 od0Var) {
        if (c3239un == null) {
            return false;
        }
        c3239un.m8000E(mo2456h());
        c3239un.m7946r0(m8791i());
        mo2434z(c3239un, od0Var);
        return true;
    }

    /* renamed from: h */
    public abstract String mo2456h();

    /* renamed from: i */
    public String m8791i() {
        return f28110C;
    }

    /* renamed from: j */
    public String m8790j(int i) {
        Context m23839c = dx0.m23839c();
        return m23839c == null ? "" : m23839c.getString(i);
    }

    /* renamed from: k */
    public void m8789k(y31 y31Var) {
        mo2436x(y31Var);
        m8788m();
    }

    /* renamed from: l */
    public void mo2451l() {
        this.f28123h = false;
        this.f28125j = 0;
    }

    /* renamed from: m */
    public void m8788m() {
        this.f28123h = false;
        this.f28125j = 0;
    }

    /* renamed from: n */
    public RectF m8787n(aq0 aq0Var) {
        bs1 m4961l = this.f28129n.m4961l(aq0Var);
        float m27216i = aq0Var.m27216i(this.f28130o) + aq0Var.m27214k(this.f28132q, this.f28130o != 0 || this.f28136u) + aq0Var.m27214k(m4961l.f5090a, true);
        float m27215j = aq0Var.m27215j(this.f28131p) + aq0Var.m27213l(this.f28133r, this.f28131p != 0 || this.f28137v) + aq0Var.m27213l(m4961l.f5091b, true);
        bs1 m4961l2 = this.f28141z.m4961l(aq0Var);
        float m27219f = aq0Var.m27219f(this.f28139x + m4961l2.f5090a, this.f28114A);
        float m27218g = aq0Var.m27218g(this.f28140y + m4961l2.f5091b, this.f28114A);
        float m27222c = m27216i - aq0Var.m27222c(this.f28134s, false, m27219f, m27218g);
        float m27221d = m27215j - aq0Var.m27221d(this.f28135t, false, m27219f, m27218g);
        return new RectF(m27222c, m27221d, m27219f + m27222c, m27218g + m27221d);
    }

    /* renamed from: o */
    public RectF m8786o(aq0 aq0Var, cs1 cs1Var) {
        bs1 m4961l = this.f28129n.m4961l(aq0Var);
        boolean z = false;
        float m27216i = aq0Var.m27216i(this.f28130o) + aq0Var.m27214k(this.f28132q, this.f28130o != 0 || this.f28136u) + aq0Var.m27214k(m4961l.f5090a, true);
        float m27215j = aq0Var.m27215j(this.f28131p) + aq0Var.m27213l(this.f28133r, (this.f28131p != 0 || this.f28137v) ? true : true) + aq0Var.m27213l(m4961l.f5091b, true);
        this.f28141z.m4961l(aq0Var);
        float f = cs1Var.f6162a;
        float f2 = cs1Var.f6163b;
        float m27222c = m27216i - aq0Var.m27222c(this.f28134s, this.f28138w, f, f2);
        float m27221d = m27215j - aq0Var.m27221d(this.f28135t, this.f28138w, f, f2);
        return new RectF(m27222c, m27221d, f + m27222c, f2 + m27221d);
    }

    /* renamed from: p */
    public RectF m8785p(aq0 aq0Var) {
        bs1 m4961l = this.f28129n.m4961l(aq0Var);
        float m27216i = aq0Var.m27216i(this.f28130o) + aq0Var.m27214k(this.f28132q, this.f28130o != 0 || this.f28136u) + aq0Var.m27214k(m4961l.f5090a, true);
        float m27215j = aq0Var.m27215j(this.f28131p) + aq0Var.m27213l(this.f28133r, this.f28131p != 0 || this.f28137v) + aq0Var.m27213l(m4961l.f5091b, true);
        bs1 m4961l2 = this.f28141z.m4961l(aq0Var);
        float m27219f = aq0Var.m27219f(this.f28139x + m4961l2.f5090a, this.f28114A);
        float m27218g = aq0Var.m27218g(this.f28140y + m4961l2.f5091b, this.f28114A);
        float m27222c = m27216i - aq0Var.m27222c(0.5f, false, m27219f, m27218g);
        float m27221d = m27215j - aq0Var.m27221d(0.5f, false, m27219f, m27218g);
        return new RectF(m27222c, m27221d, m27219f + m27222c, m27218g + m27221d);
    }

    /* renamed from: q */
    public RectF m8784q(aq0 aq0Var) {
        return m8787n(aq0Var);
    }

    /* renamed from: s */
    public float m8782s(aq0 aq0Var) {
        return (this.f28128m + this.f28127l.m4964i(aq0Var)) % 1.0f;
    }

    /* renamed from: t */
    public void mo2442t(C3239un c3239un) {
        this.f28121f = c3239un.m8004A();
        m8796V(c3239un.m7955n("visible", true));
        m8807J(C1268fc.m22807a(c3239un.m7967h("blendMode").m8002C(C1268fc.m22806b(this.f28116a)), this.f28116a));
        mo8803O(c3239un.m7937z("position", new bs1(0.5f, 0.5f)));
        String[] strArr = C3661y2.f33224a;
        this.f28130o = c3239un.m7941v("anchorX", strArr, 0);
        this.f28131p = c3239un.m7941v("anchorY", strArr, 0);
        this.f28129n.m4959n(c3239un.m7967h("MeasurePos"), this.f28119d, 0.5f, 0.5f);
        mo8805M(c3239un.m7937z("alignmentPosition", new bs1(0.5f, 0.5f)));
        m8798T(c3239un.m7955n("scaleIsUniform", false));
        m8799S(c3239un.m7937z("scale", new bs1(this.f28117b, this.f28118c)));
        this.f28141z.m4959n(c3239un.m7967h("measureScale"), "Nothing", 0.5f, 0.5f);
    }

    /* renamed from: u */
    public void m8781u(C3239un c3239un) {
        m8801Q(c3239un.m7953o("rotation", 0.0f) / 360.0f);
        this.f28127l.m4959n(c3239un.m7967h("measureRot"), "Nothing", 0.5f, 0.5f);
    }

    /* renamed from: v */
    public boolean mo2439v(y31 y31Var) {
        return true;
    }

    /* renamed from: w */
    public void mo2437w(y31 y31Var, int i) {
    }

    /* renamed from: x */
    public void mo2436x(y31 y31Var) {
    }

    /* renamed from: y */
    public void mo2435y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
    }

    /* renamed from: z */
    public void mo2434z(C3239un c3239un, od0 od0Var) {
        c3239un.m7983V("_id", this.f28120e, "");
        c3239un.m7948q0(this.f28121f);
        c3239un.m7993L("visible", this.f28126k, "0_general");
        c3239un.m7999F("blendMode", C1268fc.m22806b(this.f28124i), "0_general", C1268fc.f9420a);
        c3239un.m7960k0("position", new bs1(this.f28132q, this.f28133r), "0_general", -1.0f, 1.0f);
        String m4254a = C3661y2.m4254a(this.f28130o, 0);
        String[] strArr = C3661y2.f33224a;
        c3239un.m7956m0("anchorX", m4254a, "0_general", strArr);
        c3239un.m7956m0("anchorY", C3661y2.m4254a(this.f28131p, 0), "0_general", strArr);
        this.f28129n.m4957p(c3239un.m7999F("MeasurePos", "", "0_general", new String[0]));
        c3239un.m7960k0("alignmentPosition", new bs1(this.f28134s, this.f28135t), "0_general", 0.0f, 1.0f);
        c3239un.m7993L("scaleIsUniform", this.f28114A, "0_general");
        c3239un.m7960k0("scale", new bs1(this.f28139x, this.f28140y), "0_general", 0.0f, 2.0f);
        this.f28141z.m4956q(c3239un.m7999F("measureScale", "", "0_general", new String[0]));
    }
}
