package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class nz5 {

    /* renamed from: a */
    public final u35 f20865a;

    /* renamed from: b */
    public final az5 f20866b;

    /* renamed from: c */
    public final oq4 f20867c;

    public nz5(u35 u35Var, on6 on6Var) {
        this.f20865a = u35Var;
        final az5 az5Var = new az5(on6Var);
        this.f20866b = az5Var;
        final sj3 m8596g = u35Var.m8596g();
        this.f20867c = new oq4() { // from class: com.daaw.mz5
            @Override // com.daaw.oq4
            /* renamed from: b */
            public final void mo2194b(zze zzeVar) {
                az5 az5Var2 = az5.this;
                sj3 sj3Var = m8596g;
                az5Var2.mo2194b(zzeVar);
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

    /* renamed from: a */
    public final oq4 m14708a() {
        return this.f20867c;
    }

    /* renamed from: b */
    public final fs4 m14707b() {
        return this.f20866b;
    }

    /* renamed from: c */
    public final l15 m14706c() {
        return new l15(this.f20865a, this.f20866b.m26576k());
    }

    /* renamed from: d */
    public final az5 m14705d() {
        return this.f20866b;
    }

    /* renamed from: e */
    public final void m14704e(zzbh zzbhVar) {
        this.f20866b.m26574s(zzbhVar);
    }
}
