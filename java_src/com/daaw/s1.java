package com.daaw;

import com.daaw.da1;
import com.daaw.eo1;
/* loaded from: classes.dex */
public final class s1 implements zz {
    public static final e00 e = new a();
    public static final int f = sq1.v("ID3");
    public final long a;
    public final t1 b;
    public final rv0 c;
    public boolean d;

    /* loaded from: classes.dex */
    public static class a implements e00 {
        @Override // com.daaw.e00
        public zz[] a() {
            return new zz[]{new s1()};
        }
    }

    public s1() {
        this(0L);
    }

    public s1(long j) {
        this.a = j;
        this.b = new t1(true);
        this.c = new rv0(200);
    }

    @Override // com.daaw.zz
    public void a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
        if ((r5 - r4) < 8192) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003f, code lost:
        r11.i();
        r5 = r5 + 1;
     */
    @Override // com.daaw.zz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(com.daaw.a00 r11) {
        /*
            r10 = this;
            com.daaw.rv0 r0 = new com.daaw.rv0
            r1 = 10
            r0.<init>(r1)
            com.daaw.qv0 r2 = new com.daaw.qv0
            byte[] r3 = r0.a
            r2.<init>(r3)
            r3 = 0
            r4 = 0
        L10:
            byte[] r5 = r0.a
            r11.k(r5, r3, r1)
            r0.J(r3)
            int r5 = r0.A()
            int r6 = com.daaw.s1.f
            if (r5 == r6) goto L74
            r11.i()
            r11.g(r4)
            r5 = r4
        L27:
            r1 = 0
            r6 = 0
        L29:
            byte[] r7 = r0.a
            r8 = 2
            r11.k(r7, r3, r8)
            r0.J(r3)
            int r7 = r0.D()
            r8 = 65526(0xfff6, float:9.1821E-41)
            r7 = r7 & r8
            r8 = 65520(0xfff0, float:9.1813E-41)
            if (r7 == r8) goto L4f
            r11.i()
            int r5 = r5 + 1
            int r1 = r5 - r4
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r6) goto L4b
            return r3
        L4b:
            r11.g(r5)
            goto L27
        L4f:
            r7 = 1
            int r1 = r1 + r7
            r8 = 4
            if (r1 < r8) goto L59
            r9 = 188(0xbc, float:2.63E-43)
            if (r6 <= r9) goto L59
            return r7
        L59:
            byte[] r7 = r0.a
            r11.k(r7, r3, r8)
            r7 = 14
            r2.m(r7)
            r7 = 13
            int r7 = r2.h(r7)
            r8 = 6
            if (r7 > r8) goto L6d
            return r3
        L6d:
            int r8 = r7 + (-6)
            r11.g(r8)
            int r6 = r6 + r7
            goto L29
        L74:
            r5 = 3
            r0.K(r5)
            int r5 = r0.w()
            int r6 = r5 + 10
            int r4 = r4 + r6
            r11.g(r5)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.s1.c(com.daaw.a00):boolean");
    }

    @Override // com.daaw.zz
    public int d(a00 a00Var, iy0 iy0Var) {
        int b = a00Var.b(this.c.a, 0, 200);
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
