package com.daaw;

import android.util.Pair;
import com.daaw.b7;
import com.daaw.l20;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class c7 {
    public static final int a = sq1.v("vide");
    public static final int b = sq1.v("soun");
    public static final int c = sq1.v("text");
    public static final int d = sq1.v("sbtl");
    public static final int e = sq1.v("subt");
    public static final int f = sq1.v("clcp");
    public static final int g = sq1.v("meta");

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public int b;
        public int c;
        public long d;
        public final boolean e;
        public final rv0 f;
        public final rv0 g;
        public int h;
        public int i;

        public a(rv0 rv0Var, rv0 rv0Var2, boolean z) {
            this.g = rv0Var;
            this.f = rv0Var2;
            this.e = z;
            rv0Var2.J(12);
            this.a = rv0Var2.B();
            rv0Var.J(12);
            this.i = rv0Var.B();
            s6.g(rv0Var.i() == 1, "first_chunk must be 1");
            this.b = -1;
        }

        public boolean a() {
            int i = this.b + 1;
            this.b = i;
            if (i == this.a) {
                return false;
            }
            this.d = this.e ? this.f.C() : this.f.z();
            if (this.b == this.h) {
                this.c = this.g.B();
                this.g.K(4);
                int i2 = this.i - 1;
                this.i = i2;
                this.h = i2 > 0 ? this.g.B() - 1 : -1;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a();

        int b();

        int c();
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final pm1[] a;
        public Format b;
        public int c;
        public int d = 0;

        public c(int i) {
            this.a = new pm1[i];
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements b {
        public final int a;
        public final int b;
        public final rv0 c;

        public d(b7.b bVar) {
            rv0 rv0Var = bVar.Q0;
            this.c = rv0Var;
            rv0Var.J(12);
            this.a = rv0Var.B();
            this.b = rv0Var.B();
        }

        @Override // com.daaw.c7.b
        public boolean a() {
            return this.a != 0;
        }

        @Override // com.daaw.c7.b
        public int b() {
            return this.b;
        }

        @Override // com.daaw.c7.b
        public int c() {
            int i = this.a;
            return i == 0 ? this.c.B() : i;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements b {
        public final rv0 a;
        public final int b;
        public final int c;
        public int d;
        public int e;

        public e(b7.b bVar) {
            rv0 rv0Var = bVar.Q0;
            this.a = rv0Var;
            rv0Var.J(12);
            this.c = rv0Var.B() & 255;
            this.b = rv0Var.B();
        }

        @Override // com.daaw.c7.b
        public boolean a() {
            return false;
        }

        @Override // com.daaw.c7.b
        public int b() {
            return this.b;
        }

        @Override // com.daaw.c7.b
        public int c() {
            int i = this.c;
            if (i == 8) {
                return this.a.x();
            }
            if (i == 16) {
                return this.a.D();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 == 0) {
                int x = this.a.x();
                this.e = x;
                return (x & 240) >> 4;
            }
            return this.e & 15;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {
        public final int a;
        public final long b;
        public final int c;

        public f(int i, long j, int i2) {
            this.a = i;
            this.b = j;
            this.c = i2;
        }
    }

    public static boolean a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[sq1.l(3, 0, length)] && jArr[sq1.l(jArr.length - 3, 0, length)] < j3 && j3 <= j;
    }

    public static int b(rv0 rv0Var, int i, int i2) {
        int c2 = rv0Var.c();
        while (c2 - i < i2) {
            rv0Var.J(c2);
            int i3 = rv0Var.i();
            s6.b(i3 > 0, "childAtomSize should be positive");
            if (rv0Var.i() == b7.K) {
                return c2;
            }
            c2 += i3;
        }
        return -1;
    }

    public static void c(rv0 rv0Var, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, c cVar, int i5) {
        int i6;
        int i7;
        int i8;
        String str2;
        String str3;
        DrmInitData drmInitData2;
        int i9;
        Format g2;
        int i10 = i2;
        DrmInitData drmInitData3 = drmInitData;
        rv0Var.J(i10 + 8 + 8);
        if (z) {
            i6 = rv0Var.D();
            rv0Var.K(6);
        } else {
            rv0Var.K(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            int D = rv0Var.D();
            rv0Var.K(6);
            int y = rv0Var.y();
            if (i6 == 1) {
                rv0Var.K(16);
            }
            i7 = y;
            i8 = D;
        } else if (i6 != 2) {
            return;
        } else {
            rv0Var.K(16);
            i7 = (int) Math.round(rv0Var.h());
            i8 = rv0Var.B();
            rv0Var.K(20);
        }
        int c2 = rv0Var.c();
        int i11 = i;
        if (i11 == b7.b0) {
            Pair<Integer, pm1> o = o(rv0Var, i10, i3);
            if (o != null) {
                i11 = ((Integer) o.first).intValue();
                drmInitData3 = drmInitData3 == null ? null : drmInitData3.c(((pm1) o.second).b);
                cVar.a[i5] = (pm1) o.second;
            }
            rv0Var.J(c2);
        }
        DrmInitData drmInitData4 = drmInitData3;
        String str4 = "audio/raw";
        String str5 = i11 == b7.o ? "audio/ac3" : i11 == b7.q ? "audio/eac3" : i11 == b7.s ? "audio/vnd.dts" : (i11 == b7.t || i11 == b7.u) ? "audio/vnd.dts.hd" : i11 == b7.v ? "audio/vnd.dts.hd;profile=lbr" : i11 == b7.z0 ? "audio/3gpp" : i11 == b7.A0 ? "audio/amr-wb" : (i11 == b7.m || i11 == b7.n) ? "audio/raw" : i11 == b7.k ? "audio/mpeg" : i11 == b7.P0 ? "audio/alac" : null;
        int i12 = i8;
        int i13 = i7;
        int i14 = c2;
        byte[] bArr = null;
        while (i14 - i10 < i3) {
            rv0Var.J(i14);
            int i15 = rv0Var.i();
            s6.b(i15 > 0, "childAtomSize should be positive");
            int i16 = rv0Var.i();
            int i17 = b7.K;
            if (i16 == i17 || (z && i16 == b7.l)) {
                str2 = str5;
                str3 = str4;
                drmInitData2 = drmInitData4;
                int b2 = i16 == i17 ? i14 : b(rv0Var, i14, i15);
                if (b2 != -1) {
                    Pair<String, byte[]> f2 = f(rv0Var, b2);
                    str5 = (String) f2.first;
                    bArr = (byte[]) f2.second;
                    if ("audio/mp4a-latm".equals(str5)) {
                        Pair<Integer, Integer> i18 = eg.i(bArr);
                        i13 = ((Integer) i18.first).intValue();
                        i12 = ((Integer) i18.second).intValue();
                    }
                    i14 += i15;
                    i10 = i2;
                    drmInitData4 = drmInitData2;
                    str4 = str3;
                }
            } else {
                if (i16 == b7.p) {
                    rv0Var.J(i14 + 8);
                    g2 = u.d(rv0Var, Integer.toString(i4), str, drmInitData4);
                } else if (i16 == b7.r) {
                    rv0Var.J(i14 + 8);
                    g2 = u.g(rv0Var, Integer.toString(i4), str, drmInitData4);
                } else {
                    if (i16 == b7.w) {
                        str2 = str5;
                        str3 = str4;
                        drmInitData2 = drmInitData4;
                        i9 = i14;
                        cVar.b = Format.u(Integer.toString(i4), str5, null, -1, -1, i12, i13, null, drmInitData2, 0, str);
                        i15 = i15;
                    } else {
                        i9 = i14;
                        str2 = str5;
                        str3 = str4;
                        drmInitData2 = drmInitData4;
                        if (i16 == b7.P0) {
                            byte[] bArr2 = new byte[i15];
                            i14 = i9;
                            rv0Var.J(i14);
                            rv0Var.g(bArr2, 0, i15);
                            bArr = bArr2;
                        }
                    }
                    i14 = i9;
                }
                cVar.b = g2;
                str2 = str5;
                str3 = str4;
                drmInitData2 = drmInitData4;
            }
            str5 = str2;
            i14 += i15;
            i10 = i2;
            drmInitData4 = drmInitData2;
            str4 = str3;
        }
        String str6 = str5;
        String str7 = str4;
        DrmInitData drmInitData5 = drmInitData4;
        if (cVar.b != null || str6 == null) {
            return;
        }
        cVar.b = Format.t(Integer.toString(i4), str6, null, -1, -1, i12, i13, str7.equals(str6) ? 2 : -1, bArr != null ? Collections.singletonList(bArr) : null, drmInitData5, 0, str);
    }

    public static Pair<Integer, pm1> d(rv0 rv0Var, int i, int i2) {
        int i3 = i + 8;
        String str = null;
        Integer num = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            rv0Var.J(i3);
            int i6 = rv0Var.i();
            int i7 = rv0Var.i();
            if (i7 == b7.c0) {
                num = Integer.valueOf(rv0Var.i());
            } else if (i7 == b7.X) {
                rv0Var.K(4);
                str = rv0Var.u(4);
            } else if (i7 == b7.Y) {
                i4 = i3;
                i5 = i6;
            }
            i3 += i6;
        }
        if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
            s6.b(num != null, "frma atom is mandatory");
            s6.b(i4 != -1, "schi atom is mandatory");
            pm1 p = p(rv0Var, i4, i5, str);
            s6.b(p != null, "tenc atom is mandatory");
            return Pair.create(num, p);
        }
        return null;
    }

    public static Pair<long[], long[]> e(b7.a aVar) {
        b7.b g2;
        if (aVar == null || (g2 = aVar.g(b7.R)) == null) {
            return Pair.create(null, null);
        }
        rv0 rv0Var = g2.Q0;
        rv0Var.J(8);
        int c2 = b7.c(rv0Var.i());
        int B = rv0Var.B();
        long[] jArr = new long[B];
        long[] jArr2 = new long[B];
        for (int i = 0; i < B; i++) {
            jArr[i] = c2 == 1 ? rv0Var.C() : rv0Var.z();
            jArr2[i] = c2 == 1 ? rv0Var.q() : rv0Var.i();
            if (rv0Var.t() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            rv0Var.K(2);
        }
        return Pair.create(jArr, jArr2);
    }

    public static Pair<String, byte[]> f(rv0 rv0Var, int i) {
        rv0Var.J(i + 8 + 4);
        rv0Var.K(1);
        g(rv0Var);
        rv0Var.K(2);
        int x = rv0Var.x();
        if ((x & 128) != 0) {
            rv0Var.K(2);
        }
        if ((x & 64) != 0) {
            rv0Var.K(rv0Var.D());
        }
        if ((x & 32) != 0) {
            rv0Var.K(2);
        }
        rv0Var.K(1);
        g(rv0Var);
        String e2 = hq0.e(rv0Var.x());
        if ("audio/mpeg".equals(e2) || "audio/vnd.dts".equals(e2) || "audio/vnd.dts.hd".equals(e2)) {
            return Pair.create(e2, null);
        }
        rv0Var.K(12);
        rv0Var.K(1);
        int g2 = g(rv0Var);
        byte[] bArr = new byte[g2];
        rv0Var.g(bArr, 0, g2);
        return Pair.create(e2, bArr);
    }

    public static int g(rv0 rv0Var) {
        int x = rv0Var.x();
        int i = x & 127;
        while ((x & 128) == 128) {
            x = rv0Var.x();
            i = (i << 7) | (x & 127);
        }
        return i;
    }

    public static int h(rv0 rv0Var) {
        rv0Var.J(16);
        int i = rv0Var.i();
        if (i == b) {
            return 1;
        }
        if (i == a) {
            return 2;
        }
        if (i == c || i == d || i == e || i == f) {
            return 3;
        }
        return i == g ? 4 : -1;
    }

    public static Metadata i(rv0 rv0Var, int i) {
        rv0Var.K(8);
        ArrayList arrayList = new ArrayList();
        while (rv0Var.c() < i) {
            Metadata.Entry c2 = zp0.c(rv0Var);
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Pair<Long, String> j(rv0 rv0Var) {
        rv0Var.J(8);
        int c2 = b7.c(rv0Var.i());
        rv0Var.K(c2 == 0 ? 8 : 16);
        long z = rv0Var.z();
        rv0Var.K(c2 == 0 ? 4 : 8);
        int D = rv0Var.D();
        return Pair.create(Long.valueOf(z), "" + ((char) (((D >> 10) & 31) + 96)) + ((char) (((D >> 5) & 31) + 96)) + ((char) ((D & 31) + 96)));
    }

    public static Metadata k(rv0 rv0Var, int i) {
        rv0Var.K(12);
        while (rv0Var.c() < i) {
            int c2 = rv0Var.c();
            int i2 = rv0Var.i();
            if (rv0Var.i() == b7.D0) {
                rv0Var.J(c2);
                return i(rv0Var, c2 + i2);
            }
            rv0Var.K(i2 - 8);
        }
        return null;
    }

    public static long l(rv0 rv0Var) {
        rv0Var.J(8);
        rv0Var.K(b7.c(rv0Var.i()) != 0 ? 16 : 8);
        return rv0Var.z();
    }

    public static float m(rv0 rv0Var, int i) {
        rv0Var.J(i + 8);
        return rv0Var.B() / rv0Var.B();
    }

    public static byte[] n(rv0 rv0Var, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            rv0Var.J(i3);
            int i4 = rv0Var.i();
            if (rv0Var.i() == b7.K0) {
                return Arrays.copyOfRange(rv0Var.a, i3, i4 + i3);
            }
            i3 += i4;
        }
        return null;
    }

    public static Pair<Integer, pm1> o(rv0 rv0Var, int i, int i2) {
        Pair<Integer, pm1> d2;
        int c2 = rv0Var.c();
        while (c2 - i < i2) {
            rv0Var.J(c2);
            int i3 = rv0Var.i();
            s6.b(i3 > 0, "childAtomSize should be positive");
            if (rv0Var.i() == b7.W && (d2 = d(rv0Var, c2, i3)) != null) {
                return d2;
            }
            c2 += i3;
        }
        return null;
    }

    public static pm1 p(rv0 rv0Var, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            rv0Var.J(i5);
            int i6 = rv0Var.i();
            if (rv0Var.i() == b7.Z) {
                int c2 = b7.c(rv0Var.i());
                rv0Var.K(1);
                if (c2 == 0) {
                    rv0Var.K(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int x = rv0Var.x();
                    i3 = x & 15;
                    i4 = (x & 240) >> 4;
                }
                boolean z = rv0Var.x() == 1;
                int x2 = rv0Var.x();
                byte[] bArr2 = new byte[16];
                rv0Var.g(bArr2, 0, 16);
                if (z && x2 == 0) {
                    int x3 = rv0Var.x();
                    bArr = new byte[x3];
                    rv0Var.g(bArr, 0, x3);
                }
                return new pm1(z, str, x2, bArr2, i4, i3, bArr);
            }
            i5 += i6;
        }
    }

    public static tm1 q(nm1 nm1Var, b7.a aVar, y50 y50Var) {
        b eVar;
        boolean z;
        int i;
        int i2;
        nm1 nm1Var2;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long j;
        int i3;
        int i4;
        long j2;
        long[] jArr3;
        boolean z2;
        int[] iArr3;
        int[] iArr4;
        long[] jArr4;
        int[] iArr5;
        int[] iArr6;
        long[] jArr5;
        int[] iArr7;
        int i5;
        int i6;
        int i7;
        b7.b g2 = aVar.g(b7.r0);
        if (g2 != null) {
            eVar = new d(g2);
        } else {
            b7.b g3 = aVar.g(b7.s0);
            if (g3 == null) {
                throw new tv0("Track has no sample table size information");
            }
            eVar = new e(g3);
        }
        int b2 = eVar.b();
        if (b2 == 0) {
            return new tm1(new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
        }
        b7.b g4 = aVar.g(b7.t0);
        if (g4 == null) {
            g4 = aVar.g(b7.u0);
            z = true;
        } else {
            z = false;
        }
        rv0 rv0Var = g4.Q0;
        rv0 rv0Var2 = aVar.g(b7.q0).Q0;
        rv0 rv0Var3 = aVar.g(b7.n0).Q0;
        b7.b g5 = aVar.g(b7.o0);
        rv0 rv0Var4 = null;
        rv0 rv0Var5 = g5 != null ? g5.Q0 : null;
        b7.b g6 = aVar.g(b7.p0);
        rv0 rv0Var6 = g6 != null ? g6.Q0 : null;
        a aVar2 = new a(rv0Var2, rv0Var, z);
        rv0Var3.J(12);
        int B = rv0Var3.B() - 1;
        int B2 = rv0Var3.B();
        int B3 = rv0Var3.B();
        if (rv0Var6 != null) {
            rv0Var6.J(12);
            i = rv0Var6.B();
        } else {
            i = 0;
        }
        int i8 = -1;
        if (rv0Var5 != null) {
            rv0Var5.J(12);
            i2 = rv0Var5.B();
            if (i2 > 0) {
                i8 = rv0Var5.B() - 1;
                rv0Var4 = rv0Var5;
            }
        } else {
            rv0Var4 = rv0Var5;
            i2 = 0;
        }
        long j3 = 0;
        if (eVar.a() && "audio/raw".equals(nm1Var.f.u) && B == 0 && i == 0 && i2 == 0) {
            nm1Var2 = nm1Var;
            int i9 = aVar2.a;
            long[] jArr6 = new long[i9];
            int[] iArr8 = new int[i9];
            while (aVar2.a()) {
                int i10 = aVar2.b;
                jArr6[i10] = aVar2.d;
                iArr8[i10] = aVar2.c;
            }
            Format format = nm1Var2.f;
            l20.b a2 = l20.a(sq1.y(format.I, format.G), jArr6, iArr8, B3);
            jArr = a2.a;
            iArr = a2.b;
            int i11 = a2.c;
            jArr2 = a2.d;
            iArr2 = a2.e;
            j = a2.f;
            i3 = i11;
        } else {
            long[] jArr7 = new long[b2];
            iArr = new int[b2];
            jArr2 = new long[b2];
            int i12 = i2;
            int[] iArr9 = new int[b2];
            int i13 = i8;
            long j4 = 0;
            long j5 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = i;
            int i20 = B3;
            int i21 = B2;
            int i22 = B;
            int i23 = i12;
            while (i14 < b2) {
                while (i18 == 0) {
                    s6.f(aVar2.a());
                    j5 = aVar2.d;
                    i18 = aVar2.c;
                    i20 = i20;
                    i21 = i21;
                }
                int i24 = i21;
                int i25 = i20;
                if (rv0Var6 != null) {
                    while (i17 == 0 && i19 > 0) {
                        i17 = rv0Var6.B();
                        i16 = rv0Var6.i();
                        i19--;
                    }
                    i17--;
                }
                int i26 = i16;
                jArr7[i14] = j5;
                iArr[i14] = eVar.c();
                if (iArr[i14] > i15) {
                    i15 = iArr[i14];
                }
                b bVar = eVar;
                long[] jArr8 = jArr7;
                jArr2[i14] = j4 + i26;
                iArr9[i14] = rv0Var4 == null ? 1 : 0;
                if (i14 == i13) {
                    iArr9[i14] = 1;
                    i23--;
                    if (i23 > 0) {
                        i13 = rv0Var4.B() - 1;
                    }
                }
                int[] iArr10 = iArr9;
                j4 += i25;
                int i27 = i24 - 1;
                if (i27 != 0 || i22 <= 0) {
                    i6 = i25;
                    i7 = i27;
                } else {
                    i7 = rv0Var3.B();
                    i6 = rv0Var3.i();
                    i22--;
                }
                int i28 = i7;
                int i29 = i6;
                j5 += iArr[i14];
                i18--;
                i14++;
                eVar = bVar;
                jArr7 = jArr8;
                iArr9 = iArr10;
                i20 = i29;
                i16 = i26;
                i21 = i28;
            }
            int[] iArr11 = iArr9;
            int i30 = i21;
            int i31 = i16;
            long[] jArr9 = jArr7;
            long j6 = j4 + i31;
            s6.a(i17 == 0);
            while (i19 > 0) {
                s6.a(rv0Var6.B() == 0);
                rv0Var6.i();
                i19--;
            }
            if (i23 == 0 && i30 == 0) {
                i5 = i18;
                if (i5 == 0 && i22 == 0) {
                    nm1Var2 = nm1Var;
                    i3 = i15;
                    jArr = jArr9;
                    j = j6;
                    iArr2 = iArr11;
                }
            } else {
                i5 = i18;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Inconsistent stbl box for track ");
            nm1Var2 = nm1Var;
            sb.append(nm1Var2.a);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i23);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i30);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i5);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i22);
            i3 = i15;
            jArr = jArr9;
            j = j6;
            iArr2 = iArr11;
        }
        long T = sq1.T(j, 1000000L, nm1Var2.c);
        if (nm1Var2.h == null || y50Var.a()) {
            sq1.V(jArr2, 1000000L, nm1Var2.c);
            return new tm1(jArr, iArr, i3, jArr2, iArr2, T);
        }
        long[] jArr10 = nm1Var2.h;
        if (jArr10.length == 1 && nm1Var2.b == 1 && jArr2.length >= 2) {
            long j7 = nm1Var2.i[0];
            i4 = b2;
            long T2 = sq1.T(jArr10[0], nm1Var2.c, nm1Var2.d) + j7;
            if (a(jArr2, j, j7, T2)) {
                long j8 = j - T2;
                long T3 = sq1.T(j7 - jArr2[0], nm1Var2.f.H, nm1Var2.c);
                long T4 = sq1.T(j8, nm1Var2.f.H, nm1Var2.c);
                if ((T3 != 0 || T4 != 0) && T3 <= 2147483647L && T4 <= 2147483647L) {
                    y50Var.a = (int) T3;
                    y50Var.b = (int) T4;
                    sq1.V(jArr2, 1000000L, nm1Var2.c);
                    return new tm1(jArr, iArr, i3, jArr2, iArr2, T);
                }
            }
        } else {
            i4 = b2;
        }
        long[] jArr11 = nm1Var2.h;
        if (jArr11.length == 1 && jArr11[0] == 0) {
            long j9 = nm1Var2.i[0];
            for (int i32 = 0; i32 < jArr2.length; i32++) {
                jArr2[i32] = sq1.T(jArr2[i32] - j9, 1000000L, nm1Var2.c);
            }
            return new tm1(jArr, iArr, i3, jArr2, iArr2, sq1.T(j - j9, 1000000L, nm1Var2.c));
        }
        boolean z3 = nm1Var2.b == 1;
        boolean z4 = false;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            long[] jArr12 = nm1Var2.h;
            j2 = -1;
            if (i35 >= jArr12.length) {
                break;
            }
            long j10 = T;
            long j11 = nm1Var2.i[i35];
            if (j11 != -1) {
                jArr5 = jArr;
                iArr7 = iArr2;
                long T5 = sq1.T(jArr12[i35], nm1Var2.c, nm1Var2.d);
                int c2 = sq1.c(jArr2, j11, true, true);
                int c3 = sq1.c(jArr2, j11 + T5, z3, false);
                i33 += c3 - c2;
                z4 |= i34 != c2;
                i34 = c3;
            } else {
                jArr5 = jArr;
                iArr7 = iArr2;
            }
            i35++;
            jArr = jArr5;
            iArr2 = iArr7;
            T = j10;
        }
        long[] jArr13 = jArr;
        int[] iArr12 = iArr2;
        long j12 = T;
        boolean z5 = z4 | (i33 != i4);
        long[] jArr14 = z5 ? new long[i33] : jArr13;
        int[] iArr13 = z5 ? new int[i33] : iArr;
        int i36 = z5 ? 0 : i3;
        int[] iArr14 = z5 ? new int[i33] : iArr12;
        long[] jArr15 = new long[i33];
        int i37 = i36;
        int i38 = 0;
        int i39 = 0;
        while (true) {
            long[] jArr16 = nm1Var2.h;
            if (i39 >= jArr16.length) {
                break;
            }
            int[] iArr15 = iArr13;
            int[] iArr16 = iArr14;
            long j13 = nm1Var2.i[i39];
            long j14 = jArr16[i39];
            if (j13 != j2) {
                int i40 = i37;
                int c4 = sq1.c(jArr2, j13, true, true);
                int c5 = sq1.c(jArr2, sq1.T(j14, nm1Var2.c, nm1Var2.d) + j13, z3, false);
                if (z5) {
                    int i41 = c5 - c4;
                    jArr3 = jArr13;
                    System.arraycopy(jArr3, c4, jArr14, i38, i41);
                    iArr3 = iArr15;
                    System.arraycopy(iArr, c4, iArr3, i38, i41);
                    z2 = z3;
                    iArr5 = iArr12;
                    jArr4 = jArr14;
                    iArr6 = iArr16;
                    System.arraycopy(iArr5, c4, iArr6, i38, i41);
                } else {
                    jArr3 = jArr13;
                    iArr3 = iArr15;
                    z2 = z3;
                    iArr5 = iArr12;
                    jArr4 = jArr14;
                    iArr6 = iArr16;
                }
                int i42 = i40;
                while (c4 < c5) {
                    int[] iArr17 = iArr6;
                    int[] iArr18 = iArr5;
                    long j15 = j13;
                    jArr15[i38] = sq1.T(j3, 1000000L, nm1Var2.d) + sq1.T(jArr2[c4] - j13, 1000000L, nm1Var2.c);
                    if (z5 && iArr3[i38] > i42) {
                        i42 = iArr[c4];
                    }
                    i38++;
                    c4++;
                    iArr6 = iArr17;
                    iArr5 = iArr18;
                    j13 = j15;
                }
                iArr4 = iArr6;
                iArr12 = iArr5;
                i37 = i42;
            } else {
                jArr3 = jArr13;
                z2 = z3;
                iArr3 = iArr15;
                iArr4 = iArr16;
                jArr4 = jArr14;
            }
            j3 += j14;
            i39++;
            iArr14 = iArr4;
            jArr13 = jArr3;
            iArr13 = iArr3;
            z3 = z2;
            jArr14 = jArr4;
            j2 = -1;
        }
        long[] jArr17 = jArr13;
        long[] jArr18 = jArr14;
        int[] iArr19 = iArr13;
        int i43 = i37;
        long T6 = sq1.T(j3, 1000000L, nm1Var2.c);
        boolean z6 = false;
        for (int i44 = 0; i44 < iArr14.length && !z6; i44++) {
            z6 |= (iArr14[i44] & 1) != 0;
        }
        if (z6) {
            return new tm1(jArr18, iArr19, i43, jArr15, iArr14, T6);
        }
        sq1.V(jArr2, 1000000L, nm1Var2.c);
        return new tm1(jArr17, iArr, i3, jArr2, iArr12, j12);
    }

    public static c r(rv0 rv0Var, int i, int i2, String str, DrmInitData drmInitData, boolean z) {
        rv0Var.J(12);
        int i3 = rv0Var.i();
        c cVar = new c(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            int c2 = rv0Var.c();
            int i5 = rv0Var.i();
            s6.b(i5 > 0, "childAtomSize should be positive");
            int i6 = rv0Var.i();
            if (i6 == b7.c || i6 == b7.d || i6 == b7.a0 || i6 == b7.m0 || i6 == b7.e || i6 == b7.f || i6 == b7.g || i6 == b7.L0 || i6 == b7.M0) {
                w(rv0Var, i6, c2, i5, i, i2, drmInitData, cVar, i4);
            } else if (i6 == b7.j || i6 == b7.b0 || i6 == b7.o || i6 == b7.q || i6 == b7.s || i6 == b7.v || i6 == b7.t || i6 == b7.u || i6 == b7.z0 || i6 == b7.A0 || i6 == b7.m || i6 == b7.n || i6 == b7.k || i6 == b7.P0) {
                c(rv0Var, i6, c2, i5, i, str, z, drmInitData, cVar, i4);
            } else if (i6 == b7.k0 || i6 == b7.v0 || i6 == b7.w0 || i6 == b7.x0 || i6 == b7.y0) {
                s(rv0Var, i6, c2, i5, i, str, cVar);
            } else if (i6 == b7.O0) {
                cVar.b = Format.y(Integer.toString(i), "application/x-camera-motion", null, -1, null);
            }
            rv0Var.J(c2 + i5);
        }
        return cVar;
    }

    public static void s(rv0 rv0Var, int i, int i2, int i3, int i4, String str, c cVar) {
        rv0Var.J(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        List list = null;
        long j = Long.MAX_VALUE;
        if (i != b7.k0) {
            if (i == b7.v0) {
                int i5 = (i3 - 8) - 8;
                byte[] bArr = new byte[i5];
                rv0Var.g(bArr, 0, i5);
                list = Collections.singletonList(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == b7.w0) {
                str2 = "application/x-mp4-vtt";
            } else if (i == b7.x0) {
                j = 0;
            } else if (i != b7.y0) {
                throw new IllegalStateException();
            } else {
                cVar.d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        cVar.b = Format.E(Integer.toString(i4), str2, null, -1, 0, str, -1, null, j, list);
    }

    public static f t(rv0 rv0Var) {
        boolean z;
        rv0Var.J(8);
        int c2 = b7.c(rv0Var.i());
        rv0Var.K(c2 == 0 ? 8 : 16);
        int i = rv0Var.i();
        rv0Var.K(4);
        int c3 = rv0Var.c();
        int i2 = c2 == 0 ? 4 : 8;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                z = true;
                break;
            } else if (rv0Var.a[c3 + i4] != -1) {
                z = false;
                break;
            } else {
                i4++;
            }
        }
        long j = -9223372036854775807L;
        if (z) {
            rv0Var.K(i2);
        } else {
            long z2 = c2 == 0 ? rv0Var.z() : rv0Var.C();
            if (z2 != 0) {
                j = z2;
            }
        }
        rv0Var.K(16);
        int i5 = rv0Var.i();
        int i6 = rv0Var.i();
        rv0Var.K(4);
        int i7 = rv0Var.i();
        int i8 = rv0Var.i();
        if (i5 == 0 && i6 == 65536 && i7 == -65536 && i8 == 0) {
            i3 = 90;
        } else if (i5 == 0 && i6 == -65536 && i7 == 65536 && i8 == 0) {
            i3 = 270;
        } else if (i5 == -65536 && i6 == 0 && i7 == 0 && i8 == -65536) {
            i3 = 180;
        }
        return new f(i, j, i3);
    }

    public static nm1 u(b7.a aVar, b7.b bVar, long j, DrmInitData drmInitData, boolean z, boolean z2) {
        b7.b bVar2;
        long j2;
        long[] jArr;
        long[] jArr2;
        b7.a f2 = aVar.f(b7.F);
        int h = h(f2.g(b7.T).Q0);
        if (h == -1) {
            return null;
        }
        f t = t(aVar.g(b7.P).Q0);
        if (j == -9223372036854775807L) {
            bVar2 = bVar;
            j2 = t.b;
        } else {
            bVar2 = bVar;
            j2 = j;
        }
        long l = l(bVar2.Q0);
        long T = j2 != -9223372036854775807L ? sq1.T(j2, 1000000L, l) : -9223372036854775807L;
        b7.a f3 = f2.f(b7.G).f(b7.H);
        Pair<Long, String> j3 = j(f2.g(b7.S).Q0);
        c r = r(f3.g(b7.U).Q0, t.a, t.c, (String) j3.second, drmInitData, z2);
        if (z) {
            jArr = null;
            jArr2 = null;
        } else {
            Pair<long[], long[]> e2 = e(aVar.f(b7.Q));
            jArr2 = (long[]) e2.second;
            jArr = (long[]) e2.first;
        }
        if (r.b == null) {
            return null;
        }
        return new nm1(t.a, h, ((Long) j3.first).longValue(), l, T, r.b, r.d, r.a, r.c, jArr, jArr2);
    }

    public static Metadata v(b7.b bVar, boolean z) {
        if (z) {
            return null;
        }
        rv0 rv0Var = bVar.Q0;
        rv0Var.J(8);
        while (rv0Var.a() >= 8) {
            int c2 = rv0Var.c();
            int i = rv0Var.i();
            if (rv0Var.i() == b7.C0) {
                rv0Var.J(c2);
                return k(rv0Var, c2 + i);
            }
            rv0Var.K(i - 8);
        }
        return null;
    }

    public static void w(rv0 rv0Var, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, c cVar, int i6) {
        DrmInitData drmInitData2 = drmInitData;
        rv0Var.J(i2 + 8 + 8);
        rv0Var.K(16);
        int D = rv0Var.D();
        int D2 = rv0Var.D();
        rv0Var.K(50);
        int c2 = rv0Var.c();
        String str = null;
        int i7 = i;
        if (i7 == b7.a0) {
            Pair<Integer, pm1> o = o(rv0Var, i2, i3);
            if (o != null) {
                i7 = ((Integer) o.first).intValue();
                drmInitData2 = drmInitData2 == null ? null : drmInitData2.c(((pm1) o.second).b);
                cVar.a[i6] = (pm1) o.second;
            }
            rv0Var.J(c2);
        }
        DrmInitData drmInitData3 = drmInitData2;
        List<byte[]> list = null;
        byte[] bArr = null;
        boolean z = false;
        float f2 = 1.0f;
        int i8 = -1;
        while (c2 - i2 < i3) {
            rv0Var.J(c2);
            int c3 = rv0Var.c();
            int i9 = rv0Var.i();
            if (i9 == 0 && rv0Var.c() - i2 == i3) {
                break;
            }
            s6.b(i9 > 0, "childAtomSize should be positive");
            int i10 = rv0Var.i();
            if (i10 == b7.I) {
                s6.f(str == null);
                rv0Var.J(c3 + 8);
                y9 b2 = y9.b(rv0Var);
                list = b2.a;
                cVar.c = b2.b;
                if (!z) {
                    f2 = b2.e;
                }
                str = "video/avc";
            } else if (i10 == b7.J) {
                s6.f(str == null);
                rv0Var.J(c3 + 8);
                cb0 a2 = cb0.a(rv0Var);
                list = a2.a;
                cVar.c = a2.b;
                str = "video/hevc";
            } else if (i10 == b7.N0) {
                s6.f(str == null);
                str = i7 == b7.L0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
            } else if (i10 == b7.h) {
                s6.f(str == null);
                str = "video/3gpp";
            } else if (i10 == b7.K) {
                s6.f(str == null);
                Pair<String, byte[]> f3 = f(rv0Var, c3);
                str = (String) f3.first;
                list = Collections.singletonList(f3.second);
            } else if (i10 == b7.j0) {
                f2 = m(rv0Var, c3);
                z = true;
            } else if (i10 == b7.J0) {
                bArr = n(rv0Var, c3, i9);
            } else if (i10 == b7.I0) {
                int x = rv0Var.x();
                rv0Var.K(3);
                if (x == 0) {
                    int x2 = rv0Var.x();
                    if (x2 == 0) {
                        i8 = 0;
                    } else if (x2 == 1) {
                        i8 = 1;
                    } else if (x2 == 2) {
                        i8 = 2;
                    } else if (x2 == 3) {
                        i8 = 3;
                    }
                }
            }
            c2 += i9;
        }
        if (str == null) {
            return;
        }
        cVar.b = Format.I(Integer.toString(i4), str, null, -1, -1, D, D2, -1.0f, list, i5, f2, bArr, i8, null, drmInitData3);
    }
}
