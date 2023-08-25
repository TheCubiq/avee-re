package com.daaw;

import android.util.Pair;
import android.util.SparseArray;
import com.daaw.AbstractC0821b7;
import com.daaw.da1;
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
public final class d40 implements InterfaceC3919zz {

    /* renamed from: H */
    public static final e00 f6470H = new C1048a();

    /* renamed from: I */
    public static final int f6471I = sq1.m9994v("seig");

    /* renamed from: J */
    public static final byte[] f6472J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: K */
    public static final Format f6473K = Format.m1719x(null, "application/x-emsg", Long.MAX_VALUE);

    /* renamed from: A */
    public int f6474A;

    /* renamed from: B */
    public int f6475B;

    /* renamed from: C */
    public boolean f6476C;

    /* renamed from: D */
    public d00 f6477D;

    /* renamed from: E */
    public sm1[] f6478E;

    /* renamed from: F */
    public sm1[] f6479F;

    /* renamed from: G */
    public boolean f6480G;

    /* renamed from: a */
    public final int f6481a;

    /* renamed from: b */
    public final nm1 f6482b;

    /* renamed from: c */
    public final List<Format> f6483c;

    /* renamed from: d */
    public final DrmInitData f6484d;

    /* renamed from: e */
    public final SparseArray<C1050c> f6485e;

    /* renamed from: f */
    public final rv0 f6486f;

    /* renamed from: g */
    public final rv0 f6487g;

    /* renamed from: h */
    public final rv0 f6488h;

    /* renamed from: i */
    public final ol1 f6489i;

    /* renamed from: j */
    public final rv0 f6490j;

    /* renamed from: k */
    public final byte[] f6491k;

    /* renamed from: l */
    public final ArrayDeque<AbstractC0821b7.C0822a> f6492l;

    /* renamed from: m */
    public final ArrayDeque<C1049b> f6493m;

    /* renamed from: n */
    public final sm1 f6494n;

    /* renamed from: o */
    public int f6495o;

    /* renamed from: p */
    public int f6496p;

    /* renamed from: q */
    public long f6497q;

    /* renamed from: r */
    public int f6498r;

    /* renamed from: s */
    public rv0 f6499s;

    /* renamed from: t */
    public long f6500t;

    /* renamed from: u */
    public int f6501u;

    /* renamed from: v */
    public long f6502v;

    /* renamed from: w */
    public long f6503w;

    /* renamed from: x */
    public long f6504x;

    /* renamed from: y */
    public C1050c f6505y;

    /* renamed from: z */
    public int f6506z;

    /* renamed from: com.daaw.d40$a */
    /* loaded from: classes.dex */
    public static class C1048a implements e00 {
        @Override // com.daaw.e00
        /* renamed from: a */
        public InterfaceC3919zz[] mo4824a() {
            return new InterfaceC3919zz[]{new d40()};
        }
    }

    /* renamed from: com.daaw.d40$b */
    /* loaded from: classes.dex */
    public static final class C1049b {

        /* renamed from: a */
        public final long f6507a;

        /* renamed from: b */
        public final int f6508b;

        public C1049b(long j, int i) {
            this.f6507a = j;
            this.f6508b = i;
        }
    }

    /* renamed from: com.daaw.d40$c */
    /* loaded from: classes.dex */
    public static final class C1050c {

        /* renamed from: a */
        public final sm1 f6509a;

        /* renamed from: c */
        public nm1 f6511c;

        /* renamed from: d */
        public C2749qr f6512d;

        /* renamed from: e */
        public int f6513e;

        /* renamed from: f */
        public int f6514f;

        /* renamed from: g */
        public int f6515g;

        /* renamed from: h */
        public int f6516h;

        /* renamed from: b */
        public final qm1 f6510b = new qm1();

        /* renamed from: i */
        public final rv0 f6517i = new rv0(1);

        /* renamed from: j */
        public final rv0 f6518j = new rv0();

        public C1050c(sm1 sm1Var) {
            this.f6509a = sm1Var;
        }

        /* renamed from: b */
        public final pm1 m24664b() {
            qm1 qm1Var = this.f6510b;
            int i = qm1Var.f24164a.f24268a;
            pm1 pm1Var = qm1Var.f24178o;
            return pm1Var != null ? pm1Var : this.f6511c.m15041a(i);
        }

        /* renamed from: c */
        public void m24663c(nm1 nm1Var, C2749qr c2749qr) {
            this.f6511c = (nm1) C2914s6.m10686e(nm1Var);
            this.f6512d = (C2749qr) C2914s6.m10686e(c2749qr);
            this.f6509a.mo10156d(nm1Var.f20253f);
            m24660f();
        }

        /* renamed from: d */
        public boolean m24662d() {
            this.f6513e++;
            int i = this.f6514f + 1;
            this.f6514f = i;
            int[] iArr = this.f6510b.f24171h;
            int i2 = this.f6515g;
            if (i == iArr[i2]) {
                this.f6515g = i2 + 1;
                this.f6514f = 0;
                return false;
            }
            return true;
        }

        /* renamed from: e */
        public int m24661e() {
            rv0 rv0Var;
            if (this.f6510b.f24176m) {
                pm1 m24664b = m24664b();
                int i = m24664b.f23054d;
                if (i != 0) {
                    rv0Var = this.f6510b.f24180q;
                } else {
                    byte[] bArr = m24664b.f23055e;
                    this.f6518j.m10923H(bArr, bArr.length);
                    rv0 rv0Var2 = this.f6518j;
                    i = bArr.length;
                    rv0Var = rv0Var2;
                }
                boolean z = this.f6510b.f24177n[this.f6513e];
                rv0 rv0Var3 = this.f6517i;
                rv0Var3.f25637a[0] = (byte) ((z ? 128 : 0) | i);
                rv0Var3.m10921J(0);
                this.f6509a.mo10157c(this.f6517i, 1);
                this.f6509a.mo10157c(rv0Var, i);
                if (z) {
                    rv0 rv0Var4 = this.f6510b.f24180q;
                    int m10927D = rv0Var4.m10927D();
                    rv0Var4.m10920K(-2);
                    int i2 = (m10927D * 6) + 2;
                    this.f6509a.mo10157c(rv0Var4, i2);
                    return i + 1 + i2;
                }
                return i + 1;
            }
            return 0;
        }

