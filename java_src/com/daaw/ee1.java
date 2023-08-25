package com.daaw;

import com.daaw.C1659i6;
import java.util.Arrays;
/* loaded from: classes.dex */
public class ee1 implements C1659i6.InterfaceC1660a {

    /* renamed from: n */
    public static float f8390n = 0.001f;

    /* renamed from: a */
    public final int f8391a = -1;

    /* renamed from: b */
    public int f8392b = 16;

    /* renamed from: c */
    public int f8393c = 16;

    /* renamed from: d */
    public int[] f8394d = new int[16];

    /* renamed from: e */
    public int[] f8395e = new int[16];

    /* renamed from: f */
    public int[] f8396f = new int[16];

    /* renamed from: g */
    public float[] f8397g = new float[16];

    /* renamed from: h */
    public int[] f8398h = new int[16];

    /* renamed from: i */
    public int[] f8399i = new int[16];

    /* renamed from: j */
    public int f8400j = 0;

    /* renamed from: k */
    public int f8401k = -1;

    /* renamed from: l */
    public final C1659i6 f8402l;

    /* renamed from: m */
    public final C1395gd f8403m;

    public ee1(C1659i6 c1659i6, C1395gd c1395gd) {
        this.f8402l = c1659i6;
        this.f8403m = c1395gd;
        clear();
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: a */
    public float mo20080a(de1 de1Var, boolean z) {
        int m23543p = m23543p(de1Var);
        if (m23543p == -1) {
            return 0.0f;
        }
        m23541r(de1Var);
        float f = this.f8397g[m23543p];
        if (this.f8401k == m23543p) {
            this.f8401k = this.f8399i[m23543p];
        }
        this.f8396f[m23543p] = -1;
        int[] iArr = this.f8398h;
        if (iArr[m23543p] != -1) {
            int[] iArr2 = this.f8399i;
            iArr2[iArr[m23543p]] = iArr2[m23543p];
        }
        int[] iArr3 = this.f8399i;
        if (iArr3[m23543p] != -1) {
            iArr[iArr3[m23543p]] = iArr[m23543p];
        }
        this.f8400j--;
        de1Var.f6983m--;
        if (z) {
            de1Var.m24449c(this.f8402l);
        }
        return f;
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: b */
    public int mo20079b() {
        return this.f8400j;
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: c */
    public void mo20078c(de1 de1Var, float f, boolean z) {
        float f2 = f8390n;
        if (f <= (-f2) || f >= f2) {
            int m23543p = m23543p(de1Var);
            if (m23543p == -1) {
                mo20073h(de1Var, f);
                return;
            }
            float[] fArr = this.f8397g;
            fArr[m23543p] = fArr[m23543p] + f;
            float f3 = fArr[m23543p];
            float f4 = f8390n;
            if (f3 <= (-f4) || fArr[m23543p] >= f4) {
                return;
            }
            fArr[m23543p] = 0.0f;
            mo20080a(de1Var, z);
        }
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    public void clear() {
        int i = this.f8400j;
        for (int i2 = 0; i2 < i; i2++) {
            de1 mo20077d = mo20077d(i2);
            if (mo20077d != null) {
                mo20077d.m24449c(this.f8402l);
            }
        }
        for (int i3 = 0; i3 < this.f8392b; i3++) {
            this.f8396f[i3] = -1;
            this.f8395e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f8393c; i4++) {
            this.f8394d[i4] = -1;
        }
        this.f8400j = 0;
        this.f8401k = -1;
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: d */
    public de1 mo20077d(int i) {
        int i2 = this.f8400j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f8401k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f8403m.f11079d[this.f8396f[i3]];
            }
            i3 = this.f8399i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: e */
    public float mo20076e(de1 de1Var) {
        int m23543p = m23543p(de1Var);
        if (m23543p != -1) {
            return this.f8397g[m23543p];
        }
        return 0.0f;
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: f */
    public void mo20075f() {
        int i = this.f8400j;
        int i2 = this.f8401k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f8397g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f8399i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: g */
    public float mo20074g(int i) {
        int i2 = this.f8400j;
        int i3 = this.f8401k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f8397g[i3];
            }
            i3 = this.f8399i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: h */
    public void mo20073h(de1 de1Var, float f) {
        float f2 = f8390n;
        if (f > (-f2) && f < f2) {
            mo20080a(de1Var, true);
            return;
        }
        if (this.f8400j == 0) {
            m23546m(0, de1Var, f);
            m23547l(de1Var, 0);
            this.f8401k = 0;
            return;
        }
        int m23543p = m23543p(de1Var);
        if (m23543p != -1) {
            this.f8397g[m23543p] = f;
            return;
        }
        if (this.f8400j + 1 >= this.f8392b) {
            m23544o();
        }
        int i = this.f8400j;
        int i2 = this.f8401k;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr = this.f8396f;
            int i5 = iArr[i2];
            int i6 = de1Var.f6973c;
            if (i5 == i6) {
                this.f8397g[i2] = f;
                return;
            }
            if (iArr[i2] < i6) {
                i3 = i2;
            }
            i2 = this.f8399i[i2];
            if (i2 == -1) {
                break;
            }
        }
        m23542q(i3, de1Var, f);
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: i */
    public boolean mo20072i(de1 de1Var) {
        return m23543p(de1Var) != -1;
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: j */
    public void mo20071j(float f) {
        int i = this.f8400j;
        int i2 = this.f8401k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f8397g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f8399i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: k */
    public float mo20070k(C1659i6 c1659i6, boolean z) {
        float mo20076e = mo20076e(c1659i6.f13288a);
        mo20080a(c1659i6.f13288a, z);
        ee1 ee1Var = (ee1) c1659i6.f13292e;
        int mo20079b = ee1Var.mo20079b();
        int i = 0;
        int i2 = 0;
        while (i < mo20079b) {
            int[] iArr = ee1Var.f8396f;
            if (iArr[i2] != -1) {
                mo20078c(this.f8403m.f11079d[iArr[i2]], ee1Var.f8397g[i2] * mo20076e, z);
                i++;
            }
            i2++;
        }
        return mo20076e;
    }

    /* renamed from: l */
    public final void m23547l(de1 de1Var, int i) {
        int[] iArr;
        int i2 = de1Var.f6973c % this.f8393c;
        int[] iArr2 = this.f8394d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f8395e;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.f8395e[i] = -1;
    }

    /* renamed from: m */
    public final void m23546m(int i, de1 de1Var, float f) {
        this.f8396f[i] = de1Var.f6973c;
        this.f8397g[i] = f;
        this.f8398h[i] = -1;
        this.f8399i[i] = -1;
        de1Var.m24451a(this.f8402l);
        de1Var.f6983m++;
        this.f8400j++;
    }

    /* renamed from: n */
    public final int m23545n() {
        for (int i = 0; i < this.f8392b; i++) {
            if (this.f8396f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public final void m23544o() {
        int i = this.f8392b * 2;
        this.f8396f = Arrays.copyOf(this.f8396f, i);
        this.f8397g = Arrays.copyOf(this.f8397g, i);
        this.f8398h = Arrays.copyOf(this.f8398h, i);
        this.f8399i = Arrays.copyOf(this.f8399i, i);
        this.f8395e = Arrays.copyOf(this.f8395e, i);
        for (int i2 = this.f8392b; i2 < i; i2++) {
            this.f8396f[i2] = -1;
            this.f8395e[i2] = -1;
        }
        this.f8392b = i;
    }

    /* renamed from: p */
    public int m23543p(de1 de1Var) {
        int[] iArr;
        if (this.f8400j == 0) {
            return -1;
        }
        int i = de1Var.f6973c;
        int i2 = this.f8394d[i % this.f8393c];
        if (i2 == -1) {
            return -1;
        }
        if (this.f8396f[i2] == i) {
            return i2;
        }
        while (true) {
            iArr = this.f8395e;
            if (iArr[i2] == -1 || this.f8396f[iArr[i2]] == i) {
                break;
            }
            i2 = iArr[i2];
        }
        if (iArr[i2] != -1 && this.f8396f[iArr[i2]] == i) {
            return iArr[i2];
        }
        return -1;
    }

    /* renamed from: q */
    public final void m23542q(int i, de1 de1Var, float f) {
        int m23545n = m23545n();
        m23546m(m23545n, de1Var, f);
        if (i != -1) {
            this.f8398h[m23545n] = i;
            int[] iArr = this.f8399i;
            iArr[m23545n] = iArr[i];
            iArr[i] = m23545n;
        } else {
            this.f8398h[m23545n] = -1;
            if (this.f8400j > 0) {
                this.f8399i[m23545n] = this.f8401k;
                this.f8401k = m23545n;
            } else {
                this.f8399i[m23545n] = -1;
            }
        }
        int[] iArr2 = this.f8399i;
        if (iArr2[m23545n] != -1) {
            this.f8398h[iArr2[m23545n]] = m23545n;
        }
        m23547l(de1Var, m23545n);
    }

    /* renamed from: r */
    public final void m23541r(de1 de1Var) {
        int[] iArr;
        int i = de1Var.f6973c;
        int i2 = i % this.f8393c;
        int[] iArr2 = this.f8394d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            return;
        }
        if (this.f8396f[i3] == i) {
            int[] iArr3 = this.f8395e;
            iArr2[i2] = iArr3[i3];
            iArr3[i3] = -1;
            return;
        }
        while (true) {
            iArr = this.f8395e;
            if (iArr[i3] == -1 || this.f8396f[iArr[i3]] == i) {
                break;
            }
            i3 = iArr[i3];
        }
        int i4 = iArr[i3];
        if (i4 == -1 || this.f8396f[i4] != i) {
            return;
        }
        iArr[i3] = iArr[i4];
        iArr[i4] = -1;
    }

    public String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i = this.f8400j;
        for (int i2 = 0; i2 < i; i2++) {
            de1 mo20077d = mo20077d(i2);
            if (mo20077d != null) {
                String str2 = str + mo20077d + " = " + mo20074g(i2) + " ";
                int m23543p = m23543p(mo20077d);
                String str3 = str2 + "[p: ";
                if (this.f8398h[m23543p] != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(this.f8403m.f11079d[this.f8396f[this.f8398h[m23543p]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.f8399i[m23543p] != -1 ? str4 + this.f8403m.f11079d[this.f8396f[this.f8399i[m23543p]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
