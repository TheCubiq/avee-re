package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class hm5 implements wz7 {

    /* renamed from: a */
    public final m08 f12675a;

    /* renamed from: b */
    public final m08 f12676b;

    public hm5(m08 m08Var, m08 m08Var2) {
        this.f12675a = m08Var;
        this.f12676b = m08Var2;
    }

    @Override // com.daaw.m08
    /* renamed from: a */
    public final gm5 zzb() {
        return new gm5(((h94) this.f12675a).m20923a(), (ScheduledExecutorService) this.f12676b.zzb());
    }
}
