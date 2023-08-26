package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zza extends zzd {
    private final Map<String, Long> zza;
    private final Map<String, Integer> zzb;
    private long zzc;

    public zza(zzgb zzgbVar) {
        super(zzgbVar);
        this.zzb = new ArrayMap();
        this.zza = new ArrayMap();
    }

    public final void zza(String str, long j) {
        if (str == null || str.length() == 0) {
            zzq().zze().zza("Ad unit id must be a non-empty string");
        } else {
            zzp().zza(new zzc(this, str, j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(String str, long j) {
        zzc();
        Preconditions.checkNotEmpty(str);
        if (this.zzb.isEmpty()) {
            this.zzc = j;
        }
        Integer num = this.zzb.get(str);
        if (num != null) {
            this.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (this.zzb.size() >= 100) {
            zzq().zzh().zza("Too many ads visible");
        } else {
            this.zzb.put(str, 1);
            this.zza.put(str, Long.valueOf(j));
        }
    }

    public final void zzb(String str, long j) {
        if (str == null || str.length() == 0) {
            zzq().zze().zza("Ad unit id must be a non-empty string");
        } else {
            zzp().zza(new zzb(this, str, j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(String str, long j) {
        zzc();
        Preconditions.checkNotEmpty(str);
        Integer num = this.zzb.get(str);
        if (num != null) {
            zzin zza = zzh().zza(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.zzb.remove(str);
                Long l = this.zza.get(str);
                if (l == null) {
                    zzq().zze().zza("First ad unit exposure time was never set");
                } else {
                    this.zza.remove(str);
                    zza(str, j - l.longValue(), zza);
                }
                if (this.zzb.isEmpty()) {
                    long j2 = this.zzc;
                    if (j2 == 0) {
                        zzq().zze().zza("First ad exposure time was never set");
                        return;
                    }
                    zza(j - j2, zza);
                    this.zzc = 0L;
                    return;
                }
                return;
            }
            this.zzb.put(str, Integer.valueOf(intValue));
            return;
        }
        zzq().zze().zza("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void zza(long j, zzin zzinVar) {
        if (zzinVar == null) {
            zzq().zzw().zza("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            zzq().zzw().zza("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            zzim.zza(zzinVar, bundle, true);
            zze().zza("am", "_xa", bundle);
        }
    }

    private final void zza(String str, long j, zzin zzinVar) {
        if (zzinVar == null) {
            zzq().zzw().zza("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            zzq().zzw().zza("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            zzim.zza(zzinVar, bundle, true);
            zze().zza("am", "_xu", bundle);
        }
    }

    public final void zza(long j) {
        zzin zza = zzh().zza(false);
        for (String str : this.zza.keySet()) {
            zza(str, j - this.zza.get(str).longValue(), zza);
        }
        if (!this.zza.isEmpty()) {
            zza(j - this.zzc, zza);
        }
        zzb(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(long j) {
        for (String str : this.zza.keySet()) {
            this.zza.put(str, Long.valueOf(j));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j;
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzd, com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zza zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzhe zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzeq zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zziv zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzim zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzet zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzd
    public final /* bridge */ /* synthetic */ zzkb zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzal zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ Clock zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ Context zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzev zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzkx zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ zzfu zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ zzex zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzfj zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu
    public final /* bridge */ /* synthetic */ zzy zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzgu, com.google.android.gms.measurement.internal.zzgw
    public final /* bridge */ /* synthetic */ zzx zzt() {
        return super.zzt();
    }
}
