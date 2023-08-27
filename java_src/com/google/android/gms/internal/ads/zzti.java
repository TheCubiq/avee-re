package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.List;
/* loaded from: classes2.dex */
final class zzti extends zzahf {
    private final /* synthetic */ zzst zzbnw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzti(zzst zzstVar) {
        this.zzbnw = zzstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahe
    public final void onRewardedVideoAdClosed() throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zztm(this));
    }

    @Override // com.google.android.gms.internal.ads.zzahe
    public final void onRewardedVideoAdFailedToLoad(int i) throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zztp(this, i));
    }

    @Override // com.google.android.gms.internal.ads.zzahe
    public final void onRewardedVideoAdLeftApplication() throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zzto(this));
    }

    @Override // com.google.android.gms.internal.ads.zzahe
    public final void onRewardedVideoAdLoaded() throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zztj(this));
    }

    @Override // com.google.android.gms.internal.ads.zzahe
    public final void onRewardedVideoAdOpened() throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zztk(this));
    }

    @Override // com.google.android.gms.internal.ads.zzahe
    public final void onRewardedVideoCompleted() throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zztq(this));
    }

    @Override // com.google.android.gms.internal.ads.zzahe
    public final void onRewardedVideoStarted() throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zztl(this));
    }

    @Override // com.google.android.gms.internal.ads.zzahe
    public final void zza(zzagu zzaguVar) throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zztn(this, zzaguVar));
    }
}
