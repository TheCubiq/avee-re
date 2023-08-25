package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class cj4 extends zi4 {
    public final Context i;
    public final View j;
    public final a74 k;
    public final uh6 l;
    public final xl4 m;
    public final u35 n;
    public final xy4 o;
    public final qz7 p;
    public final Executor q;
    public zzq r;

    public cj4(yl4 yl4Var, Context context, uh6 uh6Var, View view, a74 a74Var, xl4 xl4Var, u35 u35Var, xy4 xy4Var, qz7 qz7Var, Executor executor) {
        super(yl4Var);
        this.i = context;
        this.j = view;
        this.k = a74Var;
        this.l = uh6Var;
        this.m = xl4Var;
        this.n = u35Var;
        this.o = xy4Var;
        this.p = qz7Var;
        this.q = executor;
    }

    public static /* synthetic */ void o(cj4 cj4Var) {
        u35 u35Var = cj4Var.n;
        if (u35Var.e() == null) {
            return;
        }
        try {
            u35Var.e().U0((zzbu) cj4Var.p.zzb(), nt0.g3(cj4Var.i));
        } catch (RemoteException e) {
            k04.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    @Override // com.daaw.zl4
    public final void b() {
        this.q.execute(new Runnable() { // from class: com.daaw.bj4
            @Override // java.lang.Runnable
            public final void run() {
                cj4.o(cj4.this);
            }
        });
        super.b();
    }

    @Override // com.daaw.zi4
    public final int h() {
        if (((Boolean) zzba.zzc().b(g93.Z6)).booleanValue() && this.b.i0) {
            if (!((Boolean) zzba.zzc().b(g93.a7)).booleanValue()) {
                return 0;
            }
        }
        return this.a.b.b.c;
    }

    @Override // com.daaw.zi4
    public final View i() {
        return this.j;
    }

    @Override // com.daaw.zi4
    public final zzdq j() {
        try {
            return this.m.zza();
        } catch (wi6 unused) {
            return null;
        }
    }

    @Override // com.daaw.zi4
    public final uh6 k() {
        zzq zzqVar = this.r;
        if (zzqVar != null) {
            return vi6.c(zzqVar);
        }
        th6 th6Var = this.b;
        if (th6Var.d0) {
            for (String str : th6Var.a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new uh6(this.j.getWidth(), this.j.getHeight(), false);
        }
        return vi6.b(this.b.s, this.l);
    }

    @Override // com.daaw.zi4
    public final uh6 l() {
        return this.l;
    }

    @Override // com.daaw.zi4
    public final void m() {
        this.o.zza();
    }

    @Override // com.daaw.zi4
    public final void n(ViewGroup viewGroup, zzq zzqVar) {
        a74 a74Var;
        if (viewGroup == null || (a74Var = this.k) == null) {
            return;
        }
        a74Var.Q(v84.c(zzqVar));
        viewGroup.setMinimumHeight(zzqVar.zzc);
        viewGroup.setMinimumWidth(zzqVar.zzf);
        this.r = zzqVar;
    }
}
