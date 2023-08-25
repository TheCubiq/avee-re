package com.daaw;

import android.opengl.GLES20;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class xi extends uv<tv, un, rn> implements vc0 {
    public static ww1<Object, Boolean> S = new ww1<>();
    public boolean H;
    public or1 I;
    public final boolean J;
    public boolean K;
    public List<Integer> L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int R;

    public xi() {
        this.H = false;
        this.L = new ArrayList();
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = 0.0f;
        this.P = 0.0f;
        this.Q = -553648128;
        this.R = 0;
        this.J = false;
    }

    public xi(boolean z) {
        this.H = false;
        this.L = new ArrayList();
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = 0.0f;
        this.P = 0.0f;
        this.Q = -553648128;
        this.R = 0;
        this.J = z;
        if (z) {
            this.O = 0.0f;
            this.P = 0.0f;
        }
    }

    public static int i0(String str) {
        String[] strArr = new String[2];
        br1.B(str, 58, strArr);
        if ("composition".equals(strArr[0])) {
            return br1.x(strArr[1], -1);
        }
        return -1;
    }

    public static String n0(int i) {
        return "composition:" + i;
    }

    @Override // com.daaw.tv
    public void B(y31 y31Var, e40 e40Var) {
        t0(y31Var.u.a.e());
        C(y31Var);
        this.K = true;
        om1 i = y31Var.u.b().i();
        if (this.J) {
            super.B(y31Var, e40Var);
            d0(y31Var, e40Var);
            p0(y31Var, i);
            return;
        }
        or1 or1Var = this.I;
        if (or1Var == null) {
            return;
        }
        y31Var.i(or1Var);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        u0(y31Var);
        d0(y31Var, this.I);
        p0(y31Var, i);
    }

    @Override // com.daaw.tv
    public void F(y31 y31Var) {
        boolean z = this.J;
        super.F(y31Var);
        e0(y31Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.daaw.tv] */
    @Override // com.daaw.tv
    public boolean K(un unVar, int i) {
        super.K(unVar, i);
        if (unVar instanceof rn) {
            f0((rn) unVar);
        }
        if (this.J && !S.a(this, Boolean.FALSE).booleanValue()) {
            pl0 pl0Var = null;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.G.size()) {
                    break;
                }
                ?? r2 = (tv) this.G.get(i2);
                if (r2 instanceof pl0) {
                    if (i2 != this.G.size() - 1) {
                        c0(i2);
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
                Z(pl0Var);
            }
        }
        return true;
    }

    @Override // com.daaw.tv
    public boolean W() {
        if (super.W()) {
            return !this.K;
        }
        return false;
    }

    @Override // com.daaw.uv
    public tv Y(int i, String str, String str2) {
        return xv.a(str, str2, null);
    }

    @Override // com.daaw.vc0
    public void a(int i) {
        this.L.add(Integer.valueOf(i));
    }

    @Override // com.daaw.tv
    public boolean g(un unVar, int i, od0 od0Var) {
        super.g(unVar, i, od0Var);
        if (unVar instanceof rn) {
            b0((rn) unVar, od0Var);
            return true;
        }
        return true;
    }

    public List<Integer> g0() {
        return this.L;
    }

    @Override // com.daaw.tv
    public String h() {
        return "Composition";
    }

    public or1 h0() {
        return this.I;
    }

    public final int j0() {
        return this.Q;
    }

    public final float k0() {
        return this.O;
    }

    public final float l0() {
        return this.P;
    }

    public boolean m0() {
        return this.J;
    }

    public void o0() {
        this.K = true;
    }

    public final void p0(y31 y31Var, om1 om1Var) {
        float f;
        if (om1Var == null) {
            return;
        }
        int i = this.Q;
        if (om1Var.b > 14000.0f) {
            float f2 = this.O;
            float min = f2 > 0.01f ? Math.min(1.0f, (om1Var.a / 1000.0f) / f2) : 1.0f;
            float f3 = this.P;
            float max = f3 > 0.01f ? Math.max(0.0f, Math.min(1.0f, ((om1Var.b - om1Var.a) / 1000.0f) / f3)) : 1.0f;
            if (min < 1.0f) {
                i = this.Q;
                f = 1.0f - min;
            } else if (max < 1.0f) {
                i = this.Q;
                f = 1.0f - max;
            } else {
                this.N = 0.0f;
            }
            this.N = f;
        }
        float f4 = (this.M * 0.9f) + (this.N * 0.100000024f);
        this.M = f4;
        if (f4 > 0.01f) {
            y31Var.x(f80.t(i, (int) (f80.h(i) * this.M)), new w31(this.R, y31Var.u.c(), (qr1) null, (g0<y31, sr1, w31>) null));
        }
    }

    public final void q0(int i) {
        this.Q = i;
    }

    public final void r0(float f) {
        this.O = f;
    }

    public final void s0(float f) {
        this.P = f;
    }

    @Override // com.daaw.uv, com.daaw.tv
    public void t(un unVar) {
        super.t(unVar);
        this.R = fc.a(unVar.w("introBlendMode", fc.b(0)), 0);
        r0(unVar.o("introFadeDuration", 0.0f));
        s0(unVar.o("outroFadeDuration", 0.0f));
        q0(unVar.r("introFadeColor", -553648128));
    }

    public void t0(boolean z) {
        if (this.H == z) {
            return;
        }
        this.H = z;
        l();
    }

    public final void u0(y31 y31Var) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        y31Var.T(1);
    }

    @Override // com.daaw.tv
    public boolean v(y31 y31Var) {
        if (!this.J) {
            this.H = y31Var.u.a.e();
            try {
                cs1 I = y31Var.I();
                or1 or1Var = this.I;
                if (or1Var != null) {
                    or1Var.a();
                }
                or1 g = or1.g(I.a, I.b, 9729, 10497, this.H);
                this.I = g;
                if (g != null) {
                    this.I = g.f();
                }
            } catch (Exception e) {
                lz1.c(e.getMessage());
            }
        }
        return super.v(y31Var);
    }

    @Override // com.daaw.tv
    public void x(y31 y31Var) {
        super.x(y31Var);
        or1 or1Var = this.I;
        if (or1Var != null) {
            or1Var.a();
        }
        this.I = null;
    }

    @Override // com.daaw.uv, com.daaw.tv
    public void y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        this.L.clear();
        super.y(de0Var, e40Var, this);
        this.K = false;
    }

    @Override // com.daaw.uv, com.daaw.tv
    public void z(un unVar, od0 od0Var) {
        super.z(unVar, od0Var);
        unVar.p0(j(R.string.title_composition));
        unVar.m0("introBlendMode", fc.b(this.R), "2_introOutro", new String[]{"Alpha", "AddAlpha"});
        unVar.O("introFadeDuration", k0(), "2_introOutro", 0.0f, 10.0f);
        unVar.O("outroFadeDuration", l0(), "2_introOutro", 0.0f, 10.0f);
        unVar.T("introFadeColor", j0(), "2_introOutro");
    }
}
