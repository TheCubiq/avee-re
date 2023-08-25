package com.daaw;
/* loaded from: classes.dex */
public final class xg8 {
    public final String a;
    public int b;
    public long c;
    public pr8 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ zg8 g;

    public xg8(zg8 zg8Var, String str, int i, pr8 pr8Var) {
        this.g = zg8Var;
        this.a = str;
        this.b = i;
        this.c = pr8Var == null ? -1L : pr8Var.d;
        if (pr8Var == null || !pr8Var.b()) {
            return;
        }
        this.d = pr8Var;
    }

    public final void g(int i, pr8 pr8Var) {
        if (this.c == -1 && i == this.b && pr8Var != null) {
            this.c = pr8Var.d;
        }
    }

    public final boolean j(int i, pr8 pr8Var) {
        if (pr8Var == null) {
            return i == this.b;
        }
        pr8 pr8Var2 = this.d;
        return pr8Var2 == null ? !pr8Var.b() && pr8Var.d == this.c : pr8Var.d == pr8Var2.d && pr8Var.b == pr8Var2.b && pr8Var.c == pr8Var2.c;
    }

    public final boolean k(ib8 ib8Var) {
        pr8 pr8Var = ib8Var.d;
        if (pr8Var == null) {
            return this.b != ib8Var.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (pr8Var.d > j) {
            return true;
        }
        if (this.d == null) {
            return false;
        }
        int a = ib8Var.b.a(pr8Var.a);
        int a2 = ib8Var.b.a(this.d.a);
        pr8 pr8Var2 = ib8Var.d;
        if (pr8Var2.d < this.d.d || a < a2) {
            return false;
        }
        if (a > a2) {
            return true;
        }
        boolean b = pr8Var2.b();
        pr8 pr8Var3 = ib8Var.d;
        if (!b) {
            int i = pr8Var3.e;
            return i == -1 || i > this.d.b;
        }
        int i2 = pr8Var3.b;
        int i3 = pr8Var3.c;
        pr8 pr8Var4 = this.d;
        int i4 = pr8Var4.b;
        if (i2 <= i4) {
            return i2 == i4 && i3 > pr8Var4.c;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r8.c()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(com.daaw.l64 r7, com.daaw.l64 r8) {
        /*
            r6 = this;
            int r0 = r6.b
            int r1 = r7.c()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.c()
            if (r0 >= r7) goto L11
            goto L4a
        L11:
            r0 = -1
            goto L4a
        L13:
            com.daaw.zg8 r1 = r6.g
            com.daaw.i54 r1 = com.daaw.zg8.h(r1)
            r4 = 0
            r7.e(r0, r1, r4)
            com.daaw.zg8 r0 = r6.g
            com.daaw.i54 r0 = com.daaw.zg8.h(r0)
            int r0 = r0.m
        L26:
            com.daaw.zg8 r1 = r6.g
            com.daaw.i54 r1 = com.daaw.zg8.h(r1)
            int r1 = r1.n
            if (r0 > r1) goto L11
            java.lang.Object r1 = r7.f(r0)
            int r1 = r8.a(r1)
            if (r1 == r3) goto L47
            com.daaw.zg8 r7 = r6.g
            com.daaw.d34 r7 = com.daaw.zg8.g(r7)
            com.daaw.d34 r7 = r8.d(r1, r7, r2)
            int r0 = r7.c
            goto L4a
        L47:
            int r0 = r0 + 1
            goto L26
        L4a:
            r6.b = r0
            if (r0 != r3) goto L4f
            return r2
        L4f:
            com.daaw.pr8 r7 = r6.d
            r0 = 1
            if (r7 != 0) goto L55
            return r0
        L55:
            java.lang.Object r7 = r7.a
            int r7 = r8.a(r7)
            if (r7 == r3) goto L5e
            return r0
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.xg8.l(com.daaw.l64, com.daaw.l64):boolean");
    }
}
