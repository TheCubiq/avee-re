package com.daaw;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class ar7 extends jr7 {

    /* renamed from: f */
    public final byte[] f3503f;

    /* renamed from: g */
    public int f3504g;

    /* renamed from: h */
    public int f3505h;

    /* renamed from: i */
    public int f3506i;

    /* renamed from: j */
    public final int f3507j;

    /* renamed from: k */
    public int f3508k;

    /* renamed from: l */
    public int f3509l;

    public /* synthetic */ ar7(byte[] bArr, int i, int i2, boolean z, zq7 zq7Var) {
        super(null);
        this.f3509l = Integer.MAX_VALUE;
        this.f3503f = bArr;
        this.f3504g = i2 + i;
        this.f3506i = i;
        this.f3507j = i;
    }

    @Override // com.daaw.jr7
    /* renamed from: A */
    public final String mo18307A() {
        int m27123G = m27123G();
        if (m27123G > 0) {
            int i = this.f3504g;
            int i2 = this.f3506i;
            if (m27123G <= i - i2) {
                String m16413h = lw7.m16413h(this.f3503f, i2, m27123G);
                this.f3506i += m27123G;
                return m16413h;
            }
        }
        if (m27123G == 0) {
            return "";
        }
        if (m27123G <= 0) {
            throw xs7.m4538f();
        }
        throw xs7.m4534j();
    }

    @Override // com.daaw.jr7
    /* renamed from: B */
    public final void mo18306B(int i) {
        if (this.f3508k != i) {
            throw xs7.m4542b();
        }
    }

    /* renamed from: C */
    public final void m27127C(int i) {
        if (i >= 0) {
            int i2 = this.f3504g;
            int i3 = this.f3506i;
            if (i <= i2 - i3) {
                this.f3506i = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw xs7.m4534j();
        }
        throw xs7.m4538f();
    }

    /* renamed from: D */
    public final void m27126D() {
        int i = this.f3504g + this.f3505h;
        this.f3504g = i;
        int i2 = i - this.f3507j;
        int i3 = this.f3509l;
        if (i2 <= i3) {
            this.f3505h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f3505h = i4;
        this.f3504g = i - i4;
    }

    /* renamed from: E */
    public final byte m27125E() {
        int i = this.f3506i;
        if (i != this.f3504g) {
            byte[] bArr = this.f3503f;
            this.f3506i = i + 1;
            return bArr[i];
        }
        throw xs7.m4534j();
    }

    /* renamed from: F */
    public final int m27124F() {
        int i = this.f3506i;
        if (this.f3504g - i >= 4) {
            byte[] bArr = this.f3503f;
            this.f3506i = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw xs7.m4534j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m27123G() {
        int i;
        int i2 = this.f3506i;
        int i3 = this.f3504g;
        if (i3 != i2) {
            byte[] bArr = this.f3503f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f3506i = i4;
                return b;
            } else if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            byte b2 = bArr[i5];
                            i = (i9 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5 = i7 + 1;
                                if (bArr[i7] < 0) {
                                    i7 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            i7 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i7 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i7;
                }
                this.f3506i = i5;
                return i;
            }
        }
        return (int) m27120J();
    }

    /* renamed from: H */
    public final long m27122H() {
        int i = this.f3506i;
        if (this.f3504g - i >= 8) {
            byte[] bArr = this.f3503f;
            this.f3506i = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw xs7.m4534j();
    }

    /* renamed from: I */
    public final long m27121I() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.f3506i;
        int i3 = this.f3504g;
        if (i3 != i2) {
            byte[] bArr = this.f3503f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f3506i = i4;
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
                                                    this.f3506i = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.f3506i = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.f3506i = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.f3506i = i5;
                return j2;
            }
        }
        return m27120J();
    }

    /* renamed from: J */
    public final long m27120J() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte m27125E = m27125E();
            j |= (m27125E & Byte.MAX_VALUE) << i;
            if ((m27125E & 128) == 0) {
                return j;
            }
        }
        throw xs7.m4539e();
    }

    @Override // com.daaw.jr7
    /* renamed from: a */
    public final void mo18305a(int i) {
        this.f3509l = i;
        m27126D();
    }

    @Override // com.daaw.jr7
    /* renamed from: b */
    public final boolean mo18304b() {
        return this.f3506i == this.f3504g;
    }

    @Override // com.daaw.jr7
    /* renamed from: c */
    public final boolean mo18303c() {
        return m27121I() != 0;
    }

    @Override // com.daaw.jr7
    /* renamed from: d */
    public final boolean mo18302d(int i) {
        int mo18288r;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f3504g - this.f3506i < 10) {
                while (i3 < 10) {
                    if (m27125E() < 0) {
                        i3++;
                    }
                }
                throw xs7.m4539e();
            }
            while (i3 < 10) {
                byte[] bArr = this.f3503f;
                int i4 = this.f3506i;
                this.f3506i = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw xs7.m4539e();
            return true;
        } else if (i2 == 1) {
            m27127C(8);
            return true;
        } else if (i2 == 2) {
            m27127C(m27123G());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    m27127C(4);
                    return true;
                }
                throw xs7.m4543a();
            }
            return false;
        } else {
            do {
                mo18288r = mo18288r();
                if (mo18288r == 0) {
                    break;
                }
            } while (mo18302d(mo18288r));
            mo18306B(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    @Override // com.daaw.jr7
    /* renamed from: i */
    public final double mo18297i() {
        return Double.longBitsToDouble(m27122H());
    }

    @Override // com.daaw.jr7
    /* renamed from: j */
    public final float mo18296j() {
        return Float.intBitsToFloat(m27124F());
    }

    @Override // com.daaw.jr7
    /* renamed from: k */
    public final int mo18295k() {
        return this.f3506i - this.f3507j;
    }

    @Override // com.daaw.jr7
    /* renamed from: l */
    public final int mo18294l(int i) {
        if (i >= 0) {
            int i2 = i + (this.f3506i - this.f3507j);
            if (i2 >= 0) {
                int i3 = this.f3509l;
                if (i2 <= i3) {
                    this.f3509l = i2;
                    m27126D();
                    return i3;
                }
                throw xs7.m4534j();
            }
            throw xs7.m4537g();
        }
        throw xs7.m4538f();
    }

    @Override // com.daaw.jr7
    /* renamed from: m */
    public final int mo18293m() {
        return m27123G();
    }

    @Override // com.daaw.jr7
    /* renamed from: n */
    public final int mo18292n() {
        return m27124F();
    }

    @Override // com.daaw.jr7
    /* renamed from: o */
    public final int mo18291o() {
        return m27123G();
    }

    @Override // com.daaw.jr7
    /* renamed from: p */
    public final int mo18290p() {
        return m27124F();
    }

    @Override // com.daaw.jr7
    /* renamed from: q */
    public final int mo18289q() {
        return jr7.m18301e(m27123G());
    }

    @Override // com.daaw.jr7
    /* renamed from: r */
    public final int mo18288r() {
        if (mo18304b()) {
            this.f3508k = 0;
            return 0;
        }
        int m27123G = m27123G();
        this.f3508k = m27123G;
        if ((m27123G >>> 3) != 0) {
            return m27123G;
        }
        throw xs7.m4541c();
    }

    @Override // com.daaw.jr7
    /* renamed from: s */
    public final int mo18287s() {
        return m27123G();
    }

    @Override // com.daaw.jr7
    /* renamed from: t */
    public final long mo18286t() {
        return m27122H();
    }

    @Override // com.daaw.jr7
    /* renamed from: u */
    public final long mo18285u() {
        return m27121I();
    }

    @Override // com.daaw.jr7
    /* renamed from: v */
    public final long mo18284v() {
        return m27122H();
    }

    @Override // com.daaw.jr7
    /* renamed from: w */
    public final long mo18283w() {
        return jr7.m18300f(m27121I());
    }

    @Override // com.daaw.jr7
    /* renamed from: x */
    public final long mo18282x() {
        return m27121I();
    }

    @Override // com.daaw.jr7
    /* renamed from: y */
    public final yq7 mo18281y() {
        int m27123G = m27123G();
        if (m27123G > 0) {
            int i = this.f3504g;
            int i2 = this.f3506i;
            if (m27123G <= i - i2) {
                yq7 m3423G = yq7.m3423G(this.f3503f, i2, m27123G);
                this.f3506i += m27123G;
                return m3423G;
            }
        }
        if (m27123G != 0) {
            if (m27123G > 0) {
                int i3 = this.f3504g;
                int i4 = this.f3506i;
                if (m27123G <= i3 - i4) {
                    int i5 = m27123G + i4;
                    this.f3506i = i5;
                    return yq7.m3420J(Arrays.copyOfRange(this.f3503f, i4, i5));
                }
            }
            if (m27123G <= 0) {
                throw xs7.m4538f();
            }
            throw xs7.m4534j();
        }
        return yq7.f33966q;
    }

    @Override // com.daaw.jr7
    /* renamed from: z */
    public final String mo18280z() {
        int m27123G = m27123G();
        if (m27123G > 0) {
            int i = this.f3504g;
            int i2 = this.f3506i;
            if (m27123G <= i - i2) {
                String str = new String(this.f3503f, i2, m27123G, vs7.f30558b);
                this.f3506i += m27123G;
                return str;
            }
        }
        if (m27123G == 0) {
            return "";
        }
        if (m27123G < 0) {
            throw xs7.m4538f();
        }
        throw xs7.m4534j();
    }
}
