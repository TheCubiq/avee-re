package com.daaw;

import android.opengl.GLES20;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.xi */
/* loaded from: classes.dex */
public class C3543xi extends AbstractC3261uv<AbstractC3118tv, C3239un, C2872rn> implements vc0 {

    /* renamed from: S */
    public static ww1<Object, Boolean> f32730S = new ww1<>();

    /* renamed from: H */
    public boolean f32731H;

    /* renamed from: I */
    public or1 f32732I;

    /* renamed from: J */
    public final boolean f32733J;

    /* renamed from: K */
    public boolean f32734K;

    /* renamed from: L */
    public List<Integer> f32735L;

    /* renamed from: M */
    public float f32736M;

    /* renamed from: N */
    public float f32737N;

    /* renamed from: O */
    public float f32738O;

    /* renamed from: P */
    public float f32739P;

    /* renamed from: Q */
    public int f32740Q;

    /* renamed from: R */
    public int f32741R;

    public C3543xi() {
        this.f32731H = false;
        this.f32735L = new ArrayList();
        this.f32736M = 0.0f;
        this.f32737N = 0.0f;
        this.f32738O = 0.0f;
        this.f32739P = 0.0f;
        this.f32740Q = -553648128;
        this.f32741R = 0;
        this.f32733J = false;
    }

    public C3543xi(boolean z) {
        this.f32731H = false;
        this.f32735L = new ArrayList();
        this.f32736M = 0.0f;
        this.f32737N = 0.0f;
        this.f32738O = 0.0f;
        this.f32739P = 0.0f;
        this.f32740Q = -553648128;
        this.f32741R = 0;
        this.f32733J = z;
        if (z) {
            this.f32738O = 0.0f;
            this.f32739P = 0.0f;
        }
    }

    /* renamed from: i0 */
    public static int m5082i0(String str) {
        String[] strArr = new String[2];
        br1.m25915B(str, 58, strArr);
        if ("composition".equals(strArr[0])) {
            return br1.m25885x(strArr[1], -1);
        }
        return -1;
    }

