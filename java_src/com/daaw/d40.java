package com.daaw;

import android.util.Pair;
import android.util.SparseArray;
import com.daaw.b7;
import com.daaw.sm1;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class d40 implements zz {
    public static final e00 H = new a();
    public static final int I = sq1.v("seig");
    public static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final Format K = Format.x(null, "application/x-emsg", Long.MAX_VALUE);
    public int A;
    public int B;
    public boolean C;
    public d00 D;
    public sm1[] E;
    public sm1[] F;
    public boolean G;
    public final int a;
    public final nm1 b;
    public final List<Format> c;
    public final DrmInitData d;
    public final SparseArray<c> e;
    public final rv0 f;
    public final rv0 g;
    public final rv0 h;
    public final ol1 i;
    public final rv0 j;
    public final byte[] k;
    public final ArrayDeque<b7.a> l;
    public final ArrayDeque<b> m;
    public final sm1 n;
    public int o;
    public int p;
    public long q;
    public int r;
    public rv0 s;
    public long t;
    public int u;
    public long v;
    public long w;
    public long x;
    public c y;
    public int z;

    /* loaded from: classes.dex */
    public static class a implements e00 {
        @Override // com.daaw.e00
        public zz[] a() {
            return new zz[]{new d40()};
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final long a;
        public final int b;

        public b(long j, int i) {
            this.a = j;
            this.b = i;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final sm1 a;
        public nm1 c;
        public qr d;
        public int e;
        public int f;
        public int g;
        public int h;
        public final qm1 b = new qm1();
        public final rv0 i = new rv0(1);
        public final rv0 j = new rv0();

        public c(sm1 sm1Var) {
            this.a = sm1Var;
        }

        public final pm1 b() {
            qm1 qm1Var = this.b;
            int i = qm1Var.a.a;
            pm1 pm1Var = qm1Var.o;
            return pm1Var != null ? pm1Var : this.c.a(i);
        }

        public void c(nm1 nm1Var, qr qrVar) {
            this.c = (nm1) s6.e(nm1Var);
            this.d = (qr) s6.e(qrVar);
            this.a.d(nm1Var.f);
            f();
        }

        public boolean d() {
            this.e++;
            int i = this.f + 1;
            this.f = i;
            int[] iArr = this.b.h;
            int i2 = this.g;
            if (i == iArr[i2]) {
                this.g = i2 + 1;
                this.f = 0;
                return false;
            }
            return true;
        }

        public int e() {
            rv0 rv0Var;
            if (this.b.m) {
                pm1 b = b();
                int i = b.d;
                if (i != 0) {
                    rv0Var = this.b.q;
                } else {
                    byte[] bArr = b.e;
                    this.j.H(bArr, bArr.length);
                    rv0 rv0Var2 = this.j;
                    i = bArr.length;
                    rv0Var = rv0Var2;
                }
                boolean z = this.b.n[this.e];
                rv0 rv0Var3 = this.i;
                rv0Var3.a[0] = (byte) ((z ? 128 : 0) | i);
                rv0Var3.J(0);
                this.a.c(this.i, 1);
                this.a.c(rv0Var, i);
                if (z) {
                    rv0 rv0Var4 = this.b.q;
                    int D = rv0Var4.D();
                    rv0Var4.K(-2);
                    int i2 = (D * 6) + 2;
                    this.a.c(rv0Var4, i2);
                    return i + 1 + i2;
                }
                return i + 1;
            }
            return 0;
        }

        public void f() {
            this.b.f();
            this.e = 0;
            this.g = 0;
            this.f = 0;
            this.h = 0;
        }

        public void g(long j) {
            long b = dd.b(j);
            int i = this.e;
            while (true) {
                qm1 qm1Var = this.b;
                if (i >= qm1Var.f || qm1Var.c(i) >= b) {
                    return;
                }
                if (this.b.l[i]) {
                    this.h = i;
                }
                i++;
            }
        }

        public final void h() {
            qm1 qm1Var = this.b;
            if (qm1Var.m) {
                rv0 rv0Var = qm1Var.q;
                int i = b().d;
                if (i != 0) {
                    rv0Var.K(i);
                }
                if (this.b.n[this.e]) {
                    rv0Var.K(rv0Var.D() * 6);
                }
            }
        }

        public void i(DrmInitData drmInitData) {
            pm1 a = this.c.a(this.b.a.a);
            this.a.d(this.c.f.b(drmInitData.c(a != null ? a.b : null)));
        }
    }

    public d40() {
        this(0);
    }

    public d40(int i) {
        this(i, null);
    }

    public d40(int i, ol1 ol1Var) {
        this(i, ol1Var, null, null);
    }

    public d40(int i, ol1 ol1Var, nm1 nm1Var, DrmInitData drmInitData) {
        this(i, ol1Var, nm1Var, drmInitData, Collections.emptyList());
    }

    public d40(int i, ol1 ol1Var, nm1 nm1Var, DrmInitData drmInitData, List<Format> list) {
        this(i, ol1Var, nm1Var, drmInitData, list, null);
    }

    public d40(int i, ol1 ol1Var, nm1 nm1Var, DrmInitData drmInitData, List<Format> list, sm1 sm1Var) {
        this.a = i | (nm1Var != null ? 8 : 0);
        this.i = ol1Var;
        this.b = nm1Var;
        this.d = drmInitData;
        this.c = Collections.unmodifiableList(list);
        this.n = sm1Var;
        this.j = new rv0(16);
        this.f = new rv0(sr0.a);
        this.g = new rv0(5);
        this.h = new rv0();
        this.k = new byte[16];
        this.l = new ArrayDeque<>();
        this.m = new ArrayDeque<>();
        this.e = new SparseArray<>();
        this.w = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.x = -9223372036854775807L;
        b();
    }

    public static Pair<Integer, qr> A(rv0 rv0Var) {
        rv0Var.J(12);
        return Pair.create(Integer.valueOf(rv0Var.i()), new qr(rv0Var.B() - 1, rv0Var.B(), rv0Var.B(), rv0Var.i()));
    }

    public static int B(c cVar, int i, long j, int i2, rv0 rv0Var, int i3) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        rv0Var.J(8);
        int b2 = b7.b(rv0Var.i());
        nm1 nm1Var = cVar.c;
        qm1 qm1Var = cVar.b;
        qr qrVar = qm1Var.a;
        qm1Var.h[i] = rv0Var.B();
        long[] jArr = qm1Var.g;
        jArr[i] = qm1Var.c;
        if ((b2 & 1) != 0) {
            jArr[i] = jArr[i] + rv0Var.i();
        }
        boolean z5 = (b2 & 4) != 0;
        int i6 = qrVar.d;
        if (z5) {
            i6 = rv0Var.B();
        }
        boolean z6 = (b2 & 256) != 0;
        boolean z7 = (b2 & 512) != 0;
        boolean z8 = (b2 & NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV) != 0;
        boolean z9 = (b2 & 2048) != 0;
        long[] jArr2 = nm1Var.h;
        long j2 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            j2 = sq1.T(nm1Var.i[0], 1000L, nm1Var.c);
        }
        int[] iArr = qm1Var.i;
        int[] iArr2 = qm1Var.j;
        long[] jArr3 = qm1Var.k;
        boolean[] zArr = qm1Var.l;
        int i7 = i6;
        boolean z10 = nm1Var.b == 2 && (i2 & 1) != 0;
        int i8 = i3 + qm1Var.h[i];
        long j3 = nm1Var.c;
        long j4 = j2;
        long j5 = i > 0 ? qm1Var.s : j;
        int i9 = i3;
        while (i9 < i8) {
            int B = z6 ? rv0Var.B() : qrVar.b;
            if (z7) {
                z = z6;
                i4 = rv0Var.B();
            } else {
                z = z6;
                i4 = qrVar.c;
            }
            if (i9 == 0 && z5) {
                z2 = z5;
                i5 = i7;
            } else if (z8) {
                z2 = z5;
                i5 = rv0Var.i();
            } else {
                z2 = z5;
                i5 = qrVar.d;
            }
            boolean z11 = z9;
            if (z9) {
                z3 = z7;
                z4 = z8;
                iArr2[i9] = (int) ((rv0Var.i() * 1000) / j3);
            } else {
                z3 = z7;
                z4 = z8;
                iArr2[i9] = 0;
            }
            jArr3[i9] = sq1.T(j5, 1000L, j3) - j4;
            iArr[i9] = i4;
            zArr[i9] = ((i5 >> 16) & 1) == 0 && (!z10 || i9 == 0);
            i9++;
            j5 += B;
            j3 = j3;
            z6 = z;
            z5 = z2;
            z9 = z11;
            z7 = z3;
            z8 = z4;
        }
        qm1Var.s = j5;
        return i8;
    }

    public static void C(b7.a aVar, c cVar, long j, int i) {
        List<b7.b> list = aVar.R0;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            b7.b bVar = list.get(i4);
            if (bVar.a == b7.A) {
                rv0 rv0Var = bVar.Q0;
                rv0Var.J(12);
                int B = rv0Var.B();
                if (B > 0) {
                    i3 += B;
                    i2++;
                }
            }
        }
        cVar.g = 0;
        cVar.f = 0;
        cVar.e = 0;
        cVar.b.e(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            b7.b bVar2 = list.get(i7);
            if (bVar2.a == b7.A) {
                i6 = B(cVar, i5, j, i, bVar2.Q0, i6);
                i5++;
            }
        }
    }

    public static void D(rv0 rv0Var, qm1 qm1Var, byte[] bArr) {
        rv0Var.J(8);
        rv0Var.g(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            t(rv0Var, 16, qm1Var);
        }
    }

    public static boolean J(int i) {
        return i == b7.C || i == b7.E || i == b7.F || i == b7.G || i == b7.H || i == b7.L || i == b7.M || i == b7.N || i == b7.Q;
    }

    public static boolean K(int i) {
        return i == b7.T || i == b7.S || i == b7.D || i == b7.B || i == b7.U || i == b7.x || i == b7.y || i == b7.P || i == b7.z || i == b7.A || i == b7.V || i == b7.d0 || i == b7.e0 || i == b7.i0 || i == b7.h0 || i == b7.f0 || i == b7.g0 || i == b7.R || i == b7.O || i == b7.H0;
    }

    public static DrmInitData e(List<b7.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            b7.b bVar = list.get(i);
            if (bVar.a == b7.V) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.Q0.a;
                UUID e = d01.e(bArr);
                if (e != null) {
                    arrayList.add(new DrmInitData.SchemeData(e, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    public static c g(SparseArray<c> sparseArray) {
        int size = sparseArray.size();
        c cVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            c valueAt = sparseArray.valueAt(i);
            int i2 = valueAt.g;
            qm1 qm1Var = valueAt.b;
            if (i2 != qm1Var.e) {
                long j2 = qm1Var.g[i2];
                if (j2 < j) {
                    cVar = valueAt;
                    j = j2;
                }
            }
        }
        return cVar;
    }

    public static long p(rv0 rv0Var) {
        rv0Var.J(8);
        return b7.c(rv0Var.i()) == 0 ? rv0Var.z() : rv0Var.C();
    }

    public static void q(b7.a aVar, SparseArray<c> sparseArray, int i, byte[] bArr) {
        int size = aVar.S0.size();
        for (int i2 = 0; i2 < size; i2++) {
            b7.a aVar2 = aVar.S0.get(i2);
            if (aVar2.a == b7.M) {
                z(aVar2, sparseArray, i, bArr);
            }
        }
    }

    public static void r(rv0 rv0Var, qm1 qm1Var) {
        rv0Var.J(8);
        int i = rv0Var.i();
        if ((b7.b(i) & 1) == 1) {
            rv0Var.K(8);
        }
        int B = rv0Var.B();
        if (B == 1) {
            qm1Var.d += b7.c(i) == 0 ? rv0Var.z() : rv0Var.C();
            return;
        }
        throw new tv0("Unexpected saio entry count: " + B);
    }

    public static void s(pm1 pm1Var, rv0 rv0Var, qm1 qm1Var) {
        int i;
        int i2 = pm1Var.d;
        rv0Var.J(8);
        if ((b7.b(rv0Var.i()) & 1) == 1) {
            rv0Var.K(8);
        }
        int x = rv0Var.x();
        int B = rv0Var.B();
        if (B != qm1Var.f) {
            throw new tv0("Length mismatch: " + B + ", " + qm1Var.f);
        }
        if (x == 0) {
            boolean[] zArr = qm1Var.n;
            i = 0;
            for (int i3 = 0; i3 < B; i3++) {
                int x2 = rv0Var.x();
                i += x2;
                zArr[i3] = x2 > i2;
            }
        } else {
            i = (x * B) + 0;
            Arrays.fill(qm1Var.n, 0, B, x > i2);
        }
        qm1Var.d(i);
    }

    public static void t(rv0 rv0Var, int i, qm1 qm1Var) {
        rv0Var.J(i + 8);
        int b2 = b7.b(rv0Var.i());
        if ((b2 & 1) != 0) {
            throw new tv0("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (b2 & 2) != 0;
        int B = rv0Var.B();
        if (B == qm1Var.f) {
            Arrays.fill(qm1Var.n, 0, B, z);
            qm1Var.d(rv0Var.a());
            qm1Var.b(rv0Var);
            return;
        }
        throw new tv0("Length mismatch: " + B + ", " + qm1Var.f);
    }

    public static void u(rv0 rv0Var, qm1 qm1Var) {
        t(rv0Var, 0, qm1Var);
    }

    public static void v(rv0 rv0Var, rv0 rv0Var2, String str, qm1 qm1Var) {
        byte[] bArr;
        rv0Var.J(8);
        int i = rv0Var.i();
        int i2 = rv0Var.i();
        int i3 = I;
        if (i2 != i3) {
            return;
        }
        if (b7.c(i) == 1) {
            rv0Var.K(4);
        }
        if (rv0Var.i() != 1) {
            throw new tv0("Entry count in sbgp != 1 (unsupported).");
        }
        rv0Var2.J(8);
        int i4 = rv0Var2.i();
        if (rv0Var2.i() != i3) {
            return;
        }
        int c2 = b7.c(i4);
        if (c2 == 1) {
            if (rv0Var2.z() == 0) {
                throw new tv0("Variable length description in sgpd found (unsupported)");
            }
        } else if (c2 >= 2) {
            rv0Var2.K(4);
        }
        if (rv0Var2.z() != 1) {
            throw new tv0("Entry count in sgpd != 1 (unsupported).");
        }
        rv0Var2.K(1);
        int x = rv0Var2.x();
        int i5 = (x & 240) >> 4;
        int i6 = x & 15;
        boolean z = rv0Var2.x() == 1;
        if (z) {
            int x2 = rv0Var2.x();
            byte[] bArr2 = new byte[16];
            rv0Var2.g(bArr2, 0, 16);
            if (z && x2 == 0) {
                int x3 = rv0Var2.x();
                byte[] bArr3 = new byte[x3];
                rv0Var2.g(bArr3, 0, x3);
                bArr = bArr3;
            } else {
                bArr = null;
            }
            qm1Var.m = true;
            qm1Var.o = new pm1(z, str, x2, bArr2, i5, i6, bArr);
        }
    }

    public static Pair<Long, hf> w(rv0 rv0Var, long j) {
        long C;
        long C2;
        rv0Var.J(8);
        int c2 = b7.c(rv0Var.i());
        rv0Var.K(4);
        long z = rv0Var.z();
        if (c2 == 0) {
            C = rv0Var.z();
            C2 = rv0Var.z();
        } else {
            C = rv0Var.C();
            C2 = rv0Var.C();
        }
        long j2 = C;
        long j3 = j + C2;
        long T = sq1.T(j2, 1000000L, z);
        rv0Var.K(2);
        int D = rv0Var.D();
        int[] iArr = new int[D];
        long[] jArr = new long[D];
        long[] jArr2 = new long[D];
        long[] jArr3 = new long[D];
        long j4 = j2;
        long j5 = T;
        int i = 0;
        while (i < D) {
            int i2 = rv0Var.i();
            if ((i2 & Integer.MIN_VALUE) != 0) {
                throw new tv0("Unhandled indirect reference");
            }
            long z2 = rv0Var.z();
            iArr[i] = i2 & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j5;
            long j6 = j4 + z2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i3 = D;
            int[] iArr2 = iArr;
            long T2 = sq1.T(j6, 1000000L, z);
            jArr4[i] = T2 - jArr5[i];
            rv0Var.K(4);
            j3 += iArr2[i];
            i++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            D = i3;
            j4 = j6;
            j5 = T2;
        }
        return Pair.create(Long.valueOf(T), new hf(iArr, jArr, jArr2, jArr3));
    }

    public static long x(rv0 rv0Var) {
        rv0Var.J(8);
        return b7.c(rv0Var.i()) == 1 ? rv0Var.C() : rv0Var.z();
    }

    public static c y(rv0 rv0Var, SparseArray<c> sparseArray, int i) {
        rv0Var.J(8);
        int b2 = b7.b(rv0Var.i());
        int i2 = rv0Var.i();
        if ((i & 8) != 0) {
            i2 = 0;
        }
        c cVar = sparseArray.get(i2);
        if (cVar == null) {
            return null;
        }
        if ((b2 & 1) != 0) {
            long C = rv0Var.C();
            qm1 qm1Var = cVar.b;
            qm1Var.c = C;
            qm1Var.d = C;
        }
        qr qrVar = cVar.d;
        cVar.b.a = new qr((b2 & 2) != 0 ? rv0Var.B() - 1 : qrVar.a, (b2 & 8) != 0 ? rv0Var.B() : qrVar.b, (b2 & 16) != 0 ? rv0Var.B() : qrVar.c, (b2 & 32) != 0 ? rv0Var.B() : qrVar.d);
        return cVar;
    }

    public static void z(b7.a aVar, SparseArray<c> sparseArray, int i, byte[] bArr) {
        c y = y(aVar.g(b7.y).Q0, sparseArray, i);
        if (y == null) {
            return;
        }
        qm1 qm1Var = y.b;
        long j = qm1Var.s;
        y.f();
        int i2 = b7.x;
        if (aVar.g(i2) != null && (i & 2) == 0) {
            j = x(aVar.g(i2).Q0);
        }
        C(aVar, y, j, i);
        pm1 a2 = y.c.a(qm1Var.a.a);
        b7.b g = aVar.g(b7.d0);
        if (g != null) {
            s(a2, g.Q0, qm1Var);
        }
        b7.b g2 = aVar.g(b7.e0);
        if (g2 != null) {
            r(g2.Q0, qm1Var);
        }
        b7.b g3 = aVar.g(b7.i0);
        if (g3 != null) {
            u(g3.Q0, qm1Var);
        }
        b7.b g4 = aVar.g(b7.f0);
        b7.b g5 = aVar.g(b7.g0);
        if (g4 != null && g5 != null) {
            v(g4.Q0, g5.Q0, a2 != null ? a2.b : null, qm1Var);
        }
        int size = aVar.R0.size();
        for (int i3 = 0; i3 < size; i3++) {
            b7.b bVar = aVar.R0.get(i3);
            if (bVar.a == b7.h0) {
                D(bVar.Q0, qm1Var, bArr);
            }
        }
    }

    public final void E(long j) {
        while (!this.l.isEmpty() && this.l.peek().Q0 == j) {
            j(this.l.pop());
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(com.daaw.a00 r9) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.d40.F(com.daaw.a00):boolean");
    }

    public final void G(a00 a00Var) {
        int i = ((int) this.q) - this.r;
        rv0 rv0Var = this.s;
        if (rv0Var != null) {
            a00Var.f(rv0Var.a, 8, i);
            l(new b7.b(this.p, this.s), a00Var.getPosition());
        } else {
            a00Var.j(i);
        }
        E(a00Var.getPosition());
    }

    public final void H(a00 a00Var) {
        int size = this.e.size();
        c cVar = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            qm1 qm1Var = this.e.valueAt(i).b;
            if (qm1Var.r) {
                long j2 = qm1Var.d;
                if (j2 < j) {
                    cVar = this.e.valueAt(i);
                    j = j2;
                }
            }
        }
        if (cVar == null) {
            this.o = 3;
            return;
        }
        int position = (int) (j - a00Var.getPosition());
        if (position < 0) {
            throw new tv0("Offset to encryption data was negative.");
        }
        a00Var.j(position);
        cVar.b.a(a00Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.daaw.sm1] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    public final boolean I(a00 a00Var) {
        ?? r13;
        sm1.a aVar;
        int b2;
        int i = 4;
        int i2 = 1;
        int i3 = 0;
        if (this.o == 3) {
            if (this.y == null) {
                c g = g(this.e);
                if (g == null) {
                    int position = (int) (this.t - a00Var.getPosition());
                    if (position >= 0) {
                        a00Var.j(position);
                        b();
                        return false;
                    }
                    throw new tv0("Offset to end of mdat was negative.");
                }
                int position2 = (int) (g.b.g[g.g] - a00Var.getPosition());
                if (position2 < 0) {
                    position2 = 0;
                }
                a00Var.j(position2);
                this.y = g;
            }
            c cVar = this.y;
            int[] iArr = cVar.b.i;
            int i4 = cVar.e;
            int i5 = iArr[i4];
            this.z = i5;
            if (i4 < cVar.h) {
                a00Var.j(i5);
                this.y.h();
                if (!this.y.d()) {
                    this.y = null;
                }
                this.o = 3;
                return true;
            }
            if (cVar.c.g == 1) {
                this.z = i5 - 8;
                a00Var.j(8);
            }
            int e = this.y.e();
            this.A = e;
            this.z += e;
            this.o = 4;
            this.B = 0;
        }
        c cVar2 = this.y;
        qm1 qm1Var = cVar2.b;
        nm1 nm1Var = cVar2.c;
        ?? r10 = cVar2.a;
        int i6 = cVar2.e;
        int i7 = nm1Var.j;
        if (i7 == 0) {
            while (true) {
                int i8 = this.A;
                int i9 = this.z;
                if (i8 >= i9) {
                    break;
                }
                this.A += r10.b(a00Var, i9 - i8, false);
            }
        } else {
            byte[] bArr = this.g.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i10 = i7 + 1;
            int i11 = 4 - i7;
            while (this.A < this.z) {
                int i12 = this.B;
                if (i12 == 0) {
                    a00Var.f(bArr, i11, i10);
                    this.g.J(i3);
                    this.B = this.g.B() - i2;
                    this.f.J(i3);
                    r10.c(this.f, i);
                    r10.c(this.g, i2);
                    this.C = this.F.length > 0 && sr0.g(nm1Var.f.u, bArr[i]);
                    this.A += 5;
                    this.z += i11;
                } else {
                    if (this.C) {
                        this.h.G(i12);
                        a00Var.f(this.h.a, i3, this.B);
                        r10.c(this.h, this.B);
                        b2 = this.B;
                        rv0 rv0Var = this.h;
                        int k = sr0.k(rv0Var.a, rv0Var.d());
                        this.h.J("video/hevc".equals(nm1Var.f.u) ? 1 : 0);
                        this.h.I(k);
                        oe.a(qm1Var.c(i6) * 1000, this.h, this.F);
                    } else {
                        b2 = r10.b(a00Var, i12, false);
                    }
                    this.A += b2;
                    this.B -= b2;
                    i = 4;
                    i2 = 1;
                    i3 = 0;
                }
            }
        }
        long c2 = qm1Var.c(i6) * 1000;
        ol1 ol1Var = this.i;
        if (ol1Var != null) {
            c2 = ol1Var.a(c2);
        }
        boolean z = qm1Var.l[i6];
        if (qm1Var.m) {
            boolean z2 = z | true;
            pm1 pm1Var = qm1Var.o;
            if (pm1Var == null) {
                pm1Var = nm1Var.a(qm1Var.a.a);
            }
            r13 = z2;
            aVar = pm1Var.c;
        } else {
            r13 = z;
            aVar = null;
        }
        r10.a(c2, r13, this.z, 0, aVar);
        o(c2);
        if (!this.y.d()) {
            this.y = null;
        }
        this.o = 3;
        return true;
    }

    @Override // com.daaw.zz
    public void a() {
    }

    public final void b() {
        this.o = 0;
        this.r = 0;
    }

    @Override // com.daaw.zz
    public boolean c(a00 a00Var) {
        return be1.b(a00Var);
    }

    @Override // com.daaw.zz
    public int d(a00 a00Var, iy0 iy0Var) {
        while (true) {
            int i = this.o;
            if (i != 0) {
                if (i == 1) {
                    G(a00Var);
                } else if (i == 2) {
                    H(a00Var);
                } else if (I(a00Var)) {
                    return 0;
                }
            } else if (!F(a00Var)) {
                return -1;
            }
        }
    }

    @Override // com.daaw.zz
    public void f(long j, long j2) {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            this.e.valueAt(i).f();
        }
        this.m.clear();
        this.u = 0;
        this.v = j2;
        this.l.clear();
        b();
    }

    public final void h() {
        int i;
        if (this.E == null) {
            sm1[] sm1VarArr = new sm1[2];
            this.E = sm1VarArr;
            sm1 sm1Var = this.n;
            if (sm1Var != null) {
                sm1VarArr[0] = sm1Var;
                i = 1;
            } else {
                i = 0;
            }
            if ((this.a & 4) != 0) {
                sm1VarArr[i] = this.D.a(this.e.size(), 4);
                i++;
            }
            sm1[] sm1VarArr2 = (sm1[]) Arrays.copyOf(this.E, i);
            this.E = sm1VarArr2;
            for (sm1 sm1Var2 : sm1VarArr2) {
                sm1Var2.d(K);
            }
        }
        if (this.F == null) {
            this.F = new sm1[this.c.size()];
            for (int i2 = 0; i2 < this.F.length; i2++) {
                sm1 a2 = this.D.a(this.e.size() + 1 + i2, 3);
                a2.d(this.c.get(i2));
                this.F[i2] = a2;
            }
        }
    }

    @Override // com.daaw.zz
    public void i(d00 d00Var) {
        this.D = d00Var;
        nm1 nm1Var = this.b;
        if (nm1Var != null) {
            c cVar = new c(d00Var.a(0, nm1Var.b));
            cVar.c(this.b, new qr(0, 0, 0, 0));
            this.e.put(0, cVar);
            h();
            this.D.n();
        }
    }

    public final void j(b7.a aVar) {
        int i = aVar.a;
        if (i == b7.C) {
            n(aVar);
        } else if (i == b7.L) {
            m(aVar);
        } else if (this.l.isEmpty()) {
        } else {
            this.l.peek().d(aVar);
        }
    }

    public final void k(rv0 rv0Var) {
        sm1[] sm1VarArr;
        sm1[] sm1VarArr2 = this.E;
        if (sm1VarArr2 == null || sm1VarArr2.length == 0) {
            return;
        }
        rv0Var.J(12);
        int a2 = rv0Var.a();
        rv0Var.r();
        rv0Var.r();
        long T = sq1.T(rv0Var.z(), 1000000L, rv0Var.z());
        for (sm1 sm1Var : this.E) {
            rv0Var.J(12);
            sm1Var.c(rv0Var, a2);
        }
        if (this.x == -9223372036854775807L) {
            this.m.addLast(new b(T, a2));
            this.u += a2;
            return;
        }
        for (sm1 sm1Var2 : this.E) {
            sm1Var2.a(this.x + T, 1, a2, 0, null);
        }
    }

    public final void l(b7.b bVar, long j) {
        if (!this.l.isEmpty()) {
            this.l.peek().e(bVar);
            return;
        }
        int i = bVar.a;
        if (i != b7.B) {
            if (i == b7.H0) {
                k(bVar.Q0);
                return;
            }
            return;
        }
        Pair<Long, hf> w = w(bVar.Q0, j);
        this.x = ((Long) w.first).longValue();
        this.D.d((da1) w.second);
        this.G = true;
    }

    public final void m(b7.a aVar) {
        q(aVar, this.e, this.a, this.k);
        DrmInitData e = this.d != null ? null : e(aVar.R0);
        if (e != null) {
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                this.e.valueAt(i).i(e);
            }
        }
        if (this.v != -9223372036854775807L) {
            int size2 = this.e.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.e.valueAt(i2).g(this.v);
            }
            this.v = -9223372036854775807L;
        }
    }

    public final void n(b7.a aVar) {
        int i;
        int i2;
        int i3 = 0;
        s6.g(this.b == null, "Unexpected moov box.");
        DrmInitData drmInitData = this.d;
        if (drmInitData == null) {
            drmInitData = e(aVar.R0);
        }
        b7.a f = aVar.f(b7.N);
        SparseArray sparseArray = new SparseArray();
        int size = f.R0.size();
        long j = -9223372036854775807L;
        for (int i4 = 0; i4 < size; i4++) {
            b7.b bVar = f.R0.get(i4);
            int i5 = bVar.a;
            if (i5 == b7.z) {
                Pair<Integer, qr> A = A(bVar.Q0);
                sparseArray.put(((Integer) A.first).intValue(), A.second);
            } else if (i5 == b7.O) {
                j = p(bVar.Q0);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = aVar.S0.size();
        int i6 = 0;
        while (i6 < size2) {
            b7.a aVar2 = aVar.S0.get(i6);
            if (aVar2.a == b7.E) {
                i = i6;
                i2 = size2;
                nm1 u = c7.u(aVar2, aVar.g(b7.D), j, drmInitData, (this.a & 16) != 0, false);
                if (u != null) {
                    sparseArray2.put(u.a, u);
                }
            } else {
                i = i6;
                i2 = size2;
            }
            i6 = i + 1;
            size2 = i2;
        }
        int size3 = sparseArray2.size();
        if (this.e.size() != 0) {
            s6.f(this.e.size() == size3);
            while (i3 < size3) {
                nm1 nm1Var = (nm1) sparseArray2.valueAt(i3);
                this.e.get(nm1Var.a).c(nm1Var, (qr) sparseArray.get(nm1Var.a));
                i3++;
            }
            return;
        }
        while (i3 < size3) {
            nm1 nm1Var2 = (nm1) sparseArray2.valueAt(i3);
            c cVar = new c(this.D.a(i3, nm1Var2.b));
            cVar.c(nm1Var2, (qr) sparseArray.get(nm1Var2.a));
            this.e.put(nm1Var2.a, cVar);
            this.w = Math.max(this.w, nm1Var2.e);
            i3++;
        }
        h();
        this.D.n();
    }

    public final void o(long j) {
        while (!this.m.isEmpty()) {
            b removeFirst = this.m.removeFirst();
            this.u -= removeFirst.b;
            for (sm1 sm1Var : this.E) {
                sm1Var.a(removeFirst.a + j, 1, removeFirst.b, this.u, null);
            }
        }
    }
}
