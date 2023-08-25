package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class p96 implements i76 {
    public final qz3 a;
    public final String b;
    public final ScheduledExecutorService c;
    public final g77 d;
    public final y23 e;

    public p96(String str, y23 y23Var, qz3 qz3Var, ScheduledExecutorService scheduledExecutorService, g77 g77Var, byte[] bArr) {
        this.b = str;
        this.e = y23Var;
        this.a = qz3Var;
        this.c = scheduledExecutorService;
        this.d = g77Var;
    }

    public final /* synthetic */ q96 a(Exception exc) {
        this.a.u(exc, "AppSetIdInfoGmscoreSignal");
        return new q96(null, -1);
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 43;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        if (((Boolean) zzba.zzc().b(g93.p2)).booleanValue()) {
            if (((Boolean) zzba.zzc().b(g93.u2)).booleanValue()) {
                f77 n = s67.n(ov6.a(dk1.e(null)), new w57() { // from class: com.daaw.n96
                    @Override // com.daaw.w57
                    public final f77 zza(Object obj) {
                        m5 m5Var = (m5) obj;
                        return m5Var == null ? s67.i(new q96(null, -1)) : s67.i(new q96(m5Var.a(), m5Var.b()));
                    }
                }, this.d);
                if (((Boolean) pa3.a.e()).booleanValue()) {
                    n = s67.o(n, ((Long) pa3.b.e()).longValue(), TimeUnit.MILLISECONDS, this.c);
                }
                return s67.f(n, Exception.class, new ey6() { // from class: com.daaw.o96
                    @Override // com.daaw.ey6
                    public final Object apply(Object obj) {
                        return p96.this.a((Exception) obj);
                    }
                }, this.d);
            }
        }
        return s67.i(new q96(null, -1));
    }
}
