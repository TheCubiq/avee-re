package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzdp {
    private final boolean zza;

    public zzdp(zzdo zzdoVar) {
        zzdw.zza(zzdoVar, "BuildInfo must be non-null");
        this.zza = !zzdoVar.zza();
    }

    public final boolean zza(String str) {
        zzdw.zza(str, "flagName must not be null");
        if (this.zza) {
            return zzdr.zza.zza().zza(str);
        }
        return true;
    }
}
