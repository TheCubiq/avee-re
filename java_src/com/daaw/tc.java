package com.daaw;

import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import com.daaw.qr1;
/* loaded from: classes.dex */
public abstract class tc implements sc0, pd0 {
    public final qr1.a[] a;
    public int b;
    public mr1 c;
    public le0[] d;
    public boolean e;
    public w31 f;
    public a g;
    public a h;
    public a i;
    public a j;
    public int k;
    public PointF l;
    public PointF m;
    public final int n;
    public bs1 o;
    public bs1 p;
    public bs1 q;
    public bs1 r;
    public bs1 s;
    public bs1 t;
    public bs1 u;
    public bs1 v;

    /* loaded from: classes.dex */
    public static class a {
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public int h;
    }

    public tc(int i) {
        qr1.a[] aVarArr = {new qr1.a("Position", 3, 5126), new qr1.a("TexCoord", 2, 5126), new qr1.a("Color", 4, 5121)};
        this.a = aVarArr;
        this.b = 0;
        this.d = new le0[]{null, null};
        this.e = false;
        this.f = new w31();
        this.g = new a();
        this.h = new a();
        this.i = new a();
        this.j = new a();
        this.l = new PointF();
        this.m = new PointF();
        this.o = new bs1(0.0f, 0.0f);
        this.p = new bs1(0.0f, 0.0f);
        this.q = new bs1(0.0f, 0.0f);
        this.r = new bs1(0.0f, 0.0f);
        this.s = new bs1(0.0f, 0.0f);
        this.t = new bs1(0.0f, 0.0f);
        this.u = new bs1(0.0f, 0.0f);
        this.v = new bs1(0.0f, 0.0f);
        int i2 = i * 3;
        this.n = i;
        int i3 = 0;
        for (qr1.a aVar : aVarArr) {
            i3 += aVar.e;
        }
        this.c = new mr1(i2, i3);
    }

    public void A(a aVar, float[] fArr, int[] iArr, int i) {
        int i2 = i * 2;
        this.c.k(fArr[i2]);
        this.c.k(fArr[i2 + 1]);
        this.c.k(aVar.c);
        this.c.k(aVar.e);
        this.c.k(aVar.f);
        this.c.l(v(iArr[i]));
    }

    public void B(a aVar, float[] fArr, float f, float f2, int[] iArr, int i) {
        int i2 = i * 2;
        this.c.k(fArr[i2]);
        this.c.k(fArr[i2 + 1]);
        this.c.k(fArr[8]);
        this.c.k(f);
        this.c.k(f2);
        this.c.l(v(iArr[0]));
    }

    @Override // com.daaw.pd0
    public void a() {
        this.c.g();
    }

