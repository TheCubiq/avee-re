package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzby;
/* loaded from: classes.dex */
public final class ph6 extends yr6 {
    public final /* synthetic */ zzby a;
    public final /* synthetic */ qh6 b;

    public ph6(qh6 qh6Var, zzby zzbyVar) {
        this.b = qh6Var;
        this.a = zzbyVar;
    }

    @Override // com.daaw.yr6
    public final void k() {
        j95 j95Var;
        j95Var = this.b.s;
        if (j95Var != null) {
            try {
                this.a.zze();
            } catch (RemoteException e) {
                k04.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
