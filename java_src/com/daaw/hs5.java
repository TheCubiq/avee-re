package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.zzb;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class hs5 implements xq5 {
    public final Context a;
    public final zj4 b;
    public final Executor c;

    public hs5(Context context, zj4 zj4Var, Executor executor) {
        this.a = context;
        this.b = zj4Var;
        this.c = executor;
    }

    @Override // com.daaw.xq5
    public final void a(fi6 fi6Var, th6 th6Var, tq5 tq5Var) {
        zzq zzqVar;
        zzq zzqVar2 = fi6Var.a.a.e;
        if (zzqVar2.zzn) {
            zzqVar = new zzq(this.a, zzb.zzd(zzqVar2.zze, zzqVar2.zzb));
        } else {
            zzqVar = (((Boolean) zzba.zzc().b(g93.Z6)).booleanValue() && th6Var.i0) ? new zzq(this.a, zzb.zze(zzqVar2.zze, zzqVar2.zzb)) : vi6.a(this.a, th6Var.v);
        }
        zzq zzqVar3 = zzqVar;
        if (((Boolean) zzba.zzc().b(g93.Z6)).booleanValue() && th6Var.i0) {
            ((oj6) tq5Var.b).s(this.a, zzqVar3, fi6Var.a.a.d, th6Var.w.toString(), zzbu.zzl(th6Var.t), (gn3) tq5Var.c);
        } else {
            ((oj6) tq5Var.b).r(this.a, zzqVar3, fi6Var.a.a.d, th6Var.w.toString(), zzbu.zzl(th6Var.t), (gn3) tq5Var.c);
        }
    }

    @Override // com.daaw.xq5
    public final /* bridge */ /* synthetic */ Object b(fi6 fi6Var, final th6 th6Var, tq5 tq5Var) {
        final View f;
        if (((Boolean) zzba.zzc().b(g93.Z6)).booleanValue() && th6Var.i0) {
            mn3 h = ((oj6) tq5Var.b).h();
            if (h == null) {
                k04.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new wi6(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                f = (View) nt0.M(h.zze());
                boolean zzf = h.zzf();
                if (f == null) {
                    throw new wi6(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        f = (View) s67.n(s67.i(null), new w57() { // from class: com.daaw.gs5
                            @Override // com.daaw.w57
                            public final f77 zza(Object obj) {
                                return hs5.this.c(f, th6Var, obj);
                            }
                        }, z04.e).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new wi6(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new wi6(e2);
            }
        } else {
            f = ((oj6) tq5Var.b).f();
        }
        zj4 zj4Var = this.b;
        rm4 rm4Var = new rm4(fi6Var, th6Var, tq5Var.a);
        final oj6 oj6Var = (oj6) tq5Var.b;
        aj4 a = zj4Var.a(rm4Var, new gj4(f, null, new xl4() { // from class: com.daaw.cs5
            @Override // com.daaw.xl4
            public final zzdq zza() {
                return oj6.this.g();
            }
        }, (uh6) th6Var.v.get(0)));
        a.i().C0(f);
        a.c().n0(new eg4((oj6) tq5Var.b), this.c);
        ((ys5) tq5Var.c).h3(a.g());
        return a.h();
    }

    public final /* synthetic */ f77 c(View view, th6 th6Var, Object obj) {
        return s67.i(qk4.a(this.a, view, th6Var));
    }
}
