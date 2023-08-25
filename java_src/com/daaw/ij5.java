package com.daaw;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzccb;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class ij5 {
    public final ScheduledExecutorService a;
    public final g77 b;
    public final zj5 c;
    public final qz7 d;

    public ij5(ScheduledExecutorService scheduledExecutorService, g77 g77Var, zj5 zj5Var, qz7 qz7Var) {
        this.a = scheduledExecutorService;
        this.b = g77Var;
        this.c = zj5Var;
        this.d = qz7Var;
    }

    public final /* synthetic */ f77 a(zzccb zzccbVar, int i, Throwable th) {
        return ((cn5) this.d.zzb()).i3(zzccbVar, i);
    }

    public final f77 b(final zzccb zzccbVar) {
        f77 f77Var;
        String str = zzccbVar.s;
        zzt.zzp();
        if (zzs.zzy(str)) {
            f77Var = s67.h(new pk5(1));
        } else {
            final zj5 zj5Var = this.c;
            synchronized (zj5Var.b) {
                if (zj5Var.c) {
                    f77Var = zj5Var.a;
                } else {
                    zj5Var.c = true;
                    zj5Var.e = zzccbVar;
                    zj5Var.f.checkAvailabilityAndConnect();
                    zj5Var.a.f(new Runnable() { // from class: com.daaw.yj5
                        @Override // java.lang.Runnable
                        public final void run() {
                            zj5.this.a();
                        }
                    }, z04.f);
                    f77Var = zj5Var.a;
                }
            }
        }
        final int callingUid = Binder.getCallingUid();
        return s67.g((j67) s67.o(j67.D(f77Var), ((Integer) zzba.zzc().b(g93.W4)).intValue(), TimeUnit.SECONDS, this.a), Throwable.class, new w57() { // from class: com.daaw.hj5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return ij5.this.a(zzccbVar, callingUid, (Throwable) obj);
            }
        }, this.b);
    }
}
