package com.daaw;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class df1 implements th1 {
    public final ln[] p;
    public final long[] q;

    public df1(ln[] lnVarArr, long[] jArr) {
        this.p = lnVarArr;
        this.q = jArr;
    }

    @Override // com.daaw.th1
    public int a(long j) {
        int c = sq1.c(this.q, j, false, false);
        if (c < this.q.length) {
            return c;
        }
        return -1;
    }

    @Override // com.daaw.th1
    public long b(int i) {
        s6.a(i >= 0);
        s6.a(i < this.q.length);
        return this.q[i];
    }

    @Override // com.daaw.th1
    public List<ln> c(long j) {
        int e = sq1.e(this.q, j, true, false);
        if (e != -1) {
            ln[] lnVarArr = this.p;
            if (lnVarArr[e] != null) {
                return Collections.singletonList(lnVarArr[e]);
            }
        }
        return Collections.emptyList();
    }

    @Override // com.daaw.th1
    public int d() {
        return this.q.length;
    }
}
