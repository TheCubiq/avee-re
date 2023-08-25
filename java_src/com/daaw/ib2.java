package com.daaw;

import com.google.android.gms.internal.ads.zzbq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
/* loaded from: classes.dex */
public final class ib2 extends gb2 {
    public hb2 n;
    public int o;
    public boolean p;
    public r42 q;
    public p42 r;

    @Override // com.daaw.gb2
    public final long a(ik5 ik5Var) {
        if ((ik5Var.h()[0] & 1) == 1) {
            return -1L;
        }
        byte b = ik5Var.h()[0];
        hb2 hb2Var = this.n;
        uo4.b(hb2Var);
        int i = !hb2Var.d[(b >> 1) & (255 >>> (8 - hb2Var.e))].a ? hb2Var.a.e : hb2Var.a.f;
        long j = this.p ? (this.o + i) / 4 : 0;
        if (ik5Var.j() < ik5Var.l() + 4) {
            byte[] copyOf = Arrays.copyOf(ik5Var.h(), ik5Var.l() + 4);
            ik5Var.d(copyOf, copyOf.length);
        } else {
            ik5Var.e(ik5Var.l() + 4);
        }
        byte[] h = ik5Var.h();
        h[ik5Var.l() - 4] = (byte) (j & 255);
        h[ik5Var.l() - 3] = (byte) ((j >>> 8) & 255);
        h[ik5Var.l() - 2] = (byte) ((j >>> 16) & 255);
        h[ik5Var.l() - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // com.daaw.gb2
    public final void b(boolean z) {
        super.b(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    @Override // com.daaw.gb2
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean c(ik5 ik5Var, long j, db2 db2Var) {
        hb2 hb2Var;
        int i;
        int i2;
        int i3;
        int i4;
        if (this.n != null) {
            Objects.requireNonNull(db2Var.a);
            return false;
        }
        r42 r42Var = this.q;
        if (r42Var == null) {
            s42.d(1, ik5Var, false);
            int p = ik5Var.p();
            int s = ik5Var.s();
            int p2 = ik5Var.p();
            int o = ik5Var.o();
            int i5 = o <= 0 ? -1 : o;
            int o2 = ik5Var.o();
            int i6 = o2 <= 0 ? -1 : o2;
            int o3 = ik5Var.o();
            int i7 = o3 <= 0 ? -1 : o3;
            int s2 = ik5Var.s();
            this.q = new r42(p, s, p2, i5, i6, i7, (int) Math.pow(2.0d, s2 & 15), (int) Math.pow(2.0d, (s2 & 240) >> 4), 1 == (ik5Var.s() & 1), Arrays.copyOf(ik5Var.h(), ik5Var.l()));
        } else {
            p42 p42Var = this.r;
            if (p42Var == null) {
                this.r = s42.c(ik5Var, true, true);
            } else {
                byte[] bArr = new byte[ik5Var.l()];
                System.arraycopy(ik5Var.h(), 0, bArr, 0, ik5Var.l());
                int i8 = r42Var.a;
                int i9 = 5;
                s42.d(5, ik5Var, false);
                int s3 = ik5Var.s() + 1;
                o42 o42Var = new o42(ik5Var.h());
                o42Var.c(ik5Var.k() * 8);
                int i10 = 0;
                while (i10 < s3) {
                    if (o42Var.b(24) != 5653314) {
                        throw dl3.a("expected code book to start with [0x56, 0x43, 0x42] at " + o42Var.a(), null);
                    }
                    int b = o42Var.b(16);
                    int b2 = o42Var.b(24);
                    long[] jArr = new long[b2];
                    long j2 = 0;
                    if (o42Var.d()) {
                        i3 = s3;
                        int b3 = o42Var.b(5) + 1;
                        int i11 = 0;
                        while (i11 < b2) {
                            int b4 = o42Var.b(s42.a(b2 - i11));
                            int i12 = 0;
                            while (i12 < b4 && i11 < b2) {
                                jArr[i11] = b3;
                                i11++;
                                i12++;
                                p42Var = p42Var;
                                bArr = bArr;
                            }
                            b3++;
                            p42Var = p42Var;
                            bArr = bArr;
                        }
                    } else {
                        boolean d = o42Var.d();
                        int i13 = 0;
                        while (i13 < b2) {
                            if (!d) {
                                i4 = s3;
                                jArr[i13] = o42Var.b(5) + 1;
                            } else if (o42Var.d()) {
                                i4 = s3;
                                jArr[i13] = o42Var.b(i9) + 1;
                            } else {
                                i4 = s3;
                                jArr[i13] = 0;
                            }
                            i13++;
                            s3 = i4;
                            i9 = 5;
                        }
                        i3 = s3;
                    }
                    p42 p42Var2 = p42Var;
                    byte[] bArr2 = bArr;
                    int b5 = o42Var.b(4);
                    if (b5 > 2) {
                        throw dl3.a("lookup type greater than 2 not decodable: " + b5, null);
                    }
                    if (b5 != 1) {
                        if (b5 == 2) {
                            b5 = 2;
                        } else {
                            i10++;
                            p42Var = p42Var2;
                            s3 = i3;
                            bArr = bArr2;
                            i9 = 5;
                        }
                    }
                    o42Var.c(32);
                    o42Var.c(32);
                    int b6 = o42Var.b(4) + 1;
                    o42Var.c(1);
                    if (b5 != 1) {
                        j2 = b2 * b;
                    } else if (b != 0) {
                        double d2 = b;
                        Double.isNaN(d2);
                        j2 = (long) Math.floor(Math.pow(b2, 1.0d / d2));
                    }
                    o42Var.c((int) (b6 * j2));
                    i10++;
                    p42Var = p42Var2;
                    s3 = i3;
                    bArr = bArr2;
                    i9 = 5;
                }
                p42 p42Var3 = p42Var;
                byte[] bArr3 = bArr;
                int i14 = 6;
                int b7 = o42Var.b(6) + 1;
                for (int i15 = 0; i15 < b7; i15++) {
                    if (o42Var.b(16) != 0) {
                        throw dl3.a("placeholder of time domain transforms not zeroed out", null);
                    }
                }
                int i16 = 1;
                int b8 = o42Var.b(6) + 1;
                int i17 = 0;
                while (true) {
                    int i18 = 3;
                    if (i17 < b8) {
                        int b9 = o42Var.b(16);
                        if (b9 == 0) {
                            int i19 = 8;
                            o42Var.c(8);
                            o42Var.c(16);
                            o42Var.c(16);
                            o42Var.c(6);
                            o42Var.c(8);
                            int b10 = o42Var.b(4) + 1;
                            int i20 = 0;
                            while (i20 < b10) {
                                o42Var.c(i19);
                                i20++;
                                i19 = 8;
                            }
                        } else if (b9 != i16) {
                            throw dl3.a("floor type greater than 1 not decodable: " + b9, null);
                        } else {
                            int b11 = o42Var.b(5);
                            int[] iArr = new int[b11];
                            int i21 = -1;
                            for (int i22 = 0; i22 < b11; i22++) {
                                int b12 = o42Var.b(4);
                                iArr[i22] = b12;
                                if (b12 > i21) {
                                    i21 = b12;
                                }
                            }
                            int i23 = i21 + 1;
                            int[] iArr2 = new int[i23];
                            int i24 = 0;
                            while (i24 < i23) {
                                iArr2[i24] = o42Var.b(i18) + 1;
                                int b13 = o42Var.b(2);
                                int i25 = 8;
                                if (b13 > 0) {
                                    o42Var.c(8);
                                }
                                int i26 = 0;
                                for (int i27 = 1; i26 < (i27 << b13); i27 = 1) {
                                    o42Var.c(i25);
                                    i26++;
                                    i25 = 8;
                                }
                                i24++;
                                i18 = 3;
                            }
                            o42Var.c(2);
                            int b14 = o42Var.b(4);
                            int i28 = 0;
                            int i29 = 0;
                            for (int i30 = 0; i30 < b11; i30++) {
                                i28 += iArr2[iArr[i30]];
                                while (i29 < i28) {
                                    o42Var.c(b14);
                                    i29++;
                                }
                            }
                        }
                        i17++;
                        i14 = 6;
                        i16 = 1;
                    } else {
                        int i31 = 1;
                        int b15 = o42Var.b(i14) + 1;
                        int i32 = 0;
                        while (i32 < b15) {
                            if (o42Var.b(16) > 2) {
                                throw dl3.a("residueType greater than 2 is not decodable", null);
                            }
                            o42Var.c(24);
                            o42Var.c(24);
                            o42Var.c(24);
                            int b16 = o42Var.b(i14) + i31;
                            int i33 = 8;
                            o42Var.c(8);
                            int[] iArr3 = new int[b16];
                            for (int i34 = 0; i34 < b16; i34++) {
                                iArr3[i34] = ((o42Var.d() ? o42Var.b(5) : 0) * 8) + o42Var.b(3);
                            }
                            int i35 = 0;
                            while (i35 < b16) {
                                int i36 = 0;
                                while (i36 < i33) {
                                    if ((iArr3[i35] & (1 << i36)) != 0) {
                                        o42Var.c(i33);
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
                        int b17 = o42Var.b(i14) + 1;
                        for (int i37 = 0; i37 < b17; i37++) {
                            int b18 = o42Var.b(16);
                            if (b18 != 0) {
                                s95.b("VorbisUtil", "mapping type other than 0 not supported: " + b18);
                            } else {
                                if (o42Var.d()) {
                                    i = 1;
                                    i2 = o42Var.b(4) + 1;
                                } else {
                                    i = 1;
                                    i2 = 1;
                                }
                                if (o42Var.d()) {
                                    int b19 = o42Var.b(8) + i;
                                    for (int i38 = 0; i38 < b19; i38++) {
                                        int i39 = i8 - 1;
                                        o42Var.c(s42.a(i39));
                                        o42Var.c(s42.a(i39));
                                    }
                                }
                                if (o42Var.b(2) != 0) {
                                    throw dl3.a("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (i2 > 1) {
                                    for (int i40 = 0; i40 < i8; i40++) {
                                        o42Var.c(4);
                                    }
                                }
                                for (int i41 = 0; i41 < i2; i41++) {
                                    o42Var.c(8);
                                    o42Var.c(8);
                                    o42Var.c(8);
                                }
                            }
                        }
                        int b20 = o42Var.b(6) + 1;
                        q42[] q42VarArr = new q42[b20];
                        for (int i42 = 0; i42 < b20; i42++) {
                            q42VarArr[i42] = new q42(o42Var.d(), o42Var.b(16), o42Var.b(16), o42Var.b(8));
                        }
                        if (!o42Var.d()) {
                            throw dl3.a("framing bit after modes not set as expected", null);
                        }
                        hb2Var = new hb2(r42Var, p42Var3, bArr3, q42VarArr, s42.a(b20 - 1));
                    }
                }
            }
        }
        hb2Var = null;
        this.n = hb2Var;
        if (hb2Var == null) {
            return true;
        }
        r42 r42Var2 = hb2Var.a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(r42Var2.g);
        arrayList.add(hb2Var.c);
        zzbq b21 = s42.b(y17.t(hb2Var.b.b));
        b72 b72Var = new b72();
        b72Var.s("audio/vorbis");
        b72Var.d0(r42Var2.d);
        b72Var.o(r42Var2.c);
        b72Var.e0(r42Var2.a);
        b72Var.t(r42Var2.b);
        b72Var.i(arrayList);
        b72Var.m(b21);
        db2Var.a = b72Var.y();
        return true;
    }

    @Override // com.daaw.gb2
    public final void h(long j) {
        super.h(j);
        this.p = j != 0;
        r42 r42Var = this.q;
        this.o = r42Var != null ? r42Var.e : 0;
    }
}
