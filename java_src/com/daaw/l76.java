package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class l76 {
    public final Context a;
    public final Set b;
    public final Executor c;
    public final to6 d;
    public final kd5 e;

    public l76(Context context, Executor executor, Set set, to6 to6Var, kd5 kd5Var) {
        this.a = context;
        this.c = executor;
        this.b = set;
        this.d = to6Var;
        this.e = kd5Var;
    }

    public final f77 a(final Object obj) {
        io6 a = ho6.a(this.a, 8);
        a.zzh();
        final ArrayList arrayList = new ArrayList(this.b.size());
        for (final i76 i76Var : this.b) {
            f77 zzb = i76Var.zzb();
            final long b = zzt.zzB().b();
            zzb.f(new Runnable() { // from class: com.daaw.j76
                @Override // java.lang.Runnable
                public final void run() {
                    l76.this.b(b, i76Var);
                }
            }, z04.f);
            arrayList.add(zzb);
        }
        f77 a2 = s67.c(arrayList).a(new Callable() { // from class: com.daaw.k76
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<f77> list = arrayList;
                Object obj2 = obj;
                for (f77 f77Var : list) {
                    h76 h76Var = (h76) f77Var.get();
                    if (h76Var != null) {
                        h76Var.b(obj2);
                    }
                }
                return obj2;
            }
        }, this.c);
        if (vo6.a()) {
            so6.a(a2, this.d, a);
        }
        return a2;
    }

    public final void b(long j, i76 i76Var) {
        long b = zzt.zzB().b() - j;
        if (((Boolean) ib3.a.e()).booleanValue()) {
            String c = hz6.c(i76Var.getClass().getCanonicalName());
            zze.zza("Signal runtime (ms) : " + c + " = " + b);
        }
        if (((Boolean) zzba.zzc().b(g93.Q1)).booleanValue()) {
            jd5 a = this.e.a();
            a.b("action", "lat_ms");
            a.b("lat_grp", "sig_lat_grp");
            a.b("lat_id", String.valueOf(i76Var.zza()));
            a.b("clat_ms", String.valueOf(b));
            a.h();
        }
    }
}
