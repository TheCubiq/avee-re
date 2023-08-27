package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzmh extends zzkl {
    final /* synthetic */ zzmf zzati;

    private zzmh(zzmf zzmfVar) {
        this.zzati = zzmfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final String getMediationAdapterClassName() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final boolean isLoading() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zza(zzjj zzjjVar, int i) throws RemoteException {
        zzane.e("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzamu.zzsy.post(new zzmi(this));
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final String zzck() throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzd(zzjj zzjjVar) throws RemoteException {
        zza(zzjjVar, 1);
    }
}
