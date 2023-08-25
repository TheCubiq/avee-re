package com.daaw;

import java.util.Arrays;
/* loaded from: classes2.dex */
public final class qg8 {

    /* renamed from: f */
    public static final qg8 f23945f = new qg8(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f23946a;

    /* renamed from: b */
    public int[] f23947b;

    /* renamed from: c */
    public Object[] f23948c;

    /* renamed from: d */
    public int f23949d;

    /* renamed from: e */
    public boolean f23950e;

    public qg8() {
        this(0, new int[8], new Object[8], true);
    }

    public qg8(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f23949d = -1;
        this.f23946a = i;
        this.f23947b = iArr;
        this.f23948c = objArr;
        this.f23950e = z;
    }

    /* renamed from: c */
    public static qg8 m12544c() {
        return f23945f;
    }

    /* renamed from: e */
    public static qg8 m12542e(qg8 qg8Var, qg8 qg8Var2) {
        int i = qg8Var.f23946a + qg8Var2.f23946a;
        int[] copyOf = Arrays.copyOf(qg8Var.f23947b, i);
        System.arraycopy(qg8Var2.f23947b, 0, copyOf, qg8Var.f23946a, qg8Var2.f23946a);
        Object[] copyOf2 = Arrays.copyOf(qg8Var.f23948c, i);
        System.arraycopy(qg8Var2.f23948c, 0, copyOf2, qg8Var.f23946a, qg8Var2.f23946a);
        return new qg8(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    public static qg8 m12541f() {
        return new qg8(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m12546a() {
        int m6384a;
        int m6383b;
        int i;
        int i2 = this.f23949d;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f23946a; i4++) {
                int i5 = this.f23947b[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ((Long) this.f23948c[i4]).longValue();
                        i = w78.m6384a(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        int m6384a2 = w78.m6384a(i6 << 3);
                        int mo2805f = ((y68) this.f23948c[i4]).mo2805f();
                        i3 += m6384a2 + w78.m6384a(mo2805f) + mo2805f;
                    } else if (i7 == 3) {
                        int m6385D = w78.m6385D(i6);
                        m6384a = m6385D + m6385D;
                        m6383b = ((qg8) this.f23948c[i4]).m12546a();
                    } else if (i7 != 5) {
                        throw new IllegalStateException(mb8.m16109a());
                    } else {
                        ((Integer) this.f23948c[i4]).intValue();
                        i = w78.m6384a(i6 << 3) + 4;
                    }
                    i3 += i;
                } else {
                    long longValue = ((Long) this.f23948c[i4]).longValue();
                    m6384a = w78.m6384a(i6 << 3);
                    m6383b = w78.m6383b(longValue);
                }
                i = m6384a + m6383b;
                i3 += i;
            }
            this.f23949d = i3;
            return i3;
        }
        return i2;
    }

    /* renamed from: b */
    public final int m12545b() {
        int i = this.f23949d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f23946a; i3++) {
                int i4 = this.f23947b[i3];
                int m6384a = w78.m6384a(8);
                int mo2805f = ((y68) this.f23948c[i3]).mo2805f();
                i2 += m6384a + m6384a + w78.m6384a(16) + w78.m6384a(i4 >>> 3) + w78.m6384a(24) + w78.m6384a(mo2805f) + mo2805f;
            }
            this.f23949d = i2;
            return i2;
        }
        return i;
    }

    /* renamed from: d */
    public final qg8 m12543d(qg8 qg8Var) {
        if (qg8Var.equals(f23945f)) {
            return this;
        }
        m12540g();
        int i = this.f23946a + qg8Var.f23946a;
        m12535l(i);
        System.arraycopy(qg8Var.f23947b, 0, this.f23947b, this.f23946a, qg8Var.f23946a);
        System.arraycopy(qg8Var.f23948c, 0, this.f23948c, this.f23946a, qg8Var.f23946a);
        this.f23946a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof qg8)) {
            qg8 qg8Var = (qg8) obj;
            int i = this.f23946a;
            if (i == qg8Var.f23946a) {
                int[] iArr = this.f23947b;
                int[] iArr2 = qg8Var.f23947b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.f23948c;
                        Object[] objArr2 = qg8Var.f23948c;
                        int i3 = this.f23946a;
                        for (int i4 = 0; i4 < i3; i4++) {
                            if (objArr[i4].equals(objArr2[i4])) {
                            }
                        }
                        return true;
                    } else if (iArr[i2] != iArr2[i2]) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: g */
    public final void m12540g() {
        if (!this.f23950e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    public final void m12539h() {
        this.f23950e = false;
    }

    public final int hashCode() {
        int i = this.f23946a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f23947b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f23948c;
        int i7 = this.f23946a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void m12538i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f23946a; i2++) {
            de8.m24439b(sb, i, String.valueOf(this.f23947b[i2] >>> 3), this.f23948c[i2]);
        }
    }

    /* renamed from: j */
    public final void m12537j(int i, Object obj) {
        m12540g();
        m12535l(this.f23946a + 1);
        int[] iArr = this.f23947b;
        int i2 = this.f23946a;
        iArr[i2] = i;
        this.f23948c[i2] = obj;
        this.f23946a = i2 + 1;
    }

    /* renamed from: k */
    public final void m12536k(ki8 ki8Var) {
        if (this.f23946a != 0) {
            for (int i = 0; i < this.f23946a; i++) {
                int i2 = this.f23947b[i];
                Object obj = this.f23948c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    ki8Var.mo2658k(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    ki8Var.mo2668a(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    ki8Var.mo2644y(i3, (y68) obj);
                } else if (i4 == 3) {
                    ki8Var.zzE(i3);
                    ((qg8) obj).m12536k(ki8Var);
                    ki8Var.mo2660i(i3);
                } else if (i4 != 5) {
                    throw new RuntimeException(mb8.m16109a());
                } else {
                    ki8Var.mo2663f(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* renamed from: l */
    public final void m12535l(int i) {
        int[] iArr = this.f23947b;
        if (i > iArr.length) {
            int i2 = this.f23946a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f23947b = Arrays.copyOf(iArr, i);
            this.f23948c = Arrays.copyOf(this.f23948c, i);
        }
    }
}
