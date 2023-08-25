package com.daaw;

import android.graphics.Bitmap;
import com.daaw.vv;
/* loaded from: classes.dex */
public abstract class xe0 extends tv {
    public vv G;
    public i2 H;
    public xn0 I;
    public boolean J;
    public boolean K;
    public boolean L;

    /* loaded from: classes.dex */
    public class a implements vv.b {
        public a() {
        }

        @Override // com.daaw.vv.b
        public void a() {
            xe0.this.m();
        }
    }

    /* loaded from: classes.dex */
    public class b implements r40<de0, i2> {
        public b() {
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public i2 a(de0 de0Var) {
            if (de0Var != null) {
                xe0.this.H = de0Var.b().b().k();
            }
            return xe0.this.H;
        }
    }

    public xe0() {
        super(0, 1.0f, 1.0f);
        this.H = null;
        this.I = new xn0("TotalTimeAndBeat", 0.5f, 0.5f);
        this.J = false;
        this.K = false;
        this.L = false;
        R(1.0f, 1.0f);
    }

    @Override // com.daaw.tv
    public void B(y31 y31Var, e40 e40Var) {
        super.B(y31Var, e40Var);
        this.G.u(y31Var, e40Var);
        a0(y31Var);
    }

    public boolean Y() {
        return this.G.l();
    }

    public void Z(s40<y31, Bitmap, Bitmap> s40Var, s40<y31, Bitmap, Bitmap> s40Var2) {
        this.G = new vv(new a(), new b(), s40Var, s40Var2);
    }

    public abstract void a0(y31 y31Var);

    public void b0(int i) {
        this.G.w(i);
        this.J = (i & 1) != 0;
        this.K = (i & 2) != 0;
        this.L = (i & 4) != 0;
    }

    public void c0(String str) {
        this.G.C(str);
    }

    public void d0(int i) {
        this.G.D(i);
    }

    public void e0(boolean z) {
        this.G.E(z);
    }

    @Override // com.daaw.tv
    public void l() {
        super.l();
        vv vvVar = this.G;
        if (vvVar != null) {
            vvVar.p();
        }
    }

    @Override // com.daaw.tv
    public void t(un unVar) {
        super.t(unVar);
        super.u(unVar);
        c0(unVar.w("customImage", null));
        int r = unVar.r("generatedAlbumArtHint", 0);
        this.J = unVar.n("generatedAlbumArtHintShiftHue", (r & 1) != 0);
        this.K = unVar.n("generatedAlbumArtHintNoText", (r & 2) != 0);
        boolean n = unVar.n("generatedAlbumArtHintForceGen", (r & 4) != 0);
        this.L = n;
        b0((this.J ? 1 : 0) | (this.K ? 2 : 0) | (n ? 4 : 0));
        d0(unVar.r("generatedAlbumArtColor", -1));
        e0(unVar.n("keepAspectRatioAndCropToFit", false));
        this.G.z(unVar.n("colorKeyEnabled", false));
        this.G.x(unVar.n("autoDetectColorKey", true));
        this.G.y(unVar.r("colorKey", -16711936));
        this.G.B(unVar.o("transparencyStrength", 1.0f));
        this.G.A(unVar.o("opacityStrength", 1.0f));
        this.I.n(unVar.h("measureAnimationSpeed"), "TotalTimeAndBeat", 0.5f, 0.5f);
    }

    @Override // com.daaw.tv
    public boolean v(y31 y31Var) {
        super.v(y31Var);
        this.G.q(y31Var, n(y31Var.u.b), 0);
        return false;
    }

    @Override // com.daaw.tv
    public void w(y31 y31Var, int i) {
        this.G.r(y31Var, i);
    }

    @Override // com.daaw.tv
    public void x(y31 y31Var) {
        super.x(y31Var);
        vv vvVar = this.G;
        if (vvVar != null) {
            vvVar.s(y31Var);
        }
    }

    @Override // com.daaw.tv
    public void y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.y(de0Var, e40Var, vc0Var);
        this.G.t(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.tv
    public void z(un unVar, od0 od0Var) {
        super.z(unVar, od0Var);
        super.A(unVar);
        od0Var.a(this.G.j());
        unVar.f0("customImage", this.G.j(), "1_image", vv.s);
        this.I.o(unVar.F("measureAnimationSpeed", "", "1_image", new String[0]));
        unVar.X("generatedAlbumArtHint", this.G.g(), "generatedAlbumArt", 0, 7);
        unVar.L("generatedAlbumArtHintShiftHue", (this.G.g() & 1) != 0, "generatedAlbumArt");
        unVar.L("generatedAlbumArtHintNoText", (this.G.g() & 2) != 0, "generatedAlbumArt");
        unVar.L("generatedAlbumArtHintForceGen", (this.G.g() & 4) != 0, "generatedAlbumArt");
        unVar.T("generatedAlbumArtColor", this.G.k(), "generatedAlbumArt");
        unVar.L("keepAspectRatioAndCropToFit", this.G.l(), "1_image");
        unVar.L("colorKeyEnabled", this.G.h(), "2_ColorKey");
        unVar.L("autoDetectColorKey", this.G.i().b, "2_ColorKey");
        unVar.U("colorKey", this.G.i().a, "2_ColorKey");
        unVar.O("transparencyStrength", this.G.i().c, "2_ColorKey", 0.0f, 4.0f);
        unVar.O("opacityStrength", this.G.i().d, "2_ColorKey", 0.0f, 4.0f);
    }
}
