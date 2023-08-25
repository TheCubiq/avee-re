package com.daaw;
/* loaded from: classes.dex */
public class ad1 {
    public int[] a;
    public float[] b;
    public float c;
    public float d;
    public int e;
    public int f;

    public ad1(float[] fArr, float f, int i, int i2) {
        int i3 = 0;
        this.a = new int[0];
        this.b = new float[0];
        this.c = 1.0f;
        this.e = i2;
        int length = fArr.length;
        this.f = length;
        this.b = fArr;
        this.c = f;
        this.a = new int[fArr.length];
        int i4 = (length - 1) / 2;
        while (true) {
            int[] iArr = this.a;
            if (i3 >= iArr.length) {
                return;
            }
            iArr[i3] = (i3 % length) - i4;
            i3++;
        }
    }

    public static ad1 b(int i) {
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

    public static ad1 c(int i) {
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

    public static ad1 e(int i, float f) {
        int i2 = 0;
        if (i < 1) {
            return new ad1(new float[]{1.0f}, 1.0f, 1, 0);
        }
        ad1 b = b(i);
        ad1 b2 = b(i);
        b2.d(c(i));
        b2.d = f;
        float f2 = 1.0f - f;
        while (true) {
            float[] fArr = b2.b;
            if (i2 >= fArr.length) {
                b2.a();
                return b2;
            }
            fArr[i2] = (fArr[i2] * f) + (b.b[i2] * f2);
            i2++;
        }
    }

    public void a() {
        float f = 0.0f;
        for (int i = 0; i < this.a.length; i++) {
            f += Math.abs(this.b[i]);
        }
        this.c = f;
    }

    public void d(ad1 ad1Var) {
        int i = (this.f - ad1Var.f) / 2;
        for (int i2 = 0; i2 < this.a.length; i2++) {
            int i3 = i2 - i;
            if (i3 >= 0 && i3 < ad1Var.f) {
                float[] fArr = this.b;
                fArr[i2] = fArr[i2] - (ad1Var.b[i3] * (this.c / ad1Var.c));
            }
        }
    }

    public int f() {
        int[] iArr = this.a;
        if (iArr == null || iArr.length < 2) {
            return 0;
        }
        return this.e;
    }

    public double g(int i, ie0 ie0Var) {
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i2 >= iArr.length) {
                return f / this.c;
            }
            int i3 = iArr[i2] + i;
            if (i3 >= 0 && i3 < ie0Var.size()) {
                double d = f;
                double d2 = ie0Var.get(i3);
                double d3 = this.b[i2];
                Double.isNaN(d3);
                Double.isNaN(d);
                f = (float) (d + (d2 * d3));
            }
            i2++;
        }
    }

    public float h() {
        return this.d;
    }
}
