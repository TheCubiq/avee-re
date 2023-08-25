package com.daaw;

import java.util.Arrays;
/* loaded from: classes2.dex */
public final class qg8 {
    public static final qg8 f = new qg8(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public qg8() {
        this(0, new int[8], new Object[8], true);
    }

    public qg8(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static qg8 c() {
        return f;
    }

    public static qg8 e(qg8 qg8Var, qg8 qg8Var2) {
        int i = qg8Var.a + qg8Var2.a;
        int[] copyOf = Arrays.copyOf(qg8Var.b, i);
        System.arraycopy(qg8Var2.b, 0, copyOf, qg8Var.a, qg8Var2.a);
        Object[] copyOf2 = Arrays.copyOf(qg8Var.c, i);
        System.arraycopy(qg8Var2.c, 0, copyOf2, qg8Var.a, qg8Var2.a);
        return new qg8(i, copyOf, copyOf2, true);
    }

    public static qg8 f() {
        return new qg8(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int a;
        int b;
        int i;
        int i2 = this.d;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.a; i4++) {
                int i5 = this.b[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ((Long) this.c[i4]).longValue();
                        i = w78.a(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        int a2 = w78.a(i6 << 3);
                        int f2 = ((y68) this.c[i4]).f();
                        i3 += a2 + w78.a(f2) + f2;
                    } else if (i7 == 3) {
                        int D = w78.D(i6);
                        a = D + D;
                        b = ((qg8) this.c[i4]).a();
                    } else if (i7 != 5) {
                        throw new IllegalStateException(mb8.a());
                    } else {
                        ((Integer) this.c[i4]).intValue();
                        i = w78.a(i6 << 3) + 4;
                    }
                    i3 += i;
                } else {
                    long longValue = ((Long) this.c[i4]).longValue();
                    a = w78.a(i6 << 3);
                    b = w78.b(longValue);
                }
                i = a + b;
                i3 += i;
            }
            this.d = i3;
            return i3;
        }
        return i2;
    }

    public final int b() {
        int i = this.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                int i4 = this.b[i3];
                int a = w78.a(8);
                int f2 = ((y68) this.c[i3]).f();
                i2 += a + a + w78.a(16) + w78.a(i4 >>> 3) + w78.a(24) + w78.a(f2) + f2;
            }
            this.d = i2;
            return i2;
        }
        return i;
    }

    public final qg8 d(qg8 qg8Var) {
        if (qg8Var.equals(f)) {
            return this;
        }
        g();
        int i = this.a + qg8Var.a;
        l(i);
        System.arraycopy(qg8Var.b, 0, this.b, this.a, qg8Var.a);
        System.arraycopy(qg8Var.c, 0, this.c, this.a, qg8Var.a);
        this.a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof qg8)) {
            qg8 qg8Var = (qg8) obj;
            int i = this.a;
            if (i == qg8Var.a) {
                int[] iArr = this.b;
                int[] iArr2 = qg8Var.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.c;
                        Object[] objArr2 = qg8Var.c;
                        int i3 = this.a;
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

    public final void g() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        this.e = false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            de8.b(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
        }
    }

    public final void j(int i, Object obj) {
        g();
        l(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void k(ki8 ki8Var) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    ki8Var.k(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    ki8Var.a(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    ki8Var.y(i3, (y68) obj);
                } else if (i4 == 3) {
                    ki8Var.zzE(i3);
                    ((qg8) obj).k(ki8Var);
                    ki8Var.i(i3);
                } else if (i4 != 5) {
                    throw new RuntimeException(mb8.a());
                } else {
                    ki8Var.f(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void l(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }
}
