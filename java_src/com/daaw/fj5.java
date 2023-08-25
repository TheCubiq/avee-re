package com.daaw;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.internal.client.zzej;
/* loaded from: classes.dex */
public final class fj5 implements AdapterStatus {
    public fj5(zzej zzejVar) {
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return "Google Mobile Ads SDK initialization functionality unavailable for this session. Ad requests can be made at any time.";
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return AdapterStatus.State.READY;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return 0;
    }
}
