package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class yi4 implements wz7 {
    public final m08 a;
    public final m08 b;

    public yi4(m08 m08Var, m08 m08Var2) {
        this.a = m08Var;
        this.b = m08Var2;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final jt4 zzb() {
        return new jt4((ScheduledExecutorService) this.a.zzb(), (ag) this.b.zzb());
    }
}
