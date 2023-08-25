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

    /* renamed from: a */
    public final g77 f16403a;

    /* renamed from: b */
    public final g77 f16404b;

    /* renamed from: c */
    public final vj5 f16405c;

    /* renamed from: d */
    public final qz7 f16406d;

    public ki5(g77 g77Var, g77 g77Var2, vj5 vj5Var, qz7 qz7Var) {
        this.f16403a = g77Var;
        this.f16404b = g77Var2;
        this.f16405c = vj5Var;
        this.f16406d = qz7Var;
    }

    /* renamed from: a */
    public final /* synthetic */ f77 m17715a(zzccb zzccbVar, int i, pk5 pk5Var) {
        return ((cn5) this.f16406d.zzb()).m25214h3(zzccbVar, i);
    }

    /* renamed from: b */
    public final f77 m17714b(final zzccb zzccbVar) {
        String str = zzccbVar.f36967s;
        zzt.zzp();
        f77 m10635h = zzs.zzy(str) ? s67.m10635h(new pk5(1)) : s67.m10636g(this.f16403a.mo20112M(new Callable() { // from class: com.daaw.hi5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ki5.this.m17713c(zzccbVar);
            }
        }), ExecutionException.class, new w57() { // from class: com.daaw.ii5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return s67.m10635h(((ExecutionException) obj).getCause());
            }
        }, this.f16404b);
        final int callingUid = Binder.getCallingUid();
        return s67.m10636g(m10635h, pk5.class, new w57() { // from class: com.daaw.ji5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return ki5.this.m17715a(zzccbVar, callingUid, (pk5) obj);
            }
        }, this.f16404b);
    }

    /* renamed from: c */
    public final /* synthetic */ InputStream m17713c(zzccb zzccbVar) {
        e14 e14Var;
        final vj5 vj5Var = this.f16405c;
        synchronized (vj5Var.f32768b) {
            if (vj5Var.f32769c) {
                e14Var = vj5Var.f32767a;
            } else {
                vj5Var.f32769c = true;
                vj5Var.f32771e = zzccbVar;
                vj5Var.f32772f.checkAvailabilityAndConnect();
                vj5Var.f32767a.mo6515f(new Runnable() { // from class: com.daaw.uj5
                    @Override // java.lang.Runnable
                    public final void run() {
                        vj5.this.m5043a();
                    }
                }, z04.f34310f);
                e14Var = vj5Var.f32767a;
            }
        }
        return (InputStream) e14Var.get(((Integer) zzba.zzc().m23658b(g93.f10586W4)).intValue(), TimeUnit.SECONDS);
    }
}