    @Override // com.daaw.sc0
    public void b(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, qc0 qc0Var, int i2, qr1 qr1Var) {
        if (i((y31) de0Var, qc0Var, 10, i2, qr1Var)) {
            this.k = f80.t(i, 0);
            bs1Var.a = qc0Var.e(bs1Var.a);
            bs1Var.b = qc0Var.b(bs1Var.b);
            bs1Var2.a = qc0Var.e(bs1Var2.a);
            bs1Var2.b = qc0Var.b(bs1Var2.b);
            a aVar = this.h;
            aVar.d = 1.0f;
            aVar.g = qc0Var.f();
            a aVar2 = this.h;
            aVar2.h = i;
            aVar2.c = f9;
            a aVar3 = this.i;
            aVar3.d = 1.0f;
            aVar3.g = qc0Var.f();
            a aVar4 = this.i;
            aVar4.h = this.k;
            aVar4.c = f9;
            a aVar5 = this.h;
            aVar5.a = f5;
            aVar5.b = f6;
            aVar5.e = bs1Var.a;
            aVar5.f = bs1Var2.b;
            x(aVar5);
            a aVar6 = this.h;
            aVar6.a = f;
            aVar6.b = f2;
            aVar6.e = bs1Var.a;
            aVar6.f = bs1Var.b;
            x(aVar6);
            a aVar7 = this.h;
            aVar7.a = f7;
            aVar7.b = f8;
            aVar7.e = bs1Var2.a;
            aVar7.f = bs1Var2.b;
            x(aVar7);
            a aVar8 = this.h;
            aVar8.a = f7;
            aVar8.b = f8;
            aVar8.e = bs1Var2.a;
            aVar8.f = bs1Var2.b;
            x(aVar8);
            a aVar9 = this.h;
            aVar9.a = f;
            aVar9.b = f2;
            aVar9.e = bs1Var.a;
            aVar9.f = bs1Var.b;
            x(aVar9);
            a aVar10 = this.h;
            aVar10.a = f3;
            aVar10.b = f4;
            aVar10.e = bs1Var2.a;
            aVar10.f = bs1Var.b;
            x(aVar10);
            float signum = Math.signum(((f - f3) * (f2 + f4)) + ((f3 - f7) * (f4 + f8)) + ((f7 - f) * (f8 + f2)));
            bs1 bs1Var3 = this.s;
            bs1Var3.a = -(f4 - f2);
            bs1Var3.b = f3 - f;
            bs1Var3.p();
            bs1 bs1Var4 = this.t;
            bs1Var4.a = -(f8 - f4);
            bs1Var4.b = f7 - f3;
            bs1Var4.p();
            bs1 bs1Var5 = this.u;
            bs1Var5.a = -(f6 - f8);
            bs1Var5.b = f5 - f7;
            bs1Var5.p();
            bs1 bs1Var6 = this.v;
            bs1Var6.a = -(f2 - f6);
            bs1Var6.b = f - f5;
            bs1Var6.p();
            bs1 bs1Var7 = this.o;
            bs1 bs1Var8 = this.s;
            float f10 = bs1Var8.a;
            bs1 bs1Var9 = this.v;
            bs1Var7.a = f10 + bs1Var9.a;
            bs1Var7.b = bs1Var8.b + bs1Var9.b;
            float f11 = signum * 1.5f;
            bs1Var7.n(bs1Var8, f11);
            bs1 bs1Var10 = this.p;
            bs1 bs1Var11 = this.s;
            float f12 = bs1Var11.a;
            bs1 bs1Var12 = this.t;
            bs1Var10.a = f12 + bs1Var12.a;
            bs1Var10.b = bs1Var11.b + bs1Var12.b;
            bs1Var10.n(bs1Var12, f11);
            bs1 bs1Var13 = this.q;
            bs1 bs1Var14 = this.t;
            float f13 = bs1Var14.a;
            bs1 bs1Var15 = this.u;
            bs1Var13.a = f13 + bs1Var15.a;
            bs1Var13.b = bs1Var14.b + bs1Var15.b;
            bs1Var13.n(bs1Var15, f11);
            bs1 bs1Var16 = this.r;
            bs1 bs1Var17 = this.u;
            float f14 = bs1Var17.a;
            bs1 bs1Var18 = this.v;
            bs1Var16.a = f14 + bs1Var18.a;
            bs1Var16.b = bs1Var17.b + bs1Var18.b;
            bs1Var16.n(bs1Var18, f11);
            bs1 bs1Var19 = this.o;
            bs1Var19.a = f - bs1Var19.a;
            bs1Var19.b = f2 - bs1Var19.b;
            bs1 bs1Var20 = this.p;
            bs1Var20.a = f3 - bs1Var20.a;
            bs1Var20.b = f4 - bs1Var20.b;
            bs1 bs1Var21 = this.q;
            bs1Var21.a = f7 - bs1Var21.a;
            bs1Var21.b = f8 - bs1Var21.b;
            bs1 bs1Var22 = this.r;
            bs1Var22.a = f5 - bs1Var22.a;
            bs1Var22.b = f6 - bs1Var22.b;
            a aVar11 = this.h;
            aVar11.a = f;
            aVar11.b = f2;
            aVar11.e = bs1Var.a;
            aVar11.f = bs1Var.b;
            x(aVar11);
            a aVar12 = this.h;
            aVar12.a = f3;
            aVar12.b = f4;
            aVar12.e = bs1Var2.a;
            aVar12.f = bs1Var.b;
            x(aVar12);
            a aVar13 = this.i;
            bs1 bs1Var23 = this.o;
            aVar13.a = bs1Var23.a;
            aVar13.b = bs1Var23.b;
            aVar13.e = bs1Var.a;
            aVar13.f = bs1Var.b;
            x(aVar13);
            a aVar14 = this.i;
            bs1 bs1Var24 = this.o;
            aVar14.a = bs1Var24.a;
            aVar14.b = bs1Var24.b;
            aVar14.e = bs1Var.a;
            aVar14.f = bs1Var.b;
            x(aVar14);
            a aVar15 = this.h;
            aVar15.a = f3;
            aVar15.b = f4;
            aVar15.e = bs1Var2.a;
            aVar15.f = bs1Var.b;
            x(aVar15);
            a aVar16 = this.i;
            bs1 bs1Var25 = this.p;
            aVar16.a = bs1Var25.a;
            aVar16.b = bs1Var25.b;
            aVar16.e = bs1Var2.a;
            aVar16.f = bs1Var.b;
            x(aVar16);
            a aVar17 = this.h;
            aVar17.a = f3;
            aVar17.b = f4;
            aVar17.e = bs1Var.a;
            aVar17.f = bs1Var.b;
            x(aVar17);
            a aVar18 = this.h;
            aVar18.a = f7;
            aVar18.b = f8;
            aVar18.e = bs1Var2.a;
            aVar18.f = bs1Var.b;
            x(aVar18);
            a aVar19 = this.i;
            bs1 bs1Var26 = this.p;
            aVar19.a = bs1Var26.a;
            aVar19.b = bs1Var26.b;
            aVar19.e = bs1Var.a;
            aVar19.f = bs1Var.b;
            x(aVar19);
            a aVar20 = this.i;
            bs1 bs1Var27 = this.p;
            aVar20.a = bs1Var27.a;
            aVar20.b = bs1Var27.b;
            aVar20.e = bs1Var.a;
            aVar20.f = bs1Var.b;
            x(aVar20);
            a aVar21 = this.h;
            aVar21.a = f7;
            aVar21.b = f8;
            aVar21.e = bs1Var2.a;
            aVar21.f = bs1Var.b;
            x(aVar21);
            a aVar22 = this.i;
            bs1 bs1Var28 = this.q;
            aVar22.a = bs1Var28.a;
            aVar22.b = bs1Var28.b;
            aVar22.e = bs1Var2.a;
            aVar22.f = bs1Var.b;
            x(aVar22);
            a aVar23 = this.h;
            aVar23.a = f7;
            aVar23.b = f8;
            aVar23.e = bs1Var.a;
            aVar23.f = bs1Var.b;
            x(aVar23);
            a aVar24 = this.h;
            aVar24.a = f5;
            aVar24.b = f6;
            aVar24.e = bs1Var2.a;
            aVar24.f = bs1Var.b;
            x(aVar24);
            a aVar25 = this.i;
            bs1 bs1Var29 = this.q;
            aVar25.a = bs1Var29.a;
            aVar25.b = bs1Var29.b;
            aVar25.e = bs1Var.a;
            aVar25.f = bs1Var.b;
            x(aVar25);
            a aVar26 = this.i;
            bs1 bs1Var30 = this.q;
            aVar26.a = bs1Var30.a;
            aVar26.b = bs1Var30.b;
            aVar26.e = bs1Var.a;
            aVar26.f = bs1Var.b;
            x(aVar26);
            a aVar27 = this.h;
            aVar27.a = f5;
            aVar27.b = f6;
            aVar27.e = bs1Var2.a;
            aVar27.f = bs1Var.b;
            x(aVar27);
            a aVar28 = this.i;
            bs1 bs1Var31 = this.r;
            aVar28.a = bs1Var31.a;
            aVar28.b = bs1Var31.b;
            aVar28.e = bs1Var2.a;
            aVar28.f = bs1Var.b;
            x(aVar28);
            a aVar29 = this.h;
            aVar29.a = f5;
            aVar29.b = f6;
            aVar29.e = bs1Var.a;
            aVar29.f = bs1Var.b;
            x(aVar29);
            a aVar30 = this.h;
            aVar30.a = f;
            aVar30.b = f2;
            aVar30.e = bs1Var2.a;
            aVar30.f = bs1Var.b;
            x(aVar30);
            a aVar31 = this.i;
            bs1 bs1Var32 = this.r;
            aVar31.a = bs1Var32.a;
            aVar31.b = bs1Var32.b;
            aVar31.e = bs1Var.a;
            aVar31.f = bs1Var.b;
            x(aVar31);
            a aVar32 = this.i;
            bs1 bs1Var33 = this.r;
            aVar32.a = bs1Var33.a;
            aVar32.b = bs1Var33.b;
            aVar32.e = bs1Var.a;
            aVar32.f = bs1Var.b;
            x(aVar32);
            a aVar33 = this.h;
            aVar33.a = f;
            aVar33.b = f2;
            aVar33.e = bs1Var2.a;
            aVar33.f = bs1Var.b;
            x(aVar33);
            a aVar34 = this.i;
            bs1 bs1Var34 = this.o;
            aVar34.a = bs1Var34.a;
            aVar34.b = bs1Var34.b;
            aVar34.e = bs1Var2.a;
            aVar34.f = bs1Var.b;
            x(aVar34);
            this.b += 10;
        }
    }

