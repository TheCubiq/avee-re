package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
/* loaded from: classes2.dex */
public final class zzmt extends zzls {
    private final VideoController.VideoLifecycleCallbacks zzuy;

    public zzmt(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zzuy = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void onVideoEnd() {
        this.zzuy.onVideoEnd();
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void onVideoMute(boolean z) {
        this.zzuy.onVideoMute(z);
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void onVideoPause() {
        this.zzuy.onVideoPause();
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void onVideoPlay() {
        this.zzuy.onVideoPlay();
    }

    @Override // com.google.android.gms.internal.ads.zzlr
    public final void onVideoStart() {
        this.zzuy.onVideoStart();
    }
}
