package com.daaw;

import com.daaw.qo0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.InterfaceC3970c;
/* renamed from: com.daaw.yf */
/* loaded from: classes.dex */
public final class C3704yf implements qo0, qo0.InterfaceC2744a {

    /* renamed from: p */
    public final qo0 f33614p;

    /* renamed from: q */
    public qo0.InterfaceC2744a f33615q;

    /* renamed from: r */
    public C3705a[] f33616r = new C3705a[0];

    /* renamed from: s */
    public long f33617s;

    /* renamed from: t */
    public long f33618t;

    /* renamed from: u */
    public long f33619u;

    /* renamed from: com.daaw.yf$a */
    /* loaded from: classes.dex */
    public final class C3705a implements d81 {

        /* renamed from: p */
        public final d81 f33620p;

        /* renamed from: q */
        public boolean f33621q;

        public C3705a(d81 d81Var) {
            this.f33620p = d81Var;
        }

        @Override // com.daaw.d81
        /* renamed from: a */
        public void mo3789a() {
            this.f33620p.mo3789a();
        }

        /* renamed from: b */
        public void m3788b() {
            this.f33621q = false;
        }

        @Override // com.daaw.d81
        /* renamed from: d */
        public boolean mo3787d() {
            return !C3704yf.this.m3793h() && this.f33620p.mo3787d();
        }

        @Override // com.daaw.d81
        /* renamed from: j */
        public int mo3786j(k30 k30Var, C1454gq c1454gq, boolean z) {
            if (C3704yf.this.m3793h()) {
                return -3;
            }
            if (this.f33621q) {
                c1454gq.m11435l(4);
                return -4;
            }
            int mo3786j = this.f33620p.mo3786j(k30Var, c1454gq, z);
            if (mo3786j == -5) {
                Format format = k30Var.f15633a;
                int i = format.f35709J;
                if (i != 0 || format.f35710K != 0) {
                    C3704yf c3704yf = C3704yf.this;
                    if (c3704yf.f33618t != 0) {
                        i = 0;
                    }
                    k30Var.f15633a = format.m1730c(i, c3704yf.f33619u == Long.MIN_VALUE ? format.f35710K : 0);
                }
                return -5;
            }
            C3704yf c3704yf2 = C3704yf.this;
            long j = c3704yf2.f33619u;
            if (j == Long.MIN_VALUE || ((mo3786j != -4 || c1454gq.f11566s < j) && !(mo3786j == -3 && c3704yf2.mo2083f() == Long.MIN_VALUE))) {
                return mo3786j;
            }
            c1454gq.mo3749f();
            c1454gq.m11435l(4);
            this.f33621q = true;
            return -4;
        }

        @Override // com.daaw.d81
        /* renamed from: n */
        public int mo3785n(long j) {
            if (C3704yf.this.m3793h()) {
                return -3;
            }
            return this.f33620p.mo3785n(j);
        }
    }

    public C3704yf(qo0 qo0Var, boolean z, long j, long j2) {
        this.f33614p = qo0Var;
        this.f33617s = z ? j : -9223372036854775807L;
        this.f33618t = j;
        this.f33619u = j2;
    }

