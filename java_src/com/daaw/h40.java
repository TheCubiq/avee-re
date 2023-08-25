package com.daaw;

import java.lang.reflect.Array;
/* loaded from: classes.dex */
public class h40 {

    /* renamed from: a */
    public int f12016a = 0;

    /* renamed from: b */
    public int f12017b = 0;

    /* renamed from: c */
    public C1500a[] f12018c = new C1500a[0];

    /* renamed from: d */
    public je0[][] f12019d = (je0[][]) Array.newInstance(je0.class, 0, 0);

    /* renamed from: com.daaw.h40$a */
    /* loaded from: classes.dex */
    public class C1500a {

        /* renamed from: a */
        public float[] f12020a = new float[0];

        public C1500a() {
        }
    }

    /* renamed from: com.daaw.h40$b */
    /* loaded from: classes.dex */
    public static class C1501b implements je0 {

        /* renamed from: a */
        public final h40 f12022a;

        /* renamed from: b */
        public final int f12023b;

        /* renamed from: c */
        public final int f12024c;

        /* renamed from: d */
        public final float f12025d;

        /* renamed from: e */
        public int f12026e;

        /* renamed from: f */
        public int[] f12027f;

        /* renamed from: g */
        public float[] f12028g;

        /* renamed from: h */
        public float f12029h;

        /* renamed from: i */
        public float f12030i;

        /* renamed from: j */
        public int f12031j;

        /* renamed from: k */
        public float f12032k;

        /* renamed from: l */
        public int f12033l;

        /* renamed from: m */
        public int f12034m;

        /* renamed from: n */
        public int f12035n;

        public C1501b(h40 h40Var, int i, int i2, int i3) {
            int i4 = 0;
            this.f12026e = 0;
            this.f12027f = new int[0];
            this.f12028g = new float[0];
            this.f12029h = 1.0f;
            this.f12022a = h40Var;
            this.f12023b = Math.max(0, Math.min(i, h40Var.f12018c.length - 1));
            this.f12024c = i2;
            this.f12026e = i3;
            this.f12025d = i2 + 1.0f;
            if (i3 < 1) {
                this.f12027f = new int[]{0};
                this.f12028g = new float[]{1.0f};
                this.f12029h = 1.0f;
                return;
            }
            int[] iArr = new int[i3 + 1 + i3];
            this.f12027f = iArr;
            this.f12028g = new float[iArr.length];
            this.f12029h = Math.max(1.0f, iArr.length * 0.05f);
            while (true) {
                int[] iArr2 = this.f12027f;
                if (i4 >= iArr2.length) {
                    return;
                }
                int i5 = i4 - i3;
                iArr2[i4] = i5;
                this.f12028g[i4] = Math.max(C0888bv.m25811b(((iArr2.length + 2) / 2) + i5, iArr2.length + 2) - 0.05f, 0.0f);
                i4++;
            }
        }

        /* renamed from: a */
        public boolean m21036a(h40 h40Var, int i, int i2, int i3) {
            return h40Var == this.f12022a && i == this.f12023b && i2 == this.f12024c && i3 == this.f12026e;
        }

        @Override // com.daaw.je0
        public float get(int i) {
            this.f12035n = this.f12022a.f12018c[0].f12020a.length;
            this.f12030i = 0.0f;
            this.f12033l = 0;
            while (true) {
                int i2 = this.f12033l;
                int[] iArr = this.f12027f;
                if (i2 >= iArr.length) {
                    return this.f12030i / this.f12029h;
                }
                h40 h40Var = this.f12022a;
                this.f12031j = ((iArr[i2] + i) + h40Var.f12017b) % this.f12035n;
                C1500a[] c1500aArr = h40Var.f12018c;
                int i3 = this.f12023b;
                this.f12032k = c1500aArr[i3].f12020a[this.f12031j];
                this.f12034m = i3;
                while (this.f12034m < this.f12023b + this.f12024c) {
                    float f = this.f12032k;
                    C1500a[] c1500aArr2 = this.f12022a.f12018c;
                    int i4 = this.f12034m;
                    this.f12032k = f + c1500aArr2[i4].f12020a[this.f12031j];
                    this.f12034m = i4 + 1;
                }
                float f2 = this.f12032k / this.f12025d;
                this.f12032k = f2;
                float f3 = this.f12030i;
                float[] fArr = this.f12028g;
                int i5 = this.f12033l;
                this.f12030i = f3 + (f2 * fArr[i5]);
                this.f12033l = i5 + 1;
            }
        }

        @Override // com.daaw.je0
        public int size() {
            return this.f12022a.f12016a;
        }
    }

    public h40() {
        m21038d(10);
    }

    /* renamed from: b */
    public void m21040b(float[] fArr) {
        m21037e(fArr.length);
        C1500a[] c1500aArr = this.f12018c;
        C1500a c1500a = c1500aArr[c1500aArr.length - 1];
        for (int length = c1500aArr.length - 1; length > 0; length--) {
            C1500a[] c1500aArr2 = this.f12018c;
            c1500aArr2[length] = c1500aArr2[length - 1];
        }
        C1500a[] c1500aArr3 = this.f12018c;
        c1500aArr3[0] = c1500a;
        System.arraycopy(fArr, 0, c1500aArr3[0].f12020a, 0, fArr.length);
    }

    /* renamed from: c */
    public je0 m21039c(int i, int i2, int i3, je0 je0Var) {
        int max = Math.max(0, Math.min(i, this.f12018c.length - 1));
        int min = Math.min(i2, (this.f12018c.length - 1) - max);
        return (je0Var != null && (je0Var instanceof C1501b) && ((C1501b) je0Var).m21036a(this, max, min, i3)) ? je0Var : new C1501b(this, max, min, i3);
    }

    /* renamed from: d */
    public void m21038d(int i) {
        if (this.f12018c.length == i) {
            return;
        }
        this.f12018c = new C1500a[i];
        int i2 = 0;
        while (true) {
            C1500a[] c1500aArr = this.f12018c;
            if (i2 >= c1500aArr.length) {
                int i3 = this.f12016a;
                this.f12016a = 0;
                this.f12017b = 0;
                m21037e(i3);
                this.f12019d = (je0[][]) Array.newInstance(je0.class, this.f12018c.length, this.f12016a);
                return;
            }
            c1500aArr[i2] = new C1500a();
            i2++;
        }
    }

    /* renamed from: e */
    public void m21037e(int i) {
        if (this.f12016a == i) {
            return;
        }
        this.f12016a = i;
        this.f12017b = i * 100;
        int i2 = 0;
        while (true) {
            C1500a[] c1500aArr = this.f12018c;
            if (i2 >= c1500aArr.length) {
                this.f12019d = (je0[][]) Array.newInstance(je0.class, c1500aArr.length, i);
                return;
            } else {
                c1500aArr[i2].f12020a = new float[i];
                i2++;
            }
        }
    }
}
