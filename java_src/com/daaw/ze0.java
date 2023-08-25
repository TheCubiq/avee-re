package com.daaw;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.daaw.avee.R;
import com.daaw.vv;
/* loaded from: classes.dex */
public class ze0 extends xe0 {
    public vv Z;
    public float[] M = {1.0f, 1.0f, 1.0f, 1.0f};
    public float[] N = {1.0f, 1.0f, 1.0f, 1.0f};
    public xn0 O = xn0.a();
    public dm0 P = dm0.a(1.0f);
    public boolean Q = false;
    public int R = 5;
    public int S = 7;
    public boolean T = false;
    public boolean U = true;
    public ge0 V = null;
    public float[] W = new float[4];
    public float[] X = new float[4];
    public final pr1 Y = new pr1();
    public int a0 = 0;
    public g0<y31, sr1, w31> b0 = new d();
    public g0<y31, sr1, w31> c0 = new e();

    /* loaded from: classes.dex */
    public class a implements s40<y31, Bitmap, Bitmap> {
        public a() {
        }

        @Override // com.daaw.s40
        /* renamed from: b */
        public Bitmap a(y31 y31Var, Bitmap bitmap) {
            String str;
            bitmap.getConfig();
            if (ze0.this.Q) {
                int min = Math.min(1 << ze0.this.R, 512);
                int width = (int) (min * (bitmap.getWidth() / bitmap.getHeight()));
                try {
                    return j00.a((width <= 0 || min <= 0) ? bitmap : Bitmap.createScaledBitmap(bitmap, width, min, true), ze0.this.S);
                } catch (Exception e) {
                    str = "Art blurring failed: " + e.getMessage();
                    lz1.c(str);
                    return bitmap;
                } catch (OutOfMemoryError unused) {
                    str = "Art blurring failed: OutOfMemoryError";
                    lz1.c(str);
                    return bitmap;
                }
            }
            return bitmap;
        }
    }

    /* loaded from: classes.dex */
    public class b implements s40<y31, Bitmap, Bitmap> {
        public b() {
        }

        @Override // com.daaw.s40
        /* renamed from: b */
        public Bitmap a(y31 y31Var, Bitmap bitmap) {
            String str;
            if (ze0.this.T && ze0.this.U) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 32, 32, true);
                try {
                    return j00.a(createScaledBitmap, 7);
                } catch (Exception e) {
                    str = "Art blurring failed: " + e.getMessage();
                    lz1.c(str);
                    return createScaledBitmap;
                } catch (OutOfMemoryError unused) {
                    str = "Art blurring failed: OutOfMemoryError";
                    lz1.c(str);
                    return createScaledBitmap;
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class c implements vv.b {
        public c() {
        }

        @Override // com.daaw.vv.b
        public void a() {
            ze0.this.m();
        }
    }

    /* loaded from: classes.dex */
    public class d implements g0<y31, sr1, w31> {
        public d() {
        }

        @Override // com.daaw.g0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.E("u_projView", false, ze0.this.Y.a());
        }
    }

    /* loaded from: classes.dex */
    public class e implements g0<y31, sr1, w31> {
        public e() {
        }

