package com.daaw;

import com.daaw.da1;
import com.daaw.eo1;
/* loaded from: classes.dex */
public final class s implements zz {
    public static final e00 e = new a();
    public static final int f = sq1.v("ID3");
    public final long a;
    public final t b;
    public final rv0 c;
    public boolean d;

    /* loaded from: classes.dex */
    public static class a implements e00 {
        @Override // com.daaw.e00
        public zz[] a() {
            return new zz[]{new s()};
        }
    }

    public s() {
        this(0L);
    }

    public s(long j) {
        this.a = j;
        this.b = new t();
        this.c = new rv0(2786);
    }

    @Override // com.daaw.zz
    public void a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
        if ((r4 - r3) < 8192) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
        r8.i();
        r4 = r4 + 1;
     */
    @Override // com.daaw.zz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(com.daaw.a00 r8) {
        /*
            r7 = this;
            com.daaw.rv0 r0 = new com.daaw.rv0
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.a
            r8.k(r4, r2, r1)
            r0.J(r2)
            int r4 = r0.A()
            int r5 = com.daaw.s.f
            if (r4 == r5) goto L58
            r8.i()
            r8.g(r3)
            r4 = r3
        L20:
            r1 = 0
        L21:
            byte[] r5 = r0.a
            r6 = 5
            r8.k(r5, r2, r6)
            r0.J(r2)
            int r5 = r0.D()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L42
            r8.i()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L3e
            return r2
        L3e:
            r8.g(r4)
            goto L20
        L42:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L48
            return r5
        L48:
            byte[] r5 = r0.a
            int r5 = com.daaw.u.f(r5)
            r6 = -1
            if (r5 != r6) goto L52
            return r2
        L52:
            int r5 = r5 + (-5)
            r8.g(r5)
            goto L21
        L58:
            r4 = 3
            r0.K(r4)
            int r4 = r0.w()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.g(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.s.c(com.daaw.a00):boolean");
    }

    @Override // com.daaw.zz
    public int d(a00 a00Var, iy0 iy0Var) {
        int b = a00Var.b(this.c.a, 0, 2786);
        if (b == -1) {
            return -1;
        }
        this.c.J(0);
        this.c.I(b);
        if (!this.d) {
            this.b.e(this.a, true);
            this.d = true;
        }
        this.b.a(this.c);
        return 0;
    }

    @Override // com.daaw.zz
    public void f(long j, long j2) {
        this.d = false;
        this.b.b();
    }

    @Override // com.daaw.zz
    public void i(d00 d00Var) {
        this.b.d(d00Var, new eo1.d(0, 1));
        d00Var.n();
        d00Var.d(new da1.b(-9223372036854775807L));
    }
}