        /* renamed from: f */
        public void m24660f() {
            this.f6510b.m12337f();
            this.f6513e = 0;
            this.f6515g = 0;
            this.f6514f = 0;
            this.f6516h = 0;
        }

        /* renamed from: g */
        public void m24659g(long j) {
            long m24526b = C1075dd.m24526b(j);
            int i = this.f6513e;
            while (true) {
                qm1 qm1Var = this.f6510b;
                if (i >= qm1Var.f24169f || qm1Var.m12340c(i) >= m24526b) {
                    return;
                }
                if (this.f6510b.f24175l[i]) {
                    this.f6516h = i;
                }
                i++;
            }
        }

        /* renamed from: h */
        public final void m24658h() {
            qm1 qm1Var = this.f6510b;
            if (qm1Var.f24176m) {
                rv0 rv0Var = qm1Var.f24180q;
                int i = m24664b().f23054d;
                if (i != 0) {
                    rv0Var.m10920K(i);
                }
                if (this.f6510b.f24177n[this.f6513e]) {
                    rv0Var.m10920K(rv0Var.m10927D() * 6);
                }
            }
        }

        /* renamed from: i */
        public void m24657i(DrmInitData drmInitData) {
            pm1 m15041a = this.f6511c.m15041a(this.f6510b.f24164a.f24268a);
            this.f6509a.mo10156d(this.f6511c.f20253f.m1731b(drmInitData.m1712c(m15041a != null ? m15041a.f23052b : null)));
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
        this.f6481a = i | (nm1Var != null ? 8 : 0);
        this.f6489i = ol1Var;
        this.f6482b = nm1Var;
        this.f6484d = drmInitData;
        this.f6483c = Collections.unmodifiableList(list);
        this.f6494n = sm1Var;
        this.f6490j = new rv0(16);
        this.f6486f = new rv0(sr0.f26545a);
        this.f6487g = new rv0(5);
        this.f6488h = new rv0();
        this.f6491k = new byte[16];
        this.f6492l = new ArrayDeque<>();
        this.f6493m = new ArrayDeque<>();
        this.f6485e = new SparseArray<>();
        this.f6503w = -9223372036854775807L;
        this.f6502v = -9223372036854775807L;
        this.f6504x = -9223372036854775807L;
        m24686b();
    }

    /* renamed from: A */
    public static Pair<Integer, C2749qr> m24697A(rv0 rv0Var) {
        rv0Var.m10921J(12);
        return Pair.create(Integer.valueOf(rv0Var.m10911i()), new C2749qr(rv0Var.m10929B() - 1, rv0Var.m10929B(), rv0Var.m10929B(), rv0Var.m10911i()));
    }