        @Override // com.daaw.g0
        /* renamed from: b */
        public void a(y31 y31Var, sr1 sr1Var, w31 w31Var) {
            sr1Var.E("u_projView", false, ze0.this.Y.a());
            sr1Var.v("Color2", 0.0f, 0.0f, 0.0f, 1.0f);
            sr1Var.s("saturation", ze0.this.P.i(y31Var.b().a()));
            if (ze0.this.a0 == 1) {
                sr1Var.s("maskadd", 0.0f);
                sr1Var.s("maskmul", 1.0f);
                sr1Var.s("mask_l_add", 0.0f);
                sr1Var.s("mask_l_mul", 1.0f);
            } else if (ze0.this.a0 == 2) {
                sr1Var.s("maskadd", 0.0f);
                sr1Var.s("maskmul", 1.0f);
                sr1Var.s("mask_l_add", 1.0f);
                sr1Var.s("mask_l_mul", -1.0f);
            } else {
                if (ze0.this.a0 == 3) {
                    sr1Var.s("maskadd", 1.0f);
                    sr1Var.s("maskmul", -1.0f);
                } else {
                    sr1Var.s("maskadd", 0.0f);
                    sr1Var.s("maskmul", 1.0f);
                }
                sr1Var.s("mask_l_add", 1.0f);
                sr1Var.s("mask_l_mul", 0.0f);
            }
            if (w31Var.e(0) == w31Var.e(1)) {
                sr1Var.s("tex2_y_add", 0.0f);
                sr1Var.s("tex2_y_mul", 1.0f);
                return;
            }
            sr1Var.s("tex2_y_add", 1.0f);
            sr1Var.s("tex2_y_mul", -1.0f);
        }
    }

    public ze0() {
        Z(new a(), new b());
        this.Z = new vv(new c(), null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // com.daaw.xe0, com.daaw.tv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B(com.daaw.y31 r24, com.daaw.e40 r25) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ze0.B(com.daaw.y31, com.daaw.e40):void");
    }

    @Override // com.daaw.xe0
    public void a0(y31 y31Var) {
    }

    @Override // com.daaw.tv
    public String h() {
        return "Image";
    }

    @Override // com.daaw.xe0, com.daaw.tv
    public void l() {
        super.l();
        vv vvVar = this.Z;
        if (vvVar != null) {
            vvVar.p();
        }
    }

    public final int o0(aq0 aq0Var) {
        br1.r(this.M, this.N, this.W, Math.max(Math.min(this.O.j(aq0Var, 0.0f), 1.0f), 0.0f));
        return f80.k(this.W);
    }

    public int p0() {
        return this.a0;
    }

    public final void q0(y31 y31Var, RectF rectF, int i, w31 w31Var) {
        float width;
        float height;
        float f;
        float width2 = rectF.width() / rectF.height();
        float width3 = w31Var.f().getWidth() / w31Var.f().getHeight();
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
        y31Var.u.o().u(y31Var, rectF, i, new bs1(0.5f - f3, f4 + 0.5f), new bs1(f3 + 0.5f, 0.5f - f4), w31Var, this.V);
    }

    public void r0(y31 y31Var, int i, RectF rectF, RectF rectF2, w31 w31Var) {
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
            y31Var.u.o().o(y31Var, rectF4.left, rectF4.top, 0.0f, rectF4.width(), rectF4.height(), i, new bs1(0.0f, rectF2.bottom / height), bs1.q(), w31Var, false);
        } else {
            f = width;
            rectF3 = rectF4;
        }
        rectF3.set(rectF.left, rectF2.bottom, rectF.right, rectF.bottom);
        if (rectF3.height() > 0.0f) {
            y31Var.u.o().o(y31Var, rectF3.left, rectF3.top, 0.0f, rectF3.width(), rectF3.height(), i, bs1.s(), new bs1(1.0f, rectF2.top / height), w31Var, false);
        }
        rectF3.set(rectF.left, rectF2.top, rectF2.left, rectF2.bottom);
        if (rectF3.width() > 0.0f) {
            f2 = 0.0f;
            y31Var.u.o().o(y31Var, rectF3.left, rectF3.top, 0.0f, rectF3.width(), rectF3.height(), i, bs1.s(), new bs1(rectF2.left / f, 1.0f), w31Var, false);
        } else {
            f2 = 0.0f;
        }
        rectF3.set(rectF2.right, rectF2.top, rectF.right, rectF2.bottom);
        if (rectF3.width() > f2) {
            y31Var.u.o().o(y31Var, rectF3.left, rectF3.top, 0.0f, rectF3.width(), rectF3.height(), i, new bs1(rectF2.right / f, 0.0f), bs1.q(), w31Var, false);
        }
    }

