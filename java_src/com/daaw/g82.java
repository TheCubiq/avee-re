package com.daaw;

import java.util.ArrayDeque;
/* loaded from: classes.dex */
public final class g82 implements i82 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final p82 c = new p82();
    public h82 d;
    public int e;
    public int f;
    public long g;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        if (r0 == 1) goto L29;
     */
    @Override // com.daaw.i82
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.daaw.k09 r14) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.g82.a(com.daaw.k09):boolean");
    }

    @Override // com.daaw.i82
    public final void b(h82 h82Var) {
        this.d = h82Var;
    }

    public final long c(k09 k09Var, int i) {
        ((rz8) k09Var).e(this.a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.a[i2] & 255);
        }
        return j;
    }

    @Override // com.daaw.i82
    public final void zzb() {
        this.e = 0;
        this.b.clear();
        this.c.e();
    }
}
