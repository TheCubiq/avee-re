package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public class zzgu implements zzgw {
    protected final zzgb zzy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgu(zzgb zzgbVar) {
        Preconditions.checkNotNull(zzgbVar);
        this.zzy = zzgbVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public zzx zzt() {
        return this.zzy.zzt();
    }

    public zzy zzs() {
        return this.zzy.zza();
    }

    public zzfj zzr() {
        return this.zzy.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public zzex zzq() {
        return this.zzy.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public zzfu zzp() {
        return this.zzy.zzp();
    }

    public zzkx zzo() {
        return this.zzy.zzh();
    }

    public zzev zzn() {
        return this.zzy.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public Context zzm() {
        return this.zzy.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzgw
    public Clock zzl() {
        return this.zzy.zzl();
    }

    public zzal zzk() {
        return this.zzy.zzw();
    }

    public void zzc() {
        this.zzy.zzp().zzc();
    }

    public void zzb() {
        this.zzy.zzp().zzb();
    }

    public void zza() {
        this.zzy.zzad();
    }
}
