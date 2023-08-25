package com.daaw;

import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import com.daaw.qr1;
/* renamed from: com.daaw.tc */
/* loaded from: classes.dex */
public abstract class AbstractC3044tc implements sc0, pd0 {

    /* renamed from: a */
    public final qr1.C2750a[] f27330a;

    /* renamed from: b */
    public int f27331b;

    /* renamed from: c */
    public mr1 f27332c;

    /* renamed from: d */
    public le0[] f27333d;

    /* renamed from: e */
    public boolean f27334e;

    /* renamed from: f */
    public w31 f27335f;

    /* renamed from: g */
    public C3045a f27336g;

    /* renamed from: h */
    public C3045a f27337h;

    /* renamed from: i */
    public C3045a f27338i;

    /* renamed from: j */
    public C3045a f27339j;

    /* renamed from: k */
    public int f27340k;

    /* renamed from: l */
    public PointF f27341l;

    /* renamed from: m */
    public PointF f27342m;

    /* renamed from: n */
    public final int f27343n;

    /* renamed from: o */
    public bs1 f27344o;

    /* renamed from: p */
    public bs1 f27345p;

    /* renamed from: q */
    public bs1 f27346q;

    /* renamed from: r */
    public bs1 f27347r;

    /* renamed from: s */
    public bs1 f27348s;

    /* renamed from: t */
    public bs1 f27349t;

    /* renamed from: u */
    public bs1 f27350u;

    /* renamed from: v */
    public bs1 f27351v;

    /* renamed from: com.daaw.tc$a */
    /* loaded from: classes.dex */
    public static class C3045a {

        /* renamed from: a */
        public float f27352a;

        /* renamed from: b */
        public float f27353b;

        /* renamed from: c */
        public float f27354c;

        /* renamed from: d */
        public float f27355d;

        /* renamed from: e */
        public float f27356e;

        /* renamed from: f */
        public float f27357f;

        /* renamed from: g */
        public float f27358g;

        /* renamed from: h */
        public int f27359h;
    }

    public AbstractC3044tc(int i) {
        qr1.C2750a[] c2750aArr = {new qr1.C2750a("Position", 3, 5126), new qr1.C2750a("TexCoord", 2, 5126), new qr1.C2750a("Color", 4, 5121)};
        this.f27330a = c2750aArr;
        this.f27331b = 0;
        this.f27333d = new le0[]{null, null};
        this.f27334e = false;
        this.f27335f = new w31();
        this.f27336g = new C3045a();
        this.f27337h = new C3045a();
        this.f27338i = new C3045a();
        this.f27339j = new C3045a();
        this.f27341l = new PointF();
        this.f27342m = new PointF();
        this.f27344o = new bs1(0.0f, 0.0f);
        this.f27345p = new bs1(0.0f, 0.0f);
        this.f27346q = new bs1(0.0f, 0.0f);
        this.f27347r = new bs1(0.0f, 0.0f);
        this.f27348s = new bs1(0.0f, 0.0f);
        this.f27349t = new bs1(0.0f, 0.0f);
        this.f27350u = new bs1(0.0f, 0.0f);
        this.f27351v = new bs1(0.0f, 0.0f);
        int i2 = i * 3;
        this.f27343n = i;
        int i3 = 0;
        for (qr1.C2750a c2750a : c2750aArr) {
            i3 += c2750a.f24285e;
        }
        this.f27332c = new mr1(i2, i3);
    }

    /* renamed from: A */
    public void m9365A(C3045a c3045a, float[] fArr, int[] iArr, int i) {
        int i2 = i * 2;
        this.f27332c.m15814k(fArr[i2]);
        this.f27332c.m15814k(fArr[i2 + 1]);
        this.f27332c.m15814k(c3045a.f27354c);
        this.f27332c.m15814k(c3045a.f27356e);
        this.f27332c.m15814k(c3045a.f27357f);
        this.f27332c.m15813l(m9347v(iArr[i]));
    }

    /* renamed from: B */
    public void m9364B(C3045a c3045a, float[] fArr, float f, float f2, int[] iArr, int i) {
        int i2 = i * 2;
        this.f27332c.m15814k(fArr[i2]);
        this.f27332c.m15814k(fArr[i2 + 1]);
        this.f27332c.m15814k(fArr[8]);
        this.f27332c.m15814k(f);
        this.f27332c.m15814k(f2);
        this.f27332c.m15813l(m9347v(iArr[0]));
    }

    @Override // com.daaw.pd0
    /* renamed from: a */
    public void mo9363a() {
        this.f27332c.m15818g();
    }

