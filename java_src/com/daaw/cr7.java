package com.daaw;

import java.nio.ByteBuffer;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class cr7 extends jr7 {
    public final Iterable f;
    public final Iterator g;
    public ByteBuffer h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public long n;
    public long o;
    public long p;

    public /* synthetic */ cr7(Iterable iterable, int i, boolean z, br7 br7Var) {
        super(null);
        this.k = Integer.MAX_VALUE;
        this.i = i;
        this.f = iterable;
        this.g = iterable.iterator();
        this.m = 0;
        if (i != 0) {
            H();
            return;
        }
        this.h = vs7.e;
        this.n = 0L;
        this.o = 0L;
        this.p = 0L;
    }

    @Override // com.daaw.jr7
    public final String A() {
        int K = K();
        if (K > 0) {
            long j = K;
            long j2 = this.p;
            long j3 = this.n;
            if (j <= j2 - j3) {
                String g = lw7.g(this.h, (int) (j3 - this.o), K);
                this.n += j;
                return g;
            }
        }
        if (K >= 0 && K <= D()) {
            byte[] bArr = new byte[K];
            F(bArr, 0, K);
            return lw7.h(bArr, 0, K);
        } else if (K == 0) {
            return "";
        } else {
            if (K <= 0) {
                throw xs7.f();
            }
            throw xs7.j();
        }
    }

    @Override // com.daaw.jr7
    public final void B(int i) {
        if (this.l != i) {
            throw xs7.b();
        }
    }

    public final void C(int i) {
        if (i < 0 || i > ((this.i - this.m) - this.n) + this.o) {
            if (i >= 0) {
                throw xs7.j();
            }
            throw xs7.f();
        }
        while (i > 0) {
            if (this.p - this.n == 0) {
                E();
            }
            int min = Math.min(i, (int) (this.p - this.n));
            i -= min;
            this.n += min;
        }
    }

    public final int D() {
        return (int) (((this.i - this.m) - this.n) + this.o);
    }

    public final void E() {
        if (!this.g.hasNext()) {
            throw xs7.j();
        }
        H();
    }

    public final void F(byte[] bArr, int i, int i2) {
        if (i2 > D()) {
            if (i2 > 0) {
                throw xs7.j();
            }
            return;
        }
        int i3 = i2;
        while (i3 > 0) {
            if (this.p - this.n == 0) {
                E();
            }
            int min = Math.min(i3, (int) (this.p - this.n));
            long j = min;
            gw7.w(this.n, bArr, i2 - i3, j);
            i3 -= min;
            this.n += j;
        }
    }

    public final void G() {
        int i = this.i + this.j;
        this.i = i;
        int i2 = this.k;
        if (i <= i2) {
            this.j = 0;
            return;
        }
        int i3 = i - i2;
        this.j = i3;
        this.i = i - i3;
    }

    public final void H() {
        ByteBuffer byteBuffer = (ByteBuffer) this.g.next();
        this.h = byteBuffer;
        this.m += (int) (this.n - this.o);
        long position = byteBuffer.position();
        this.n = position;
        this.o = position;
        this.p = this.h.limit();
        long m = gw7.m(this.h);
        this.n += m;
        this.o += m;
        this.p += m;
    }

    public final byte I() {
        if (this.p - this.n == 0) {
            E();
        }
        long j = this.n;
        this.n = 1 + j;
        return gw7.i(j);
    }

    public final int J() {
        int I;
        byte I2;
        long j = this.p;
        long j2 = this.n;
        if (j - j2 >= 4) {
            this.n = 4 + j2;
            I = (gw7.i(j2) & 255) | ((gw7.i(1 + j2) & 255) << 8) | ((gw7.i(2 + j2) & 255) << 16);
            I2 = gw7.i(j2 + 3);
        } else {
            I = (I() & 255) | ((I() & 255) << 8) | ((I() & 255) << 16);
            I2 = I();
        }
        return I | ((I2 & 255) << 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (com.daaw.gw7.i(r4) >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int K() {
        /*
            r10 = this;
            long r0 = r10.n
            long r2 = r10.p
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = com.daaw.gw7.i(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.n
            long r4 = r4 + r2
            r10.n = r4
            return r0
        L1a:
            long r6 = r10.p
            long r8 = r10.n
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = com.daaw.gw7.i(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = com.daaw.gw7.i(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = com.daaw.gw7.i(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = com.daaw.gw7.i(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.daaw.gw7.i(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.daaw.gw7.i(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.daaw.gw7.i(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = com.daaw.gw7.i(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = com.daaw.gw7.i(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.n = r6
            return r0
        L8c:
            long r0 = r10.N()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.cr7.K():int");
    }

    public final long L() {
        long I;
        byte I2;
        long j = this.p;
        long j2 = this.n;
        if (j - j2 >= 8) {
            this.n = 8 + j2;
            I = (gw7.i(j2) & 255) | ((gw7.i(1 + j2) & 255) << 8) | ((gw7.i(2 + j2) & 255) << 16) | ((gw7.i(3 + j2) & 255) << 24) | ((gw7.i(4 + j2) & 255) << 32) | ((gw7.i(5 + j2) & 255) << 40) | ((gw7.i(6 + j2) & 255) << 48);
            I2 = gw7.i(j2 + 7);
        } else {
            I = (I() & 255) | ((I() & 255) << 8) | ((I() & 255) << 16) | ((I() & 255) << 24) | ((I() & 255) << 32) | ((I() & 255) << 40) | ((I() & 255) << 48);
            I2 = I();
        }
        return I | ((I2 & 255) << 56);
    }

    public final long M() {
        long i;
        long j;
        long j2;
        int i2;
        long j3 = this.n;
        if (this.p != j3) {
            long j4 = j3 + 1;
            byte i3 = gw7.i(j3);
            if (i3 >= 0) {
                this.n++;
                return i3;
            } else if (this.p - this.n >= 10) {
                long j5 = j4 + 1;
                int i4 = i3 ^ (gw7.i(j4) << 7);
                if (i4 >= 0) {
                    long j6 = j5 + 1;
                    int i5 = i4 ^ (gw7.i(j5) << 14);
                    if (i5 >= 0) {
                        i = i5 ^ 16256;
                    } else {
                        j5 = j6 + 1;
                        int i6 = i5 ^ (gw7.i(j6) << 21);
                        if (i6 < 0) {
                            i2 = i6 ^ (-2080896);
                        } else {
                            j6 = j5 + 1;
                            long i7 = i6 ^ (gw7.i(j5) << 28);
                            if (i7 < 0) {
                                long j7 = j6 + 1;
                                long i8 = i7 ^ (gw7.i(j6) << 35);
                                if (i8 < 0) {
                                    j = -34093383808L;
                                } else {
                                    j6 = j7 + 1;
                                    i7 = i8 ^ (gw7.i(j7) << 42);
                                    if (i7 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        j7 = j6 + 1;
                                        i8 = i7 ^ (gw7.i(j6) << 49);
                                        if (i8 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            j6 = j7 + 1;
                                            i = (i8 ^ (gw7.i(j7) << 56)) ^ 71499008037633920L;
                                            if (i < 0) {
                                                long j8 = 1 + j6;
                                                if (gw7.i(j6) >= 0) {
                                                    j5 = j8;
                                                    this.n = j5;
                                                    return i;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i8 ^ j;
                                j5 = j7;
                                this.n = j5;
                                return i;
                            }
                            j2 = 266354560;
                            i = i7 ^ j2;
                        }
                    }
                    j5 = j6;
                    this.n = j5;
                    return i;
                }
                i2 = i4 ^ (-128);
                i = i2;
                this.n = j5;
                return i;
            }
        }
        return N();
    }

    public final long N() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte I = I();
            j |= (I & Byte.MAX_VALUE) << i;
            if ((I & 128) == 0) {
                return j;
            }
        }
        throw xs7.e();
    }

    @Override // com.daaw.jr7
    public final void a(int i) {
        this.k = i;
        G();
    }

    @Override // com.daaw.jr7
    public final boolean b() {
        return (((long) this.m) + this.n) - this.o == ((long) this.i);
    }

    @Override // com.daaw.jr7
    public final boolean c() {
        return M() != 0;
    }

    @Override // com.daaw.jr7
    public final boolean d(int i) {
        int r;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (I() >= 0) {
                    return true;
                }
            }
            throw xs7.e();
        } else if (i2 == 1) {
            C(8);
            return true;
        } else if (i2 == 2) {
            C(K());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    C(4);
                    return true;
                }
                throw xs7.a();
            }
            return false;
        } else {
            do {
                r = r();
                if (r == 0) {
                    break;
                }
            } while (d(r));
            B(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    @Override // com.daaw.jr7
    public final double i() {
        return Double.longBitsToDouble(L());
    }

    @Override // com.daaw.jr7
    public final float j() {
        return Float.intBitsToFloat(J());
    }

    @Override // com.daaw.jr7
    public final int k() {
        return (int) ((this.m + this.n) - this.o);
    }

    @Override // com.daaw.jr7
    public final int l(int i) {
        if (i >= 0) {
            int k = i + k();
            int i2 = this.k;
            if (k <= i2) {
                this.k = k;
                G();
                return i2;
            }
            throw xs7.j();
        }
        throw xs7.f();
    }

    @Override // com.daaw.jr7
    public final int m() {
        return K();
    }

    @Override // com.daaw.jr7
    public final int n() {
        return J();
    }

    @Override // com.daaw.jr7
    public final int o() {
        return K();
    }

    @Override // com.daaw.jr7
    public final int p() {
        return J();
    }

    @Override // com.daaw.jr7
    public final int q() {
        return jr7.e(K());
    }

    @Override // com.daaw.jr7
    public final int r() {
        if (b()) {
            this.l = 0;
            return 0;
        }
        int K = K();
        this.l = K;
        if ((K >>> 3) != 0) {
            return K;
        }
        throw xs7.c();
    }

    @Override // com.daaw.jr7
    public final int s() {
        return K();
    }

    @Override // com.daaw.jr7
    public final long t() {
        return L();
    }

    @Override // com.daaw.jr7
    public final long u() {
        return M();
    }

    @Override // com.daaw.jr7
    public final long v() {
        return L();
    }

    @Override // com.daaw.jr7
    public final long w() {
        return jr7.f(M());
    }

    @Override // com.daaw.jr7
    public final long x() {
        return M();
    }

    @Override // com.daaw.jr7
    public final yq7 y() {
        int K = K();
        if (K > 0) {
            long j = K;
            long j2 = this.p;
            long j3 = this.n;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[K];
                gw7.w(j3, bArr, 0L, j);
                this.n += j;
                return yq7.J(bArr);
            }
        }
        if (K > 0 && K <= D()) {
            byte[] bArr2 = new byte[K];
            F(bArr2, 0, K);
            return yq7.J(bArr2);
        } else if (K == 0) {
            return yq7.q;
        } else {
            if (K < 0) {
                throw xs7.f();
            }
            throw xs7.j();
        }
    }

    @Override // com.daaw.jr7
    public final String z() {
        int K = K();
        if (K > 0) {
            long j = K;
            long j2 = this.p;
            long j3 = this.n;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[K];
                gw7.w(j3, bArr, 0L, j);
                String str = new String(bArr, vs7.b);
                this.n += j;
                return str;
            }
        }
        if (K > 0 && K <= D()) {
            byte[] bArr2 = new byte[K];
            F(bArr2, 0, K);
            return new String(bArr2, vs7.b);
        } else if (K == 0) {
            return "";
        } else {
            if (K < 0) {
                throw xs7.f();
            }
            throw xs7.j();
        }
    }
}
