package com.daaw;

import com.google.android.gms.ads.initialization.AdapterStatus;
/* loaded from: classes.dex */
public final class hj3 implements AdapterStatus {

    /* renamed from: a */
    public final AdapterStatus.State f12604a;

    /* renamed from: b */
    public final String f12605b;

    /* renamed from: c */
    public final int f12606c;

    public hj3(AdapterStatus.State state, String str, int i) {
        this.f12604a = state;
        this.f12605b = str;
        this.f12606c = i;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.f12605b;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return this.f12604a;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.f12606c;
    }
}
