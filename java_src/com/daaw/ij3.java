package com.daaw;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.Map;
/* loaded from: classes.dex */
public final class ij3 implements InitializationStatus {

    /* renamed from: a */
    public final Map f13683a;

    public ij3(Map map) {
        this.f13683a = map;
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public final Map<String, AdapterStatus> getAdapterStatusMap() {
        return this.f13683a;
    }
}
