package com.daaw;

import com.daaw.qo0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
/* loaded from: classes.dex */
public final class yf implements qo0, qo0.a {
    public final qo0 p;
    public qo0.a q;
    public a[] r = new a[0];
    public long s;
    public long t;
    public long u;

    /* loaded from: classes.dex */
    public final class a implements d81 {
        public final d81 p;
        public boolean q;

        public a(d81 d81Var) {
            this.p = d81Var;
        }

        @Override // com.daaw.d81
        public void a() {
            this.p.a();
        }

        public void b() {
            this.q = false;
        }

        @Override // com.daaw.d81
        public boolean d() {
            return !yf.this.h() && this.p.d();
        }

        @Override // com.daaw.d81
        public int j(k30 k30Var, gq gqVar, boolean z) {
            if (yf.this.h()) {
                return -3;
            }
            if (this.q) {
                gqVar.l(4);
                return -4;
            }
            int j = this.p.j(k30Var, gqVar, z);
            if (j == -5) {
                Format format = k30Var.a;
                int i = format.J;
                if (i != 0 || format.K != 0) {
                    yf yfVar = yf.this;
                    if (yfVar.t != 0) {
                        i = 0;
                    }
                    k30Var.a = format.c(i, yfVar.u == Long.MIN_VALUE ? format.K : 0);
                }
                return -5;
            }
            yf yfVar2 = yf.this;
            long j2 = yfVar2.u;
            if (j2 == Long.MIN_VALUE || ((j != -4 || gqVar.s < j2) && !(j == -3 && yfVar2.f() == Long.MIN_VALUE))) {
                return j;
            }
            gqVar.f();
            gqVar.l(4);
            this.q = true;
            return -4;
        }

        @Override // com.daaw.d81
        public int n(long j) {
            if (yf.this.h()) {
                return -3;
            }
            return this.p.n(j);
        }
    }

    public yf(qo0 qo0Var, boolean z, long j, long j2) {
        this.p = qo0Var;
        this.s = z ? j : -9223372036854775807L;
        this.t = j;
        this.u = j2;
    }

    public static boolean r(long j, com.google.android.exoplayer2.trackselection.c[] cVarArr) {
        if (j != 0) {
            for (com.google.android.exoplayer2.trackselection.c cVar : cVarArr) {
                if (cVar != null && !hq0.k(cVar.k().u)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public long b() {
        long b = this.p.b();
        if (b != Long.MIN_VALUE) {
            long j = this.u;
            if (j == Long.MIN_VALUE || b < j) {
                return b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public boolean c(long j) {
        return this.p.c(j);
    }

    public final ea1 d(long j, ea1 ea1Var) {
        long m = sq1.m(ea1Var.a, 0L, j - this.t);
        long j2 = ea1Var.b;
        long j3 = this.u;
        long m2 = sq1.m(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        return (m == ea1Var.a && m2 == ea1Var.b) ? ea1Var : new ea1(m, m2);
    }

    @Override // com.daaw.qo0
    public long e(long j, ea1 ea1Var) {
        long j2 = this.t;
        if (j == j2) {
            return j2;
        }
        return this.p.e(j, d(j, ea1Var));
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public long f() {
        long f = this.p.f();
        if (f != Long.MIN_VALUE) {
            long j = this.u;
            if (j == Long.MIN_VALUE || f < j) {
                return f;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.daaw.qo0, com.daaw.gb1
    public void g(long j) {
        this.p.g(j);
    }

    public boolean h() {
        return this.s != -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    @Override // com.daaw.qo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long i(com.google.android.exoplayer2.trackselection.c[] r13, boolean[] r14, com.daaw.d81[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            com.daaw.yf$a[] r2 = new com.daaw.yf.a[r2]
            r0.r = r2
            int r2 = r1.length
            com.daaw.d81[] r9 = new com.daaw.d81[r2]
            r10 = 0
            r2 = 0
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L25
            com.daaw.yf$a[] r3 = r0.r
            r4 = r1[r2]
            com.daaw.yf$a r4 = (com.daaw.yf.a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L20
            r3 = r3[r2]
            com.daaw.d81 r11 = r3.p
        L20:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L25:
            com.daaw.qo0 r2 = r0.p
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.i(r3, r4, r5, r6, r7)
            boolean r4 = r12.h()
            if (r4 == 0) goto L47
            long r4 = r0.t
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L47
            r6 = r13
            boolean r4 = r(r4, r13)
            if (r4 == 0) goto L47
            r4 = r2
            goto L4c
        L47:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4c:
            r0.s = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L67
            long r4 = r0.t
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L65
            long r4 = r0.u
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L67
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L65
            goto L67
        L65:
            r4 = 0
            goto L68
        L67:
            r4 = 1
        L68:
            com.daaw.s6.f(r4)
        L6b:
            int r4 = r1.length
            if (r10 >= r4) goto L99
            r4 = r9[r10]
            if (r4 != 0) goto L77
            com.daaw.yf$a[] r4 = r0.r
            r4[r10] = r11
            goto L90
        L77:
            r4 = r1[r10]
            if (r4 == 0) goto L85
            com.daaw.yf$a[] r4 = r0.r
            r4 = r4[r10]
            com.daaw.d81 r4 = r4.p
            r5 = r9[r10]
            if (r4 == r5) goto L90
        L85:
            com.daaw.yf$a[] r4 = r0.r
            com.daaw.yf$a r5 = new com.daaw.yf$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L90:
            com.daaw.yf$a[] r4 = r0.r
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L6b
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.yf.i(com.google.android.exoplayer2.trackselection.c[], boolean[], com.daaw.d81[], boolean[], long):long");
    }

    @Override // com.daaw.qo0.a
    public void j(qo0 qo0Var) {
        this.q.j(this);
    }

    @Override // com.daaw.qo0
    public void l() {
        this.p.l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r0 > r7) goto L18;
     */
    @Override // com.daaw.qo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long m(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.s = r0
            com.daaw.yf$a[] r0 = r6.r
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            com.daaw.qo0 r0 = r6.p
            long r0 = r0.m(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L34
            long r7 = r6.t
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L35
            long r7 = r6.u
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L34
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.daaw.s6.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.yf.m(long):long");
    }

    @Override // com.daaw.gb1.a
    /* renamed from: o */
    public void n(qo0 qo0Var) {
        this.q.n(this);
    }

    @Override // com.daaw.qo0
    public void p(qo0.a aVar, long j) {
        this.q = aVar;
        this.p.p(this, j);
    }

    @Override // com.daaw.qo0
    public long q() {
        if (h()) {
            long j = this.s;
            this.s = -9223372036854775807L;
            long q = q();
            return q != -9223372036854775807L ? q : j;
        }
        long q2 = this.p.q();
        if (q2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        s6.f(q2 >= this.t);
        long j2 = this.u;
        if (j2 != Long.MIN_VALUE && q2 > j2) {
            z = false;
        }
        s6.f(z);
        return q2;
    }

    @Override // com.daaw.qo0
    public TrackGroupArray s() {
        return this.p.s();
    }

    @Override // com.daaw.qo0
    public void t(long j, boolean z) {
        this.p.t(j, z);
    }
}
