package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class fb6 {
    /* renamed from: a */
    public static i76 m22810a(ga6 ga6Var, b56 b56Var, ScheduledExecutorService scheduledExecutorService, int i) {
        return i == 0 ? new j56(b56Var, 0L, scheduledExecutorService) : new j56(ga6Var, 0L, scheduledExecutorService);
    }

    /* renamed from: b */
    public static i76 m22809b(ta6 ta6Var, ScheduledExecutorService scheduledExecutorService) {
        return new j56(ta6Var, ((Long) zzba.zzc().m23658b(g93.f10385C3)).longValue(), scheduledExecutorService);
    }

    /* renamed from: c */
    public static i76 m22808c(ob6 ob6Var, ScheduledExecutorService scheduledExecutorService) {
        return new j56(ob6Var, 0L, scheduledExecutorService);
    }
}
