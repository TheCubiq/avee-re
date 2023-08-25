package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public class pw0 {
    public int a;
    public a[] b = new a[0];
    public int c;

    /* loaded from: classes.dex */
    public class a {
        public double[] b;
        public int c;
        public int d;
        public double e;
        public double f;
        public double g;
        public double i;
        public double j;
        public double[] k;
        public double[] l;
        public final double a = 6.283185307179586d;
        public double h = 0.0d;

        public a(double d, int i) {
            this.d = i;
            this.e = i;
            double d2 = i;
            Double.isNaN(d2);
            int round = (int) Math.round(d * d2);
            this.c = round;
            this.b = new double[round];
            this.k = new double[round];
            this.l = new double[round];
            int i2 = 0;
            while (true) {
                int i3 = this.c;
                if (i2 >= i3) {
                    b();
                    return;
                }
                double d3 = i2;
                double d4 = i3;
                double d5 = this.e;
                Double.isNaN(d4);
                Double.isNaN(d3);
                double d6 = (d3 / (d4 / d5)) * 6.283185307179586d;
                double cos = Math.cos(d6);
                double sin = Math.sin(d6);
                double sqrt = Math.sqrt((cos * cos) + (sin * sin));
                this.k[i2] = cos / sqrt;
                this.l[i2] = sin / sqrt;
                i2++;
            }
        }

        public void a(int i, double d) {
            this.f += this.k[i] * d;
            this.g += this.l[i] * d;
        }

        public void b() {
            if (this.c == 0) {
                this.j = 1.0d;
                this.i = 1.0d;
                return;
            }
            d();
            int i = 0;
            while (true) {
                int i2 = this.c;
                if (i >= i2) {
                    this.i = 1.0d;
                    c(1.0d, i2);
                    double d = this.h;
                    this.j = d;
                    this.i = d;
                    return;
                }
                a(i, this.k[i] * 0.009999999776482582d);
                i++;
            }
        }

        public double c(double d, int i) {
            double d2 = this.f;
            double d3 = i;
            Double.isNaN(d3);
            double d4 = d2 / d3;
            this.f = d4;
            double d5 = this.g;
            Double.isNaN(d3);
            double d6 = d5 / d3;
            this.g = d6;
            double sqrt = Math.sqrt((d4 * d4) + (d6 * d6)) * 800.0d;
            this.h = sqrt;
            return sqrt;
        }

        public void d() {
            this.f = 0.0d;
            this.g = 0.0d;
            Arrays.fill(this.b, 0.0d);
        }
    }

    public void a(float[] fArr, int i) {
        if (this.b.length != fArr.length) {
            this.b = new a[fArr.length];
        }
        this.c = this.b.length;
        int round = Math.round(this.a / 400.0f);
        this.a = i;
        int i2 = 0;
        while (true) {
            a[] aVarArr = this.b;
            if (i2 >= aVarArr.length) {
                return;
            }
            double d = fArr[i2] < 1.0f ? 0.0d : this.a / fArr[i2];
            double d2 = round;
            Double.isNaN(d2);
            aVarArr[i2] = new a(d, Math.max((int) Math.round(d2 / d), 1));
            i2++;
        }
    }

    public void b(double[] dArr, int i, int i2, double[] dArr2, double d, double d2) {
        int length = dArr.length;
        while (i < i2) {
            this.b[i].d();
            a[] aVarArr = this.b;
            if (aVarArr[i].c > 0) {
                for (int i3 = 0; i3 < length; i3++) {
                    double d3 = dArr[i3];
                    a[] aVarArr2 = this.b;
                    aVarArr2[i].a(i3 % aVarArr2[i].c, d3);
                }
                dArr2[i] = this.b[i].c(1.0d, length);
            } else {
                dArr2[i] = aVarArr[i].c(1.0d, 1);
            }
            i++;
        }
    }
}
