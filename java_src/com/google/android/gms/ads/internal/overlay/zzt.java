package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class zzt extends zzl {
    public zzt(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzl, com.daaw.hr3
    public final void zzk(Bundle bundle) {
        com.google.android.gms.ads.internal.util.zze.zza("AdOverlayParcel is null or does not contain valid overlay type.");
        this.I = 4;
        this.p.finish();
    }
}
