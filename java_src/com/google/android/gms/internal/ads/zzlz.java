package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlz extends zzkd {
    private final /* synthetic */ zzly zzatc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlz(zzly zzlyVar) {
        this.zzatc = zzlyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkd, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(int i) {
        VideoController videoController;
        videoController = this.zzatc.zzasv;
        videoController.zza(this.zzatc.zzbc());
        super.onAdFailedToLoad(i);
    }

    @Override // com.google.android.gms.internal.ads.zzkd, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        VideoController videoController;
        videoController = this.zzatc.zzasv;
        videoController.zza(this.zzatc.zzbc());
        super.onAdLoaded();
    }
}
