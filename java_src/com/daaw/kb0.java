package com.daaw;

import com.daaw.cp0;
import com.daaw.ib0;
import com.daaw.pb0;
import com.daaw.qo0;
import com.daaw.rb0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class kb0 implements qo0, rb0.InterfaceC2845c, pb0.InterfaceC2536a {

    /* renamed from: A */
    public int f16092A;

    /* renamed from: B */
    public TrackGroupArray f16093B;

    /* renamed from: E */
    public gb1 f16096E;

    /* renamed from: F */
    public boolean f16097F;

    /* renamed from: p */
    public final gb0 f16098p;

    /* renamed from: q */
    public final pb0 f16099q;

    /* renamed from: r */
    public final fb0 f16100r;

    /* renamed from: s */
    public final int f16101s;

    /* renamed from: t */
    public final cp0.C0975a f16102t;

    /* renamed from: u */
    public final InterfaceC2006l2 f16103u;

    /* renamed from: x */
    public final InterfaceC3441wi f16106x;

    /* renamed from: y */
    public final boolean f16107y;

    /* renamed from: z */
    public qo0.InterfaceC2744a f16108z;

    /* renamed from: v */
    public final IdentityHashMap<d81, Integer> f16104v = new IdentityHashMap<>();

    /* renamed from: w */
    public final pl1 f16105w = new pl1();

    /* renamed from: C */
    public rb0[] f16094C = new rb0[0];

    /* renamed from: D */
    public rb0[] f16095D = new rb0[0];

    public kb0(gb0 gb0Var, pb0 pb0Var, fb0 fb0Var, int i, cp0.C0975a c0975a, InterfaceC2006l2 interfaceC2006l2, InterfaceC3441wi interfaceC3441wi, boolean z) {
        this.f16098p = gb0Var;
        this.f16099q = pb0Var;
        this.f16100r = fb0Var;
        this.f16101s = i;
        this.f16102t = c0975a;
        this.f16103u = interfaceC2006l2;
        this.f16106x = interfaceC3441wi;
        this.f16107y = z;
        this.f16096E = interfaceC3441wi.mo6060a(new gb1[0]);
        c0975a.m25151q();
    }

    /* renamed from: v */
    public static Format m17840v(Format format, Format format2, int i) {
        String str;
        String m9997s;
        int i2;
        int i3;
        if (format2 != null) {
            String str2 = format2.f35718r;
            int i4 = format2.f35706G;
            int i5 = format2.f35712M;
            str = format2.f35713N;
            m9997s = str2;
            i2 = i4;
            i3 = i5;
        } else {
            str = null;
            m9997s = sq1.m9997s(format.f35718r, 1);
            i2 = -1;
            i3 = 0;
        }
        return Format.m1722u(format.f35716p, hq0.m20501d(m9997s), m9997s, i, -1, i2, -1, null, null, i3, str);
    }

    /* renamed from: w */
    public static Format m17839w(Format format) {
        String m9997s = sq1.m9997s(format.f35718r, 2);
        return Format.m1736J(format.f35716p, hq0.m20501d(m9997s), m9997s, format.f35717q, -1, format.f35725y, format.f35726z, format.f35700A, null, null);
    }

    @Override // com.daaw.rb0.InterfaceC2845c
    /* renamed from: a */
    public void mo11459a() {
        rb0[] rb0VarArr;
        int i = this.f16092A - 1;
        this.f16092A = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (rb0 rb0Var : this.f16094C) {
            i2 += rb0Var.m11467s().f35848p;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i2];
        int i3 = 0;
        for (rb0 rb0Var2 : this.f16094C) {
            int i4 = rb0Var2.m11467s().f35848p;
            int i5 = 0;
            while (i5 < i4) {
                trackGroupArr[i3] = rb0Var2.m11467s().m1594a(i5);
                i5++;
                i3++;
            }
        }
        this.f16093B = new TrackGroupArray(trackGroupArr);
        this.f16108z.mo3792j(this);
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: b */
    public long mo2087b() {
        return this.f16096E.mo2087b();
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: c */
    public boolean mo2086c(long j) {
        if (this.f16093B == null) {
            for (rb0 rb0Var : this.f16094C) {
                rb0Var.m11461y();
            }
            return false;
        }
        return this.f16096E.mo2086c(j);
    }

    @Override // com.daaw.pb0.InterfaceC2536a
    /* renamed from: d */
    public boolean mo13495d(ib0.C1674a c1674a, boolean z) {
        boolean z2 = true;
        for (rb0 rb0Var : this.f16094C) {
            z2 &= rb0Var.m11490O(c1674a, z);
        }
        this.f16108z.mo2077n(this);
        return z2;
    }

    @Override // com.daaw.qo0
    /* renamed from: e */
    public long mo2084e(long j, ea1 ea1Var) {
        return j;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: f */
    public long mo2083f() {
        return this.f16096E.mo2083f();
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: g */
    public void mo2082g(long j) {
        this.f16096E.mo2082g(j);
    }

    @Override // com.daaw.pb0.InterfaceC2536a
    /* renamed from: h */
    public void mo13494h() {
        this.f16108z.mo2077n(this);
    }

    @Override // com.daaw.qo0
    /* renamed from: i */
    public long mo2080i(InterfaceC3970c[] interfaceC3970cArr, boolean[] zArr, d81[] d81VarArr, boolean[] zArr2, long j) {
        d81[] d81VarArr2 = d81VarArr;
        int[] iArr = new int[interfaceC3970cArr.length];
        int[] iArr2 = new int[interfaceC3970cArr.length];
        for (int i = 0; i < interfaceC3970cArr.length; i++) {
            iArr[i] = d81VarArr2[i] == null ? -1 : this.f16104v.get(d81VarArr2[i]).intValue();
            iArr2[i] = -1;
            if (interfaceC3970cArr[i] != null) {
                TrackGroup mo1534a = interfaceC3970cArr[i].mo1534a();
                int i2 = 0;
                while (true) {
                    rb0[] rb0VarArr = this.f16094C;
                    if (i2 >= rb0VarArr.length) {
                        break;
                    } else if (rb0VarArr[i2].m11467s().m1593b(mo1534a) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.f16104v.clear();
        int length = interfaceC3970cArr.length;
        d81[] d81VarArr3 = new d81[length];
        d81[] d81VarArr4 = new d81[interfaceC3970cArr.length];
        InterfaceC3970c[] interfaceC3970cArr2 = new InterfaceC3970c[interfaceC3970cArr.length];
        rb0[] rb0VarArr2 = new rb0[this.f16094C.length];
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i4 < this.f16094C.length) {
            for (int i5 = 0; i5 < interfaceC3970cArr.length; i5++) {
                InterfaceC3970c interfaceC3970c = null;
                d81VarArr4[i5] = iArr[i5] == i4 ? d81VarArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    interfaceC3970c = interfaceC3970cArr[i5];
                }
                interfaceC3970cArr2[i5] = interfaceC3970c;
            }
            rb0 rb0Var = this.f16094C[i4];
            int i6 = i3;
            int i7 = length;
            int i8 = i4;
            InterfaceC3970c[] interfaceC3970cArr3 = interfaceC3970cArr2;
            rb0[] rb0VarArr3 = rb0VarArr2;
            boolean m11482W = rb0Var.m11482W(interfaceC3970cArr2, zArr, d81VarArr4, zArr2, j, z);
            int i9 = 0;
            boolean z2 = false;
            while (true) {
                if (i9 >= interfaceC3970cArr.length) {
                    break;
                }
                if (iArr2[i9] == i8) {
                    C2914s6.m10685f(d81VarArr4[i9] != null);
                    d81VarArr3[i9] = d81VarArr4[i9];
                    this.f16104v.put(d81VarArr4[i9], Integer.valueOf(i8));
                    z2 = true;
                } else if (iArr[i9] == i8) {
                    C2914s6.m10685f(d81VarArr4[i9] == null);
                }
                i9++;
            }
            if (z2) {
                rb0VarArr3[i6] = rb0Var;
                i3 = i6 + 1;
                if (i6 == 0) {
                    rb0Var.m11481X(true);
                    if (!m11482W) {
                        rb0[] rb0VarArr4 = this.f16095D;
                        if (rb0VarArr4.length != 0) {
                            if (rb0Var == rb0VarArr4[0]) {
                            }
                            this.f16105w.m13300b();
                            z = true;
                        }
                    }
                    this.f16105w.m13300b();
                    z = true;
                } else {
                    rb0Var.m11481X(false);
                }
            } else {
                i3 = i6;
            }
            i4 = i8 + 1;
            d81VarArr2 = d81VarArr;
            rb0VarArr2 = rb0VarArr3;
            length = i7;
            interfaceC3970cArr2 = interfaceC3970cArr3;
        }
        System.arraycopy(d81VarArr3, 0, d81VarArr2, 0, length);
        rb0[] rb0VarArr5 = (rb0[]) Arrays.copyOf(rb0VarArr2, i3);
        this.f16095D = rb0VarArr5;
        this.f16096E = this.f16106x.mo6060a(rb0VarArr5);
        return j;
    }

    @Override // com.daaw.rb0.InterfaceC2845c
    /* renamed from: k */
    public void mo11458k(ib0.C1674a c1674a) {
        this.f16099q.mo13503e(c1674a);
    }

    @Override // com.daaw.qo0
    /* renamed from: l */
    public void mo2079l() {
        for (rb0 rb0Var : this.f16094C) {
            rb0Var.m11471l();
        }
    }

    @Override // com.daaw.qo0
    /* renamed from: m */
    public long mo2078m(long j) {
        rb0[] rb0VarArr = this.f16095D;
        if (rb0VarArr.length > 0) {
            boolean m11483V = rb0VarArr[0].m11483V(j, false);
            int i = 1;
            while (true) {
                rb0[] rb0VarArr2 = this.f16095D;
                if (i >= rb0VarArr2.length) {
                    break;
                }
                rb0VarArr2[i].m11483V(j, m11483V);
                i++;
            }
            if (m11483V) {
                this.f16105w.m13300b();
            }
        }
        return j;
    }

    /* renamed from: o */
    public final void m17843o(ib0 ib0Var, long j) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(ib0Var.f13424c);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < arrayList2.size(); i++) {
            ib0.C1674a c1674a = (ib0.C1674a) arrayList2.get(i);
            Format format = c1674a.f13430b;
            if (format.f35726z > 0 || sq1.m9997s(format.f35718r, 2) != null) {
                arrayList3.add(c1674a);
            } else if (sq1.m9997s(format.f35718r, 1) != null) {
                arrayList4.add(c1674a);
            }
        }
        if (arrayList3.isEmpty()) {
            if (arrayList4.size() < arrayList2.size()) {
                arrayList2.removeAll(arrayList4);
            }
            arrayList = arrayList2;
        } else {
            arrayList = arrayList3;
        }
        C2914s6.m10690a(!arrayList.isEmpty());
        ib0.C1674a[] c1674aArr = (ib0.C1674a[]) arrayList.toArray(new ib0.C1674a[0]);
        String str = c1674aArr[0].f13430b.f35718r;
        rb0 m17841u = m17841u(0, c1674aArr, ib0Var.f13427f, ib0Var.f13428g, j);
        this.f16094C[0] = m17841u;
        if (!this.f16107y || str == null) {
            m17841u.m11481X(true);
            m17841u.m11461y();
            return;
        }
        boolean z = sq1.m9997s(str, 2) != null;
        boolean z2 = sq1.m9997s(str, 1) != null;
        ArrayList arrayList5 = new ArrayList();
        if (z) {
            int size = arrayList.size();
            Format[] formatArr = new Format[size];
            for (int i2 = 0; i2 < size; i2++) {
                formatArr[i2] = m17839w(c1674aArr[i2].f13430b);
            }
            arrayList5.add(new TrackGroup(formatArr));
            if (z2 && (ib0Var.f13427f != null || ib0Var.f13425d.isEmpty())) {
                arrayList5.add(new TrackGroup(m17840v(c1674aArr[0].f13430b, ib0Var.f13427f, -1)));
            }
            List<Format> list = ib0Var.f13428g;
            if (list != null) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    arrayList5.add(new TrackGroup(list.get(i3)));
                }
            }
        } else if (!z2) {
            throw new IllegalArgumentException("Unexpected codecs attribute: " + str);
        } else {
            int size2 = arrayList.size();
            Format[] formatArr2 = new Format[size2];
            for (int i4 = 0; i4 < size2; i4++) {
                Format format2 = c1674aArr[i4].f13430b;
                formatArr2[i4] = m17840v(format2, ib0Var.f13427f, format2.f35717q);
            }
            arrayList5.add(new TrackGroup(formatArr2));
        }
        TrackGroup trackGroup = new TrackGroup(Format.m1718y("ID3", "application/id3", null, -1, null));
        arrayList5.add(trackGroup);
        m17841u.m11488Q(new TrackGroupArray((TrackGroup[]) arrayList5.toArray(new TrackGroup[0])), 0, new TrackGroupArray(trackGroup));
    }

    @Override // com.daaw.qo0
    /* renamed from: p */
    public void mo2075p(qo0.InterfaceC2744a interfaceC2744a, long j) {
        this.f16108z = interfaceC2744a;
        this.f16099q.mo13497l(this);
        m17842r(j);
    }

    @Override // com.daaw.qo0
    /* renamed from: q */
    public long mo2074q() {
        if (this.f16097F) {
            return -9223372036854775807L;
        }
        this.f16102t.m25148t();
        this.f16097F = true;
        return -9223372036854775807L;
    }

    /* renamed from: r */
    public final void m17842r(long j) {
        ib0 mo13499i = this.f16099q.mo13499i();
        List<ib0.C1674a> list = mo13499i.f13425d;
        List<ib0.C1674a> list2 = mo13499i.f13426e;
        int size = list.size() + 1 + list2.size();
        this.f16094C = new rb0[size];
        this.f16092A = size;
        m17843o(mo13499i, j);
        char c = 0;
        int i = 0;
        int i2 = 1;
        while (i < list.size()) {
            ib0.C1674a c1674a = list.get(i);
            ib0.C1674a[] c1674aArr = new ib0.C1674a[1];
            c1674aArr[c] = c1674a;
            rb0 m17841u = m17841u(1, c1674aArr, null, Collections.emptyList(), j);
            int i3 = i2 + 1;
            this.f16094C[i2] = m17841u;
            Format format = c1674a.f13430b;
            if (!this.f16107y || format.f35718r == null) {
                m17841u.m11461y();
            } else {
                m17841u.m11488Q(new TrackGroupArray(new TrackGroup(c1674a.f13430b)), 0, TrackGroupArray.f35847s);
            }
            i++;
            i2 = i3;
            c = 0;
        }
        int i4 = 0;
        while (i4 < list2.size()) {
            ib0.C1674a c1674a2 = list2.get(i4);
            rb0 m17841u2 = m17841u(3, new ib0.C1674a[]{c1674a2}, null, Collections.emptyList(), j);
            this.f16094C[i2] = m17841u2;
            m17841u2.m11488Q(new TrackGroupArray(new TrackGroup(c1674a2.f13430b)), 0, TrackGroupArray.f35847s);
            i4++;
            i2++;
        }
        this.f16095D = this.f16094C;
    }

    @Override // com.daaw.qo0
    /* renamed from: s */
    public TrackGroupArray mo2072s() {
        return this.f16093B;
    }

    @Override // com.daaw.qo0
    /* renamed from: t */
    public void mo2071t(long j, boolean z) {
        for (rb0 rb0Var : this.f16095D) {
            rb0Var.m11466t(j, z);
        }
    }

    /* renamed from: u */
    public final rb0 m17841u(int i, ib0.C1674a[] c1674aArr, Format format, List<Format> list, long j) {
        return new rb0(i, this, new eb0(this.f16098p, this.f16099q, c1674aArr, this.f16100r, this.f16105w, list), this.f16103u, j, format, this.f16101s, this.f16102t);
    }

    @Override // com.daaw.gb1.InterfaceC1390a
    /* renamed from: x */
    public void mo2077n(rb0 rb0Var) {
        this.f16108z.mo2077n(this);
    }

    /* renamed from: y */
    public void m17837y() {
        this.f16099q.mo13505c(this);
        for (rb0 rb0Var : this.f16094C) {
            rb0Var.m11486S();
        }
        this.f16108z = null;
        this.f16102t.m25150r();
    }
}
