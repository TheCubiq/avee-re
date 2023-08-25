package com.daaw;

import android.util.Pair;
import com.daaw.AbstractC0821b7;
import com.daaw.l20;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* renamed from: com.daaw.c7 */
/* loaded from: classes.dex */
public final class C0930c7 {

    /* renamed from: a */
    public static final int f5557a = sq1.m9994v("vide");

    /* renamed from: b */
    public static final int f5558b = sq1.m9994v("soun");

    /* renamed from: c */
    public static final int f5559c = sq1.m9994v("text");

    /* renamed from: d */
    public static final int f5560d = sq1.m9994v("sbtl");

    /* renamed from: e */
    public static final int f5561e = sq1.m9994v("subt");

    /* renamed from: f */
    public static final int f5562f = sq1.m9994v("clcp");

    /* renamed from: g */
    public static final int f5563g = sq1.m9994v("meta");

    /* renamed from: com.daaw.c7$a */
    /* loaded from: classes.dex */
    public static final class C0931a {

        /* renamed from: a */
        public final int f5564a;

        /* renamed from: b */
        public int f5565b;

        /* renamed from: c */
        public int f5566c;

        /* renamed from: d */
        public long f5567d;

        /* renamed from: e */
        public final boolean f5568e;

        /* renamed from: f */
        public final rv0 f5569f;

        /* renamed from: g */
        public final rv0 f5570g;

        /* renamed from: h */
        public int f5571h;

        /* renamed from: i */
        public int f5572i;

        public C0931a(rv0 rv0Var, rv0 rv0Var2, boolean z) {
            this.f5570g = rv0Var;
            this.f5569f = rv0Var2;
            this.f5568e = z;
            rv0Var2.m10921J(12);
            this.f5564a = rv0Var2.m10929B();
            rv0Var.m10921J(12);
            this.f5572i = rv0Var.m10929B();
            C2914s6.m10684g(rv0Var.m10911i() == 1, "first_chunk must be 1");
            this.f5565b = -1;
        }

