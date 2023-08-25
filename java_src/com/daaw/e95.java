package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdt;
/* loaded from: classes.dex */
public final class e95 extends VideoController.VideoLifecycleCallbacks {

    /* renamed from: a */
    public final j35 f8274a;

    public e95(j35 j35Var) {
        this.f8274a = j35Var;
    }

    /* renamed from: a */
    public static zzdt m23647a(j35 j35Var) {
        zzdq m19138R = j35Var.m19138R();
        if (m19138R == null) {
            return null;
        }
        try {
            return m19138R.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzdt m23647a = m23647a(this.f8274a);
        if (m23647a == null) {
            return;
        }
        try {
            m23647a.zze();
        } catch (RemoteException e) {
            k04.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzdt m23647a = m23647a(this.f8274a);
        if (m23647a == null) {
            return;
        }
        try {
            m23647a.zzg();
        } catch (RemoteException e) {
            k04.zzk("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzdt m23647a = m23647a(this.f8274a);
        if (m23647a == null) {
            return;
        }
        try {
            m23647a.zzi();
        } catch (RemoteException e) {
            k04.zzk("Unable to call onVideoEnd()", e);
        }
    }
}
