package com.daaw;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class bv7 extends yq7 {

    /* renamed from: y */
    public static final int[] f5213y = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: t */
    public final int f5214t;

    /* renamed from: u */
    public final yq7 f5215u;

    /* renamed from: v */
    public final yq7 f5216v;

    /* renamed from: w */
    public final int f5217w;

    /* renamed from: x */
    public final int f5218x;

    public bv7(yq7 yq7Var, yq7 yq7Var2) {
        this.f5215u = yq7Var;
        this.f5216v = yq7Var2;
        int mo3411o = yq7Var.mo3411o();
        this.f5217w = mo3411o;
        this.f5214t = mo3411o + yq7Var2.mo3411o();
        this.f5218x = Math.max(yq7Var.mo3409q(), yq7Var2.mo3409q()) + 1;
    }

    /* renamed from: L */
    public static yq7 m25804L(yq7 yq7Var, yq7 yq7Var2) {
        if (yq7Var2.mo3411o() == 0) {
            return yq7Var;
        }
        if (yq7Var.mo3411o() == 0) {
            return yq7Var2;
        }
        int mo3411o = yq7Var.mo3411o() + yq7Var2.mo3411o();
        if (mo3411o < 128) {
            return m25803M(yq7Var, yq7Var2);
        }
        if (yq7Var instanceof bv7) {
            bv7 bv7Var = (bv7) yq7Var;
            if (bv7Var.f5216v.mo3411o() + yq7Var2.mo3411o() < 128) {
                return new bv7(bv7Var.f5215u, m25803M(bv7Var.f5216v, yq7Var2));
            } else if (bv7Var.f5215u.mo3409q() > bv7Var.f5216v.mo3409q() && bv7Var.f5218x > yq7Var2.mo3409q()) {
                return new bv7(bv7Var.f5215u, new bv7(bv7Var.f5216v, yq7Var2));
            }
        }
        return mo3411o >= m25802N(Math.max(yq7Var.mo3409q(), yq7Var2.mo3409q()) + 1) ? new bv7(yq7Var, yq7Var2) : xu7.m4500a(new xu7(null), yq7Var, yq7Var2);
    }

    /* renamed from: M */
    public static yq7 m25803M(yq7 yq7Var, yq7 yq7Var2) {
        int mo3411o = yq7Var.mo3411o();
        int mo3411o2 = yq7Var2.mo3411o();
        byte[] bArr = new byte[mo3411o + mo3411o2];
        yq7Var.m3417f(bArr, 0, 0, mo3411o);
        yq7Var2.m3417f(bArr, 0, mo3411o, mo3411o2);
        return new uq7(bArr);
    }

    /* renamed from: N */
    public static int m25802N(int i) {
        int[] iArr = f5213y;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.daaw.yq7
    /* renamed from: C */
    public final sq7 mo3427C() {
        return new ju7(this);
    }

    @Override // com.daaw.yq7
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yq7)) {
            return false;
        }
        yq7 yq7Var = (yq7) obj;
        if (this.f5214t != yq7Var.mo3411o()) {
            return false;
        }
        if (this.f5214t == 0) {
            return true;
        }
        int m3428B = m3428B();
        int m3428B2 = yq7Var.m3428B();
        if (m3428B != 0 && m3428B2 != 0 && m3428B != m3428B2) {
            return false;
        }
        zu7 zu7Var = new zu7(this, null);
        tq7 next = zu7Var.next();
        zu7 zu7Var2 = new zu7(yq7Var, null);
        tq7 next2 = zu7Var2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int mo3411o = next.mo3411o() - i;
            int mo3411o2 = next2.mo3411o() - i2;
            int min = Math.min(mo3411o, mo3411o2);
            if (!(i == 0 ? next.mo7800K(next2, i2, min) : next2.mo7800K(next, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.f5214t;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == mo3411o) {
                next = zu7Var.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == mo3411o2) {
                next2 = zu7Var2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.daaw.yq7, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new ju7(this);
    }

    @Override // com.daaw.yq7
    /* renamed from: k */
    public final byte mo3414k(int i) {
        yq7.m3418e(i, this.f5214t);
        return mo3413m(i);
    }

    @Override // com.daaw.yq7
    /* renamed from: m */
    public final byte mo3413m(int i) {
        int i2 = this.f5217w;
        return i < i2 ? this.f5215u.mo3413m(i) : this.f5216v.mo3413m(i - i2);
    }

    @Override // com.daaw.yq7
    /* renamed from: o */
    public final int mo3411o() {
        return this.f5214t;
    }

    @Override // com.daaw.yq7
    /* renamed from: p */
    public final void mo3410p(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.f5217w;
        if (i + i3 <= i4) {
            this.f5215u.mo3410p(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.f5216v.mo3410p(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.f5215u.mo3410p(bArr, i, i2, i5);
            this.f5216v.mo3410p(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    @Override // com.daaw.yq7
    /* renamed from: q */
    public final int mo3409q() {
        return this.f5218x;
    }

    @Override // com.daaw.yq7
    /* renamed from: r */
    public final boolean mo3408r() {
        return this.f5214t >= m25802N(this.f5218x);
    }

    @Override // com.daaw.yq7
    /* renamed from: s */
    public final int mo3407s(int i, int i2, int i3) {
        int i4 = this.f5217w;
        if (i2 + i3 <= i4) {
            return this.f5215u.mo3407s(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f5216v.mo3407s(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f5216v.mo3407s(this.f5215u.mo3407s(i, i2, i5), 0, i3 - i5);
    }

    @Override // com.daaw.yq7
    /* renamed from: t */
    public final int mo3406t(int i, int i2, int i3) {
        int i4 = this.f5217w;
        if (i2 + i3 <= i4) {
            return this.f5215u.mo3406t(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f5216v.mo3406t(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f5216v.mo3406t(this.f5215u.mo3406t(i, i2, i5), 0, i3 - i5);
    }

    @Override // com.daaw.yq7
    /* renamed from: u */
    public final yq7 mo3405u(int i, int i2) {
        int m3429A = yq7.m3429A(i, i2, this.f5214t);
        if (m3429A == 0) {
            return yq7.f33966q;
        }
        if (m3429A == this.f5214t) {
            return this;
        }
        int i3 = this.f5217w;
        if (i2 <= i3) {
            return this.f5215u.mo3405u(i, i2);
        }
        if (i >= i3) {
            return this.f5216v.mo3405u(i - i3, i2 - i3);
        }
        yq7 yq7Var = this.f5215u;
        return new bv7(yq7Var.mo3405u(i, yq7Var.mo3411o()), this.f5216v.mo3405u(0, i2 - this.f5217w));
    }

    @Override // com.daaw.yq7
    /* renamed from: v */
    public final jr7 mo3404v() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        zu7 zu7Var = new zu7(this, null);
        while (zu7Var.hasNext()) {
            arrayList.add(zu7Var.next().mo3402x());
        }
        int i = jr7.f15355e;
        boolean z = false;
        int i2 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i2 += byteBuffer.remaining();
            z = byteBuffer.hasArray() ? z | true : byteBuffer.isDirect() ? z | true : z | true;
        }
        return z ? new cr7(arrayList, i2, true, null) : jr7.m18299g(new ys7(arrayList), 4096);
    }

    @Override // com.daaw.yq7
    /* renamed from: w */
    public final String mo3403w(Charset charset) {
        return new String(m3415j(), charset);
    }

    @Override // com.daaw.yq7
    /* renamed from: y */
    public final void mo3401y(nq7 nq7Var) {
        this.f5215u.mo3401y(nq7Var);
        this.f5216v.mo3401y(nq7Var);
    }

    @Override // com.daaw.yq7
    /* renamed from: z */
    public final boolean mo3400z() {
        int mo3406t = this.f5215u.mo3406t(0, 0, this.f5217w);
        yq7 yq7Var = this.f5216v;
        return yq7Var.mo3406t(mo3406t, 0, yq7Var.mo3411o()) == 0;
    }
}
