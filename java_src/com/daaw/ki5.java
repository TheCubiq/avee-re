package com.daaw;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzccb;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class ki5 {
    public final g77 a;
    public final g77 b;
    public final vj5 c;
    public final qz7 d;

    public ki5(g77 g77Var, g77 g77Var2, vj5 vj5Var, qz7 qz7Var) {
        this.a = g77Var;
        this.b = g77Var2;
        this.c = vj5Var;
        this.d = qz7Var;
    }

    public final /* synthetic */ f77 a(zzccb zzccbVar, int i, pk5 pk5Var) {
        return ((cn5) this.d.zzb()).h3(zzccbVar, i);
    }

    public final f77 b(final zzccb zzccbVar) {
        String str = zzccbVar.s;
        zzt.zzp();
        f77 h = zzs.zzy(str) ? s67.h(new pk5(1)) : s67.g(this.a.M(new Callable() { // from class: com.daaw.hi5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ki5.this.c(zzccbVar);
            }
        }), ExecutionException.class, new w57() { // from class: com.daaw.ii5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return s67.h(((ExecutionException) obj).getCause());
            }
        }, this.b);
        final int callingUid = Binder.getCallingUid();
        return s67.g(h, pk5.class, new w57() { // from class: com.daaw.ji5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return ki5.this.a(zzccbVar, callingUid, (pk5) obj);
            }
        }, this.b);
    }

    public final /* synthetic */ InputStream c(zzccb zzccbVar) {
        e14 e14Var;
        final vj5 vj5Var = this.c;
        synchronized (vj5Var.b) {
            if (vj5Var.c) {
                e14Var = vj5Var.a;
            } else {
                vj5Var.c = true;
                vj5Var.e = zzccbVar;
                vj5Var.f.checkAvailabilityAndConnect();
                vj5Var.a.f(new Runnable() { // from class: com.daaw.uj5
                    @Override // java.lang.Runnable
                    public final void run() {
                        vj5.this.a();
                    }
                }, z04.f);
                e14Var = vj5Var.a;
            }
        }
        return (InputStream) e14Var.get(((Integer) zzba.zzc().b(g93.W4)).intValue(), TimeUnit.SECONDS);
    }
}
