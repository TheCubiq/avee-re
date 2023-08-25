package com.daaw;

import android.graphics.RectF;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class ok1 extends tv {
    public static final String[] O = {"internal_0:2131230911", "internal_1:2131230912", "internal_2:2131230913", "internal_3:2131230914", "internal_4:2131230915", "internal_5:2131230916", "internal_6:2131230917", "internal_7:2131230918", "internal_8:2131230919"};
    public te1 G;
    public String H;
    public int I;
    public int J;
    public String K;
    public int L;
    public final pr1 M;
    public g0<y31, sr1, w31> N;

    /* loaded from: classes.dex */
    public class a implements g0<y31, sr1, w31> {
        public a() {
        }

        @Override // com.daaw.g0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.E("u_projView", false, ok1.this.M.a());
        }
    }

    public ok1() {
        super(0, 0.5f, 0.5f);
        this.H = "{ArtistOrTitle}";
        this.I = 30;
        this.J = -1;
        this.K = "";
        this.L = 500;
        this.M = new pr1();
        this.N = new a();
    }

    @Override // com.daaw.tv
    public void B(y31 y31Var, e40 e40Var) {
        super.B(y31Var, e40Var);
        te1 te1Var = this.G;
        if (te1Var == null || !te1Var.f()) {
            return;
        }
        String m = y31Var.u.b.m(this.H);
        new cs1(0, 0);
        cs1 b = y31Var.u.v().b(this.G, m);
        RectF o = o(y31Var.u.b, b);
        float s = s(y31Var.b().a());
        bs1 Z = Z(o);
        b(y31Var, this.M, o.left + (b.a * 0.5f), o.top - (b.b * 0.5f), s);
        y31Var.u.v().a(y31Var, this.G, new ds1(o.left + Z.a, o.top + Z.b, 0.0f), m, this.J, 0, false, 0, 0, 0, 0, new w31(f(), this.G.c(), y31Var.u.t(), this.N));
        e0(y31Var, o);
    }

    public String Y() {
        return this.K;
    }

    public bs1 Z(RectF rectF) {
        return new bs1(0.0f, 0.0f);
    }

    public void a0(float f, float f2) {
        float[] fArr = {1.0f, 1.0f, 1.0f, 1.0f};
        f80.q(fArr, this.J);
        fArr[2] = Math.max(f2, fArr[2]);
        fArr[3] = Math.max(f, fArr[3]);
        f0(f80.m(fArr));
    }

    public void b0(int i) {
        this.I = Math.max(i, this.I);
    }

    public void c0(un unVar) {
        g0(unVar.w("typeFace", Y()));
    }

    public void d0(un unVar) {
        unVar.e0("typeFace", Y(), "appearance", O);
    }

    public void e0(y31 y31Var, RectF rectF) {
    }

    public void f0(int i) {
        this.J = i;
    }

    public void g0(String str) {
        if (br1.h(this.K, str)) {
            return;
        }
        this.K = str;
        l();
    }

    @Override // com.daaw.tv
    public String h() {
        return "Text";
    }

    public void h0(int i) {
        if (this.I == i) {
            return;
        }
        this.I = Math.min(500, i);
        l();
    }

    public void i0(String str) {
        this.H = str;
    }

    @Override // com.daaw.tv
    public void t(un unVar) {
        super.t(unVar);
        super.u(unVar);
        i0(unVar.w("text", "{ArtistOrTitle}"));
        f0(unVar.r("color", -1));
        h0(unVar.r("fontSize", 30));
        g0(unVar.w("typeFace", ""));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    @Override // com.daaw.tv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean v(com.daaw.y31 r7) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ok1.v(com.daaw.y31):boolean");
    }

    @Override // com.daaw.tv
    public void x(y31 y31Var) {
        super.x(y31Var);
        te1 te1Var = this.G;
        if (te1Var != null) {
            te1Var.a();
        }
        this.G = null;
    }

    @Override // com.daaw.tv
    public void z(un unVar, od0 od0Var) {
        super.z(unVar, od0Var);
        super.A(unVar);
        unVar.p0(j(R.string.title_text));
        unVar.h0("text", this.H, "appearance");
        unVar.T("color", this.J, "appearance");
        unVar.W("fontSize", this.I, "appearance", 8, 100);
        d0(unVar);
    }
}
