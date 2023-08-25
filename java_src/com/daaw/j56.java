package com.daaw;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class j56 implements i76 {

    /* renamed from: a */
    public final i76 f14370a;

    /* renamed from: b */
    public final long f14371b;

    /* renamed from: c */
    public final ScheduledExecutorService f14372c;

    public j56(i76 i76Var, long j, ScheduledExecutorService scheduledExecutorService) {
        this.f14370a = i76Var;
        this.f14371b = j;
        this.f14372c = scheduledExecutorService;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return this.f14370a.zza();
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        f77 zzb = this.f14370a.zzb();
        long j = this.f14371b;
        if (j > 0) {
            zzb = s67.m10628o(zzb, j, TimeUnit.MILLISECONDS, this.f14372c);
        }
        return s67.m10636g(zzb, Throwable.class, new w57() { // from class: com.daaw.i56
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                Throwable th = (Throwable) obj;
                return s67.m10634i(null);
            }
        }, z04.f34310f);
    }
}
