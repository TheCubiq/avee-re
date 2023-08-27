package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzahu;
import com.google.android.gms.internal.ads.zzaig;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzan implements zzahu {
    private final /* synthetic */ zzal zzza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzan(zzal zzalVar) {
        this.zzza = zzalVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void onRewardedVideoAdClosed() {
        this.zzza.zzcb();
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void onRewardedVideoAdLeftApplication() {
        this.zzza.zzbo();
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void onRewardedVideoAdOpened() {
        this.zzza.zzcc();
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void onRewardedVideoCompleted() {
        this.zzza.zzdl();
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void onRewardedVideoStarted() {
        this.zzza.zzdk();
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void zzc(zzaig zzaigVar) {
        this.zzza.zzb(zzaigVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void zzdm() {
        this.zzza.onAdClicked();
    }
}
