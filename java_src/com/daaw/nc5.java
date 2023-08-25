package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class nc5 implements fn6 {

    /* renamed from: p */
    public final Map f20045p;

    /* renamed from: q */
    public final x33 f20046q;

    public nc5(x33 x33Var, Map map) {
        this.f20045p = map;
        this.f20046q = x33Var;
    }

    @Override // com.daaw.fn6
    /* renamed from: A */
    public final void mo5182A(ym6 ym6Var, String str) {
        if (this.f20045p.containsKey(ym6Var)) {
            this.f20046q.m5589c(((mc5) this.f20045p.get(ym6Var)).f18789a);
        }
    }

    @Override // com.daaw.fn6
    /* renamed from: M */
    public final void mo5179M(ym6 ym6Var, String str) {
        if (this.f20045p.containsKey(ym6Var)) {
            this.f20046q.m5589c(((mc5) this.f20045p.get(ym6Var)).f18790b);
        }
    }

    @Override // com.daaw.fn6
    /* renamed from: S */
    public final void mo5178S(ym6 ym6Var, String str, Throwable th) {
        if (this.f20045p.containsKey(ym6Var)) {
            this.f20046q.m5589c(((mc5) this.f20045p.get(ym6Var)).f18791c);
        }
    }

    @Override // com.daaw.fn6
    /* renamed from: k */
    public final void mo5172k(ym6 ym6Var, String str) {
    }
}
