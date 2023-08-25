package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzby;
/* loaded from: classes.dex */
public final class ph6 extends yr6 {

    /* renamed from: a */
    public final /* synthetic */ zzby f22946a;

    /* renamed from: b */
    public final /* synthetic */ qh6 f22947b;

    public ph6(qh6 qh6Var, zzby zzbyVar) {
        this.f22947b = qh6Var;
        this.f22946a = zzbyVar;
    }

    @Override // com.daaw.yr6
    /* renamed from: k */
    public final void mo3375k() {
        j95 j95Var;
        j95Var = this.f22947b.f23963s;
        if (j95Var != null) {
            try {
                this.f22946a.zze();
            } catch (RemoteException e) {
                k04.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
