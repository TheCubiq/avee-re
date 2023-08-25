package com.daaw;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.daaw.C3376vv;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class ze0 extends xe0 {

    /* renamed from: Z */
    public C3376vv f34981Z;

    /* renamed from: M */
    public float[] f34968M = {1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: N */
    public float[] f34969N = {1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: O */
    public xn0 f34970O = xn0.m4972a();

    /* renamed from: P */
    public dm0 f34971P = dm0.m24232a(1.0f);

    /* renamed from: Q */
    public boolean f34972Q = false;

    /* renamed from: R */
    public int f34973R = 5;

    /* renamed from: S */
    public int f34974S = 7;

    /* renamed from: T */
    public boolean f34975T = false;

    /* renamed from: U */
    public boolean f34976U = true;

    /* renamed from: V */
    public ge0 f34977V = null;

    /* renamed from: W */
    public float[] f34978W = new float[4];

    /* renamed from: X */
    public float[] f34979X = new float[4];

    /* renamed from: Y */
    public final pr1 f34980Y = new pr1();

    /* renamed from: a0 */
    public int f34982a0 = 0;

    /* renamed from: b0 */
    public InterfaceC1348g0<y31, sr1, w31> f34983b0 = new C3834d();

    /* renamed from: c0 */
    public InterfaceC1348g0<y31, sr1, w31> f34984c0 = new C3835e();

    /* renamed from: com.daaw.ze0$a */
    /* loaded from: classes.dex */
    public class C3831a implements s40<y31, Bitmap, Bitmap> {
        public C3831a() {
        }

        @Override // com.daaw.s40
        /* renamed from: b */
        public Bitmap mo2432a(y31 y31Var, Bitmap bitmap) {
            String str;
            bitmap.getConfig();
            if (ze0.this.f34972Q) {
                int min = Math.min(1 << ze0.this.f34973R, 512);
                int width = (int) (min * (bitmap.getWidth() / bitmap.getHeight()));
                try {
                    return j00.m19214a((width <= 0 || min <= 0) ? bitmap : Bitmap.createScaledBitmap(bitmap, width, min, true), ze0.this.f34974S);
                } catch (Exception e) {
                    str = "Art blurring failed: " + e.getMessage();
                    lz1.m16363c(str);
                    return bitmap;
                } catch (OutOfMemoryError unused) {
                    str = "Art blurring failed: OutOfMemoryError";
                    lz1.m16363c(str);
                    return bitmap;
                }
            }
            return bitmap;
        }
    }

    /* renamed from: com.daaw.ze0$b */
    /* loaded from: classes.dex */
    public class C3832b implements s40<y31, Bitmap, Bitmap> {
        public C3832b() {
        }

        @Override // com.daaw.s40
        /* renamed from: b */
        public Bitmap mo2432a(y31 y31Var, Bitmap bitmap) {
            String str;
            if (ze0.this.f34975T && ze0.this.f34976U) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 32, 32, true);
                try {
                    return j00.m19214a(createScaledBitmap, 7);
                } catch (Exception e) {
                    str = "Art blurring failed: " + e.getMessage();
                    lz1.m16363c(str);
                    return createScaledBitmap;
                } catch (OutOfMemoryError unused) {
                    str = "Art blurring failed: OutOfMemoryError";
                    lz1.m16363c(str);
                    return createScaledBitmap;
                }
            }
            return null;
        }
    }

    /* renamed from: com.daaw.ze0$c */
    /* loaded from: classes.dex */
    public class C3833c implements C3376vv.InterfaceC3378b {
        public C3833c() {
        }

        @Override // com.daaw.C3376vv.InterfaceC3378b
        /* renamed from: a */
        public void mo2430a() {
            ze0.this.m8788m();
        }
    }

    /* renamed from: com.daaw.ze0$d */
    /* loaded from: classes.dex */
    public class C3834d implements InterfaceC1348g0<y31, sr1, w31> {
        public C3834d() {
        }

        @Override // com.daaw.InterfaceC1348g0
        /* renamed from: b */
        public void mo2428a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.m9964E("u_projView", false, ze0.this.f34980Y.m13202a());
        }
    }

    /* renamed from: com.daaw.ze0$e */
    /* loaded from: classes.dex */
    public class C3835e implements InterfaceC1348g0<y31, sr1, w31> {
        public C3835e() {
        }

        @Override // com.daaw.InterfaceC1348g0
        /* renamed from: b */
        public void mo2428a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.m9964E("u_projView", false, ze0.this.f34980Y.m13202a());
            sr1Var.m24536v("Color2", 0.0f, 0.0f, 0.0f, 1.0f);
            sr1Var.m24539s("saturation", ze0.this.f34971P.m24224i(y31Var.mo2889b().mo4185a()));
            if (ze0.this.f34982a0 == 1) {
                sr1Var.m24539s("maskadd", 0.0f);
                sr1Var.m24539s("maskmul", 1.0f);
                sr1Var.m24539s("mask_l_add", 0.0f);
                sr1Var.m24539s("mask_l_mul", 1.0f);
            } else if (ze0.this.f34982a0 == 2) {
                sr1Var.m24539s("maskadd", 0.0f);
                sr1Var.m24539s("maskmul", 1.0f);
                sr1Var.m24539s("mask_l_add", 1.0f);
                sr1Var.m24539s("mask_l_mul", -1.0f);
            } else {
                if (ze0.this.f34982a0 == 3) {
                    sr1Var.m24539s("maskadd", 1.0f);
                    sr1Var.m24539s("maskmul", -1.0f);
                } else {
                    sr1Var.m24539s("maskadd", 0.0f);
                    sr1Var.m24539s("maskmul", 1.0f);
                }
                sr1Var.m24539s("mask_l_add", 1.0f);
                sr1Var.m24539s("mask_l_mul", 0.0f);
            }
            if (w31Var.m6553e(0) == w31Var.m6553e(1)) {
                sr1Var.m24539s("tex2_y_add", 0.0f);
                sr1Var.m24539s("tex2_y_mul", 1.0f);
                return;
            }
            sr1Var.m24539s("tex2_y_add", 1.0f);
            sr1Var.m24539s("tex2_y_mul", -1.0f);
        }
    }

    public ze0() {
        m5195Z(new C3831a(), new C3832b());
        this.f34981Z = new C3376vv(new C3833c(), null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // com.daaw.xe0, com.daaw.AbstractC3118tv
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2460B(y31 y31Var, e40 e40Var) {
        w31 w31Var;
        int i;
        RectF rectF;
        float centerX;
        float centerY;
        super.mo2460B(y31Var, e40Var);
        this.f34981Z.m6746u(y31Var, e40Var);
        qc0 m6754m = this.f32598G.m6754m(y31Var);
        qc0 m6753n = this.f32598G.m6753n(y31Var);
        if (m6754m == null) {
            return;
        }
        qc0 mo2799c = m6754m.mo2799c(this.f32600I.m4964i(y31Var.f33263u.f33286b) * 2.0f);
        RectF m8787n = m8787n(y31Var.mo2889b().mo4185a());
        float m8782s = m8782s(y31Var.mo2889b().mo4185a());
        int m2447o0 = m2447o0(y31Var.mo2889b().mo4185a());
        m8794b(y31Var, this.f34980Y, m8787n.centerX(), m8787n.centerY(), m8782s);
        qr1 m4167s = y31Var.f33263u.m4167s();
        w31 w31Var2 = new w31(m8792f(), new qc0[]{mo2799c, this.f34981Z.m6754m(y31Var)}, m4167s, this.f34984c0, 1);
        if (this.f34977V != null) {
            m2445q0(y31Var, m8787n, m2447o0, w31Var2);
            return;
        }
        float width = m8787n.width();
        float height = m8787n.height();
        if (this.f34976U || m5196Y()) {
            float width2 = m8787n.width() / m8787n.height();
            float width3 = mo2799c == null ? 1.0f : mo2799c.getWidth() / mo2799c.getHeight();
            boolean z = width3 > width2;
            if (!m5196Y() ? z : !z) {
                float height2 = m8787n.height();
                float f = width3 * height2;
                height = height2;
                width = f;
            } else {
                width = m8787n.width();
                height = width / width3;
            }
            if (m6753n != null) {
                w31Var = new w31(m8792f(), new qc0[]{m6753n, this.f34981Z.m6754m(y31Var)}, m4167s, this.f34984c0);
                float f2 = height;
                if (m5196Y()) {
                    i = m2447o0;
                    rectF = m8787n;
                    centerX = rectF.centerX() - (width * 0.5f);
                    centerY = rectF.centerY() - (0.5f * f2);
                    y31Var.f33263u.m4171o().m9354o(y31Var, centerX, centerY, 0.0f, width, f2, i, bs1.m25844s(), bs1.m25846q(), w31Var2, false);
                } else {
                    centerX = m8787n.centerX() - (width * 0.5f);
                    centerY = m8787n.centerY() - (f2 * 0.5f);
                    float f3 = ((width / width) - 1.0f) * 0.5f;
                    float f4 = ((f2 / f2) - 1.0f) * 0.5f;
                    i = m2447o0;
                    rectF = m8787n;
                    y31Var.f33263u.m4171o().m9354o(y31Var, centerX, centerY, 0.0f, width, f2, i, new bs1(0.0f - f3, 0.0f - f4), new bs1(f3 + 1.0f, f4 + 1.0f), w31Var2, false);
                }
                if (w31Var == null) {
                    m2444r0(y31Var, i, rectF, new RectF(centerX, centerY, width + centerX, f2 + centerY), w31Var);
                    return;
                }
                return;
            }
        }
        w31Var = null;
        float f22 = height;
        if (m5196Y()) {
        }
        if (w31Var == null) {
        }
    }

    @Override // com.daaw.xe0
    /* renamed from: a0 */
    public void mo2459a0(y31 y31Var) {
    }

    @Override // com.daaw.AbstractC3118tv
    /* renamed from: h */
    public String mo2456h() {
        return "Image";
    }

    @Override // com.daaw.xe0, com.daaw.AbstractC3118tv
    /* renamed from: l */
    public void mo2451l() {
        super.mo2451l();
        C3376vv c3376vv = this.f34981Z;
        if (c3376vv != null) {
            c3376vv.m6751p();
        }
    }

    /* renamed from: o0 */
    public final int m2447o0(aq0 aq0Var) {
        br1.m25891r(this.f34968M, this.f34969N, this.f34978W, Math.max(Math.min(this.f34970O.m4963j(aq0Var, 0.0f), 1.0f), 0.0f));
        return f80.m22863k(this.f34978W);
    }

    /* renamed from: p0 */
    public int m2446p0() {
        return this.f34982a0;
    }

    /* renamed from: q0 */
    public final void m2445q0(y31 y31Var, RectF rectF, int i, w31 w31Var) {
        float width;
        float height;
        float f;
        float width2 = rectF.width() / rectF.height();
        float width3 = w31Var.m6552f().getWidth() / w31Var.m6552f().getHeight();
        if (width3 > width2) {
            width = rectF.width();
            height = width / width3;
        } else if (width3 < width2) {
            height = rectF.height();
            width = width3 * height;
        } else {
            width = rectF.width();
            height = rectF.height();
        }
        float f2 = 1.0f;
        if (width > height) {
            f2 = 1.0f / width3;
            f = 1.0f;
        } else {
            f = width3 * 1.0f;
        }
        float f3 = f2 * 0.5f;
        float f4 = f * 0.5f;
        y31Var.f33263u.m4171o().m9348u(y31Var, rectF, i, new bs1(0.5f - f3, f4 + 0.5f), new bs1(f3 + 0.5f, 0.5f - f4), w31Var, this.f34977V);
    }

    /* renamed from: r0 */
    public void m2444r0(y31 y31Var, int i, RectF rectF, RectF rectF2, w31 w31Var) {
        float f;
        RectF rectF3;
        float f2;
        float width = rectF.width();
        float height = rectF.height();
        RectF rectF4 = new RectF();
        rectF4.set(rectF.left, rectF.top, rectF.right, rectF2.top);
        if (rectF4.height() > 0.0f) {
            f = width;
            rectF3 = rectF4;
            y31Var.f33263u.m4171o().m9354o(y31Var, rectF4.left, rectF4.top, 0.0f, rectF4.width(), rectF4.height(), i, new bs1(0.0f, rectF2.bottom / height), bs1.m25846q(), w31Var, false);
        } else {
            f = width;
            rectF3 = rectF4;
        }
        rectF3.set(rectF.left, rectF2.bottom, rectF.right, rectF.bottom);
        if (rectF3.height() > 0.0f) {
            y31Var.f33263u.m4171o().m9354o(y31Var, rectF3.left, rectF3.top, 0.0f, rectF3.width(), rectF3.height(), i, bs1.m25844s(), new bs1(1.0f, rectF2.top / height), w31Var, false);
        }
        rectF3.set(rectF.left, rectF2.top, rectF2.left, rectF2.bottom);
        if (rectF3.width() > 0.0f) {
            f2 = 0.0f;
            y31Var.f33263u.m4171o().m9354o(y31Var, rectF3.left, rectF3.top, 0.0f, rectF3.width(), rectF3.height(), i, bs1.m25844s(), new bs1(rectF2.left / f, 1.0f), w31Var, false);
        } else {
            f2 = 0.0f;
        }
        rectF3.set(rectF2.right, rectF2.top, rectF.right, rectF2.bottom);
        if (rectF3.width() > f2) {
            y31Var.f33263u.m4171o().m9354o(y31Var, rectF3.left, rectF3.top, 0.0f, rectF3.width(), rectF3.height(), i, new bs1(rectF2.right / f, 0.0f), bs1.m25846q(), w31Var, false);
        }
    }

    /* renamed from: s0 */
    public void m2443s0(boolean z, int i, int i2) {
        if (this.f34972Q == z && this.f34973R == i && this.f34974S == i2) {
            return;
        }
        this.f34972Q = z;
        this.f34973R = i;
        this.f34974S = i2;
        mo2451l();
    }

    @Override // com.daaw.xe0, com.daaw.AbstractC3118tv
    /* renamed from: t */
    public void mo2442t(C3239un c3239un) {
        super.mo2442t(c3239un);
        m2440u0(c3239un.m7955n("keepAspectRatio", true));
        m2441t0(c3239un.m7955n("blurredBorder", false));
        this.f34968M = c3239un.m7957m("Color", new float[]{1.0f, 1.0f, 1.0f, 1.0f});
        this.f34969N = c3239un.m7957m("ColorTo", new float[]{1.0f, 1.0f, 1.0f, 1.0f});
        this.f34970O.m4959n(c3239un.m7967h("MeasureColorBlend"), "Nothing", 0.5f, 0.5f);
        this.f34971P = c3239un.m7945s("saturation", dm0.m24232a(1.0f));
        m2443s0(c3239un.m7955n("blurEnabled", false), c3239un.m7947r("blurDivider", 5), c3239un.m7947r("blurRadius", 7));
        C3239un m7967h = c3239un.m7967h("Shape");
        ge0 m13538a = pa1.m13538a(m7967h.m8002C("None"), this.f34977V);
        this.f34977V = m13538a;
        if (m13538a != null) {
            m13538a.mo2493a(m7967h);
        }
        this.f34981Z.m6768C(c3239un.m7940w("MaskImage", null));
        m2438v0(c3239un.m7941v("maskMode", bf0.f4769a, 0));
    }

    /* renamed from: t0 */
    public void m2441t0(boolean z) {
        if (this.f34975T == z) {
            return;
        }
        this.f34975T = z;
        mo2451l();
    }

    /* renamed from: u0 */
    public void m2440u0(boolean z) {
        if (this.f34976U == z) {
            return;
        }
        this.f34976U = z;
        mo2451l();
    }

    @Override // com.daaw.xe0, com.daaw.AbstractC3118tv
    /* renamed from: v */
    public boolean mo2439v(y31 y31Var) {
        super.mo2439v(y31Var);
        this.f34981Z.m6750q(y31Var, m8784q(y31Var.f33263u.f33286b), 0);
        return false;
    }

    /* renamed from: v0 */
    public void m2438v0(int i) {
        this.f34982a0 = i;
    }

    @Override // com.daaw.xe0, com.daaw.AbstractC3118tv
    /* renamed from: w */
    public void mo2437w(y31 y31Var, int i) {
        super.mo2437w(y31Var, i);
        this.f34981Z.m6749r(y31Var, i);
    }

    @Override // com.daaw.xe0, com.daaw.AbstractC3118tv
    /* renamed from: x */
    public void mo2436x(y31 y31Var) {
        super.mo2436x(y31Var);
        C3376vv c3376vv = this.f34981Z;
        if (c3376vv != null) {
            c3376vv.m6748s(y31Var);
        }
    }

    @Override // com.daaw.xe0, com.daaw.AbstractC3118tv
    /* renamed from: y */
    public void mo2435y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.mo2435y(de0Var, e40Var, vc0Var);
        this.f34981Z.m6747t(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.xe0, com.daaw.AbstractC3118tv
    /* renamed from: z */
    public void generalItemGen(C3239un c3239un, od0 od0Var) {
        super.generalItemGen(c3239un, od0Var);
        c3239un.add_Checkbox("keepAspectRatio", this.f34976U, "1_image");
        c3239un.add_Checkbox("blurredBorder", this.f34975T, "1_image");
        c3239un.m7950p0(m8790j(R.string.title_image));
        c3239un.m7996I("Color", this.f34968M, "2_color");
        c3239un.m7996I("ColorTo", this.f34969N, "2_color");
        this.f34970O.m4958o(c3239un.add_Dropdown("MeasureColorBlend", "", "2_color", new String[0]));
        c3239un.m7979Z("saturation", this.f34971P, "2_color", 0.0f, 1.0f);
        c3239un.add_Checkbox("blurEnabled", this.f34972Q, "blur");
        c3239un.m7982W("blurDivider", this.f34973R, "blur", 0, 10);
        c3239un.m7982W("blurRadius", this.f34974S, "blur", 1, 25);
        C3239un m7999F = c3239un.add_Dropdown("Shape", pa1.m13537b(this.f34977V), "1_image", pa1.f22766c);
        ge0 ge0Var = this.f34977V;
        if (ge0Var != null) {
            ge0Var.mo2492o(m7999F);
        }
        od0Var.mo14380a(this.f34981Z.m6757j());
        c3239un.m7970f0("MaskImage", this.f34981Z.m6757j(), "1_image", C3376vv.f30615t);
        String[] strArr = bf0.f4769a;
        c3239un.m7956m0("maskMode", br1.m25908a(strArr, m2446p0(), strArr[0]), "1_image", strArr);
    }
}
