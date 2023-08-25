package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class ar7 extends jr7 {
    public final byte[] f;
    public int g;
    public int h;
    public int i;
    public final int j;
    public int k;
    public int l;

    public /* synthetic */ ar7(byte[] bArr, int i, int i2, boolean z, zq7 zq7Var) {
        super(null);
        this.l = Integer.MAX_VALUE;
        this.f = bArr;
        this.g = i2 + i;
        this.i = i;
        this.j = i;
    }

    @Override // com.daaw.jr7
    public final String A() {
        int G = G();
        if (G > 0) {
            int i = this.g;
            int i2 = this.i;
            if (G <= i - i2) {
                String h = lw7.h(this.f, i2, G);
                this.i += G;
                return h;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G <= 0) {
            throw xs7.f();
        }
        throw xs7.j();
    }

    @Override // com.daaw.jr7
    public final void B(int i) {
        if (this.k != i) {
            throw xs7.b();
        }
    }

    public final void C(int i) {
        if (i >= 0) {
            int i2 = this.g;
            int i3 = this.i;
            if (i <= i2 - i3) {
                this.i = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw xs7.j();
        }
        throw xs7.f();
    }

    public final void D() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = i - this.j;
        int i3 = this.l;
        if (i2 <= i3) {
            this.h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.h = i4;
        this.g = i - i4;
    }

    public final byte E() {
        int i = this.i;
        if (i != this.g) {
            byte[] bArr = this.f;
            this.i = i + 1;
            return bArr[i];
        }
        throw xs7.j();
    }

    public final int F() {
        int i = this.i;
        if (this.g - i >= 4) {
            byte[] bArr = this.f;
            this.i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw xs7.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int G() {
        /*
            r5 = this;
            int r0 = r5.i
            int r1 = r5.g
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.i = r3
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
            r5.i = r1
            return r0
        L6c:
            long r0 = r5.J()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ar7.G():int");
    }

    public final long H() {
        int i = this.i;
        if (this.g - i >= 8) {
            byte[] bArr = this.f;
            this.i = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw xs7.j();
    }

    public final long I() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.i;
        int i3 = this.g;
        if (i3 != i2) {
            byte[] bArr = this.f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.i = i4;
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
                                                    this.i = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.i = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.i = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.i = i5;
                return j2;
            }
        }
        return J();
    }

    public final long J() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte E = E();
            j |= (E & Byte.MAX_VALUE) << i;
            if ((E & 128) == 0) {
                return j;
            }
        }
        throw xs7.e();
    }

    @Override // com.daaw.jr7
    public final void a(int i) {
        this.l = i;
        D();
    }

    @Override // com.daaw.jr7
    public final boolean b() {
        return this.i == this.g;
    }

    @Override // com.daaw.jr7
    public final boolean c() {
        return I() != 0;
    }

    @Override // com.daaw.jr7
    public final boolean d(int i) {
        int r;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.g - this.i < 10) {
                while (i3 < 10) {
                    if (E() < 0) {
                        i3++;
                    }
                }
                throw xs7.e();
            }
            while (i3 < 10) {
                byte[] bArr = this.f;
                int i4 = this.i;
                this.i = i4 + 1;
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
            C(G());
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
        return Double.longBitsToDouble(H());
    }

    @Override // com.daaw.jr7
    public final float j() {
        return Float.intBitsToFloat(F());
    }

    @Override // com.daaw.jr7
    public final int k() {
        return this.i - this.j;
    }

    @Override // com.daaw.jr7
    public final int l(int i) {
        if (i >= 0) {
            int i2 = i + (this.i - this.j);
            if (i2 >= 0) {
                int i3 = this.l;
                if (i2 <= i3) {
                    this.l = i2;
                    D();
                    return i3;
                }
                throw xs7.j();
            }
            throw xs7.g();
        }
        throw xs7.f();
    }

    @Override // com.daaw.jr7
    public final int m() {
        return G();
    }

    @Override // com.daaw.jr7
    public final int n() {
        return F();
    }

    @Override // com.daaw.jr7
    public final int o() {
        return G();
    }

    @Override // com.daaw.jr7
    public final int p() {
        return F();
    }

    @Override // com.daaw.jr7
    public final int q() {
        return jr7.e(G());
    }

    @Override // com.daaw.jr7
    public final int r() {
        if (b()) {
            this.k = 0;
            return 0;
        }
        int G = G();
        this.k = G;
        if ((G >>> 3) != 0) {
            return G;
        }
        throw xs7.c();
    }

    @Override // com.daaw.jr7
    public final int s() {
        return G();
    }

    @Override // com.daaw.jr7
    public final long t() {
        return H();
    }

    @Override // com.daaw.jr7
    public final long u() {
        return I();
    }

    @Override // com.daaw.jr7
    public final long v() {
        return H();
    }

    @Override // com.daaw.jr7
    public final long w() {
        return jr7.f(I());
    }

    @Override // com.daaw.jr7
    public final long x() {
        return I();
    }

    @Override // com.daaw.jr7
    public final yq7 y() {
        int G = G();
        if (G > 0) {
            int i = this.g;
            int i2 = this.i;
            if (G <= i - i2) {
                yq7 G2 = yq7.G(this.f, i2, G);
                this.i += G;
                return G2;
            }
        }
        if (G != 0) {
            if (G > 0) {
                int i3 = this.g;
                int i4 = this.i;
                if (G <= i3 - i4) {
                    int i5 = G + i4;
                    this.i = i5;
                    return yq7.J(Arrays.copyOfRange(this.f, i4, i5));
                }
            }
            if (G <= 0) {
                throw xs7.f();
            }
            throw xs7.j();
        }
        return yq7.q;
    }

    @Override // com.daaw.jr7
    public final String z() {
        int G = G();
        if (G > 0) {
            int i = this.g;
            int i2 = this.i;
            if (G <= i - i2) {
                String str = new String(this.f, i2, G, vs7.b);
                this.i += G;
                return str;
            }
        }
        if (G == 0) {
            return "";
        }
        if (G < 0) {
            throw xs7.f();
        }
        throw xs7.j();
    }
}
