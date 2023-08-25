package com.daaw;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class hr7 extends jr7 {
    public final InputStream f;
    public final byte[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;

    public /* synthetic */ hr7(InputStream inputStream, int i, gr7 gr7Var) {
        super(null);
        this.m = Integer.MAX_VALUE;
        vs7.f(inputStream, "input");
        this.f = inputStream;
        this.g = new byte[4096];
        this.h = 0;
        this.j = 0;
        this.l = 0;
    }

    @Override // com.daaw.jr7
    public final String A() {
        byte[] H;
        int L = L();
        int i = this.j;
        int i2 = this.h;
        if (L <= i2 - i && L > 0) {
            H = this.g;
            this.j = i + L;
        } else if (L == 0) {
            return "";
        } else {
            if (L <= i2) {
                F(L);
                H = this.g;
                this.j = L;
            } else {
                H = H(L, false);
            }
            i = 0;
        }
        return lw7.h(H, i, L);
    }

    @Override // com.daaw.jr7
    public final void B(int i) {
        if (this.k != i) {
            throw xs7.b();
        }
    }

    public final void C(int i) {
        int i2 = this.h;
        int i3 = this.j;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.j = i3 + i;
        } else if (i < 0) {
            throw xs7.f();
        } else {
            int i5 = this.l;
            int i6 = i5 + i3;
            int i7 = this.m;
            if (i6 + i > i7) {
                C((i7 - i5) - i3);
                throw xs7.j();
            }
            this.l = i6;
            this.h = 0;
            this.j = 0;
            while (i4 < i) {
                try {
                    long j = i - i4;
                    try {
                        long skip = this.f.skip(j);
                        if (skip < 0 || skip > j) {
                            throw new IllegalStateException(String.valueOf(this.f.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        } else if (skip == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } catch (xs7 e) {
                        e.k();
                        throw e;
                    }
                } finally {
                    this.l += i4;
                    E();
                }
            }
            if (i4 >= i) {
                return;
            }
            int i8 = this.h;
            int i9 = i8 - this.j;
            this.j = i8;
            while (true) {
                F(1);
                int i10 = i - i9;
                int i11 = this.h;
                if (i10 <= i11) {
                    this.j = i10;
                    return;
                } else {
                    i9 += i11;
                    this.j = i11;
                }
            }
        }
    }

    public final List D(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw xs7.j();
                }
                this.l += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void E() {
        int i = this.h + this.i;
        this.h = i;
        int i2 = this.l + i;
        int i3 = this.m;
        if (i2 <= i3) {
            this.i = 0;
            return;
        }
        int i4 = i2 - i3;
        this.i = i4;
        this.h = i - i4;
    }

    public final void F(int i) {
        if (G(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.l) - this.j) {
            throw xs7.j();
        }
        throw xs7.i();
    }

    public final boolean G(int i) {
        int i2 = this.j;
        int i3 = this.h;
        if (i2 + i <= i3) {
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }
        int i4 = this.l;
        if (i <= (Integer.MAX_VALUE - i4) - i2 && i4 + i2 + i <= this.m) {
            if (i2 > 0) {
                if (i3 > i2) {
                    byte[] bArr = this.g;
                    System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                }
                i4 = this.l + i2;
                this.l = i4;
                i3 = this.h - i2;
                this.h = i3;
                this.j = 0;
            }
            try {
                int read = this.f.read(this.g, i3, Math.min(4096 - i3, (Integer.MAX_VALUE - i4) - i3));
                if (read == 0 || read < -1 || read > 4096) {
                    throw new IllegalStateException(String.valueOf(this.f.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read > 0) {
                    this.h += read;
                    E();
                    if (this.h >= i) {
                        return true;
                    }
                    return G(i);
                } else {
                    return false;
                }
            } catch (xs7 e) {
                e.k();
                throw e;
            }
        }
        return false;
    }

    public final byte[] H(int i, boolean z) {
        byte[] I = I(i);
        if (I != null) {
            return I;
        }
        int i2 = this.j;
        int i3 = this.h;
        int i4 = i3 - i2;
        this.l += i3;
        this.j = 0;
        this.h = 0;
        List<byte[]> D = D(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.g, i2, bArr, 0, i4);
        for (byte[] bArr2 : D) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    public final byte[] I(int i) {
        if (i == 0) {
            return vs7.d;
        }
        if (i >= 0) {
            int i2 = this.l;
            int i3 = this.j;
            int i4 = i2 + i3 + i;
            if ((-2147483647) + i4 <= 0) {
                int i5 = this.m;
                if (i4 > i5) {
                    C((i5 - i2) - i3);
                    throw xs7.j();
                }
                int i6 = this.h - i3;
                int i7 = i - i6;
                if (i7 >= 4096) {
                    try {
                        if (i7 > this.f.available()) {
                            return null;
                        }
                    } catch (xs7 e) {
                        e.k();
                        throw e;
                    }
                }
                byte[] bArr = new byte[i];
                System.arraycopy(this.g, this.j, bArr, 0, i6);
                this.l += this.h;
                this.j = 0;
                this.h = 0;
                while (i6 < i) {
                    try {
                        int read = this.f.read(bArr, i6, i - i6);
                        if (read == -1) {
                            throw xs7.j();
                        }
                        this.l += read;
                        i6 += read;
                    } catch (xs7 e2) {
                        e2.k();
                        throw e2;
                    }
                }
                return bArr;
            }
            throw xs7.i();
        }
        throw xs7.f();
    }

    public final byte J() {
        if (this.j == this.h) {
            F(1);
        }
        byte[] bArr = this.g;
        int i = this.j;
        this.j = i + 1;
        return bArr[i];
    }

    public final int K() {
        int i = this.j;
        if (this.h - i < 4) {
            F(4);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int L() {
        /*
            r5 = this;
            int r0 = r5.j
            int r1 = r5.h
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.g
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.j = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.j = r1
            return r0
        L6c:
            long r0 = r5.O()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.hr7.L():int");
    }

    public final long M() {
        int i = this.j;
        if (this.h - i < 8) {
            F(8);
            i = this.j;
        }
        byte[] bArr = this.g;
        this.j = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public final long N() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.j;
        int i3 = this.h;
        if (i3 != i2) {
            byte[] bArr = this.g;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.j = i4;
                return b;
            } else if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            long j5 = (bArr[i5] << 28) ^ i9;
                            if (j5 < 0) {
                                int i10 = i7 + 1;
                                long j6 = j5 ^ (bArr[i7] << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i7 = i10 + 1;
                                    j5 = j6 ^ (bArr[i10] << 42);
                                    if (j5 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i10 = i7 + 1;
                                        j6 = j5 ^ (bArr[i7] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i7 = i10 + 1;
                                            j = (j6 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i10 = i7 + 1;
                                                if (bArr[i7] >= 0) {
                                                    j2 = j;
                                                    i5 = i10;
                                                    this.j = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.j = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.j = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.j = i5;
                return j2;
            }
        }
        return O();
    }

    public final long O() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte J = J();
            j |= (J & Byte.MAX_VALUE) << i;
            if ((J & 128) == 0) {
                return j;
            }
        }
        throw xs7.e();
    }

    @Override // com.daaw.jr7
    public final void a(int i) {
        this.m = i;
        E();
    }

    @Override // com.daaw.jr7
    public final boolean b() {
        return this.j == this.h && !G(1);
    }

    @Override // com.daaw.jr7
    public final boolean c() {
        return N() != 0;
    }

    @Override // com.daaw.jr7
    public final boolean d(int i) {
        int r;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.h - this.j < 10) {
                while (i3 < 10) {
                    if (J() < 0) {
                        i3++;
                    }
                }
                throw xs7.e();
            }
            while (i3 < 10) {
                byte[] bArr = this.g;
                int i4 = this.j;
                this.j = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw xs7.e();
            return true;
        } else if (i2 == 1) {
            C(8);
            return true;
        } else if (i2 == 2) {
            C(L());
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
        return Double.longBitsToDouble(M());
    }

    @Override // com.daaw.jr7
    public final float j() {
        return Float.intBitsToFloat(K());
    }

    @Override // com.daaw.jr7
    public final int k() {
        return this.l + this.j;
    }

    @Override // com.daaw.jr7
    public final int l(int i) {
        if (i >= 0) {
            int i2 = i + this.l + this.j;
            int i3 = this.m;
            if (i2 <= i3) {
                this.m = i2;
                E();
                return i3;
            }
            throw xs7.j();
        }
        throw xs7.f();
    }

    @Override // com.daaw.jr7
    public final int m() {
        return L();
    }

    @Override // com.daaw.jr7
    public final int n() {
        return K();
    }

    @Override // com.daaw.jr7
    public final int o() {
        return L();
    }

    @Override // com.daaw.jr7
    public final int p() {
        return K();
    }

    @Override // com.daaw.jr7
    public final int q() {
        return jr7.e(L());
    }

    @Override // com.daaw.jr7
    public final int r() {
        if (b()) {
            this.k = 0;
            return 0;
        }
        int L = L();
        this.k = L;
        if ((L >>> 3) != 0) {
            return L;
        }
        throw xs7.c();
    }

    @Override // com.daaw.jr7
    public final int s() {
        return L();
    }

    @Override // com.daaw.jr7
    public final long t() {
        return M();
    }

    @Override // com.daaw.jr7
    public final long u() {
        return N();
    }

    @Override // com.daaw.jr7
    public final long v() {
        return M();
    }

    @Override // com.daaw.jr7
    public final long w() {
        return jr7.f(N());
    }

    @Override // com.daaw.jr7
    public final long x() {
        return N();
    }

    @Override // com.daaw.jr7
    public final yq7 y() {
        int L = L();
        int i = this.h;
        int i2 = this.j;
        if (L <= i - i2 && L > 0) {
            yq7 G = yq7.G(this.g, i2, L);
            this.j += L;
            return G;
        } else if (L != 0) {
            byte[] I = I(L);
            if (I != null) {
                return yq7.F(I);
            }
            int i3 = this.j;
            int i4 = this.h;
            int i5 = i4 - i3;
            this.l += i4;
            this.j = 0;
            this.h = 0;
            List<byte[]> D = D(L - i5);
            byte[] bArr = new byte[L];
            System.arraycopy(this.g, i3, bArr, 0, i5);
            for (byte[] bArr2 : D) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i5, length);
                i5 += length;
            }
            return yq7.J(bArr);
        } else {
            return yq7.q;
        }
    }

    @Override // com.daaw.jr7
    public final String z() {
        int L = L();
        if (L > 0) {
            int i = this.h;
            int i2 = this.j;
            if (L <= i - i2) {
                String str = new String(this.g, i2, L, vs7.b);
                this.j += L;
                return str;
            }
        }
        if (L == 0) {
            return "";
        }
        if (L <= this.h) {
            F(L);
            String str2 = new String(this.g, this.j, L, vs7.b);
            this.j += L;
            return str2;
        }
        return new String(H(L, false), vs7.b);
    }
}
