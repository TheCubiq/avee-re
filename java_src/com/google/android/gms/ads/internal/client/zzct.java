package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;
/* loaded from: classes.dex */
public final class zzct extends zzcr {

    /* renamed from: p */
    public final MuteThisAdListener f36108p;

    public zzct(MuteThisAdListener muteThisAdListener) {
        this.f36108p = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zze() {
        this.f36108p.onAdMuted();
    }
}
