package com.daaw;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class ko1 implements th1 {
    public final go1 p;
    public final long[] q;
    public final Map<String, jo1> r;
    public final Map<String, ho1> s;

    public ko1(go1 go1Var, Map<String, jo1> map, Map<String, ho1> map2) {
        this.p = go1Var;
        this.s = map2;
        this.r = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.q = go1Var.j();
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
        return this.q[i];
    }

    @Override // com.daaw.th1
    public List<ln> c(long j) {
        return this.p.h(j, this.r, this.s);
    }

    @Override // com.daaw.th1
    public int d() {
        return this.q.length;
    }
}
