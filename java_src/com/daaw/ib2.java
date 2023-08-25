package com.daaw;

import com.google.android.gms.internal.ads.zzbq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes.dex */
public final class ib2 extends gb2 {

    /* renamed from: n */
    public hb2 f13431n;

    /* renamed from: o */
    public int f13432o;

    /* renamed from: p */
    public boolean f13433p;

    /* renamed from: q */
    public r42 f13434q;

    /* renamed from: r */
    public p42 f13435r;

    @Override // com.daaw.gb2
    /* renamed from: a */
    public final long mo6277a(ik5 ik5Var) {
        if ((ik5Var.m19714h()[0] & 1) == 1) {
            return -1L;
        }
        byte b = ik5Var.m19714h()[0];
        hb2 hb2Var = this.f13431n;
        uo4.m7876b(hb2Var);
        int i = !hb2Var.f12349d[(b >> 1) & (255 >>> (8 - hb2Var.f12350e))].f23670a ? hb2Var.f12346a.f24839e : hb2Var.f12346a.f24840f;
        long j = this.f13433p ? (this.f13432o + i) / 4 : 0;
        if (ik5Var.m19712j() < ik5Var.m19710l() + 4) {
            byte[] copyOf = Arrays.copyOf(ik5Var.m19714h(), ik5Var.m19710l() + 4);
            ik5Var.m19718d(copyOf, copyOf.length);
        } else {
            ik5Var.m19717e(ik5Var.m19710l() + 4);
        }
        byte[] m19714h = ik5Var.m19714h();
        m19714h[ik5Var.m19710l() - 4] = (byte) (j & 255);
        m19714h[ik5Var.m19710l() - 3] = (byte) ((j >>> 8) & 255);
        m19714h[ik5Var.m19710l() - 2] = (byte) ((j >>> 16) & 255);
        m19714h[ik5Var.m19710l() - 1] = (byte) ((j >>> 24) & 255);
        this.f13433p = true;
        this.f13432o = i;
        return j;
    }

    @Override // com.daaw.gb2
    /* renamed from: b */
    public final void mo6276b(boolean z) {
        super.mo6276b(z);
        if (z) {
            this.f13431n = null;
            this.f13434q = null;
            this.f13435r = null;
        }
        this.f13432o = 0;
        this.f13433p = false;
    }

