package com.daaw;

import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class yd2 implements zd2 {

    /* renamed from: m */
    public static final int[] f33534m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n */
    public static final int[] f33535n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, p21.f22358Y0, x21.f31779E0, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, NativeConstants.EVP_PKEY_EC, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a */
    public final m09 f33536a;

    /* renamed from: b */
    public final m42 f33537b;

    /* renamed from: c */
    public final ce2 f33538c;

    /* renamed from: d */
    public final int f33539d;

    /* renamed from: e */
    public final byte[] f33540e;

    /* renamed from: f */
    public final ik5 f33541f;

    /* renamed from: g */
    public final int f33542g;

    /* renamed from: h */
    public final f92 f33543h;

    /* renamed from: i */
    public int f33544i;

    /* renamed from: j */
    public long f33545j;

    /* renamed from: k */
    public int f33546k;

    /* renamed from: l */
    public long f33547l;

    public yd2(m09 m09Var, m42 m42Var, ce2 ce2Var) {
        this.f33536a = m09Var;
        this.f33537b = m42Var;
        this.f33538c = ce2Var;
        int max = Math.max(1, ce2Var.f5755c / 10);
        this.f33542g = max;
        ik5 ik5Var = new ik5(ce2Var.f5758f);
        ik5Var.m19705q();
        int m19705q = ik5Var.m19705q();
        this.f33539d = m19705q;
        int i = ce2Var.f5754b;
        int i2 = (((ce2Var.f5756d - (i * 4)) * 8) / (ce2Var.f5757e * i)) + 1;
        if (m19705q != i2) {
            throw dl3.m24267a("Expected frames per block: " + i2 + "; got: " + m19705q, null);
        }
        int m19417O = it5.m19417O(max, m19705q);
        this.f33540e = new byte[ce2Var.f5756d * m19417O];
        this.f33541f = new ik5(m19417O * (m19705q + m19705q) * i);
        int i3 = ((ce2Var.f5755c * ce2Var.f5756d) * 8) / m19705q;
        b72 b72Var = new b72();
        b72Var.m26372s("audio/raw");
        b72Var.m26391d0(i3);
        b72Var.m26376o(i3);
        b72Var.m26379l((max + max) * i);
        b72Var.m26389e0(ce2Var.f5754b);
        b72Var.m26371t(ce2Var.f5755c);
        b72Var.m26377n(2);
        this.f33543h = b72Var.m26366y();
    }

    @Override // com.daaw.zd2
    /* renamed from: a */
    public final void mo2467a(long j) {
        this.f33544i = 0;
        this.f33545j = j;
        this.f33546k = 0;
        this.f33547l = 0L;
    }

    @Override // com.daaw.zd2
    /* renamed from: b */
    public final void mo2466b(int i, long j) {
        this.f33536a.mo3297i(new je2(this.f33538c, this.f33539d, i, j));
        this.f33537b.mo16218f(this.f33543h);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x001f). Please submit an issue!!! */
    @Override // com.daaw.zd2
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo2465c(k09 k09Var, long j) {
        boolean z;
        int i;
        int m3850d;
        int i2;
        int m19417O = it5.m19417O(this.f33542g - m3850d(this.f33546k), this.f33539d) * this.f33538c.f5756d;
        if (j != 0) {
            z = false;
            while (!z) {
                if (this.f33544i >= m19417O) {
                    break;
                }
                int mo1980a = k09Var.mo1980a(this.f33540e, this.f33544i, (int) Math.min(m19417O - i2, j));
                if (mo1980a != -1) {
                    this.f33544i += mo1980a;
                }
            }
            i = this.f33544i / this.f33538c.f5756d;
            if (i > 0) {
                byte[] bArr = this.f33540e;
                ik5 ik5Var = this.f33541f;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = 0;
                    while (true) {
                        ce2 ce2Var = this.f33538c;
                        int i5 = ce2Var.f5754b;
                        if (i4 < i5) {
                            byte[] m19714h = ik5Var.m19714h();
                            int i6 = ce2Var.f5756d;
                            int i7 = (i3 * i6) + (i4 * 4);
                            int i8 = (i5 * 4) + i7;
                            int i9 = (short) (((bArr[i7 + 1] & 255) << 8) | (bArr[i7] & 255));
                            int min = Math.min(bArr[i7 + 2] & 255, 88);
                            int i10 = f33535n[min];
                            int i11 = (this.f33539d * i3 * i5) + i4;
                            int i12 = i11 + i11;
                            m19714h[i12] = (byte) (i9 & 255);
                            m19714h[i12 + 1] = (byte) (i9 >> 8);
                            int i13 = 0;
                            for (int i14 = (i6 / i5) - 4; i13 < i14 + i14; i14 = i14) {
                                int i15 = bArr[((i13 / 8) * i5 * 4) + i8 + ((i13 / 2) % 4)] & 255;
                                int i16 = i13 % 2 == 0 ? i15 & 15 : i15 >> 4;
                                int i17 = i16 & 7;
                                int i18 = (i17 + i17 + 1) * i10;
                                byte[] bArr2 = bArr;
                                int i19 = i18 >> 3;
                                if ((i16 & 8) != 0) {
                                    i19 = -i19;
                                }
                                i9 = it5.m19416P(i9 + i19, -32768, 32767);
                                i12 += i5 + i5;
                                m19714h[i12] = (byte) (i9 & 255);
                                m19714h[i12 + 1] = (byte) (i9 >> 8);
                                min = it5.m19416P(min + f33534m[i16], 0, 88);
                                i13++;
                                bArr = bArr2;
                                i10 = f33535n[min];
                            }
                            i4++;
                        }
                    }
                }
                int m3849e = m3849e(this.f33539d * i);
                ik5Var.m19716f(0);
                ik5Var.m19717e(m3849e);
                this.f33544i -= i * this.f33538c.f5756d;
                ik5 ik5Var2 = this.f33541f;
                int m19710l = ik5Var2.m19710l();
                k42.m18050b(this.f33537b, ik5Var2, m19710l);
                int i20 = this.f33546k + m19710l;
                this.f33546k = i20;
                int m3850d2 = m3850d(i20);
                int i21 = this.f33542g;
                if (m3850d2 >= i21) {
                    m3848f(i21);
                }
            }
            if (z && (m3850d = m3850d(this.f33546k)) > 0) {
                m3848f(m3850d);
            }
            return z;
        }
        z = true;
        while (!z) {
        }
        i = this.f33544i / this.f33538c.f5756d;
        if (i > 0) {
        }
        if (z) {
            m3848f(m3850d);
        }
        return z;
    }

    /* renamed from: d */
    public final int m3850d(int i) {
        int i2 = this.f33538c.f5754b;
        return i / (i2 + i2);
    }

    /* renamed from: e */
    public final int m3849e(int i) {
        return (i + i) * this.f33538c.f5754b;
    }

    /* renamed from: f */
    public final void m3848f(int i) {
        long j = this.f33545j;
        long m19392g0 = it5.m19392g0(this.f33547l, 1000000L, this.f33538c.f5755c);
        int m3849e = m3849e(i);
        this.f33537b.mo16222b(j + m19392g0, 1, m3849e, this.f33546k - m3849e, null);
        this.f33547l += i;
        this.f33546k -= m3849e;
    }
}
