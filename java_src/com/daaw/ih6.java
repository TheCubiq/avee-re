package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdd;
/* loaded from: classes.dex */
public final class ih6 extends yr6 {
    public final /* synthetic */ zzdd a;
    public final /* synthetic */ kh6 b;

    public ih6(kh6 kh6Var, zzdd zzddVar) {
        this.b = kh6Var;
        this.a = zzddVar;
    }

    @Override // com.daaw.yr6
    public final void k() {
        j95 j95Var;
        j95Var = this.b.v;
        if (j95Var != null) {
            try {
                this.a.zze();
            } catch (RemoteException e) {
                k04.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