    @Override // com.daaw.sc0
    public void c(de0 de0Var, u40<Integer, float[], int[], float[], Boolean> u40Var, int i, float f, bs1 bs1Var, bs1 bs1Var2, qc0 qc0Var, int i2, qr1 qr1Var) {
        int i3;
        int i4;
        int i5;
        y31 y31Var;
        float[] fArr;
        int i6 = i;
        y31 y31Var2 = (y31) de0Var;
        float[] fArr2 = new float[8];
        int[] iArr = new int[4];
        float[] fArr3 = new float[8];
        bs1Var.a = qc0Var.e(bs1Var.a);
        bs1Var.b = qc0Var.b(bs1Var.b);
        bs1Var2.a = qc0Var.e(bs1Var2.a);
        bs1Var2.b = qc0Var.b(bs1Var2.b);
        a aVar = this.g;
        aVar.d = 1.0f;
        aVar.g = qc0Var.f();
        this.g.c = f;
        a aVar2 = this.h;
        aVar2.d = 1.0f;
        aVar2.g = qc0Var.f();
        this.h.c = f;
        a aVar3 = this.i;
        aVar3.d = 1.0f;
        aVar3.g = qc0Var.f();
        a aVar4 = this.i;
        aVar4.c = f;
        aVar4.d = 1.0f;
        aVar4.g = qc0Var.f();
        this.i.c = f;
        int i7 = this.n;
        int i8 = i7 - (i7 % 6);
        int i9 = 0;
        while (i9 < i6) {
            if ((i9 * 6) % i8 == 0) {
                i3 = i9;
                i5 = 0;
                i4 = i8;
                if (!i(y31Var2, qc0Var, Math.min((i6 - i9) * 6, i8), i2, qr1Var)) {
                    return;
                }
            } else {
                i3 = i9;
                i4 = i8;
                i5 = 0;
            }
            if (u40Var.c(Integer.valueOf(i3), fArr2, iArr, fArr3).booleanValue()) {
                a aVar5 = this.h;
                aVar5.e = bs1Var.a;
                aVar5.f = bs1Var2.b;
                A(aVar5, fArr2, iArr, 2);
                a aVar6 = this.h;
                aVar6.e = bs1Var.a;
                aVar6.f = bs1Var.b;
                A(aVar6, fArr2, iArr, i5);
                a aVar7 = this.h;
                aVar7.e = bs1Var2.a;
                aVar7.f = bs1Var2.b;
                A(aVar7, fArr2, iArr, 3);
                a aVar8 = this.h;
                aVar8.e = bs1Var2.a;
                aVar8.f = bs1Var2.b;
                A(aVar8, fArr2, iArr, 3);
                a aVar9 = this.h;
                aVar9.e = bs1Var.a;
                aVar9.f = bs1Var.b;
                A(aVar9, fArr2, iArr, i5);
                a aVar10 = this.h;
                aVar10.e = bs1Var2.a;
                aVar10.f = bs1Var.b;
                A(aVar10, fArr2, iArr, 1);
                a aVar11 = this.g;
                aVar11.h = iArr[i5];
                this.h.h = iArr[1];
                this.i.h = iArr[3];
                this.j.h = iArr[2];
                float f2 = fArr2[0];
                float f3 = fArr2[1];
                float f4 = fArr2[2];
                float f5 = fArr2[3];
                float f6 = fArr2[6];
                float f7 = fArr2[7];
                float f8 = fArr2[4];
                float f9 = fArr2[5];
                y31Var = y31Var2;
                bs1 bs1Var3 = this.o;
                fArr = fArr2;
                bs1Var3.a = f2 - fArr3[0];
                bs1Var3.b = f3 - fArr3[1];
                bs1 bs1Var4 = this.p;
                bs1Var4.a = f4 - fArr3[2];
                bs1Var4.b = f5 - fArr3[3];
                bs1 bs1Var5 = this.q;
                bs1Var5.a = f6 - fArr3[4];
                bs1Var5.b = f7 - fArr3[5];
                bs1 bs1Var6 = this.r;
                bs1Var6.a = f8 - fArr3[6];
                bs1Var6.b = f9 - fArr3[7];
                aVar11.a = f2;
                aVar11.b = f3;
                aVar11.e = bs1Var.a;
                aVar11.f = bs1Var.b;
                x(aVar11);
                a aVar12 = this.h;
                aVar12.a = f4;
                aVar12.b = f5;
                aVar12.e = bs1Var2.a;
                aVar12.f = bs1Var.b;
                x(aVar12);
                a aVar13 = this.g;
                bs1 bs1Var7 = this.o;
                aVar13.a = bs1Var7.a;
                aVar13.b = bs1Var7.b;
                aVar13.e = bs1Var.a;
                aVar13.f = bs1Var.b;
                z(aVar13, 0);
                a aVar14 = this.g;
                bs1 bs1Var8 = this.o;
                aVar14.a = bs1Var8.a;
                aVar14.b = bs1Var8.b;
                aVar14.e = bs1Var.a;
                aVar14.f = bs1Var.b;
                z(aVar14, 0);
                a aVar15 = this.h;
                aVar15.a = f4;
                aVar15.b = f5;
                aVar15.e = bs1Var2.a;
                aVar15.f = bs1Var.b;
                x(aVar15);
                a aVar16 = this.h;
                bs1 bs1Var9 = this.p;
                aVar16.a = bs1Var9.a;
                aVar16.b = bs1Var9.b;
                aVar16.e = bs1Var2.a;
                aVar16.f = bs1Var.b;
                z(aVar16, 0);
                a aVar17 = this.i;
                aVar17.a = f6;
                aVar17.b = f7;
                aVar17.e = bs1Var.a;
                aVar17.f = bs1Var.b;
                x(aVar17);
                a aVar18 = this.j;
                aVar18.a = f8;
                aVar18.b = f9;
                aVar18.e = bs1Var2.a;
                aVar18.f = bs1Var.b;
                x(aVar18);
                a aVar19 = this.i;
                bs1 bs1Var10 = this.q;
                aVar19.a = bs1Var10.a;
                aVar19.b = bs1Var10.b;
                aVar19.e = bs1Var.a;
                aVar19.f = bs1Var.b;
                z(aVar19, 0);
                a aVar20 = this.i;
                bs1 bs1Var11 = this.q;
                aVar20.a = bs1Var11.a;
                aVar20.b = bs1Var11.b;
                aVar20.e = bs1Var.a;
                aVar20.f = bs1Var.b;
                z(aVar20, 0);
                a aVar21 = this.j;
                aVar21.a = f8;
                aVar21.b = f9;
                aVar21.e = bs1Var2.a;
                aVar21.f = bs1Var.b;
                x(aVar21);
                a aVar22 = this.j;
                bs1 bs1Var12 = this.r;
                aVar22.a = bs1Var12.a;
                aVar22.b = bs1Var12.b;
                aVar22.e = bs1Var2.a;
                aVar22.f = bs1Var.b;
                z(aVar22, 0);
                this.b += 6;
            } else {
                y31Var = y31Var2;
                fArr = fArr2;
            }
            i9 = i3 + 1;
            i6 = i;
            i8 = i4;
            y31Var2 = y31Var;
            fArr2 = fArr;
        }
    }