        /* renamed from: a */
        public boolean m25543a() {
            int i = this.f5565b + 1;
            this.f5565b = i;
            if (i == this.f5564a) {
                return false;
            }
            this.f5567d = this.f5568e ? this.f5569f.m10928C() : this.f5569f.m10894z();
            if (this.f5565b == this.f5571h) {
                this.f5566c = this.f5570g.m10929B();
                this.f5570g.m10920K(4);
                int i2 = this.f5572i - 1;
                this.f5572i = i2;
                this.f5571h = i2 > 0 ? this.f5570g.m10929B() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: com.daaw.c7$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0932b {
        /* renamed from: a */
        boolean mo25542a();

        /* renamed from: b */
        int mo25541b();

        /* renamed from: c */
        int mo25540c();
    }

    /* renamed from: com.daaw.c7$c */
    /* loaded from: classes.dex */
    public static final class C0933c {

        /* renamed from: a */
        public final pm1[] f5573a;

        /* renamed from: b */
        public Format f5574b;

        /* renamed from: c */
        public int f5575c;

        /* renamed from: d */
        public int f5576d = 0;

        public C0933c(int i) {
            this.f5573a = new pm1[i];
        }
    }

    /* renamed from: com.daaw.c7$d */
    /* loaded from: classes.dex */
    public static final class C0934d implements InterfaceC0932b {

        /* renamed from: a */
        public final int f5577a;

        /* renamed from: b */
        public final int f5578b;

        /* renamed from: c */
        public final rv0 f5579c;

        public C0934d(AbstractC0821b7.C0823b c0823b) {
            rv0 rv0Var = c0823b.f4475Q0;
            this.f5579c = rv0Var;
            rv0Var.m10921J(12);
            this.f5577a = rv0Var.m10929B();
            this.f5578b = rv0Var.m10929B();
        }

        @Override // com.daaw.C0930c7.InterfaceC0932b
        /* renamed from: a */
        public boolean mo25542a() {
            return this.f5577a != 0;
        }

        @Override // com.daaw.C0930c7.InterfaceC0932b
        /* renamed from: b */
        public int mo25541b() {
            return this.f5578b;
        }

        @Override // com.daaw.C0930c7.InterfaceC0932b
        /* renamed from: c */
        public int mo25540c() {
            int i = this.f5577a;
            return i == 0 ? this.f5579c.m10929B() : i;
        }
    }

    /* renamed from: com.daaw.c7$e */
    /* loaded from: classes.dex */
    public static final class C0935e implements InterfaceC0932b {

        /* renamed from: a */
        public final rv0 f5580a;

        /* renamed from: b */
        public final int f5581b;

        /* renamed from: c */
        public final int f5582c;

        /* renamed from: d */
        public int f5583d;

        /* renamed from: e */
        public int f5584e;

        public C0935e(AbstractC0821b7.C0823b c0823b) {
            rv0 rv0Var = c0823b.f4475Q0;
            this.f5580a = rv0Var;
            rv0Var.m10921J(12);
            this.f5582c = rv0Var.m10929B() & 255;
            this.f5581b = rv0Var.m10929B();
        }

        @Override // com.daaw.C0930c7.InterfaceC0932b
        /* renamed from: a */
        public boolean mo25542a() {
            return false;
        }

        @Override // com.daaw.C0930c7.InterfaceC0932b
        /* renamed from: b */
        public int mo25541b() {
            return this.f5581b;
        }

        @Override // com.daaw.C0930c7.InterfaceC0932b
        /* renamed from: c */
        public int mo25540c() {
            int i = this.f5582c;
            if (i == 8) {
                return this.f5580a.m10896x();
            }
            if (i == 16) {
                return this.f5580a.m10927D();
            }
            int i2 = this.f5583d;
            this.f5583d = i2 + 1;
            if (i2 % 2 == 0) {
                int m10896x = this.f5580a.m10896x();
                this.f5584e = m10896x;
                return (m10896x & 240) >> 4;
            }
            return this.f5584e & 15;
        }
    }

    /* renamed from: com.daaw.c7$f */
    /* loaded from: classes.dex */
    public static final class C0936f {

        /* renamed from: a */
        public final int f5585a;

        /* renamed from: b */
        public final long f5586b;

        /* renamed from: c */
        public final int f5587c;

        public C0936f(int i, long j, int i2) {
            this.f5585a = i;
            this.f5586b = j;
            this.f5587c = i2;
        }
    }

    /* renamed from: a */
    public static boolean m25566a(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        return jArr[0] <= j2 && j2 < jArr[sq1.m10004l(3, 0, length)] && jArr[sq1.m10004l(jArr.length - 3, 0, length)] < j3 && j3 <= j;
    }

    /* renamed from: b */
    public static int m25565b(rv0 rv0Var, int i, int i2) {
        int m10917c = rv0Var.m10917c();
        while (m10917c - i < i2) {
            rv0Var.m10921J(m10917c);
            int m10911i = rv0Var.m10911i();
            C2914s6.m10689b(m10911i > 0, "childAtomSize should be positive");
            if (rv0Var.m10911i() == AbstractC0821b7.f4398K) {
                return m10917c;
            }
            m10917c += m10911i;
        }
        return -1;
    }

    /* renamed from: c */
    public static void m25564c(rv0 rv0Var, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, C0933c c0933c, int i5) {
        int i6;
        int i7;
        int i8;
        String str2;
        String str3;
        DrmInitData drmInitData2;
        int i9;
        Format m8650g;
        int i10 = i2;
        DrmInitData drmInitData3 = drmInitData;
        rv0Var.m10921J(i10 + 8 + 8);
        if (z) {
            i6 = rv0Var.m10927D();
            rv0Var.m10920K(6);
        } else {
            rv0Var.m10920K(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            int m10927D = rv0Var.m10927D();
            rv0Var.m10920K(6);
            int m10895y = rv0Var.m10895y();
            if (i6 == 1) {
                rv0Var.m10920K(16);
            }
            i7 = m10895y;
            i8 = m10927D;
        } else if (i6 != 2) {
            return;
        } else {
            rv0Var.m10920K(16);
            i7 = (int) Math.round(rv0Var.m10912h());
            i8 = rv0Var.m10929B();
            rv0Var.m10920K(20);
        }
        int m10917c = rv0Var.m10917c();
        int i11 = i;
        if (i11 == AbstractC0821b7.f4422b0) {
            Pair<Integer, pm1> m25552o = m25552o(rv0Var, i10, i3);
            if (m25552o != null) {
                i11 = ((Integer) m25552o.first).intValue();
                drmInitData3 = drmInitData3 == null ? null : drmInitData3.m1712c(((pm1) m25552o.second).f23052b);
                c0933c.f5573a[i5] = (pm1) m25552o.second;
            }
            rv0Var.m10921J(m10917c);
        }
        DrmInitData drmInitData4 = drmInitData3;
        String str4 = "audio/raw";
        String str5 = i11 == AbstractC0821b7.f4447o ? "audio/ac3" : i11 == AbstractC0821b7.f4451q ? "audio/eac3" : i11 == AbstractC0821b7.f4455s ? "audio/vnd.dts" : (i11 == AbstractC0821b7.f4457t || i11 == AbstractC0821b7.f4459u) ? "audio/vnd.dts.hd" : i11 == AbstractC0821b7.f4461v ? "audio/vnd.dts.hd;profile=lbr" : i11 == AbstractC0821b7.f4470z0 ? "audio/3gpp" : i11 == AbstractC0821b7.f4379A0 ? "audio/amr-wb" : (i11 == AbstractC0821b7.f4443m || i11 == AbstractC0821b7.f4445n) ? "audio/raw" : i11 == AbstractC0821b7.f4439k ? "audio/mpeg" : i11 == AbstractC0821b7.f4409P0 ? "audio/alac" : null;
        int i12 = i8;
        int i13 = i7;
        int i14 = m10917c;
        byte[] bArr = null;
        while (i14 - i10 < i3) {
            rv0Var.m10921J(i14);
            int m10911i = rv0Var.m10911i();
            C2914s6.m10689b(m10911i > 0, "childAtomSize should be positive");
            int m10911i2 = rv0Var.m10911i();
            int i15 = AbstractC0821b7.f4398K;
            if (m10911i2 == i15 || (z && m10911i2 == AbstractC0821b7.f4441l)) {
                str2 = str5;
                str3 = str4;
                drmInitData2 = drmInitData4;
                int m25565b = m10911i2 == i15 ? i14 : m25565b(rv0Var, i14, m10911i);
                if (m25565b != -1) {
                    Pair<String, byte[]> m25561f = m25561f(rv0Var, m25565b);
                    str5 = (String) m25561f.first;
                    bArr = (byte[]) m25561f.second;
                    if ("audio/mp4a-latm".equals(str5)) {
                        Pair<Integer, Integer> m23485i = C1183eg.m23485i(bArr);
                        i13 = ((Integer) m23485i.first).intValue();
                        i12 = ((Integer) m23485i.second).intValue();
                    }
                    i14 += m10911i;
                    i10 = i2;
                    drmInitData4 = drmInitData2;
                    str4 = str3;
                }
            } else {
                if (m10911i2 == AbstractC0821b7.f4449p) {
                    rv0Var.m10921J(i14 + 8);
                    m8650g = C3150u.m8653d(rv0Var, Integer.toString(i4), str, drmInitData4);
                } else if (m10911i2 == AbstractC0821b7.f4453r) {
                    rv0Var.m10921J(i14 + 8);
                    m8650g = C3150u.m8650g(rv0Var, Integer.toString(i4), str, drmInitData4);
                } else {
                    if (m10911i2 == AbstractC0821b7.f4463w) {
                        str2 = str5;
                        str3 = str4;
                        drmInitData2 = drmInitData4;
                        i9 = i14;
                        c0933c.f5574b = Format.m1722u(Integer.toString(i4), str5, null, -1, -1, i12, i13, null, drmInitData2, 0, str);
                        m10911i = m10911i;
                    } else {
                        i9 = i14;
                        str2 = str5;
                        str3 = str4;
                        drmInitData2 = drmInitData4;
                        if (m10911i2 == AbstractC0821b7.f4409P0) {
                            byte[] bArr2 = new byte[m10911i];
                            i14 = i9;
                            rv0Var.m10921J(i14);
                            rv0Var.m10913g(bArr2, 0, m10911i);
                            bArr = bArr2;
                        }
                    }
                    i14 = i9;
                }
                c0933c.f5574b = m8650g;
                str2 = str5;
                str3 = str4;
                drmInitData2 = drmInitData4;
            }
            str5 = str2;
            i14 += m10911i;
            i10 = i2;
            drmInitData4 = drmInitData2;
            str4 = str3;
        }
        String str6 = str5;
        String str7 = str4;
        DrmInitData drmInitData5 = drmInitData4;
        if (c0933c.f5574b != null || str6 == null) {
            return;
        }
        c0933c.f5574b = Format.m1723t(Integer.toString(i4), str6, null, -1, -1, i12, i13, str7.equals(str6) ? 2 : -1, bArr != null ? Collections.singletonList(bArr) : null, drmInitData5, 0, str);
    }

    /* renamed from: d */
    public static Pair<Integer, pm1> m25563d(rv0 rv0Var, int i, int i2) {
        int i3 = i + 8;
        String str = null;
        Integer num = null;
        int i4 = -1;
        int i5 = 0;
        while (i3 - i < i2) {
            rv0Var.m10921J(i3);
            int m10911i = rv0Var.m10911i();
            int m10911i2 = rv0Var.m10911i();
            if (m10911i2 == AbstractC0821b7.f4424c0) {
                num = Integer.valueOf(rv0Var.m10911i());
            } else if (m10911i2 == AbstractC0821b7.f4417X) {
                rv0Var.m10920K(4);
                str = rv0Var.m10899u(4);
            } else if (m10911i2 == AbstractC0821b7.f4418Y) {
                i4 = i3;
                i5 = m10911i;
            }
            i3 += m10911i;
        }
        if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
            C2914s6.m10689b(num != null, "frma atom is mandatory");
            C2914s6.m10689b(i4 != -1, "schi atom is mandatory");
            pm1 m25551p = m25551p(rv0Var, i4, i5, str);
            C2914s6.m10689b(m25551p != null, "tenc atom is mandatory");
            return Pair.create(num, m25551p);
        }
        return null;
    }

    /* renamed from: e */
    public static Pair<long[], long[]> m25562e(AbstractC0821b7.C0822a c0822a) {
        AbstractC0821b7.C0823b m26442g;
        if (c0822a == null || (m26442g = c0822a.m26442g(AbstractC0821b7.f4411R)) == null) {
            return Pair.create(null, null);
        }
        rv0 rv0Var = m26442g.f4475Q0;
        rv0Var.m10921J(8);
        int m26446c = AbstractC0821b7.m26446c(rv0Var.m10911i());
        int m10929B = rv0Var.m10929B();
        long[] jArr = new long[m10929B];
        long[] jArr2 = new long[m10929B];
        for (int i = 0; i < m10929B; i++) {
            jArr[i] = m26446c == 1 ? rv0Var.m10928C() : rv0Var.m10894z();
            jArr2[i] = m26446c == 1 ? rv0Var.m10903q() : rv0Var.m10911i();
            if (rv0Var.m10900t() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            rv0Var.m10920K(2);
        }
        return Pair.create(jArr, jArr2);
    }

    /* renamed from: f */
    public static Pair<String, byte[]> m25561f(rv0 rv0Var, int i) {
        rv0Var.m10921J(i + 8 + 4);
        rv0Var.m10920K(1);
        m25560g(rv0Var);
        rv0Var.m10920K(2);
        int m10896x = rv0Var.m10896x();
        if ((m10896x & 128) != 0) {
            rv0Var.m10920K(2);
        }
        if ((m10896x & 64) != 0) {
            rv0Var.m10920K(rv0Var.m10927D());
        }
        if ((m10896x & 32) != 0) {
            rv0Var.m10920K(2);
        }
        rv0Var.m10920K(1);
        m25560g(rv0Var);
        String m20500e = hq0.m20500e(rv0Var.m10896x());
        if ("audio/mpeg".equals(m20500e) || "audio/vnd.dts".equals(m20500e) || "audio/vnd.dts.hd".equals(m20500e)) {
            return Pair.create(m20500e, null);
        }
        rv0Var.m10920K(12);
        rv0Var.m10920K(1);
        int m25560g = m25560g(rv0Var);
        byte[] bArr = new byte[m25560g];
        rv0Var.m10913g(bArr, 0, m25560g);
        return Pair.create(m20500e, bArr);
    }

    /* renamed from: g */
    public static int m25560g(rv0 rv0Var) {
        int m10896x = rv0Var.m10896x();
        int i = m10896x & 127;
        while ((m10896x & 128) == 128) {
            m10896x = rv0Var.m10896x();
            i = (i << 7) | (m10896x & 127);
        }
        return i;
    }

    /* renamed from: h */
    public static int m25559h(rv0 rv0Var) {
        rv0Var.m10921J(16);
        int m10911i = rv0Var.m10911i();
        if (m10911i == f5558b) {
            return 1;
        }
        if (m10911i == f5557a) {
            return 2;
        }
        if (m10911i == f5559c || m10911i == f5560d || m10911i == f5561e || m10911i == f5562f) {
            return 3;
        }
        return m10911i == f5563g ? 4 : -1;
    }

    /* renamed from: i */
    public static Metadata m25558i(rv0 rv0Var, int i) {
        rv0Var.m10920K(8);
        ArrayList arrayList = new ArrayList();
        while (rv0Var.m10917c() < i) {
            Metadata.Entry m2017c = zp0.m2017c(rv0Var);
            if (m2017c != null) {
                arrayList.add(m2017c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* renamed from: j */
    public static Pair<Long, String> m25557j(rv0 rv0Var) {
        rv0Var.m10921J(8);
        int m26446c = AbstractC0821b7.m26446c(rv0Var.m10911i());
        rv0Var.m10920K(m26446c == 0 ? 8 : 16);
        long m10894z = rv0Var.m10894z();
        rv0Var.m10920K(m26446c == 0 ? 4 : 8);
        int m10927D = rv0Var.m10927D();
        return Pair.create(Long.valueOf(m10894z), "" + ((char) (((m10927D >> 10) & 31) + 96)) + ((char) (((m10927D >> 5) & 31) + 96)) + ((char) ((m10927D & 31) + 96)));
    }

    /* renamed from: k */
    public static Metadata m25556k(rv0 rv0Var, int i) {
        rv0Var.m10920K(12);
        while (rv0Var.m10917c() < i) {
            int m10917c = rv0Var.m10917c();
            int m10911i = rv0Var.m10911i();
            if (rv0Var.m10911i() == AbstractC0821b7.f4385D0) {
                rv0Var.m10921J(m10917c);
                return m25558i(rv0Var, m10917c + m10911i);
            }
            rv0Var.m10920K(m10911i - 8);
        }
        return null;
    }

    /* renamed from: l */
    public static long m25555l(rv0 rv0Var) {
        rv0Var.m10921J(8);
        rv0Var.m10920K(AbstractC0821b7.m26446c(rv0Var.m10911i()) != 0 ? 16 : 8);
        return rv0Var.m10894z();
    }

    /* renamed from: m */
    public static float m25554m(rv0 rv0Var, int i) {
        rv0Var.m10921J(i + 8);
        return rv0Var.m10929B() / rv0Var.m10929B();
    }

    /* renamed from: n */
    public static byte[] m25553n(rv0 rv0Var, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            rv0Var.m10921J(i3);
            int m10911i = rv0Var.m10911i();
            if (rv0Var.m10911i() == AbstractC0821b7.f4399K0) {
                return Arrays.copyOfRange(rv0Var.f25637a, i3, m10911i + i3);
            }
            i3 += m10911i;
        }
        return null;
    }

    /* renamed from: o */
    public static Pair<Integer, pm1> m25552o(rv0 rv0Var, int i, int i2) {
        Pair<Integer, pm1> m25563d;
        int m10917c = rv0Var.m10917c();
        while (m10917c - i < i2) {
            rv0Var.m10921J(m10917c);
            int m10911i = rv0Var.m10911i();
            C2914s6.m10689b(m10911i > 0, "childAtomSize should be positive");
            if (rv0Var.m10911i() == AbstractC0821b7.f4416W && (m25563d = m25563d(rv0Var, m10917c, m10911i)) != null) {
                return m25563d;
            }
            m10917c += m10911i;
        }
        return null;
    }

    /* renamed from: p */
    public static pm1 m25551p(rv0 rv0Var, int i, int i2, String str) {
        int i3;
        int i4;
        int i5 = i + 8;
        while (true) {
            byte[] bArr = null;
            if (i5 - i >= i2) {
                return null;
            }
            rv0Var.m10921J(i5);
            int m10911i = rv0Var.m10911i();
            if (rv0Var.m10911i() == AbstractC0821b7.f4419Z) {
                int m26446c = AbstractC0821b7.m26446c(rv0Var.m10911i());
                rv0Var.m10920K(1);
                if (m26446c == 0) {
                    rv0Var.m10920K(1);
                    i4 = 0;
                    i3 = 0;
                } else {
                    int m10896x = rv0Var.m10896x();
                    i3 = m10896x & 15;
                    i4 = (m10896x & 240) >> 4;
                }
                boolean z = rv0Var.m10896x() == 1;
                int m10896x2 = rv0Var.m10896x();
                byte[] bArr2 = new byte[16];
                rv0Var.m10913g(bArr2, 0, 16);
                if (z && m10896x2 == 0) {
                    int m10896x3 = rv0Var.m10896x();
                    bArr = new byte[m10896x3];
                    rv0Var.m10913g(bArr, 0, m10896x3);
                }
                return new pm1(z, str, m10896x2, bArr2, i4, i3, bArr);
            }
            i5 += m10911i;
        }
    }

    /* renamed from: q */
    public static tm1 m25550q(nm1 nm1Var, AbstractC0821b7.C0822a c0822a, y50 y50Var) {
        InterfaceC0932b c0935e;
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
        AbstractC0821b7.C0823b m26442g = c0822a.m26442g(AbstractC0821b7.f4454r0);
        if (m26442g != null) {
            c0935e = new C0934d(m26442g);
        } else {
            AbstractC0821b7.C0823b m26442g2 = c0822a.m26442g(AbstractC0821b7.f4456s0);
            if (m26442g2 == null) {
                throw new tv0("Track has no sample table size information");
            }
            c0935e = new C0935e(m26442g2);
        }
        int mo25541b = c0935e.mo25541b();
        if (mo25541b == 0) {
            return new tm1(new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
        }
        AbstractC0821b7.C0823b m26442g3 = c0822a.m26442g(AbstractC0821b7.f4458t0);
        if (m26442g3 == null) {
            m26442g3 = c0822a.m26442g(AbstractC0821b7.f4460u0);
            z = true;
        } else {
            z = false;
        }
        rv0 rv0Var = m26442g3.f4475Q0;
        rv0 rv0Var2 = c0822a.m26442g(AbstractC0821b7.f4452q0).f4475Q0;
        rv0 rv0Var3 = c0822a.m26442g(AbstractC0821b7.f4446n0).f4475Q0;
        AbstractC0821b7.C0823b m26442g4 = c0822a.m26442g(AbstractC0821b7.f4448o0);
        rv0 rv0Var4 = null;
        rv0 rv0Var5 = m26442g4 != null ? m26442g4.f4475Q0 : null;
        AbstractC0821b7.C0823b m26442g5 = c0822a.m26442g(AbstractC0821b7.f4450p0);
        rv0 rv0Var6 = m26442g5 != null ? m26442g5.f4475Q0 : null;
        C0931a c0931a = new C0931a(rv0Var2, rv0Var, z);
        rv0Var3.m10921J(12);
        int m10929B = rv0Var3.m10929B() - 1;
        int m10929B2 = rv0Var3.m10929B();
        int m10929B3 = rv0Var3.m10929B();
        if (rv0Var6 != null) {
            rv0Var6.m10921J(12);
            i = rv0Var6.m10929B();
        } else {
            i = 0;
        }
        int i8 = -1;
        if (rv0Var5 != null) {
            rv0Var5.m10921J(12);
            i2 = rv0Var5.m10929B();
            if (i2 > 0) {
                i8 = rv0Var5.m10929B() - 1;
                rv0Var4 = rv0Var5;
            }
        } else {
            rv0Var4 = rv0Var5;
            i2 = 0;
        }
        long j3 = 0;
        if (c0935e.mo25542a() && "audio/raw".equals(nm1Var.f20253f.f35721u) && m10929B == 0 && i == 0 && i2 == 0) {
            nm1Var2 = nm1Var;
            int i9 = c0931a.f5564a;
            long[] jArr6 = new long[i9];
            int[] iArr8 = new int[i9];
            while (c0931a.m25543a()) {
                int i10 = c0931a.f5565b;
                jArr6[i10] = c0931a.f5567d;
                iArr8[i10] = c0931a.f5566c;
            }
            Format format = nm1Var2.f20253f;
            l20.C2008b m17196a = l20.m17196a(sq1.m9991y(format.f35708I, format.f35706G), jArr6, iArr8, m10929B3);
            jArr = m17196a.f16964a;
            iArr = m17196a.f16965b;
            int i11 = m17196a.f16966c;
            jArr2 = m17196a.f16967d;
            iArr2 = m17196a.f16968e;
            j = m17196a.f16969f;
            i3 = i11;
        } else {
            long[] jArr7 = new long[mo25541b];
            iArr = new int[mo25541b];
            jArr2 = new long[mo25541b];
            int i12 = i2;
            int[] iArr9 = new int[mo25541b];
            int i13 = i8;
            long j4 = 0;
            long j5 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = i;
            int i20 = m10929B3;
            int i21 = m10929B2;
            int i22 = m10929B;
            int i23 = i12;
            while (i14 < mo25541b) {
                while (i18 == 0) {
                    C2914s6.m10685f(c0931a.m25543a());
                    j5 = c0931a.f5567d;
                    i18 = c0931a.f5566c;
                    i20 = i20;
                    i21 = i21;
                }
                int i24 = i21;
                int i25 = i20;
                if (rv0Var6 != null) {
                    while (i17 == 0 && i19 > 0) {
                        i17 = rv0Var6.m10929B();
                        i16 = rv0Var6.m10911i();
                        i19--;
                    }
                    i17--;
                }
                int i26 = i16;
                jArr7[i14] = j5;
                iArr[i14] = c0935e.mo25540c();
                if (iArr[i14] > i15) {
                    i15 = iArr[i14];
                }
                InterfaceC0932b interfaceC0932b = c0935e;
                long[] jArr8 = jArr7;
                jArr2[i14] = j4 + i26;
                iArr9[i14] = rv0Var4 == null ? 1 : 0;
                if (i14 == i13) {
                    iArr9[i14] = 1;
                    i23--;
                    if (i23 > 0) {
                        i13 = rv0Var4.m10929B() - 1;
                    }
                }
                int[] iArr10 = iArr9;
                j4 += i25;
                int i27 = i24 - 1;
                if (i27 != 0 || i22 <= 0) {
                    i6 = i25;
                    i7 = i27;
                } else {
                    i7 = rv0Var3.m10929B();
                    i6 = rv0Var3.m10911i();
                    i22--;
                }
                int i28 = i7;
                int i29 = i6;
                j5 += iArr[i14];
                i18--;
                i14++;
                c0935e = interfaceC0932b;
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
            C2914s6.m10690a(i17 == 0);
            while (i19 > 0) {
                C2914s6.m10690a(rv0Var6.m10929B() == 0);
                rv0Var6.m10911i();
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
            sb.append(nm1Var2.f20248a);
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
        long m10025T = sq1.m10025T(j, 1000000L, nm1Var2.f20250c);
        if (nm1Var2.f20255h == null || y50Var.m4102a()) {
            sq1.m10023V(jArr2, 1000000L, nm1Var2.f20250c);
            return new tm1(jArr, iArr, i3, jArr2, iArr2, m10025T);
        }
        long[] jArr10 = nm1Var2.f20255h;
        if (jArr10.length == 1 && nm1Var2.f20249b == 1 && jArr2.length >= 2) {
            long j7 = nm1Var2.f20256i[0];
            i4 = mo25541b;
            long m10025T2 = sq1.m10025T(jArr10[0], nm1Var2.f20250c, nm1Var2.f20251d) + j7;
            if (m25566a(jArr2, j, j7, m10025T2)) {
                long j8 = j - m10025T2;
                long m10025T3 = sq1.m10025T(j7 - jArr2[0], nm1Var2.f20253f.f35707H, nm1Var2.f20250c);
                long m10025T4 = sq1.m10025T(j8, nm1Var2.f20253f.f35707H, nm1Var2.f20250c);
                if ((m10025T3 != 0 || m10025T4 != 0) && m10025T3 <= 2147483647L && m10025T4 <= 2147483647L) {
                    y50Var.f33366a = (int) m10025T3;
                    y50Var.f33367b = (int) m10025T4;
                    sq1.m10023V(jArr2, 1000000L, nm1Var2.f20250c);
                    return new tm1(jArr, iArr, i3, jArr2, iArr2, m10025T);
                }
            }
        } else {
            i4 = mo25541b;
        }
        long[] jArr11 = nm1Var2.f20255h;
        if (jArr11.length == 1 && jArr11[0] == 0) {
            long j9 = nm1Var2.f20256i[0];
            for (int i32 = 0; i32 < jArr2.length; i32++) {
                jArr2[i32] = sq1.m10025T(jArr2[i32] - j9, 1000000L, nm1Var2.f20250c);
            }
            return new tm1(jArr, iArr, i3, jArr2, iArr2, sq1.m10025T(j - j9, 1000000L, nm1Var2.f20250c));
        }
        boolean z3 = nm1Var2.f20249b == 1;
        boolean z4 = false;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        while (true) {
            long[] jArr12 = nm1Var2.f20255h;
            j2 = -1;
            if (i35 >= jArr12.length) {
                break;
            }
            long j10 = m10025T;
            long j11 = nm1Var2.f20256i[i35];
            if (j11 != -1) {
                jArr5 = jArr;
                iArr7 = iArr2;
                long m10025T5 = sq1.m10025T(jArr12[i35], nm1Var2.f20250c, nm1Var2.f20251d);
                int m10014c = sq1.m10014c(jArr2, j11, true, true);
                int m10014c2 = sq1.m10014c(jArr2, j11 + m10025T5, z3, false);
                i33 += m10014c2 - m10014c;
                z4 |= i34 != m10014c;
                i34 = m10014c2;
            } else {
                jArr5 = jArr;
                iArr7 = iArr2;
            }
            i35++;
            jArr = jArr5;
            iArr2 = iArr7;
            m10025T = j10;
        }
        long[] jArr13 = jArr;
        int[] iArr12 = iArr2;
        long j12 = m10025T;
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
            long[] jArr16 = nm1Var2.f20255h;
            if (i39 >= jArr16.length) {
                break;
            }
            int[] iArr15 = iArr13;
            int[] iArr16 = iArr14;
            long j13 = nm1Var2.f20256i[i39];
            long j14 = jArr16[i39];
            if (j13 != j2) {
                int i40 = i37;
                int m10014c3 = sq1.m10014c(jArr2, j13, true, true);
                int m10014c4 = sq1.m10014c(jArr2, sq1.m10025T(j14, nm1Var2.f20250c, nm1Var2.f20251d) + j13, z3, false);
                if (z5) {
                    int i41 = m10014c4 - m10014c3;
                    jArr3 = jArr13;
                    System.arraycopy(jArr3, m10014c3, jArr14, i38, i41);
                    iArr3 = iArr15;
                    System.arraycopy(iArr, m10014c3, iArr3, i38, i41);
                    z2 = z3;
                    iArr5 = iArr12;
                    jArr4 = jArr14;
                    iArr6 = iArr16;
                    System.arraycopy(iArr5, m10014c3, iArr6, i38, i41);
                } else {
                    jArr3 = jArr13;
                    iArr3 = iArr15;
                    z2 = z3;
                    iArr5 = iArr12;
                    jArr4 = jArr14;
                    iArr6 = iArr16;
                }
                int i42 = i40;
                while (m10014c3 < m10014c4) {
                    int[] iArr17 = iArr6;
                    int[] iArr18 = iArr5;
                    long j15 = j13;
                    jArr15[i38] = sq1.m10025T(j3, 1000000L, nm1Var2.f20251d) + sq1.m10025T(jArr2[m10014c3] - j13, 1000000L, nm1Var2.f20250c);
                    if (z5 && iArr3[i38] > i42) {
                        i42 = iArr[m10014c3];
                    }
                    i38++;
                    m10014c3++;
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
        long m10025T6 = sq1.m10025T(j3, 1000000L, nm1Var2.f20250c);
        boolean z6 = false;
        for (int i44 = 0; i44 < iArr14.length && !z6; i44++) {
            z6 |= (iArr14[i44] & 1) != 0;
        }
        if (z6) {
            return new tm1(jArr18, iArr19, i43, jArr15, iArr14, m10025T6);
        }
        sq1.m10023V(jArr2, 1000000L, nm1Var2.f20250c);
        return new tm1(jArr17, iArr, i3, jArr2, iArr12, j12);
    }

    /* renamed from: r */
    public static C0933c m25549r(rv0 rv0Var, int i, int i2, String str, DrmInitData drmInitData, boolean z) {
        rv0Var.m10921J(12);
        int m10911i = rv0Var.m10911i();
        C0933c c0933c = new C0933c(m10911i);
        for (int i3 = 0; i3 < m10911i; i3++) {
            int m10917c = rv0Var.m10917c();
            int m10911i2 = rv0Var.m10911i();
            C2914s6.m10689b(m10911i2 > 0, "childAtomSize should be positive");
            int m10911i3 = rv0Var.m10911i();
            if (m10911i3 == AbstractC0821b7.f4423c || m10911i3 == AbstractC0821b7.f4425d || m10911i3 == AbstractC0821b7.f4420a0 || m10911i3 == AbstractC0821b7.f4444m0 || m10911i3 == AbstractC0821b7.f4427e || m10911i3 == AbstractC0821b7.f4429f || m10911i3 == AbstractC0821b7.f4431g || m10911i3 == AbstractC0821b7.f4401L0 || m10911i3 == AbstractC0821b7.f4403M0) {
                m25544w(rv0Var, m10911i3, m10917c, m10911i2, i, i2, drmInitData, c0933c, i3);
            } else if (m10911i3 == AbstractC0821b7.f4437j || m10911i3 == AbstractC0821b7.f4422b0 || m10911i3 == AbstractC0821b7.f4447o || m10911i3 == AbstractC0821b7.f4451q || m10911i3 == AbstractC0821b7.f4455s || m10911i3 == AbstractC0821b7.f4461v || m10911i3 == AbstractC0821b7.f4457t || m10911i3 == AbstractC0821b7.f4459u || m10911i3 == AbstractC0821b7.f4470z0 || m10911i3 == AbstractC0821b7.f4379A0 || m10911i3 == AbstractC0821b7.f4443m || m10911i3 == AbstractC0821b7.f4445n || m10911i3 == AbstractC0821b7.f4439k || m10911i3 == AbstractC0821b7.f4409P0) {
                m25564c(rv0Var, m10911i3, m10917c, m10911i2, i, str, z, drmInitData, c0933c, i3);
            } else if (m10911i3 == AbstractC0821b7.f4440k0 || m10911i3 == AbstractC0821b7.f4462v0 || m10911i3 == AbstractC0821b7.f4464w0 || m10911i3 == AbstractC0821b7.f4466x0 || m10911i3 == AbstractC0821b7.f4468y0) {
                m25548s(rv0Var, m10911i3, m10917c, m10911i2, i, str, c0933c);
            } else if (m10911i3 == AbstractC0821b7.f4407O0) {
                c0933c.f5574b = Format.m1718y(Integer.toString(i), "application/x-camera-motion", null, -1, null);
            }
            rv0Var.m10921J(m10917c + m10911i2);
        }
        return c0933c;
    }

    /* renamed from: s */
    public static void m25548s(rv0 rv0Var, int i, int i2, int i3, int i4, String str, C0933c c0933c) {
        rv0Var.m10921J(i2 + 8 + 8);
        String str2 = "application/ttml+xml";
        List list = null;
        long j = Long.MAX_VALUE;
        if (i != AbstractC0821b7.f4440k0) {
            if (i == AbstractC0821b7.f4462v0) {
                int i5 = (i3 - 8) - 8;
                byte[] bArr = new byte[i5];
                rv0Var.m10913g(bArr, 0, i5);
                list = Collections.singletonList(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i == AbstractC0821b7.f4464w0) {
                str2 = "application/x-mp4-vtt";
            } else if (i == AbstractC0821b7.f4466x0) {
                j = 0;
            } else if (i != AbstractC0821b7.f4468y0) {
                throw new IllegalStateException();
            } else {
                c0933c.f5576d = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        c0933c.f5574b = Format.m1741E(Integer.toString(i4), str2, null, -1, 0, str, -1, null, j, list);
    }

    /* renamed from: t */
    public static C0936f m25547t(rv0 rv0Var) {
        boolean z;
        rv0Var.m10921J(8);
        int m26446c = AbstractC0821b7.m26446c(rv0Var.m10911i());
        rv0Var.m10920K(m26446c == 0 ? 8 : 16);
        int m10911i = rv0Var.m10911i();
        rv0Var.m10920K(4);
        int m10917c = rv0Var.m10917c();
        int i = m26446c == 0 ? 4 : 8;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                z = true;
                break;
            } else if (rv0Var.f25637a[m10917c + i3] != -1) {
                z = false;
                break;
            } else {
                i3++;
            }
        }
        long j = -9223372036854775807L;
        if (z) {
            rv0Var.m10920K(i);
        } else {
            long m10894z = m26446c == 0 ? rv0Var.m10894z() : rv0Var.m10928C();
            if (m10894z != 0) {
                j = m10894z;
            }
        }
        rv0Var.m10920K(16);
        int m10911i2 = rv0Var.m10911i();
        int m10911i3 = rv0Var.m10911i();
        rv0Var.m10920K(4);
        int m10911i4 = rv0Var.m10911i();
        int m10911i5 = rv0Var.m10911i();
        if (m10911i2 == 0 && m10911i3 == 65536 && m10911i4 == -65536 && m10911i5 == 0) {
            i2 = 90;
        } else if (m10911i2 == 0 && m10911i3 == -65536 && m10911i4 == 65536 && m10911i5 == 0) {
            i2 = 270;
        } else if (m10911i2 == -65536 && m10911i3 == 0 && m10911i4 == 0 && m10911i5 == -65536) {
            i2 = 180;
        }
        return new C0936f(m10911i, j, i2);
    }

    /* renamed from: u */
    public static nm1 m25546u(AbstractC0821b7.C0822a c0822a, AbstractC0821b7.C0823b c0823b, long j, DrmInitData drmInitData, boolean z, boolean z2) {
        AbstractC0821b7.C0823b c0823b2;
        long j2;
        long[] jArr;
        long[] jArr2;
        AbstractC0821b7.C0822a m26443f = c0822a.m26443f(AbstractC0821b7.f4388F);
        int m25559h = m25559h(m26443f.m26442g(AbstractC0821b7.f4413T).f4475Q0);
        if (m25559h == -1) {
            return null;
        }
        C0936f m25547t = m25547t(c0822a.m26442g(AbstractC0821b7.f4408P).f4475Q0);
        if (j == -9223372036854775807L) {
            c0823b2 = c0823b;
            j2 = m25547t.f5586b;
        } else {
            c0823b2 = c0823b;
            j2 = j;
        }
        long m25555l = m25555l(c0823b2.f4475Q0);
        long m10025T = j2 != -9223372036854775807L ? sq1.m10025T(j2, 1000000L, m25555l) : -9223372036854775807L;
        AbstractC0821b7.C0822a m26443f2 = m26443f.m26443f(AbstractC0821b7.f4390G).m26443f(AbstractC0821b7.f4392H);
        Pair<Long, String> m25557j = m25557j(m26443f.m26442g(AbstractC0821b7.f4412S).f4475Q0);
        C0933c m25549r = m25549r(m26443f2.m26442g(AbstractC0821b7.f4414U).f4475Q0, m25547t.f5585a, m25547t.f5587c, (String) m25557j.second, drmInitData, z2);
        if (z) {
            jArr = null;
            jArr2 = null;
        } else {
            Pair<long[], long[]> m25562e = m25562e(c0822a.m26443f(AbstractC0821b7.f4410Q));
            jArr2 = (long[]) m25562e.second;
            jArr = (long[]) m25562e.first;
        }
        if (m25549r.f5574b == null) {
            return null;
        }
        return new nm1(m25547t.f5585a, m25559h, ((Long) m25557j.first).longValue(), m25555l, m10025T, m25549r.f5574b, m25549r.f5576d, m25549r.f5573a, m25549r.f5575c, jArr, jArr2);
    }

    /* renamed from: v */
    public static Metadata m25545v(AbstractC0821b7.C0823b c0823b, boolean z) {
        if (z) {
            return null;
        }
        rv0 rv0Var = c0823b.f4475Q0;
        rv0Var.m10921J(8);
        while (rv0Var.m10919a() >= 8) {
            int m10917c = rv0Var.m10917c();
            int m10911i = rv0Var.m10911i();
            if (rv0Var.m10911i() == AbstractC0821b7.f4383C0) {
                rv0Var.m10921J(m10917c);
                return m25556k(rv0Var, m10917c + m10911i);
            }
            rv0Var.m10920K(m10911i - 8);
        }
        return null;
    }

    /* renamed from: w */
    public static void m25544w(rv0 rv0Var, int i, int i2, int i3, int i4, int i5, DrmInitData drmInitData, C0933c c0933c, int i6) {
        DrmInitData drmInitData2 = drmInitData;
        rv0Var.m10921J(i2 + 8 + 8);
        rv0Var.m10920K(16);
        int m10927D = rv0Var.m10927D();
        int m10927D2 = rv0Var.m10927D();
        rv0Var.m10920K(50);
        int m10917c = rv0Var.m10917c();
        String str = null;
        int i7 = i;
        if (i7 == AbstractC0821b7.f4420a0) {
            Pair<Integer, pm1> m25552o = m25552o(rv0Var, i2, i3);
            if (m25552o != null) {
                i7 = ((Integer) m25552o.first).intValue();
                drmInitData2 = drmInitData2 == null ? null : drmInitData2.m1712c(((pm1) m25552o.second).f23052b);
                c0933c.f5573a[i6] = (pm1) m25552o.second;
            }
            rv0Var.m10921J(m10917c);
        }
        DrmInitData drmInitData3 = drmInitData2;
        List<byte[]> list = null;
        byte[] bArr = null;
        boolean z = false;
        float f = 1.0f;
        int i8 = -1;
        while (m10917c - i2 < i3) {
            rv0Var.m10921J(m10917c);
            int m10917c2 = rv0Var.m10917c();
            int m10911i = rv0Var.m10911i();
            if (m10911i == 0 && rv0Var.m10917c() - i2 == i3) {
                break;
            }
            C2914s6.m10689b(m10911i > 0, "childAtomSize should be positive");
            int m10911i2 = rv0Var.m10911i();
            if (m10911i2 == AbstractC0821b7.f4394I) {
                C2914s6.m10685f(str == null);
                rv0Var.m10921J(m10917c2 + 8);
                C3681y9 m3998b = C3681y9.m3998b(rv0Var);
                list = m3998b.f33429a;
                c0933c.f5575c = m3998b.f33430b;
                if (!z) {
                    f = m3998b.f33433e;
                }
                str = "video/avc";
            } else if (m10911i2 == AbstractC0821b7.f4396J) {
                C2914s6.m10685f(str == null);
                rv0Var.m10921J(m10917c2 + 8);
                cb0 m25457a = cb0.m25457a(rv0Var);
                list = m25457a.f5686a;
                c0933c.f5575c = m25457a.f5687b;
                str = "video/hevc";
            } else if (m10911i2 == AbstractC0821b7.f4405N0) {
                C2914s6.m10685f(str == null);
                str = i7 == AbstractC0821b7.f4401L0 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
            } else if (m10911i2 == AbstractC0821b7.f4433h) {
                C2914s6.m10685f(str == null);
                str = "video/3gpp";
            } else if (m10911i2 == AbstractC0821b7.f4398K) {
                C2914s6.m10685f(str == null);
                Pair<String, byte[]> m25561f = m25561f(rv0Var, m10917c2);
                str = (String) m25561f.first;
                list = Collections.singletonList(m25561f.second);
            } else if (m10911i2 == AbstractC0821b7.f4438j0) {
                f = m25554m(rv0Var, m10917c2);
                z = true;
            } else if (m10911i2 == AbstractC0821b7.f4397J0) {
                bArr = m25553n(rv0Var, m10917c2, m10911i);
            } else if (m10911i2 == AbstractC0821b7.f4395I0) {
                int m10896x = rv0Var.m10896x();
                rv0Var.m10920K(3);
                if (m10896x == 0) {
                    int m10896x2 = rv0Var.m10896x();
                    if (m10896x2 == 0) {
                        i8 = 0;
                    } else if (m10896x2 == 1) {
                        i8 = 1;
                    } else if (m10896x2 == 2) {
                        i8 = 2;
                    } else if (m10896x2 == 3) {
                        i8 = 3;
                    }
                }
            }
            m10917c += m10911i;
        }
        if (str == null) {
            return;
        }
        c0933c.f5574b = Format.m1737I(Integer.toString(i4), str, null, -1, -1, m10927D, m10927D2, -1.0f, list, i5, f, bArr, i8, null, drmInitData3);
    }
}
