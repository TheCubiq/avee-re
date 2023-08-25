package com.daaw;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class ko1 implements th1 {

    /* renamed from: p */
    public final go1 f16573p;

    /* renamed from: q */
    public final long[] f16574q;

    /* renamed from: r */
    public final Map<String, jo1> f16575r;

    /* renamed from: s */
    public final Map<String, ho1> f16576s;

    public ko1(go1 go1Var, Map<String, jo1> map, Map<String, ho1> map2) {
        this.f16573p = go1Var;
        this.f16576s = map2;
        this.f16575r = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f16574q = go1Var.m21377j();
    }

    @Override // com.daaw.th1
    /* renamed from: a */
    public int mo3753a(long j) {
        int m10014c = sq1.m10014c(this.f16574q, j, false, false);
        if (m10014c < this.f16574q.length) {
            return m10014c;
        }
        return -1;
    }

    @Override // com.daaw.th1
    /* renamed from: b */
    public long mo3752b(int i) {
        return this.f16574q[i];
    }

    @Override // com.daaw.th1
    /* renamed from: c */
    public List<C2099ln> mo3751c(long j) {
        return this.f16573p.m21379h(j, this.f16575r, this.f16576s);
    }

    @Override // com.daaw.th1
    /* renamed from: d */
    public int mo3750d() {
        return this.f16574q.length;
    }
}
