package com.google.android.gms.ads;
/* loaded from: classes.dex */
public abstract class FullScreenContentCallback {
    public static final int ERROR_CODE_AD_REUSED = 1;
    public static final int ERROR_CODE_APP_NOT_FOREGROUND = 3;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_MEDIATION_SHOW_ERROR = 4;
    public static final int ERROR_CODE_NOT_READY = 2;

    public void onAdClicked() {
    }

    public void onAdDismissedFullScreenContent() {
    }

    public void onAdFailedToShowFullScreenContent(AdError adError) {
    }

    public void onAdImpression() {
    }

    public void onAdShowedFullScreenContent() {
    }
}
