package com.daaw;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public final class bm6 implements wz7 {
    public final m08 a;

    public bm6(m08 m08Var) {
        this.a = m08Var;
    }

    @Override // com.daaw.m08
    public final /* bridge */ /* synthetic */ Object zzb() {
        fv6.a();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.a.zzb()));
        e08.b(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
