package com.daaw;

import com.daaw.i6;
import java.util.Arrays;
/* loaded from: classes.dex */
public class ee1 implements i6.a {
    public static float n = 0.001f;
    public final int a = -1;
    public int b = 16;
    public int c = 16;
    public int[] d = new int[16];
    public int[] e = new int[16];
    public int[] f = new int[16];
    public float[] g = new float[16];
    public int[] h = new int[16];
    public int[] i = new int[16];
    public int j = 0;
    public int k = -1;
    public final i6 l;
    public final gd m;

    public ee1(i6 i6Var, gd gdVar) {
        this.l = i6Var;
        this.m = gdVar;
        clear();
    }

    @Override // com.daaw.i6.a
    public float a(de1 de1Var, boolean z) {
        int p = p(de1Var);
        if (p == -1) {
            return 0.0f;
        }
        r(de1Var);
        float f = this.g[p];
        if (this.k == p) {
            this.k = this.i[p];
        }
        this.f[p] = -1;
        int[] iArr = this.h;
        if (iArr[p] != -1) {
            int[] iArr2 = this.i;
            iArr2[iArr[p]] = iArr2[p];
        }
        int[] iArr3 = this.i;
        if (iArr3[p] != -1) {
            iArr[iArr3[p]] = iArr[p];
        }
        this.j--;
        de1Var.m--;
        if (z) {
            de1Var.c(this.l);
        }
        return f;
    }

    @Override // com.daaw.i6.a
    public int b() {
        return this.j;
    }

    @Override // com.daaw.i6.a
    public void c(de1 de1Var, float f, boolean z) {
        float f2 = n;
        if (f <= (-f2) || f >= f2) {
            int p = p(de1Var);
            if (p == -1) {
                h(de1Var, f);
                return;
            }
            float[] fArr = this.g;
            fArr[p] = fArr[p] + f;
            float f3 = fArr[p];
            float f4 = n;
            if (f3 <= (-f4) || fArr[p] >= f4) {
                return;
            }
            fArr[p] = 0.0f;
            a(de1Var, z);
        }
    }

