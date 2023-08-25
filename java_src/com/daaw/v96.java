package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class v96 implements i76 {
    public final Context a;
    public final qz3 b;
    public final ScheduledExecutorService c;
    public final Executor d;
    public final String e;
    public final hz3 f;

    public v96(hz3 hz3Var, int i, Context context, qz3 qz3Var, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.f = hz3Var;
        this.a = context;
        this.b = qz3Var;
        this.c = scheduledExecutorService;
        this.d = executor;
        this.e = str;
    }

    public final /* synthetic */ w96 a(Exception exc) {
        this.b.u(exc, "AttestationTokenSignal");
        return null;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 44;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return s67.f((j67) s67.o(s67.m(j67.D(s67.l(new v57() { // from class: com.daaw.s96
            @Override // com.daaw.v57
            public final f77 zza() {
                return s67.i(null);
            }
        }, this.d)), new ey6() { // from class: com.daaw.t96
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                return new w96(str);
            }
        }, this.d), ((Long) zzba.zzc().b(g93.P0)).longValue(), TimeUnit.MILLISECONDS, this.c), Exception.class, new ey6() { // from class: com.daaw.u96
            @Override // com.daaw.ey6
            public final Object apply(Object obj) {
                v96.this.a((Exception) obj);
                return null;
            }
        }, m77.b());
    }
}