    /* renamed from: B */
    public static int m24696B(C1050c c1050c, int i, long j, int i2, rv0 rv0Var, int i3) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        rv0Var.m10921J(8);
        int m26447b = AbstractC0821b7.m26447b(rv0Var.m10911i());
        nm1 nm1Var = c1050c.f6511c;
        qm1 qm1Var = c1050c.f6510b;
        C2749qr c2749qr = qm1Var.f24164a;
        qm1Var.f24171h[i] = rv0Var.m10929B();
        long[] jArr = qm1Var.f24170g;
        jArr[i] = qm1Var.f24166c;
        if ((m26447b & 1) != 0) {
            jArr[i] = jArr[i] + rv0Var.m10911i();
        }
        boolean z5 = (m26447b & 4) != 0;
        int i6 = c2749qr.f24271d;
        if (z5) {
            i6 = rv0Var.m10929B();
        }
        boolean z6 = (m26447b & 256) != 0;
        boolean z7 = (m26447b & 512) != 0;
        boolean z8 = (m26447b & NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV) != 0;
        boolean z9 = (m26447b & 2048) != 0;
        long[] jArr2 = nm1Var.f20255h;
        long j2 = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            j2 = sq1.m10025T(nm1Var.f20256i[0], 1000L, nm1Var.f20250c);
        }
        int[] iArr = qm1Var.f24172i;
        int[] iArr2 = qm1Var.f24173j;
        long[] jArr3 = qm1Var.f24174k;
        boolean[] zArr = qm1Var.f24175l;
        int i7 = i6;
        boolean z10 = nm1Var.f20249b == 2 && (i2 & 1) != 0;
        int i8 = i3 + qm1Var.f24171h[i];
        long j3 = nm1Var.f20250c;
        long j4 = j2;
        long j5 = i > 0 ? qm1Var.f24182s : j;
        int i9 = i3;
        while (i9 < i8) {
            int m10929B = z6 ? rv0Var.m10929B() : c2749qr.f24269b;
            if (z7) {
                z = z6;
                i4 = rv0Var.m10929B();
            } else {
                z = z6;
                i4 = c2749qr.f24270c;
            }
            if (i9 == 0 && z5) {
                z2 = z5;
                i5 = i7;
            } else if (z8) {
                z2 = z5;
                i5 = rv0Var.m10911i();
            } else {
                z2 = z5;
                i5 = c2749qr.f24271d;
            }
            boolean z11 = z9;
            if (z9) {
                z3 = z7;
                z4 = z8;
                iArr2[i9] = (int) ((rv0Var.m10911i() * 1000) / j3);
            } else {
                z3 = z7;
                z4 = z8;
                iArr2[i9] = 0;
            }
            jArr3[i9] = sq1.m10025T(j5, 1000L, j3) - j4;
            iArr[i9] = i4;
            zArr[i9] = ((i5 >> 16) & 1) == 0 && (!z10 || i9 == 0);
            i9++;
            j5 += m10929B;
            j3 = j3;
            z6 = z;
            z5 = z2;
            z9 = z11;
            z7 = z3;
            z8 = z4;
        }
        qm1Var.f24182s = j5;
        return i8;
    }

    /* renamed from: C */
    public static void m24695C(AbstractC0821b7.C0822a c0822a, C1050c c1050c, long j, int i) {
        List<AbstractC0821b7.C0823b> list = c0822a.f4473R0;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0821b7.C0823b c0823b = list.get(i4);
            if (c0823b.f4471a == AbstractC0821b7.f4378A) {
                rv0 rv0Var = c0823b.f4475Q0;
                rv0Var.m10921J(12);
                int m10929B = rv0Var.m10929B();
                if (m10929B > 0) {
                    i3 += m10929B;
                    i2++;
                }
            }
        }
        c1050c.f6515g = 0;
        c1050c.f6514f = 0;
        c1050c.f6513e = 0;
        c1050c.f6510b.m12338e(i2, i3);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC0821b7.C0823b c0823b2 = list.get(i7);
            if (c0823b2.f4471a == AbstractC0821b7.f4378A) {
                i6 = m24696B(c1050c, i5, j, i, c0823b2.f4475Q0, i6);
                i5++;
            }
        }
    }

    /* renamed from: D */
    public static void m24694D(rv0 rv0Var, qm1 qm1Var, byte[] bArr) {
        rv0Var.m10921J(8);
        rv0Var.m10913g(bArr, 0, 16);
        if (Arrays.equals(bArr, f6472J)) {
            m24672t(rv0Var, 16, qm1Var);
        }
    }

    /* renamed from: J */
    public static boolean m24688J(int i) {
        return i == AbstractC0821b7.f4382C || i == AbstractC0821b7.f4386E || i == AbstractC0821b7.f4388F || i == AbstractC0821b7.f4390G || i == AbstractC0821b7.f4392H || i == AbstractC0821b7.f4400L || i == AbstractC0821b7.f4402M || i == AbstractC0821b7.f4404N || i == AbstractC0821b7.f4410Q;
    }

    /* renamed from: K */
    public static boolean m24687K(int i) {
        return i == AbstractC0821b7.f4413T || i == AbstractC0821b7.f4412S || i == AbstractC0821b7.f4384D || i == AbstractC0821b7.f4380B || i == AbstractC0821b7.f4414U || i == AbstractC0821b7.f4465x || i == AbstractC0821b7.f4467y || i == AbstractC0821b7.f4408P || i == AbstractC0821b7.f4469z || i == AbstractC0821b7.f4378A || i == AbstractC0821b7.f4415V || i == AbstractC0821b7.f4426d0 || i == AbstractC0821b7.f4428e0 || i == AbstractC0821b7.f4436i0 || i == AbstractC0821b7.f4434h0 || i == AbstractC0821b7.f4430f0 || i == AbstractC0821b7.f4432g0 || i == AbstractC0821b7.f4411R || i == AbstractC0821b7.f4406O || i == AbstractC0821b7.f4393H0;
    }

    /* renamed from: e */
    public static DrmInitData m24685e(List<AbstractC0821b7.C0823b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            AbstractC0821b7.C0823b c0823b = list.get(i);
            if (c0823b.f4471a == AbstractC0821b7.f4415V) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c0823b.f4475Q0.f25637a;
                UUID m24841e = d01.m24841e(bArr);
                if (m24841e != null) {
                    arrayList.add(new DrmInitData.SchemeData(m24841e, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    /* renamed from: g */
    public static C1050c m24684g(SparseArray<C1050c> sparseArray) {
        int size = sparseArray.size();
        C1050c c1050c = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            C1050c valueAt = sparseArray.valueAt(i);
            int i2 = valueAt.f6515g;
            qm1 qm1Var = valueAt.f6510b;
            if (i2 != qm1Var.f24168e) {
                long j2 = qm1Var.f24170g[i2];
                if (j2 < j) {
                    c1050c = valueAt;
                    j = j2;
                }
            }
        }
        return c1050c;
    }

    /* renamed from: p */
    public static long m24676p(rv0 rv0Var) {
        rv0Var.m10921J(8);
        return AbstractC0821b7.m26446c(rv0Var.m10911i()) == 0 ? rv0Var.m10894z() : rv0Var.m10928C();
    }

    /* renamed from: q */
    public static void m24675q(AbstractC0821b7.C0822a c0822a, SparseArray<C1050c> sparseArray, int i, byte[] bArr) {
        int size = c0822a.f4474S0.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0821b7.C0822a c0822a2 = c0822a.f4474S0.get(i2);
            if (c0822a2.f4471a == AbstractC0821b7.f4402M) {
                m24666z(c0822a2, sparseArray, i, bArr);
            }
        }
    }

    /* renamed from: r */
    public static void m24674r(rv0 rv0Var, qm1 qm1Var) {
        rv0Var.m10921J(8);
        int m10911i = rv0Var.m10911i();
        if ((AbstractC0821b7.m26447b(m10911i) & 1) == 1) {
            rv0Var.m10920K(8);
        }
        int m10929B = rv0Var.m10929B();
        if (m10929B == 1) {
            qm1Var.f24167d += AbstractC0821b7.m26446c(m10911i) == 0 ? rv0Var.m10894z() : rv0Var.m10928C();
            return;
        }
        throw new tv0("Unexpected saio entry count: " + m10929B);
    }

    /* renamed from: s */
    public static void m24673s(pm1 pm1Var, rv0 rv0Var, qm1 qm1Var) {
        int i;
        int i2 = pm1Var.f23054d;
        rv0Var.m10921J(8);
        if ((AbstractC0821b7.m26447b(rv0Var.m10911i()) & 1) == 1) {
            rv0Var.m10920K(8);
        }
        int m10896x = rv0Var.m10896x();
        int m10929B = rv0Var.m10929B();
        if (m10929B != qm1Var.f24169f) {
            throw new tv0("Length mismatch: " + m10929B + ", " + qm1Var.f24169f);
        }
        if (m10896x == 0) {
            boolean[] zArr = qm1Var.f24177n;
            i = 0;
            for (int i3 = 0; i3 < m10929B; i3++) {
                int m10896x2 = rv0Var.m10896x();
                i += m10896x2;
                zArr[i3] = m10896x2 > i2;
            }
        } else {
            i = (m10896x * m10929B) + 0;
            Arrays.fill(qm1Var.f24177n, 0, m10929B, m10896x > i2);
        }
        qm1Var.m12339d(i);
    }

    /* renamed from: t */
    public static void m24672t(rv0 rv0Var, int i, qm1 qm1Var) {
        rv0Var.m10921J(i + 8);
        int m26447b = AbstractC0821b7.m26447b(rv0Var.m10911i());
        if ((m26447b & 1) != 0) {
            throw new tv0("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (m26447b & 2) != 0;
        int m10929B = rv0Var.m10929B();
        if (m10929B == qm1Var.f24169f) {
            Arrays.fill(qm1Var.f24177n, 0, m10929B, z);
            qm1Var.m12339d(rv0Var.m10919a());
            qm1Var.m12341b(rv0Var);
            return;
        }
        throw new tv0("Length mismatch: " + m10929B + ", " + qm1Var.f24169f);
    }

    /* renamed from: u */
    public static void m24671u(rv0 rv0Var, qm1 qm1Var) {
        m24672t(rv0Var, 0, qm1Var);
    }

    /* renamed from: v */
    public static void m24670v(rv0 rv0Var, rv0 rv0Var2, String str, qm1 qm1Var) {
        byte[] bArr;
        rv0Var.m10921J(8);
        int m10911i = rv0Var.m10911i();
        int m10911i2 = rv0Var.m10911i();
        int i = f6471I;
        if (m10911i2 != i) {
            return;
        }
        if (AbstractC0821b7.m26446c(m10911i) == 1) {
            rv0Var.m10920K(4);
        }
        if (rv0Var.m10911i() != 1) {
            throw new tv0("Entry count in sbgp != 1 (unsupported).");
        }
        rv0Var2.m10921J(8);
        int m10911i3 = rv0Var2.m10911i();
        if (rv0Var2.m10911i() != i) {
            return;
        }
        int m26446c = AbstractC0821b7.m26446c(m10911i3);
        if (m26446c == 1) {
            if (rv0Var2.m10894z() == 0) {
                throw new tv0("Variable length description in sgpd found (unsupported)");
            }
        } else if (m26446c >= 2) {
            rv0Var2.m10920K(4);
        }
        if (rv0Var2.m10894z() != 1) {
            throw new tv0("Entry count in sgpd != 1 (unsupported).");
        }
        rv0Var2.m10920K(1);
        int m10896x = rv0Var2.m10896x();
        int i2 = (m10896x & 240) >> 4;
        int i3 = m10896x & 15;
        boolean z = rv0Var2.m10896x() == 1;
        if (z) {
            int m10896x2 = rv0Var2.m10896x();
            byte[] bArr2 = new byte[16];
            rv0Var2.m10913g(bArr2, 0, 16);
            if (z && m10896x2 == 0) {
                int m10896x3 = rv0Var2.m10896x();
                byte[] bArr3 = new byte[m10896x3];
                rv0Var2.m10913g(bArr3, 0, m10896x3);
                bArr = bArr3;
            } else {
                bArr = null;
            }
            qm1Var.f24176m = true;
            qm1Var.f24178o = new pm1(z, str, m10896x2, bArr2, i2, i3, bArr);
        }
    }

    /* renamed from: w */
    public static Pair<Long, C1533hf> m24669w(rv0 rv0Var, long j) {
        long m10928C;
        long m10928C2;
        rv0Var.m10921J(8);
        int m26446c = AbstractC0821b7.m26446c(rv0Var.m10911i());
        rv0Var.m10920K(4);
        long m10894z = rv0Var.m10894z();
        if (m26446c == 0) {
            m10928C = rv0Var.m10894z();
            m10928C2 = rv0Var.m10894z();
        } else {
            m10928C = rv0Var.m10928C();
            m10928C2 = rv0Var.m10928C();
        }
        long j2 = m10928C;
        long j3 = j + m10928C2;
        long m10025T = sq1.m10025T(j2, 1000000L, m10894z);
        rv0Var.m10920K(2);
        int m10927D = rv0Var.m10927D();
        int[] iArr = new int[m10927D];
        long[] jArr = new long[m10927D];
        long[] jArr2 = new long[m10927D];
        long[] jArr3 = new long[m10927D];
        long j4 = j2;
        long j5 = m10025T;
        int i = 0;
        while (i < m10927D) {
            int m10911i = rv0Var.m10911i();
            if ((m10911i & Integer.MIN_VALUE) != 0) {
                throw new tv0("Unhandled indirect reference");
            }
            long m10894z2 = rv0Var.m10894z();
            iArr[i] = m10911i & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j5;
            long j6 = j4 + m10894z2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i2 = m10927D;
            int[] iArr2 = iArr;
            long m10025T2 = sq1.m10025T(j6, 1000000L, m10894z);
            jArr4[i] = m10025T2 - jArr5[i];
            rv0Var.m10920K(4);
            j3 += iArr2[i];
            i++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            m10927D = i2;
            j4 = j6;
            j5 = m10025T2;
        }
        return Pair.create(Long.valueOf(m10025T), new C1533hf(iArr, jArr, jArr2, jArr3));
    }

    /* renamed from: x */
    public static long m24668x(rv0 rv0Var) {
        rv0Var.m10921J(8);
        return AbstractC0821b7.m26446c(rv0Var.m10911i()) == 1 ? rv0Var.m10928C() : rv0Var.m10894z();
    }

    /* renamed from: y */
    public static C1050c m24667y(rv0 rv0Var, SparseArray<C1050c> sparseArray, int i) {
        rv0Var.m10921J(8);
        int m26447b = AbstractC0821b7.m26447b(rv0Var.m10911i());
        int m10911i = rv0Var.m10911i();
        if ((i & 8) != 0) {
            m10911i = 0;
        }
        C1050c c1050c = sparseArray.get(m10911i);
        if (c1050c == null) {
            return null;
        }
        if ((m26447b & 1) != 0) {
            long m10928C = rv0Var.m10928C();
            qm1 qm1Var = c1050c.f6510b;
            qm1Var.f24166c = m10928C;
            qm1Var.f24167d = m10928C;
        }
        C2749qr c2749qr = c1050c.f6512d;
        c1050c.f6510b.f24164a = new C2749qr((m26447b & 2) != 0 ? rv0Var.m10929B() - 1 : c2749qr.f24268a, (m26447b & 8) != 0 ? rv0Var.m10929B() : c2749qr.f24269b, (m26447b & 16) != 0 ? rv0Var.m10929B() : c2749qr.f24270c, (m26447b & 32) != 0 ? rv0Var.m10929B() : c2749qr.f24271d);
        return c1050c;
    }

    /* renamed from: z */
    public static void m24666z(AbstractC0821b7.C0822a c0822a, SparseArray<C1050c> sparseArray, int i, byte[] bArr) {
        C1050c m24667y = m24667y(c0822a.m26442g(AbstractC0821b7.f4467y).f4475Q0, sparseArray, i);
        if (m24667y == null) {
            return;
        }
        qm1 qm1Var = m24667y.f6510b;
        long j = qm1Var.f24182s;
        m24667y.m24660f();
        int i2 = AbstractC0821b7.f4465x;
        if (c0822a.m26442g(i2) != null && (i & 2) == 0) {
            j = m24668x(c0822a.m26442g(i2).f4475Q0);
        }
        m24695C(c0822a, m24667y, j, i);
        pm1 m15041a = m24667y.f6511c.m15041a(qm1Var.f24164a.f24268a);
        AbstractC0821b7.C0823b m26442g = c0822a.m26442g(AbstractC0821b7.f4426d0);
        if (m26442g != null) {
            m24673s(m15041a, m26442g.f4475Q0, qm1Var);
        }
        AbstractC0821b7.C0823b m26442g2 = c0822a.m26442g(AbstractC0821b7.f4428e0);
        if (m26442g2 != null) {
            m24674r(m26442g2.f4475Q0, qm1Var);
        }
        AbstractC0821b7.C0823b m26442g3 = c0822a.m26442g(AbstractC0821b7.f4436i0);
        if (m26442g3 != null) {
            m24671u(m26442g3.f4475Q0, qm1Var);
        }
        AbstractC0821b7.C0823b m26442g4 = c0822a.m26442g(AbstractC0821b7.f4430f0);
        AbstractC0821b7.C0823b m26442g5 = c0822a.m26442g(AbstractC0821b7.f4432g0);
        if (m26442g4 != null && m26442g5 != null) {
            m24670v(m26442g4.f4475Q0, m26442g5.f4475Q0, m15041a != null ? m15041a.f23052b : null, qm1Var);
        }
        int size = c0822a.f4473R0.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0821b7.C0823b c0823b = c0822a.f4473R0.get(i3);
            if (c0823b.f4471a == AbstractC0821b7.f4434h0) {
                m24694D(c0823b.f4475Q0, qm1Var, bArr);
            }
        }
    }

    /* renamed from: E */
    public final void m24693E(long j) {
        while (!this.f6492l.isEmpty() && this.f6492l.peek().f4472Q0 == j) {
            m24682j(this.f6492l.pop());
        }
        m24686b();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0145  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m24692F(a00 a00Var) {
        long position;
        if (this.f6498r == 0) {
            if (!a00Var.mo5864c(this.f6490j.f25637a, 0, 8, true)) {
                return false;
            }
            this.f6498r = 8;
            this.f6490j.m10921J(0);
            this.f6497q = this.f6490j.m10894z();
            this.f6496p = this.f6490j.m10911i();
        }
        long j = this.f6497q;
        if (j != 1) {
            if (j == 0) {
                long mo5859h = a00Var.mo5859h();
                if (mo5859h == -1 && !this.f6492l.isEmpty()) {
                    mo5859h = this.f6492l.peek().f4472Q0;
                }
                if (mo5859h != -1) {
                    position = (mo5859h - a00Var.getPosition()) + this.f6498r;
                }
            }
            if (this.f6497q < this.f6498r) {
                long position2 = a00Var.getPosition() - this.f6498r;
                if (this.f6496p == AbstractC0821b7.f4400L) {
                    int size = this.f6485e.size();
                    for (int i = 0; i < size; i++) {
                        qm1 qm1Var = this.f6485e.valueAt(i).f6510b;
                        qm1Var.f24165b = position2;
                        qm1Var.f24167d = position2;
                        qm1Var.f24166c = position2;
                    }
                }
                int i2 = this.f6496p;
                if (i2 == AbstractC0821b7.f4435i) {
                    this.f6505y = null;
                    this.f6500t = this.f6497q + position2;
                    if (!this.f6480G) {
                        this.f6477D.mo11475d(new da1.C1069b(this.f6503w, position2));
                        this.f6480G = true;
                    }
                    this.f6495o = 2;
                    return true;
                }
                if (m24688J(i2)) {
                    long position3 = (a00Var.getPosition() + this.f6497q) - 8;
                    this.f6492l.push(new AbstractC0821b7.C0822a(this.f6496p, position3));
                    if (this.f6497q == this.f6498r) {
                        m24693E(position3);
                    } else {
                        m24686b();
                    }
                } else {
                    if (m24687K(this.f6496p)) {
                        if (this.f6498r != 8) {
                            throw new tv0("Leaf atom defines extended atom size (unsupported).");
                        }
                        long j2 = this.f6497q;
                        if (j2 > 2147483647L) {
                            throw new tv0("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        rv0 rv0Var = new rv0((int) j2);
                        this.f6499s = rv0Var;
                        System.arraycopy(this.f6490j.f25637a, 0, rv0Var.f25637a, 0, 8);
                    } else if (this.f6497q > 2147483647L) {
                        throw new tv0("Skipping atom with length > 2147483647 (unsupported).");
                    } else {
                        this.f6499s = null;
                    }
                    this.f6495o = 1;
                }
                return true;
            }
            throw new tv0("Atom size less than header length (unsupported).");
        }
        a00Var.mo5861f(this.f6490j.f25637a, 8, 8);
        this.f6498r += 8;
        position = this.f6490j.m10928C();
        this.f6497q = position;
        if (this.f6497q < this.f6498r) {
        }
    }

    /* renamed from: G */
    public final void m24691G(a00 a00Var) {
        int i = ((int) this.f6497q) - this.f6498r;
        rv0 rv0Var = this.f6499s;
        if (rv0Var != null) {
            a00Var.mo5861f(rv0Var.f25637a, 8, i);
            m24680l(new AbstractC0821b7.C0823b(this.f6496p, this.f6499s), a00Var.getPosition());
        } else {
            a00Var.mo5857j(i);
        }
        m24693E(a00Var.getPosition());
    }

    /* renamed from: H */
    public final void m24690H(a00 a00Var) {
        int size = this.f6485e.size();
        C1050c c1050c = null;
        long j = Long.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            qm1 qm1Var = this.f6485e.valueAt(i).f6510b;
            if (qm1Var.f24181r) {
                long j2 = qm1Var.f24167d;
                if (j2 < j) {
                    c1050c = this.f6485e.valueAt(i);
                    j = j2;
                }
            }
        }
        if (c1050c == null) {
            this.f6495o = 3;
            return;
        }
        int position = (int) (j - a00Var.getPosition());
        if (position < 0) {
            throw new tv0("Offset to encryption data was negative.");
        }
        a00Var.mo5857j(position);
        c1050c.f6510b.m12342a(a00Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.daaw.sm1] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* renamed from: I */
    public final boolean m24689I(a00 a00Var) {
        ?? r13;
        sm1.C2956a c2956a;
        int mo10158b;
        int i = 4;
        int i2 = 1;
        int i3 = 0;
        if (this.f6495o == 3) {
            if (this.f6505y == null) {
                C1050c m24684g = m24684g(this.f6485e);
                if (m24684g == null) {
                    int position = (int) (this.f6500t - a00Var.getPosition());
                    if (position >= 0) {
                        a00Var.mo5857j(position);
                        m24686b();
                        return false;
                    }
                    throw new tv0("Offset to end of mdat was negative.");
                }
                int position2 = (int) (m24684g.f6510b.f24170g[m24684g.f6515g] - a00Var.getPosition());
                if (position2 < 0) {
                    position2 = 0;
                }
                a00Var.mo5857j(position2);
                this.f6505y = m24684g;
            }
            C1050c c1050c = this.f6505y;
            int[] iArr = c1050c.f6510b.f24172i;
            int i4 = c1050c.f6513e;
            int i5 = iArr[i4];
            this.f6506z = i5;
            if (i4 < c1050c.f6516h) {
                a00Var.mo5857j(i5);
                this.f6505y.m24658h();
                if (!this.f6505y.m24662d()) {
                    this.f6505y = null;
                }
                this.f6495o = 3;
                return true;
            }
            if (c1050c.f6511c.f20254g == 1) {
                this.f6506z = i5 - 8;
                a00Var.mo5857j(8);
            }
            int m24661e = this.f6505y.m24661e();
            this.f6474A = m24661e;
            this.f6506z += m24661e;
            this.f6495o = 4;
            this.f6475B = 0;
        }
        C1050c c1050c2 = this.f6505y;
        qm1 qm1Var = c1050c2.f6510b;
        nm1 nm1Var = c1050c2.f6511c;
        ?? r10 = c1050c2.f6509a;
        int i6 = c1050c2.f6513e;
        int i7 = nm1Var.f20257j;
        if (i7 == 0) {
            while (true) {
                int i8 = this.f6474A;
                int i9 = this.f6506z;
                if (i8 >= i9) {
                    break;
                }
                this.f6474A += r10.mo10158b(a00Var, i9 - i8, false);
            }
        } else {
            byte[] bArr = this.f6487g.f25637a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i10 = i7 + 1;
            int i11 = 4 - i7;
            while (this.f6474A < this.f6506z) {
                int i12 = this.f6475B;
                if (i12 == 0) {
                    a00Var.mo5861f(bArr, i11, i10);
                    this.f6487g.m10921J(i3);
                    this.f6475B = this.f6487g.m10929B() - i2;
                    this.f6486f.m10921J(i3);
                    r10.mo10157c(this.f6486f, i);
                    r10.mo10157c(this.f6487g, i2);
                    this.f6476C = this.f6479F.length > 0 && sr0.m9972g(nm1Var.f20253f.f35721u, bArr[i]);
                    this.f6474A += 5;
                    this.f6506z += i11;
                } else {
                    if (this.f6476C) {
                        this.f6488h.m10924G(i12);
                        a00Var.mo5861f(this.f6488h.f25637a, i3, this.f6475B);
                        r10.mo10157c(this.f6488h, this.f6475B);
                        mo10158b = this.f6475B;
                        rv0 rv0Var = this.f6488h;
                        int m9968k = sr0.m9968k(rv0Var.f25637a, rv0Var.m10916d());
                        this.f6488h.m10921J("video/hevc".equals(nm1Var.f20253f.f35721u) ? 1 : 0);
                        this.f6488h.m10922I(m9968k);
                        C2432oe.m14327a(qm1Var.m12340c(i6) * 1000, this.f6488h, this.f6479F);
                    } else {
                        mo10158b = r10.mo10158b(a00Var, i12, false);
                    }
                    this.f6474A += mo10158b;
                    this.f6475B -= mo10158b;
                    i = 4;
                    i2 = 1;
                    i3 = 0;
                }
            }
        }
        long m12340c = qm1Var.m12340c(i6) * 1000;
        ol1 ol1Var = this.f6489i;
        if (ol1Var != null) {
            m12340c = ol1Var.m14188a(m12340c);
        }
        boolean z = qm1Var.f24175l[i6];
        if (qm1Var.f24176m) {
            boolean z2 = z | true;
            pm1 pm1Var = qm1Var.f24178o;
            if (pm1Var == null) {
                pm1Var = nm1Var.m15041a(qm1Var.f24164a.f24268a);
            }
            r13 = z2;
            c2956a = pm1Var.f23053c;
        } else {
            r13 = z;
            c2956a = null;
        }
        r10.mo10159a(m12340c, r13, this.f6506z, 0, c2956a);
        m24677o(m12340c);
        if (!this.f6505y.m24662d()) {
            this.f6505y = null;
        }
        this.f6495o = 3;
        return true;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: a */
    public void mo1762a() {
    }

    /* renamed from: b */
    public final void m24686b() {
        this.f6495o = 0;
        this.f6498r = 0;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: c */
    public boolean mo1761c(a00 a00Var) {
        return be1.m26197b(a00Var);
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: d */
    public int mo1760d(a00 a00Var, iy0 iy0Var) {
        while (true) {
            int i = this.f6495o;
            if (i != 0) {
                if (i == 1) {
                    m24691G(a00Var);
                } else if (i == 2) {
                    m24690H(a00Var);
                } else if (m24689I(a00Var)) {
                    return 0;
                }
            } else if (!m24692F(a00Var)) {
                return -1;
            }
        }
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: f */
    public void mo1759f(long j, long j2) {
        int size = this.f6485e.size();
        for (int i = 0; i < size; i++) {
            this.f6485e.valueAt(i).m24660f();
        }
        this.f6493m.clear();
        this.f6501u = 0;
        this.f6502v = j2;
        this.f6492l.clear();
        m24686b();
    }

    /* renamed from: h */
    public final void m24683h() {
        int i;
        if (this.f6478E == null) {
            sm1[] sm1VarArr = new sm1[2];
            this.f6478E = sm1VarArr;
            sm1 sm1Var = this.f6494n;
            if (sm1Var != null) {
                sm1VarArr[0] = sm1Var;
                i = 1;
            } else {
                i = 0;
            }
            if ((this.f6481a & 4) != 0) {
                sm1VarArr[i] = this.f6477D.mo11478a(this.f6485e.size(), 4);
                i++;
            }
            sm1[] sm1VarArr2 = (sm1[]) Arrays.copyOf(this.f6478E, i);
            this.f6478E = sm1VarArr2;
            for (sm1 sm1Var2 : sm1VarArr2) {
                sm1Var2.mo10156d(f6473K);
            }
        }
        if (this.f6479F == null) {
            this.f6479F = new sm1[this.f6483c.size()];
            for (int i2 = 0; i2 < this.f6479F.length; i2++) {
                sm1 mo11478a = this.f6477D.mo11478a(this.f6485e.size() + 1 + i2, 3);
                mo11478a.mo10156d(this.f6483c.get(i2));
                this.f6479F[i2] = mo11478a;
            }
        }
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: i */
    public void mo1758i(d00 d00Var) {
        this.f6477D = d00Var;
        nm1 nm1Var = this.f6482b;
        if (nm1Var != null) {
            C1050c c1050c = new C1050c(d00Var.mo11478a(0, nm1Var.f20249b));
            c1050c.m24663c(this.f6482b, new C2749qr(0, 0, 0, 0));
            this.f6485e.put(0, c1050c);
            m24683h();
            this.f6477D.mo11470n();
        }
    }

    /* renamed from: j */
    public final void m24682j(AbstractC0821b7.C0822a c0822a) {
        int i = c0822a.f4471a;
        if (i == AbstractC0821b7.f4382C) {
            m24678n(c0822a);
        } else if (i == AbstractC0821b7.f4400L) {
            m24679m(c0822a);
        } else if (this.f6492l.isEmpty()) {
        } else {
            this.f6492l.peek().m26445d(c0822a);
        }
    }

    /* renamed from: k */
    public final void m24681k(rv0 rv0Var) {
        sm1[] sm1VarArr;
        sm1[] sm1VarArr2 = this.f6478E;
        if (sm1VarArr2 == null || sm1VarArr2.length == 0) {
            return;
        }
        rv0Var.m10921J(12);
        int m10919a = rv0Var.m10919a();
        rv0Var.m10902r();
        rv0Var.m10902r();
        long m10025T = sq1.m10025T(rv0Var.m10894z(), 1000000L, rv0Var.m10894z());
        for (sm1 sm1Var : this.f6478E) {
            rv0Var.m10921J(12);
            sm1Var.mo10157c(rv0Var, m10919a);
        }
        if (this.f6504x == -9223372036854775807L) {
            this.f6493m.addLast(new C1049b(m10025T, m10919a));
            this.f6501u += m10919a;
            return;
        }
        for (sm1 sm1Var2 : this.f6478E) {
            sm1Var2.mo10159a(this.f6504x + m10025T, 1, m10919a, 0, null);
        }
    }

    /* renamed from: l */
    public final void m24680l(AbstractC0821b7.C0823b c0823b, long j) {
        if (!this.f6492l.isEmpty()) {
            this.f6492l.peek().m26444e(c0823b);
            return;
        }
        int i = c0823b.f4471a;
        if (i != AbstractC0821b7.f4380B) {
            if (i == AbstractC0821b7.f4393H0) {
                m24681k(c0823b.f4475Q0);
                return;
            }
            return;
        }
        Pair<Long, C1533hf> m24669w = m24669w(c0823b.f4475Q0, j);
        this.f6504x = ((Long) m24669w.first).longValue();
        this.f6477D.mo11475d((da1) m24669w.second);
        this.f6480G = true;
    }

    /* renamed from: m */
    public final void m24679m(AbstractC0821b7.C0822a c0822a) {
        m24675q(c0822a, this.f6485e, this.f6481a, this.f6491k);
        DrmInitData m24685e = this.f6484d != null ? null : m24685e(c0822a.f4473R0);
        if (m24685e != null) {
            int size = this.f6485e.size();
            for (int i = 0; i < size; i++) {
                this.f6485e.valueAt(i).m24657i(m24685e);
            }
        }
        if (this.f6502v != -9223372036854775807L) {
            int size2 = this.f6485e.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f6485e.valueAt(i2).m24659g(this.f6502v);
            }
            this.f6502v = -9223372036854775807L;
        }
    }

    /* renamed from: n */
    public final void m24678n(AbstractC0821b7.C0822a c0822a) {
        int i;
        int i2;
        int i3 = 0;
        C2914s6.m10684g(this.f6482b == null, "Unexpected moov box.");
        DrmInitData drmInitData = this.f6484d;
        if (drmInitData == null) {
            drmInitData = m24685e(c0822a.f4473R0);
        }
        AbstractC0821b7.C0822a m26443f = c0822a.m26443f(AbstractC0821b7.f4404N);
        SparseArray sparseArray = new SparseArray();
        int size = m26443f.f4473R0.size();
        long j = -9223372036854775807L;
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0821b7.C0823b c0823b = m26443f.f4473R0.get(i4);
            int i5 = c0823b.f4471a;
            if (i5 == AbstractC0821b7.f4469z) {
                Pair<Integer, C2749qr> m24697A = m24697A(c0823b.f4475Q0);
                sparseArray.put(((Integer) m24697A.first).intValue(), m24697A.second);
            } else if (i5 == AbstractC0821b7.f4406O) {
                j = m24676p(c0823b.f4475Q0);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = c0822a.f4474S0.size();
        int i6 = 0;
        while (i6 < size2) {
            AbstractC0821b7.C0822a c0822a2 = c0822a.f4474S0.get(i6);
            if (c0822a2.f4471a == AbstractC0821b7.f4386E) {
                i = i6;
                i2 = size2;
                nm1 m25546u = C0930c7.m25546u(c0822a2, c0822a.m26442g(AbstractC0821b7.f4384D), j, drmInitData, (this.f6481a & 16) != 0, false);
                if (m25546u != null) {
                    sparseArray2.put(m25546u.f20248a, m25546u);
                }
            } else {
                i = i6;
                i2 = size2;
            }
            i6 = i + 1;
            size2 = i2;
        }
        int size3 = sparseArray2.size();
        if (this.f6485e.size() != 0) {
            C2914s6.m10685f(this.f6485e.size() == size3);
            while (i3 < size3) {
                nm1 nm1Var = (nm1) sparseArray2.valueAt(i3);
                this.f6485e.get(nm1Var.f20248a).m24663c(nm1Var, (C2749qr) sparseArray.get(nm1Var.f20248a));
                i3++;
            }
            return;
        }
        while (i3 < size3) {
            nm1 nm1Var2 = (nm1) sparseArray2.valueAt(i3);
            C1050c c1050c = new C1050c(this.f6477D.mo11478a(i3, nm1Var2.f20249b));
            c1050c.m24663c(nm1Var2, (C2749qr) sparseArray.get(nm1Var2.f20248a));
            this.f6485e.put(nm1Var2.f20248a, c1050c);
            this.f6503w = Math.max(this.f6503w, nm1Var2.f20252e);
            i3++;
        }
        m24683h();
        this.f6477D.mo11470n();
    }

    /* renamed from: o */
    public final void m24677o(long j) {
        while (!this.f6493m.isEmpty()) {
            C1049b removeFirst = this.f6493m.removeFirst();
            this.f6501u -= removeFirst.f6508b;
            for (sm1 sm1Var : this.f6478E) {
                sm1Var.mo10159a(removeFirst.f6507a + j, 1, removeFirst.f6508b, this.f6501u, null);
            }
        }
    }
}
