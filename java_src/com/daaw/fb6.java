package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class fb6 {
    public static i76 a(ga6 ga6Var, b56 b56Var, ScheduledExecutorService scheduledExecutorService, int i) {
        return i == 0 ? new j56(b56Var, 0L, scheduledExecutorService) : new j56(ga6Var, 0L, scheduledExecutorService);
    }

    public static i76 b(ta6 ta6Var, ScheduledExecutorService scheduledExecutorService) {
        return new j56(ta6Var, ((Long) zzba.zzc().b(g93.C3)).longValue(), scheduledExecutorService);
    }

    public static i76 c(ob6 ob6Var, ScheduledExecutorService scheduledExecutorService) {
        return new j56(ob6Var, 0L, scheduledExecutorService);
    }
}