    @Override // com.daaw.sc0
    public void e(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, qc0 qc0Var, int i2) {
        k(de0Var, f, f2, f3, f4, f5, f6, f7, f8, f9, i, bs1Var, bs1Var2, new w31(i2, qc0Var, (qr1) null, (g0<y31, sr1, w31>) null), false);
    }

    public qr1 g(sr1 sr1Var) {
        return new qr1(this.c, sr1Var, this.a);
    }

    public boolean h(y31 y31Var, int i, w31 w31Var, boolean z) {
        if (w() - ((this.c.i() * 3) * i) < 0 || !this.f.b(w31Var)) {
            z = true;
        }
        if (z) {
            q(y31Var, this.f);
        }
        this.f.a(w31Var);
        if (w() - ((this.c.i() * 3) * i) < 0) {
            lz1.c("buffer too small");
            return false;
        }
        return true;
    }

    public boolean i(y31 y31Var, qc0 qc0Var, int i, int i2, qr1 qr1Var) {
        return h(y31Var, i, new w31(i2, qc0Var, qr1Var, (g0<y31, sr1, w31>) null), false);
    }

    public void j(y31 y31Var, t40<Integer, float[], int[], Boolean> t40Var, t40<Integer, float[], int[], Boolean> t40Var2, t40<Integer, float[], int[], Boolean> t40Var3, t40<Integer, float[], int[], Boolean> t40Var4, int i, float f, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
        int i2;
        int i3;
        float[] fArr;
        int[] iArr;
        int i4 = i;
        int i5 = t40Var2 != null ? 4 : 2;
        if (t40Var3 != null) {
            i5 += 2;
        }
        if (t40Var4 != null) {
            i5 += 2;
        }
        int i6 = i5;
        float[] fArr2 = new float[9];
        int[] iArr2 = new int[1];
        bs1Var.a = w31Var.i(bs1Var.a);
        bs1Var.b = w31Var.j(bs1Var.b);
        bs1Var2.a = w31Var.i(bs1Var2.a);
        bs1Var2.b = w31Var.j(bs1Var2.b);
        a aVar = this.h;
        aVar.d = 1.0f;
        aVar.g = w31Var.k();
        this.h.c = f;
        fArr2[8] = f;
        int i7 = this.n;
        int i8 = i7 - (i7 % i6);
        boolean z = false;
        int i9 = 0;
        while (i9 < i4) {
            if ((i9 * i6) % i8 == 0 && !h(y31Var, Math.min((i4 - i9) * i6, i8), w31Var, z)) {
                return;
            }
            if (t40Var.j(Integer.valueOf(i9), fArr2, iArr2).booleanValue()) {
                i2 = i8;
                i3 = i9;
                int[] iArr3 = iArr2;
                float[] fArr3 = fArr2;
                B(this.h, fArr2, bs1Var.a, bs1Var2.b, iArr2, 2);
                B(this.h, fArr3, bs1Var.a, bs1Var.b, iArr2, 0);
                B(this.h, fArr3, bs1Var2.a, bs1Var2.b, iArr2, 3);
                B(this.h, fArr3, bs1Var2.a, bs1Var2.b, iArr2, 3);
                B(this.h, fArr3, bs1Var.a, bs1Var.b, iArr2, 0);
                B(this.h, fArr3, bs1Var2.a, bs1Var.b, iArr2, 1);
                if (t40Var2 != null) {
                    t40Var2.j(Integer.valueOf(i3), fArr3, iArr3);
                    B(this.h, fArr3, bs1Var.a, bs1Var2.b, iArr3, 2);
                    B(this.h, fArr3, bs1Var.a, bs1Var.b, iArr3, 0);
                    B(this.h, fArr3, bs1Var2.a, bs1Var2.b, iArr3, 3);
                    B(this.h, fArr3, bs1Var2.a, bs1Var2.b, iArr3, 3);
                    B(this.h, fArr3, bs1Var.a, bs1Var.b, iArr3, 0);
                    B(this.h, fArr3, bs1Var2.a, bs1Var.b, iArr3, 1);
                }
                if (t40Var3 != null) {
                    t40Var3.j(Integer.valueOf(i3), fArr3, iArr3);
                    B(this.h, fArr3, bs1Var.a, bs1Var2.b, iArr3, 2);
                    B(this.h, fArr3, bs1Var.a, bs1Var.b, iArr3, 0);
                    B(this.h, fArr3, bs1Var2.a, bs1Var2.b, iArr3, 3);
                    B(this.h, fArr3, bs1Var2.a, bs1Var2.b, iArr3, 3);
                    B(this.h, fArr3, bs1Var.a, bs1Var.b, iArr3, 0);
                    B(this.h, fArr3, bs1Var2.a, bs1Var.b, iArr3, 1);
                }
                if (t40Var4 != null) {
                    t40Var4.j(Integer.valueOf(i3), fArr3, iArr3);
                    iArr = iArr3;
                    fArr = fArr3;
                    B(this.h, fArr3, bs1Var.a, bs1Var2.b, iArr3, 2);
                    B(this.h, fArr, bs1Var.a, bs1Var.b, iArr3, 0);
                    B(this.h, fArr, bs1Var2.a, bs1Var2.b, iArr3, 3);
                    B(this.h, fArr, bs1Var2.a, bs1Var2.b, iArr3, 3);
                    B(this.h, fArr, bs1Var.a, bs1Var.b, iArr3, 0);
                    B(this.h, fArr, bs1Var2.a, bs1Var.b, iArr3, 1);
                } else {
                    fArr = fArr3;
                    iArr = iArr3;
                }
                this.b += i6;
            } else {
                i3 = i9;
                i2 = i8;
                iArr = iArr2;
                fArr = fArr2;
            }
            i9 = i3 + 1;
            i4 = i;
            i8 = i2;
            iArr2 = iArr;
            fArr2 = fArr;
            z = false;
        }
    }

