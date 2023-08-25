package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class em5 implements wz7 {
    public final m08 a;
    public final m08 b;

    public em5(m08 m08Var, m08 m08Var2) {
        this.a = m08Var;
        this.b = m08Var2;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final dm5 zzb() {
        return new dm5(((h94) this.a).a(), (ScheduledExecutorService) this.b.zzb());
    }
}
