package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class y16 implements i76 {
    public final qz3 a;
    public l5 b;
    public final ScheduledExecutorService c;
    public final g77 d;
    public final Context e;

    public y16(Context context, qz3 qz3Var, ScheduledExecutorService scheduledExecutorService, g77 g77Var) {
        if (!((Boolean) zzba.zzc().b(g93.t2)).booleanValue()) {
            this.b = k5.a(context);
        }
        this.e = context;
        this.a = qz3Var;
        this.c = scheduledExecutorService;
        this.d = g77Var;
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 11;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        if (((Boolean) zzba.zzc().b(g93.p2)).booleanValue()) {
            if (!((Boolean) zzba.zzc().b(g93.u2)).booleanValue()) {
                if (((Boolean) zzba.zzc().b(g93.q2)).booleanValue()) {
                    rj1<m5> a = ((Boolean) zzba.zzc().b(g93.t2)).booleanValue() ? wj6.a(this.e) : this.b.a();
                    if (a == null) {
                        return s67.i(new z16(null, -1));
                    }
                    f77 n = s67.n(ov6.a(a), new w57() { // from class: com.daaw.w16
                        @Override // com.daaw.w57
                        public final f77 zza(Object obj) {
                            m5 m5Var = (m5) obj;
                            return m5Var == null ? s67.i(new z16(null, -1)) : s67.i(new z16(m5Var.a(), m5Var.b()));
                        }
                    }, z04.f);
                    if (((Boolean) zzba.zzc().b(g93.r2)).booleanValue()) {
                        n = s67.o(n, ((Long) zzba.zzc().b(g93.s2)).longValue(), TimeUnit.MILLISECONDS, this.c);
                    }
                    return s67.f(n, Exception.class, new ey6() { // from class: com.daaw.x16
                        @Override // com.daaw.ey6
                        public final Object apply(Object obj) {
                            y16.this.a.u((Exception) obj, "AppSetIdInfoSignal");
                            return new z16(null, -1);
                        }
                    }, this.d);
                }
                return s67.m(ov6.a(this.b.a()), new ey6() { // from class: com.daaw.v16
                    @Override // com.daaw.ey6
                    public final Object apply(Object obj) {
                        m5 m5Var = (m5) obj;
                        return new z16(m5Var.a(), m5Var.b());
                    }
                }, z04.f);
            }
        }
        return s67.i(new z16(null, -1));
    }
}
