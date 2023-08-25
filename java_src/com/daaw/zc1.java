package com.daaw;
/* loaded from: classes.dex */
public class zc1 {

    /* renamed from: a */
    public int[] f34936a = new int[0];

    /* renamed from: b */
    public float[] f34937b = new float[0];

    /* renamed from: c */
    public float f34938c = 1.0f;

    /* renamed from: d */
    public float f34939d;

    /* renamed from: e */
    public int f34940e;

    /* renamed from: a */
    public zc1 m2491a(int i, float f) {
        this.f34939d = f;
        this.f34940e = i;
        int i2 = 0;
        if (i < 1) {
            this.f34936a = new int[]{0};
            this.f34937b = new float[]{1.0f};
            this.f34938c = 1.0f;
            return this;
        }
        int[] iArr = new int[i + 1 + i];
        this.f34936a = iArr;
        this.f34937b = new float[iArr.length];
        this.f34938c = 0.0f;
        while (true) {
            int[] iArr2 = this.f34936a;
            if (i2 >= iArr2.length) {
                float length = (iArr2.length - 1) * 1.0f;
                this.f34937b[i] = length;
                this.f34938c += length;
                return this;
            }
            iArr2[i2] = i2 - i;
            this.f34937b[i2] = -f;
            this.f34938c += f;
            i2++;
        }
    }

    /* renamed from: b */
    public int m2490b() {
        int[] iArr = this.f34936a;
        if (iArr == null || iArr.length < 2) {
            return 0;
        }
        return (iArr.length - 1) / 2;
    }

    /* renamed from: c */
    public double m2489c(int i, ie0 ie0Var) {
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f34936a;
            if (i2 >= iArr.length) {
                return f / this.f34938c;
            }
            int i3 = iArr[i2] + i;
            if (i3 >= 0 && i3 < ie0Var.size()) {
                double d = f;
                double d2 = ie0Var.get(i3);
                double d3 = this.f34937b[i2];
                Double.isNaN(d3);
                Double.isNaN(d);
                f = (float) (d + (d2 * d3));
            }
            i2++;
        }
    }

    /* renamed from: d */
    public float m2488d() {
        return this.f34939d;
    }
}
