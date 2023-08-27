package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaaq;
import com.google.android.gms.internal.ads.zzadh;
@zzadh
/* loaded from: classes.dex */
public final class zzs extends zzaaq {
    private AdOverlayInfoParcel zzbza;
    private boolean zzbzb = false;
    private boolean zzbzc = false;
    private Activity zztk;

    public zzs(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzbza = adOverlayInfoParcel;
        this.zztk = activity;
    }

    private final synchronized void zznr() {
        if (!this.zzbzc) {
            if (this.zzbza.zzbyn != null) {
                this.zzbza.zzbyn.zzcb();
            }
            this.zzbzc = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onActivityResult(int i, int i2, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onBackPressed() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onCreate(Bundle bundle) {
        boolean z = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzbza;
        if (adOverlayInfoParcel == null || z) {
            this.zztk.finish();
            return;
        }
        if (bundle == null) {
            if (adOverlayInfoParcel.zzbym != null) {
                this.zzbza.zzbym.onAdClicked();
            }
            if (this.zztk.getIntent() != null && this.zztk.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && this.zzbza.zzbyn != null) {
                this.zzbza.zzbyn.zzcc();
            }
        }
        zzbv.zzeh();
        if (zza.zza(this.zztk, this.zzbza.zzbyl, this.zzbza.zzbyt)) {
            return;
        }
        this.zztk.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onDestroy() throws RemoteException {
        if (this.zztk.isFinishing()) {
            zznr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onPause() throws RemoteException {
        if (this.zzbza.zzbyn != null) {
            this.zzbza.zzbyn.onPause();
        }
        if (this.zztk.isFinishing()) {
            zznr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onRestart() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onResume() throws RemoteException {
        if (this.zzbzb) {
            this.zztk.finish();
            return;
        }
        this.zzbzb = true;
        if (this.zzbza.zzbyn != null) {
            this.zzbza.zzbyn.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzbzb);
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onStart() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void onStop() throws RemoteException {
        if (this.zztk.isFinishing()) {
            zznr();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void zzax() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final boolean zznj() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaap
    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
    }
}
