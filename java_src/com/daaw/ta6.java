package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class ta6 implements i76 {

    /* renamed from: a */
    public final ScheduledExecutorService f27164a;

    /* renamed from: b */
    public final Context f27165b;

    /* renamed from: c */
    public final lr3 f27166c;

    public ta6(lr3 lr3Var, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.f27166c = lr3Var;
        this.f27164a = scheduledExecutorService;
        this.f27165b = context;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 49;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return s67.m10630m(s67.m10628o(s67.m10634i(new Bundle()), ((Long) zzba.zzc().m23658b(g93.f10385C3)).longValue(), TimeUnit.MILLISECONDS, this.f27164a), new ey6() { // from class: com.daaw.sa6
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                return new ua6((Bundle) obj);
            }
        }, z04.f34305a);
    }
}
