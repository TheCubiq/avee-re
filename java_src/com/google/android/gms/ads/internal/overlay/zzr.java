package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzakb;
@zzadh
/* loaded from: classes.dex */
public final class zzr extends zzd {
    public zzr(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzd, com.google.android.gms.internal.ads.zzaap
    public final void onCreate(Bundle bundle) {
        zzakb.v("AdOverlayParcel is null or does not contain valid overlay type.");
        this.zzbxx = 3;
        this.mActivity.finish();
    }
}
