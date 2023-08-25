package com.daaw;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.daaw.C1697if;
import com.daaw.InterfaceC3356vo;
import com.daaw.cp0;
import com.daaw.ex0;
import com.daaw.gb1;
import com.daaw.qo0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.daaw.zo */
/* loaded from: classes.dex */
public final class C3882zo implements qo0, gb1.InterfaceC1390a<C1697if<InterfaceC3356vo>>, C1697if.InterfaceC1699b<InterfaceC3356vo> {

    /* renamed from: B */
    public qo0.InterfaceC2744a f35274B;

    /* renamed from: E */
    public gb1 f35277E;

    /* renamed from: F */
    public C3456wo f35278F;

    /* renamed from: G */
    public int f35279G;

    /* renamed from: H */
    public List<C2989sy> f35280H;

    /* renamed from: I */
    public boolean f35281I;

    /* renamed from: p */
    public final int f35282p;

    /* renamed from: q */
    public final InterfaceC3356vo.InterfaceC3357a f35283q;

    /* renamed from: r */
    public final int f35284r;

    /* renamed from: s */
    public final cp0.C0975a f35285s;

    /* renamed from: t */
    public final long f35286t;

    /* renamed from: u */
    public final lk0 f35287u;

    /* renamed from: v */
    public final InterfaceC2006l2 f35288v;

    /* renamed from: w */
    public final TrackGroupArray f35289w;

    /* renamed from: x */
    public final C3883a[] f35290x;

    /* renamed from: y */
    public final InterfaceC3441wi f35291y;

    /* renamed from: z */
    public final ex0 f35292z;

    /* renamed from: C */
    public C1697if<InterfaceC3356vo>[] f35275C = m2095A(0);

    /* renamed from: D */
    public C1996ky[] f35276D = new C1996ky[0];

    /* renamed from: A */
    public final IdentityHashMap<C1697if<InterfaceC3356vo>, ex0.C1232c> f35273A = new IdentityHashMap<>();

    /* renamed from: com.daaw.zo$a */
    /* loaded from: classes.dex */
    public static final class C3883a {

        /* renamed from: a */
        public final int[] f35293a;

        /* renamed from: b */
        public final int f35294b;

        /* renamed from: c */
        public final int f35295c;

        /* renamed from: d */
        public final int f35296d;

        /* renamed from: e */
        public final int f35297e;

        /* renamed from: f */
        public final int f35298f;

        /* renamed from: g */
        public final int f35299g;

        public C3883a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.f35294b = i;
            this.f35293a = iArr;
            this.f35295c = i2;
            this.f35297e = i3;
            this.f35298f = i4;
            this.f35299g = i5;
            this.f35296d = i6;
        }

        /* renamed from: a */
        public static C3883a m2064a(int[] iArr, int i) {
            return new C3883a(3, 1, iArr, i, -1, -1, -1);
        }

        /* renamed from: b */
        public static C3883a m2063b(int[] iArr, int i) {
            return new C3883a(4, 1, iArr, i, -1, -1, -1);
        }

        /* renamed from: c */
        public static C3883a m2062c(int i) {
            return new C3883a(4, 2, null, -1, -1, -1, i);
        }