    /* renamed from: n0 */
    public static String m5077n0(int i) {
        return "composition:" + i;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: B */
    public void mo2460B(y31 y31Var, e40 e40Var) {
        m5071t0(y31Var.f33263u.f33285a.mo2872e());
        m8812C(y31Var);
        this.f32734K = true;
        om1 mo2868i = y31Var.f33263u.mo4184b().mo2868i();
        if (this.f32733J) {
            super.mo2460B(y31Var, e40Var);
            mo7694d0(y31Var, e40Var);
            m5075p0(y31Var, mo2868i);
            return;
        }
        or1 or1Var = this.f32732I;
        if (or1Var == null) {
            return;
        }
        y31Var.mo2882i(or1Var);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        m5070u0(y31Var);
        mo7694d0(y31Var, this.f32732I);
        m5075p0(y31Var, mo2868i);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: F */
    public void mo5090F(y31 y31Var) {
        boolean z = this.f32733J;
        super.mo5090F(y31Var);
        m7692e0(y31Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.daaw.tv] */
    @Override // com.daaw.AbstractC3118tv
    /* renamed from: K */
    public boolean mo5089K(C3239un c3239un, int i) {
        super.mo5089K(c3239un, i);
        if (c3239un instanceof C2872rn) {
            m7691f0((C2872rn) c3239un);
        }
        if (this.f32733J && !f32730S.m5753a(this, Boolean.FALSE).booleanValue()) {
            pl0 pl0Var = null;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f29555G.size()) {
                    break;
                }
                ?? r2 = (AbstractC3118tv) this.f29555G.get(i2);
                if (r2 instanceof pl0) {
                    if (i2 != this.f29555G.size() - 1) {
                        m7696c0(i2);
                    } else {
                        z = true;
                    }
                    pl0Var = r2;
                } else {
                    i2++;
                }
            }
            if (!z) {
                if (pl0Var == null) {
                    pl0Var = new pl0();
                }
                mo7699Z(pl0Var);
            }
        }
        return true;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: W */
    public boolean mo5088W() {
        if (super.mo5088W()) {
            return !this.f32734K;
        }
        return false;
    }

    @Override // com.daaw.AbstractC3261uv
    /* renamed from: Y */
    public AbstractC3118tv mo5087Y(int i, String str, String str2) {
        return C3595xv.m4496a(str, str2, null);
    }

    @Override // com.daaw.vc0
    /* renamed from: a */
    public void mo5086a(int i) {
        this.f32735L.add(Integer.valueOf(i));
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: g */
    public boolean mo5085g(C3239un c3239un, int i, od0 od0Var) {
        super.mo5085g(c3239un, i, od0Var);
        if (c3239un instanceof C2872rn) {
            m7697b0((C2872rn) c3239un, od0Var);
            return true;
        }
        return true;
    }

    /* renamed from: g0 */
    public List<Integer> m5084g0() {
        return this.f32735L;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: h */
    public String mo2456h() {
        return "Composition";
    }

    /* renamed from: h0 */
    public or1 m5083h0() {
        return this.f32732I;
    }

    /* renamed from: j0 */
    public final int m5081j0() {
        return this.f32740Q;
    }

    /* renamed from: k0 */
    public final float m5080k0() {
        return this.f32738O;
    }

    /* renamed from: l0 */
    public final float m5079l0() {
        return this.f32739P;
    }

    /* renamed from: m0 */
    public boolean m5078m0() {
        return this.f32733J;
    }

    /* renamed from: o0 */
    public void m5076o0() {
        this.f32734K = true;
    }

    /* renamed from: p0 */
    public final void m5075p0(y31 y31Var, om1 om1Var) {
        float f;
        if (om1Var == null) {
            return;
        }
        int i = this.f32740Q;
        if (om1Var.f21652b > 14000.0f) {
            float f2 = this.f32738O;
            float min = f2 > 0.01f ? Math.min(1.0f, (om1Var.f21651a / 1000.0f) / f2) : 1.0f;
            float f3 = this.f32739P;
            float max = f3 > 0.01f ? Math.max(0.0f, Math.min(1.0f, ((om1Var.f21652b - om1Var.f21651a) / 1000.0f) / f3)) : 1.0f;
            if (min < 1.0f) {
                i = this.f32740Q;
                f = 1.0f - min;
            } else if (max < 1.0f) {
                i = this.f32740Q;
                f = 1.0f - max;
            } else {
                this.f32737N = 0.0f;
            }
            this.f32737N = f;
        }
        float f4 = (this.f32736M * 0.9f) + (this.f32737N * 0.100000024f);
        this.f32736M = f4;
        if (f4 > 0.01f) {
            y31Var.m4193x(f80.m22854t(i, (int) (f80.m22866h(i) * this.f32736M)), new w31(this.f32741R, y31Var.f33263u.mo4183c(), (qr1) null, (InterfaceC1348g0<y31, sr1, w31>) null));
        }
    }

    /* renamed from: q0 */
    public final void m5074q0(int i) {
        this.f32740Q = i;
    }

    /* renamed from: r0 */
    public final void m5073r0(float f) {
        this.f32738O = f;
    }

    /* renamed from: s0 */
    public final void m5072s0(float f) {
        this.f32739P = f;
    }

    @Override // com.daaw.AbstractC3261uv, com.daaw.AbstractC3118tv
    /* renamed from: t */
    public void mo2442t(C3239un c3239un) {
        super.mo2442t(c3239un);
        this.f32741R = C1268fc.m22807a(c3239un.m7940w("introBlendMode", C1268fc.m22806b(0)), 0);
        m5073r0(c3239un.m7953o("introFadeDuration", 0.0f));
        m5072s0(c3239un.m7953o("outroFadeDuration", 0.0f));
        m5074q0(c3239un.m7947r("introFadeColor", -553648128));
    }

    /* renamed from: t0 */
    public void m5071t0(boolean z) {
        if (this.f32731H == z) {
            return;
        }
        this.f32731H = z;
        mo2451l();
    }

    /* renamed from: u0 */
    public final void m5070u0(y31 y31Var) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        y31Var.m4210T(1);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: v */
    public boolean mo2439v(y31 y31Var) {
        if (!this.f32733J) {
            this.f32731H = y31Var.f33263u.f33285a.mo2872e();
            try {
                cs1 m4221I = y31Var.m4221I();
                or1 or1Var = this.f32732I;
                if (or1Var != null) {
                    or1Var.mo7096a();
                }
                or1 m14054g = or1.m14054g(m4221I.f6162a, m4221I.f6163b, 9729, 10497, this.f32731H);
                this.f32732I = m14054g;
                if (m14054g != null) {
                    this.f32732I = m14054g.m14055f();
                }
            } catch (Exception e) {
                lz1.m16363c(e.getMessage());
            }
        }
        return super.mo2439v(y31Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: x */
    public void mo2436x(y31 y31Var) {
        super.mo2436x(y31Var);
        or1 or1Var = this.f32732I;
        if (or1Var != null) {
            or1Var.mo7096a();
        }
        this.f32732I = null;
    }

    @Override // com.daaw.AbstractC3261uv, com.daaw.AbstractC3118tv
    /* renamed from: y */
    public void mo2435y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        this.f32735L.clear();
        super.mo2435y(de0Var, e40Var, this);
        this.f32734K = false;
    }

    @Override // com.daaw.AbstractC3261uv, com.daaw.AbstractC3118tv
    /* renamed from: z */
    public void mo2434z(C3239un c3239un, od0 od0Var) {
        super.mo2434z(c3239un, od0Var);
        c3239un.m7950p0(m8790j(R.string.title_composition));
        c3239un.m7956m0("introBlendMode", C1268fc.m22806b(this.f32741R), "2_introOutro", new String[]{"Alpha", "AddAlpha"});
        c3239un.m7990O("introFadeDuration", m5080k0(), "2_introOutro", 0.0f, 10.0f);
        c3239un.m7990O("outroFadeDuration", m5079l0(), "2_introOutro", 0.0f, 10.0f);
        c3239un.m7985T("introFadeColor", m5081j0(), "2_introOutro");
    }
}
