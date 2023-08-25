package com.daaw;

import android.graphics.PointF;
import com.daaw.he0;
/* loaded from: classes.dex */
public class za1 extends xa1 implements t40<Integer, float[], int[], Boolean>, u40<Integer, float[], int[], float[], Boolean> {

    /* renamed from: A */
    public he0.C1532a f34640A;

    /* renamed from: B */
    public he0.C1532a[] f34641B;

    /* renamed from: o */
    public float f34664o;

    /* renamed from: p */
    public float f34665p;

    /* renamed from: q */
    public float f34666q;

    /* renamed from: r */
    public float f34667r;

    /* renamed from: s */
    public float f34668s;

    /* renamed from: t */
    public float f34669t;

    /* renamed from: u */
    public float f34670u;

    /* renamed from: v */
    public float f34671v;

    /* renamed from: w */
    public float f34672w;

    /* renamed from: x */
    public he0.C1532a f34673x;

    /* renamed from: y */
    public he0.C1532a f34674y;

    /* renamed from: z */
    public he0.C1532a f34675z;

    /* renamed from: h */
    public PointF f34657h = new PointF();

    /* renamed from: i */
    public PointF f34658i = new PointF();

    /* renamed from: j */
    public PointF f34659j = new PointF();

    /* renamed from: k */
    public bs1 f34660k = new bs1(0.0f, 0.0f);

    /* renamed from: l */
    public bs1 f34661l = new bs1(0.0f, 0.0f);

    /* renamed from: m */
    public bs1 f34662m = new bs1(0.0f, 0.0f);

    /* renamed from: n */
    public bs1 f34663n = new bs1(0.0f, 0.0f);

    /* renamed from: C */
    public bs1 f34642C = new bs1(0.0f, 0.0f);

    /* renamed from: D */
    public bs1 f34643D = new bs1(0.0f, 0.0f);

    /* renamed from: E */
    public bs1 f34644E = new bs1(0.0f, 0.0f);

    /* renamed from: F */
    public bs1 f34645F = new bs1(0.0f, 0.0f);

    /* renamed from: G */
    public bs1 f34646G = new bs1(0.0f, 0.0f);

    /* renamed from: H */
    public bs1 f34647H = new bs1(0.0f, 0.0f);

    /* renamed from: I */
    public bs1 f34648I = new bs1(0.0f, 0.0f);

    /* renamed from: J */
    public bs1 f34649J = new bs1(0.0f, 0.0f);

    /* renamed from: K */
    public bs1 f34650K = new bs1(0.0f, 0.0f);

    /* renamed from: L */
    public bs1 f34651L = new bs1(0.0f, 0.0f);

    /* renamed from: M */
    public bs1 f34652M = new bs1(0.0f, 0.0f);

    /* renamed from: N */
    public bs1 f34653N = new bs1(0.0f, 0.0f);

    /* renamed from: O */
    public boolean f34654O = true;

    /* renamed from: P */
    public boolean f34655P = false;

    /* renamed from: Q */
    public float f34656Q = 0.0f;

    @Override // com.daaw.xa1, com.daaw.zc0
    /* renamed from: a */
    public void mo2493a(C3239un c3239un) {
        super.mo2493a(c3239un);
        this.f34654O = c3239un.m7955n("mirror", false);
        this.f34655P = c3239un.m7955n("flipEveryOther", false);
    }

