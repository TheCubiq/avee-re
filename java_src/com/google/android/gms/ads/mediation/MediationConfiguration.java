package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
/* loaded from: classes.dex */
public class MediationConfiguration {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    /* renamed from: a */
    public final AdFormat f36416a;

    /* renamed from: b */
    public final Bundle f36417b;

    public MediationConfiguration(AdFormat adFormat, Bundle bundle) {
        this.f36416a = adFormat;
        this.f36417b = bundle;
    }

    public AdFormat getFormat() {
        return this.f36416a;
    }

    public Bundle getServerParameters() {
        return this.f36417b;
    }
}
