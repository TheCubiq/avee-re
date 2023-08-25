package com.daaw;

import android.net.Uri;
import android.os.SystemClock;
import com.daaw.ib0;
import com.daaw.lb0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class eb0 {

    /* renamed from: a */
    public final gb0 f8294a;

    /* renamed from: b */
    public final InterfaceC2200mp f8295b;

    /* renamed from: c */
    public final InterfaceC2200mp f8296c;

    /* renamed from: d */
    public final pl1 f8297d;

    /* renamed from: e */
    public final ib0.C1674a[] f8298e;

    /* renamed from: f */
    public final pb0 f8299f;

    /* renamed from: g */
    public final TrackGroup f8300g;

    /* renamed from: h */
    public final List<Format> f8301h;

    /* renamed from: i */
    public boolean f8302i;

    /* renamed from: j */
    public byte[] f8303j;

    /* renamed from: k */
    public IOException f8304k;

    /* renamed from: l */
    public ib0.C1674a f8305l;

    /* renamed from: m */
    public boolean f8306m;

    /* renamed from: n */
    public Uri f8307n;

    /* renamed from: o */
    public byte[] f8308o;

    /* renamed from: p */
    public String f8309p;

    /* renamed from: q */
    public byte[] f8310q;

    /* renamed from: r */
    public InterfaceC3970c f8311r;

    /* renamed from: s */
    public long f8312s = -9223372036854775807L;

    /* renamed from: t */
    public boolean f8313t;

    /* renamed from: com.daaw.eb0$a */
    /* loaded from: classes.dex */
    public static final class C1173a extends AbstractC1122dp {

        /* renamed from: l */
        public final String f8314l;

        /* renamed from: m */
        public byte[] f8315m;

        public C1173a(InterfaceC2200mp interfaceC2200mp, C2570pp c2570pp, Format format, int i, Object obj, byte[] bArr, String str) {
            super(interfaceC2200mp, c2570pp, 3, format, i, obj, bArr);
            this.f8314l = str;
        }

        @Override // com.daaw.AbstractC1122dp
        /* renamed from: e */
        public void mo23615e(byte[] bArr, int i) {
            this.f8315m = Arrays.copyOf(bArr, i);
        }

        /* renamed from: h */
        public byte[] m23614h() {
            return this.f8315m;
        }
    }

    /* renamed from: com.daaw.eb0$b */
    /* loaded from: classes.dex */
    public static final class C1174b {

        /* renamed from: a */
        public AbstractC1180ef f8316a;

        /* renamed from: b */
        public boolean f8317b;

        /* renamed from: c */
        public ib0.C1674a f8318c;

        public C1174b() {
            m23613a();
        }

        /* renamed from: a */
        public void m23613a() {
            this.f8316a = null;
            this.f8317b = false;
            this.f8318c = null;
        }
    }

    /* renamed from: com.daaw.eb0$c */
    /* loaded from: classes.dex */
    public static final class C1175c extends AbstractC3823za {

        /* renamed from: g */
        public int f8319g;

        public C1175c(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
            this.f8319g = mo1526i(trackGroup.m1598a(0));
        }

        @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
        /* renamed from: b */
        public int mo1533b() {
            return this.f8319g;
        }

        @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
        /* renamed from: l */
        public int mo1523l() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
        /* renamed from: n */
        public void mo1521n(long j, long j2, long j3) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (m2581q(this.f8319g, elapsedRealtime)) {
                for (int i = this.f34635b - 1; i >= 0; i--) {
                    if (!m2581q(i, elapsedRealtime)) {
                        this.f8319g = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.InterfaceC3970c
        /* renamed from: o */
        public Object mo1520o() {
            return null;
        }
    }

    public eb0(gb0 gb0Var, pb0 pb0Var, ib0.C1674a[] c1674aArr, fb0 fb0Var, pl1 pl1Var, List<Format> list) {
        this.f8294a = gb0Var;
        this.f8299f = pb0Var;
        this.f8298e = c1674aArr;
        this.f8297d = pl1Var;
        this.f8301h = list;
        Format[] formatArr = new Format[c1674aArr.length];
        int[] iArr = new int[c1674aArr.length];
        for (int i = 0; i < c1674aArr.length; i++) {
            formatArr[i] = c1674aArr[i].f13430b;
            iArr[i] = i;
        }
        this.f8295b = fb0Var.mo22813a(1);
        this.f8296c = fb0Var.mo22813a(3);
        TrackGroup trackGroup = new TrackGroup(formatArr);
        this.f8300g = trackGroup;
        this.f8311r = new C1175c(trackGroup, iArr);
    }

    /* renamed from: a */
    public final void m23630a() {
        this.f8307n = null;
        this.f8308o = null;
        this.f8309p = null;
        this.f8310q = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m23629b(jb0 jb0Var, long j, long j2, C1174b c1174b) {
        long m10012d;
        long j3;
        long j4;
        int m1597b = jb0Var == null ? -1 : this.f8300g.m1597b(jb0Var.f8430c);
        long j5 = j2 - j;
        long m23620k = m23620k(j);
        if (jb0Var != null && !this.f8306m) {
            long m23532d = jb0Var.m23532d();
            j5 = Math.max(0L, j5 - m23532d);
            if (m23620k != -9223372036854775807L) {
                m23620k = Math.max(0L, m23620k - m23532d);
            }
        }
        this.f8311r.mo1521n(j, j5, m23620k);
        int mo1525j = this.f8311r.mo1525j();
        boolean z = m1597b != mo1525j;
        ib0.C1674a c1674a = this.f8298e[mo1525j];
        if (!this.f8299f.mo13496m(c1674a)) {
            c1174b.f8318c = c1674a;
            this.f8313t &= this.f8305l == c1674a;
            this.f8305l = c1674a;
            return;
        }
        lb0 mo13504d = this.f8299f.mo13504d(c1674a);
        this.f8306m = mo13504d.f17193k;
        m23616o(mo13504d);
        long mo13502f = mo13504d.f17187e - this.f8299f.mo13502f();
        if (jb0Var == null || z) {
            long j6 = mo13504d.f17198p + mo13502f;
            long j7 = (jb0Var == null || this.f8306m) ? j2 : jb0Var.f8433f;
            if (mo13504d.f17194l || j7 < j6) {
                List<lb0.C2025a> list = mo13504d.f17197o;
                Long valueOf = Long.valueOf(j7 - mo13502f);
                boolean z2 = !this.f8299f.mo13501g() || jb0Var == null;
                long j8 = mo13504d.f17190h;
                m10012d = sq1.m10012d(list, valueOf, true, z2) + j8;
                if (m10012d < j8 && jb0Var != null) {
                    c1674a = this.f8298e[m1597b];
                    lb0 mo13504d2 = this.f8299f.mo13504d(c1674a);
                    m10012d = jb0Var.mo2104e();
                    mo13502f = mo13504d2.f17187e - this.f8299f.mo13502f();
                    mo13504d = mo13504d2;
                    lb0 lb0Var = mo13504d;
                    j3 = m10012d;
                    ib0.C1674a c1674a2 = c1674a;
                    j4 = lb0Var.f17190h;
                    if (j3 >= j4) {
                        this.f8304k = new C2428ob();
                        return;
                    }
                    int i = (int) (j3 - j4);
                    if (i >= lb0Var.f17197o.size()) {
                        if (lb0Var.f17194l) {
                            c1174b.f8317b = true;
                            return;
                        }
                        c1174b.f8318c = c1674a2;
                        this.f8313t &= this.f8305l == c1674a2;
                        this.f8305l = c1674a2;
                        return;
                    }
                    this.f8313t = false;
                    this.f8305l = null;
                    lb0.C2025a c2025a = lb0Var.f17197o.get(i);
                    String str = c2025a.f17204u;
                    if (str != null) {
                        Uri m19491d = iq1.m19491d(lb0Var.f19774a, str);
                        if (!m19491d.equals(this.f8307n)) {
                            c1174b.f8316a = m23625f(m19491d, c2025a.f17205v, m1597b, this.f8311r.mo1523l(), this.f8311r.mo1520o());
                            return;
                        } else if (!sq1.m10016b(c2025a.f17205v, this.f8309p)) {
                            m23618m(m19491d, c2025a.f17205v, this.f8308o);
                        }
                    } else {
                        m23630a();
                    }
                    lb0.C2025a c2025a2 = c2025a.f17200q;
                    C2570pp c2570pp = c2025a2 != null ? new C2570pp(iq1.m19491d(lb0Var.f19774a, c2025a2.f17199p), c2025a2.f17206w, c2025a2.f17207x, null) : null;
                    long j9 = c2025a.f17203t + mo13502f;
                    int i2 = lb0Var.f17189g + c2025a.f17202s;
                    c1174b.f8316a = new jb0(this.f8294a, this.f8295b, new C2570pp(iq1.m19491d(lb0Var.f19774a, c2025a.f17199p), c2025a.f17206w, c2025a.f17207x, null), c2570pp, c1674a2, this.f8301h, this.f8311r.mo1523l(), this.f8311r.mo1520o(), j9, j9 + c2025a.f17201r, j3, i2, c2025a.f17208y, this.f8302i, this.f8297d.m13301a(i2), jb0Var, lb0Var.f17196n, this.f8308o, this.f8310q);
                    return;
                }
            } else {
                m10012d = mo13504d.f17190h + mo13504d.f17197o.size();
            }
        } else {
            m10012d = jb0Var.mo2104e();
        }
        m1597b = mo1525j;
        lb0 lb0Var2 = mo13504d;
        j3 = m10012d;
        ib0.C1674a c1674a22 = c1674a;
        j4 = lb0Var2.f17190h;
        if (j3 >= j4) {
        }
    }

    /* renamed from: c */
    public TrackGroup m23628c() {
        return this.f8300g;
    }

    /* renamed from: d */
    public InterfaceC3970c m23627d() {
        return this.f8311r;
    }

    /* renamed from: e */
    public void m23626e() {
        IOException iOException = this.f8304k;
        if (iOException != null) {
            throw iOException;
        }
        ib0.C1674a c1674a = this.f8305l;
        if (c1674a == null || !this.f8313t) {
            return;
        }
        this.f8299f.mo13500h(c1674a);
    }

    /* renamed from: f */
    public final C1173a m23625f(Uri uri, String str, int i, int i2, Object obj) {
        return new C1173a(this.f8296c, new C2570pp(uri, 0L, -1L, null, 1), this.f8298e[i].f13430b, i2, obj, this.f8303j, str);
    }

    /* renamed from: g */
    public void m23624g(AbstractC1180ef abstractC1180ef) {
        if (abstractC1180ef instanceof C1173a) {
            C1173a c1173a = (C1173a) abstractC1180ef;
            this.f8303j = c1173a.m24115f();
            m23618m(c1173a.f8428a.f23115a, c1173a.f8314l, c1173a.m23614h());
        }
    }

    /* renamed from: h */
    public boolean m23623h(AbstractC1180ef abstractC1180ef, boolean z, IOException iOException) {
        if (z) {
            InterfaceC3970c interfaceC3970c = this.f8311r;
            if (C1943kf.m17771a(interfaceC3970c, interfaceC3970c.mo1519p(this.f8300g.m1597b(abstractC1180ef.f8430c)), iOException)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public boolean m23622i(ib0.C1674a c1674a, boolean z) {
        int mo1519p;
        int m1597b = this.f8300g.m1597b(c1674a.f13430b);
        if (m1597b == -1 || (mo1519p = this.f8311r.mo1519p(m1597b)) == -1) {
            return true;
        }
        this.f8313t = (this.f8305l == c1674a) | this.f8313t;
        return !z || this.f8311r.mo1532c(mo1519p, 60000L);
    }

    /* renamed from: j */
    public void m23621j() {
        this.f8304k = null;
    }

    /* renamed from: k */
    public final long m23620k(long j) {
        long j2 = this.f8312s;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: l */
    public void m23619l(InterfaceC3970c interfaceC3970c) {
        this.f8311r = interfaceC3970c;
    }

    /* renamed from: m */
    public final void m23618m(Uri uri, String str, byte[] bArr) {
        byte[] byteArray = new BigInteger(sq1.m10017a0(str).startsWith("0x") ? str.substring(2) : str, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr2, (16 - byteArray.length) + length, byteArray.length - length);
        this.f8307n = uri;
        this.f8308o = bArr;
        this.f8309p = str;
        this.f8310q = bArr2;
    }

    /* renamed from: n */
    public void m23617n(boolean z) {
        this.f8302i = z;
    }

    /* renamed from: o */
    public final void m23616o(lb0 lb0Var) {
        this.f8312s = lb0Var.f17194l ? -9223372036854775807L : lb0Var.m17068e() - this.f8299f.mo13502f();
    }
}