    @Override // com.daaw.he0
    /* renamed from: m */
    public void mo2574m(de0 de0Var, he0.C1532a[] c1532aArr, float f, float f2, int i, float f3) {
        this.f34641B = c1532aArr;
        this.f34672w = f2;
        this.f34656Q = f3;
        int length = c1532aArr.length;
        boolean mo2883h = de0Var.mo2883h();
        w31 w31Var = !mo2883h ? new w31(i, de0Var.mo2889b().mo4180f(), (qr1) null, (InterfaceC1348g0<y31, sr1, w31>) null, 2) : null;
        int i2 = 0;
        while (true) {
            he0.C1532a[] c1532aArr2 = this.f34641B;
            if (i2 >= c1532aArr2.length) {
                break;
            }
            he0.C1532a c1532a = c1532aArr2[i2];
            this.f34673x = c1532a;
            int i3 = c1532a.f12435a;
            he0.C1532a c1532a2 = i3 < 0 ? c1532a : c1532aArr2[i3];
            this.f34675z = c1532a2;
            int i4 = c1532a.f12436b;
            he0.C1532a c1532a3 = i4 < 0 ? c1532a : c1532aArr2[i4];
            this.f34640A = c1532a3;
            float f4 = c1532a.f12438d;
            float f5 = c1532a2.f12438d;
            float f6 = c1532a3.f12438d;
            if (this.f34655P) {
                if (i2 % 2 == 0) {
                    f4 *= -1.0f;
                } else {
                    f5 *= -1.0f;
                }
            }
            PointF pointF = this.f34657h;
            pointF.x = c1532a2.f12439e;
            pointF.y = c1532a2.f12440f;
            PointF pointF2 = this.f34658i;
            pointF2.x = c1532a.f12439e;
            pointF2.y = c1532a.f12440f;
            PointF pointF3 = this.f34659j;
            pointF3.x = c1532a3.f12439e;
            pointF3.y = c1532a3.f12440f;
            float f7 = this.f34672w;
            float f8 = this.f32274f;
            float f9 = f5 * (-2.0f) * f7 * f8;
            float f10 = f4 * (-2.0f) * f7 * f8;
            if (this.f34654O) {
                pointF.x -= c1532a2.f12441g * f9;
                pointF.y -= c1532a2.f12442h * f9;
                pointF2.x -= c1532a.f12441g * f10;
                pointF2.y -= c1532a.f12442h * f10;
                double d = f10;
                Double.isNaN(d);
                f10 = (float) (d * 2.0d);
            }
            if (this.f32272d ? this.f32273e > 0.0f : f10 < 0.0f) {
                float f11 = pointF2.x;
                this.f34668s = f11;
                float f12 = pointF2.y;
                this.f34669t = f12;
                float f13 = (c1532a.f12441g * f10) + f11;
                this.f34670u = f13;
                float f14 = (c1532a.f12442h * f10) + f12;
                this.f34671v = f14;
                c1532a.f12455u = true;
                c1532a.f12453s = f13;
                c1532a.f12454t = f14;
                c1532a.f12445k = f13;
                c1532a.f12446l = f14;
                c1532a.f12447m = f11;
                c1532a.f12448n = f12;
            } else {
                float f15 = pointF2.x;
                this.f34670u = f15;
                float f16 = pointF2.y;
                this.f34671v = f16;
                float f17 = (c1532a.f12441g * f10) + f15;
                this.f34668s = f17;
                float f18 = (c1532a.f12442h * f10) + f16;
                this.f34669t = f18;
                c1532a.f12455u = false;
                c1532a.f12453s = f17;
                c1532a.f12454t = f18;
                c1532a.f12445k = f15;
                c1532a.f12446l = f16;
                c1532a.f12447m = f17;
                c1532a.f12448n = f18;
            }
            c1532a.f12449o = c1532a.f12445k;
            c1532a.f12450p = c1532a.f12446l;
            c1532a.f12451q = c1532a.f12447m;
            c1532a.f12452r = c1532a.f12448n;
            i2++;
        }
        if (this.f32272d) {
            int i5 = 0;
            while (true) {
                he0.C1532a[] c1532aArr3 = this.f34641B;
                if (i5 >= c1532aArr3.length) {
                    break;
                }
                he0.C1532a c1532a4 = c1532aArr3[i5];
                this.f34673x = c1532a4;
                m2571w(c1532a4, this.f34663n, this.f32273e, 0);
                he0.C1532a c1532a5 = this.f34673x;
                if (c1532a5.f12455u) {
                    float f19 = c1532a5.f12453s;
                    bs1 bs1Var = this.f34663n;
                    float f20 = f19 + bs1Var.f5090a;
                    c1532a5.f12451q = f20;
                    float f21 = c1532a5.f12454t + bs1Var.f5091b;
                    c1532a5.f12452r = f21;
                    c1532a5.f12447m = f20;
                    c1532a5.f12448n = f21;
                } else {
                    float f22 = c1532a5.f12453s;
                    bs1 bs1Var2 = this.f34663n;
                    float f23 = f22 + bs1Var2.f5090a;
                    c1532a5.f12449o = f23;
                    float f24 = c1532a5.f12454t + bs1Var2.f5091b;
                    c1532a5.f12450p = f24;
                    c1532a5.f12445k = f23;
                    c1532a5.f12446l = f24;
                }
                i5++;
            }
        }
        if (mo2883h) {
            de0Var.mo2881j().mo7293c(de0Var, this, length, 0.0f, bs1.m25844s(), bs1.m25846q(), de0Var.mo2889b().mo4183c(), i, null);
        } else {
            de0Var.mo2881j().mo7290f(de0Var, this, length, 0.0f, bs1.m25844s(), bs1.m25846q(), w31Var);
        }
    }

