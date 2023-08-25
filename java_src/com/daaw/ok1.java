package com.daaw;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class ok1 extends AbstractC3118tv {

    /* renamed from: O */
    public static final String[] f21603O = {"internal_0:2131230911", "internal_1:2131230912", "internal_2:2131230913", "internal_3:2131230914", "internal_4:2131230915", "internal_5:2131230916", "internal_6:2131230917", "internal_7:2131230918", "internal_8:2131230919"};

    /* renamed from: G */
    public te1 f21604G;

    /* renamed from: H */
    public String f21605H;

    /* renamed from: I */
    public int f21606I;

    /* renamed from: J */
    public int f21607J;

    /* renamed from: K */
    public String f21608K;

    /* renamed from: L */
    public int f21609L;

    /* renamed from: M */
    public final pr1 f21610M;

    /* renamed from: N */
    public InterfaceC1348g0<y31, sr1, w31> f21611N;

    /* renamed from: com.daaw.ok1$a */
    /* loaded from: classes.dex */
    public class C2446a implements InterfaceC1348g0<y31, sr1, w31> {
        public C2446a() {
        }

        @Override // com.daaw.InterfaceC1348g0
        /* renamed from: b */
        public void mo2428a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.m9964E("u_projView", false, ok1.this.f21610M.m13202a());
        }
    }

    public ok1() {
        super(0, 0.5f, 0.5f);
        this.f21605H = "{ArtistOrTitle}";
        this.f21606I = 30;
        this.f21607J = -1;
        this.f21608K = "";
        this.f21609L = 500;
        this.f21610M = new pr1();
        this.f21611N = new C2446a();
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: B */
    public void mo2460B(y31 y31Var, e40 e40Var) {
        super.mo2460B(y31Var, e40Var);
        te1 te1Var = this.f21604G;
        if (te1Var == null || !te1Var.m9227f()) {
            return;
        }
        String m27212m = y31Var.f33263u.f33286b.m27212m(this.f21605H);
        new cs1(0, 0);
        cs1 m8290b = y31Var.f33263u.m4164v().m8290b(this.f21604G, m27212m);
        RectF m8786o = m8786o(y31Var.f33263u.f33286b, m8290b);
        float m8782s = m8782s(y31Var.mo2889b().mo4185a());
        bs1 mo13311Z = mo13311Z(m8786o);
        m8794b(y31Var, this.f21610M, m8786o.left + (m8290b.f6162a * 0.5f), m8786o.top - (m8290b.f6163b * 0.5f), m8782s);
        y31Var.f33263u.m4164v().m8291a(y31Var, this.f21604G, new ds1(m8786o.left + mo13311Z.f5090a, m8786o.top + mo13311Z.f5091b, 0.0f), m27212m, this.f21607J, 0, false, 0, 0, 0, 0, new w31(m8792f(), this.f21604G.m9230c(), y31Var.f33263u.m4166t(), this.f21611N));
        mo13310e0(y31Var, m8786o);
    }

    /* renamed from: Y */
    public String m14217Y() {
        return this.f21608K;
    }

    /* renamed from: Z */
    public bs1 mo13311Z(RectF rectF) {
        return new bs1(0.0f, 0.0f);
    }

    /* renamed from: a0 */
    public void m14216a0(float f, float f2) {
        float[] fArr = {1.0f, 1.0f, 1.0f, 1.0f};
        f80.m22857q(fArr, this.f21607J);
        fArr[2] = Math.max(f2, fArr[2]);
        fArr[3] = Math.max(f, fArr[3]);
        mo13309f0(f80.m22861m(fArr));
    }

    /* renamed from: b0 */
    public void m14215b0(int i) {
        this.f21606I = Math.max(i, this.f21606I);
    }

    /* renamed from: c0 */
    public void m14214c0(C3239un c3239un) {
        m14212g0(c3239un.m7940w("typeFace", m14217Y()));
    }

    /* renamed from: d0 */
    public void m14213d0(C3239un c3239un) {
        c3239un.m7972e0("typeFace", m14217Y(), "appearance", f21603O);
    }

    /* renamed from: e0 */
    public void mo13310e0(y31 y31Var, RectF rectF) {
    }

    /* renamed from: f0 */
    public void mo13309f0(int i) {
        this.f21607J = i;
    }

    /* renamed from: g0 */
    public void m14212g0(String str) {
        if (br1.m25901h(this.f21608K, str)) {
            return;
        }
        this.f21608K = str;
        mo2451l();
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: h */
    public String mo2456h() {
        return "Text";
    }

    /* renamed from: h0 */
    public void mo13308h0(int i) {
        if (this.f21606I == i) {
            return;
        }
        this.f21606I = Math.min(500, i);
        mo2451l();
    }

    /* renamed from: i0 */
    public void m14211i0(String str) {
        this.f21605H = str;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: t */
    public void mo2442t(C3239un c3239un) {
        super.mo2442t(c3239un);
        super.m8781u(c3239un);
        m14211i0(c3239un.m7940w("text", "{ArtistOrTitle}"));
        mo13309f0(c3239un.m7947r("color", -1));
        mo13308h0(c3239un.m7947r("fontSize", 30));
        m14212g0(c3239un.m7940w("typeFace", ""));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    @Override // com.daaw.AbstractC3118tv
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo2439v(y31 y31Var) {
        AssetManager assets;
        String str;
        te1 te1Var;
        int min = Math.min((int) y31Var.mo2889b().mo4185a().m27217h(this.f21606I * 0.14f * 0.01f), this.f21609L);
        Typeface typeface = Typeface.DEFAULT;
        if (!"".equals(this.f21608K)) {
            if ("default_bold".equals(this.f21608K)) {
                typeface = Typeface.DEFAULT_BOLD;
            } else {
                Context m23837e = dx0.m23837e();
                if (m23837e != null) {
                    try {
                        if ("internal_0".equals(this.f21608K)) {
                            assets = m23837e.getAssets();
                            str = "fonts/greatvibes-regular.otf";
                        } else if ("internal_1".equals(this.f21608K)) {
                            assets = m23837e.getAssets();
                            str = "fonts/notomono-regular.ttf";
                        } else if ("internal_2".equals(this.f21608K)) {
                            assets = m23837e.getAssets();
                            str = "fonts/orbitron-medium.otf";
                        } else if ("internal_3".equals(this.f21608K)) {
                            assets = m23837e.getAssets();
                            str = "fonts/orkney-light.otf";
                        } else if ("internal_4".equals(this.f21608K)) {
                            assets = m23837e.getAssets();
                            str = "fonts/Akshar-Medium.ttf";
                        } else if ("internal_5".equals(this.f21608K)) {
                            assets = m23837e.getAssets();
                            str = "fonts/Hibana-SubMedium.otf";
                        } else if ("internal_6".equals(this.f21608K)) {
                            assets = m23837e.getAssets();
                            str = "fonts/Russo_One.ttf";
                        } else if ("internal_7".equals(this.f21608K)) {
                            assets = m23837e.getAssets();
                            str = "fonts/Space-Fray.ttf";
                        } else if ("internal_8".equals(this.f21608K)) {
                            assets = m23837e.getAssets();
                            str = "fonts/Valden.otf";
                        }
                        typeface = Typeface.createFromAsset(assets, str);
                    } catch (Exception unused) {
                    }
                }
            }
            te1Var = this.f21604G;
            if (te1Var != null) {
                te1Var.m9232a();
            }
            this.f21604G = new te1(typeface, min, C3325ve.m7236c(), C3325ve.m7227l(), C3325ve.m7233f(), C3325ve.m7232g(), C3325ve.m7234e(), C3325ve.m7228k(), C3325ve.m7231h(), C3325ve.m7237b(), C3325ve.m7230i(), C3325ve.m7229j());
            return super.mo2439v(y31Var);
        }
        typeface = Typeface.DEFAULT;
        te1Var = this.f21604G;
        if (te1Var != null) {
        }
        this.f21604G = new te1(typeface, min, C3325ve.m7236c(), C3325ve.m7227l(), C3325ve.m7233f(), C3325ve.m7232g(), C3325ve.m7234e(), C3325ve.m7228k(), C3325ve.m7231h(), C3325ve.m7237b(), C3325ve.m7230i(), C3325ve.m7229j());
        return super.mo2439v(y31Var);
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: x */
    public void mo2436x(y31 y31Var) {
        super.mo2436x(y31Var);
        te1 te1Var = this.f21604G;
        if (te1Var != null) {
            te1Var.m9232a();
        }
        this.f21604G = null;
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: z */
    public void generalItemGen(C3239un c3239un, od0 od0Var) {
        super.generalItemGen(c3239un, od0Var);
        super.m8813A(c3239un);
        c3239un.m7950p0(m8790j(R.string.title_text));
        c3239un.m7966h0("text", this.f21605H, "appearance");
        c3239un.m7985T("color", this.f21607J, "appearance");
        c3239un.m7982W("fontSize", this.f21606I, "appearance", 8, 100);
        m14213d0(c3239un);
    }
}
