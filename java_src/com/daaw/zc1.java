package com.daaw;
/* loaded from: classes.dex */
public class zc1 {
    public int[] a = new int[0];
    public float[] b = new float[0];
    public float c = 1.0f;
    public float d;
    public int e;

    public zc1 a(int i, float f) {
        this.d = f;
        this.e = i;
        int i2 = 0;
        if (i < 1) {
            this.a = new int[]{0};
            this.b = new float[]{1.0f};
            this.c = 1.0f;
            return this;
        }
        int[] iArr = new int[i + 1 + i];
        this.a = iArr;
        this.b = new float[iArr.length];
        this.c = 0.0f;
        while (true) {
            int[] iArr2 = this.a;
            if (i2 >= iArr2.length) {
                float length = (iArr2.length - 1) * 1.0f;
                this.b[i] = length;
                this.c += length;
                return this;
            }
            iArr2[i2] = i2 - i;
            this.b[i2] = -f;
            this.c += f;
            i2++;
        }
    }

    public int b() {
        int[] iArr = this.a;
        if (iArr == null || iArr.length < 2) {
            return 0;
        }
        return (iArr.length - 1) / 2;
    }

    public double c(int i, ie0 ie0Var) {
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

    public float d() {
        return this.d;
    }
}
