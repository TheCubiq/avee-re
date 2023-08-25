package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class j56 implements i76 {
    public final i76 a;
    public final long b;
    public final ScheduledExecutorService c;

    public j56(i76 i76Var, long j, ScheduledExecutorService scheduledExecutorService) {
        this.a = i76Var;
        this.b = j;
        this.c = scheduledExecutorService;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return this.a.zza();
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        f77 zzb = this.a.zzb();
        long j = this.b;
        if (j > 0) {
            zzb = s67.o(zzb, j, TimeUnit.MILLISECONDS, this.c);
        }
        return s67.g(zzb, Throwable.class, new w57() { // from class: com.daaw.i56
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                Throwable th = (Throwable) obj;
                return s67.i(null);
            }
        }, z04.f);
    }
}