    public void s0(boolean z, int i, int i2) {
        if (this.Q == z && this.R == i && this.S == i2) {
            return;
        }
        this.Q = z;
        this.R = i;
        this.S = i2;
        l();
    }

    @Override // com.daaw.xe0, com.daaw.tv
    public void t(un unVar) {
        super.t(unVar);
        u0(unVar.n("keepAspectRatio", true));
        t0(unVar.n("blurredBorder", false));
        this.M = unVar.m("Color", new float[]{1.0f, 1.0f, 1.0f, 1.0f});
        this.N = unVar.m("ColorTo", new float[]{1.0f, 1.0f, 1.0f, 1.0f});
        this.O.n(unVar.h("MeasureColorBlend"), "Nothing", 0.5f, 0.5f);
        this.P = unVar.s("saturation", dm0.a(1.0f));
        s0(unVar.n("blurEnabled", false), unVar.r("blurDivider", 5), unVar.r("blurRadius", 7));
        un h = unVar.h("Shape");
        ge0 a2 = pa1.a(h.C("None"), this.V);
        this.V = a2;
        if (a2 != null) {
            a2.a(h);
        }
        this.Z.C(unVar.w("MaskImage", null));
        v0(unVar.v("maskMode", bf0.a, 0));
    }

    public void t0(boolean z) {
        if (this.T == z) {
            return;
        }
        this.T = z;
        l();
    }

    public void u0(boolean z) {
        if (this.U == z) {
            return;
        }
        this.U = z;
        l();
    }

    @Override // com.daaw.xe0, com.daaw.tv
    public boolean v(y31 y31Var) {
        super.v(y31Var);
        this.Z.q(y31Var, q(y31Var.u.b), 0);
        return false;
    }

    public void v0(int i) {
        this.a0 = i;
    }

    @Override // com.daaw.xe0, com.daaw.tv
    public void w(y31 y31Var, int i) {
        super.w(y31Var, i);
        this.Z.r(y31Var, i);
    }

    @Override // com.daaw.xe0, com.daaw.tv
    public void x(y31 y31Var) {
        super.x(y31Var);
        vv vvVar = this.Z;
        if (vvVar != null) {
            vvVar.s(y31Var);
        }
    }

    @Override // com.daaw.xe0, com.daaw.tv
    public void y(de0 de0Var, e40 e40Var, vc0 vc0Var) {
        super.y(de0Var, e40Var, vc0Var);
        this.Z.t(de0Var, e40Var, vc0Var);
    }

    @Override // com.daaw.xe0, com.daaw.tv
    public void z(un unVar, od0 od0Var) {
        super.z(unVar, od0Var);
        unVar.L("keepAspectRatio", this.U, "1_image");
        unVar.L("blurredBorder", this.T, "1_image");
        unVar.p0(j(R.string.title_image));
        unVar.I("Color", this.M, "2_color");
        unVar.I("ColorTo", this.N, "2_color");
        this.O.o(unVar.F("MeasureColorBlend", "", "2_color", new String[0]));
        unVar.Z("saturation", this.P, "2_color", 0.0f, 1.0f);
        unVar.L("blurEnabled", this.Q, "blur");
        unVar.W("blurDivider", this.R, "blur", 0, 10);
        unVar.W("blurRadius", this.S, "blur", 1, 25);
        un F = unVar.F("Shape", pa1.b(this.V), "1_image", pa1.c);
        ge0 ge0Var = this.V;
        if (ge0Var != null) {
            ge0Var.o(F);
        }
        od0Var.a(this.Z.j());
        unVar.f0("MaskImage", this.Z.j(), "1_image", vv.t);
        String[] strArr = bf0.a;
        unVar.m0("maskMode", br1.a(strArr, p0(), strArr[0]), "1_image", strArr);
    }
}