    public void k(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var, boolean z) {
        y31 y31Var = (y31) de0Var;
        if (h(y31Var, 2, w31Var, z)) {
            bs1Var.a = w31Var.i(bs1Var.a);
            bs1Var.b = w31Var.j(bs1Var.b);
            bs1Var2.a = w31Var.i(bs1Var2.a);
            bs1Var2.b = w31Var.j(bs1Var2.b);
            a aVar = this.h;
            aVar.d = 1.0f;
            aVar.g = w31Var.k();
            a aVar2 = this.h;
            aVar2.h = i;
            aVar2.c = f9;
            aVar2.a = f5;
            aVar2.b = f6;
            aVar2.e = bs1Var.a;
            aVar2.f = bs1Var2.b;
            x(aVar2);
            a aVar3 = this.h;
            aVar3.a = f;
            aVar3.b = f2;
            aVar3.e = bs1Var.a;
            aVar3.f = bs1Var.b;
            x(aVar3);
            a aVar4 = this.h;
            aVar4.a = f7;
            aVar4.b = f8;
            aVar4.e = bs1Var2.a;
            aVar4.f = bs1Var2.b;
            x(aVar4);
            a aVar5 = this.h;
            aVar5.a = f7;
            aVar5.b = f8;
            aVar5.e = bs1Var2.a;
            aVar5.f = bs1Var2.b;
            x(aVar5);
            a aVar6 = this.h;
            aVar6.a = f;
            aVar6.b = f2;
            aVar6.e = bs1Var.a;
            aVar6.f = bs1Var.b;
            x(aVar6);
            a aVar7 = this.h;
            aVar7.a = f3;
            aVar7.b = f4;
            aVar7.e = bs1Var2.a;
            aVar7.f = bs1Var.b;
            x(aVar7);
            this.b += 2;
            if (z) {
                h(y31Var, 0, w31Var, z);
            }
        }
    }

