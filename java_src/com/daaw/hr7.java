package com.daaw;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class hr7 extends jr7 {

    /* renamed from: f */
    public final InputStream f12884f;

    /* renamed from: g */
    public final byte[] f12885g;

    /* renamed from: h */
    public int f12886h;

    /* renamed from: i */
    public int f12887i;

    /* renamed from: j */
    public int f12888j;

    /* renamed from: k */
    public int f12889k;

    /* renamed from: l */
    public int f12890l;

    /* renamed from: m */
    public int f12891m;

    public /* synthetic */ hr7(InputStream inputStream, int i, gr7 gr7Var) {
        super(null);
        this.f12891m = Integer.MAX_VALUE;
        vs7.m6815f(inputStream, "input");
        this.f12884f = inputStream;
        this.f12885g = new byte[4096];
        this.f12886h = 0;
        this.f12888j = 0;
        this.f12890l = 0;
    }

    @Override // com.daaw.jr7
    /* renamed from: A */
    public final String mo18307A() {
        byte[] m20452H;
        int m20448L = m20448L();
        int i = this.f12888j;
        int i2 = this.f12886h;
        if (m20448L <= i2 - i && m20448L > 0) {
            m20452H = this.f12885g;
            this.f12888j = i + m20448L;
        } else if (m20448L == 0) {
            return "";
        } else {
            if (m20448L <= i2) {
                m20454F(m20448L);
                m20452H = this.f12885g;
                this.f12888j = m20448L;
            } else {
                m20452H = m20452H(m20448L, false);
            }
            i = 0;
        }
        return lw7.m16413h(m20452H, i, m20448L);
    }

    @Override // com.daaw.jr7
    /* renamed from: B */
    public final void mo18306B(int i) {
        if (this.f12889k != i) {
            throw xs7.m4542b();
        }
    }

    /* renamed from: C */
    public final void m20457C(int i) {
        int i2 = this.f12886h;
        int i3 = this.f12888j;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f12888j = i3 + i;
        } else if (i < 0) {
            throw xs7.m4538f();
        } else {
            int i5 = this.f12890l;
            int i6 = i5 + i3;
            int i7 = this.f12891m;
            if (i6 + i > i7) {
                m20457C((i7 - i5) - i3);
                throw xs7.m4534j();
            }
            this.f12890l = i6;
            this.f12886h = 0;
            this.f12888j = 0;
            while (i4 < i) {
                try {
                    long j = i - i4;
                    try {
                        long skip = this.f12884f.skip(j);
                        if (skip < 0 || skip > j) {
                            throw new IllegalStateException(String.valueOf(this.f12884f.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        } else if (skip == 0) {
                            break;
                        } else {
                            i4 += (int) skip;
                        }
                    } catch (xs7 e) {
                        e.m4533k();
                        throw e;
                    }
                } finally {
                    this.f12890l += i4;
                    m20455E();
                }
            }
            if (i4 >= i) {
                return;
            }
            int i8 = this.f12886h;
            int i9 = i8 - this.f12888j;
            this.f12888j = i8;
            while (true) {
                m20454F(1);
                int i10 = i - i9;
                int i11 = this.f12886h;
                if (i10 <= i11) {
                    this.f12888j = i10;
                    return;
                } else {
                    i9 += i11;
                    this.f12888j = i11;
                }
            }
        }
    }

    /* renamed from: D */
    public final List m20456D(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.f12884f.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw xs7.m4534j();
                }
                this.f12890l += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    /* renamed from: E */
    public final void m20455E() {
        int i = this.f12886h + this.f12887i;
        this.f12886h = i;
        int i2 = this.f12890l + i;
        int i3 = this.f12891m;
        if (i2 <= i3) {
            this.f12887i = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f12887i = i4;
        this.f12886h = i - i4;
    }

    /* renamed from: F */
    public final void m20454F(int i) {
        if (m20453G(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.f12890l) - this.f12888j) {
            throw xs7.m4534j();
        }
        throw xs7.m4535i();
    }

    /* renamed from: G */
    public final boolean m20453G(int i) {
        int i2 = this.f12888j;
        int i3 = this.f12886h;
        if (i2 + i <= i3) {
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }
        int i4 = this.f12890l;
        if (i <= (Integer.MAX_VALUE - i4) - i2 && i4 + i2 + i <= this.f12891m) {
            if (i2 > 0) {
                if (i3 > i2) {
                    byte[] bArr = this.f12885g;
                    System.arraycopy(bArr, i2, bArr, 0, i3 - i2);
                }
                i4 = this.f12890l + i2;
                this.f12890l = i4;
                i3 = this.f12886h - i2;
                this.f12886h = i3;
                this.f12888j = 0;
            }
            try {
                int read = this.f12884f.read(this.f12885g, i3, Math.min(4096 - i3, (Integer.MAX_VALUE - i4) - i3));
                if (read == 0 || read < -1 || read > 4096) {
                    throw new IllegalStateException(String.valueOf(this.f12884f.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read > 0) {
                    this.f12886h += read;
                    m20455E();
                    if (this.f12886h >= i) {
                        return true;
                    }
                    return m20453G(i);
                } else {
                    return false;
                }
            } catch (xs7 e) {
                e.m4533k();
                throw e;
            }
        }
        return false;
    }

    /* renamed from: H */
    public final byte[] m20452H(int i, boolean z) {
        byte[] m20451I = m20451I(i);
        if (m20451I != null) {
            return m20451I;
        }
        int i2 = this.f12888j;
        int i3 = this.f12886h;
        int i4 = i3 - i2;
        this.f12890l += i3;
        this.f12888j = 0;
        this.f12886h = 0;
        List<byte[]> m20456D = m20456D(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f12885g, i2, bArr, 0, i4);
        for (byte[] bArr2 : m20456D) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i4, length);
            i4 += length;
        }
        return bArr;
    }

    /* renamed from: I */
    public final byte[] m20451I(int i) {
        if (i == 0) {
            return vs7.f30560d;
        }
        if (i >= 0) {
            int i2 = this.f12890l;
            int i3 = this.f12888j;
            int i4 = i2 + i3 + i;
            if ((-2147483647) + i4 <= 0) {
                int i5 = this.f12891m;
                if (i4 > i5) {
                    m20457C((i5 - i2) - i3);
                    throw xs7.m4534j();
                }
                int i6 = this.f12886h - i3;
                int i7 = i - i6;
                if (i7 >= 4096) {
                    try {
                        if (i7 > this.f12884f.available()) {
                            return null;
                        }
                    } catch (xs7 e) {
                        e.m4533k();
                        throw e;
                    }
                }
                byte[] bArr = new byte[i];
                System.arraycopy(this.f12885g, this.f12888j, bArr, 0, i6);
                this.f12890l += this.f12886h;
                this.f12888j = 0;
                this.f12886h = 0;
                while (i6 < i) {
                    try {
                        int read = this.f12884f.read(bArr, i6, i - i6);
                        if (read == -1) {
                            throw xs7.m4534j();
                        }
                        this.f12890l += read;
                        i6 += read;
                    } catch (xs7 e2) {
                        e2.m4533k();
                        throw e2;
                    }
                }
                return bArr;
            }
            throw xs7.m4535i();
        }
        throw xs7.m4538f();
    }

    /* renamed from: J */
    public final byte m20450J() {
        if (this.f12888j == this.f12886h) {
            m20454F(1);
        }
        byte[] bArr = this.f12885g;
        int i = this.f12888j;
        this.f12888j = i + 1;
        return bArr[i];
    }

    /* renamed from: K */
    public final int m20449K() {
        int i = this.f12888j;
        if (this.f12886h - i < 4) {
            m20454F(4);
            i = this.f12888j;
        }
        byte[] bArr = this.f12885g;
        this.f12888j = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m20448L() {
        int i;
        int i2 = this.f12888j;
        int i3 = this.f12886h;
        if (i3 != i2) {
            byte[] bArr = this.f12885g;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f12888j = i4;
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
                this.f12888j = i5;
                return i;
            }
        }
        return (int) m20445O();
    }

    /* renamed from: M */
    public final long m20447M() {
        int i = this.f12888j;
        if (this.f12886h - i < 8) {
            m20454F(8);
            i = this.f12888j;
        }
        byte[] bArr = this.f12885g;
        this.f12888j = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: N */
    public final long m20446N() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.f12888j;
        int i3 = this.f12886h;
        if (i3 != i2) {
            byte[] bArr = this.f12885g;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f12888j = i4;
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
                                                    this.f12888j = i5;
                                                    return j2;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i10;
                                this.f12888j = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j = j5 ^ j4;
                        }
                    }
                    i5 = i7;
                    j2 = j;
                    this.f12888j = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.f12888j = i5;
                return j2;
            }
        }
        return m20445O();
    }

    /* renamed from: O */
    public final long m20445O() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte m20450J = m20450J();
            j |= (m20450J & Byte.MAX_VALUE) << i;
            if ((m20450J & 128) == 0) {
                return j;
            }
        }
        throw xs7.m4539e();
    }

    @Override // com.daaw.jr7
    /* renamed from: a */
    public final void mo18305a(int i) {
        this.f12891m = i;
        m20455E();
    }

    @Override // com.daaw.jr7
    /* renamed from: b */
    public final boolean mo18304b() {
        return this.f12888j == this.f12886h && !m20453G(1);
    }

    @Override // com.daaw.jr7
    /* renamed from: c */
    public final boolean mo18303c() {
        return m20446N() != 0;
    }

    @Override // com.daaw.jr7
    /* renamed from: d */
    public final boolean mo18302d(int i) {
        int mo18288r;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f12886h - this.f12888j < 10) {
                while (i3 < 10) {
                    if (m20450J() < 0) {
                        i3++;
                    }
                }
                throw xs7.m4539e();
            }
            while (i3 < 10) {
                byte[] bArr = this.f12885g;
                int i4 = this.f12888j;
                this.f12888j = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw xs7.m4539e();
            return true;
        } else if (i2 == 1) {
            m20457C(8);
            return true;
        } else if (i2 == 2) {
            m20457C(m20448L());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    m20457C(4);
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
        return Double.longBitsToDouble(m20447M());
    }

    @Override // com.daaw.jr7
    /* renamed from: j */
    public final float mo18296j() {
        return Float.intBitsToFloat(m20449K());
    }

    @Override // com.daaw.jr7
    /* renamed from: k */
    public final int mo18295k() {
        return this.f12890l + this.f12888j;
    }

    @Override // com.daaw.jr7
    /* renamed from: l */
    public final int mo18294l(int i) {
        if (i >= 0) {
            int i2 = i + this.f12890l + this.f12888j;
            int i3 = this.f12891m;
            if (i2 <= i3) {
                this.f12891m = i2;
                m20455E();
                return i3;
            }
            throw xs7.m4534j();
        }
        throw xs7.m4538f();
    }

    @Override // com.daaw.jr7
    /* renamed from: m */
    public final int mo18293m() {
        return m20448L();
    }

    @Override // com.daaw.jr7
    /* renamed from: n */
    public final int mo18292n() {
        return m20449K();
    }

    @Override // com.daaw.jr7
    /* renamed from: o */
    public final int mo18291o() {
        return m20448L();
    }

    @Override // com.daaw.jr7
    /* renamed from: p */
    public final int mo18290p() {
        return m20449K();
    }

    @Override // com.daaw.jr7
    /* renamed from: q */
    public final int mo18289q() {
        return jr7.m18301e(m20448L());
    }

    @Override // com.daaw.jr7
    /* renamed from: r */
    public final int mo18288r() {
        if (mo18304b()) {
            this.f12889k = 0;
            return 0;
        }
        int m20448L = m20448L();
        this.f12889k = m20448L;
        if ((m20448L >>> 3) != 0) {
            return m20448L;
        }
        throw xs7.m4541c();
    }

    @Override // com.daaw.jr7
    /* renamed from: s */
    public final int mo18287s() {
        return m20448L();
    }

    @Override // com.daaw.jr7
    /* renamed from: t */
    public final long mo18286t() {
        return m20447M();
    }

    @Override // com.daaw.jr7
    /* renamed from: u */
    public final long mo18285u() {
        return m20446N();
    }

    @Override // com.daaw.jr7
    /* renamed from: v */
    public final long mo18284v() {
        return m20447M();
    }

    @Override // com.daaw.jr7
    /* renamed from: w */
    public final long mo18283w() {
        return jr7.m18300f(m20446N());
    }

    @Override // com.daaw.jr7
    /* renamed from: x */
    public final long mo18282x() {
        return m20446N();
    }

    @Override // com.daaw.jr7
    /* renamed from: y */
    public final yq7 mo18281y() {
        int m20448L = m20448L();
        int i = this.f12886h;
        int i2 = this.f12888j;
        if (m20448L <= i - i2 && m20448L > 0) {
            yq7 m3423G = yq7.m3423G(this.f12885g, i2, m20448L);
            this.f12888j += m20448L;
            return m3423G;
        } else if (m20448L != 0) {
            byte[] m20451I = m20451I(m20448L);
            if (m20451I != null) {
                return yq7.m3424F(m20451I);
            }
            int i3 = this.f12888j;
            int i4 = this.f12886h;
            int i5 = i4 - i3;
            this.f12890l += i4;
            this.f12888j = 0;
            this.f12886h = 0;
            List<byte[]> m20456D = m20456D(m20448L - i5);
            byte[] bArr = new byte[m20448L];
            System.arraycopy(this.f12885g, i3, bArr, 0, i5);
            for (byte[] bArr2 : m20456D) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i5, length);
                i5 += length;
            }
            return yq7.m3420J(bArr);
        } else {
            return yq7.f33966q;
        }
    }

    @Override // com.daaw.jr7
    /* renamed from: z */
    public final String mo18280z() {
        int m20448L = m20448L();
        if (m20448L > 0) {
            int i = this.f12886h;
            int i2 = this.f12888j;
            if (m20448L <= i - i2) {
                String str = new String(this.f12885g, i2, m20448L, vs7.f30558b);
                this.f12888j += m20448L;
                return str;
            }
        }
        if (m20448L == 0) {
            return "";
        }
        if (m20448L <= this.f12886h) {
            m20454F(m20448L);
            String str2 = new String(this.f12885g, this.f12888j, m20448L, vs7.f30558b);
            this.f12888j += m20448L;
            return str2;
        }
        return new String(m20452H(m20448L, false), vs7.f30558b);
    }
}
