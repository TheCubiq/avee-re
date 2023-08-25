package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;
/* loaded from: classes.dex */
public final class zzct extends zzcr {
    public final MuteThisAdListener p;

    public zzct(MuteThisAdListener muteThisAdListener) {
        this.p = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zze() {
        this.p.onAdMuted();
    }
}
