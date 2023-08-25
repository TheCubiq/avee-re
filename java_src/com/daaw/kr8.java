package com.daaw;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class kr8 extends cu8 {
    public final boolean l;
    public final i54 m;
    public final d34 n;
    public ir8 o;
    public br8 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public kr8(rr8 rr8Var, boolean z) {
        super(rr8Var);
        boolean z2;
        if (z) {
            rr8Var.b();
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new i54();
        this.n = new d34();
        rr8Var.p();
        this.o = ir8.q(rr8Var.h());
    }

    @Override // com.daaw.cu8
    public final pr8 F(pr8 pr8Var) {
        Object obj;
        Object obj2;
        Object obj3 = pr8Var.a;
        obj = this.o.e;
        if (obj != null) {
            obj2 = this.o.e;
            if (obj2.equals(obj3)) {
                obj3 = ir8.f;
            }
        }
        return pr8Var.c(obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    @Override // com.daaw.cu8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(com.daaw.l64 r15) {
        /*
            r14 = this;
            boolean r0 = r14.r
            r1 = 0
            if (r0 == 0) goto L1a
            com.daaw.ir8 r0 = r14.o
            com.daaw.ir8 r15 = r0.p(r15)
            r14.o = r15
            com.daaw.br8 r15 = r14.p
            if (r15 == 0) goto L9b
            long r2 = r15.f()
            r14.L(r2)
            goto L9b
        L1a:
            boolean r0 = r15.o()
            if (r0 == 0) goto L36
            boolean r0 = r14.s
            if (r0 == 0) goto L2b
            com.daaw.ir8 r0 = r14.o
            com.daaw.ir8 r15 = r0.p(r15)
            goto L33
        L2b:
            java.lang.Object r0 = com.daaw.i54.o
            java.lang.Object r2 = com.daaw.ir8.f
            com.daaw.ir8 r15 = com.daaw.ir8.r(r15, r0, r2)
        L33:
            r14.o = r15
            goto L9b
        L36:
            com.daaw.i54 r0 = r14.m
            r2 = 0
            r3 = 0
            r15.e(r2, r0, r3)
            com.daaw.i54 r0 = r14.m
            java.lang.Object r0 = r0.a
            com.daaw.br8 r5 = r14.p
            if (r5 == 0) goto L62
            long r6 = r5.i()
            com.daaw.ir8 r8 = r14.o
            com.daaw.pr8 r5 = r5.p
            java.lang.Object r5 = r5.a
            com.daaw.d34 r9 = r14.n
            r8.n(r5, r9)
            com.daaw.ir8 r5 = r14.o
            com.daaw.i54 r8 = r14.m
            r5.e(r2, r8, r3)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 == 0) goto L62
            r12 = r6
            goto L63
        L62:
            r12 = r3
        L63:
            com.daaw.i54 r9 = r14.m
            com.daaw.d34 r10 = r14.n
            r11 = 0
            r8 = r15
            android.util.Pair r2 = r8.l(r9, r10, r11, r12)
            java.lang.Object r3 = r2.first
            java.lang.Object r2 = r2.second
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            boolean r2 = r14.s
            if (r2 == 0) goto L82
            com.daaw.ir8 r0 = r14.o
            com.daaw.ir8 r15 = r0.p(r15)
            goto L86
        L82:
            com.daaw.ir8 r15 = com.daaw.ir8.r(r15, r0, r3)
        L86:
            r14.o = r15
            com.daaw.br8 r15 = r14.p
            if (r15 == 0) goto L9b
            r14.L(r4)
            com.daaw.pr8 r15 = r15.p
            java.lang.Object r0 = r15.a
            java.lang.Object r0 = r14.K(r0)
            com.daaw.pr8 r1 = r15.c(r0)
        L9b:
            r15 = 1
            r14.s = r15
            r14.r = r15
            com.daaw.ir8 r15 = r14.o
            r14.x(r15)
            if (r1 == 0) goto Laf
            com.daaw.br8 r15 = r14.p
            java.util.Objects.requireNonNull(r15)
            r15.l(r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.kr8.G(com.daaw.l64):void");
    }

    @Override // com.daaw.cu8
    public final void H() {
        if (this.l) {
            return;
        }
        this.q = true;
        A(null, this.k);
    }

    public final l64 I() {
        return this.o;
    }

    @Override // com.daaw.rr8
    /* renamed from: J */
    public final br8 k(pr8 pr8Var, nw8 nw8Var, long j) {
        br8 br8Var = new br8(pr8Var, nw8Var, j, null);
        br8Var.o(this.k);
        if (this.r) {
            br8Var.l(pr8Var.c(K(pr8Var.a)));
        } else {
            this.p = br8Var;
            if (!this.q) {
                this.q = true;
                A(null, this.k);
            }
        }
        return br8Var;
    }

    public final Object K(Object obj) {
        Object obj2;
        Object obj3;
        obj2 = this.o.e;
        if (obj2 == null || !obj.equals(ir8.f)) {
            return obj;
        }
        obj3 = this.o.e;
        return obj3;
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    public final void L(long j) {
        br8 br8Var = this.p;
        int a = this.o.a(br8Var.p.a);
        if (a == -1) {
            return;
        }
        ir8 ir8Var = this.o;
        d34 d34Var = this.n;
        ir8Var.d(a, d34Var, false);
        long j2 = d34Var.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        br8Var.m(j);
    }

    @Override // com.daaw.sq8, com.daaw.rr8
    public final void e() {
    }

    @Override // com.daaw.cu8, com.daaw.rr8
    public final void l(nr8 nr8Var) {
        ((br8) nr8Var).n();
        if (nr8Var == this.p) {
            this.p = null;
        }
    }

    @Override // com.daaw.sq8, com.daaw.lq8
    public final void y() {
        this.r = false;
        this.q = false;
        super.y();
    }
}
