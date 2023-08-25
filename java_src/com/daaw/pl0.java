package com.daaw;

import android.graphics.RectF;
import android.net.Uri;
import com.daaw.avee.R;
import com.daaw.vv;
/* loaded from: classes.dex */
public class pl0 extends ok1 {
    public static ww1<Object, Boolean> X = new ww1<>();
    public vv Q;
    public i2 P = new i2(Uri.EMPTY, "internalres:anim128_g_m10_15", "");
    public int R = 0;
    public float S = 0.0f;
    public float[] T = new float[4];
    public float U = 0.0f;
    public final float V = 2.4f;
    public final int W = 26;

    /* loaded from: classes.dex */
    public class a implements vv.b {
        public a() {
        }

        @Override // com.daaw.vv.b
        public void a() {
            pl0.this.m();
        }
    }

    /* loaded from: classes.dex */
    public class b implements r40<de0, i2> {
        public b() {
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public i2 a(de0 de0Var) {
            return pl0.this.P;
        }
    }

    public pl0() {
        vv vvVar = new vv(new a(), new b(), null, null);
        this.Q = vvVar;
        vvVar.z(true);
        f0(-1869574000);
        J(4);
        h0(26);
        g0("internal_3");
        i0("{MarkedArtistAndTitle}");
        N(0.0f, 1.0f);
        L(0.0f, 1.2f);
        P(true, false);
    }

    @Override // com.daaw.ok1, com.daaw.tv
    public void B(y31 y31Var, e40 e40Var) {
        super.B(y31Var, e40Var);
        this.Q.u(y31Var, e40Var);
    }

    @Override // com.daaw.tv
    public void M(bs1 bs1Var) {
        super.M(bs1Var);
    }

    @Override // com.daaw.tv
    public void O(bs1 bs1Var) {
        super.O(bs1Var);
    }

    @Override // com.daaw.tv
    public boolean W() {
        return super.W();
    }

    @Override // com.daaw.ok1
    public bs1 Z(RectF rectF) {
        float a2 = mv.a(0.0f, this.S, 0.0f, 1.0f, 1.0f);
        float height = rectF.height() * 0.0f;
        return new bs1((-height) + (((rectF.height() * 1.05f * 2.4f) + (rectF.height() * 0.15f * 2.4f) + height) * ((a2 * 0.5f) + 0.5f)), rectF.height() * (-0.16f) * 2.4f);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    @Override // com.daaw.ok1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e0(com.daaw.y31 r15, android.graphics.RectF r16) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.pl0.e0(com.daaw.y31, android.graphics.RectF):void");
    }

    @Override // com.daaw.ok1
    public void f0(int i) {
        super.f0(i);
        f80.n(this.T, i);
    }

    @Override // com.daaw.ok1, com.daaw.tv
    public String h() {
        return "AppLogo";
    }

    @Override // com.daaw.ok1
    public void h0(int i) {
        super.h0(i);
    }

    public void j0() {
        if (this.R == 0) {
            return;
        }
        this.R = 3;
    }

    public void k0() {
        if (this.R == 2) {
            return;
        }
        this.R = 1;
    }

    @Override // com.daaw.tv
    public void l() {
        super.l();
        vv vvVar = this.Q;
        if (vvVar != null) {
            vvVar.p();
        }
    }

    public void n0(int i) {
        super.f0(i);
    }

    @Override // com.daaw.ok1, com.daaw.tv
    public void t(un unVar) {
        super.c0(unVar);
        V(unVar.n("visible", true));
        f0(unVar.r("color", -1869574000));
        P(true, false);
        if (X.a(this, Boolean.FALSE).booleanValue()) {
            return;
        }
        a0(0.56f, 0.56f);
        b0(26);
        N(0.0f, 1.0f);
        L(0.0f, 1.2f);
    }

    @Override // com.daaw.ok1, com.daaw.tv
    public boolean v(y31 y31Var) {
        super.v(y31Var);
        this.Q.q(y31Var, q(y31Var.u.b), 0);
        return false;
    }

    @Override // com.daaw.tv
    public void w(y31 y31Var, int i) {
        this.Q.r(y31Var, i);
    }

    @Override // com.daaw.ok1, com.daaw.tv
    public void x(y31 y31Var) {
        super.x(y31Var);
        vv vvVar = this.Q;
        if (vvVar != null) {
            vvVar.s(y31Var);
        }
    }

    @Override // com.daaw.tv
    public void y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.y(de0Var, e40Var, vc0Var);
        this.Q.t(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.ok1, com.daaw.tv
    public void z(un unVar, od0 od0Var) {
        super.d0(unVar);
        unVar.p0(j(R.string.title_app_logo));
        unVar.L("visible", this.k, "0_general");
        unVar.s0("visible", "pb", "AppLogo");
        unVar.T("color", f80.f(this.T), "0_general");
        if (X.a(this, Boolean.FALSE).booleanValue()) {
            return;
        }
        unVar.n0("position");
    }
}