    public void l(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
        k(de0Var, f, f2, f3, f4, f7, f8, f5, f6, f9, i, bs1Var, bs1Var2, w31Var, false);
    }

    public void m(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var, boolean z) {
        k(de0Var, f, f2, f3, f4, f7, f8, f5, f6, f9, i, bs1Var, bs1Var2, w31Var, z);
    }

    public void n(y31 y31Var, float f, float f2, float f3, float f4, float f5, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var, boolean z) {
        if (h(y31Var, 2, w31Var, z)) {
            bs1Var.a = w31Var.i(bs1Var.a);
            bs1Var.b = w31Var.j(bs1Var.b);
            bs1Var2.a = w31Var.i(bs1Var2.a);
            bs1Var2.b = w31Var.j(bs1Var2.b);
            a aVar = this.h;
            aVar.d = 1.0f;
            aVar.g = w31Var.k();
            a aVar2 = this.h;
            aVar2.h = i;
            aVar2.c = f3;
            aVar2.a = f;
            float f6 = f5 + f2;
            aVar2.b = f6;
            aVar2.e = bs1Var.a;
            aVar2.f = bs1Var2.b;
            x(aVar2);
            a aVar3 = this.h;
            aVar3.a = f;
            aVar3.b = f2;
            aVar3.e = bs1Var.a;
            aVar3.f = bs1Var.b;
            x(aVar3);
            a aVar4 = this.h;
            float f7 = f4 + f;
            aVar4.a = f7;
            aVar4.b = f6;
            aVar4.e = bs1Var2.a;
            aVar4.f = bs1Var2.b;
            x(aVar4);
            a aVar5 = this.h;
            aVar5.a = f7;
            aVar5.b = f6;
            aVar5.e = bs1Var2.a;
            aVar5.f = bs1Var2.b;
            x(aVar5);
            a aVar6 = this.h;
            aVar6.a = f;
            aVar6.b = f2;
            aVar6.e = bs1Var.a;
            aVar6.f = bs1Var.b;
            x(aVar6);
            a aVar7 = this.h;
            aVar7.a = f7;
            aVar7.b = f2;
            aVar7.e = bs1Var2.a;
            aVar7.f = bs1Var.b;
            x(aVar7);
            this.b += 2;
            if (z) {
                h(y31Var, 2, w31Var, z);
            }
        }
    }

