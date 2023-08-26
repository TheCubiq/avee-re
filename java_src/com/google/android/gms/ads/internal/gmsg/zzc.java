package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.ads.zzadh;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
@zzadh
/* loaded from: classes.dex */
public final class zzc implements zzv<Object> {
    private final zzd zzblm;

    public zzc(zzd zzdVar) {
        this.zzblm = zzdVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            zzakb.zzdk("App event with no name parameter.");
        } else {
            this.zzblm.onAppEvent(str, map.get("info"));
        }
    }
}
