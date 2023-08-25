package com.daaw;

import android.graphics.PointF;
import com.daaw.he0;
/* loaded from: classes.dex */
public class za1 extends xa1 implements t40<Integer, float[], int[], Boolean>, u40<Integer, float[], int[], float[], Boolean> {
    public he0.a A;
    public he0.a[] B;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public he0.a x;
    public he0.a y;
    public he0.a z;
    public PointF h = new PointF();
    public PointF i = new PointF();
    public PointF j = new PointF();
    public bs1 k = new bs1(0.0f, 0.0f);
    public bs1 l = new bs1(0.0f, 0.0f);
    public bs1 m = new bs1(0.0f, 0.0f);
    public bs1 n = new bs1(0.0f, 0.0f);
    public bs1 C = new bs1(0.0f, 0.0f);
    public bs1 D = new bs1(0.0f, 0.0f);
    public bs1 E = new bs1(0.0f, 0.0f);
    public bs1 F = new bs1(0.0f, 0.0f);
    public bs1 G = new bs1(0.0f, 0.0f);
    public bs1 H = new bs1(0.0f, 0.0f);
    public bs1 I = new bs1(0.0f, 0.0f);
    public bs1 J = new bs1(0.0f, 0.0f);
    public bs1 K = new bs1(0.0f, 0.0f);
    public bs1 L = new bs1(0.0f, 0.0f);
    public bs1 M = new bs1(0.0f, 0.0f);
    public bs1 N = new bs1(0.0f, 0.0f);
    public boolean O = true;
    public boolean P = false;
    public float Q = 0.0f;

    @Override // com.daaw.xa1, com.daaw.zc0
    public void a(un unVar) {
        super.a(unVar);
        this.O = unVar.n("mirror", false);
        this.P = unVar.n("flipEveryOther", false);
    }

    @Override // com.daaw.he0
    public void m(de0 de0Var, he0.a[] aVarArr, float f, float f2, int i, float f3) {
        this.B = aVarArr;
        this.w = f2;
        this.Q = f3;
        int length = aVarArr.length;
        boolean h = de0Var.h();
        w31 w31Var = !h ? new w31(i, de0Var.b().f(), (qr1) null, (g0<y31, sr1, w31>) null, 2) : null;
        int i2 = 0;
        while (true) {
            he0.a[] aVarArr2 = this.B;
            if (i2 >= aVarArr2.length) {
                break;
            }
            he0.a aVar = aVarArr2[i2];
            this.x = aVar;
            int i3 = aVar.a;
            he0.a aVar2 = i3 < 0 ? aVar : aVarArr2[i3];
            this.z = aVar2;
            int i4 = aVar.b;
            he0.a aVar3 = i4 < 0 ? aVar : aVarArr2[i4];
            this.A = aVar3;
            float f4 = aVar.d;
            float f5 = aVar2.d;
            float f6 = aVar3.d;
            if (this.P) {
                if (i2 % 2 == 0) {
                    f4 *= -1.0f;
                } else {
                    f5 *= -1.0f;
                }
            }
            PointF pointF = this.h;
            pointF.x = aVar2.e;
            pointF.y = aVar2.f;
            PointF pointF2 = this.i;
            pointF2.x = aVar.e;
            pointF2.y = aVar.f;
            PointF pointF3 = this.j;
            pointF3.x = aVar3.e;
            pointF3.y = aVar3.f;
            float f7 = this.w;
            float f8 = this.f;
            float f9 = f5 * (-2.0f) * f7 * f8;
            float f10 = f4 * (-2.0f) * f7 * f8;
            if (this.O) {
                pointF.x -= aVar2.g * f9;
                pointF.y -= aVar2.h * f9;
                pointF2.x -= aVar.g * f10;
                pointF2.y -= aVar.h * f10;
                double d = f10;
                Double.isNaN(d);
                f10 = (float) (d * 2.0d);
            }
            if (this.d ? this.e > 0.0f : f10 < 0.0f) {
                float f11 = pointF2.x;
                this.s = f11;
                float f12 = pointF2.y;
                this.t = f12;
                float f13 = (aVar.g * f10) + f11;
                this.u = f13;
                float f14 = (aVar.h * f10) + f12;
                this.v = f14;
                aVar.u = true;
                aVar.s = f13;
                aVar.t = f14;
                aVar.k = f13;
                aVar.l = f14;
                aVar.m = f11;
                aVar.n = f12;
            } else {
                float f15 = pointF2.x;
                this.u = f15;
                float f16 = pointF2.y;
                this.v = f16;
                float f17 = (aVar.g * f10) + f15;
                this.s = f17;
                float f18 = (aVar.h * f10) + f16;
                this.t = f18;
                aVar.u = false;
                aVar.s = f17;
                aVar.t = f18;
                aVar.k = f15;
                aVar.l = f16;
                aVar.m = f17;
                aVar.n = f18;
            }
            aVar.o = aVar.k;
            aVar.p = aVar.l;
            aVar.q = aVar.m;
            aVar.r = aVar.n;
            i2++;
        }
        if (this.d) {
            int i5 = 0;
            while (true) {
                he0.a[] aVarArr3 = this.B;
                if (i5 >= aVarArr3.length) {
                    break;
                }
                he0.a aVar4 = aVarArr3[i5];
                this.x = aVar4;
                w(aVar4, this.n, this.e, 0);
                he0.a aVar5 = this.x;
                if (aVar5.u) {
                    float f19 = aVar5.s;
                    bs1 bs1Var = this.n;
                    float f20 = f19 + bs1Var.a;
                    aVar5.q = f20;
                    float f21 = aVar5.t + bs1Var.b;
                    aVar5.r = f21;
                    aVar5.m = f20;
                    aVar5.n = f21;
                } else {
                    float f22 = aVar5.s;
                    bs1 bs1Var2 = this.n;
                    float f23 = f22 + bs1Var2.a;
                    aVar5.o = f23;
                    float f24 = aVar5.t + bs1Var2.b;
                    aVar5.p = f24;
                    aVar5.k = f23;
                    aVar5.l = f24;
                }
                i5++;
            }
        }
        if (h) {
            de0Var.j().c(de0Var, this, length, 0.0f, bs1.s(), bs1.q(), de0Var.b().c(), i, null);
        } else {
            de0Var.j().f(de0Var, this, length, 0.0f, bs1.s(), bs1.q(), w31Var);
        }
    }

