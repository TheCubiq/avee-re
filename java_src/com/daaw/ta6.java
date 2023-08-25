package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class ta6 implements i76 {
    public final ScheduledExecutorService a;
    public final Context b;
    public final lr3 c;

    public ta6(lr3 lr3Var, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.c = lr3Var;
        this.a = scheduledExecutorService;
        this.b = context;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 49;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return s67.m(s67.o(s67.i(new Bundle()), ((Long) zzba.zzc().b(g93.C3)).longValue(), TimeUnit.MILLISECONDS, this.a), new ey6() { // from class: com.daaw.sa6
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return new ua6((Bundle) obj);
            }
        }, z04.a);
    }
}
