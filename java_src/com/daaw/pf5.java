package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
/* loaded from: classes.dex */
public final class pf5 implements ze5 {
    public final long a;
    public final ef5 b;
    public final kh6 c;

    public pf5(long j, Context context, ef5 ef5Var, b94 b94Var, String str) {
        this.a = j;
        this.b = ef5Var;
        mh6 z = b94Var.z();
        z.a(context);
        z.zza(str);
        this.c = z.zzc().zza();
    }

    @Override // com.daaw.ze5
    public final void a(zzl zzlVar) {
        try {
            this.c.zzf(zzlVar, new nf5(this));
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.daaw.ze5
    public final void zza() {
    }

    @Override // com.daaw.ze5
    public final void zzc() {
        try {
            this.c.zzk(new of5(this));
            this.c.zzm(nt0.g3(null));
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }
}
