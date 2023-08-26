package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzkf implements Runnable {
    long zza;
    long zzb;
    final /* synthetic */ zzkc zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkf(zzkc zzkcVar, long j, long j2) {
        this.zzc = zzkcVar;
        this.zza = j;
        this.zzb = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzp().zza(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.zzke
            private final zzkf zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzkf zzkfVar = this.zza;
                zzkc zzkcVar = zzkfVar.zzc;
                long j = zzkfVar.zza;
                long j2 = zzkfVar.zzb;
                zzkcVar.zza.zzc();
                zzkcVar.zza.zzq().zzv().zza("Application going to the background");
                boolean z = true;
                if (zzkcVar.zza.zzs().zza(zzat.zzbw)) {
                    zzkcVar.zza.zzr().zzr.zza(true);
                }
                Bundle bundle = new Bundle();
                if (!zzkcVar.zza.zzs().zzh().booleanValue()) {
                    zzkcVar.zza.zzb.zzb(j2);
                    if (zzkcVar.zza.zzs().zza(zzat.zzbn)) {
                        bundle.putLong("_et", zzkcVar.zza.zza(j2));
                        zzim.zza(zzkcVar.zza.zzh().zza(true), bundle, true);
                    } else {
                        z = false;
                    }
                    zzkcVar.zza.zza(false, z, j2);
                }
                zzkcVar.zza.zze().zza("auto", "_ab", j, bundle);
            }
        });
    }
}
