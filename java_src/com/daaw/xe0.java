package com.daaw;

import android.graphics.Bitmap;
import com.daaw.C3376vv;
/* loaded from: classes.dex */
public abstract class xe0 extends AbstractC3118tv {

    /* renamed from: G */
    public C3376vv f32598G;

    /* renamed from: H */
    public C1652i2 f32599H;

    /* renamed from: I */
    public xn0 f32600I;

    /* renamed from: J */
    public boolean f32601J;

    /* renamed from: K */
    public boolean f32602K;

    /* renamed from: L */
    public boolean f32603L;

    /* renamed from: com.daaw.xe0$a */
    /* loaded from: classes.dex */
    public class C3532a implements C3376vv.InterfaceC3378b {
        public C3532a() {
        }

        @Override // com.daaw.C3376vv.InterfaceC3378b
        /* renamed from: a */
        public void mo2430a() {
            xe0.this.m8788m();
        }
    }

    /* renamed from: com.daaw.xe0$b */
    /* loaded from: classes.dex */
    public class C3533b implements r40<de0, C1652i2> {
        public C3533b() {
        }

        @Override // com.daaw.r40
        /* renamed from: b */
        public C1652i2 mo5050a(de0 de0Var) {
            if (de0Var != null) {
                xe0.this.f32599H = de0Var.mo2889b().mo4184b().mo2866k();
            }
            return xe0.this.f32599H;
        }
    }

    public xe0() {
        super(0, 1.0f, 1.0f);
        this.f32599H = null;
        this.f32600I = new xn0("TotalTimeAndBeat", 0.5f, 0.5f);
        this.f32601J = false;
        this.f32602K = false;
        this.f32603L = false;
        m8800R(1.0f, 1.0f);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: B */
    public void mo2460B(y31 y31Var, e40 e40Var) {
        super.mo2460B(y31Var, e40Var);
        this.f32598G.m6746u(y31Var, e40Var);
        mo2459a0(y31Var);
    }

    /* renamed from: Y */
    public boolean m5196Y() {
        return this.f32598G.m6755l();
    }

    /* renamed from: Z */
    public void m5195Z(s40<y31, Bitmap, Bitmap> s40Var, s40<y31, Bitmap, Bitmap> s40Var2) {
        this.f32598G = new C3376vv(new C3532a(), new C3533b(), s40Var, s40Var2);
    }

    /* renamed from: a0 */
    public abstract void mo2459a0(y31 y31Var);

    /* renamed from: b0 */
    public void m5194b0(int i) {
        this.f32598G.m6744w(i);
        this.f32601J = (i & 1) != 0;
        this.f32602K = (i & 2) != 0;
        this.f32603L = (i & 4) != 0;
    }

    /* renamed from: c0 */
    public void m5193c0(String str) {
        this.f32598G.m6768C(str);
    }

    /* renamed from: d0 */
    public void m5192d0(int i) {
        this.f32598G.m6767D(i);
    }

    /* renamed from: e0 */
    public void m5191e0(boolean z) {
        this.f32598G.m6766E(z);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: l */
    public void mo2451l() {
        super.mo2451l();
        C3376vv c3376vv = this.f32598G;
        if (c3376vv != null) {
            c3376vv.m6751p();
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: t */
    public void mo2442t(C3239un c3239un) {
        super.mo2442t(c3239un);
        super.m8781u(c3239un);
        m5193c0(c3239un.m7940w("customImage", null));
        int m7947r = c3239un.m7947r("generatedAlbumArtHint", 0);
        this.f32601J = c3239un.m7955n("generatedAlbumArtHintShiftHue", (m7947r & 1) != 0);
        this.f32602K = c3239un.m7955n("generatedAlbumArtHintNoText", (m7947r & 2) != 0);
        boolean m7955n = c3239un.m7955n("generatedAlbumArtHintForceGen", (m7947r & 4) != 0);
        this.f32603L = m7955n;
        m5194b0((this.f32601J ? 1 : 0) | (this.f32602K ? 2 : 0) | (m7955n ? 4 : 0));
        m5192d0(c3239un.m7947r("generatedAlbumArtColor", -1));
        m5191e0(c3239un.m7955n("keepAspectRatioAndCropToFit", false));
        this.f32598G.m6741z(c3239un.m7955n("colorKeyEnabled", false));
        this.f32598G.m6743x(c3239un.m7955n("autoDetectColorKey", true));
        this.f32598G.m6742y(c3239un.m7947r("colorKey", -16711936));
        this.f32598G.m6769B(c3239un.m7953o("transparencyStrength", 1.0f));
        this.f32598G.m6770A(c3239un.m7953o("opacityStrength", 1.0f));
        this.f32600I.m4959n(c3239un.m7967h("measureAnimationSpeed"), "TotalTimeAndBeat", 0.5f, 0.5f);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: v */
    public boolean mo2439v(y31 y31Var) {
        super.mo2439v(y31Var);
        this.f32598G.m6750q(y31Var, m8787n(y31Var.f33263u.f33286b), 0);
        return false;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: w */
    public void mo2437w(y31 y31Var, int i) {
        this.f32598G.m6749r(y31Var, i);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: x */
    public void mo2436x(y31 y31Var) {
        super.mo2436x(y31Var);
        C3376vv c3376vv = this.f32598G;
        if (c3376vv != null) {
            c3376vv.m6748s(y31Var);
        }
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: y */
    public void mo2435y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.mo2435y(de0Var, e40Var, vc0Var);
        this.f32598G.m6747t(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: z */
    public void mo2434z(C3239un c3239un, od0 od0Var) {
        super.mo2434z(c3239un, od0Var);
        super.m8813A(c3239un);
        od0Var.mo14380a(this.f32598G.m6757j());
        c3239un.m7970f0("customImage", this.f32598G.m6757j(), "1_image", C3376vv.f30614s);
        this.f32600I.m4958o(c3239un.m7999F("measureAnimationSpeed", "", "1_image", new String[0]));
        c3239un.m7981X("generatedAlbumArtHint", this.f32598G.m6760g(), "generatedAlbumArt", 0, 7);
        c3239un.m7993L("generatedAlbumArtHintShiftHue", (this.f32598G.m6760g() & 1) != 0, "generatedAlbumArt");
        c3239un.m7993L("generatedAlbumArtHintNoText", (this.f32598G.m6760g() & 2) != 0, "generatedAlbumArt");
        c3239un.m7993L("generatedAlbumArtHintForceGen", (this.f32598G.m6760g() & 4) != 0, "generatedAlbumArt");
        c3239un.m7985T("generatedAlbumArtColor", this.f32598G.m6756k(), "generatedAlbumArt");
        c3239un.m7993L("keepAspectRatioAndCropToFit", this.f32598G.m6755l(), "1_image");
        c3239un.m7993L("colorKeyEnabled", this.f32598G.m6759h(), "2_ColorKey");
        c3239un.m7993L("autoDetectColorKey", this.f32598G.m6758i().f33565b, "2_ColorKey");
        c3239un.m7984U("colorKey", this.f32598G.m6758i().f33564a, "2_ColorKey");
        c3239un.m7990O("transparencyStrength", this.f32598G.m6758i().f33566c, "2_ColorKey", 0.0f, 4.0f);
        c3239un.m7990O("opacityStrength", this.f32598G.m6758i().f33567d, "2_ColorKey", 0.0f, 4.0f);
    }
}