    @Override // com.daaw.xa1, com.daaw.zc0
    /* renamed from: o */
    public void mo2492o(C3239un c3239un) {
        super.mo2492o(c3239un);
        c3239un.m7993L("mirror", this.f34654O, "b");
        c3239un.m7993L("flipEveryOther", this.f34655P, "b");
    }

    @Override // com.daaw.t40
    /* renamed from: u */
    public Boolean mo2575j(Integer num, float[] fArr, int[] iArr) {
        he0.C1532a c1532a = this.f34641B[num.intValue()];
        this.f34673x = c1532a;
        int i = c1532a.f12435a;
        if (i >= 0) {
            he0.C1532a[] c1532aArr = this.f34641B;
            this.f34675z = c1532aArr[i];
            int m5339q = m5339q(i, c1532aArr.length, this.f34656Q);
            int m5339q2 = m5339q(num.intValue(), this.f34641B.length, this.f34656Q);
            iArr[0] = m5339q;
            iArr[1] = m5339q2;
            iArr[2] = iArr[0];
            iArr[3] = iArr[1];
            he0.C1532a c1532a2 = this.f34675z;
            float f = c1532a2.f12449o;
            this.f34666q = f;
            float f2 = c1532a2.f12450p;
            this.f34667r = f2;
            float f3 = c1532a2.f12451q;
            this.f34664o = f3;
            float f4 = c1532a2.f12452r;
            this.f34665p = f4;
            he0.C1532a c1532a3 = this.f34673x;
            float f5 = c1532a3.f12449o;
            this.f34670u = f5;
            float f6 = c1532a3.f12450p;
            this.f34671v = f6;
            float f7 = c1532a3.f12451q;
            this.f34668s = f7;
            float f8 = c1532a3.f12452r;
            this.f34669t = f8;
            fArr[0] = f;
            fArr[1] = f2;
            fArr[2] = f5;
            fArr[3] = f6;
            fArr[4] = f3;
            fArr[5] = f4;
            fArr[6] = f7;
            fArr[7] = f8;
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // com.daaw.u40
    /* renamed from: v */
    public Boolean mo2576c(Integer num, float[] fArr, int[] iArr, float[] fArr2) {
        he0.C1532a c1532a = this.f34641B[num.intValue()];
        this.f34673x = c1532a;
        int i = c1532a.f12435a;
        if (i >= 0) {
            this.f34675z = this.f34641B[i];
            iArr[1] = m5339q(num.intValue(), this.f34641B.length, this.f34656Q);
            iArr[0] = m5339q(this.f34673x.f12435a, this.f34641B.length, this.f34656Q);
            iArr[2] = iArr[0];
            iArr[3] = iArr[1];
            he0.C1532a c1532a2 = this.f34675z;
            float f = c1532a2.f12449o;
            this.f34666q = f;
            float f2 = c1532a2.f12450p;
            this.f34667r = f2;
            float f3 = c1532a2.f12451q;
            this.f34664o = f3;
            float f4 = c1532a2.f12452r;
            this.f34665p = f4;
            he0.C1532a c1532a3 = this.f34673x;
            float f5 = c1532a3.f12449o;
            this.f34670u = f5;
            float f6 = c1532a3.f12450p;
            this.f34671v = f6;
            float f7 = c1532a3.f12451q;
            this.f34668s = f7;
            float f8 = c1532a3.f12452r;
            this.f34669t = f8;
            fArr[0] = f;
            fArr[1] = f2;
            fArr[2] = f5;
            fArr[3] = f6;
            fArr[4] = f3;
            fArr[5] = f4;
            fArr[6] = f7;
            fArr[7] = f8;
            int i2 = c1532a2.f12435a;
            if (i2 >= 0) {
                he0.C1532a[] c1532aArr = this.f34641B;
                he0.C1532a c1532a4 = c1532aArr[i2];
                this.f34674y = c1532a4;
                float f9 = c1532a4.f12449o;
                float f10 = c1532a4.f12450p;
                float f11 = c1532a4.f12451q;
                float f12 = c1532a4.f12452r;
                int i3 = c1532a3.f12436b;
                if (i3 >= 0) {
                    he0.C1532a c1532a5 = c1532aArr[i3];
                    this.f34640A = c1532a5;
                    float f13 = c1532a5.f12449o;
                    m2570x(-(f2 - f10), f - f9, -(f6 - f2), f5 - f, -(c1532a5.f12450p - f6), f13 - f5, -(f4 - f12), f3 - f11, -(f8 - f4), f7 - f3, -(c1532a5.f12452r - f8), c1532a5.f12451q - f7, fArr2);
                } else {
                    m2570x(-(f2 - f10), f - f9, -(f6 - f2), f5 - f, -(f6 - f2), f5 - f, -(f4 - f12), f3 - f11, -(f8 - f4), f7 - f3, -(f8 - f4), f7 - f3, fArr2);
                }
            } else {
                int i4 = c1532a3.f12436b;
                if (i4 >= 0) {
                    he0.C1532a c1532a6 = this.f34641B[i4];
                    this.f34640A = c1532a6;
                    float f14 = c1532a6.f12449o;
                    m2570x(-(f6 - f2), f5 - f, -(f6 - f2), f5 - f, -(c1532a6.f12450p - f6), f14 - f5, -(f8 - f4), f7 - f3, -(f8 - f4), f7 - f3, -(c1532a6.f12452r - f6), c1532a6.f12451q - f7, fArr2);
                } else {
                    m2570x(-(f6 - f2), f5 - f, -(f6 - f2), f5 - f, -(f6 - f2), f5 - f, -(f8 - f4), f7 - f3, -(f8 - f4), f7 - f3, -(f8 - f4), f7 - f3, fArr2);
                }
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* renamed from: w */
    public final void m2571w(he0.C1532a c1532a, bs1 bs1Var, float f, int i) {
        int i2 = c1532a.f12436b;
        if (i2 < 0) {
            this.f34640A = c1532a;
            bs1 bs1Var2 = this.f34661l;
            bs1Var2.f5090a = 0.0f;
            bs1Var2.f5091b = 0.0f;
        } else {
            he0.C1532a c1532a2 = this.f34641B[i2];
            this.f34640A = c1532a2;
            this.f34661l.f5090a = -(c1532a2.m20836b(i) - c1532a.m20836b(i));
            this.f34661l.f5091b = this.f34640A.m20837a(i) - c1532a.m20837a(i);
            this.f34661l.m25848o();
        }
        int i3 = c1532a.f12435a;
        if (i3 < 0) {
            bs1 bs1Var3 = this.f34661l;
            float f2 = bs1Var3.f5090a;
            c1532a.f12443i = f2;
            float f3 = bs1Var3.f5091b;
            c1532a.f12444j = f3;
            bs1Var.f5090a = f2 * f;
            bs1Var.f5091b = f3 * f;
            return;
        }
        he0.C1532a c1532a3 = this.f34641B[i3];
        this.f34660k.f5090a = -(c1532a.m20836b(i) - c1532a3.m20836b(i));
        this.f34660k.f5091b = c1532a.m20837a(i) - c1532a3.m20837a(i);
        this.f34660k.m25848o();
        bs1 bs1Var4 = this.f34662m;
        bs1 bs1Var5 = this.f34660k;
        float f4 = bs1Var5.f5090a;
        bs1 bs1Var6 = this.f34661l;
        bs1Var4.f5090a = f4 + bs1Var6.f5090a;
        bs1Var4.f5091b = bs1Var5.f5091b + bs1Var6.f5091b;
        bs1Var4.m25848o();
        bs1 bs1Var7 = this.f34662m;
        float f5 = bs1Var7.f5090a;
        c1532a.f12443i = f5;
        float f6 = bs1Var7.f5091b;
        c1532a.f12444j = f6;
        bs1 bs1Var8 = this.f34660k;
        float f7 = -bs1Var8.f5090a;
        bs1Var8.f5090a = f7;
        float f8 = -bs1Var8.f5091b;
        bs1Var8.f5091b = f8;
        float max = f / Math.max(Math.abs(bs1.m25856g(f5, f6, f7, f8)), 0.25f);
        bs1Var.f5090a = c1532a.f12443i * 1.0f * max;
        bs1Var.f5091b = c1532a.f12444j * 1.0f * max;
    }

    /* renamed from: x */
    public void m2570x(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float[] fArr) {
        double sqrt = Math.sqrt((f * f) + (f2 * f2));
        double d = f;
        Double.isNaN(d);
        double d2 = f2;
        Double.isNaN(d2);
        double sqrt2 = Math.sqrt((f3 * f3) + (f4 * f4));
        double d3 = f3;
        Double.isNaN(d3);
        float f13 = (float) (d3 / sqrt2);
        double d4 = f4;
        Double.isNaN(d4);
        float f14 = (float) (d4 / sqrt2);
        double sqrt3 = Math.sqrt((f5 * f5) + (f6 * f6));
        double d5 = f5;
        Double.isNaN(d5);
        double d6 = f6;
        Double.isNaN(d6);
        double sqrt4 = Math.sqrt((f7 * f7) + (f8 * f8));
        double d7 = f7;
        Double.isNaN(d7);
        double d8 = f8;
        Double.isNaN(d8);
        double sqrt5 = Math.sqrt((f9 * f9) + (f10 * f10));
        double d9 = f9;
        Double.isNaN(d9);
        float f15 = (float) (d9 / sqrt5);
        double d10 = f10;
        Double.isNaN(d10);
        float f16 = (float) (d10 / sqrt5);
        double sqrt6 = Math.sqrt((f11 * f11) + (f12 * f12));
        double d11 = f11;
        Double.isNaN(d11);
        double d12 = f12;
        Double.isNaN(d12);
        bs1 bs1Var = this.f34642C;
        bs1Var.f5090a = ((float) (d / sqrt)) + f13;
        bs1Var.f5091b = ((float) (d2 / sqrt)) + f14;
        bs1Var.m25850m(f13, f14, 1.5f);
        bs1 bs1Var2 = this.f34643D;
        bs1Var2.f5090a = ((float) (d5 / sqrt3)) + f13;
        bs1Var2.f5091b = ((float) (d6 / sqrt3)) + f14;
        bs1Var2.m25850m(f13, f14, 1.5f);
        bs1 bs1Var3 = this.f34644E;
        bs1Var3.f5090a = ((float) (d11 / sqrt6)) + f15;
        bs1Var3.f5091b = ((float) (d12 / sqrt6)) + f16;
        bs1Var3.m25850m(f15, f16, 1.5f);
        bs1 bs1Var4 = this.f34645F;
        bs1Var4.f5090a = ((float) (d7 / sqrt4)) + f15;
        bs1Var4.f5091b = ((float) (d8 / sqrt4)) + f16;
        bs1Var4.m25850m(f15, f16, 1.5f);
        bs1 bs1Var5 = this.f34642C;
        fArr[0] = bs1Var5.f5090a;
        fArr[1] = bs1Var5.f5091b;
        bs1 bs1Var6 = this.f34643D;
        fArr[2] = bs1Var6.f5090a;
        fArr[3] = bs1Var6.f5091b;
        bs1 bs1Var7 = this.f34644E;
        fArr[4] = -bs1Var7.f5090a;
        fArr[5] = -bs1Var7.f5091b;
        bs1 bs1Var8 = this.f34645F;
        fArr[6] = -bs1Var8.f5090a;
        fArr[7] = -bs1Var8.f5091b;
    }
}
