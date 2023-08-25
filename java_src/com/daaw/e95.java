package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;
/* loaded from: classes.dex */
public final class e95 extends VideoController.VideoLifecycleCallbacks {
    public final j35 a;

    public e95(j35 j35Var) {
        this.a = j35Var;
    }

    public static zzdt a(j35 j35Var) {
        zzdq R = j35Var.R();
        if (R == null) {
            return null;
        }
        try {
            return R.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzdt a = a(this.a);
        if (a == null) {
            return;
        }
        try {
            a.zze();
        } catch (RemoteException e) {
            k04.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzdt a = a(this.a);
        if (a == null) {
            return;
        }
        try {
            a.zzg();
        } catch (RemoteException e) {
            k04.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzdt a = a(this.a);
        if (a == null) {
            return;
        }
        try {
            a.zzi();
        } catch (RemoteException e) {
            k04.zzk("Unable to call onVideoEnd()", e);
        }
    }
}
