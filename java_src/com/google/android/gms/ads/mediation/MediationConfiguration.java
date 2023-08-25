package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
/* loaded from: classes.dex */
public class MediationConfiguration {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";
    public final AdFormat a;
    public final Bundle b;

    public MediationConfiguration(AdFormat adFormat, Bundle bundle) {
        this.a = adFormat;
        this.b = bundle;
    }

    public AdFormat getFormat() {
        return this.a;
    }

    public Bundle getServerParameters() {
        return this.b;
    }
}
