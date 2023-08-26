package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzhf {
    final Context zza;
    String zzb;
    String zzc;
    String zzd;
    Boolean zze;
    long zzf;
    com.google.android.gms.internal.measurement.zzae zzg;
    boolean zzh;
    Long zzi;

    public zzhf(Context context, com.google.android.gms.internal.measurement.zzae zzaeVar, Long l) {
        this.zzh = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        this.zzi = l;
        if (zzaeVar != null) {
            this.zzg = zzaeVar;
            this.zzb = zzaeVar.zzf;
            this.zzc = zzaeVar.zze;
            this.zzd = zzaeVar.zzd;
            this.zzh = zzaeVar.zzc;
            this.zzf = zzaeVar.zzb;
            if (zzaeVar.zzg != null) {
                this.zze = Boolean.valueOf(zzaeVar.zzg.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
