package com.daaw;

import android.opengl.GLES20;
import java.util.List;
/* loaded from: classes.dex */
public class f61 extends uv<xi, rn, vn> {
    public int H;
    public int I;
    public String J;
    public boolean O;
    public int[] P;
    public boolean K = false;
    public or1[] L = new or1[1];
    public or1 M = null;
    public boolean N = false;
    public int Q = 0;
    public int R = 0;
    public int S = 0;

    public f61(String str, int i) {
        this.J = str;
        this.H = i;
        this.I = i;
    }

    @Override // com.daaw.tv
    public void B(y31 y31Var, e40 e40Var) {
        C(y31Var);
        or1[] or1VarArr = this.L;
        int i = this.S;
        if (or1VarArr[i % or1VarArr.length] == null) {
            super.B(y31Var, e40Var);
            d0(y31Var, e40Var);
            return;
        }
        r0(y31Var, or1VarArr[i % or1VarArr.length], e40Var);
        this.S++;
    }

    @Override // com.daaw.tv
    public void F(y31 y31Var) {
        super.F(y31Var);
    }

    @Override // com.daaw.uv
    public void d0(y31 y31Var, e40 e40Var) {
        q0(y31Var, e40Var, 0);
    }

    public boolean equals(Object obj) {
        return (obj instanceof f61) && this.H == ((f61) obj).H;
    }

    @Override // com.daaw.uv
    /* renamed from: g0 */
    public xi Y(int i, String str, String str2) {
        q6.d("Composition", str);
        q6.i(tv.C.equals(str2) || str2.length() == 0);
        return new xi(i == 0);
    }

    @Override // com.daaw.tv
    public String h() {
        return "Root";
    }

    @Override // com.daaw.uv
    /* renamed from: h0 */
    public void Z(xi xiVar) {
        if (this.G.size() == 0) {
            q6.i(xiVar.m0());
        }
        super.Z(xiVar);
    }

    public int hashCode() {
        return (this.H * 45) + 47;
    }

    public or1 i0(y31 y31Var, or1 or1Var) {
        try {
            cs1 I = y31Var.I();
            or1 g = or1.g(I.a, I.b, 9729, 10497, false);
            return g != null ? g.f() : g;
        } catch (Exception e) {
            lz1.c(e.getMessage());
            return or1Var;
        }
    }

    public or1 j0(or1 or1Var) {
        if (or1Var != null) {
            or1Var.a();
            return null;
        }
        return null;
    }

    public int k0() {
        return this.I;
    }

    public int[] l0() {
        return this.P;
    }

    public int m0() {
        return this.R;
    }

    public int n0() {
        return this.Q;
    }

    public String o0() {
        return this.J;
    }

    public void p0(vn vnVar, od0 od0Var) {
        if (b0(vnVar, od0Var)) {
            vnVar.t(o0());
            vnVar.q(k0());
            vnVar.s("Root");
        }
    }

    public final void q0(y31 y31Var, e40 e40Var, int i) {
        if (i >= this.G.size()) {
            return;
        }
        xi xiVar = (xi) this.G.get(i);
        if (xiVar.W()) {
            xiVar.o0();
            List<Integer> g0 = xiVar.g0();
            for (int i2 = 0; i2 < g0.size(); i2++) {
                q0(y31Var, e40Var, g0.get(i2).intValue());
            }
            xiVar.F(y31Var);
            xiVar.B(y31Var, e40Var);
            y31Var.S(i, xiVar.h0());
        }
    }

    public void r0(y31 y31Var, or1 or1Var, e40 e40Var) {
        super.B(y31Var, or1Var);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        u0(y31Var);
        d0(y31Var, or1Var);
        if (this.O) {
            int[][] iArr = {this.P};
            y31Var.i(or1Var);
            this.P = f80.i(0, 0, or1Var.getWidth(), or1Var.getHeight(), iArr);
            this.Q = or1Var.getWidth();
            this.R = or1Var.getHeight();
        }
        or1 or1Var2 = this.M;
        if (or1Var2 != null) {
            y31Var.i(or1Var2);
            y31Var.e(0);
            y31Var.p(y31Var.u.x());
            y31Var.u.x().s("resolutionW", or1Var.b().getWidth() * 1.0f);
            y31Var.u.x().s("resolutionH", or1Var.b().getHeight() * 1.0f);
            or1Var.b().c();
            y31Var.u.w().e(y31Var.u.x(), "Position");
            super.B(y31Var, this.M);
            if (this.N) {
                y31Var.w(-1, new z6(or1Var.b(), false), f());
            }
            GLES20.glFinish();
            or1Var = this.M;
        } else {
            super.B(y31Var, e40Var);
            if (this.N) {
                y31Var.w(-1, new z6(or1Var.b(), false), f());
            }
            GLES20.glFinish();
        }
        y31Var.O(or1Var.b());
    }

    public void s0(boolean z, boolean z2, int[] iArr) {
        this.O = z2;
        if (z2) {
            this.P = iArr;
        } else {
            this.P = null;
        }
        if (this.K == z) {
            return;
        }
        this.K = z;
        l();
    }

    public void t0(vn vnVar) {
        if (vnVar == null) {
            return;
        }
        this.I = vnVar.h();
        f0(vnVar);
    }

    public final void u0(y31 y31Var) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        y31Var.T(1);
    }

    @Override // com.daaw.tv
    public boolean v(y31 y31Var) {
        int i = 0;
        if (!this.K) {
            while (true) {
                or1[] or1VarArr = this.L;
                if (i >= or1VarArr.length) {
                    break;
                }
                or1VarArr[i] = j0(or1VarArr[i]);
                i++;
            }
        } else {
            while (true) {
                or1[] or1VarArr2 = this.L;
                if (i >= or1VarArr2.length) {
                    break;
                }
                or1VarArr2[i] = j0(or1VarArr2[i]);
                or1[] or1VarArr3 = this.L;
                or1VarArr3[i] = i0(y31Var, or1VarArr3[i]);
                i++;
            }
        }
        this.M = j0(this.M);
        return super.v(y31Var);
    }

    @Override // com.daaw.tv
    public void x(y31 y31Var) {
        super.x(y31Var);
        int i = 0;
        while (true) {
            or1[] or1VarArr = this.L;
            if (i >= or1VarArr.length) {
                this.M = j0(this.M);
                return;
            } else {
                or1VarArr[i] = j0(or1VarArr[i]);
                i++;
            }
        }
    }
}