    /* renamed from: r */
    public static boolean m3790r(long j, InterfaceC3970c[] interfaceC3970cArr) {
        if (j != 0) {
            for (InterfaceC3970c interfaceC3970c : interfaceC3970cArr) {
                if (interfaceC3970c != null && !hq0.m20494k(interfaceC3970c.mo1524k().f35721u)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: b */
    public long mo2087b() {
        long mo2087b = this.f33614p.mo2087b();
        if (mo2087b != Long.MIN_VALUE) {
            long j = this.f33619u;
            if (j == Long.MIN_VALUE || mo2087b < j) {
                return mo2087b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: c */
    public boolean mo2086c(long j) {
        return this.f33614p.mo2086c(j);
    }

    /* renamed from: d */
    public final ea1 m3794d(long j, ea1 ea1Var) {
        long m10003m = sq1.m10003m(ea1Var.f8287a, 0L, j - this.f33618t);
        long j2 = ea1Var.f8288b;
        long j3 = this.f33619u;
        long m10003m2 = sq1.m10003m(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (m10003m == ea1Var.f8287a && m10003m2 == ea1Var.f8288b) ? ea1Var : new ea1(m10003m, m10003m2);
    }

    @Override // com.daaw.qo0
    /* renamed from: e */
    public long mo2084e(long j, ea1 ea1Var) {
        long j2 = this.f33618t;
        if (j == j2) {
            return j2;
        }
        return this.f33614p.mo2084e(j, m3794d(j, ea1Var));
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: f */
    public long mo2083f() {
        long mo2083f = this.f33614p.mo2083f();
        if (mo2083f != Long.MIN_VALUE) {
            long j = this.f33619u;
            if (j == Long.MIN_VALUE || mo2083f < j) {
                return mo2083f;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    /* renamed from: g */
    public void mo2082g(long j) {
        this.f33614p.mo2082g(j);
    }

    /* renamed from: h */
    public boolean m3793h() {
        return this.f33617s != -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    @Override // com.daaw.qo0
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo2080i(InterfaceC3970c[] interfaceC3970cArr, boolean[] zArr, d81[] d81VarArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        this.f33616r = new C3705a[d81VarArr.length];
        d81[] d81VarArr2 = new d81[d81VarArr.length];
        int i = 0;
        while (true) {
            d81 d81Var = null;
            if (i >= d81VarArr.length) {
                break;
            }
            C3705a[] c3705aArr = this.f33616r;
            c3705aArr[i] = (C3705a) d81VarArr[i];
            if (c3705aArr[i] != null) {
                d81Var = c3705aArr[i].f33620p;
            }
            d81VarArr2[i] = d81Var;
            i++;
        }
        long mo2080i = this.f33614p.mo2080i(interfaceC3970cArr, zArr, d81VarArr2, zArr2, j);
        if (m3793h()) {
            long j3 = this.f33618t;
            if (j == j3 && m3790r(j3, interfaceC3970cArr)) {
                j2 = mo2080i;
                this.f33617s = j2;
                if (mo2080i != j) {
                    if (mo2080i >= this.f33618t) {
                        long j4 = this.f33619u;
                        if (j4 != Long.MIN_VALUE) {
                        }
                    }
                    z = false;
                    C2914s6.m10685f(z);
                    for (int i2 = 0; i2 < d81VarArr.length; i2++) {
                        if (d81VarArr2[i2] == null) {
                            this.f33616r[i2] = null;
                        } else if (d81VarArr[i2] == null || this.f33616r[i2].f33620p != d81VarArr2[i2]) {
                            this.f33616r[i2] = new C3705a(d81VarArr2[i2]);
                        }
                        d81VarArr[i2] = this.f33616r[i2];
                    }
                    return mo2080i;
                }
                z = true;
                C2914s6.m10685f(z);
                while (i2 < d81VarArr.length) {
                }
                return mo2080i;
            }
        }
        j2 = -9223372036854775807L;
        this.f33617s = j2;
        if (mo2080i != j) {
        }
        z = true;
        C2914s6.m10685f(z);
        while (i2 < d81VarArr.length) {
        }
        return mo2080i;
    }

    @Override // com.daaw.qo0.InterfaceC2744a
    /* renamed from: j */
    public void mo3792j(qo0 qo0Var) {
        this.f33615q.mo3792j(this);
    }

    @Override // com.daaw.qo0
    /* renamed from: l */
    public void mo2079l() {
        this.f33614p.mo2079l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r0 > r7) goto L18;
     */
    @Override // com.daaw.qo0
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo2078m(long j) {
        C3705a[] c3705aArr;
        this.f33617s = -9223372036854775807L;
        boolean z = false;
        for (C3705a c3705a : this.f33616r) {
            if (c3705a != null) {
                c3705a.m3788b();
            }
        }
        long mo2078m = this.f33614p.mo2078m(j);
        if (mo2078m != j) {
            if (mo2078m >= this.f33618t) {
                long j2 = this.f33619u;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            C2914s6.m10685f(z);
            return mo2078m;
        }
        z = true;
        C2914s6.m10685f(z);
        return mo2078m;
    }

    @Override // com.daaw.gb1.InterfaceC1390a
    /* renamed from: o */
    public void mo2077n(qo0 qo0Var) {
        this.f33615q.mo2077n(this);
    }

    @Override // com.daaw.qo0
    /* renamed from: p */
    public void mo2075p(qo0.InterfaceC2744a interfaceC2744a, long j) {
        this.f33615q = interfaceC2744a;
        this.f33614p.mo2075p(this, j);
    }

    @Override // com.daaw.qo0
    /* renamed from: q */
    public long mo2074q() {
        if (m3793h()) {
            long j = this.f33617s;
            this.f33617s = -9223372036854775807L;
            long mo2074q = mo2074q();
            return mo2074q != -9223372036854775807L ? mo2074q : j;
        }
        long mo2074q2 = this.f33614p.mo2074q();
        if (mo2074q2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        C2914s6.m10685f(mo2074q2 >= this.f33618t);
        long j2 = this.f33619u;
        if (j2 != Long.MIN_VALUE && mo2074q2 > j2) {
            z = false;
        }
        C2914s6.m10685f(z);
        return mo2074q2;
    }

    @Override // com.daaw.qo0
    /* renamed from: s */
    public TrackGroupArray mo2072s() {
        return this.f33614p.mo2072s();
    }

    @Override // com.daaw.qo0
    /* renamed from: t */
    public void mo2071t(long j, boolean z) {
        this.f33614p.mo2071t(j, z);
    }
}
