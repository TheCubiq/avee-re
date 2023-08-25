package com.daaw;

import android.opengl.GLES20;
import java.util.List;
/* loaded from: classes.dex */
public class f61 extends AbstractC3261uv<C3543xi, C2872rn, C3355vn> {

    /* renamed from: H */
    public int f9176H;

    /* renamed from: I */
    public int f9177I;

    /* renamed from: J */
    public String f9178J;

    /* renamed from: O */
    public boolean f9183O;

    /* renamed from: P */
    public int[] f9184P;

    /* renamed from: K */
    public boolean f9179K = false;

    /* renamed from: L */
    public or1[] f9180L = new or1[1];

    /* renamed from: M */
    public or1 f9181M = null;

    /* renamed from: N */
    public boolean f9182N = false;

    /* renamed from: Q */
    public int f9185Q = 0;

    /* renamed from: R */
    public int f9186R = 0;

    /* renamed from: S */
    public int f9187S = 0;

    public f61(String str, int i) {
        this.f9178J = str;
        this.f9176H = i;
        this.f9177I = i;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: B */
    public void mo2460B(y31 y31Var, e40 e40Var) {
        m8812C(y31Var);
        or1[] or1VarArr = this.f9180L;
        int i = this.f9187S;
        if (or1VarArr[i % or1VarArr.length] == null) {
            super.mo2460B(y31Var, e40Var);
            mo7694d0(y31Var, e40Var);
            return;
        }
        m22889r0(y31Var, or1VarArr[i % or1VarArr.length], e40Var);
        this.f9187S++;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: F */
    public void mo5090F(y31 y31Var) {
        super.mo5090F(y31Var);
    }

    @Override // com.daaw.AbstractC3261uv
    /* renamed from: d0 */
    public void mo7694d0(y31 y31Var, e40 e40Var) {
        m22890q0(y31Var, e40Var, 0);
    }

    public boolean equals(Object obj) {
        return (obj instanceof f61) && this.f9176H == ((f61) obj).f9176H;
    }

    @Override // com.daaw.AbstractC3261uv
    /* renamed from: g0 */
    public C3543xi mo5087Y(int i, String str, String str2) {
        C2691q6.m12754d("Composition", str);
        C2691q6.m12749i(AbstractC3118tv.f28110C.equals(str2) || str2.length() == 0);
        return new C3543xi(i == 0);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: h */
    public String mo2456h() {
        return "Root";
    }

    @Override // com.daaw.AbstractC3261uv
    /* renamed from: h0 */
    public void mo7699Z(C3543xi c3543xi) {
        if (this.f29555G.size() == 0) {
            C2691q6.m12749i(c3543xi.m5078m0());
        }
        super.mo7699Z(c3543xi);
    }

    public int hashCode() {
        return (this.f9176H * 45) + 47;
    }

    /* renamed from: i0 */
    public or1 m22898i0(y31 y31Var, or1 or1Var) {
        try {
            cs1 m4221I = y31Var.m4221I();
            or1 m14054g = or1.m14054g(m4221I.f6162a, m4221I.f6163b, 9729, 10497, false);
            return m14054g != null ? m14054g.m14055f() : m14054g;
        } catch (Exception e) {
            lz1.m16363c(e.getMessage());
            return or1Var;
        }
    }

    /* renamed from: j0 */
    public or1 m22897j0(or1 or1Var) {
        if (or1Var != null) {
            or1Var.mo7096a();
            return null;
        }
        return null;
    }

    /* renamed from: k0 */
    public int m22896k0() {
        return this.f9177I;
    }

    /* renamed from: l0 */
    public int[] m22895l0() {
        return this.f9184P;
    }

    /* renamed from: m0 */
    public int m22894m0() {
        return this.f9186R;
    }

    /* renamed from: n0 */
    public int m22893n0() {
        return this.f9185Q;
    }

    /* renamed from: o0 */
    public String m22892o0() {
        return this.f9178J;
    }

    /* renamed from: p0 */
    public void m22891p0(C3355vn c3355vn, od0 od0Var) {
        if (m7697b0(c3355vn, od0Var)) {
            c3355vn.m7000t(m22892o0());
            c3355vn.m7003q(m22896k0());
            c3355vn.m7001s("Root");
        }
    }

    /* renamed from: q0 */
    public final void m22890q0(y31 y31Var, e40 e40Var, int i) {
        if (i >= this.f29555G.size()) {
            return;
        }
        C3543xi c3543xi = (C3543xi) this.f29555G.get(i);
        if (c3543xi.mo5088W()) {
            c3543xi.m5076o0();
            List<Integer> m5084g0 = c3543xi.m5084g0();
            for (int i2 = 0; i2 < m5084g0.size(); i2++) {
                m22890q0(y31Var, e40Var, m5084g0.get(i2).intValue());
            }
            c3543xi.mo5090F(y31Var);
            c3543xi.mo2460B(y31Var, e40Var);
            y31Var.m4211S(i, c3543xi.m5083h0());
        }
    }

    /* renamed from: r0 */
    public void m22889r0(y31 y31Var, or1 or1Var, e40 e40Var) {
        super.mo2460B(y31Var, or1Var);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        m22886u0(y31Var);
        mo7694d0(y31Var, or1Var);
        if (this.f9183O) {
            int[][] iArr = {this.f9184P};
            y31Var.mo2882i(or1Var);
            this.f9184P = f80.m22865i(0, 0, or1Var.getWidth(), or1Var.getHeight(), iArr);
            this.f9185Q = or1Var.getWidth();
            this.f9186R = or1Var.getHeight();
        }
        or1 or1Var2 = this.f9181M;
        if (or1Var2 != null) {
            y31Var.mo2882i(or1Var2);
            y31Var.mo2886e(0);
            y31Var.m4201p(y31Var.f33263u.m4162x());
            y31Var.f33263u.m4162x().m24539s("resolutionW", or1Var.mo7095b().getWidth() * 1.0f);
            y31Var.f33263u.m4162x().m24539s("resolutionH", or1Var.mo7095b().getHeight() * 1.0f);
            or1Var.mo7095b().m7094c();
            y31Var.f33263u.m4163w().m12779e(y31Var.f33263u.m4162x(), "Position");
            super.mo2460B(y31Var, this.f9181M);
            if (this.f9182N) {
                y31Var.m4194w(-1, new C3812z6(or1Var.mo7095b(), false), m8792f());
            }
            GLES20.glFinish();
            or1Var = this.f9181M;
        } else {
            super.mo2460B(y31Var, e40Var);
            if (this.f9182N) {
                y31Var.m4194w(-1, new C3812z6(or1Var.mo7095b(), false), m8792f());
            }
            GLES20.glFinish();
        }
        y31Var.m4215O(or1Var.mo7095b());
    }

    /* renamed from: s0 */
    public void m22888s0(boolean z, boolean z2, int[] iArr) {
        this.f9183O = z2;
        if (z2) {
            this.f9184P = iArr;
        } else {
            this.f9184P = null;
        }
        if (this.f9179K == z) {
            return;
        }
        this.f9179K = z;
        mo2451l();
    }

    /* renamed from: t0 */
    public void m22887t0(C3355vn c3355vn) {
        if (c3355vn == null) {
            return;
        }
        this.f9177I = c3355vn.m7012h();
        m7691f0(c3355vn);
    }

    /* renamed from: u0 */
    public final void m22886u0(y31 y31Var) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        y31Var.m4210T(1);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: v */
    public boolean mo2439v(y31 y31Var) {
        int i = 0;
        if (!this.f9179K) {
            while (true) {
                or1[] or1VarArr = this.f9180L;
                if (i >= or1VarArr.length) {
                    break;
                }
                or1VarArr[i] = m22897j0(or1VarArr[i]);
                i++;
            }
        } else {
            while (true) {
                or1[] or1VarArr2 = this.f9180L;
                if (i >= or1VarArr2.length) {
                    break;
                }
                or1VarArr2[i] = m22897j0(or1VarArr2[i]);
                or1[] or1VarArr3 = this.f9180L;
                or1VarArr3[i] = m22898i0(y31Var, or1VarArr3[i]);
                i++;
            }
        }
        this.f9181M = m22897j0(this.f9181M);
        return super.mo2439v(y31Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: x */
    public void mo2436x(y31 y31Var) {
        super.mo2436x(y31Var);
        int i = 0;
        while (true) {
            or1[] or1VarArr = this.f9180L;
            if (i >= or1VarArr.length) {
                this.f9181M = m22897j0(this.f9181M);
                return;
            } else {
                or1VarArr[i] = m22897j0(or1VarArr[i]);
                i++;
            }
        }
    }
}
