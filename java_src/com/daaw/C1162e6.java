package com.daaw;

import com.daaw.C1659i6;
import java.util.Arrays;
/* renamed from: com.daaw.e6 */
/* loaded from: classes.dex */
public class C1162e6 implements C1659i6.InterfaceC1660a {

    /* renamed from: l */
    public static float f8134l = 0.001f;

    /* renamed from: b */
    public final C1659i6 f8136b;

    /* renamed from: c */
    public final C1395gd f8137c;

    /* renamed from: a */
    public int f8135a = 0;

    /* renamed from: d */
    public int f8138d = 8;

    /* renamed from: e */
    public de1 f8139e = null;

    /* renamed from: f */
    public int[] f8140f = new int[8];

    /* renamed from: g */
    public int[] f8141g = new int[8];

    /* renamed from: h */
    public float[] f8142h = new float[8];

    /* renamed from: i */
    public int f8143i = -1;

    /* renamed from: j */
    public int f8144j = -1;

    /* renamed from: k */
    public boolean f8145k = false;

    public C1162e6(C1659i6 c1659i6, C1395gd c1395gd) {
        this.f8136b = c1659i6;
        this.f8137c = c1395gd;
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: a */
    public final float mo20080a(de1 de1Var, boolean z) {
        if (this.f8139e == de1Var) {
            this.f8139e = null;
        }
        int i = this.f8143i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f8135a) {
            if (this.f8140f[i] == de1Var.f6973c) {
                if (i == this.f8143i) {
                    this.f8143i = this.f8141g[i];
                } else {
                    int[] iArr = this.f8141g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    de1Var.m24449c(this.f8136b);
                }
                de1Var.f6983m--;
                this.f8135a--;
                this.f8140f[i] = -1;
                if (this.f8145k) {
                    this.f8144j = i;
                }
                return this.f8142h[i];
            }
            i2++;
            i3 = i;
            i = this.f8141g[i];
        }
        return 0.0f;
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: b */
    public int mo20079b() {
        return this.f8135a;
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: c */
    public void mo20078c(de1 de1Var, float f, boolean z) {
        float f2 = f8134l;
        if (f <= (-f2) || f >= f2) {
            int i = this.f8143i;
            if (i == -1) {
                this.f8143i = 0;
                this.f8142h[0] = f;
                this.f8140f[0] = de1Var.f6973c;
                this.f8141g[0] = -1;
                de1Var.f6983m++;
                de1Var.m24451a(this.f8136b);
                this.f8135a++;
                if (this.f8145k) {
                    return;
                }
                int i2 = this.f8144j + 1;
                this.f8144j = i2;
                int[] iArr = this.f8140f;
                if (i2 >= iArr.length) {
                    this.f8145k = true;
                    this.f8144j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f8135a; i4++) {
                int[] iArr2 = this.f8140f;
                int i5 = iArr2[i];
                int i6 = de1Var.f6973c;
                if (i5 == i6) {
                    float[] fArr = this.f8142h;
                    float f3 = fArr[i] + f;
                    float f4 = f8134l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f8143i) {
                            this.f8143i = this.f8141g[i];
                        } else {
                            int[] iArr3 = this.f8141g;
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            de1Var.m24449c(this.f8136b);
                        }
                        if (this.f8145k) {
                            this.f8144j = i;
                        }
                        de1Var.f6983m--;
                        this.f8135a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i3 = i;
                }
                i = this.f8141g[i];
            }
            int i7 = this.f8144j;
            int i8 = i7 + 1;
            if (this.f8145k) {
                int[] iArr4 = this.f8140f;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f8140f;
            if (i7 >= iArr5.length && this.f8135a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f8140f;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f8140f;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f8138d * 2;
                this.f8138d = i10;
                this.f8145k = false;
                this.f8144j = i7 - 1;
                this.f8142h = Arrays.copyOf(this.f8142h, i10);
                this.f8140f = Arrays.copyOf(this.f8140f, this.f8138d);
                this.f8141g = Arrays.copyOf(this.f8141g, this.f8138d);
            }
            this.f8140f[i7] = de1Var.f6973c;
            this.f8142h[i7] = f;
            int[] iArr8 = this.f8141g;
            if (i3 != -1) {
                iArr8[i7] = iArr8[i3];
                iArr8[i3] = i7;
            } else {
                iArr8[i7] = this.f8143i;
                this.f8143i = i7;
            }
            de1Var.f6983m++;
            de1Var.m24451a(this.f8136b);
            this.f8135a++;
            if (!this.f8145k) {
                this.f8144j++;
            }
            int i11 = this.f8144j;
            int[] iArr9 = this.f8140f;
            if (i11 >= iArr9.length) {
                this.f8145k = true;
                this.f8144j = iArr9.length - 1;
            }
        }
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    public final void clear() {
        int i = this.f8143i;
        for (int i2 = 0; i != -1 && i2 < this.f8135a; i2++) {
            de1 de1Var = this.f8137c.f11079d[this.f8140f[i]];
            if (de1Var != null) {
                de1Var.m24449c(this.f8136b);
            }
            i = this.f8141g[i];
        }
        this.f8143i = -1;
        this.f8144j = -1;
        this.f8145k = false;
        this.f8135a = 0;
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: d */
    public de1 mo20077d(int i) {
        int i2 = this.f8143i;
        for (int i3 = 0; i2 != -1 && i3 < this.f8135a; i3++) {
            if (i3 == i) {
                return this.f8137c.f11079d[this.f8140f[i2]];
            }
            i2 = this.f8141g[i2];
        }
        return null;
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: e */
    public final float mo20076e(de1 de1Var) {
        int i = this.f8143i;
        for (int i2 = 0; i != -1 && i2 < this.f8135a; i2++) {
            if (this.f8140f[i] == de1Var.f6973c) {
                return this.f8142h[i];
            }
            i = this.f8141g[i];
        }
        return 0.0f;
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: f */
    public void mo20075f() {
        int i = this.f8143i;
        for (int i2 = 0; i != -1 && i2 < this.f8135a; i2++) {
            float[] fArr = this.f8142h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f8141g[i];
        }
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: g */
    public float mo20074g(int i) {
        int i2 = this.f8143i;
        for (int i3 = 0; i2 != -1 && i3 < this.f8135a; i3++) {
            if (i3 == i) {
                return this.f8142h[i2];
            }
            i2 = this.f8141g[i2];
        }
        return 0.0f;
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: h */
    public final void mo20073h(de1 de1Var, float f) {
        if (f == 0.0f) {
            mo20080a(de1Var, true);
            return;
        }
        int i = this.f8143i;
        if (i == -1) {
            this.f8143i = 0;
            this.f8142h[0] = f;
            this.f8140f[0] = de1Var.f6973c;
            this.f8141g[0] = -1;
            de1Var.f6983m++;
            de1Var.m24451a(this.f8136b);
            this.f8135a++;
            if (this.f8145k) {
                return;
            }
            int i2 = this.f8144j + 1;
            this.f8144j = i2;
            int[] iArr = this.f8140f;
            if (i2 >= iArr.length) {
                this.f8145k = true;
                this.f8144j = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f8135a; i4++) {
            int[] iArr2 = this.f8140f;
            int i5 = iArr2[i];
            int i6 = de1Var.f6973c;
            if (i5 == i6) {
                this.f8142h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.f8141g[i];
        }
        int i7 = this.f8144j;
        int i8 = i7 + 1;
        if (this.f8145k) {
            int[] iArr3 = this.f8140f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f8140f;
        if (i7 >= iArr4.length && this.f8135a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f8140f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f8140f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f8138d * 2;
            this.f8138d = i10;
            this.f8145k = false;
            this.f8144j = i7 - 1;
            this.f8142h = Arrays.copyOf(this.f8142h, i10);
            this.f8140f = Arrays.copyOf(this.f8140f, this.f8138d);
            this.f8141g = Arrays.copyOf(this.f8141g, this.f8138d);
        }
        this.f8140f[i7] = de1Var.f6973c;
        this.f8142h[i7] = f;
        int[] iArr7 = this.f8141g;
        if (i3 != -1) {
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            iArr7[i7] = this.f8143i;
            this.f8143i = i7;
        }
        de1Var.f6983m++;
        de1Var.m24451a(this.f8136b);
        int i11 = this.f8135a + 1;
        this.f8135a = i11;
        if (!this.f8145k) {
            this.f8144j++;
        }
        int[] iArr8 = this.f8140f;
        if (i11 >= iArr8.length) {
            this.f8145k = true;
        }
        if (this.f8144j >= iArr8.length) {
            this.f8145k = true;
            this.f8144j = iArr8.length - 1;
        }
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: i */
    public boolean mo20072i(de1 de1Var) {
        int i = this.f8143i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f8135a; i2++) {
            if (this.f8140f[i] == de1Var.f6973c) {
                return true;
            }
            i = this.f8141g[i];
        }
        return false;
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: j */
    public void mo20071j(float f) {
        int i = this.f8143i;
        for (int i2 = 0; i != -1 && i2 < this.f8135a; i2++) {
            float[] fArr = this.f8142h;
            fArr[i] = fArr[i] / f;
            i = this.f8141g[i];
        }
    }

    @Override // com.daaw.C1659i6.InterfaceC1660a
    /* renamed from: k */
    public float mo20070k(C1659i6 c1659i6, boolean z) {
        float mo20076e = mo20076e(c1659i6.f13288a);
        mo20080a(c1659i6.f13288a, z);
        C1659i6.InterfaceC1660a interfaceC1660a = c1659i6.f13292e;
        int mo20079b = interfaceC1660a.mo20079b();
        for (int i = 0; i < mo20079b; i++) {
            de1 mo20077d = interfaceC1660a.mo20077d(i);
            mo20078c(mo20077d, interfaceC1660a.mo20076e(mo20077d) * mo20076e, z);
        }
        return mo20076e;
    }

    public String toString() {
        int i = this.f8143i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f8135a; i2++) {
            str = ((str + " -> ") + this.f8142h[i] + " : ") + this.f8137c.f11079d[this.f8140f[i]];
            i = this.f8141g[i];
        }
        return str;
    }
}
