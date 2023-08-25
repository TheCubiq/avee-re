package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class va6 implements wz7 {

    /* renamed from: a */
    public final m08 f30083a;

    /* renamed from: b */
    public final m08 f30084b;

    /* renamed from: c */
    public final m08 f30085c;

    public va6(m08 m08Var, m08 m08Var2, m08 m08Var3) {
        this.f30083a = m08Var;
        this.f30084b = m08Var2;
        this.f30085c = m08Var3;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ta6(new lr3(), (ScheduledExecutorService) this.f30084b.zzb(), ((h94) this.f30085c).m20923a(), null);
    }
}
