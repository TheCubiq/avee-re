package com.daaw;

import com.daaw.AbstractC0821b7;
import com.daaw.da1;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayDeque;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class vq0 implements InterfaceC3919zz, da1 {

    /* renamed from: t */
    public static final e00 f30437t = new C3360a();

    /* renamed from: u */
    public static final int f30438u = sq1.m9994v("qt  ");

    /* renamed from: a */
    public final int f30439a;

    /* renamed from: b */
    public final rv0 f30440b;

    /* renamed from: c */
    public final rv0 f30441c;

    /* renamed from: d */
    public final rv0 f30442d;

    /* renamed from: e */
    public final ArrayDeque<AbstractC0821b7.C0822a> f30443e;

    /* renamed from: f */
    public int f30444f;

    /* renamed from: g */
    public int f30445g;

    /* renamed from: h */
    public long f30446h;

    /* renamed from: i */
    public int f30447i;

    /* renamed from: j */
    public rv0 f30448j;

    /* renamed from: k */
    public int f30449k;

    /* renamed from: l */
    public int f30450l;

    /* renamed from: m */
    public int f30451m;

    /* renamed from: n */
    public d00 f30452n;

    /* renamed from: o */
    public C3361b[] f30453o;

    /* renamed from: p */
    public long[][] f30454p;

    /* renamed from: q */
    public int f30455q;

    /* renamed from: r */
    public long f30456r;

    /* renamed from: s */
    public boolean f30457s;

    /* renamed from: com.daaw.vq0$a */
    /* loaded from: classes.dex */
    public static class C3360a implements e00 {
        @Override // com.daaw.e00
        /* renamed from: a */
        public InterfaceC3919zz[] mo4824a() {
            return new InterfaceC3919zz[]{new vq0()};
        }
    }

    /* renamed from: com.daaw.vq0$b */
    /* loaded from: classes.dex */
    public static final class C3361b {

        /* renamed from: a */
        public final nm1 f30458a;

        /* renamed from: b */
        public final tm1 f30459b;

        /* renamed from: c */
        public final sm1 f30460c;

        /* renamed from: d */
        public int f30461d;

        public C3361b(nm1 nm1Var, tm1 tm1Var, sm1 sm1Var) {
            this.f30458a = nm1Var;
            this.f30459b = tm1Var;
            this.f30460c = sm1Var;
        }
    }

    public vq0() {
        this(0);
    }

    public vq0(int i) {
        this.f30439a = i;
        this.f30442d = new rv0(16);
        this.f30443e = new ArrayDeque<>();
        this.f30440b = new rv0(sr0.f26545a);
        this.f30441c = new rv0(4);
        this.f30449k = -1;
    }

    /* renamed from: j */
    public static long[][] m6929j(C3361b[] c3361bArr) {
        long[][] jArr = new long[c3361bArr.length];
        int[] iArr = new int[c3361bArr.length];
        long[] jArr2 = new long[c3361bArr.length];
        boolean[] zArr = new boolean[c3361bArr.length];
        for (int i = 0; i < c3361bArr.length; i++) {
            jArr[i] = new long[c3361bArr[i].f30459b.f27859a];
            jArr2[i] = c3361bArr[i].f30459b.f27863e[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < c3361bArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < c3361bArr.length; i4++) {
                if (!zArr[i4] && jArr2[i4] <= j2) {
                    j2 = jArr2[i4];
                    i3 = i4;
                }
            }
            int i5 = iArr[i3];
            jArr[i3][i5] = j;
            j += c3361bArr[i3].f30459b.f27861c[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr[i3].length) {
                jArr2[i3] = c3361bArr[i3].f30459b.f27863e[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    /* renamed from: l */
    public static int m6927l(tm1 tm1Var, long j) {
        int m8968a = tm1Var.m8968a(j);
        return m8968a == -1 ? tm1Var.m8967b(j) : m8968a;
    }

    /* renamed from: n */
    public static long m6925n(tm1 tm1Var, long j, long j2) {
        int m6927l = m6927l(tm1Var, j);
        return m6927l == -1 ? j2 : Math.min(tm1Var.f27860b[m6927l], j2);
    }

    /* renamed from: p */
    public static boolean m6923p(rv0 rv0Var) {
        rv0Var.m10921J(8);
        if (rv0Var.m10911i() == f30438u) {
            return true;
        }
        rv0Var.m10920K(4);
        while (rv0Var.m10919a() > 0) {
            if (rv0Var.m10911i() == f30438u) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    public static boolean m6918u(int i) {
        return i == AbstractC0821b7.f4382C || i == AbstractC0821b7.f4386E || i == AbstractC0821b7.f4388F || i == AbstractC0821b7.f4390G || i == AbstractC0821b7.f4392H || i == AbstractC0821b7.f4410Q;
    }

    /* renamed from: v */
    public static boolean m6917v(int i) {
        return i == AbstractC0821b7.f4412S || i == AbstractC0821b7.f4384D || i == AbstractC0821b7.f4413T || i == AbstractC0821b7.f4414U || i == AbstractC0821b7.f4446n0 || i == AbstractC0821b7.f4448o0 || i == AbstractC0821b7.f4450p0 || i == AbstractC0821b7.f4411R || i == AbstractC0821b7.f4452q0 || i == AbstractC0821b7.f4454r0 || i == AbstractC0821b7.f4456s0 || i == AbstractC0821b7.f4458t0 || i == AbstractC0821b7.f4460u0 || i == AbstractC0821b7.f4408P || i == AbstractC0821b7.f4421b || i == AbstractC0821b7.f4381B0;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: a */
    public void mo1762a() {
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: c */
    public boolean mo1761c(a00 a00Var) {
        return be1.m26195d(a00Var);
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: d */
    public int mo1760d(a00 a00Var, iy0 iy0Var) {
        while (true) {
            int i = this.f30444f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return m6919t(a00Var, iy0Var);
                    }
                    throw new IllegalStateException();
                } else if (m6920s(a00Var, iy0Var)) {
                    return 1;
                }
            } else if (!m6921r(a00Var)) {
                return -1;
            }
        }
    }

    @Override // com.daaw.da1
    /* renamed from: e */
    public boolean mo6932e() {
        return true;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: f */
    public void mo1759f(long j, long j2) {
        this.f30443e.clear();
        this.f30447i = 0;
        this.f30449k = -1;
        this.f30450l = 0;
        this.f30451m = 0;
        if (j == 0) {
            m6928k();
        } else if (this.f30453o != null) {
            m6916w(j2);
        }
    }

    @Override // com.daaw.da1
    /* renamed from: g */
    public da1.C1068a mo6931g(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int m8967b;
        C3361b[] c3361bArr = this.f30453o;
        if (c3361bArr.length == 0) {
            return new da1.C1068a(fa1.f9301c);
        }
        int i = this.f30455q;
        if (i != -1) {
            tm1 tm1Var = c3361bArr[i].f30459b;
            int m6927l = m6927l(tm1Var, j);
            if (m6927l == -1) {
                return new da1.C1068a(fa1.f9301c);
            }
            long j6 = tm1Var.f27863e[m6927l];
            j2 = tm1Var.f27860b[m6927l];
            if (j6 >= j || m6927l >= tm1Var.f27859a - 1 || (m8967b = tm1Var.m8967b(j)) == -1 || m8967b == m6927l) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = tm1Var.f27863e[m8967b];
                j5 = tm1Var.f27860b[m8967b];
            }
            j3 = j5;
            j = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            C3361b[] c3361bArr2 = this.f30453o;
            if (i2 >= c3361bArr2.length) {
                break;
            }
            if (i2 != this.f30455q) {
                tm1 tm1Var2 = c3361bArr2[i2].f30459b;
                long m6925n = m6925n(tm1Var2, j, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = m6925n(tm1Var2, j4, j3);
                }
                j2 = m6925n;
            }
            i2++;
        }
        fa1 fa1Var = new fa1(j, j2);
        return j4 == -9223372036854775807L ? new da1.C1068a(fa1Var) : new da1.C1068a(fa1Var, new fa1(j4, j3));
    }

    @Override // com.daaw.da1
    /* renamed from: h */
    public long mo6930h() {
        return this.f30456r;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: i */
    public void mo1758i(d00 d00Var) {
        this.f30452n = d00Var;
    }

    /* renamed from: k */
    public final void m6928k() {
        this.f30444f = 0;
        this.f30447i = 0;
    }

    /* renamed from: m */
    public final int m6926m(long j) {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            C3361b[] c3361bArr = this.f30453o;
            if (i3 >= c3361bArr.length) {
                break;
            }
            C3361b c3361b = c3361bArr[i3];
            int i4 = c3361b.f30461d;
            tm1 tm1Var = c3361b.f30459b;
            if (i4 != tm1Var.f27859a) {
                long j5 = tm1Var.f27860b[i4];
                long j6 = this.f30454p[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
            i3++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    /* renamed from: o */
    public final void m6924o(long j) {
        while (!this.f30443e.isEmpty() && this.f30443e.peek().f4472Q0 == j) {
            AbstractC0821b7.C0822a pop = this.f30443e.pop();
            if (pop.f4471a == AbstractC0821b7.f4382C) {
                m6922q(pop);
                this.f30443e.clear();
                this.f30444f = 2;
            } else if (!this.f30443e.isEmpty()) {
                this.f30443e.peek().m26445d(pop);
            }
        }
        if (this.f30444f != 2) {
            m6928k();
        }
    }

    /* renamed from: q */
    public final void m6922q(AbstractC0821b7.C0822a c0822a) {
        Metadata metadata;
        ArrayList arrayList = new ArrayList();
        y50 y50Var = new y50();
        AbstractC0821b7.C0823b m26442g = c0822a.m26442g(AbstractC0821b7.f4381B0);
        if (m26442g != null) {
            metadata = C0930c7.m25545v(m26442g, this.f30457s);
            if (metadata != null) {
                y50Var.m4100c(metadata);
            }
        } else {
            metadata = null;
        }
        int i = -1;
        long j = -9223372036854775807L;
        for (int i2 = 0; i2 < c0822a.f4474S0.size(); i2++) {
            AbstractC0821b7.C0822a c0822a2 = c0822a.f4474S0.get(i2);
            if (c0822a2.f4471a == AbstractC0821b7.f4386E) {
                nm1 m25546u = C0930c7.m25546u(c0822a2, c0822a.m26442g(AbstractC0821b7.f4384D), -9223372036854775807L, null, (this.f30439a & 1) != 0, this.f30457s);
                if (m25546u != null) {
                    tm1 m25550q = C0930c7.m25550q(m25546u, c0822a2.m26443f(AbstractC0821b7.f4388F).m26443f(AbstractC0821b7.f4390G).m26443f(AbstractC0821b7.f4392H), y50Var);
                    if (m25550q.f27859a != 0) {
                        C3361b c3361b = new C3361b(m25546u, m25550q, this.f30452n.mo11478a(i2, m25546u.f20249b));
                        Format m1728h = m25546u.f20253f.m1728h(m25550q.f27862d + 30);
                        if (m25546u.f20249b == 1) {
                            if (y50Var.m4102a()) {
                                m1728h = m1728h.m1730c(y50Var.f33366a, y50Var.f33367b);
                            }
                            if (metadata != null) {
                                m1728h = m1728h.m1727i(metadata);
                            }
                        }
                        c3361b.f30460c.mo10156d(m1728h);
                        long j2 = m25546u.f20252e;
                        if (j2 == -9223372036854775807L) {
                            j2 = m25550q.f27865g;
                        }
                        j = Math.max(j, j2);
                        if (m25546u.f20249b == 2 && i == -1) {
                            i = arrayList.size();
                        }
                        arrayList.add(c3361b);
                    }
                }
            }
        }
        this.f30455q = i;
        this.f30456r = j;
        C3361b[] c3361bArr = (C3361b[]) arrayList.toArray(new C3361b[arrayList.size()]);
        this.f30453o = c3361bArr;
        this.f30454p = m6929j(c3361bArr);
        this.f30452n.mo11470n();
        this.f30452n.mo11475d(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m6921r(a00 a00Var) {
        long position;
        if (this.f30447i == 0) {
            if (!a00Var.mo5864c(this.f30442d.f25637a, 0, 8, true)) {
                return false;
            }
            this.f30447i = 8;
            this.f30442d.m10921J(0);
            this.f30446h = this.f30442d.m10894z();
            this.f30445g = this.f30442d.m10911i();
        }
        long j = this.f30446h;
        if (j != 1) {
            if (j == 0) {
                long mo5859h = a00Var.mo5859h();
                if (mo5859h == -1 && !this.f30443e.isEmpty()) {
                    mo5859h = this.f30443e.peek().f4472Q0;
                }
                if (mo5859h != -1) {
                    position = (mo5859h - a00Var.getPosition()) + this.f30447i;
                }
            }
            if (this.f30446h < this.f30447i) {
                if (m6918u(this.f30445g)) {
                    long position2 = (a00Var.getPosition() + this.f30446h) - this.f30447i;
                    this.f30443e.push(new AbstractC0821b7.C0822a(this.f30445g, position2));
                    if (this.f30446h == this.f30447i) {
                        m6924o(position2);
                    } else {
                        m6928k();
                    }
                } else {
                    if (m6917v(this.f30445g)) {
                        C2914s6.m10685f(this.f30447i == 8);
                        C2914s6.m10685f(this.f30446h <= 2147483647L);
                        rv0 rv0Var = new rv0((int) this.f30446h);
                        this.f30448j = rv0Var;
                        System.arraycopy(this.f30442d.f25637a, 0, rv0Var.f25637a, 0, 8);
                    } else {
                        this.f30448j = null;
                    }
                    this.f30444f = 1;
                }
                return true;
            }
            throw new tv0("Atom size less than header length (unsupported).");
        }
        a00Var.mo5861f(this.f30442d.f25637a, 8, 8);
        this.f30447i += 8;
        position = this.f30442d.m10928C();
        this.f30446h = position;
        if (this.f30446h < this.f30447i) {
        }
    }

    /* renamed from: s */
    public final boolean m6920s(a00 a00Var, iy0 iy0Var) {
        boolean z;
        long j = this.f30446h - this.f30447i;
        long position = a00Var.getPosition() + j;
        rv0 rv0Var = this.f30448j;
        if (rv0Var != null) {
            a00Var.mo5861f(rv0Var.f25637a, this.f30447i, (int) j);
            if (this.f30445g == AbstractC0821b7.f4421b) {
                this.f30457s = m6923p(this.f30448j);
            } else if (!this.f30443e.isEmpty()) {
                this.f30443e.peek().m26444e(new AbstractC0821b7.C0823b(this.f30445g, this.f30448j));
            }
        } else if (j >= 262144) {
            iy0Var.f14112a = a00Var.getPosition() + j;
            z = true;
            m6924o(position);
            return (z || this.f30444f == 2) ? false : true;
        } else {
            a00Var.mo5857j((int) j);
        }
        z = false;
        m6924o(position);
        if (z) {
        }
    }

    /* renamed from: t */
    public final int m6919t(a00 a00Var, iy0 iy0Var) {
        long position = a00Var.getPosition();
        if (this.f30449k == -1) {
            int m6926m = m6926m(position);
            this.f30449k = m6926m;
            if (m6926m == -1) {
                return -1;
            }
        }
        C3361b c3361b = this.f30453o[this.f30449k];
        sm1 sm1Var = c3361b.f30460c;
        int i = c3361b.f30461d;
        tm1 tm1Var = c3361b.f30459b;
        long j = tm1Var.f27860b[i];
        int i2 = tm1Var.f27861c[i];
        long j2 = (j - position) + this.f30450l;
        if (j2 < 0 || j2 >= 262144) {
            iy0Var.f14112a = j;
            return 1;
        }
        if (c3361b.f30458a.f20254g == 1) {
            j2 += 8;
            i2 -= 8;
        }
        a00Var.mo5857j((int) j2);
        int i3 = c3361b.f30458a.f20257j;
        if (i3 == 0) {
            while (true) {
                int i4 = this.f30450l;
                if (i4 >= i2) {
                    break;
                }
                int mo10158b = sm1Var.mo10158b(a00Var, i2 - i4, false);
                this.f30450l += mo10158b;
                this.f30451m -= mo10158b;
            }
        } else {
            byte[] bArr = this.f30441c.f25637a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i5 = 4 - i3;
            while (this.f30450l < i2) {
                int i6 = this.f30451m;
                if (i6 == 0) {
                    a00Var.mo5861f(this.f30441c.f25637a, i5, i3);
                    this.f30441c.m10921J(0);
                    this.f30451m = this.f30441c.m10929B();
                    this.f30440b.m10921J(0);
                    sm1Var.mo10157c(this.f30440b, 4);
                    this.f30450l += 4;
                    i2 += i5;
                } else {
                    int mo10158b2 = sm1Var.mo10158b(a00Var, i6, false);
                    this.f30450l += mo10158b2;
                    this.f30451m -= mo10158b2;
                }
            }
        }
        tm1 tm1Var2 = c3361b.f30459b;
        sm1Var.mo10159a(tm1Var2.f27863e[i], tm1Var2.f27864f[i], i2, 0, null);
        c3361b.f30461d++;
        this.f30449k = -1;
        this.f30450l = 0;
        this.f30451m = 0;
        return 0;
    }

    /* renamed from: w */
    public final void m6916w(long j) {
        C3361b[] c3361bArr;
        for (C3361b c3361b : this.f30453o) {
            tm1 tm1Var = c3361b.f30459b;
            int m8968a = tm1Var.m8968a(j);
            if (m8968a == -1) {
                m8968a = tm1Var.m8967b(j);
            }
            c3361b.f30461d = m8968a;
        }
    }
}
