package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public abstract class zzaj {
    private static volatile Handler zzb;
    private final zzgw zza;
    private final Runnable zzc;
    private volatile long zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaj(zzgw zzgwVar) {
        Preconditions.checkNotNull(zzgwVar);
        this.zza = zzgwVar;
        this.zzc = new zzai(this, zzgwVar);
    }

    public abstract void zza();

    public final void zza(long j) {
        zzc();
        if (j >= 0) {
            this.zzd = this.zza.zzl().currentTimeMillis();
            if (zzd().postDelayed(this.zzc, j)) {
                return;
            }
            this.zza.zzq().zze().zza("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean zzb() {
        return this.zzd != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        this.zzd = 0L;
        zzd().removeCallbacks(this.zzc);
    }

    private final Handler zzd() {
        Handler handler;
        if (zzb != null) {
            return zzb;
        }
        synchronized (zzaj.class) {
            if (zzb == null) {
                zzb = new com.google.android.gms.internal.measurement.zzq(this.zza.zzm().getMainLooper());
            }
            handler = zzb;
        }
        return handler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ long zza(zzaj zzajVar, long j) {
        zzajVar.zzd = 0L;
        return 0L;
    }
}