        /* renamed from: d */
        public static C3883a m2061d(int i, int[] iArr, int i2, int i3, int i4) {
            return new C3883a(i, 0, iArr, i2, i3, i4, -1);
        }
    }

    public C3882zo(int i, C3456wo c3456wo, int i2, InterfaceC3356vo.InterfaceC3357a interfaceC3357a, int i3, cp0.C0975a c0975a, long j, lk0 lk0Var, InterfaceC2006l2 interfaceC2006l2, InterfaceC3441wi interfaceC3441wi, ex0.InterfaceC1231b interfaceC1231b) {
        this.f35282p = i;
        this.f35278F = c3456wo;
        this.f35279G = i2;
        this.f35283q = interfaceC3357a;
        this.f35284r = i3;
        this.f35285s = c0975a;
        this.f35286t = j;
        this.f35287u = lk0Var;
        this.f35288v = interfaceC2006l2;
        this.f35291y = interfaceC3441wi;
        this.f35292z = new ex0(c3456wo, interfaceC1231b, interfaceC2006l2);
        this.f35277E = interfaceC3441wi.mo6060a(this.f35275C);
        gw0 m5924d = c3456wo.m5924d(i2);
        List<C2989sy> list = m5924d.f11775d;
        this.f35280H = list;
        Pair<TrackGroupArray, C3883a[]> m2070u = m2070u(m5924d.f11774c, list);
        this.f35289w = (TrackGroupArray) m2070u.first;
        this.f35290x = (C3883a[]) m2070u.second;
        c0975a.m25151q();
    }

    /* renamed from: A */
    public static C1697if<InterfaceC3356vo>[] m2095A(int i) {
        return new C1697if[i];
    }

    /* renamed from: D */
    public static void m2092D(d81 d81Var) {
        if (d81Var instanceof C1697if.C1698a) {
            ((C1697if.C1698a) d81Var).m19853c();
        }
    }

    /* renamed from: h */
    public static void m2081h(List<C2989sy> list, TrackGroup[] trackGroupArr, C3883a[] c3883aArr, int i) {
        int i2 = 0;
        while (i2 < list.size()) {
            trackGroupArr[i] = new TrackGroup(Format.m1718y(list.get(i2).m9736a(), "application/x-emsg", null, -1, null));
            c3883aArr[i] = C3883a.m2062c(i2);
            i2++;
            i++;
        }
    }

    /* renamed from: o */
    public static int m2076o(List<C1154e1> list, int[][] iArr, int i, boolean[] zArr, boolean[] zArr2, TrackGroup[] trackGroupArr, C3883a[] c3883aArr) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            int[] iArr2 = iArr[i4];
            ArrayList arrayList = new ArrayList();
            for (int i6 : iArr2) {
                arrayList.addAll(list.get(i6).f8023c);
            }
            int size = arrayList.size();
            Format[] formatArr = new Format[size];
            for (int i7 = 0; i7 < size; i7++) {
                formatArr[i7] = ((j41) arrayList.get(i7)).f14244c;
            }
            C1154e1 c1154e1 = list.get(iArr2[0]);
            int i8 = i5 + 1;
            if (zArr[i4]) {
                i2 = i8 + 1;
            } else {
                i2 = i8;
                i8 = -1;
            }
            if (zArr2[i4]) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
                i2 = -1;
            }
            trackGroupArr[i5] = new TrackGroup(formatArr);
            c3883aArr[i5] = C3883a.m2061d(c1154e1.f8022b, iArr2, i5, i8, i2);
            if (i8 != -1) {
                trackGroupArr[i8] = new TrackGroup(Format.m1718y(c1154e1.f8021a + ":emsg", "application/x-emsg", null, -1, null));
                c3883aArr[i8] = C3883a.m2063b(iArr2, i5);
            }
            if (i2 != -1) {
                trackGroupArr[i2] = new TrackGroup(Format.m1744B(c1154e1.f8021a + ":cea608", "application/cea-608", 0, null));
                c3883aArr[i2] = C3883a.m2064a(iArr2, i5);
            }
            i4++;
            i5 = i3;
        }
        return i5;
    }

    /* renamed from: u */
    public static Pair<TrackGroupArray, C3883a[]> m2070u(List<C1154e1> list, List<C2989sy> list2) {
        int[][] m2068w = m2068w(list);
        int length = m2068w.length;
        boolean[] zArr = new boolean[length];
        boolean[] zArr2 = new boolean[length];
        int m2065z = m2065z(length, list, m2068w, zArr, zArr2) + length + list2.size();
        TrackGroup[] trackGroupArr = new TrackGroup[m2065z];
        C3883a[] c3883aArr = new C3883a[m2065z];
        m2081h(list2, trackGroupArr, c3883aArr, m2076o(list, m2068w, length, zArr, zArr2, trackGroupArr, c3883aArr));
        return Pair.create(new TrackGroupArray(trackGroupArr), c3883aArr);
    }

    /* renamed from: v */
    public static C1860jt m2069v(List<C1860jt> list) {
        for (int i = 0; i < list.size(); i++) {
            C1860jt c1860jt = list.get(i);
            if ("urn:mpeg:dash:adaptation-set-switching:2016".equals(c1860jt.f15376a)) {
                return c1860jt;
            }
        }
        return null;
    }

    /* renamed from: w */
    public static int[][] m2068w(List<C1154e1> list) {
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        for (int i = 0; i < size; i++) {
            sparseIntArray.put(list.get(i).f8021a, i);
        }
        int[][] iArr = new int[size];
        boolean[] zArr = new boolean[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (!zArr[i3]) {
                zArr[i3] = true;
                C1860jt m2069v = m2069v(list.get(i3).f8025e);
                if (m2069v == null) {
                    int[] iArr2 = new int[1];
                    iArr2[0] = i3;
                    iArr[i2] = iArr2;
                    i2++;
                } else {
                    String[] split = m2069v.f15377b.split(",");
                    int[] iArr3 = new int[split.length + 1];
                    iArr3[0] = i3;
                    int i4 = 0;
                    while (i4 < split.length) {
                        int i5 = sparseIntArray.get(Integer.parseInt(split[i4]));
                        zArr[i5] = true;
                        i4++;
                        iArr3[i4] = i5;
                    }
                    iArr[i2] = iArr3;
                    i2++;
                }
            }
        }
        return i2 < size ? (int[][]) Arrays.copyOf(iArr, i2) : iArr;
    }

    /* renamed from: x */
    public static boolean m2067x(List<C1154e1> list, int[] iArr) {
        for (int i : iArr) {
            List<C1860jt> list2 = list.get(i).f8024d;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if ("urn:scte:dash:cc:cea-608:2015".equals(list2.get(i2).f15376a)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: y */
    public static boolean m2066y(List<C1154e1> list, int[] iArr) {
        for (int i : iArr) {
            List<j41> list2 = list.get(i).f8023c;
            for (int i2 = 0; i2 < list2.size(); i2++) {
                if (!list2.get(i2).f14247f.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: z */
    public static int m2065z(int i, List<C1154e1> list, int[][] iArr, boolean[] zArr, boolean[] zArr2) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (m2066y(list, iArr[i3])) {
                zArr[i3] = true;
                i2++;
            }
            if (m2067x(list, iArr[i3])) {
                zArr2[i3] = true;
                i2++;
            }
        }
        return i2;
    }

    @Override // com.daaw.gb1.InterfaceC1390a
    /* renamed from: B */
    public void mo2077n(C1697if<InterfaceC3356vo> c1697if) {
        this.f35274B.mo2077n(this);
    }

    /* renamed from: C */
    public void m2093C() {
        this.f35292z.m23070r();
        for (C1697if<InterfaceC3356vo> c1697if : this.f35275C) {
            c1697if.m19865N(this);
        }
        this.f35274B = null;
        this.f35285s.m25150r();
    }

    /* renamed from: E */
    public final void m2091E(InterfaceC3970c[] interfaceC3970cArr, boolean[] zArr, d81[] d81VarArr, boolean[] zArr2, long j, SparseArray<C1697if<InterfaceC3356vo>> sparseArray) {
        for (int i = 0; i < interfaceC3970cArr.length; i++) {
            if (((d81VarArr[i] instanceof C1697if.C1698a) || (d81VarArr[i] instanceof C2985sw)) && (interfaceC3970cArr[i] == null || !zArr[i])) {
                m2092D(d81VarArr[i]);
                d81VarArr[i] = null;
            }
            if (interfaceC3970cArr[i] != null) {
                C3883a c3883a = this.f35290x[this.f35289w.m1593b(interfaceC3970cArr[i].mo1534a())];
                if (c3883a.f35295c == 1) {
                    C1697if<InterfaceC3356vo> c1697if = sparseArray.get(c3883a.f35297e);
                    d81 d81Var = d81VarArr[i];
                    if (!(c1697if == null ? d81Var instanceof C2985sw : (d81Var instanceof C1697if.C1698a) && ((C1697if.C1698a) d81Var).f13607p == c1697if)) {
                        m2092D(d81Var);
                        d81VarArr[i] = c1697if == null ? new C2985sw() : c1697if.m19863P(j, c3883a.f35294b);
                        zArr2[i] = true;
                    }
                }
            }
        }
    }

    /* renamed from: F */
    public final void m2090F(InterfaceC3970c[] interfaceC3970cArr, boolean[] zArr, d81[] d81VarArr, boolean[] zArr2, List<C1996ky> list) {
        for (int i = 0; i < interfaceC3970cArr.length; i++) {
            if (d81VarArr[i] instanceof C1996ky) {
                C1996ky c1996ky = (C1996ky) d81VarArr[i];
                if (interfaceC3970cArr[i] == null || !zArr[i]) {
                    d81VarArr[i] = null;
                } else {
                    list.add(c1996ky);
                }
            }
            if (d81VarArr[i] == null && interfaceC3970cArr[i] != null) {
                C3883a c3883a = this.f35290x[this.f35289w.m1593b(interfaceC3970cArr[i].mo1534a())];
                if (c3883a.f35295c == 2) {
                    C1996ky c1996ky2 = new C1996ky(this.f35280H.get(c3883a.f35296d), interfaceC3970cArr[i].mo1534a().m1598a(0), this.f35278F.f31404d);
                    d81VarArr[i] = c1996ky2;
                    zArr2[i] = true;
                    list.add(c1996ky2);
                }
            }
        }
    }

    /* renamed from: G */
    public final void m2089G(InterfaceC3970c[] interfaceC3970cArr, boolean[] zArr, d81[] d81VarArr, boolean[] zArr2, long j, SparseArray<C1697if<InterfaceC3356vo>> sparseArray) {
        for (int i = 0; i < interfaceC3970cArr.length; i++) {
            if (d81VarArr[i] instanceof C1697if) {
                C1697if<InterfaceC3356vo> c1697if = (C1697if) d81VarArr[i];
                if (interfaceC3970cArr[i] == null || !zArr[i]) {
                    c1697if.m19865N(this);
                    d81VarArr[i] = null;
                } else {
                    sparseArray.put(this.f35289w.m1593b(interfaceC3970cArr[i].mo1534a()), c1697if);
                }
            }
            if (d81VarArr[i] == null && interfaceC3970cArr[i] != null) {
                int m1593b = this.f35289w.m1593b(interfaceC3970cArr[i].mo1534a());
                C3883a c3883a = this.f35290x[m1593b];
                if (c3883a.f35295c == 0) {
                    C1697if<InterfaceC3356vo> m2073r = m2073r(c3883a, interfaceC3970cArr[i], j);
                    sparseArray.put(m1593b, m2073r);
                    d81VarArr[i] = m2073r;
                    zArr2[i] = true;
                }
            }
        }
    }

    /* renamed from: H */
    public void m2088H(C3456wo c3456wo, int i) {
        C1996ky[] c1996kyArr;
        this.f35278F = c3456wo;
        this.f35279G = i;
        this.f35292z.m23068t(c3456wo);
        C1697if<InterfaceC3356vo>[] c1697ifArr = this.f35275C;
        if (c1697ifArr != null) {
            for (C1697if<InterfaceC3356vo> c1697if : c1697ifArr) {
                c1697if.m19877B().mo6976c(c3456wo, i);
            }
            this.f35274B.mo2077n(this);
        }
        this.f35280H = c3456wo.m5924d(i).f11775d;
        for (C1996ky c1996ky : this.f35276D) {
            Iterator<C2989sy> it = this.f35280H.iterator();
            while (true) {
                if (it.hasNext()) {
                    C2989sy next = it.next();
                    if (next.m9736a().equals(c1996ky.m17353b())) {
                        c1996ky.m17351e(next, c3456wo.f31404d);
                        break;
                    }
                }
            }
        }
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: b */
    public long mo2087b() {
        return this.f35277E.mo2087b();
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: c */
    public boolean mo2086c(long j) {
        return this.f35277E.mo2086c(j);
    }

    @Override // com.daaw.C1697if.InterfaceC1699b
    /* renamed from: d */
    public synchronized void mo2085d(C1697if<InterfaceC3356vo> c1697if) {
        ex0.C1232c remove = this.f35273A.remove(c1697if);
        if (remove != null) {
            remove.m23056m();
        }
    }

    @Override // com.daaw.qo0
    /* renamed from: e */
    public long mo2084e(long j, ea1 ea1Var) {
        C1697if<InterfaceC3356vo>[] c1697ifArr;
        for (C1697if<InterfaceC3356vo> c1697if : this.f35275C) {
            if (c1697if.f13596p == 2) {
                return c1697if.m19862e(j, ea1Var);
            }
        }
        return j;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: f */
    public long mo2083f() {
        return this.f35277E.mo2083f();
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: g */
    public void mo2082g(long j) {
        this.f35277E.mo2082g(j);
    }

    @Override // com.daaw.qo0
    /* renamed from: i */
    public long mo2080i(InterfaceC3970c[] interfaceC3970cArr, boolean[] zArr, d81[] d81VarArr, boolean[] zArr2, long j) {
        SparseArray<C1697if<InterfaceC3356vo>> sparseArray = new SparseArray<>();
        ArrayList arrayList = new ArrayList();
        m2089G(interfaceC3970cArr, zArr, d81VarArr, zArr2, j, sparseArray);
        m2090F(interfaceC3970cArr, zArr, d81VarArr, zArr2, arrayList);
        m2091E(interfaceC3970cArr, zArr, d81VarArr, zArr2, j, sparseArray);
        this.f35275C = m2095A(sparseArray.size());
        int i = 0;
        while (true) {
            C1697if<InterfaceC3356vo>[] c1697ifArr = this.f35275C;
            if (i >= c1697ifArr.length) {
                C1996ky[] c1996kyArr = new C1996ky[arrayList.size()];
                this.f35276D = c1996kyArr;
                arrayList.toArray(c1996kyArr);
                this.f35277E = this.f35291y.mo6060a(this.f35275C);
                return j;
            }
            c1697ifArr[i] = sparseArray.valueAt(i);
            i++;
        }
    }

    @Override // com.daaw.qo0
    /* renamed from: l */
    public void mo2079l() {
        this.f35287u.mo16893a();
    }

    @Override // com.daaw.qo0
    /* renamed from: m */
    public long mo2078m(long j) {
        for (C1697if<InterfaceC3356vo> c1697if : this.f35275C) {
            c1697if.m19864O(j);
        }
        for (C1996ky c1996ky : this.f35276D) {
            c1996ky.m17352c(j);
        }
        return j;
    }

    @Override // com.daaw.qo0
    /* renamed from: p */
    public void mo2075p(qo0.InterfaceC2744a interfaceC2744a, long j) {
        this.f35274B = interfaceC2744a;
        interfaceC2744a.mo3792j(this);
    }

    @Override // com.daaw.qo0
    /* renamed from: q */
    public long mo2074q() {
        if (this.f35281I) {
            return -9223372036854775807L;
        }
        this.f35285s.m25148t();
        this.f35281I = true;
        return -9223372036854775807L;
    }

    /* renamed from: r */
    public final C1697if<InterfaceC3356vo> m2073r(C3883a c3883a, InterfaceC3970c interfaceC3970c, long j) {
        int i;
        Format[] formatArr;
        int[] iArr = new int[2];
        Format[] formatArr2 = new Format[2];
        int i2 = c3883a.f35298f;
        boolean z = i2 != -1;
        if (z) {
            formatArr2[0] = this.f35289w.m1594a(i2).m1598a(0);
            iArr[0] = 4;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = c3883a.f35299g;
        boolean z2 = i3 != -1;
        if (z2) {
            formatArr2[i] = this.f35289w.m1594a(i3).m1598a(0);
            iArr[i] = 3;
            i++;
        }
        if (i < 2) {
            iArr = Arrays.copyOf(iArr, i);
            formatArr = (Format[]) Arrays.copyOf(formatArr2, i);
        } else {
            formatArr = formatArr2;
        }
        int[] iArr2 = iArr;
        ex0.C1232c m23074n = (this.f35278F.f31404d && z) ? this.f35292z.m23074n() : null;
        C1697if<InterfaceC3356vo> c1697if = new C1697if<>(c3883a.f35294b, iArr2, formatArr, this.f35283q.mo6975a(this.f35287u, this.f35278F, this.f35279G, c3883a.f35293a, interfaceC3970c, c3883a.f35294b, this.f35286t, z, z2, m23074n), this, this.f35288v, j, this.f35284r, this.f35285s);
        synchronized (this) {
            this.f35273A.put(c1697if, m23074n);
        }
        return c1697if;
    }

    @Override // com.daaw.qo0
    /* renamed from: s */
    public TrackGroupArray mo2072s() {
        return this.f35289w;
    }

    @Override // com.daaw.qo0
    /* renamed from: t */
    public void mo2071t(long j, boolean z) {
        for (C1697if<InterfaceC3356vo> c1697if : this.f35275C) {
            c1697if.m19861t(j, z);
        }
    }
}