    @Override // com.daaw.xa1, com.daaw.zc0
    public void o(un unVar) {
        super.o(unVar);
        unVar.L("mirror", this.O, "b");
        unVar.L("flipEveryOther", this.P, "b");
    }

    @Override // com.daaw.t40
    /* renamed from: u */
    public Boolean j(Integer num, float[] fArr, int[] iArr) {
        he0.a aVar = this.B[num.intValue()];
        this.x = aVar;
        int i = aVar.a;
        if (i >= 0) {
            he0.a[] aVarArr = this.B;
            this.z = aVarArr[i];
            int q = q(i, aVarArr.length, this.Q);
            int q2 = q(num.intValue(), this.B.length, this.Q);
            iArr[0] = q;
            iArr[1] = q2;
            iArr[2] = iArr[0];
            iArr[3] = iArr[1];
            he0.a aVar2 = this.z;
            float f = aVar2.o;
            this.q = f;
            float f2 = aVar2.p;
            this.r = f2;
            float f3 = aVar2.q;
            this.o = f3;
            float f4 = aVar2.r;
            this.p = f4;
            he0.a aVar3 = this.x;
            float f5 = aVar3.o;
            this.u = f5;
            float f6 = aVar3.p;
            this.v = f6;
            float f7 = aVar3.q;
            this.s = f7;
            float f8 = aVar3.r;
            this.t = f8;
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
    public Boolean c(Integer num, float[] fArr, int[] iArr, float[] fArr2) {
        he0.a aVar = this.B[num.intValue()];
        this.x = aVar;
        int i = aVar.a;
        if (i >= 0) {
            this.z = this.B[i];
            iArr[1] = q(num.intValue(), this.B.length, this.Q);
            iArr[0] = q(this.x.a, this.B.length, this.Q);
            iArr[2] = iArr[0];
            iArr[3] = iArr[1];
            he0.a aVar2 = this.z;
            float f = aVar2.o;
            this.q = f;
            float f2 = aVar2.p;
            this.r = f2;
            float f3 = aVar2.q;
            this.o = f3;
            float f4 = aVar2.r;
            this.p = f4;
            he0.a aVar3 = this.x;
            float f5 = aVar3.o;
            this.u = f5;
            float f6 = aVar3.p;
            this.v = f6;
            float f7 = aVar3.q;
            this.s = f7;
            float f8 = aVar3.r;
            this.t = f8;
            fArr[0] = f;
            fArr[1] = f2;
            fArr[2] = f5;
            fArr[3] = f6;
            fArr[4] = f3;
            fArr[5] = f4;
            fArr[6] = f7;
            fArr[7] = f8;
            int i2 = aVar2.a;
            if (i2 >= 0) {
                he0.a[] aVarArr = this.B;
                he0.a aVar4 = aVarArr[i2];
                this.y = aVar4;
                float f9 = aVar4.o;
                float f10 = aVar4.p;
                float f11 = aVar4.q;
                float f12 = aVar4.r;
                int i3 = aVar3.b;
                if (i3 >= 0) {
                    he0.a aVar5 = aVarArr[i3];
                    this.A = aVar5;
                    float f13 = aVar5.o;
                    x(-(f2 - f10), f - f9, -(f6 - f2), f5 - f, -(aVar5.p - f6), f13 - f5, -(f4 - f12), f3 - f11, -(f8 - f4), f7 - f3, -(aVar5.r - f8), aVar5.q - f7, fArr2);
                } else {
                    x(-(f2 - f10), f - f9, -(f6 - f2), f5 - f, -(f6 - f2), f5 - f, -(f4 - f12), f3 - f11, -(f8 - f4), f7 - f3, -(f8 - f4), f7 - f3, fArr2);
                }
            } else {
                int i4 = aVar3.b;
                if (i4 >= 0) {
                    he0.a aVar6 = this.B[i4];
                    this.A = aVar6;
                    float f14 = aVar6.o;
                    x(-(f6 - f2), f5 - f, -(f6 - f2), f5 - f, -(aVar6.p - f6), f14 - f5, -(f8 - f4), f7 - f3, -(f8 - f4), f7 - f3, -(aVar6.r - f6), aVar6.q - f7, fArr2);
                } else {
                    x(-(f6 - f2), f5 - f, -(f6 - f2), f5 - f, -(f6 - f2), f5 - f, -(f8 - f4), f7 - f3, -(f8 - f4), f7 - f3, -(f8 - f4), f7 - f3, fArr2);
                }
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public final void w(he0.a aVar, bs1 bs1Var, float f, int i) {
        int i2 = aVar.b;
        if (i2 < 0) {
            this.A = aVar;
            bs1 bs1Var2 = this.l;
            bs1Var2.a = 0.0f;
            bs1Var2.b = 0.0f;
        } else {
            he0.a aVar2 = this.B[i2];
            this.A = aVar2;
            this.l.a = -(aVar2.b(i) - aVar.b(i));
            this.l.b = this.A.a(i) - aVar.a(i);
            this.l.o();
        }
        int i3 = aVar.a;
        if (i3 < 0) {
            bs1 bs1Var3 = this.l;
            float f2 = bs1Var3.a;
            aVar.i = f2;
            float f3 = bs1Var3.b;
            aVar.j = f3;
            bs1Var.a = f2 * f;
            bs1Var.b = f3 * f;
            return;
        }
        he0.a aVar3 = this.B[i3];
        this.k.a = -(aVar.b(i) - aVar3.b(i));
        this.k.b = aVar.a(i) - aVar3.a(i);
        this.k.o();
        bs1 bs1Var4 = this.m;
        bs1 bs1Var5 = this.k;
        float f4 = bs1Var5.a;
        bs1 bs1Var6 = this.l;
        bs1Var4.a = f4 + bs1Var6.a;
        bs1Var4.b = bs1Var5.b + bs1Var6.b;
        bs1Var4.o();
        bs1 bs1Var7 = this.m;
        float f5 = bs1Var7.a;
        aVar.i = f5;
        float f6 = bs1Var7.b;
        aVar.j = f6;
        bs1 bs1Var8 = this.k;
        float f7 = -bs1Var8.a;
        bs1Var8.a = f7;
        float f8 = -bs1Var8.b;
        bs1Var8.b = f8;
        float max = f / Math.max(Math.abs(bs1.g(f5, f6, f7, f8)), 0.25f);
        bs1Var.a = aVar.i * 1.0f * max;
        bs1Var.b = aVar.j * 1.0f * max;
    }

    public void x(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float[] fArr) {
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
        bs1 bs1Var = this.C;
        bs1Var.a = ((float) (d / sqrt)) + f13;
        bs1Var.b = ((float) (d2 / sqrt)) + f14;
        bs1Var.m(f13, f14, 1.5f);
        bs1 bs1Var2 = this.D;
        bs1Var2.a = ((float) (d5 / sqrt3)) + f13;
        bs1Var2.b = ((float) (d6 / sqrt3)) + f14;
        bs1Var2.m(f13, f14, 1.5f);
        bs1 bs1Var3 = this.E;
        bs1Var3.a = ((float) (d11 / sqrt6)) + f15;
        bs1Var3.b = ((float) (d12 / sqrt6)) + f16;
        bs1Var3.m(f15, f16, 1.5f);
        bs1 bs1Var4 = this.F;
        bs1Var4.a = ((float) (d7 / sqrt4)) + f15;
        bs1Var4.b = ((float) (d8 / sqrt4)) + f16;
        bs1Var4.m(f15, f16, 1.5f);
        bs1 bs1Var5 = this.C;
        fArr[0] = bs1Var5.a;
        fArr[1] = bs1Var5.b;
        bs1 bs1Var6 = this.D;
        fArr[2] = bs1Var6.a;
        fArr[3] = bs1Var6.b;
        bs1 bs1Var7 = this.E;
        fArr[4] = -bs1Var7.a;
        fArr[5] = -bs1Var7.b;
        bs1 bs1Var8 = this.F;
        fArr[6] = -bs1Var8.a;
        fArr[7] = -bs1Var8.b;
    }
}
