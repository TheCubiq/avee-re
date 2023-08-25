package com.daaw;

import android.util.Base64;
import com.daaw.cp0;
import com.daaw.gb1;
import com.daaw.qo0;
import com.daaw.we1;
import com.daaw.xe1;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class ze1 implements qo0, gb1.InterfaceC1390a<C1697if<we1>> {

    /* renamed from: A */
    public gb1 f34990A;

    /* renamed from: B */
    public boolean f34991B;

    /* renamed from: p */
    public final we1.InterfaceC3434a f34992p;

    /* renamed from: q */
    public final lk0 f34993q;

    /* renamed from: r */
    public final int f34994r;

    /* renamed from: s */
    public final cp0.C0975a f34995s;

    /* renamed from: t */
    public final InterfaceC2006l2 f34996t;

    /* renamed from: u */
    public final TrackGroupArray f34997u;

    /* renamed from: v */
    public final pm1[] f34998v;

    /* renamed from: w */
    public final InterfaceC3441wi f34999w;

    /* renamed from: x */
    public qo0.InterfaceC2744a f35000x;

    /* renamed from: y */
    public xe1 f35001y;

    /* renamed from: z */
    public C1697if<we1>[] f35002z;

    public ze1(xe1 xe1Var, we1.InterfaceC3434a interfaceC3434a, InterfaceC3441wi interfaceC3441wi, int i, cp0.C0975a c0975a, lk0 lk0Var, InterfaceC2006l2 interfaceC2006l2) {
        this.f34992p = interfaceC3434a;
        this.f34993q = lk0Var;
        this.f34994r = i;
        this.f34995s = c0975a;
        this.f34996t = interfaceC2006l2;
        this.f34999w = interfaceC3441wi;
        this.f34997u = m2425h(xe1Var);
        xe1.C3534a c3534a = xe1Var.f32610e;
        if (c3534a != null) {
            this.f34998v = new pm1[]{new pm1(true, null, 8, m2424o(c3534a.f32615b), 0, 0, null)};
        } else {
            this.f34998v = null;
        }
        this.f35001y = xe1Var;
        C1697if<we1>[] m2423r = m2423r(0);
        this.f35002z = m2423r;
        this.f34990A = interfaceC3441wi.mo6060a(m2423r);
        c0975a.m25151q();
    }

    /* renamed from: h */
    public static TrackGroupArray m2425h(xe1 xe1Var) {
        TrackGroup[] trackGroupArr = new TrackGroup[xe1Var.f32611f.length];
        for (int i = 0; i < xe1Var.f32611f.length; i++) {
            trackGroupArr[i] = new TrackGroup(xe1Var.f32611f[i].f32625j);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    /* renamed from: o */
    public static byte[] m2424o(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i += 2) {
            sb.append((char) bArr[i]);
        }
        String sb2 = sb.toString();
        byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
        m2420w(decode, 0, 3);
        m2420w(decode, 1, 2);
        m2420w(decode, 4, 5);
        m2420w(decode, 6, 7);
        return decode;
    }

    /* renamed from: r */
    public static C1697if<we1>[] m2423r(int i) {
        return new C1697if[i];
    }

    /* renamed from: w */
    public static void m2420w(byte[] bArr, int i, int i2) {
        byte b = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: b */
    public long mo2087b() {
        return this.f34990A.mo2087b();
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: c */
    public boolean mo2086c(long j) {
        return this.f34990A.mo2086c(j);
    }

    /* renamed from: d */
    public final C1697if<we1> m2426d(InterfaceC3970c interfaceC3970c, long j) {
        int m1593b = this.f34997u.m1593b(interfaceC3970c.mo1534a());
        return new C1697if<>(this.f35001y.f32611f[m1593b].f32616a, null, null, this.f34992p.mo3389a(this.f34993q, this.f35001y, m1593b, interfaceC3970c, this.f34998v), this, this.f34996t, j, this.f34994r, this.f34995s);
    }

    @Override // com.daaw.qo0
    /* renamed from: e */
    public long mo2084e(long j, ea1 ea1Var) {
        C1697if<we1>[] c1697ifArr;
        for (C1697if<we1> c1697if : this.f35002z) {
            if (c1697if.f13596p == 2) {
                return c1697if.m19862e(j, ea1Var);
            }
        }
        return j;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: f */
    public long mo2083f() {
        return this.f34990A.mo2083f();
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: g */
    public void mo2082g(long j) {
        this.f34990A.mo2082g(j);
    }

    @Override // com.daaw.qo0
    /* renamed from: i */
    public long mo2080i(InterfaceC3970c[] interfaceC3970cArr, boolean[] zArr, d81[] d81VarArr, boolean[] zArr2, long j) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < interfaceC3970cArr.length; i++) {
            if (d81VarArr[i] != null) {
                C1697if c1697if = (C1697if) d81VarArr[i];
                if (interfaceC3970cArr[i] == null || !zArr[i]) {
                    c1697if.m19866M();
                    d81VarArr[i] = null;
                } else {
                    arrayList.add(c1697if);
                }
            }
            if (d81VarArr[i] == null && interfaceC3970cArr[i] != null) {
                C1697if<we1> m2426d = m2426d(interfaceC3970cArr[i], j);
                arrayList.add(m2426d);
                d81VarArr[i] = m2426d;
                zArr2[i] = true;
            }
        }
        C1697if<we1>[] m2423r = m2423r(arrayList.size());
        this.f35002z = m2423r;
        arrayList.toArray(m2423r);
        this.f34990A = this.f34999w.mo6060a(this.f35002z);
        return j;
    }

    @Override // com.daaw.qo0
    /* renamed from: l */
    public void mo2079l() {
        this.f34993q.mo16893a();
    }

    @Override // com.daaw.qo0
    /* renamed from: m */
    public long mo2078m(long j) {
        for (C1697if<we1> c1697if : this.f35002z) {
            c1697if.m19864O(j);
        }
        return j;
    }

    @Override // com.daaw.qo0
    /* renamed from: p */
    public void mo2075p(qo0.InterfaceC2744a interfaceC2744a, long j) {
        this.f35000x = interfaceC2744a;
        interfaceC2744a.mo3792j(this);
    }

    @Override // com.daaw.qo0
    /* renamed from: q */
    public long mo2074q() {
        if (this.f34991B) {
            return -9223372036854775807L;
        }
        this.f34995s.m25148t();
        this.f34991B = true;
        return -9223372036854775807L;
    }

    @Override // com.daaw.qo0
    /* renamed from: s */
    public TrackGroupArray mo2072s() {
        return this.f34997u;
    }

    @Override // com.daaw.qo0
    /* renamed from: t */
    public void mo2071t(long j, boolean z) {
        for (C1697if<we1> c1697if : this.f35002z) {
            c1697if.m19861t(j, z);
        }
    }

    @Override // com.daaw.gb1.InterfaceC1390a
    /* renamed from: u */
    public void mo2077n(C1697if<we1> c1697if) {
        this.f35000x.mo2077n(this);
    }

    /* renamed from: v */
    public void m2421v() {
        for (C1697if<we1> c1697if : this.f35002z) {
            c1697if.m19866M();
        }
        this.f35000x = null;
        this.f34995s.m25150r();
    }

    /* renamed from: x */
    public void m2419x(xe1 xe1Var) {
        this.f35001y = xe1Var;
        for (C1697if<we1> c1697if : this.f35002z) {
            c1697if.m19877B().mo3397b(xe1Var);
        }
        this.f35000x.mo2077n(this);
    }
}
