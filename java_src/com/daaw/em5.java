package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class em5 implements wz7 {

    /* renamed from: a */
    public final m08 f8575a;

    /* renamed from: b */
    public final m08 f8576b;

    public em5(m08 m08Var, m08 m08Var2) {
        this.f8575a = m08Var;
        this.f8576b = m08Var2;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final dm5 zzb() {
        return new dm5(((h94) this.f8575a).m20923a(), (ScheduledExecutorService) this.f8576b.zzb());
    }
}
