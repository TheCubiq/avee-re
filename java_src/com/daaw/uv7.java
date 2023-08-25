package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class uv7 {

    /* renamed from: f */
    public static final uv7 f29574f = new uv7(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f29575a;

    /* renamed from: b */
    public int[] f29576b;

    /* renamed from: c */
    public Object[] f29577c;

    /* renamed from: d */
    public int f29578d;

    /* renamed from: e */
    public boolean f29579e;

    public uv7() {
        this(0, new int[8], new Object[8], true);
    }

    public uv7(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f29578d = -1;
        this.f29575a = i;
        this.f29576b = iArr;
        this.f29577c = objArr;
        this.f29579e = z;
    }

    /* renamed from: c */
    public static uv7 m7679c() {
        return f29574f;
    }

    /* renamed from: e */
    public static uv7 m7677e(uv7 uv7Var, uv7 uv7Var2) {
        int i = uv7Var.f29575a + uv7Var2.f29575a;
        int[] copyOf = Arrays.copyOf(uv7Var.f29576b, i);
        System.arraycopy(uv7Var2.f29576b, 0, copyOf, uv7Var.f29575a, uv7Var2.f29575a);
        Object[] copyOf2 = Arrays.copyOf(uv7Var.f29577c, i);
        System.arraycopy(uv7Var2.f29577c, 0, copyOf2, uv7Var.f29575a, uv7Var2.f29575a);
        return new uv7(i, copyOf, copyOf2, true);
    }

    /* renamed from: f */
    public static uv7 m7676f() {
        return new uv7(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m7681a() {
        int m12256f;
        int m12255g;
        int i;
        int i2 = this.f29578d;
        if (i2 == -1) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.f29575a; i4++) {
                int i5 = this.f29576b[i4];
                int i6 = i5 >>> 3;
                int i7 = i5 & 7;
                if (i7 != 0) {
                    if (i7 == 1) {
                        ((Long) this.f29577c[i4]).longValue();
                        i = qr7.m12256f(i6 << 3) + 8;
                    } else if (i7 == 2) {
                        int m12256f2 = qr7.m12256f(i6 << 3);
                        int mo3411o = ((yq7) this.f29577c[i4]).mo3411o();
                        i3 += m12256f2 + qr7.m12256f(mo3411o) + mo3411o;
                    } else if (i7 == 3) {
                        int m12257e = qr7.m12257e(i6);
                        m12256f = m12257e + m12257e;
                        m12255g = ((uv7) this.f29577c[i4]).m7681a();
                    } else if (i7 != 5) {
                        throw new IllegalStateException(xs7.m4543a());
                    } else {
                        ((Integer) this.f29577c[i4]).intValue();
                        i = qr7.m12256f(i6 << 3) + 4;
                    }
                    i3 += i;
                } else {
                    long longValue = ((Long) this.f29577c[i4]).longValue();
                    m12256f = qr7.m12256f(i6 << 3);
                    m12255g = qr7.m12255g(longValue);
                }
                i = m12256f + m12255g;
                i3 += i;
            }
            this.f29578d = i3;
            return i3;
        }
        return i2;
    }

    /* renamed from: b */
    public final int m7680b() {
        int i = this.f29578d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f29575a; i3++) {
                int i4 = this.f29576b[i3];
                int m12256f = qr7.m12256f(8);
                int mo3411o = ((yq7) this.f29577c[i3]).mo3411o();
                i2 += m12256f + m12256f + qr7.m12256f(16) + qr7.m12256f(i4 >>> 3) + qr7.m12256f(24) + qr7.m12256f(mo3411o) + mo3411o;
            }
            this.f29578d = i2;
            return i2;
        }
        return i;
    }

    /* renamed from: d */
    public final uv7 m7678d(uv7 uv7Var) {
        if (uv7Var.equals(f29574f)) {
            return this;
        }
        m7675g();
        int i = this.f29575a + uv7Var.f29575a;
        m7670l(i);
        System.arraycopy(uv7Var.f29576b, 0, this.f29576b, this.f29575a, uv7Var.f29575a);
        System.arraycopy(uv7Var.f29577c, 0, this.f29577c, this.f29575a, uv7Var.f29575a);
        this.f29575a = i;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof uv7)) {
            uv7 uv7Var = (uv7) obj;
            int i = this.f29575a;
            if (i == uv7Var.f29575a) {
                int[] iArr = this.f29576b;
                int[] iArr2 = uv7Var.f29576b;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        Object[] objArr = this.f29577c;
                        Object[] objArr2 = uv7Var.f29577c;
                        int i3 = this.f29575a;
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
    public final void m7675g() {
        if (!this.f29579e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: h */
    public final void m7674h() {
        this.f29579e = false;
    }

    public final int hashCode() {
        int i = this.f29575a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f29576b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f29577c;
        int i7 = this.f29575a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void m7673i(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f29575a; i2++) {
            zt7.m1897b(sb, i, String.valueOf(this.f29576b[i2] >>> 3), this.f29577c[i2]);
        }
    }

    /* renamed from: j */
    public final void m7672j(int i, Object obj) {
        m7675g();
        m7670l(this.f29575a + 1);
        int[] iArr = this.f29576b;
        int i2 = this.f29575a;
        iArr[i2] = i;
        this.f29577c[i2] = obj;
        this.f29575a = i2 + 1;
    }

    /* renamed from: k */
    public final void m7671k(rr7 rr7Var) {
        if (this.f29575a != 0) {
            for (int i = 0; i < this.f29575a; i++) {
                int i2 = this.f29576b[i];
                Object obj = this.f29577c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    rr7Var.m11041E(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    rr7Var.m11011x(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    rr7Var.m11020o(i3, (yq7) obj);
                } else if (i4 == 3) {
                    rr7Var.m11030e(i3);
                    ((uv7) obj).m7671k(rr7Var);
                    rr7Var.m11016s(i3);
                } else if (i4 != 5) {
                    throw new RuntimeException(xs7.m4543a());
                } else {
                    rr7Var.m11013v(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* renamed from: l */
    public final void m7670l(int i) {
        int[] iArr = this.f29576b;
        if (i > iArr.length) {
            int i2 = this.f29575a;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f29576b = Arrays.copyOf(iArr, i);
            this.f29577c = Arrays.copyOf(this.f29577c, i);
        }
    }
}
