package com.daaw;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzaz;
import com.google.android.gms.ads.internal.client.zzea;
/* loaded from: classes.dex */
public final class cd5 extends zzaz {

    /* renamed from: c */
    public final /* synthetic */ zzea f5746c;

    public cd5(zzea zzeaVar) {
        this.f5746c = zzeaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        VideoController videoController;
        zzea zzeaVar = this.f5746c;
        videoController = zzeaVar.f36149d;
        videoController.zzb(zzeaVar.zzi());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        VideoController videoController;
        zzea zzeaVar = this.f5746c;
        videoController = zzeaVar.f36149d;
        videoController.zzb(zzeaVar.zzi());
        super.onAdLoaded();
    }
}
