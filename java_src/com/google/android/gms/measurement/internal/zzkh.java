package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zznf;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzkh {
    private long zza;
    private long zzb;
    private final zzaj zzc;
    private final /* synthetic */ zzkb zzd;

    public zzkh(zzkb zzkbVar) {
        this.zzd = zzkbVar;
        this.zzc = new zzkg(this, this.zzd.zzy);
        long elapsedRealtime = zzkbVar.zzl().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(long j) {
        this.zzd.zzc();
        this.zzc.zzc();
        this.zza = j;
        this.zzb = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(long j) {
        this.zzc.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zzc();
        this.zza = 0L;
        this.zzb = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc() {
        this.zzd.zzc();
        zza(false, false, this.zzd.zzl().elapsedRealtime());
        this.zzd.zzd().zza(this.zzd.zzl().elapsedRealtime());
    }

    public final boolean zza(boolean z, boolean z2, long j) {
        this.zzd.zzc();
        this.zzd.zzv();
        if (!zzne.zzb() || !this.zzd.zzs().zza(zzat.zzbr) || this.zzd.zzy.zzaa()) {
            this.zzd.zzr().zzp.zza(this.zzd.zzl().currentTimeMillis());
        }
        long j2 = j - this.zza;
        if (!z && j2 < 1000) {
            this.zzd.zzq().zzw().zza("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (this.zzd.zzs().zza(zzat.zzat) && !z2) {
            j2 = (zznf.zzb() && this.zzd.zzs().zza(zzat.zzav)) ? zzc(j) : zzb();
        }
        this.zzd.zzq().zzw().zza("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        zzim.zza(this.zzd.zzh().zza(!this.zzd.zzs().zzh().booleanValue()), bundle, true);
        if (this.zzd.zzs().zza(zzat.zzat) && !this.zzd.zzs().zza(zzat.zzau) && z2) {
            bundle.putLong("_fr", 1L);
        }
        if (!this.zzd.zzs().zza(zzat.zzau) || !z2) {
            this.zzd.zze().zza("auto", "_e", bundle);
        }
        this.zza = j;
        this.zzc.zzc();
        this.zzc.zza(3600000L);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzb() {
        long elapsedRealtime = this.zzd.zzl().elapsedRealtime();
        long j = elapsedRealtime - this.zzb;
        this.zzb = elapsedRealtime;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzc(long j) {
        long j2 = j - this.zzb;
        this.zzb = j;
        return j2;
    }
}