    @Override // com.daaw.gb2
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: c */
    public final boolean mo6275c(ik5 ik5Var, long j, db2 db2Var) {
        hb2 hb2Var;
        int i;
        int i2;
        int i3;
        int i4;
        if (this.f13431n != null) {
            Objects.requireNonNull(db2Var.f6733a);
            return false;
        }
        r42 r42Var = this.f13434q;
        if (r42Var == null) {
            s42.m10716d(1, ik5Var, false);
            int m19706p = ik5Var.m19706p();
            int m19703s = ik5Var.m19703s();
            int m19706p2 = ik5Var.m19706p();
            int m19707o = ik5Var.m19707o();
            int i5 = m19707o <= 0 ? -1 : m19707o;
            int m19707o2 = ik5Var.m19707o();
            int i6 = m19707o2 <= 0 ? -1 : m19707o2;
            int m19707o3 = ik5Var.m19707o();
            int i7 = m19707o3 <= 0 ? -1 : m19707o3;
            int m19703s2 = ik5Var.m19703s();
            this.f13434q = new r42(m19706p, m19703s, m19706p2, i5, i6, i7, (int) Math.pow(2.0d, m19703s2 & 15), (int) Math.pow(2.0d, (m19703s2 & 240) >> 4), 1 == (ik5Var.m19703s() & 1), Arrays.copyOf(ik5Var.m19714h(), ik5Var.m19710l()));
        } else {
            p42 p42Var = this.f13435r;
            if (p42Var == null) {
                this.f13435r = s42.m10717c(ik5Var, true, true);
            } else {
                byte[] bArr = new byte[ik5Var.m19710l()];
                System.arraycopy(ik5Var.m19714h(), 0, bArr, 0, ik5Var.m19710l());
                int i8 = r42Var.f24835a;
                int i9 = 5;
                s42.m10716d(5, ik5Var, false);
                int m19703s3 = ik5Var.m19703s() + 1;
                o42 o42Var = new o42(ik5Var.m19714h());
                o42Var.m14561c(ik5Var.m19711k() * 8);
                int i10 = 0;
                while (i10 < m19703s3) {
                    if (o42Var.m14562b(24) != 5653314) {
                        throw dl3.m24267a("expected code book to start with [0x56, 0x43, 0x42] at " + o42Var.m14563a(), null);
                    }
                    int m14562b = o42Var.m14562b(16);
                    int m14562b2 = o42Var.m14562b(24);
                    long[] jArr = new long[m14562b2];
                    long j2 = 0;
                    if (o42Var.m14560d()) {
                        i3 = m19703s3;
                        int m14562b3 = o42Var.m14562b(5) + 1;
                        int i11 = 0;
                        while (i11 < m14562b2) {
                            int m14562b4 = o42Var.m14562b(s42.m10719a(m14562b2 - i11));
                            int i12 = 0;
                            while (i12 < m14562b4 && i11 < m14562b2) {
                                jArr[i11] = m14562b3;
                                i11++;
                                i12++;
                                p42Var = p42Var;
                                bArr = bArr;
                            }
                            m14562b3++;
                            p42Var = p42Var;
                            bArr = bArr;
                        }
                    } else {
                        boolean m14560d = o42Var.m14560d();
                        int i13 = 0;
                        while (i13 < m14562b2) {
                            if (!m14560d) {
                                i4 = m19703s3;
                                jArr[i13] = o42Var.m14562b(5) + 1;
                            } else if (o42Var.m14560d()) {
                                i4 = m19703s3;
                                jArr[i13] = o42Var.m14562b(i9) + 1;
                            } else {
                                i4 = m19703s3;
                                jArr[i13] = 0;
                            }
                            i13++;
                            m19703s3 = i4;
                            i9 = 5;
                        }
                        i3 = m19703s3;
                    }
                    p42 p42Var2 = p42Var;
                    byte[] bArr2 = bArr;
                    int m14562b5 = o42Var.m14562b(4);
                    if (m14562b5 > 2) {
                        throw dl3.m24267a("lookup type greater than 2 not decodable: " + m14562b5, null);
                    }
                    if (m14562b5 != 1) {
                        if (m14562b5 == 2) {
                            m14562b5 = 2;
                        } else {
                            i10++;
                            p42Var = p42Var2;
                            m19703s3 = i3;
                            bArr = bArr2;
                            i9 = 5;
                        }
                    }
                    o42Var.m14561c(32);
                    o42Var.m14561c(32);
                    int m14562b6 = o42Var.m14562b(4) + 1;
                    o42Var.m14561c(1);
                    if (m14562b5 != 1) {
                        j2 = m14562b2 * m14562b;
                    } else if (m14562b != 0) {
                        double d = m14562b;
                        Double.isNaN(d);
                        j2 = (long) Math.floor(Math.pow(m14562b2, 1.0d / d));
                    }
                    o42Var.m14561c((int) (m14562b6 * j2));
                    i10++;
                    p42Var = p42Var2;
                    m19703s3 = i3;
                    bArr = bArr2;
                    i9 = 5;
                }
                p42 p42Var3 = p42Var;
                byte[] bArr3 = bArr;
                int i14 = 6;
                int m14562b7 = o42Var.m14562b(6) + 1;
                for (int i15 = 0; i15 < m14562b7; i15++) {
                    if (o42Var.m14562b(16) != 0) {
                        throw dl3.m24267a("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i16 = 1;
                int m14562b8 = o42Var.m14562b(6) + 1;
                int i17 = 0;
                while (true) {
                    int i18 = 3;
                    if (i17 < m14562b8) {
                        int m14562b9 = o42Var.m14562b(16);
                        if (m14562b9 == 0) {
                            int i19 = 8;
                            o42Var.m14561c(8);
                            o42Var.m14561c(16);
                            o42Var.m14561c(16);
                            o42Var.m14561c(6);
                            o42Var.m14561c(8);
                            int m14562b10 = o42Var.m14562b(4) + 1;
                            int i20 = 0;
                            while (i20 < m14562b10) {
                                o42Var.m14561c(i19);
                                i20++;
                                i19 = 8;
                            }
                        } else if (m14562b9 != i16) {
                            throw dl3.m24267a("floor type greater than 1 not decodable: " + m14562b9, null);
                        } else {
                            int m14562b11 = o42Var.m14562b(5);
                            int[] iArr = new int[m14562b11];
                            int i21 = -1;
                            for (int i22 = 0; i22 < m14562b11; i22++) {
                                int m14562b12 = o42Var.m14562b(4);
                                iArr[i22] = m14562b12;
                                if (m14562b12 > i21) {
                                    i21 = m14562b12;
                                }
                            }
                            int i23 = i21 + 1;
                            int[] iArr2 = new int[i23];
                            int i24 = 0;
                            while (i24 < i23) {
                                iArr2[i24] = o42Var.m14562b(i18) + 1;
                                int m14562b13 = o42Var.m14562b(2);
                                int i25 = 8;
                                if (m14562b13 > 0) {
                                    o42Var.m14561c(8);
                                }
                                int i26 = 0;
                                for (int i27 = 1; i26 < (i27 << m14562b13); i27 = 1) {
                                    o42Var.m14561c(i25);
                                    i26++;
                                    i25 = 8;
                                }
                                i24++;
                                i18 = 3;
                            }
                            o42Var.m14561c(2);
                            int m14562b14 = o42Var.m14562b(4);
                            int i28 = 0;
                            int i29 = 0;
                            for (int i30 = 0; i30 < m14562b11; i30++) {
                                i28 += iArr2[iArr[i30]];
                                while (i29 < i28) {
                                    o42Var.m14561c(m14562b14);
                                    i29++;
                                }
                            }
                        }
                        i17++;
                        i14 = 6;
                        i16 = 1;
                    } else {
                        int i31 = 1;
                        int m14562b15 = o42Var.m14562b(i14) + 1;
                        int i32 = 0;
                        while (i32 < m14562b15) {
                            if (o42Var.m14562b(16) > 2) {
                                throw dl3.m24267a("residueType greater than 2 is not decodable", null);
                            }
                            o42Var.m14561c(24);
                            o42Var.m14561c(24);
                            o42Var.m14561c(24);
                            int m14562b16 = o42Var.m14562b(i14) + i31;
                            int i33 = 8;
                            o42Var.m14561c(8);
                            int[] iArr3 = new int[m14562b16];
                            for (int i34 = 0; i34 < m14562b16; i34++) {
                                iArr3[i34] = ((o42Var.m14560d() ? o42Var.m14562b(5) : 0) * 8) + o42Var.m14562b(3);
                            }
                            int i35 = 0;
                            while (i35 < m14562b16) {
                                int i36 = 0;
                                while (i36 < i33) {
                                    if ((iArr3[i35] & (1 << i36)) != 0) {
                                        o42Var.m14561c(i33);
                                    }
                                    i36++;
                                    i33 = 8;
                                }
                                i35++;
                                i33 = 8;
                            }
                            i32++;
                            i14 = 6;
                            i31 = 1;
                        }
                        int m14562b17 = o42Var.m14562b(i14) + 1;
                        for (int i37 = 0; i37 < m14562b17; i37++) {
                            int m14562b18 = o42Var.m14562b(16);
                            if (m14562b18 != 0) {
                                s95.m10496b("VorbisUtil", "mapping type other than 0 not supported: " + m14562b18);
                            } else {
                                if (o42Var.m14560d()) {
                                    i = 1;
                                    i2 = o42Var.m14562b(4) + 1;
                                } else {
                                    i = 1;
                                    i2 = 1;
                                }
                                if (o42Var.m14560d()) {
                                    int m14562b19 = o42Var.m14562b(8) + i;
                                    for (int i38 = 0; i38 < m14562b19; i38++) {
                                        int i39 = i8 - 1;
                                        o42Var.m14561c(s42.m10719a(i39));
                                        o42Var.m14561c(s42.m10719a(i39));
                                    }
                                }
                                if (o42Var.m14562b(2) != 0) {
                                    throw dl3.m24267a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (i2 > 1) {
                                    for (int i40 = 0; i40 < i8; i40++) {
                                        o42Var.m14561c(4);
                                    }
                                }
                                for (int i41 = 0; i41 < i2; i41++) {
                                    o42Var.m14561c(8);
                                    o42Var.m14561c(8);
                                    o42Var.m14561c(8);
                                }
                            }
                        }
                        int m14562b20 = o42Var.m14562b(6) + 1;
                        q42[] q42VarArr = new q42[m14562b20];
                        for (int i42 = 0; i42 < m14562b20; i42++) {
                            q42VarArr[i42] = new q42(o42Var.m14560d(), o42Var.m14562b(16), o42Var.m14562b(16), o42Var.m14562b(8));
                        }
                        if (!o42Var.m14560d()) {
                            throw dl3.m24267a("framing bit after modes not set as expected", null);
                        }
                        hb2Var = new hb2(r42Var, p42Var3, bArr3, q42VarArr, s42.m10719a(m14562b20 - 1));
                    }
                }
            }
        }
        hb2Var = null;
        this.f13431n = hb2Var;
        if (hb2Var == null) {
            return true;
        }
        r42 r42Var2 = hb2Var.f12346a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(r42Var2.f24841g);
        arrayList.add(hb2Var.f12348c);
        zzbq m10718b = s42.m10718b(y17.m4261t(hb2Var.f12347b.f22586b));
        b72 b72Var = new b72();
        b72Var.m26372s("audio/vorbis");
        b72Var.m26391d0(r42Var2.f24838d);
        b72Var.m26376o(r42Var2.f24837c);
        b72Var.m26389e0(r42Var2.f24835a);
        b72Var.m26371t(r42Var2.f24836b);
        b72Var.m26382i(arrayList);
        b72Var.m26378m(m10718b);
        db2Var.f6733a = b72Var.m26366y();
        return true;
    }

    @Override // com.daaw.gb2
    /* renamed from: h */
    public final void mo19986h(long j) {
        super.mo19986h(j);
        this.f13433p = j != 0;
        r42 r42Var = this.f13434q;
        this.f13432o = r42Var != null ? r42Var.f24839e : 0;
    }
}
