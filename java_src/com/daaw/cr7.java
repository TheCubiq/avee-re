package com.daaw;

import java.nio.ByteBuffer;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class cr7 extends jr7 {

    /* renamed from: f */
    public final Iterable f6115f;

    /* renamed from: g */
    public final Iterator f6116g;

    /* renamed from: h */
    public ByteBuffer f6117h;

    /* renamed from: i */
    public int f6118i;

    /* renamed from: j */
    public int f6119j;

    /* renamed from: k */
    public int f6120k;

    /* renamed from: l */
    public int f6121l;

    /* renamed from: m */
    public int f6122m;

    /* renamed from: n */
    public long f6123n;

    /* renamed from: o */
    public long f6124o;

    /* renamed from: p */
    public long f6125p;

    public /* synthetic */ cr7(Iterable iterable, int i, boolean z, br7 br7Var) {
        super(null);
        this.f6120k = Integer.MAX_VALUE;
        this.f6118i = i;
        this.f6115f = iterable;
        this.f6116g = iterable.iterator();
        this.f6122m = 0;
        if (i != 0) {
            m25045H();
            return;
        }
        this.f6117h = vs7.f30561e;
        this.f6123n = 0L;
        this.f6124o = 0L;
        this.f6125p = 0L;
    }

    @Override // com.daaw.jr7
    /* renamed from: A */
    public final String mo18307A() {
        int m25042K = m25042K();
        if (m25042K > 0) {
            long j = m25042K;
            long j2 = this.f6125p;
            long j3 = this.f6123n;
            if (j <= j2 - j3) {
                String m16414g = lw7.m16414g(this.f6117h, (int) (j3 - this.f6124o), m25042K);
                this.f6123n += j;
                return m16414g;
            }
        }
        if (m25042K >= 0 && m25042K <= m25049D()) {
            byte[] bArr = new byte[m25042K];
            m25047F(bArr, 0, m25042K);
            return lw7.m16413h(bArr, 0, m25042K);
        } else if (m25042K == 0) {
            return "";
        } else {
            if (m25042K <= 0) {
                throw xs7.m4538f();
            }
            throw xs7.m4534j();
        }
    }

    @Override // com.daaw.jr7
    /* renamed from: B */
    public final void mo18306B(int i) {
        if (this.f6121l != i) {
            throw xs7.m4542b();
        }
    }

    /* renamed from: C */
    public final void m25050C(int i) {
        if (i < 0 || i > ((this.f6118i - this.f6122m) - this.f6123n) + this.f6124o) {
            if (i >= 0) {
                throw xs7.m4534j();
            }
            throw xs7.m4538f();
        }
        while (i > 0) {
            if (this.f6125p - this.f6123n == 0) {
                m25048E();
            }
            int min = Math.min(i, (int) (this.f6125p - this.f6123n));
            i -= min;
            this.f6123n += min;
        }
    }

    /* renamed from: D */
    public final int m25049D() {
        return (int) (((this.f6118i - this.f6122m) - this.f6123n) + this.f6124o);
    }

    /* renamed from: E */
    public final void m25048E() {
        if (!this.f6116g.hasNext()) {
            throw xs7.m4534j();
        }
        m25045H();
    }

    /* renamed from: F */
    public final void m25047F(byte[] bArr, int i, int i2) {
        if (i2 > m25049D()) {
            if (i2 > 0) {
                throw xs7.m4534j();
            }
            return;
        }
        int i3 = i2;
        while (i3 > 0) {
            if (this.f6125p - this.f6123n == 0) {
                m25048E();
            }
            int min = Math.min(i3, (int) (this.f6125p - this.f6123n));
            long j = min;
            gw7.m21163w(this.f6123n, bArr, i2 - i3, j);
            i3 -= min;
            this.f6123n += j;
        }
    }

    /* renamed from: G */
    public final void m25046G() {
        int i = this.f6118i + this.f6119j;
        this.f6118i = i;
        int i2 = this.f6120k;
        if (i <= i2) {
            this.f6119j = 0;
            return;
        }
        int i3 = i - i2;
        this.f6119j = i3;
        this.f6118i = i - i3;
    }

    /* renamed from: H */
    public final void m25045H() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f6116g.next();
        this.f6117h = byteBuffer;
        this.f6122m += (int) (this.f6123n - this.f6124o);
        long position = byteBuffer.position();
        this.f6123n = position;
        this.f6124o = position;
        this.f6125p = this.f6117h.limit();
        long m21173m = gw7.m21173m(this.f6117h);
        this.f6123n += m21173m;
        this.f6124o += m21173m;
        this.f6125p += m21173m;
    }

    /* renamed from: I */
    public final byte m25044I() {
        if (this.f6125p - this.f6123n == 0) {
            m25048E();
        }
        long j = this.f6123n;
        this.f6123n = 1 + j;
        return gw7.m21177i(j);
    }

    /* renamed from: J */
    public final int m25043J() {
        int m25044I;
        byte m25044I2;
        long j = this.f6125p;
        long j2 = this.f6123n;
        if (j - j2 >= 4) {
            this.f6123n = 4 + j2;
            m25044I = (gw7.m21177i(j2) & 255) | ((gw7.m21177i(1 + j2) & 255) << 8) | ((gw7.m21177i(2 + j2) & 255) << 16);
            m25044I2 = gw7.m21177i(j2 + 3);
        } else {
            m25044I = (m25044I() & 255) | ((m25044I() & 255) << 8) | ((m25044I() & 255) << 16);
            m25044I2 = m25044I();
        }
        return m25044I | ((m25044I2 & 255) << 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (com.daaw.gw7.m21177i(r4) >= 0) goto L13;
     */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m25042K() {
        int i;
        long j = this.f6123n;
        if (this.f6125p != j) {
            long j2 = j + 1;
            byte m21177i = gw7.m21177i(j);
            if (m21177i >= 0) {
                this.f6123n++;
                return m21177i;
            } else if (this.f6125p - this.f6123n >= 10) {
                long j3 = j2 + 1;
                int m21177i2 = m21177i ^ (gw7.m21177i(j2) << 7);
                if (m21177i2 < 0) {
                    i = m21177i2 ^ (-128);
                } else {
                    long j4 = j3 + 1;
                    int m21177i3 = m21177i2 ^ (gw7.m21177i(j3) << 14);
                    if (m21177i3 >= 0) {
                        i = m21177i3 ^ 16256;
                    } else {
                        j3 = j4 + 1;
                        int m21177i4 = m21177i3 ^ (gw7.m21177i(j4) << 21);
                        if (m21177i4 < 0) {
                            i = m21177i4 ^ (-2080896);
                        } else {
                            j4 = j3 + 1;
                            byte m21177i5 = gw7.m21177i(j3);
                            i = (m21177i4 ^ (m21177i5 << 28)) ^ 266354560;
                            if (m21177i5 < 0) {
                                j3 = j4 + 1;
                                if (gw7.m21177i(j4) < 0) {
                                    j4 = j3 + 1;
                                    if (gw7.m21177i(j3) < 0) {
                                        j3 = j4 + 1;
                                        if (gw7.m21177i(j4) < 0) {
                                            j4 = j3 + 1;
                                            if (gw7.m21177i(j3) < 0) {
                                                j3 = j4 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j3 = j4;
                }
                this.f6123n = j3;
                return i;
            }
        }
        return (int) m25039N();
    }

    /* renamed from: L */
    public final long m25041L() {
        long m25044I;
        byte m25044I2;
        long j = this.f6125p;
        long j2 = this.f6123n;
        if (j - j2 >= 8) {
            this.f6123n = 8 + j2;
            m25044I = (gw7.m21177i(j2) & 255) | ((gw7.m21177i(1 + j2) & 255) << 8) | ((gw7.m21177i(2 + j2) & 255) << 16) | ((gw7.m21177i(3 + j2) & 255) << 24) | ((gw7.m21177i(4 + j2) & 255) << 32) | ((gw7.m21177i(5 + j2) & 255) << 40) | ((gw7.m21177i(6 + j2) & 255) << 48);
            m25044I2 = gw7.m21177i(j2 + 7);
        } else {
            m25044I = (m25044I() & 255) | ((m25044I() & 255) << 8) | ((m25044I() & 255) << 16) | ((m25044I() & 255) << 24) | ((m25044I() & 255) << 32) | ((m25044I() & 255) << 40) | ((m25044I() & 255) << 48);
            m25044I2 = m25044I();
        }
        return m25044I | ((m25044I2 & 255) << 56);
    }

    /* renamed from: M */
    public final long m25040M() {
        long m21177i;
        long j;
        long j2;
        int i;
        long j3 = this.f6123n;
        if (this.f6125p != j3) {
            long j4 = j3 + 1;
            byte m21177i2 = gw7.m21177i(j3);
            if (m21177i2 >= 0) {
                this.f6123n++;
                return m21177i2;
            } else if (this.f6125p - this.f6123n >= 10) {
                long j5 = j4 + 1;
                int m21177i3 = m21177i2 ^ (gw7.m21177i(j4) << 7);
                if (m21177i3 >= 0) {
                    long j6 = j5 + 1;
                    int m21177i4 = m21177i3 ^ (gw7.m21177i(j5) << 14);
                    if (m21177i4 >= 0) {
                        m21177i = m21177i4 ^ 16256;
                    } else {
                        j5 = j6 + 1;
                        int m21177i5 = m21177i4 ^ (gw7.m21177i(j6) << 21);
                        if (m21177i5 < 0) {
                            i = m21177i5 ^ (-2080896);
                        } else {
                            j6 = j5 + 1;
                            long m21177i6 = m21177i5 ^ (gw7.m21177i(j5) << 28);
                            if (m21177i6 < 0) {
                                long j7 = j6 + 1;
                                long m21177i7 = m21177i6 ^ (gw7.m21177i(j6) << 35);
                                if (m21177i7 < 0) {
                                    j = -34093383808L;
                                } else {
                                    j6 = j7 + 1;
                                    m21177i6 = m21177i7 ^ (gw7.m21177i(j7) << 42);
                                    if (m21177i6 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        j7 = j6 + 1;
                                        m21177i7 = m21177i6 ^ (gw7.m21177i(j6) << 49);
                                        if (m21177i7 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            j6 = j7 + 1;
                                            m21177i = (m21177i7 ^ (gw7.m21177i(j7) << 56)) ^ 71499008037633920L;
                                            if (m21177i < 0) {
                                                long j8 = 1 + j6;
                                                if (gw7.m21177i(j6) >= 0) {
                                                    j5 = j8;
                                                    this.f6123n = j5;
                                                    return m21177i;
                                                }
                                            }
                                        }
                                    }
                                }
                                m21177i = m21177i7 ^ j;
                                j5 = j7;
                                this.f6123n = j5;
                                return m21177i;
                            }
                            j2 = 266354560;
                            m21177i = m21177i6 ^ j2;
                        }
                    }
                    j5 = j6;
                    this.f6123n = j5;
                    return m21177i;
                }
                i = m21177i3 ^ (-128);
                m21177i = i;
                this.f6123n = j5;
                return m21177i;
            }
        }
        return m25039N();
    }

    /* renamed from: N */
    public final long m25039N() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte m25044I = m25044I();
            j |= (m25044I & Byte.MAX_VALUE) << i;
            if ((m25044I & 128) == 0) {
                return j;
            }
        }
        throw xs7.m4539e();
    }

    @Override // com.daaw.jr7
    /* renamed from: a */
    public final void mo18305a(int i) {
        this.f6120k = i;
        m25046G();
    }

    @Override // com.daaw.jr7
    /* renamed from: b */
    public final boolean mo18304b() {
        return (((long) this.f6122m) + this.f6123n) - this.f6124o == ((long) this.f6118i);
    }

    @Override // com.daaw.jr7
    /* renamed from: c */
    public final boolean mo18303c() {
        return m25040M() != 0;
    }

    @Override // com.daaw.jr7
    /* renamed from: d */
    public final boolean mo18302d(int i) {
        int mo18288r;
        int i2 = i & 7;
        if (i2 == 0) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (m25044I() >= 0) {
                    return true;
                }
            }
            throw xs7.m4539e();
        } else if (i2 == 1) {
            m25050C(8);
            return true;
        } else if (i2 == 2) {
            m25050C(m25042K());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    m25050C(4);
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
        return Double.longBitsToDouble(m25041L());
    }

    @Override // com.daaw.jr7
    /* renamed from: j */
    public final float mo18296j() {
        return Float.intBitsToFloat(m25043J());
    }

    @Override // com.daaw.jr7
    /* renamed from: k */
    public final int mo18295k() {
        return (int) ((this.f6122m + this.f6123n) - this.f6124o);
    }

    @Override // com.daaw.jr7
    /* renamed from: l */
    public final int mo18294l(int i) {
        if (i >= 0) {
            int mo18295k = i + mo18295k();
            int i2 = this.f6120k;
            if (mo18295k <= i2) {
                this.f6120k = mo18295k;
                m25046G();
                return i2;
            }
            throw xs7.m4534j();
        }
        throw xs7.m4538f();
    }

    @Override // com.daaw.jr7
    /* renamed from: m */
    public final int mo18293m() {
        return m25042K();
    }

    @Override // com.daaw.jr7
    /* renamed from: n */
    public final int mo18292n() {
        return m25043J();
    }

    @Override // com.daaw.jr7
    /* renamed from: o */
    public final int mo18291o() {
        return m25042K();
    }

    @Override // com.daaw.jr7
    /* renamed from: p */
    public final int mo18290p() {
        return m25043J();
    }

    @Override // com.daaw.jr7
    /* renamed from: q */
    public final int mo18289q() {
        return jr7.m18301e(m25042K());
    }

    @Override // com.daaw.jr7
    /* renamed from: r */
    public final int mo18288r() {
        if (mo18304b()) {
            this.f6121l = 0;
            return 0;
        }
        int m25042K = m25042K();
        this.f6121l = m25042K;
        if ((m25042K >>> 3) != 0) {
            return m25042K;
        }
        throw xs7.m4541c();
    }

    @Override // com.daaw.jr7
    /* renamed from: s */
    public final int mo18287s() {
        return m25042K();
    }

    @Override // com.daaw.jr7
    /* renamed from: t */
    public final long mo18286t() {
        return m25041L();
    }

    @Override // com.daaw.jr7
    /* renamed from: u */
    public final long mo18285u() {
        return m25040M();
    }

    @Override // com.daaw.jr7
    /* renamed from: v */
    public final long mo18284v() {
        return m25041L();
    }

    @Override // com.daaw.jr7
    /* renamed from: w */
    public final long mo18283w() {
        return jr7.m18300f(m25040M());
    }

    @Override // com.daaw.jr7
    /* renamed from: x */
    public final long mo18282x() {
        return m25040M();
    }

    @Override // com.daaw.jr7
    /* renamed from: y */
    public final yq7 mo18281y() {
        int m25042K = m25042K();
        if (m25042K > 0) {
            long j = m25042K;
            long j2 = this.f6125p;
            long j3 = this.f6123n;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[m25042K];
                gw7.m21163w(j3, bArr, 0L, j);
                this.f6123n += j;
                return yq7.m3420J(bArr);
            }
        }
        if (m25042K > 0 && m25042K <= m25049D()) {
            byte[] bArr2 = new byte[m25042K];
            m25047F(bArr2, 0, m25042K);
            return yq7.m3420J(bArr2);
        } else if (m25042K == 0) {
            return yq7.f33966q;
        } else {
            if (m25042K < 0) {
                throw xs7.m4538f();
            }
            throw xs7.m4534j();
        }
    }

    @Override // com.daaw.jr7
    /* renamed from: z */
    public final String mo18280z() {
        int m25042K = m25042K();
        if (m25042K > 0) {
            long j = m25042K;
            long j2 = this.f6125p;
            long j3 = this.f6123n;
            if (j <= j2 - j3) {
                byte[] bArr = new byte[m25042K];
                gw7.m21163w(j3, bArr, 0L, j);
                String str = new String(bArr, vs7.f30558b);
                this.f6123n += j;
                return str;
            }
        }
        if (m25042K > 0 && m25042K <= m25049D()) {
            byte[] bArr2 = new byte[m25042K];
            m25047F(bArr2, 0, m25042K);
            return new String(bArr2, vs7.f30558b);
        } else if (m25042K == 0) {
            return "";
        } else {
            if (m25042K < 0) {
                throw xs7.m4538f();
            }
            throw xs7.m4534j();
        }
    }
}