    @Override // com.daaw.i6.a
    public void clear() {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            de1 d = d(i2);
            if (d != null) {
                d.c(this.l);
            }
        }
        for (int i3 = 0; i3 < this.b; i3++) {
            this.f[i3] = -1;
            this.e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.c; i4++) {
            this.d[i4] = -1;
        }
        this.j = 0;
        this.k = -1;
    }

    @Override // com.daaw.i6.a
    public de1 d(int i) {
        int i2 = this.j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.m.d[this.f[i3]];
            }
            i3 = this.i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // com.daaw.i6.a
    public float e(de1 de1Var) {
        int p = p(de1Var);
        if (p != -1) {
            return this.g[p];
        }
        return 0.0f;
    }

    @Override // com.daaw.i6.a
    public void f() {
        int i = this.j;
        int i2 = this.k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // com.daaw.i6.a
    public float g(int i) {
        int i2 = this.j;
        int i3 = this.k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.g[i3];
            }
            i3 = this.i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // com.daaw.i6.a
    public void h(de1 de1Var, float f) {
        float f2 = n;
        if (f > (-f2) && f < f2) {
            a(de1Var, true);
            return;
        }
        if (this.j == 0) {
            m(0, de1Var, f);
            l(de1Var, 0);
            this.k = 0;
            return;
        }
        int p = p(de1Var);
        if (p != -1) {
            this.g[p] = f;
            return;
        }
        if (this.j + 1 >= this.b) {
            o();
        }
        int i = this.j;
        int i2 = this.k;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr = this.f;
            int i5 = iArr[i2];
            int i6 = de1Var.c;
            if (i5 == i6) {
                this.g[i2] = f;
                return;
            }
            if (iArr[i2] < i6) {
                i3 = i2;
            }
            i2 = this.i[i2];
            if (i2 == -1) {
                break;
            }
        }
        q(i3, de1Var, f);
    }

    @Override // com.daaw.i6.a
    public boolean i(de1 de1Var) {
        return p(de1Var) != -1;
    }

    @Override // com.daaw.i6.a
    public void j(float f) {
        int i = this.j;
        int i2 = this.k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // com.daaw.i6.a
    public float k(i6 i6Var, boolean z) {
        float e = e(i6Var.a);
        a(i6Var.a, z);
        ee1 ee1Var = (ee1) i6Var.e;
        int b = ee1Var.b();
        int i = 0;
        int i2 = 0;
        while (i < b) {
            int[] iArr = ee1Var.f;
            if (iArr[i2] != -1) {
                c(this.m.d[iArr[i2]], ee1Var.g[i2] * e, z);
                i++;
            }
            i2++;
        }
        return e;
    }

    public final void l(de1 de1Var, int i) {
        int[] iArr;
        int i2 = de1Var.c % this.c;
        int[] iArr2 = this.d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.e;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.e[i] = -1;
    }

    public final void m(int i, de1 de1Var, float f) {
        this.f[i] = de1Var.c;
        this.g[i] = f;
        this.h[i] = -1;
        this.i[i] = -1;
        de1Var.a(this.l);
        de1Var.m++;
        this.j++;
    }

    public final int n() {
        for (int i = 0; i < this.b; i++) {
            if (this.f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    public final void o() {
        int i = this.b * 2;
        this.f = Arrays.copyOf(this.f, i);
        this.g = Arrays.copyOf(this.g, i);
        this.h = Arrays.copyOf(this.h, i);
        this.i = Arrays.copyOf(this.i, i);
        this.e = Arrays.copyOf(this.e, i);
        for (int i2 = this.b; i2 < i; i2++) {
            this.f[i2] = -1;
            this.e[i2] = -1;
        }
        this.b = i;
    }

    public int p(de1 de1Var) {
        int[] iArr;
        if (this.j == 0) {
            return -1;
        }
        int i = de1Var.c;
        int i2 = this.d[i % this.c];
        if (i2 == -1) {
            return -1;
        }
        if (this.f[i2] == i) {
            return i2;
        }
        while (true) {
            iArr = this.e;
            if (iArr[i2] == -1 || this.f[iArr[i2]] == i) {
                break;
            }
            i2 = iArr[i2];
        }
        if (iArr[i2] != -1 && this.f[iArr[i2]] == i) {
            return iArr[i2];
        }
        return -1;
    }

    public final void q(int i, de1 de1Var, float f) {
        int n2 = n();
        m(n2, de1Var, f);
        if (i != -1) {
            this.h[n2] = i;
            int[] iArr = this.i;
            iArr[n2] = iArr[i];
            iArr[i] = n2;
        } else {
            this.h[n2] = -1;
            if (this.j > 0) {
                this.i[n2] = this.k;
                this.k = n2;
            } else {
                this.i[n2] = -1;
            }
        }
        int[] iArr2 = this.i;
        if (iArr2[n2] != -1) {
            this.h[iArr2[n2]] = n2;
        }
        l(de1Var, n2);
    }

    public final void r(de1 de1Var) {
        int[] iArr;
        int i = de1Var.c;
        int i2 = i % this.c;
        int[] iArr2 = this.d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            return;
        }
        if (this.f[i3] == i) {
            int[] iArr3 = this.e;
            iArr2[i2] = iArr3[i3];
            iArr3[i3] = -1;
            return;
        }
        while (true) {
            iArr = this.e;
            if (iArr[i3] == -1 || this.f[iArr[i3]] == i) {
                break;
            }
            i3 = iArr[i3];
        }
        int i4 = iArr[i3];
        if (i4 == -1 || this.f[i4] != i) {
            return;
        }
        iArr[i3] = iArr[i4];
        iArr[i4] = -1;
    }

    public String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            de1 d = d(i2);
            if (d != null) {
                String str2 = str + d + " = " + g(i2) + " ";
                int p = p(d);
                String str3 = str2 + "[p: ";
                if (this.h[p] != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(this.m.d[this.f[this.h[p]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.i[p] != -1 ? str4 + this.m.d[this.f[this.i[p]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
