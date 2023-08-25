package com.daaw;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.daaw.da1;
import com.daaw.eo1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class do1 implements InterfaceC3919zz {

    /* renamed from: m */
    public static final e00 f7550m = new C1119a();

    /* renamed from: n */
    public static final long f7551n = sq1.m9994v("AC-3");

    /* renamed from: o */
    public static final long f7552o = sq1.m9994v("EAC3");

    /* renamed from: p */
    public static final long f7553p = sq1.m9994v("HEVC");

    /* renamed from: a */
    public final int f7554a;

    /* renamed from: b */
    public final List<ol1> f7555b;

    /* renamed from: c */
    public final rv0 f7556c;

    /* renamed from: d */
    public final SparseIntArray f7557d;

    /* renamed from: e */
    public final eo1.InterfaceC1207c f7558e;

    /* renamed from: f */
    public final SparseArray<eo1> f7559f;

    /* renamed from: g */
    public final SparseBooleanArray f7560g;

    /* renamed from: h */
    public d00 f7561h;

    /* renamed from: i */
    public int f7562i;

    /* renamed from: j */
    public boolean f7563j;

    /* renamed from: k */
    public eo1 f7564k;

    /* renamed from: l */
    public int f7565l;

    /* renamed from: com.daaw.do1$a */
    /* loaded from: classes.dex */
    public static class C1119a implements e00 {
        @Override // com.daaw.e00
        /* renamed from: a */
        public InterfaceC3919zz[] mo4824a() {
            return new InterfaceC3919zz[]{new do1()};
        }
    }

    /* renamed from: com.daaw.do1$b */
    /* loaded from: classes.dex */
    public class C1120b implements z91 {

        /* renamed from: a */
        public final qv0 f7566a = new qv0(new byte[4]);

        public C1120b() {
        }

        @Override // com.daaw.z91
        /* renamed from: a */
        public void mo2590a(rv0 rv0Var) {
            if (rv0Var.m10896x() != 0) {
                return;
            }
            rv0Var.m10920K(7);
            int m10919a = rv0Var.m10919a() / 4;
            for (int i = 0; i < m10919a; i++) {
                rv0Var.m10914f(this.f7566a, 4);
                int m12125h = this.f7566a.m12125h(16);
                this.f7566a.m12118o(3);
                if (m12125h == 0) {
                    this.f7566a.m12118o(13);
                } else {
                    int m12125h2 = this.f7566a.m12125h(13);
                    do1.this.f7559f.put(m12125h2, new aa1(new C1121c(m12125h2)));
                    do1.m24162j(do1.this);
                }
            }
            if (do1.this.f7554a != 2) {
                do1.this.f7559f.remove(0);
            }
        }

        @Override // com.daaw.z91
        /* renamed from: c */
        public void mo2589c(ol1 ol1Var, d00 d00Var, eo1.C1208d c1208d) {
        }
    }

    /* renamed from: com.daaw.do1$c */
    /* loaded from: classes.dex */
    public class C1121c implements z91 {

        /* renamed from: a */
        public final qv0 f7568a = new qv0(new byte[5]);

        /* renamed from: b */
        public final SparseArray<eo1> f7569b = new SparseArray<>();

        /* renamed from: c */
        public final SparseIntArray f7570c = new SparseIntArray();

        /* renamed from: d */
        public final int f7571d;

        public C1121c(int i) {
            this.f7571d = i;
        }

        @Override // com.daaw.z91
        /* renamed from: a */
        public void mo2590a(rv0 rv0Var) {
            ol1 ol1Var;
            if (rv0Var.m10896x() != 2) {
                return;
            }
            if (do1.this.f7554a == 1 || do1.this.f7554a == 2 || do1.this.f7562i == 1) {
                ol1Var = (ol1) do1.this.f7555b.get(0);
            } else {
                ol1Var = new ol1(((ol1) do1.this.f7555b.get(0)).m14186c());
                do1.this.f7555b.add(ol1Var);
            }
            rv0Var.m10920K(2);
            int m10927D = rv0Var.m10927D();
            int i = 5;
            rv0Var.m10920K(5);
            rv0Var.m10914f(this.f7568a, 2);
            int i2 = 4;
            this.f7568a.m12118o(4);
            rv0Var.m10920K(this.f7568a.m12125h(12));
            if (do1.this.f7554a == 2 && do1.this.f7564k == null) {
                eo1.C1206b c1206b = new eo1.C1206b(21, null, null, new byte[0]);
                do1 do1Var = do1.this;
                do1Var.f7564k = do1Var.f7558e.mo23338a(21, c1206b);
                do1.this.f7564k.mo15750c(ol1Var, do1.this.f7561h, new eo1.C1208d(m10927D, 21, 8192));
            }
            this.f7569b.clear();
            this.f7570c.clear();
            int m10919a = rv0Var.m10919a();
            while (m10919a > 0) {
                rv0Var.m10914f(this.f7568a, i);
                int m12125h = this.f7568a.m12125h(8);
                this.f7568a.m12118o(3);
                int m12125h2 = this.f7568a.m12125h(13);
                this.f7568a.m12118o(i2);
                int m12125h3 = this.f7568a.m12125h(12);
                eo1.C1206b m24149b = m24149b(rv0Var, m12125h3);
                if (m12125h == 6) {
                    m12125h = m24149b.f8614a;
                }
                m10919a -= m12125h3 + 5;
                int i3 = do1.this.f7554a == 2 ? m12125h : m12125h2;
                if (!do1.this.f7560g.get(i3)) {
                    eo1 mo23338a = (do1.this.f7554a == 2 && m12125h == 21) ? do1.this.f7564k : do1.this.f7558e.mo23338a(m12125h, m24149b);
                    if (do1.this.f7554a != 2 || m12125h2 < this.f7570c.get(i3, 8192)) {
                        this.f7570c.put(i3, m12125h2);
                        this.f7569b.put(i3, mo23338a);
                    }
                }
                i = 5;
                i2 = 4;
            }
            int size = this.f7570c.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = this.f7570c.keyAt(i4);
                do1.this.f7560g.put(keyAt, true);
                eo1 valueAt = this.f7569b.valueAt(i4);
                if (valueAt != null) {
                    if (valueAt != do1.this.f7564k) {
                        valueAt.mo15750c(ol1Var, do1.this.f7561h, new eo1.C1208d(m10927D, keyAt, 8192));
                    }
                    do1.this.f7559f.put(this.f7570c.valueAt(i4), valueAt);
                }
            }
            if (do1.this.f7554a != 2) {
                do1.this.f7559f.remove(this.f7571d);
                do1 do1Var2 = do1.this;
                do1Var2.f7562i = do1Var2.f7554a != 1 ? do1.this.f7562i - 1 : 0;
                if (do1.this.f7562i != 0) {
                    return;
                }
                do1.this.f7561h.mo11470n();
            } else if (do1.this.f7563j) {
                return;
            } else {
                do1.this.f7561h.mo11470n();
                do1.this.f7562i = 0;
            }
            do1.this.f7563j = true;
        }

        /* renamed from: b */
        public final eo1.C1206b m24149b(rv0 rv0Var, int i) {
            int m10917c = rv0Var.m10917c();
            int i2 = i + m10917c;
            String str = null;
            ArrayList arrayList = null;
            int i3 = -1;
            while (rv0Var.m10917c() < i2) {
                int m10896x = rv0Var.m10896x();
                int m10917c2 = rv0Var.m10917c() + rv0Var.m10896x();
                if (m10896x == 5) {
                    long m10894z = rv0Var.m10894z();
                    if (m10894z != do1.f7551n) {
                        if (m10894z != do1.f7552o) {
                            if (m10894z == do1.f7553p) {
                                i3 = 36;
                            }
                        }
                        i3 = 135;
                    }
                    i3 = 129;
                } else {
                    if (m10896x != 106) {
                        if (m10896x != 122) {
                            if (m10896x == 123) {
                                i3 = 138;
                            } else if (m10896x == 10) {
                                str = rv0Var.m10899u(3).trim();
                            } else if (m10896x == 89) {
                                arrayList = new ArrayList();
                                while (rv0Var.m10917c() < m10917c2) {
                                    String trim = rv0Var.m10899u(3).trim();
                                    int m10896x2 = rv0Var.m10896x();
                                    byte[] bArr = new byte[4];
                                    rv0Var.m10913g(bArr, 0, 4);
                                    arrayList.add(new eo1.C1205a(trim, m10896x2, bArr));
                                }
                                i3 = 89;
                            }
                        }
                        i3 = 135;
                    }
                    i3 = 129;
                }
                rv0Var.m10920K(m10917c2 - rv0Var.m10917c());
            }
            rv0Var.m10921J(i2);
            return new eo1.C1206b(i3, str, arrayList, Arrays.copyOfRange(rv0Var.f25637a, m10917c, i2));
        }

        @Override // com.daaw.z91
        /* renamed from: c */
        public void mo2589c(ol1 ol1Var, d00 d00Var, eo1.C1208d c1208d) {
        }
    }

    public do1() {
        this(0);
    }

    public do1(int i) {
        this(1, i);
    }

    public do1(int i, int i2) {
        this(i, new ol1(0L), new C0884bs(i2));
    }

    public do1(int i, ol1 ol1Var, eo1.InterfaceC1207c interfaceC1207c) {
        this.f7558e = (eo1.InterfaceC1207c) C2914s6.m10686e(interfaceC1207c);
        this.f7554a = i;
        if (i == 1 || i == 2) {
            this.f7555b = Collections.singletonList(ol1Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f7555b = arrayList;
            arrayList.add(ol1Var);
        }
        this.f7556c = new rv0(new byte[9400], 0);
        this.f7560g = new SparseBooleanArray();
        this.f7559f = new SparseArray<>();
        this.f7557d = new SparseIntArray();
        m24150v();
    }

    /* renamed from: j */
    public static /* synthetic */ int m24162j(do1 do1Var) {
        int i = do1Var.f7562i;
        do1Var.f7562i = i + 1;
        return i;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: a */
    public void mo1762a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        r2 = r2 + 1;
     */
    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo1761c(a00 a00Var) {
        byte[] bArr = this.f7556c.f25637a;
        a00Var.mo5856k(bArr, 0, 940);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 != 5; i2++) {
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            a00Var.mo5857j(i);
            return true;
        }
        return false;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: d */
    public int mo1760d(a00 a00Var, iy0 iy0Var) {
        rv0 rv0Var = this.f7556c;
        byte[] bArr = rv0Var.f25637a;
        if (9400 - rv0Var.m10917c() < 188) {
            int m10919a = this.f7556c.m10919a();
            if (m10919a > 0) {
                System.arraycopy(bArr, this.f7556c.m10917c(), bArr, 0, m10919a);
            }
            this.f7556c.m10923H(bArr, m10919a);
        }
        while (this.f7556c.m10919a() < 188) {
            int m10916d = this.f7556c.m10916d();
            int mo5865b = a00Var.mo5865b(bArr, m10916d, 9400 - m10916d);
            if (mo5865b == -1) {
                return -1;
            }
            this.f7556c.m10922I(m10916d + mo5865b);
        }
        int m10916d2 = this.f7556c.m10916d();
        int m10917c = this.f7556c.m10917c();
        int i = m10917c;
        while (i < m10916d2 && bArr[i] != 71) {
            i++;
        }
        this.f7556c.m10921J(i);
        int i2 = i + 188;
        if (i2 > m10916d2) {
            int i3 = this.f7565l + (i - m10917c);
            this.f7565l = i3;
            if (this.f7554a != 2 || i3 <= 376) {
                return 0;
            }
            throw new tv0("Cannot find sync byte. Most likely not a Transport Stream.");
        }
        this.f7565l = 0;
        int m10911i = this.f7556c.m10911i();
        if ((8388608 & m10911i) == 0) {
            boolean z = (4194304 & m10911i) != 0;
            int i4 = (2096896 & m10911i) >> 8;
            boolean z2 = (m10911i & 32) != 0;
            eo1 eo1Var = (m10911i & 16) != 0 ? this.f7559f.get(i4) : null;
            if (eo1Var != null) {
                if (this.f7554a != 2) {
                    int i5 = m10911i & 15;
                    int i6 = this.f7557d.get(i4, i5 - 1);
                    this.f7557d.put(i4, i5);
                    if (i6 != i5) {
                        if (i5 != ((i6 + 1) & 15)) {
                            eo1Var.mo15751b();
                        }
                    }
                }
                if (z2) {
                    this.f7556c.m10920K(this.f7556c.m10896x());
                }
                this.f7556c.m10922I(i2);
                eo1Var.mo15752a(this.f7556c, z);
                this.f7556c.m10922I(m10916d2);
            }
        }
        this.f7556c.m10921J(i2);
        return 0;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: f */
    public void mo1759f(long j, long j2) {
        int size = this.f7555b.size();
        for (int i = 0; i < size; i++) {
            this.f7555b.get(i).m14182g();
        }
        this.f7556c.m10925F();
        this.f7557d.clear();
        m24150v();
        this.f7565l = 0;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: i */
    public void mo1758i(d00 d00Var) {
        this.f7561h = d00Var;
        d00Var.mo11475d(new da1.C1069b(-9223372036854775807L));
    }

    /* renamed from: v */
    public final void m24150v() {
        this.f7560g.clear();
        this.f7559f.clear();
        SparseArray<eo1> mo23337b = this.f7558e.mo23337b();
        int size = mo23337b.size();
        for (int i = 0; i < size; i++) {
            this.f7559f.put(mo23337b.keyAt(i), mo23337b.valueAt(i));
        }
        this.f7559f.put(0, new aa1(new C1120b()));
        this.f7564k = null;
    }
}
