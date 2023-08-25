package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public class pw0 {

    /* renamed from: a */
    public int f23426a;

    /* renamed from: b */
    public C2648a[] f23427b = new C2648a[0];

    /* renamed from: c */
    public int f23428c;

    /* renamed from: com.daaw.pw0$a */
    /* loaded from: classes.dex */
    public class C2648a {

        /* renamed from: b */
        public double[] f23430b;

        /* renamed from: c */
        public int f23431c;

        /* renamed from: d */
        public int f23432d;

        /* renamed from: e */
        public double f23433e;

        /* renamed from: f */
        public double f23434f;

        /* renamed from: g */
        public double f23435g;

        /* renamed from: i */
        public double f23437i;

        /* renamed from: j */
        public double f23438j;

        /* renamed from: k */
        public double[] f23439k;

        /* renamed from: l */
        public double[] f23440l;

        /* renamed from: a */
        public final double f23429a = 6.283185307179586d;

        /* renamed from: h */
        public double f23436h = 0.0d;

        public C2648a(double d, int i) {
            this.f23432d = i;
            this.f23433e = i;
            double d2 = i;
            Double.isNaN(d2);
            int round = (int) Math.round(d * d2);
            this.f23431c = round;
            this.f23430b = new double[round];
            this.f23439k = new double[round];
            this.f23440l = new double[round];
            int i2 = 0;
            while (true) {
                int i3 = this.f23431c;
                if (i2 >= i3) {
                    m12993b();
                    return;
                }
                double d3 = i2;
                double d4 = i3;
                double d5 = this.f23433e;
                Double.isNaN(d4);
                Double.isNaN(d3);
                double d6 = (d3 / (d4 / d5)) * 6.283185307179586d;
                double cos = Math.cos(d6);
                double sin = Math.sin(d6);
                double sqrt = Math.sqrt((cos * cos) + (sin * sin));
                this.f23439k[i2] = cos / sqrt;
                this.f23440l[i2] = sin / sqrt;
                i2++;
            }
        }

        /* renamed from: a */
        public void m12994a(int i, double d) {
            this.f23434f += this.f23439k[i] * d;
            this.f23435g += this.f23440l[i] * d;
        }

        /* renamed from: b */
        public void m12993b() {
            if (this.f23431c == 0) {
                this.f23438j = 1.0d;
                this.f23437i = 1.0d;
                return;
            }
            m12991d();
            int i = 0;
            while (true) {
                int i2 = this.f23431c;
                if (i >= i2) {
                    this.f23437i = 1.0d;
                    m12992c(1.0d, i2);
                    double d = this.f23436h;
                    this.f23438j = d;
                    this.f23437i = d;
                    return;
                }
                m12994a(i, this.f23439k[i] * 0.009999999776482582d);
                i++;
            }
        }

        /* renamed from: c */
        public double m12992c(double d, int i) {
            double d2 = this.f23434f;
            double d3 = i;
            Double.isNaN(d3);
            double d4 = d2 / d3;
            this.f23434f = d4;
            double d5 = this.f23435g;
            Double.isNaN(d3);
            double d6 = d5 / d3;
            this.f23435g = d6;
            double sqrt = Math.sqrt((d4 * d4) + (d6 * d6)) * 800.0d;
            this.f23436h = sqrt;
            return sqrt;
        }

        /* renamed from: d */
        public void m12991d() {
            this.f23434f = 0.0d;
            this.f23435g = 0.0d;
            Arrays.fill(this.f23430b, 0.0d);
        }
    }

    /* renamed from: a */
    public void m12996a(float[] fArr, int i) {
        if (this.f23427b.length != fArr.length) {
            this.f23427b = new C2648a[fArr.length];
        }
        this.f23428c = this.f23427b.length;
        int round = Math.round(this.f23426a / 400.0f);
        this.f23426a = i;
        int i2 = 0;
        while (true) {
            C2648a[] c2648aArr = this.f23427b;
            if (i2 >= c2648aArr.length) {
                return;
            }
            double d = fArr[i2] < 1.0f ? 0.0d : this.f23426a / fArr[i2];
            double d2 = round;
            Double.isNaN(d2);
            c2648aArr[i2] = new C2648a(d, Math.max((int) Math.round(d2 / d), 1));
            i2++;
        }
    }

    /* renamed from: b */
    public void m12995b(double[] dArr, int i, int i2, double[] dArr2, double d, double d2) {
        int length = dArr.length;
        while (i < i2) {
            this.f23427b[i].m12991d();
            C2648a[] c2648aArr = this.f23427b;
            if (c2648aArr[i].f23431c > 0) {
                for (int i3 = 0; i3 < length; i3++) {
                    double d3 = dArr[i3];
                    C2648a[] c2648aArr2 = this.f23427b;
                    c2648aArr2[i].m12994a(i3 % c2648aArr2[i].f23431c, d3);
                }
                dArr2[i] = this.f23427b[i].m12992c(1.0d, length);
            } else {
                dArr2[i] = c2648aArr[i].m12992c(1.0d, 1);
            }
            i++;
        }
    }
}
