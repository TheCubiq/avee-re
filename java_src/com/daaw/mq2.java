package com.daaw;
/* loaded from: classes.dex */
public abstract class mq2 {
    public static final mq2 a = new jq2();

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract kq2 d(int i, kq2 kq2Var, boolean z);

    public abstract lq2 e(int i, lq2 lq2Var, boolean z, long j);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if ((c() - 1) == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(int r3, com.daaw.kq2 r4, com.daaw.lq2 r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.d(r3, r4, r0)
            r2.g(r0, r5, r0)
            r4 = 1
            if (r3 != 0) goto L31
            r3 = -1
            if (r6 == 0) goto L22
            if (r6 == r4) goto L20
            r1 = 2
            if (r6 != r1) goto L1a
            int r6 = r2.c()
            int r6 = r6 + r3
            if (r6 != 0) goto L2a
            goto L20
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L20:
            r4 = 0
            goto L2a
        L22:
            int r6 = r2.c()
            int r6 = r6 + r3
            if (r6 != 0) goto L2a
            r4 = -1
        L2a:
            if (r4 != r3) goto L2d
            return r3
        L2d:
            r2.g(r4, r5, r0)
            return r0
        L31:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.mq2.f(int, com.daaw.kq2, com.daaw.lq2, int):int");
    }

    public final lq2 g(int i, lq2 lq2Var, boolean z) {
        return e(i, lq2Var, false, 0L);
    }

    public final boolean h() {
        return c() == 0;
    }
}
