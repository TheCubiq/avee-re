package com.google.android.gms.ads.initialization;
/* loaded from: classes.dex */
public interface AdapterStatus {

    /* loaded from: classes.dex */
    public enum State {
        NOT_READY,
        READY
    }

    String getDescription();

    State getInitializationState();

    int getLatency();
}
