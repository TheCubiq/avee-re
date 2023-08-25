package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class kb6 implements i76 {
    public final qz3 a;
    public final boolean b;
    public final boolean c;
    public final ScheduledExecutorService d;
    public final g77 e;
    public final String f;
    public final fz3 g;

    public kb6(qz3 qz3Var, boolean z, boolean z2, fz3 fz3Var, g77 g77Var, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.a = qz3Var;
        this.b = z;
        this.c = z2;
        this.g = fz3Var;
        this.e = g77Var;
        this.f = str;
        this.d = scheduledExecutorService;
    }

    public final /* synthetic */ lb6 a(Exception exc) {
        this.a.u(exc, "TrustlessTokenSignal");
        return null;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 50;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        if ((!((Boolean) zzba.zzc().b(g93.D6)).booleanValue() || !this.c) && this.b) {
            return s67.f(s67.o(s67.m(s67.i(null), new ey6() { // from class: com.daaw.ib6
                @Override // com.daaw.ey6
                public final Object apply(Object obj) {
                    String str = (String) obj;
                    if (str == null) {
                        return null;
                    }
                    return new lb6(str);
                }
            }, this.e), ((Long) sb3.c.e()).longValue(), TimeUnit.MILLISECONDS, this.d), Exception.class, new ey6() { // from class: com.daaw.jb6
                @Override // com.daaw.ey6
                public final Object apply(Object obj) {
                    kb6.this.a((Exception) obj);
                    return null;
                }
            }, this.e);
        }
        return s67.i(null);
    }
}
