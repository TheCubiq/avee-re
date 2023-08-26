package com.google.android.gms.ads.mediation.customevent;
/* loaded from: classes.dex */
public interface CustomEventListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(int i);

    void onAdLeftApplication();

    void onAdOpened();
}
