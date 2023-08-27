package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public class zzkn extends zzgu implements zzgw {
    protected final zzkp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkn(zzkp zzkpVar) {
        super(zzkpVar.zzu());
        Preconditions.checkNotNull(zzkpVar);
        this.zza = zzkpVar;
    }

    public zzfv zzj() {
        return this.zza.zzc();
    }

    public zzac zzi() {
        return this.zza.zze();
    }

    public zzo zzh() {
        return this.zza.zzf();
    }

    public zzkt f_() {
        return this.zza.zzh();
    }

    public zzjv zzf() {
        return this.zza.zzi();
    }
}