    public void o(de0 de0Var, float f, float f2, float f3, float f4, float f5, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var, boolean z) {
        float f6 = f2 + f5;
        float f7 = f + f4;
        m(de0Var, f, f6, f7, f6, f7, f2, f, f2, f3, i, bs1Var, bs1Var2, w31Var, z);
    }

    public void p(y31 y31Var) {
        w31 w31Var = new w31();
        if (q(y31Var, this.f)) {
            this.f.a(w31Var);
        }
    }

    public final boolean q(y31 y31Var, w31 w31Var) {
        if (this.e) {
            return false;
        }
        this.e = true;
        if (this.b > 0) {
            y31Var.k();
            this.c.h();
            t(y31Var, w31Var);
            this.b = 0;
        }
        this.c.f();
        this.e = false;
        return true;
    }

    public void r(y31 y31Var) {
        p(y31Var);
    }

    public void s(y31 y31Var) {
        this.b = 0;
        this.c.f();
        this.f.h();
    }

    public final void t(y31 y31Var, w31 w31Var) {
        qr1 qr1Var = w31Var.c;
        if (qr1Var == null) {
            qr1Var = y31Var.u.r();
        }
        y31Var.e(w31Var.a);
        int d = w31Var.d();
        while (true) {
            d--;
            if (d < 0) {
                y31Var.T(w31Var.g());
                qr1Var.a(y31Var, w31Var.d, w31Var);
                qr1Var.b(4, 0, this.b * 3);
                qr1Var.d(y31Var);
                return;
            }
            GLES20.glActiveTexture(33984 + d);
            le0 c = w31Var.c(d);
            if (c == null || !c.b().k()) {
                GLES20.glBindTexture(3553, 0);
            } else {
                c.b().c();
            }
        }
    }

