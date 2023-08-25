package com.daaw;

import android.graphics.PointF;
import android.graphics.RectF;
import com.daaw.avee.R;
import com.daaw.he0;
/* loaded from: classes.dex */
public class na1 extends AbstractC3118tv {

    /* renamed from: G */
    public he0 f19750G;

    /* renamed from: H */
    public he0 f19751H;

    /* renamed from: I */
    public ge0 f19752I;

    /* renamed from: J */
    public boolean f19753J;

    /* renamed from: K */
    public float f19754K;

    /* renamed from: L */
    public float f19755L;

    /* renamed from: M */
    public float f19756M;

    /* renamed from: N */
    public PointF f19757N;

    /* renamed from: O */
    public PointF f19758O;

    /* renamed from: P */
    public PointF f19759P;

    /* renamed from: Q */
    public PointF f19760Q;

    /* renamed from: R */
    public je0 f19761R;

    /* renamed from: S */
    public he0.C1532a[] f19762S;

    /* renamed from: T */
    public int f19763T;

    /* renamed from: U */
    public int f19764U;

    /* renamed from: V */
    public int f19765V;

    /* renamed from: W */
    public int f19766W;

    /* renamed from: X */
    public dm0 f19767X;

    public na1() {
        super(2, 0.5f, 0.5f);
        this.f19750G = null;
        this.f19751H = null;
        this.f19752I = null;
        this.f19753J = false;
        this.f19754K = 3.0f;
        this.f19755L = 0.009f;
        this.f19756M = 1.0f;
        this.f19757N = new PointF();
        this.f19758O = new PointF();
        this.f19759P = new PointF();
        this.f19760Q = new PointF();
        this.f19761R = null;
        this.f19762S = new he0.C1532a[0];
        this.f19763T = 0;
        this.f19764U = 0;
        this.f19765V = 0;
        this.f19766W = 1;
        this.f19767X = dm0.m24232a(0.0f);
        m15361h0(new oa1());
        m15360i0(new wa1());
        m15359j0(2);
    }

