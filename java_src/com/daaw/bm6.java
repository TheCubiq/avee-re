package com.daaw;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final class bm6 implements wz7 {

    /* renamed from: a */
    public final m08 f4972a;

    public bm6(m08 m08Var) {
        this.f4972a = m08Var;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        fv6.m22241a();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.f4972a.zzb()));
        e08.m23801b(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
