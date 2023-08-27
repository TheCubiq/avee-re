package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzcd;
import com.google.android.gms.internal.measurement.zzms;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzu extends zzv {
    private zzbv.zze zzg;
    private final /* synthetic */ zzo zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzo zzoVar, String str, int i, zzbv.zze zzeVar) {
        super(str, i);
        this.zzh = zzoVar;
        this.zzg = zzeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzv
    public final boolean zzb() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzv
    public final boolean zzc() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.zzv
    public final int zza() {
        return this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(Long l, Long l2, zzcd.zzk zzkVar, boolean z) {
        boolean z2 = zzms.zzb() && this.zzh.zzs().zzd(this.zza, zzat.zzba);
        boolean zze = this.zzg.zze();
        boolean zzf = this.zzg.zzf();
        boolean zzh = this.zzg.zzh();
        boolean z3 = zze || zzf || zzh;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z && !z3) {
            this.zzh.zzq().zzw().zza("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.zzb), this.zzg.zza() ? Integer.valueOf(this.zzg.zzb()) : null);
            return true;
        }
        zzbv.zzc zzd = this.zzg.zzd();
        boolean zzf2 = zzd.zzf();
        if (zzkVar.zzf()) {
            if (!zzd.zzc()) {
                this.zzh.zzq().zzh().zza("No number filter for long property. property", this.zzh.zzn().zzc(zzkVar.zzc()));
            } else {
                bool = zza(zza(zzkVar.zzg(), zzd.zzd()), zzf2);
            }
        } else if (zzkVar.zzh()) {
            if (!zzd.zzc()) {
                this.zzh.zzq().zzh().zza("No number filter for double property. property", this.zzh.zzn().zzc(zzkVar.zzc()));
            } else {
                bool = zza(zza(zzkVar.zzi(), zzd.zzd()), zzf2);
            }
        } else if (zzkVar.zzd()) {
            if (!zzd.zza()) {
                if (!zzd.zzc()) {
                    this.zzh.zzq().zzh().zza("No string or number filter defined. property", this.zzh.zzn().zzc(zzkVar.zzc()));
                } else if (zzkt.zza(zzkVar.zze())) {
                    bool = zza(zza(zzkVar.zze(), zzd.zzd()), zzf2);
                } else {
                    this.zzh.zzq().zzh().zza("Invalid user property value for Numeric number filter. property, value", this.zzh.zzn().zzc(zzkVar.zzc()), zzkVar.zze());
                }
            } else {
                bool = zza(zza(zzkVar.zze(), zzd.zzb(), this.zzh.zzq()), zzf2);
            }
        } else {
            this.zzh.zzq().zzh().zza("User property has no value, property", this.zzh.zzn().zzc(zzkVar.zzc()));
        }
        this.zzh.zzq().zzw().zza("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.zzc = true;
        if (!zzh || bool.booleanValue()) {
            if (!z || this.zzg.zze()) {
                this.zzd = bool;
            }
            if (bool.booleanValue() && z3 && zzkVar.zza()) {
                long zzb = zzkVar.zzb();
                if (l != null) {
                    zzb = l.longValue();
                }
                if (z2 && this.zzg.zze() && !this.zzg.zzf() && l2 != null) {
                    zzb = l2.longValue();
                }
                if (this.zzg.zzf()) {
                    this.zzf = Long.valueOf(zzb);
                } else {
                    this.zze = Long.valueOf(zzb);
                }
            }
            return true;
        }
        return true;
    }
}
