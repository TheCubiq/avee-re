package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.List;
/* loaded from: classes2.dex */
final class zzsu extends zzki {
    private final /* synthetic */ zzst zzbnw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsu(zzst zzstVar) {
        this.zzbnw = zzstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdClicked() throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zztb(this));
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdClosed() throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zzsv(this));
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdFailedToLoad(int i) throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zzsw(this, i));
        zzakb.v("Pooled interstitial failed to load.");
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdImpression() throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zzta(this));
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdLeftApplication() throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zzsx(this));
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdLoaded() throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zzsy(this));
        zzakb.v("Pooled interstitial loaded.");
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void onAdOpened() throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zzsz(this));
    }
}