    @Override // com.daaw.sc0
    /* renamed from: b */
    public void mo7294b(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, qc0 qc0Var, int i2, qr1 qr1Var) {
        if (m9360i((y31) de0Var, qc0Var, 10, i2, qr1Var)) {
            this.f27340k = f80.m22854t(i, 0);
            bs1Var.f5090a = qc0Var.mo2797e(bs1Var.f5090a);
            bs1Var.f5091b = qc0Var.mo2800b(bs1Var.f5091b);
            bs1Var2.f5090a = qc0Var.mo2797e(bs1Var2.f5090a);
            bs1Var2.f5091b = qc0Var.mo2800b(bs1Var2.f5091b);
            C3045a c3045a = this.f27337h;
            c3045a.f27355d = 1.0f;
            c3045a.f27358g = qc0Var.mo2796f();
            C3045a c3045a2 = this.f27337h;
            c3045a2.f27359h = i;
            c3045a2.f27354c = f9;
            C3045a c3045a3 = this.f27338i;
            c3045a3.f27355d = 1.0f;
            c3045a3.f27358g = qc0Var.mo2796f();
            C3045a c3045a4 = this.f27338i;
            c3045a4.f27359h = this.f27340k;
            c3045a4.f27354c = f9;
            C3045a c3045a5 = this.f27337h;
            c3045a5.f27352a = f5;
            c3045a5.f27353b = f6;
            c3045a5.f27356e = bs1Var.f5090a;
            c3045a5.f27357f = bs1Var2.f5091b;
            m9345x(c3045a5);
            C3045a c3045a6 = this.f27337h;
            c3045a6.f27352a = f;
            c3045a6.f27353b = f2;
            c3045a6.f27356e = bs1Var.f5090a;
            c3045a6.f27357f = bs1Var.f5091b;
            m9345x(c3045a6);
            C3045a c3045a7 = this.f27337h;
            c3045a7.f27352a = f7;
            c3045a7.f27353b = f8;
            c3045a7.f27356e = bs1Var2.f5090a;
            c3045a7.f27357f = bs1Var2.f5091b;
            m9345x(c3045a7);
            C3045a c3045a8 = this.f27337h;
            c3045a8.f27352a = f7;
            c3045a8.f27353b = f8;
            c3045a8.f27356e = bs1Var2.f5090a;
            c3045a8.f27357f = bs1Var2.f5091b;
            m9345x(c3045a8);
            C3045a c3045a9 = this.f27337h;
            c3045a9.f27352a = f;
            c3045a9.f27353b = f2;
            c3045a9.f27356e = bs1Var.f5090a;
            c3045a9.f27357f = bs1Var.f5091b;
            m9345x(c3045a9);
            C3045a c3045a10 = this.f27337h;
            c3045a10.f27352a = f3;
            c3045a10.f27353b = f4;
            c3045a10.f27356e = bs1Var2.f5090a;
            c3045a10.f27357f = bs1Var.f5091b;
            m9345x(c3045a10);
            float signum = Math.signum(((f - f3) * (f2 + f4)) + ((f3 - f7) * (f4 + f8)) + ((f7 - f) * (f8 + f2)));
            bs1 bs1Var3 = this.f27348s;
            bs1Var3.f5090a = -(f4 - f2);
            bs1Var3.f5091b = f3 - f;
            bs1Var3.m25847p();
            bs1 bs1Var4 = this.f27349t;
            bs1Var4.f5090a = -(f8 - f4);
            bs1Var4.f5091b = f7 - f3;
            bs1Var4.m25847p();
            bs1 bs1Var5 = this.f27350u;
            bs1Var5.f5090a = -(f6 - f8);
            bs1Var5.f5091b = f5 - f7;
            bs1Var5.m25847p();
            bs1 bs1Var6 = this.f27351v;
            bs1Var6.f5090a = -(f2 - f6);
            bs1Var6.f5091b = f - f5;
            bs1Var6.m25847p();
            bs1 bs1Var7 = this.f27344o;
            bs1 bs1Var8 = this.f27348s;
            float f10 = bs1Var8.f5090a;
            bs1 bs1Var9 = this.f27351v;
            bs1Var7.f5090a = f10 + bs1Var9.f5090a;
            bs1Var7.f5091b = bs1Var8.f5091b + bs1Var9.f5091b;
            float f11 = signum * 1.5f;
            bs1Var7.m25849n(bs1Var8, f11);
            bs1 bs1Var10 = this.f27345p;
            bs1 bs1Var11 = this.f27348s;
            float f12 = bs1Var11.f5090a;
            bs1 bs1Var12 = this.f27349t;
            bs1Var10.f5090a = f12 + bs1Var12.f5090a;
            bs1Var10.f5091b = bs1Var11.f5091b + bs1Var12.f5091b;
            bs1Var10.m25849n(bs1Var12, f11);
            bs1 bs1Var13 = this.f27346q;
            bs1 bs1Var14 = this.f27349t;
            float f13 = bs1Var14.f5090a;
            bs1 bs1Var15 = this.f27350u;
            bs1Var13.f5090a = f13 + bs1Var15.f5090a;
            bs1Var13.f5091b = bs1Var14.f5091b + bs1Var15.f5091b;
            bs1Var13.m25849n(bs1Var15, f11);
            bs1 bs1Var16 = this.f27347r;
            bs1 bs1Var17 = this.f27350u;
            float f14 = bs1Var17.f5090a;
            bs1 bs1Var18 = this.f27351v;
            bs1Var16.f5090a = f14 + bs1Var18.f5090a;
            bs1Var16.f5091b = bs1Var17.f5091b + bs1Var18.f5091b;
            bs1Var16.m25849n(bs1Var18, f11);
            bs1 bs1Var19 = this.f27344o;
            bs1Var19.f5090a = f - bs1Var19.f5090a;
            bs1Var19.f5091b = f2 - bs1Var19.f5091b;
            bs1 bs1Var20 = this.f27345p;
            bs1Var20.f5090a = f3 - bs1Var20.f5090a;
            bs1Var20.f5091b = f4 - bs1Var20.f5091b;
            bs1 bs1Var21 = this.f27346q;
            bs1Var21.f5090a = f7 - bs1Var21.f5090a;
            bs1Var21.f5091b = f8 - bs1Var21.f5091b;
            bs1 bs1Var22 = this.f27347r;
            bs1Var22.f5090a = f5 - bs1Var22.f5090a;
            bs1Var22.f5091b = f6 - bs1Var22.f5091b;
            C3045a c3045a11 = this.f27337h;
            c3045a11.f27352a = f;
            c3045a11.f27353b = f2;
            c3045a11.f27356e = bs1Var.f5090a;
            c3045a11.f27357f = bs1Var.f5091b;
            m9345x(c3045a11);
            C3045a c3045a12 = this.f27337h;
            c3045a12.f27352a = f3;
            c3045a12.f27353b = f4;
            c3045a12.f27356e = bs1Var2.f5090a;
            c3045a12.f27357f = bs1Var.f5091b;
            m9345x(c3045a12);
            C3045a c3045a13 = this.f27338i;
            bs1 bs1Var23 = this.f27344o;
            c3045a13.f27352a = bs1Var23.f5090a;
            c3045a13.f27353b = bs1Var23.f5091b;
            c3045a13.f27356e = bs1Var.f5090a;
            c3045a13.f27357f = bs1Var.f5091b;
            m9345x(c3045a13);
            C3045a c3045a14 = this.f27338i;
            bs1 bs1Var24 = this.f27344o;
            c3045a14.f27352a = bs1Var24.f5090a;
            c3045a14.f27353b = bs1Var24.f5091b;
            c3045a14.f27356e = bs1Var.f5090a;
            c3045a14.f27357f = bs1Var.f5091b;
            m9345x(c3045a14);
            C3045a c3045a15 = this.f27337h;
            c3045a15.f27352a = f3;
            c3045a15.f27353b = f4;
            c3045a15.f27356e = bs1Var2.f5090a;
            c3045a15.f27357f = bs1Var.f5091b;
            m9345x(c3045a15);
            C3045a c3045a16 = this.f27338i;
            bs1 bs1Var25 = this.f27345p;
            c3045a16.f27352a = bs1Var25.f5090a;
            c3045a16.f27353b = bs1Var25.f5091b;
            c3045a16.f27356e = bs1Var2.f5090a;
            c3045a16.f27357f = bs1Var.f5091b;
            m9345x(c3045a16);
            C3045a c3045a17 = this.f27337h;
            c3045a17.f27352a = f3;
            c3045a17.f27353b = f4;
            c3045a17.f27356e = bs1Var.f5090a;
            c3045a17.f27357f = bs1Var.f5091b;
            m9345x(c3045a17);
            C3045a c3045a18 = this.f27337h;
            c3045a18.f27352a = f7;
            c3045a18.f27353b = f8;
            c3045a18.f27356e = bs1Var2.f5090a;
            c3045a18.f27357f = bs1Var.f5091b;
            m9345x(c3045a18);
            C3045a c3045a19 = this.f27338i;
            bs1 bs1Var26 = this.f27345p;
            c3045a19.f27352a = bs1Var26.f5090a;
            c3045a19.f27353b = bs1Var26.f5091b;
            c3045a19.f27356e = bs1Var.f5090a;
            c3045a19.f27357f = bs1Var.f5091b;
            m9345x(c3045a19);
            C3045a c3045a20 = this.f27338i;
            bs1 bs1Var27 = this.f27345p;
            c3045a20.f27352a = bs1Var27.f5090a;
            c3045a20.f27353b = bs1Var27.f5091b;
            c3045a20.f27356e = bs1Var.f5090a;
            c3045a20.f27357f = bs1Var.f5091b;
            m9345x(c3045a20);
            C3045a c3045a21 = this.f27337h;
            c3045a21.f27352a = f7;
            c3045a21.f27353b = f8;
            c3045a21.f27356e = bs1Var2.f5090a;
            c3045a21.f27357f = bs1Var.f5091b;
            m9345x(c3045a21);
            C3045a c3045a22 = this.f27338i;
            bs1 bs1Var28 = this.f27346q;
            c3045a22.f27352a = bs1Var28.f5090a;
            c3045a22.f27353b = bs1Var28.f5091b;
            c3045a22.f27356e = bs1Var2.f5090a;
            c3045a22.f27357f = bs1Var.f5091b;
            m9345x(c3045a22);
            C3045a c3045a23 = this.f27337h;
            c3045a23.f27352a = f7;
            c3045a23.f27353b = f8;
            c3045a23.f27356e = bs1Var.f5090a;
            c3045a23.f27357f = bs1Var.f5091b;
            m9345x(c3045a23);
            C3045a c3045a24 = this.f27337h;
            c3045a24.f27352a = f5;
            c3045a24.f27353b = f6;
            c3045a24.f27356e = bs1Var2.f5090a;
            c3045a24.f27357f = bs1Var.f5091b;
            m9345x(c3045a24);
            C3045a c3045a25 = this.f27338i;
            bs1 bs1Var29 = this.f27346q;
            c3045a25.f27352a = bs1Var29.f5090a;
            c3045a25.f27353b = bs1Var29.f5091b;
            c3045a25.f27356e = bs1Var.f5090a;
            c3045a25.f27357f = bs1Var.f5091b;
            m9345x(c3045a25);
            C3045a c3045a26 = this.f27338i;
            bs1 bs1Var30 = this.f27346q;
            c3045a26.f27352a = bs1Var30.f5090a;
            c3045a26.f27353b = bs1Var30.f5091b;
            c3045a26.f27356e = bs1Var.f5090a;
            c3045a26.f27357f = bs1Var.f5091b;
            m9345x(c3045a26);
            C3045a c3045a27 = this.f27337h;
            c3045a27.f27352a = f5;
            c3045a27.f27353b = f6;
            c3045a27.f27356e = bs1Var2.f5090a;
            c3045a27.f27357f = bs1Var.f5091b;
            m9345x(c3045a27);
            C3045a c3045a28 = this.f27338i;
            bs1 bs1Var31 = this.f27347r;
            c3045a28.f27352a = bs1Var31.f5090a;
            c3045a28.f27353b = bs1Var31.f5091b;
            c3045a28.f27356e = bs1Var2.f5090a;
            c3045a28.f27357f = bs1Var.f5091b;
            m9345x(c3045a28);
            C3045a c3045a29 = this.f27337h;
            c3045a29.f27352a = f5;
            c3045a29.f27353b = f6;
            c3045a29.f27356e = bs1Var.f5090a;
            c3045a29.f27357f = bs1Var.f5091b;
            m9345x(c3045a29);
            C3045a c3045a30 = this.f27337h;
            c3045a30.f27352a = f;
            c3045a30.f27353b = f2;
            c3045a30.f27356e = bs1Var2.f5090a;
            c3045a30.f27357f = bs1Var.f5091b;
            m9345x(c3045a30);
            C3045a c3045a31 = this.f27338i;
            bs1 bs1Var32 = this.f27347r;
            c3045a31.f27352a = bs1Var32.f5090a;
            c3045a31.f27353b = bs1Var32.f5091b;
            c3045a31.f27356e = bs1Var.f5090a;
            c3045a31.f27357f = bs1Var.f5091b;
            m9345x(c3045a31);
            C3045a c3045a32 = this.f27338i;
            bs1 bs1Var33 = this.f27347r;
            c3045a32.f27352a = bs1Var33.f5090a;
            c3045a32.f27353b = bs1Var33.f5091b;
            c3045a32.f27356e = bs1Var.f5090a;
            c3045a32.f27357f = bs1Var.f5091b;
            m9345x(c3045a32);
            C3045a c3045a33 = this.f27337h;
            c3045a33.f27352a = f;
            c3045a33.f27353b = f2;
            c3045a33.f27356e = bs1Var2.f5090a;
            c3045a33.f27357f = bs1Var.f5091b;
            m9345x(c3045a33);
            C3045a c3045a34 = this.f27338i;
            bs1 bs1Var34 = this.f27344o;
            c3045a34.f27352a = bs1Var34.f5090a;
            c3045a34.f27353b = bs1Var34.f5091b;
            c3045a34.f27356e = bs1Var2.f5090a;
            c3045a34.f27357f = bs1Var.f5091b;
            m9345x(c3045a34);
            this.f27331b += 10;
        }
    }