    /* renamed from: Z */
    public static void m15369Z(de0 de0Var, int i, RectF rectF, int i2, float f, he0 he0Var, ge0 ge0Var) {
        he0.C1532a[] c1532aArr = new he0.C1532a[0];
        PointF pointF = new PointF();
        PointF pointF2 = new PointF();
        PointF pointF3 = new PointF();
        PointF pointF4 = new PointF();
        ge0Var.mo8393d(de0Var);
        if (i2 != 0) {
            c1532aArr = new he0.C1532a[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                c1532aArr[i3] = new he0.C1532a();
                c1532aArr[i3].f12437c = -1;
            }
        }
        he0.C1532a[] c1532aArr2 = c1532aArr;
        if (i2 < 1) {
            return;
        }
        float mo8389k = ge0Var.mo8389k(rectF, i2);
        int i4 = 0;
        while (i4 < i2) {
            int i5 = i4;
            int mo8392e = ge0Var.mo8392e(false, i4, i2, rectF, 0.0f, pointF3, pointF4);
            if (Float.isNaN(pointF4.x)) {
                pointF4.x = 1.0f;
                pointF4.y = 0.0f;
            }
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            double d = 0.0f;
            Double.isNaN(d);
            float f2 = (float) (d * 3.141592653589793d * 2.0d);
            AbstractC3118tv.m8809H(pointF, centerX, centerY, pointF3, f2);
            AbstractC3118tv.m8808I(pointF2, pointF4, f2);
            if (mo8392e >= 0) {
                c1532aArr2[mo8392e].f12437c = i5;
            }
            he0.C1532a c1532a = c1532aArr2[i5];
            c1532a.f12435a = mo8392e;
            c1532a.f12438d = f;
            c1532a.f12439e = pointF.x;
            c1532a.f12440f = pointF.y;
            c1532a.f12441g = pointF2.x;
            c1532a.f12442h = pointF2.y;
            i4 = i5 + 1;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            he0.C1532a c1532a2 = c1532aArr2[i6];
            c1532a2.f12436b = c1532a2.f12437c;
            c1532a2.f12437c = -1;
        }
        if (he0Var != null) {
            he0Var.mo2574m(de0Var, c1532aArr2, mo8389k, 0.5f, i, 0.0f);
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: B */
    public void mo2460B(y31 y31Var, e40 e40Var) {
        super.mo2460B(y31Var, e40Var);
        m15370Y(y31Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: G */
    public void mo7700G(de0 de0Var, e40 e40Var) {
        super.mo7700G(de0Var, e40Var);
        m15370Y(de0Var);
    }

    /* renamed from: Y */
    public final void m15370Y(de0 de0Var) {
        int i;
        fe0 m27223b = de0Var.mo2889b().mo4185a().m27223b(this.f19766W - 1);
        if (m27223b != null) {
            if ((this.f19750G == null && this.f19751H == null) || this.f19752I == null) {
                return;
            }
            RectF m8787n = m8787n(de0Var.mo2889b().mo4185a());
            float m8782s = m8782s(de0Var.mo2889b().mo4185a());
            RectF m8785p = m8785p(de0Var.mo2889b().mo4185a());
            float centerX = m8785p.centerX();
            float centerY = m8785p.centerY();
            float max = Math.max(0.0f, Math.min(1.0f, this.f19767X.m24224i(de0Var.mo2889b().mo4185a())));
            this.f19752I.mo8393d(de0Var);
            je0 mo18685f = m27223b.mo18685f(this.f19764U, this.f19765V, this.f19763T, this.f19761R);
            this.f19761R = mo18685f;
            int size = mo18685f.size();
            if (size != this.f19762S.length) {
                this.f19762S = new he0.C1532a[size];
                for (int i2 = 0; i2 < size; i2++) {
                    this.f19762S[i2] = new he0.C1532a();
                    this.f19762S[i2].f12437c = -1;
                }
            }
            if (size < 1) {
                return;
            }
            float m27220e = de0Var.mo2889b().mo4185a().m27220e(this.f19755L);
            float m27220e2 = de0Var.mo2889b().mo4185a().m27220e(this.f19756M);
            float m27220e3 = de0Var.mo2889b().mo4185a().m27220e(this.f19754K) * 0.002f;
            float mo8389k = this.f19752I.mo8389k(m8787n, size);
            float signum = Math.signum(m27220e3);
            float abs = Math.abs(m27220e3);
            if (this.f19750G == null && this.f19751H == null) {
                return;
            }
            int i3 = 0;
            while (i3 < size) {
                int i4 = i3;
                float f = m27220e2;
                RectF rectF = m8787n;
                int mo8392e = this.f19752I.mo8392e(this.f19753J, i3, size, m8787n, 0.0f, this.f19759P, this.f19760Q);
                if (Float.isNaN(this.f19760Q.x)) {
                    PointF pointF = this.f19760Q;
                    pointF.x = 1.0f;
                    pointF.y = 0.0f;
                }
                PointF pointF2 = this.f19757N;
                PointF pointF3 = this.f19759P;
                double d = m8782s;
                Double.isNaN(d);
                float f2 = (float) (d * 3.141592653589793d * 2.0d);
                AbstractC3118tv.m8809H(pointF2, centerX, centerY, pointF3, f2);
                AbstractC3118tv.m8808I(this.f19758O, this.f19760Q, f2);
                if (mo8392e >= 0) {
                    i = i4;
                    this.f19762S[mo8392e].f12437c = i;
                } else {
                    i = i4;
                }
                he0.C1532a c1532a = this.f19762S[i];
                c1532a.f12435a = mo8392e;
                c1532a.f12438d = (Math.min(this.f19761R.get(i) * abs, f) * signum) + m27220e;
                PointF pointF4 = this.f19757N;
                c1532a.f12439e = pointF4.x;
                c1532a.f12440f = pointF4.y;
                PointF pointF5 = this.f19758O;
                c1532a.f12441g = pointF5.x;
                c1532a.f12442h = pointF5.y;
                i3 = i + 1;
                m27220e2 = f;
                m8787n = rectF;
            }
            for (int i5 = 0; i5 < size; i5++) {
                he0.C1532a c1532a2 = this.f19762S[i5];
                c1532a2.f12436b = c1532a2.f12437c;
                c1532a2.f12437c = -1;
            }
            he0 he0Var = this.f19750G;
            if (he0Var != null) {
                he0Var.mo2574m(de0Var, this.f19762S, mo8389k, 0.5f, m8792f(), max);
            }
            he0 he0Var2 = this.f19751H;
            if (he0Var2 != null) {
                he0Var2.mo2574m(de0Var, this.f19762S, mo8389k, 0.5f, m8792f(), max);
            }
        }
    }

    /* renamed from: a0 */
    public void m15368a0(int i) {
        this.f19766W = i;
    }

    /* renamed from: b0 */
    public void m15367b0(float f) {
        this.f19754K = f;
    }

    /* renamed from: c0 */
    public void m15366c0(dm0 dm0Var) {
        this.f19767X = dm0Var;
    }

    /* renamed from: d0 */
    public void m15365d0(float f) {
        this.f19756M = f;
    }

    /* renamed from: e0 */
    public void m15364e0(float f) {
        this.f19755L = f;
    }

    /* renamed from: f0 */
    public void m15363f0(int i) {
        this.f19765V = i;
    }

    /* renamed from: g0 */
    public void m15362g0(int i) {
        this.f19764U = i;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: h */
    public String mo2456h() {
        return "Bars";
    }

    /* renamed from: h0 */
    public void m15361h0(ge0 ge0Var) {
        this.f19752I = ge0Var;
    }

    /* renamed from: i0 */
    public void m15360i0(he0 he0Var) {
        this.f19750G = he0Var;
    }

    /* renamed from: j0 */
    public void m15359j0(int i) {
        this.f19763T = i;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: t */
    public void mo2442t(C3239un c3239un) {
        super.mo2442t(c3239un);
        super.m8781u(c3239un);
        this.f19753J = c3239un.m7955n("flipInput", false);
        m15367b0(c3239un.m7953o("heightScale", 3.0f));
        m15364e0(c3239un.m7953o("minHeightScale", 0.009f));
        m15365d0(c3239un.m7953o("maxHeightScale", 1.0f));
        C3239un m7967h = c3239un.m7967h("ShapePath");
        ge0 m13538a = pa1.m13538a(m7967h.m8002C("Circle"), this.f19752I);
        this.f19752I = m13538a;
        if (m13538a != null) {
            m13538a.mo2493a(m7967h);
        }
        m15366c0(c3239un.m7945s("colorBlendOffset", dm0.m24232a(0.0f)));
        m15359j0(c3239un.m7947r("softness", 2));
        m15362g0(c3239un.m7947r("reactionDelay", 0));
        m15363f0(c3239un.m7947r("reactionAccumulatedDelay", 0));
        m15368a0(c3239un.m7947r("audioProviderIndex", 1));
        C3239un m7967h2 = c3239un.m7967h("Segment1");
        he0 m3959a = ya1.m3959a(m7967h2.m8002C("Bars"), this.f19750G);
        this.f19750G = m3959a;
        if (m3959a != null) {
            m3959a.mo2493a(m7967h2);
        }
        C3239un m7967h3 = c3239un.m7967h("Segment2");
        he0 m3959a2 = ya1.m3959a(m7967h3.m8002C("None"), this.f19751H);
        this.f19751H = m3959a2;
        if (m3959a2 != null) {
            m3959a2.mo2493a(m7967h3);
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: v */
    public boolean mo2439v(y31 y31Var) {
        return super.mo2439v(y31Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: x */
    public void mo2436x(y31 y31Var) {
        super.mo2436x(y31Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: z */
    public void generalItemGen(C3239un c3239un, od0 od0Var) {
        super.generalItemGen(c3239un, od0Var);
        super.m8813A(c3239un);
        c3239un.m7950p0(m8790j(R.string.title_segment));
        c3239un.add_Checkbox("flipInput", this.f19753J, "1_bars");
        c3239un.m7990O("heightScale", this.f19754K, "1_bars", -10.0f, 10.0f);
        c3239un.m7990O("minHeightScale", this.f19755L, "1_bars", -0.03f, 0.03f);
        c3239un.m7990O("maxHeightScale", this.f19756M, "1_bars", 0.1f, 1.0f);
        C3239un m7999F = c3239un.add_Dropdown("ShapePath", pa1.m13537b(this.f19752I), "1_bars", c60.f5521m ? pa1.f22765b : pa1.f22764a);
        ge0 ge0Var = this.f19752I;
        if (ge0Var != null) {
            ge0Var.mo2492o(m7999F);
        }
        c3239un.m7979Z("colorBlendOffset", this.f19767X, "1_bars", 0.0f, 1.0f);
        c3239un.m7982W("softness", this.f19763T, "2_Behavior", 0, 20);
        c3239un.m7982W("reactionDelay", this.f19764U, "2_Behavior", 0, 9);
        c3239un.m7982W("reactionAccumulatedDelay", this.f19765V, "2_Behavior", 0, 9);
        c3239un.m7982W("audioProviderIndex", this.f19766W, "2_Behavior", 1, 4);
        String m3958b = ya1.m3958b(this.f19750G);
        String[] strArr = ya1.f33444a;
        C3239un m7999F2 = c3239un.add_Dropdown("Segment1", m3958b, "1_bars", strArr);
        he0 he0Var = this.f19750G;
        if (he0Var != null) {
            he0Var.mo2492o(m7999F2);
        }
        C3239un m7999F3 = c3239un.add_Dropdown("Segment2", ya1.m3958b(this.f19751H), "1_bars", strArr);
        he0 he0Var2 = this.f19751H;
        if (he0Var2 != null) {
            he0Var2.mo2492o(m7999F3);
        }
    }
}
