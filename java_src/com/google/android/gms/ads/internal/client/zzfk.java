package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController;
/* loaded from: classes.dex */
public final class zzfk extends zzds {

    /* renamed from: p */
    public final VideoController.VideoLifecycleCallbacks f36188p;

    public zzfk(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.f36188p = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze() {
        this.f36188p.onVideoEnd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzf(boolean z) {
        this.f36188p.onVideoMute(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzg() {
        this.f36188p.onVideoPause();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzh() {
        this.f36188p.onVideoPlay();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzi() {
        this.f36188p.onVideoStart();
    }
}