    @Override // com.daaw.sc0
    /* renamed from: c */
    public void mo7293c(de0 de0Var, u40<Integer, float[], int[], float[], Boolean> u40Var, int i, float f, bs1 bs1Var, bs1 bs1Var2, qc0 qc0Var, int i2, qr1 qr1Var) {
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
        bs1Var.f5090a = qc0Var.mo2797e(bs1Var.f5090a);
        bs1Var.f5091b = qc0Var.mo2800b(bs1Var.f5091b);
        bs1Var2.f5090a = qc0Var.mo2797e(bs1Var2.f5090a);
        bs1Var2.f5091b = qc0Var.mo2800b(bs1Var2.f5091b);
        C3045a c3045a = this.f27336g;
        c3045a.f27355d = 1.0f;
        c3045a.f27358g = qc0Var.mo2796f();
        this.f27336g.f27354c = f;
        C3045a c3045a2 = this.f27337h;
        c3045a2.f27355d = 1.0f;
        c3045a2.f27358g = qc0Var.mo2796f();
        this.f27337h.f27354c = f;
        C3045a c3045a3 = this.f27338i;
        c3045a3.f27355d = 1.0f;
        c3045a3.f27358g = qc0Var.mo2796f();
        C3045a c3045a4 = this.f27338i;
        c3045a4.f27354c = f;
        c3045a4.f27355d = 1.0f;
        c3045a4.f27358g = qc0Var.mo2796f();
        this.f27338i.f27354c = f;
        int i7 = this.f27343n;
        int i8 = i7 - (i7 % 6);
        int i9 = 0;
        while (i9 < i6) {
            if ((i9 * 6) % i8 == 0) {
                i3 = i9;
                i5 = 0;
                i4 = i8;
                if (!m9360i(y31Var2, qc0Var, Math.min((i6 - i9) * 6, i8), i2, qr1Var)) {
                    return;
                }
            } else {
                i3 = i9;
                i4 = i8;
                i5 = 0;
            }
            if (u40Var.mo2576c(Integer.valueOf(i3), fArr2, iArr, fArr3).booleanValue()) {
                C3045a c3045a5 = this.f27337h;
                c3045a5.f27356e = bs1Var.f5090a;
                c3045a5.f27357f = bs1Var2.f5091b;
                m9365A(c3045a5, fArr2, iArr, 2);
                C3045a c3045a6 = this.f27337h;
                c3045a6.f27356e = bs1Var.f5090a;
                c3045a6.f27357f = bs1Var.f5091b;
                m9365A(c3045a6, fArr2, iArr, i5);
                C3045a c3045a7 = this.f27337h;
                c3045a7.f27356e = bs1Var2.f5090a;
                c3045a7.f27357f = bs1Var2.f5091b;
                m9365A(c3045a7, fArr2, iArr, 3);
                C3045a c3045a8 = this.f27337h;
                c3045a8.f27356e = bs1Var2.f5090a;
                c3045a8.f27357f = bs1Var2.f5091b;
                m9365A(c3045a8, fArr2, iArr, 3);
                C3045a c3045a9 = this.f27337h;
                c3045a9.f27356e = bs1Var.f5090a;
                c3045a9.f27357f = bs1Var.f5091b;
                m9365A(c3045a9, fArr2, iArr, i5);
                C3045a c3045a10 = this.f27337h;
                c3045a10.f27356e = bs1Var2.f5090a;
                c3045a10.f27357f = bs1Var.f5091b;
                m9365A(c3045a10, fArr2, iArr, 1);
                C3045a c3045a11 = this.f27336g;
                c3045a11.f27359h = iArr[i5];
                this.f27337h.f27359h = iArr[1];
                this.f27338i.f27359h = iArr[3];
                this.f27339j.f27359h = iArr[2];
                float f2 = fArr2[0];
                float f3 = fArr2[1];
                float f4 = fArr2[2];
                float f5 = fArr2[3];
                float f6 = fArr2[6];
                float f7 = fArr2[7];
                float f8 = fArr2[4];
                float f9 = fArr2[5];
                y31Var = y31Var2;
                bs1 bs1Var3 = this.f27344o;
                fArr = fArr2;
                bs1Var3.f5090a = f2 - fArr3[0];
                bs1Var3.f5091b = f3 - fArr3[1];
                bs1 bs1Var4 = this.f27345p;
                bs1Var4.f5090a = f4 - fArr3[2];
                bs1Var4.f5091b = f5 - fArr3[3];
                bs1 bs1Var5 = this.f27346q;
                bs1Var5.f5090a = f6 - fArr3[4];
                bs1Var5.f5091b = f7 - fArr3[5];
                bs1 bs1Var6 = this.f27347r;
                bs1Var6.f5090a = f8 - fArr3[6];
                bs1Var6.f5091b = f9 - fArr3[7];
                c3045a11.f27352a = f2;
                c3045a11.f27353b = f3;
                c3045a11.f27356e = bs1Var.f5090a;
                c3045a11.f27357f = bs1Var.f5091b;
                m9345x(c3045a11);
                C3045a c3045a12 = this.f27337h;
                c3045a12.f27352a = f4;
                c3045a12.f27353b = f5;
                c3045a12.f27356e = bs1Var2.f5090a;
                c3045a12.f27357f = bs1Var.f5091b;
                m9345x(c3045a12);
                C3045a c3045a13 = this.f27336g;
                bs1 bs1Var7 = this.f27344o;
                c3045a13.f27352a = bs1Var7.f5090a;
                c3045a13.f27353b = bs1Var7.f5091b;
                c3045a13.f27356e = bs1Var.f5090a;
                c3045a13.f27357f = bs1Var.f5091b;
                m9343z(c3045a13, 0);
                C3045a c3045a14 = this.f27336g;
                bs1 bs1Var8 = this.f27344o;
                c3045a14.f27352a = bs1Var8.f5090a;
                c3045a14.f27353b = bs1Var8.f5091b;
                c3045a14.f27356e = bs1Var.f5090a;
                c3045a14.f27357f = bs1Var.f5091b;
                m9343z(c3045a14, 0);
                C3045a c3045a15 = this.f27337h;
                c3045a15.f27352a = f4;
                c3045a15.f27353b = f5;
                c3045a15.f27356e = bs1Var2.f5090a;
                c3045a15.f27357f = bs1Var.f5091b;
                m9345x(c3045a15);
                C3045a c3045a16 = this.f27337h;
                bs1 bs1Var9 = this.f27345p;
                c3045a16.f27352a = bs1Var9.f5090a;
                c3045a16.f27353b = bs1Var9.f5091b;
                c3045a16.f27356e = bs1Var2.f5090a;
                c3045a16.f27357f = bs1Var.f5091b;
                m9343z(c3045a16, 0);
                C3045a c3045a17 = this.f27338i;
                c3045a17.f27352a = f6;
                c3045a17.f27353b = f7;
                c3045a17.f27356e = bs1Var.f5090a;
                c3045a17.f27357f = bs1Var.f5091b;
                m9345x(c3045a17);
                C3045a c3045a18 = this.f27339j;
                c3045a18.f27352a = f8;
                c3045a18.f27353b = f9;
                c3045a18.f27356e = bs1Var2.f5090a;
                c3045a18.f27357f = bs1Var.f5091b;
                m9345x(c3045a18);
                C3045a c3045a19 = this.f27338i;
                bs1 bs1Var10 = this.f27346q;
                c3045a19.f27352a = bs1Var10.f5090a;
                c3045a19.f27353b = bs1Var10.f5091b;
                c3045a19.f27356e = bs1Var.f5090a;
                c3045a19.f27357f = bs1Var.f5091b;
                m9343z(c3045a19, 0);
                C3045a c3045a20 = this.f27338i;
                bs1 bs1Var11 = this.f27346q;
                c3045a20.f27352a = bs1Var11.f5090a;
                c3045a20.f27353b = bs1Var11.f5091b;
                c3045a20.f27356e = bs1Var.f5090a;
                c3045a20.f27357f = bs1Var.f5091b;
                m9343z(c3045a20, 0);
                C3045a c3045a21 = this.f27339j;
                c3045a21.f27352a = f8;
                c3045a21.f27353b = f9;
                c3045a21.f27356e = bs1Var2.f5090a;
                c3045a21.f27357f = bs1Var.f5091b;
                m9345x(c3045a21);
                C3045a c3045a22 = this.f27339j;
                bs1 bs1Var12 = this.f27347r;
                c3045a22.f27352a = bs1Var12.f5090a;
                c3045a22.f27353b = bs1Var12.f5091b;
                c3045a22.f27356e = bs1Var2.f5090a;
                c3045a22.f27357f = bs1Var.f5091b;
                m9343z(c3045a22, 0);
                this.f27331b += 6;
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
    /* renamed from: e */
    public void mo7291e(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, qc0 qc0Var, int i2) {
        m9358k(de0Var, f, f2, f3, f4, f5, f6, f7, f8, f9, i, bs1Var, bs1Var2, new w31(i2, qc0Var, (qr1) null, (InterfaceC1348g0<y31, sr1, w31>) null), false);
    }

    /* renamed from: g */
    public qr1 m9362g(sr1 sr1Var) {
        return new qr1(this.f27332c, sr1Var, this.f27330a);
    }

    /* renamed from: h */
    public boolean m9361h(y31 y31Var, int i, w31 w31Var, boolean z) {
        if (m9346w() - ((this.f27332c.m15816i() * 3) * i) < 0 || !this.f27335f.m6556b(w31Var)) {
            z = true;
        }
        if (z) {
            m9352q(y31Var, this.f27335f);
        }
        this.f27335f.m6557a(w31Var);
        if (m9346w() - ((this.f27332c.m15816i() * 3) * i) < 0) {
            lz1.m16363c("buffer too small");
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean m9360i(y31 y31Var, qc0 qc0Var, int i, int i2, qr1 qr1Var) {
        return m9361h(y31Var, i, new w31(i2, qc0Var, qr1Var, (InterfaceC1348g0<y31, sr1, w31>) null), false);
    }

    /* renamed from: j */
    public void m9359j(y31 y31Var, t40<Integer, float[], int[], Boolean> t40Var, t40<Integer, float[], int[], Boolean> t40Var2, t40<Integer, float[], int[], Boolean> t40Var3, t40<Integer, float[], int[], Boolean> t40Var4, int i, float f, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
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
        bs1Var.f5090a = w31Var.m6549i(bs1Var.f5090a);
        bs1Var.f5091b = w31Var.m6548j(bs1Var.f5091b);
        bs1Var2.f5090a = w31Var.m6549i(bs1Var2.f5090a);
        bs1Var2.f5091b = w31Var.m6548j(bs1Var2.f5091b);
        C3045a c3045a = this.f27337h;
        c3045a.f27355d = 1.0f;
        c3045a.f27358g = w31Var.m6547k();
        this.f27337h.f27354c = f;
        fArr2[8] = f;
        int i7 = this.f27343n;
        int i8 = i7 - (i7 % i6);
        boolean z = false;
        int i9 = 0;
        while (i9 < i4) {
            if ((i9 * i6) % i8 == 0 && !m9361h(y31Var, Math.min((i4 - i9) * i6, i8), w31Var, z)) {
                return;
            }
            if (t40Var.mo2575j(Integer.valueOf(i9), fArr2, iArr2).booleanValue()) {
                i2 = i8;
                i3 = i9;
                int[] iArr3 = iArr2;
                float[] fArr3 = fArr2;
                m9364B(this.f27337h, fArr2, bs1Var.f5090a, bs1Var2.f5091b, iArr2, 2);
                m9364B(this.f27337h, fArr3, bs1Var.f5090a, bs1Var.f5091b, iArr2, 0);
                m9364B(this.f27337h, fArr3, bs1Var2.f5090a, bs1Var2.f5091b, iArr2, 3);
                m9364B(this.f27337h, fArr3, bs1Var2.f5090a, bs1Var2.f5091b, iArr2, 3);
                m9364B(this.f27337h, fArr3, bs1Var.f5090a, bs1Var.f5091b, iArr2, 0);
                m9364B(this.f27337h, fArr3, bs1Var2.f5090a, bs1Var.f5091b, iArr2, 1);
                if (t40Var2 != null) {
                    t40Var2.mo2575j(Integer.valueOf(i3), fArr3, iArr3);
                    m9364B(this.f27337h, fArr3, bs1Var.f5090a, bs1Var2.f5091b, iArr3, 2);
                    m9364B(this.f27337h, fArr3, bs1Var.f5090a, bs1Var.f5091b, iArr3, 0);
                    m9364B(this.f27337h, fArr3, bs1Var2.f5090a, bs1Var2.f5091b, iArr3, 3);
                    m9364B(this.f27337h, fArr3, bs1Var2.f5090a, bs1Var2.f5091b, iArr3, 3);
                    m9364B(this.f27337h, fArr3, bs1Var.f5090a, bs1Var.f5091b, iArr3, 0);
                    m9364B(this.f27337h, fArr3, bs1Var2.f5090a, bs1Var.f5091b, iArr3, 1);
                }
                if (t40Var3 != null) {
                    t40Var3.mo2575j(Integer.valueOf(i3), fArr3, iArr3);
                    m9364B(this.f27337h, fArr3, bs1Var.f5090a, bs1Var2.f5091b, iArr3, 2);
                    m9364B(this.f27337h, fArr3, bs1Var.f5090a, bs1Var.f5091b, iArr3, 0);
                    m9364B(this.f27337h, fArr3, bs1Var2.f5090a, bs1Var2.f5091b, iArr3, 3);
                    m9364B(this.f27337h, fArr3, bs1Var2.f5090a, bs1Var2.f5091b, iArr3, 3);
                    m9364B(this.f27337h, fArr3, bs1Var.f5090a, bs1Var.f5091b, iArr3, 0);
                    m9364B(this.f27337h, fArr3, bs1Var2.f5090a, bs1Var.f5091b, iArr3, 1);
                }
                if (t40Var4 != null) {
                    t40Var4.mo2575j(Integer.valueOf(i3), fArr3, iArr3);
                    iArr = iArr3;
                    fArr = fArr3;
                    m9364B(this.f27337h, fArr3, bs1Var.f5090a, bs1Var2.f5091b, iArr3, 2);
                    m9364B(this.f27337h, fArr, bs1Var.f5090a, bs1Var.f5091b, iArr3, 0);
                    m9364B(this.f27337h, fArr, bs1Var2.f5090a, bs1Var2.f5091b, iArr3, 3);
                    m9364B(this.f27337h, fArr, bs1Var2.f5090a, bs1Var2.f5091b, iArr3, 3);
                    m9364B(this.f27337h, fArr, bs1Var.f5090a, bs1Var.f5091b, iArr3, 0);
                    m9364B(this.f27337h, fArr, bs1Var2.f5090a, bs1Var.f5091b, iArr3, 1);
                } else {
                    fArr = fArr3;
                    iArr = iArr3;
                }
                this.f27331b += i6;
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

    /* renamed from: k */
    public void m9358k(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var, boolean z) {
        y31 y31Var = (y31) de0Var;
        if (m9361h(y31Var, 2, w31Var, z)) {
            bs1Var.f5090a = w31Var.m6549i(bs1Var.f5090a);
            bs1Var.f5091b = w31Var.m6548j(bs1Var.f5091b);
            bs1Var2.f5090a = w31Var.m6549i(bs1Var2.f5090a);
            bs1Var2.f5091b = w31Var.m6548j(bs1Var2.f5091b);
            C3045a c3045a = this.f27337h;
            c3045a.f27355d = 1.0f;
            c3045a.f27358g = w31Var.m6547k();
            C3045a c3045a2 = this.f27337h;
            c3045a2.f27359h = i;
            c3045a2.f27354c = f9;
            c3045a2.f27352a = f5;
            c3045a2.f27353b = f6;
            c3045a2.f27356e = bs1Var.f5090a;
            c3045a2.f27357f = bs1Var2.f5091b;
            m9345x(c3045a2);
            C3045a c3045a3 = this.f27337h;
            c3045a3.f27352a = f;
            c3045a3.f27353b = f2;
            c3045a3.f27356e = bs1Var.f5090a;
            c3045a3.f27357f = bs1Var.f5091b;
            m9345x(c3045a3);
            C3045a c3045a4 = this.f27337h;
            c3045a4.f27352a = f7;
            c3045a4.f27353b = f8;
            c3045a4.f27356e = bs1Var2.f5090a;
            c3045a4.f27357f = bs1Var2.f5091b;
            m9345x(c3045a4);
            C3045a c3045a5 = this.f27337h;
            c3045a5.f27352a = f7;
            c3045a5.f27353b = f8;
            c3045a5.f27356e = bs1Var2.f5090a;
            c3045a5.f27357f = bs1Var2.f5091b;
            m9345x(c3045a5);
            C3045a c3045a6 = this.f27337h;
            c3045a6.f27352a = f;
            c3045a6.f27353b = f2;
            c3045a6.f27356e = bs1Var.f5090a;
            c3045a6.f27357f = bs1Var.f5091b;
            m9345x(c3045a6);
            C3045a c3045a7 = this.f27337h;
            c3045a7.f27352a = f3;
            c3045a7.f27353b = f4;
            c3045a7.f27356e = bs1Var2.f5090a;
            c3045a7.f27357f = bs1Var.f5091b;
            m9345x(c3045a7);
            this.f27331b += 2;
            if (z) {
                m9361h(y31Var, 0, w31Var, z);
            }
        }
    }

    /* renamed from: l */
    public void m9357l(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var) {
        m9358k(de0Var, f, f2, f3, f4, f7, f8, f5, f6, f9, i, bs1Var, bs1Var2, w31Var, false);
    }

    /* renamed from: m */
    public void m9356m(de0 de0Var, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var, boolean z) {
        m9358k(de0Var, f, f2, f3, f4, f7, f8, f5, f6, f9, i, bs1Var, bs1Var2, w31Var, z);
    }

    /* renamed from: n */
    public void m9355n(y31 y31Var, float f, float f2, float f3, float f4, float f5, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var, boolean z) {
        if (m9361h(y31Var, 2, w31Var, z)) {
            bs1Var.f5090a = w31Var.m6549i(bs1Var.f5090a);
            bs1Var.f5091b = w31Var.m6548j(bs1Var.f5091b);
            bs1Var2.f5090a = w31Var.m6549i(bs1Var2.f5090a);
            bs1Var2.f5091b = w31Var.m6548j(bs1Var2.f5091b);
            C3045a c3045a = this.f27337h;
            c3045a.f27355d = 1.0f;
            c3045a.f27358g = w31Var.m6547k();
            C3045a c3045a2 = this.f27337h;
            c3045a2.f27359h = i;
            c3045a2.f27354c = f3;
            c3045a2.f27352a = f;
            float f6 = f5 + f2;
            c3045a2.f27353b = f6;
            c3045a2.f27356e = bs1Var.f5090a;
            c3045a2.f27357f = bs1Var2.f5091b;
            m9345x(c3045a2);
            C3045a c3045a3 = this.f27337h;
            c3045a3.f27352a = f;
            c3045a3.f27353b = f2;
            c3045a3.f27356e = bs1Var.f5090a;
            c3045a3.f27357f = bs1Var.f5091b;
            m9345x(c3045a3);
            C3045a c3045a4 = this.f27337h;
            float f7 = f4 + f;
            c3045a4.f27352a = f7;
            c3045a4.f27353b = f6;
            c3045a4.f27356e = bs1Var2.f5090a;
            c3045a4.f27357f = bs1Var2.f5091b;
            m9345x(c3045a4);
            C3045a c3045a5 = this.f27337h;
            c3045a5.f27352a = f7;
            c3045a5.f27353b = f6;
            c3045a5.f27356e = bs1Var2.f5090a;
            c3045a5.f27357f = bs1Var2.f5091b;
            m9345x(c3045a5);
            C3045a c3045a6 = this.f27337h;
            c3045a6.f27352a = f;
            c3045a6.f27353b = f2;
            c3045a6.f27356e = bs1Var.f5090a;
            c3045a6.f27357f = bs1Var.f5091b;
            m9345x(c3045a6);
            C3045a c3045a7 = this.f27337h;
            c3045a7.f27352a = f7;
            c3045a7.f27353b = f2;
            c3045a7.f27356e = bs1Var2.f5090a;
            c3045a7.f27357f = bs1Var.f5091b;
            m9345x(c3045a7);
            this.f27331b += 2;
            if (z) {
                m9361h(y31Var, 2, w31Var, z);
            }
        }
    }

    /* renamed from: o */
    public void m9354o(de0 de0Var, float f, float f2, float f3, float f4, float f5, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var, boolean z) {
        float f6 = f2 + f5;
        float f7 = f + f4;
        m9356m(de0Var, f, f6, f7, f6, f7, f2, f, f2, f3, i, bs1Var, bs1Var2, w31Var, z);
    }

    /* renamed from: p */
    public void m9353p(y31 y31Var) {
        w31 w31Var = new w31();
        if (m9352q(y31Var, this.f27335f)) {
            this.f27335f.m6557a(w31Var);
        }
    }

    /* renamed from: q */
    public final boolean m9352q(y31 y31Var, w31 w31Var) {
        if (this.f27334e) {
            return false;
        }
        this.f27334e = true;
        if (this.f27331b > 0) {
            y31Var.m4206k();
            this.f27332c.m15817h();
            m9349t(y31Var, w31Var);
            this.f27331b = 0;
        }
        this.f27332c.m15819f();
        this.f27334e = false;
        return true;
    }

    /* renamed from: r */
    public void m9351r(y31 y31Var) {
        m9353p(y31Var);
    }

    /* renamed from: s */
    public void m9350s(y31 y31Var) {
        this.f27331b = 0;
        this.f27332c.m15819f();
        this.f27335f.m6550h();
    }

    /* renamed from: t */
    public final void m9349t(y31 y31Var, w31 w31Var) {
        qr1 qr1Var = w31Var.f30859c;
        if (qr1Var == null) {
            qr1Var = y31Var.f33263u.m4168r();
        }
        y31Var.mo2886e(w31Var.f30857a);
        int m6554d = w31Var.m6554d();
        while (true) {
            m6554d--;
            if (m6554d < 0) {
                y31Var.m4210T(w31Var.m6551g());
                qr1Var.m12274a(y31Var, w31Var.f30860d, w31Var);
                qr1Var.m12273b(4, 0, this.f27331b * 3);
                qr1Var.m12271d(y31Var);
                return;
            }
            GLES20.glActiveTexture(33984 + m6554d);
            le0 m6555c = w31Var.m6555c(m6554d);
            if (m6555c == null || !m6555c.mo7095b().m7086k()) {
                GLES20.glBindTexture(3553, 0);
            } else {
                m6555c.mo7095b().m7094c();
            }
        }
    }

    /* renamed from: u */
    public void m9348u(y31 y31Var, RectF rectF, int i, bs1 bs1Var, bs1 bs1Var2, w31 w31Var, ge0 ge0Var) {
        int mo8391i = ge0Var.mo8391i(rectF);
        int i2 = mo8391i - 1;
        ge0Var.mo8392e(false, i2, mo8391i, rectF, 0.0f, this.f27341l, this.f27342m);
        PointF pointF = this.f27341l;
        float f = pointF.x;
        float f2 = pointF.y;
        bs1Var.f5090a = w31Var.m6549i(bs1Var.f5090a);
        bs1Var.f5091b = w31Var.m6548j(bs1Var.f5091b);
        bs1Var2.f5090a = w31Var.m6549i(bs1Var2.f5090a);
        float m6548j = w31Var.m6548j(bs1Var2.f5091b);
        bs1Var2.f5091b = m6548j;
        float f3 = bs1Var.f5090a;
        float f4 = bs1Var2.f5090a;
        float f5 = (f3 + f4) * 0.5f;
        float f6 = 0.5f * (bs1Var.f5091b + m6548j);
        float width = (f4 - f3) * (1.0f / rectF.width());
        float height = (bs1Var2.f5091b - bs1Var.f5091b) * (1.0f / rectF.height());
        C3045a c3045a = this.f27337h;
        c3045a.f27355d = 1.0f;
        c3045a.f27358g = w31Var.m6547k();
        C3045a c3045a2 = this.f27337h;
        c3045a2.f27359h = i;
        c3045a2.f27354c = 0.0f;
        boolean z = false;
        float f7 = f2;
        float f8 = f;
        int i3 = 0;
        while (i3 < mo8391i) {
            int i4 = this.f27343n;
            if (i3 % i4 == 0 && !m9361h(y31Var, Math.min(mo8391i - i3, i4), w31Var, z)) {
                return;
            }
            float f9 = f8;
            float f10 = f7;
            float f11 = f6;
            float f12 = f5;
            ge0Var.mo8392e(false, i3, mo8391i, rectF, 0.0f, this.f27341l, this.f27342m);
            C3045a c3045a3 = this.f27337h;
            c3045a3.f27352a = f9;
            c3045a3.f27353b = f10;
            c3045a3.f27356e = f12 + ((f9 - rectF.centerX()) * width);
            this.f27337h.f27357f = f12 + ((f10 - rectF.centerY()) * height);
            m9345x(this.f27337h);
            this.f27337h.f27352a = rectF.centerX();
            this.f27337h.f27353b = rectF.centerY();
            C3045a c3045a4 = this.f27337h;
            c3045a4.f27356e = f12;
            c3045a4.f27357f = f11;
            m9345x(c3045a4);
            C3045a c3045a5 = this.f27337h;
            PointF pointF2 = this.f27341l;
            float f13 = pointF2.x;
            c3045a5.f27352a = f13;
            c3045a5.f27353b = pointF2.y;
            c3045a5.f27356e = f12 + ((f13 - rectF.centerX()) * width);
            this.f27337h.f27357f = f12 + ((this.f27341l.y - rectF.centerY()) * height);
            m9345x(this.f27337h);
            this.f27331b++;
            PointF pointF3 = this.f27341l;
            f8 = pointF3.x;
            i3++;
            f6 = f11;
            f5 = f12;
            f7 = pointF3.y;
            z = false;
        }
        float f14 = f5;
        if (y31Var.m4222H()) {
            int m22854t = f80.m22854t(i, 0);
            ge0Var.mo8392e(false, i2, mo8391i, rectF, 0.0f, this.f27341l, this.f27342m);
            PointF pointF4 = this.f27341l;
            float f15 = pointF4.x;
            float f16 = pointF4.y;
            PointF pointF5 = this.f27342m;
            float f17 = (pointF5.x * (-1.5f)) + f15;
            int i5 = this.f27343n;
            int i6 = i5 - (i5 % 2);
            float f18 = f16;
            float f19 = f15;
            int i7 = 0;
            float f20 = (pointF5.y * (-1.5f)) + f16;
            float f21 = f17;
            while (i7 < mo8391i) {
                if ((i7 * 2) % i6 == 0 && !m9361h(y31Var, Math.min((mo8391i - i7) * 2, i6), w31Var, false)) {
                    return;
                }
                float f22 = f21;
                float f23 = f20;
                float f24 = f19;
                float f25 = f18;
                int i8 = i7;
                ge0Var.mo8392e(false, i7, mo8391i, rectF, 0.0f, this.f27341l, this.f27342m);
                PointF pointF6 = this.f27341l;
                float f26 = pointF6.x;
                PointF pointF7 = this.f27342m;
                f21 = (pointF7.x * (-1.5f)) + f26;
                float f27 = pointF6.y + (pointF7.y * (-1.5f));
                C3045a c3045a6 = this.f27337h;
                c3045a6.f27352a = f24;
                c3045a6.f27353b = f25;
                c3045a6.f27356e = f14 + ((f24 - rectF.centerX()) * width);
                this.f27337h.f27357f = f14 + ((f25 - rectF.centerY()) * height);
                C3045a c3045a7 = this.f27337h;
                c3045a7.f27359h = i;
                m9345x(c3045a7);
                C3045a c3045a8 = this.f27337h;
                PointF pointF8 = this.f27341l;
                float f28 = pointF8.x;
                c3045a8.f27352a = f28;
                c3045a8.f27353b = pointF8.y;
                c3045a8.f27356e = f14 + ((f28 - rectF.centerX()) * width);
                this.f27337h.f27357f = f14 + ((this.f27341l.y - rectF.centerY()) * height);
                C3045a c3045a9 = this.f27337h;
                c3045a9.f27359h = i;
                m9345x(c3045a9);
                C3045a c3045a10 = this.f27337h;
                c3045a10.f27352a = f21;
                c3045a10.f27353b = f27;
                c3045a10.f27356e = f14 + ((f21 - rectF.centerX()) * width);
                this.f27337h.f27357f = f14 + ((f27 - rectF.centerY()) * height);
                C3045a c3045a11 = this.f27337h;
                c3045a11.f27359h = m22854t;
                m9345x(c3045a11);
                m9345x(this.f27337h);
                C3045a c3045a12 = this.f27337h;
                c3045a12.f27352a = f22;
                c3045a12.f27353b = f23;
                c3045a12.f27356e = ((f22 - rectF.centerX()) * width) + f14;
                this.f27337h.f27357f = f14 + ((f23 - rectF.centerY()) * height);
                C3045a c3045a13 = this.f27337h;
                c3045a13.f27359h = m22854t;
                m9345x(c3045a13);
                C3045a c3045a14 = this.f27337h;
                c3045a14.f27352a = f24;
                c3045a14.f27353b = f25;
                c3045a14.f27356e = f14 + ((f24 - rectF.centerX()) * width);
                this.f27337h.f27357f = f14 + ((f25 - rectF.centerY()) * height);
                C3045a c3045a15 = this.f27337h;
                c3045a15.f27359h = i;
                m9345x(c3045a15);
                this.f27331b += 2;
                PointF pointF9 = this.f27341l;
                f19 = pointF9.x;
                i7 = i8 + 1;
                f20 = f27;
                i6 = i6;
                f18 = pointF9.y;
            }
        }
    }

    /* renamed from: v */
    public final int m9347v(int i) {
        return ((i >> 16) & 255) | ((-16711936) & i) | ((i << 16) & 16711680);
    }

    /* renamed from: w */
    public final int m9346w() {
        return this.f27332c.m15812m();
    }

    /* renamed from: x */
    public void m9345x(C3045a c3045a) {
        this.f27332c.m15814k(c3045a.f27352a);
        this.f27332c.m15814k(c3045a.f27353b);
        this.f27332c.m15814k(c3045a.f27354c);
        this.f27332c.m15814k(c3045a.f27356e);
        this.f27332c.m15814k(c3045a.f27357f);
        this.f27332c.m15813l(m9347v(c3045a.f27359h));
    }

    /* renamed from: y */
    public void m9344y(C3045a c3045a, float f, float f2, float f3, int[] iArr, int i) {
        this.f27332c.m15814k(f);
        this.f27332c.m15814k(f2);
        this.f27332c.m15814k(f3);
        this.f27332c.m15814k(c3045a.f27356e);
        this.f27332c.m15814k(c3045a.f27357f);
        this.f27332c.m15813l(m9347v(iArr[i]));
    }

    /* renamed from: z */
    public void m9343z(C3045a c3045a, int i) {
        this.f27332c.m15814k(c3045a.f27352a);
        this.f27332c.m15814k(c3045a.f27353b);
        this.f27332c.m15814k(c3045a.f27354c);
        this.f27332c.m15814k(c3045a.f27356e);
        this.f27332c.m15814k(c3045a.f27357f);
        this.f27332c.m15813l(m9347v(f80.m22854t(c3045a.f27359h, i)));
    }
}
