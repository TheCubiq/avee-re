package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzfl {
    private final String zza;
    private final boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private final /* synthetic */ zzfj zze;

    public zzfl(zzfj zzfjVar, String str, boolean z) {
        this.zze = zzfjVar;
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = z;
    }

    public final boolean zza() {
        if (!this.zzc) {
            this.zzc = true;
            this.zzd = this.zze.zzf().getBoolean(this.zza, this.zzb);
        }
        return this.zzd;
    }

    public final void zza(boolean z) {
        SharedPreferences.Editor edit = this.zze.zzf().edit();
        edit.putBoolean(this.zza, z);
        edit.apply();
        this.zzd = z;
    }
}
