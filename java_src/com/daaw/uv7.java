package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class uv7 {
    public static final uv7 f = new uv7(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public uv7() {
        this(0, new int[8], new Object[8], true);
    }

    public uv7(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static uv7 c() {
        return f;
    }

    public static uv7 e(uv7 uv7Var, uv7 uv7Var2) {
        int i = uv7Var.a + uv7Var2.a;
        int[] copyOf = Arrays.copyOf(uv7Var.b, i);
        System.arraycopy(uv7Var2.b, 0, copyOf, uv7Var.a, uv7Var2.a);
        Object[] copyOf2 = Arrays.copyOf(uv7Var.c, i);
        System.arraycopy(uv7Var2.c, 0, copyOf2, uv7Var.a, uv7Var2.a);
        return new uv7(i, copyOf, copyOf2, true);
    }

    public static uv7 f() {
        return new uv7(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int f2;
        int g;
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
                        i = qr7.f(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        int f3 = qr7.f(i6 << 3);
                        int o = ((yq7) this.c[i4]).o();
                        i3 += f3 + qr7.f(o) + o;
                    } else if (i7 == 3) {
                        int e = qr7.e(i6);
                        f2 = e + e;
                        g = ((uv7) this.c[i4]).a();
                    } else if (i7 != 5) {
                        throw new IllegalStateException(xs7.a());
                    } else {
                        ((Integer) this.c[i4]).intValue();
                        i = qr7.f(i6 << 3) + 4;
                    }
                    i3 += i;
                } else {
                    long longValue = ((Long) this.c[i4]).longValue();
                    f2 = qr7.f(i6 << 3);
                    g = qr7.g(longValue);
                }
                i = f2 + g;
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
                int f2 = qr7.f(8);
                int o = ((yq7) this.c[i3]).o();
                i2 += f2 + f2 + qr7.f(16) + qr7.f(i4 >>> 3) + qr7.f(24) + qr7.f(o) + o;
            }
            this.d = i2;
            return i2;
        }
        return i;
    }

    public final uv7 d(uv7 uv7Var) {
        if (uv7Var.equals(f)) {
            return this;
        }
        g();
        int i = this.a + uv7Var.a;
        l(i);
        System.arraycopy(uv7Var.b, 0, this.b, this.a, uv7Var.a);
        System.arraycopy(uv7Var.c, 0, this.c, this.a, uv7Var.a);
        this.a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof uv7)) {
            uv7 uv7Var = (uv7) obj;
            int i = this.a;
            if (i == uv7Var.a) {
                int[] iArr = this.b;
                int[] iArr2 = uv7Var.b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.c;
                        Object[] objArr2 = uv7Var.c;
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
            zt7.b(sb, i, String.valueOf(this.b[i2] >>> 3), this.c[i2]);
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

    public final void k(rr7 rr7Var) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    rr7Var.E(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    rr7Var.x(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    rr7Var.o(i3, (yq7) obj);
                } else if (i4 == 3) {
                    rr7Var.e(i3);
                    ((uv7) obj).k(rr7Var);
                    rr7Var.s(i3);
                } else if (i4 != 5) {
                    throw new RuntimeException(xs7.a());
                } else {
                    rr7Var.v(i3, ((Integer) obj).intValue());
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
