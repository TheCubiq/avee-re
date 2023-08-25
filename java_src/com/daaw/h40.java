package com.daaw;

import java.lang.reflect.Array;
/* loaded from: classes.dex */
public class h40 {
    public int a = 0;
    public int b = 0;
    public a[] c = new a[0];
    public je0[][] d = (je0[][]) Array.newInstance(je0.class, 0, 0);

    /* loaded from: classes.dex */
    public class a {
        public float[] a = new float[0];

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public static class b implements je0 {
        public final h40 a;
        public final int b;
        public final int c;
        public final float d;
        public int e;
        public int[] f;
        public float[] g;
        public float h;
        public float i;
        public int j;
        public float k;
        public int l;
        public int m;
        public int n;

        public b(h40 h40Var, int i, int i2, int i3) {
            int i4 = 0;
            this.e = 0;
            this.f = new int[0];
            this.g = new float[0];
            this.h = 1.0f;
            this.a = h40Var;
            this.b = Math.max(0, Math.min(i, h40Var.c.length - 1));
            this.c = i2;
            this.e = i3;
            this.d = i2 + 1.0f;
            if (i3 < 1) {
                this.f = new int[]{0};
                this.g = new float[]{1.0f};
                this.h = 1.0f;
                return;
            }
            int[] iArr = new int[i3 + 1 + i3];
            this.f = iArr;
            this.g = new float[iArr.length];
            this.h = Math.max(1.0f, iArr.length * 0.05f);
            while (true) {
                int[] iArr2 = this.f;
                if (i4 >= iArr2.length) {
                    return;
                }
                int i5 = i4 - i3;
                iArr2[i4] = i5;
                this.g[i4] = Math.max(bv.b(((iArr2.length + 2) / 2) + i5, iArr2.length + 2) - 0.05f, 0.0f);
                i4++;
            }
        }

        public boolean a(h40 h40Var, int i, int i2, int i3) {
            return h40Var == this.a && i == this.b && i2 == this.c && i3 == this.e;
        }

        @Override // com.daaw.je0
        public float get(int i) {
            this.n = this.a.c[0].a.length;
            this.i = 0.0f;
            this.l = 0;
            while (true) {
                int i2 = this.l;
                int[] iArr = this.f;
                if (i2 >= iArr.length) {
                    return this.i / this.h;
                }
                h40 h40Var = this.a;
                this.j = ((iArr[i2] + i) + h40Var.b) % this.n;
                a[] aVarArr = h40Var.c;
                int i3 = this.b;
                this.k = aVarArr[i3].a[this.j];
                this.m = i3;
                while (this.m < this.b + this.c) {
                    float f = this.k;
                    a[] aVarArr2 = this.a.c;
                    int i4 = this.m;
                    this.k = f + aVarArr2[i4].a[this.j];
                    this.m = i4 + 1;
                }
                float f2 = this.k / this.d;
                this.k = f2;
                float f3 = this.i;
                float[] fArr = this.g;
                int i5 = this.l;
                this.i = f3 + (f2 * fArr[i5]);
                this.l = i5 + 1;
            }
        }

        @Override // com.daaw.je0
        public int size() {
            return this.a.a;
        }
    }

    public h40() {
        d(10);
    }

    public void b(float[] fArr) {
        e(fArr.length);
        a[] aVarArr = this.c;
        a aVar = aVarArr[aVarArr.length - 1];
        for (int length = aVarArr.length - 1; length > 0; length--) {
            a[] aVarArr2 = this.c;
            aVarArr2[length] = aVarArr2[length - 1];
        }
        a[] aVarArr3 = this.c;
        aVarArr3[0] = aVar;
        System.arraycopy(fArr, 0, aVarArr3[0].a, 0, fArr.length);
    }

    public je0 c(int i, int i2, int i3, je0 je0Var) {
        int max = Math.max(0, Math.min(i, this.c.length - 1));
        int min = Math.min(i2, (this.c.length - 1) - max);
        return (je0Var != null && (je0Var instanceof b) && ((b) je0Var).a(this, max, min, i3)) ? je0Var : new b(this, max, min, i3);
    }

    public void d(int i) {
        if (this.c.length == i) {
            return;
        }
        this.c = new a[i];
        int i2 = 0;
        while (true) {
            a[] aVarArr = this.c;
            if (i2 >= aVarArr.length) {
                int i3 = this.a;
                this.a = 0;
                this.b = 0;
                e(i3);
                this.d = (je0[][]) Array.newInstance(je0.class, this.c.length, this.a);
                return;
            }
            aVarArr[i2] = new a();
            i2++;
        }
    }

    public void e(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        this.b = i * 100;
        int i2 = 0;
        while (true) {
            a[] aVarArr = this.c;
            if (i2 >= aVarArr.length) {
                this.d = (je0[][]) Array.newInstance(je0.class, aVarArr.length, i);
                return;
            } else {
                aVarArr[i2].a = new float[i];
                i2++;
            }
        }
    }
}
