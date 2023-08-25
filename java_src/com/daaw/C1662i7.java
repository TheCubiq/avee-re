package com.daaw;

import com.daaw.avee.R;
/* renamed from: com.daaw.i7 */
/* loaded from: classes.dex */
public class C1662i7 extends AbstractC3118tv {

    /* renamed from: G */
    public fe0 f13322G;

    public C1662i7() {
        super(0, 0.5f, 0.5f);
        this.f13322G = null;
        m20045Y(null);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: B */
    public void mo2460B(y31 y31Var, e40 e40Var) {
        super.mo2460B(y31Var, e40Var);
    }

    /* renamed from: Y */
    public void m20045Y(fe0 fe0Var) {
        this.f13322G = fe0Var;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: h */
    public String mo2456h() {
        return "AudioProvider";
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: t */
    public void mo2442t(C3239un c3239un) {
        fe0 m16145a = ma1.m16145a(c3239un.m7967h("sampleProvider").m8002C("Spectrum"), this.f13322G);
        this.f13322G = m16145a;
        if (m16145a != null) {
            m16145a.mo2493a(c3239un);
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
    /* renamed from: y */
    public void mo2435y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.mo2435y(de0Var, e40Var, vc0Var);
        fe0 fe0Var = this.f13322G;
        if (fe0Var != null) {
            fe0Var.mo18684n(de0Var, de0Var.mo2889b().mo4184b());
            de0Var.mo2889b().mo4185a().m27209p(this.f13322G.mo11409c());
            de0Var.mo2889b().mo4185a().m27208q(this.f13322G.mo11408j());
        }
        de0Var.mo2889b().mo4185a().m27224a(this.f13322G);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: z */
    public void generalItemGen(C3239un c3239un, od0 od0Var) {
        c3239un.m7950p0(m8790j(R.string.title_audio_data_provider));
        c3239un.add_Dropdown("sampleProvider", ma1.m16144b(this.f13322G, "Spectrum"), "0_general", ma1.f18688a);
        fe0 fe0Var = this.f13322G;
        if (fe0Var != null) {
            fe0Var.mo2492o(c3239un);
        }
    }
}
