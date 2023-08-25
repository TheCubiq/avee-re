package com.daaw;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ft8 {

    /* renamed from: a */
    public final ik5 f9951a = new ik5(32);

    /* renamed from: b */
    public et8 f9952b;

    /* renamed from: c */
    public et8 f9953c;

    /* renamed from: d */
    public et8 f9954d;

    /* renamed from: e */
    public long f9955e;

    /* renamed from: f */
    public final nw8 f9956f;

    public ft8(nw8 nw8Var, byte[] bArr) {
        this.f9956f = nw8Var;
        et8 et8Var = new et8(0L, 65536);
        this.f9952b = et8Var;
        this.f9953c = et8Var;
        this.f9954d = et8Var;
    }

    /* renamed from: j */
    public static et8 m22275j(et8 et8Var, long j) {
        while (j >= et8Var.f8828b) {
            et8Var = et8Var.f8830d;
        }
        return et8Var;
    }

    /* renamed from: k */
    public static et8 m22274k(et8 et8Var, long j, ByteBuffer byteBuffer, int i) {
        et8 m22275j = m22275j(et8Var, j);
        while (i > 0) {
            int min = Math.min(i, (int) (m22275j.f8828b - j));
            byteBuffer.put(m22275j.f8829c.f11794a, m22275j.m23183a(j), min);
            i -= min;
            j += min;
            if (j == m22275j.f8828b) {
                m22275j = m22275j.f8830d;
            }
        }
        return m22275j;
    }

    /* renamed from: l */
    public static et8 m22273l(et8 et8Var, long j, byte[] bArr, int i) {
        et8 m22275j = m22275j(et8Var, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (m22275j.f8828b - j));
            System.arraycopy(m22275j.f8829c.f11794a, m22275j.m23183a(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == m22275j.f8828b) {
                m22275j = m22275j.f8830d;
            }
        }
        return m22275j;
    }

    /* renamed from: m */
    public static et8 m22272m(et8 et8Var, ma7 ma7Var, ht8 ht8Var, ik5 ik5Var) {
        et8 et8Var2;
        int i;
        if (ma7Var.m16128k()) {
            long j = ht8Var.f12926b;
            ik5Var.m19719c(1);
            et8 m22273l = m22273l(et8Var, j, ik5Var.m19714h(), 1);
            long j2 = j + 1;
            byte b = ik5Var.m19714h()[0];
            boolean z = (b & 128) != 0;
            int i2 = b & Byte.MAX_VALUE;
            d77 d77Var = ma7Var.f18727b;
            byte[] bArr = d77Var.f6587a;
            if (bArr == null) {
                d77Var.f6587a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            et8Var2 = m22273l(m22273l, j2, d77Var.f6587a, i2);
            long j3 = j2 + i2;
            if (z) {
                ik5Var.m19719c(2);
                et8Var2 = m22273l(et8Var2, j3, ik5Var.m19714h(), 2);
                j3 += 2;
                i = ik5Var.m19699w();
            } else {
                i = 1;
            }
            int[] iArr = d77Var.f6590d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = d77Var.f6591e;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i3 = i * 6;
                ik5Var.m19719c(i3);
                et8Var2 = m22273l(et8Var2, j3, ik5Var.m19714h(), i3);
                j3 += i3;
                ik5Var.m19716f(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr2[i4] = ik5Var.m19699w();
                    iArr4[i4] = ik5Var.m19700v();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = ht8Var.f12925a - ((int) (j3 - ht8Var.f12926b));
            }
            l42 l42Var = ht8Var.f12927c;
            int i5 = it5.f13991a;
            d77Var.m24608c(i, iArr2, iArr4, l42Var.f17027b, d77Var.f6587a, l42Var.f17026a, l42Var.f17028c, l42Var.f17029d);
            long j4 = ht8Var.f12926b;
            int i6 = (int) (j3 - j4);
            ht8Var.f12926b = j4 + i6;
            ht8Var.f12925a -= i6;
        } else {
            et8Var2 = et8Var;
        }
        if (!ma7Var.m20161e()) {
            ma7Var.m16130i(ht8Var.f12925a);
            return m22274k(et8Var2, ht8Var.f12926b, ma7Var.f18728c, ht8Var.f12925a);
        }
        ik5Var.m19719c(4);
        et8 m22273l2 = m22273l(et8Var2, ht8Var.f12926b, ik5Var.m19714h(), 4);
        int m19700v = ik5Var.m19700v();
        ht8Var.f12926b += 4;
        ht8Var.f12925a -= 4;
        ma7Var.m16130i(m19700v);
        et8 m22274k = m22274k(m22273l2, ht8Var.f12926b, ma7Var.f18728c, m19700v);
        ht8Var.f12926b += m19700v;
        int i7 = ht8Var.f12925a - m19700v;
        ht8Var.f12925a = i7;
        ByteBuffer byteBuffer = ma7Var.f18731f;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            ma7Var.f18731f = ByteBuffer.allocate(i7);
        } else {
            ma7Var.f18731f.clear();
        }
        return m22274k(m22274k, ht8Var.f12926b, ma7Var.f18731f, ht8Var.f12925a);
    }

    /* renamed from: a */
    public final int m22284a(xp8 xp8Var, int i, boolean z) {
        int m22276i = m22276i(i);
        et8 et8Var = this.f9954d;
        int mo1980a = xp8Var.mo1980a(et8Var.f8829c.f11794a, et8Var.m23183a(this.f9955e), m22276i);
        if (mo1980a != -1) {
            m22271n(mo1980a);
            return mo1980a;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public final long m22283b() {
        return this.f9955e;
    }

    /* renamed from: c */
    public final void m22282c(long j) {
        et8 et8Var;
        if (j != -1) {
            while (true) {
                et8Var = this.f9952b;
                if (j < et8Var.f8828b) {
                    break;
                }
                this.f9956f.m14757c(et8Var.f8829c);
                this.f9952b = this.f9952b.m23182b();
            }
            if (this.f9953c.f8827a < et8Var.f8827a) {
                this.f9953c = et8Var;
            }
        }
    }

    /* renamed from: d */
    public final void m22281d(ma7 ma7Var, ht8 ht8Var) {
        m22272m(this.f9953c, ma7Var, ht8Var, this.f9951a);
    }

    /* renamed from: e */
    public final void m22280e(ma7 ma7Var, ht8 ht8Var) {
        this.f9953c = m22272m(this.f9953c, ma7Var, ht8Var, this.f9951a);
    }

    /* renamed from: f */
    public final void m22279f() {
        et8 et8Var = this.f9952b;
        if (et8Var.f8829c != null) {
            this.f9956f.m14756d(et8Var);
            et8Var.m23182b();
        }
        this.f9952b.m23181c(0L, 65536);
        et8 et8Var2 = this.f9952b;
        this.f9953c = et8Var2;
        this.f9954d = et8Var2;
        this.f9955e = 0L;
        this.f9956f.m14753g();
    }

    /* renamed from: g */
    public final void m22278g() {
        this.f9953c = this.f9952b;
    }

    /* renamed from: h */
    public final void m22277h(ik5 ik5Var, int i) {
        while (i > 0) {
            int m22276i = m22276i(i);
            et8 et8Var = this.f9954d;
            ik5Var.m19720b(et8Var.f8829c.f11794a, et8Var.m23183a(this.f9955e), m22276i);
            i -= m22276i;
            m22271n(m22276i);
        }
    }

    /* renamed from: i */
    public final int m22276i(int i) {
        et8 et8Var = this.f9954d;
        if (et8Var.f8829c == null) {
            gw8 m14758b = this.f9956f.m14758b();
            et8 et8Var2 = new et8(this.f9954d.f8828b, 65536);
            et8Var.f8829c = m14758b;
            et8Var.f8830d = et8Var2;
        }
        return Math.min(i, (int) (this.f9954d.f8828b - this.f9955e));
    }

    /* renamed from: n */
    public final void m22271n(int i) {
        long j = this.f9955e + i;
        this.f9955e = j;
        et8 et8Var = this.f9954d;
        if (j == et8Var.f8828b) {
            this.f9954d = et8Var.f8830d;
        }
    }
}
