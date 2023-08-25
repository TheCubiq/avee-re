package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
/* loaded from: classes.dex */
public final class xn3 implements InitializationCompleteCallback {
    public final /* synthetic */ dj3 a;

    public xn3(do3 do3Var, dj3 dj3Var) {
        this.a = dj3Var;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.a.a(str);
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.a.zzf();
        } catch (RemoteException e) {
            k04.zzh("", e);
        }
    }
}
