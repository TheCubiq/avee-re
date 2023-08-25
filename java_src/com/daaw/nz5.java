package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class nz5 {
    public final u35 a;
    public final az5 b;
    public final oq4 c;

    public nz5(u35 u35Var, on6 on6Var) {
        this.a = u35Var;
        final az5 az5Var = new az5(on6Var);
        this.b = az5Var;
        final sj3 g = u35Var.g();
        this.c = new oq4() { // from class: com.daaw.mz5
            @Override // com.daaw.oq4
            public final void b(zze zzeVar) {
                az5 az5Var2 = az5.this;
                sj3 sj3Var = g;
                az5Var2.b(zzeVar);
                if (sj3Var != null) {
                    try {
                        sj3Var.zzf(zzeVar);
                    } catch (RemoteException e) {
                        k04.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (sj3Var != null) {
                    try {
                        sj3Var.zze(zzeVar.zza);
                    } catch (RemoteException e2) {
                        k04.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final oq4 a() {
        return this.c;
    }

    public final fs4 b() {
        return this.b;
    }

    public final l15 c() {
        return new l15(this.a, this.b.k());
    }

    public final az5 d() {
        return this.b;
    }

    public final void e(zzbh zzbhVar) {
        this.b.s(zzbhVar);
    }
}
