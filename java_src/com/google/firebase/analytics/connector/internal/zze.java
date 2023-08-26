package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-measurement-api@@17.5.0 */
/* loaded from: classes2.dex */
public final class zze implements zza {
    private AnalyticsConnector.AnalyticsConnectorListener zza;
    private AppMeasurementSdk zzb;
    private zzg zzc;

    public zze(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zza = analyticsConnectorListener;
        this.zzb = appMeasurementSdk;
        zzg zzgVar = new zzg(this);
        this.zzc = zzgVar;
        this.zzb.registerOnMeasurementEventListener(zzgVar);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zza(Set<String> set) {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb() {
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zza;
    }
}
