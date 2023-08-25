package com.daaw;

import java.util.Stack;
/* loaded from: classes.dex */
public final class zs2 {
    public final byte[] a = new byte[8];
    public final Stack b = new Stack();
    public final kt2 c = new kt2();
    public int d;
    public int e;
    public long f;
    public ct2 g;

    public final void a() {
        this.d = 0;
        this.b.clear();
        this.c.d();
    }

    public final void b(ct2 ct2Var) {
        this.g = ct2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
        if (r0 == 1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(com.daaw.ms2 r13) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.zs2.c(com.daaw.ms2):boolean");
    }

    public final long d(ms2 ms2Var, int i) {
        ms2Var.h(this.a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.a[i2] & 255);
        }
        return j;
    }
}