    public void u(y31 y31Var, RectF rectF, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var, ge0 ge0Var) {
        int i2 = ge0Var.i(rectF);
        int i3 = i2 - 1;
        ge0Var.e(false, i3, i2, rectF, 0.0f, this.l, this.m);
        PointF pointF = this.l;
        float f = pointF.x;
        float f2 = pointF.y;
        bs1Var.a = w31Var.i(bs1Var.a);
        bs1Var.b = w31Var.j(bs1Var.b);
        bs1Var2.a = w31Var.i(bs1Var2.a);
        float j = w31Var.j(bs1Var2.b);
        bs1Var2.b = j;
        float f3 = bs1Var.a;
        float f4 = bs1Var2.a;
        float f5 = (f3 + f4) * 0.5f;
        float f6 = 0.5f * (bs1Var.b + j);
        float width = (f4 - f3) * (1.0f / rectF.width());
        float height = (bs1Var2.b - bs1Var.b) * (1.0f / rectF.height());
        a aVar = this.h;
        aVar.d = 1.0f;
        aVar.g = w31Var.k();
        a aVar2 = this.h;
        aVar2.h = i;
        aVar2.c = 0.0f;
        boolean z = false;
        float f7 = f2;
        float f8 = f;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = this.n;
            if (i4 % i5 == 0 && !h(y31Var, Math.min(i2 - i4, i5), w31Var, z)) {
                return;
            }
            float f9 = f8;
            float f10 = f7;
            float f11 = f6;
            float f12 = f5;
            ge0Var.e(false, i4, i2, rectF, 0.0f, this.l, this.m);
            a aVar3 = this.h;
            aVar3.a = f9;
            aVar3.b = f10;
            aVar3.e = f12 + ((f9 - rectF.centerX()) * width);
            this.h.f = f12 + ((f10 - rectF.centerY()) * height);
            x(this.h);
            this.h.a = rectF.centerX();
            this.h.b = rectF.centerY();
            a aVar4 = this.h;
            aVar4.e = f12;
            aVar4.f = f11;
            x(aVar4);
            a aVar5 = this.h;
            PointF pointF2 = this.l;
            float f13 = pointF2.x;
            aVar5.a = f13;
            aVar5.b = pointF2.y;
            aVar5.e = f12 + ((f13 - rectF.centerX()) * width);
            this.h.f = f12 + ((this.l.y - rectF.centerY()) * height);
            x(this.h);
            this.b++;
            PointF pointF3 = this.l;
            f8 = pointF3.x;
            i4++;
            f6 = f11;
            f5 = f12;
            f7 = pointF3.y;
            z = false;
        }
        float f14 = f5;
        if (y31Var.H()) {
            int t = f80.t(i, 0);
            ge0Var.e(false, i3, i2, rectF, 0.0f, this.l, this.m);
            PointF pointF4 = this.l;
            float f15 = pointF4.x;
            float f16 = pointF4.y;
            PointF pointF5 = this.m;
            float f17 = (pointF5.x * (-1.5f)) + f15;
            int i6 = this.n;
            int i7 = i6 - (i6 % 2);
            float f18 = f16;
            float f19 = f15;
            int i8 = 0;
            float f20 = (pointF5.y * (-1.5f)) + f16;
            float f21 = f17;
            while (i8 < i2) {
                if ((i8 * 2) % i7 == 0 && !h(y31Var, Math.min((i2 - i8) * 2, i7), w31Var, false)) {
                    return;
                }
                float f22 = f21;
                float f23 = f20;
                float f24 = f19;
                float f25 = f18;
                int i9 = i8;
                ge0Var.e(false, i8, i2, rectF, 0.0f, this.l, this.m);
                PointF pointF6 = this.l;
                float f26 = pointF6.x;
                PointF pointF7 = this.m;
                f21 = (pointF7.x * (-1.5f)) + f26;
                float f27 = pointF6.y + (pointF7.y * (-1.5f));
                a aVar6 = this.h;
                aVar6.a = f24;
                aVar6.b = f25;
                aVar6.e = f14 + ((f24 - rectF.centerX()) * width);
                this.h.f = f14 + ((f25 - rectF.centerY()) * height);
                a aVar7 = this.h;
                aVar7.h = i;
                x(aVar7);
                a aVar8 = this.h;
                PointF pointF8 = this.l;
                float f28 = pointF8.x;
                aVar8.a = f28;
                aVar8.b = pointF8.y;
                aVar8.e = f14 + ((f28 - rectF.centerX()) * width);
                this.h.f = f14 + ((this.l.y - rectF.centerY()) * height);
                a aVar9 = this.h;
                aVar9.h = i;
                x(aVar9);
                a aVar10 = this.h;
                aVar10.a = f21;
                aVar10.b = f27;
                aVar10.e = f14 + ((f21 - rectF.centerX()) * width);
                this.h.f = f14 + ((f27 - rectF.centerY()) * height);
                a aVar11 = this.h;
                aVar11.h = t;
                x(aVar11);
                x(this.h);
                a aVar12 = this.h;
                aVar12.a = f22;
                aVar12.b = f23;
                aVar12.e = ((f22 - rectF.centerX()) * width) + f14;
                this.h.f = f14 + ((f23 - rectF.centerY()) * height);
                a aVar13 = this.h;
                aVar13.h = t;
                x(aVar13);
                a aVar14 = this.h;
                aVar14.a = f24;
                aVar14.b = f25;
                aVar14.e = f14 + ((f24 - rectF.centerX()) * width);
                this.h.f = f14 + ((f25 - rectF.centerY()) * height);
                a aVar15 = this.h;
                aVar15.h = i;
                x(aVar15);
                this.b += 2;
                PointF pointF9 = this.l;
                f19 = pointF9.x;
                i8 = i9 + 1;
                f20 = f27;
                i7 = i7;
                f18 = pointF9.y;
            }
        }
    }

    public final int v(int i) {
        return ((i >> 16) & 255) | ((-16711936) & i) | ((i << 16) & 16711680);
    }

    public final int w() {
        return this.c.m();
    }

    public void x(a aVar) {
        this.c.k(aVar.a);
        this.c.k(aVar.b);
        this.c.k(aVar.c);
        this.c.k(aVar.e);
        this.c.k(aVar.f);
        this.c.l(v(aVar.h));
    }

    public void y(a aVar, float f, float f2, float f3, int[] iArr, int i) {
        this.c.k(f);
        this.c.k(f2);
        this.c.k(f3);
        this.c.k(aVar.e);
        this.c.k(aVar.f);
        this.c.l(v(iArr[i]));
    }

    public void z(a aVar, int i) {
        this.c.k(aVar.a);
        this.c.k(aVar.b);
        this.c.k(aVar.c);
        this.c.k(aVar.e);
        this.c.k(aVar.f);
        this.c.l(v(f80.t(aVar.h, i)));
    }
}
