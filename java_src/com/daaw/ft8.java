package com.daaw;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ft8 {
    public final ik5 a = new ik5(32);
    public et8 b;
    public et8 c;
    public et8 d;
    public long e;
    public final nw8 f;

    public ft8(nw8 nw8Var, byte[] bArr) {
        this.f = nw8Var;
        et8 et8Var = new et8(0L, 65536);
        this.b = et8Var;
        this.c = et8Var;
        this.d = et8Var;
    }

    public static et8 j(et8 et8Var, long j) {
        while (j >= et8Var.b) {
            et8Var = et8Var.d;
        }
        return et8Var;
    }

    public static et8 k(et8 et8Var, long j, ByteBuffer byteBuffer, int i) {
        et8 j2 = j(et8Var, j);
        while (i > 0) {
            int min = Math.min(i, (int) (j2.b - j));
            byteBuffer.put(j2.c.a, j2.a(j), min);
            i -= min;
            j += min;
            if (j == j2.b) {
                j2 = j2.d;
            }
        }
        return j2;
    }

    public static et8 l(et8 et8Var, long j, byte[] bArr, int i) {
        et8 j2 = j(et8Var, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (j2.b - j));
            System.arraycopy(j2.c.a, j2.a(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == j2.b) {
                j2 = j2.d;
            }
        }
        return j2;
    }

    public static et8 m(et8 et8Var, ma7 ma7Var, ht8 ht8Var, ik5 ik5Var) {
        et8 et8Var2;
        int i;
        if (ma7Var.k()) {
            long j = ht8Var.b;
            ik5Var.c(1);
            et8 l = l(et8Var, j, ik5Var.h(), 1);
            long j2 = j + 1;
            byte b = ik5Var.h()[0];
            boolean z = (b & 128) != 0;
            int i2 = b & Byte.MAX_VALUE;
            d77 d77Var = ma7Var.b;
            byte[] bArr = d77Var.a;
            if (bArr == null) {
                d77Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            et8Var2 = l(l, j2, d77Var.a, i2);
            long j3 = j2 + i2;
            if (z) {
                ik5Var.c(2);
                et8Var2 = l(et8Var2, j3, ik5Var.h(), 2);
                j3 += 2;
                i = ik5Var.w();
            } else {
                i = 1;
            }
            int[] iArr = d77Var.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = d77Var.e;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i3 = i * 6;
                ik5Var.c(i3);
                et8Var2 = l(et8Var2, j3, ik5Var.h(), i3);
                j3 += i3;
                ik5Var.f(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr2[i4] = ik5Var.w();
                    iArr4[i4] = ik5Var.v();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = ht8Var.a - ((int) (j3 - ht8Var.b));
            }
            l42 l42Var = ht8Var.c;
            int i5 = it5.a;
            d77Var.c(i, iArr2, iArr4, l42Var.b, d77Var.a, l42Var.a, l42Var.c, l42Var.d);
            long j4 = ht8Var.b;
            int i6 = (int) (j3 - j4);
            ht8Var.b = j4 + i6;
            ht8Var.a -= i6;
        } else {
            et8Var2 = et8Var;
        }
        if (!ma7Var.e()) {
            ma7Var.i(ht8Var.a);
            return k(et8Var2, ht8Var.b, ma7Var.c, ht8Var.a);
        }
        ik5Var.c(4);
        et8 l2 = l(et8Var2, ht8Var.b, ik5Var.h(), 4);
        int v = ik5Var.v();
        ht8Var.b += 4;
        ht8Var.a -= 4;
        ma7Var.i(v);
        et8 k = k(l2, ht8Var.b, ma7Var.c, v);
        ht8Var.b += v;
        int i7 = ht8Var.a - v;
        ht8Var.a = i7;
        ByteBuffer byteBuffer = ma7Var.f;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            ma7Var.f = ByteBuffer.allocate(i7);
        } else {
            ma7Var.f.clear();
        }
        return k(k, ht8Var.b, ma7Var.f, ht8Var.a);
    }

    public final int a(xp8 xp8Var, int i, boolean z) {
        int i2 = i(i);
        et8 et8Var = this.d;
        int a = xp8Var.a(et8Var.c.a, et8Var.a(this.e), i2);
        if (a != -1) {
            n(a);
            return a;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final long b() {
        return this.e;
    }

    public final void c(long j) {
        et8 et8Var;
        if (j != -1) {
            while (true) {
                et8Var = this.b;
                if (j < et8Var.b) {
                    break;
                }
                this.f.c(et8Var.c);
                this.b = this.b.b();
            }
            if (this.c.a < et8Var.a) {
                this.c = et8Var;
            }
        }
    }

    public final void d(ma7 ma7Var, ht8 ht8Var) {
        m(this.c, ma7Var, ht8Var, this.a);
    }

    public final void e(ma7 ma7Var, ht8 ht8Var) {
        this.c = m(this.c, ma7Var, ht8Var, this.a);
    }

    public final void f() {
        et8 et8Var = this.b;
        if (et8Var.c != null) {
            this.f.d(et8Var);
            et8Var.b();
        }
        this.b.c(0L, 65536);
        et8 et8Var2 = this.b;
        this.c = et8Var2;
        this.d = et8Var2;
        this.e = 0L;
        this.f.g();
    }

    public final void g() {
        this.c = this.b;
    }

    public final void h(ik5 ik5Var, int i) {
        while (i > 0) {
            int i2 = i(i);
            et8 et8Var = this.d;
            ik5Var.b(et8Var.c.a, et8Var.a(this.e), i2);
            i -= i2;
            n(i2);
        }
    }

    public final int i(int i) {
        et8 et8Var = this.d;
        if (et8Var.c == null) {
            gw8 b = this.f.b();
            et8 et8Var2 = new et8(this.d.b, 65536);
            et8Var.c = b;
            et8Var.d = et8Var2;
        }
        return Math.min(i, (int) (this.d.b - this.e));
    }

    public final void n(int i) {
        long j = this.e + i;
        this.e = j;
        et8 et8Var = this.d;
        if (j == et8Var.b) {
            this.d = et8Var.d;
        }
    }
}
