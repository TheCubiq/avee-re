package com.daaw;
/* loaded from: classes.dex */
public class ad1 {

    /* renamed from: a */
    public int[] f3091a;

    /* renamed from: b */
    public float[] f3092b;

    /* renamed from: c */
    public float f3093c;

    /* renamed from: d */
    public float f3094d;

    /* renamed from: e */
    public int f3095e;

    /* renamed from: f */
    public int f3096f;

    public ad1(float[] fArr, float f, int i, int i2) {
        int i3 = 0;
        this.f3091a = new int[0];
        this.f3092b = new float[0];
        this.f3093c = 1.0f;
        this.f3095e = i2;
        int length = fArr.length;
        this.f3096f = length;
        this.f3092b = fArr;
        this.f3093c = f;
        this.f3091a = new int[fArr.length];
        int i4 = (length - 1) / 2;
        while (true) {
            int[] iArr = this.f3091a;
            if (i3 >= iArr.length) {
                return;
            }
            iArr[i3] = (i3 % length) - i4;
            i3++;
        }
    }

    /* renamed from: b */
    public static ad1 m27525b(int i) {
        double d = i;
        Double.isNaN(d);
        int ceil = (int) Math.ceil(d * 2.57d);
        int i2 = ceil + ceil + 1;
        float[] fArr = new float[i2];
        int i3 = -ceil;
        float f = 0.0f;
        while (i3 < ceil + 1) {
            float f2 = i3 == 0 ? 1.0f : 0.0f;
            fArr[i3 + ceil] = f2;
            f += f2;
            i3++;
        }
        return new ad1(fArr, f, i2, i);
    }

    /* renamed from: c */
    public static ad1 m27524c(int i) {
        double d = i;
        Double.isNaN(d);
        int ceil = (int) Math.ceil(2.57d * d);
        int i2 = ceil + ceil + 1;
        float[] fArr = new float[i2];
        float f = 1.0f;
        if (i2 == 1) {
            fArr[0] = 1.0f;
        } else {
            float f2 = 0.0f;
            for (int i3 = 0 - ceil; i3 < 0 + ceil + 1; i3++) {
                int i4 = i3 + 0;
                Double.isNaN(d);
                Double.isNaN(d);
                float exp = ((float) Math.exp((-(i4 * i4)) / ((i * 2) * i))) / ((float) ((6.283185307179586d * d) * d));
                fArr[i3 + ceil] = exp;
                f2 += exp;
            }
            f = f2;
        }
        return new ad1(fArr, f, i2, i);
    }

    /* renamed from: e */
    public static ad1 m27522e(int i, float f) {
        int i2 = 0;
        if (i < 1) {
            return new ad1(new float[]{1.0f}, 1.0f, 1, 0);
        }
        ad1 m27525b = m27525b(i);
        ad1 m27525b2 = m27525b(i);
        m27525b2.m27523d(m27524c(i));
        m27525b2.f3094d = f;
        float f2 = 1.0f - f;
        while (true) {
            float[] fArr = m27525b2.f3092b;
            if (i2 >= fArr.length) {
                m27525b2.m27526a();
                return m27525b2;
            }
            fArr[i2] = (fArr[i2] * f) + (m27525b.f3092b[i2] * f2);
            i2++;
        }
    }

    /* renamed from: a */
    public void m27526a() {
        float f = 0.0f;
        for (int i = 0; i < this.f3091a.length; i++) {
            f += Math.abs(this.f3092b[i]);
        }
        this.f3093c = f;
    }

    /* renamed from: d */
    public void m27523d(ad1 ad1Var) {
        int i = (this.f3096f - ad1Var.f3096f) / 2;
        for (int i2 = 0; i2 < this.f3091a.length; i2++) {
            int i3 = i2 - i;
            if (i3 >= 0 && i3 < ad1Var.f3096f) {
                float[] fArr = this.f3092b;
                fArr[i2] = fArr[i2] - (ad1Var.f3092b[i3] * (this.f3093c / ad1Var.f3093c));
            }
        }
    }

    /* renamed from: f */
    public int m27521f() {
        int[] iArr = this.f3091a;
        if (iArr == null || iArr.length < 2) {
            return 0;
        }
        return this.f3095e;
    }

    /* renamed from: g */
    public double m27520g(int i, ie0 ie0Var) {
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f3091a;
            if (i2 >= iArr.length) {
                return f / this.f3093c;
            }
            int i3 = iArr[i2] + i;
            if (i3 >= 0 && i3 < ie0Var.size()) {
                double d = f;
                double d2 = ie0Var.get(i3);
                double d3 = this.f3092b[i2];
                Double.isNaN(d3);
                Double.isNaN(d);
                f = (float) (d + (d2 * d3));
            }
            i2++;
        }
    }

    /* renamed from: h */
    public float m27519h() {
        return this.f3094d;
    }
}
