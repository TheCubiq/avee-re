package com.daaw;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
/* loaded from: classes.dex */
public final class zk4 extends FullScreenContentCallback {

    /* renamed from: a */
    public final AbstractAdViewAdapter f35183a;

    /* renamed from: b */
    public final MediationInterstitialListener f35184b;

    public zk4(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f35183a = abstractAdViewAdapter;
        this.f35184b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        this.f35184b.onAdClosed(this.f35183a);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        this.f35184b.onAdOpened(this.f35183a);
    }
}
