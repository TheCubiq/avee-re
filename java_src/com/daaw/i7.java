package com.daaw;

import com.daaw.avee.R;
/* loaded from: classes.dex */
public class i7 extends tv {
    public fe0 G;

    public i7() {
        super(0, 0.5f, 0.5f);
        this.G = null;
        Y(null);
    }

    @Override // com.daaw.tv
    public void B(y31 y31Var, e40 e40Var) {
        super.B(y31Var, e40Var);
    }

    public void Y(fe0 fe0Var) {
        this.G = fe0Var;
    }

    @Override // com.daaw.tv
    public String h() {
        return "AudioProvider";
    }

    @Override // com.daaw.tv
    public void t(un unVar) {
        fe0 a = ma1.a(unVar.h("sampleProvider").C("Spectrum"), this.G);
        this.G = a;
        if (a != null) {
            a.a(unVar);
        }
    }

    @Override // com.daaw.tv
    public boolean v(y31 y31Var) {
        return super.v(y31Var);
    }

    @Override // com.daaw.tv
    public void x(y31 y31Var) {
        super.x(y31Var);
    }

    @Override // com.daaw.tv
    public void y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.y(de0Var, e40Var, vc0Var);
        fe0 fe0Var = this.G;
        if (fe0Var != null) {
            fe0Var.n(de0Var, de0Var.b().b());
            de0Var.b().a().p(this.G.c());
            de0Var.b().a().q(this.G.j());
        }
        de0Var.b().a().a(this.G);
    }

    @Override // com.daaw.tv
    public void z(un unVar, od0 od0Var) {
        unVar.p0(j(R.string.title_audio_data_provider));
        unVar.F("sampleProvider", ma1.b(this.G, "Spectrum"), "0_general", ma1.a);
        fe0 fe0Var = this.G;
        if (fe0Var != null) {
            fe0Var.o(unVar);
        }
    }
}
