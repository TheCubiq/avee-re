package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;
/* loaded from: classes.dex */
public class RtbSignalData {

    /* renamed from: a */
    public final Context f36443a;

    /* renamed from: b */
    public final List f36444b;

    /* renamed from: c */
    public final Bundle f36445c;

    /* renamed from: d */
    public final AdSize f36446d;

    public RtbSignalData(Context context, List<MediationConfiguration> list, Bundle bundle, AdSize adSize) {
        this.f36443a = context;
        this.f36444b = list;
        this.f36445c = bundle;
        this.f36446d = adSize;
    }

    public AdSize getAdSize() {
        return this.f36446d;
    }

    @Deprecated
    public MediationConfiguration getConfiguration() {
        List list = this.f36444b;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (MediationConfiguration) this.f36444b.get(0);
    }

    public List<MediationConfiguration> getConfigurations() {
        return this.f36444b;
    }

    public Context getContext() {
        return this.f36443a;
    }

    public Bundle getNetworkExtras() {
        return this.f36445c;
    }
}
