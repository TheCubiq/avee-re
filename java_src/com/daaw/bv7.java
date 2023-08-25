package com.daaw;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class bv7 extends yq7 {
    public static final int[] y = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int t;
    public final yq7 u;
    public final yq7 v;
    public final int w;
    public final int x;

    public bv7(yq7 yq7Var, yq7 yq7Var2) {
        this.u = yq7Var;
        this.v = yq7Var2;
        int o = yq7Var.o();
        this.w = o;
        this.t = o + yq7Var2.o();
        this.x = Math.max(yq7Var.q(), yq7Var2.q()) + 1;
    }

    public static yq7 L(yq7 yq7Var, yq7 yq7Var2) {
        if (yq7Var2.o() == 0) {
            return yq7Var;
        }
        if (yq7Var.o() == 0) {
            return yq7Var2;
        }
        int o = yq7Var.o() + yq7Var2.o();
        if (o < 128) {
            return M(yq7Var, yq7Var2);
        }
        if (yq7Var instanceof bv7) {
            bv7 bv7Var = (bv7) yq7Var;
            if (bv7Var.v.o() + yq7Var2.o() < 128) {
                return new bv7(bv7Var.u, M(bv7Var.v, yq7Var2));
            } else if (bv7Var.u.q() > bv7Var.v.q() && bv7Var.x > yq7Var2.q()) {
                return new bv7(bv7Var.u, new bv7(bv7Var.v, yq7Var2));
            }
        }
        return o >= N(Math.max(yq7Var.q(), yq7Var2.q()) + 1) ? new bv7(yq7Var, yq7Var2) : xu7.a(new xu7(null), yq7Var, yq7Var2);
    }

    public static yq7 M(yq7 yq7Var, yq7 yq7Var2) {
        int o = yq7Var.o();
        int o2 = yq7Var2.o();
        byte[] bArr = new byte[o + o2];
        yq7Var.f(bArr, 0, 0, o);
        yq7Var2.f(bArr, 0, o, o2);
        return new uq7(bArr);
    }

    public static int N(int i) {
        int[] iArr = y;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.daaw.yq7
    public final sq7 C() {
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
        if (this.t != yq7Var.o()) {
            return false;
        }
        if (this.t == 0) {
            return true;
        }
        int B = B();
        int B2 = yq7Var.B();
        if (B != 0 && B2 != 0 && B != B2) {
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
            int o = next.o() - i;
            int o2 = next2.o() - i2;
            int min = Math.min(o, o2);
            if (!(i == 0 ? next.K(next2, i2, min) : next2.K(next, i, min))) {
                return false;
            }
            i3 += min;
            int i4 = this.t;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == o) {
                next = zu7Var.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == o2) {
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
    public final byte k(int i) {
        yq7.e(i, this.t);
        return m(i);
    }

    @Override // com.daaw.yq7
    public final byte m(int i) {
        int i2 = this.w;
        return i < i2 ? this.u.m(i) : this.v.m(i - i2);
    }

    @Override // com.daaw.yq7
    public final int o() {
        return this.t;
    }

    @Override // com.daaw.yq7
    public final void p(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.w;
        if (i + i3 <= i4) {
            this.u.p(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.v.p(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.u.p(bArr, i, i2, i5);
            this.v.p(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    @Override // com.daaw.yq7
    public final int q() {
        return this.x;
    }

    @Override // com.daaw.yq7
    public final boolean r() {
        return this.t >= N(this.x);
    }

    @Override // com.daaw.yq7
    public final int s(int i, int i2, int i3) {
        int i4 = this.w;
        if (i2 + i3 <= i4) {
            return this.u.s(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.v.s(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.v.s(this.u.s(i, i2, i5), 0, i3 - i5);
    }

    @Override // com.daaw.yq7
    public final int t(int i, int i2, int i3) {
        int i4 = this.w;
        if (i2 + i3 <= i4) {
            return this.u.t(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.v.t(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.v.t(this.u.t(i, i2, i5), 0, i3 - i5);
    }

    @Override // com.daaw.yq7
    public final yq7 u(int i, int i2) {
        int A = yq7.A(i, i2, this.t);
        if (A == 0) {
            return yq7.q;
        }
        if (A == this.t) {
            return this;
        }
        int i3 = this.w;
        if (i2 <= i3) {
            return this.u.u(i, i2);
        }
        if (i >= i3) {
            return this.v.u(i - i3, i2 - i3);
        }
        yq7 yq7Var = this.u;
        return new bv7(yq7Var.u(i, yq7Var.o()), this.v.u(0, i2 - this.w));
    }

    @Override // com.daaw.yq7
    public final jr7 v() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        zu7 zu7Var = new zu7(this, null);
        while (zu7Var.hasNext()) {
            arrayList.add(zu7Var.next().x());
        }
        int i = jr7.e;
        boolean z = false;
        int i2 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i2 += byteBuffer.remaining();
            z = byteBuffer.hasArray() ? z | true : byteBuffer.isDirect() ? z | true : z | true;
        }
        return z ? new cr7(arrayList, i2, true, null) : jr7.g(new ys7(arrayList), 4096);
    }

    @Override // com.daaw.yq7
    public final String w(Charset charset) {
        return new String(j(), charset);
    }

    @Override // com.daaw.yq7
    public final void y(nq7 nq7Var) {
        this.u.y(nq7Var);
        this.v.y(nq7Var);
    }

    @Override // com.daaw.yq7
    public final boolean z() {
        int t = this.u.t(0, 0, this.w);
        yq7 yq7Var = this.v;
        return yq7Var.t(t, 0, yq7Var.o()) == 0;
    }
}
