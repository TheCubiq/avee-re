package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class yi4 implements wz7 {

    /* renamed from: a */
    public final m08 f33690a;

    /* renamed from: b */
    public final m08 f33691b;

    public yi4(m08 m08Var, m08 m08Var2) {
        this.f33690a = m08Var;
        this.f33691b = m08Var2;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final jt4 zzb() {
        return new jt4((ScheduledExecutorService) this.f33690a.zzb(), (InterfaceC0623ag) this.f33691b.zzb());
    }
}
