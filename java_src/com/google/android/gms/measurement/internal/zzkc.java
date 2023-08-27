package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzkc {
    final /* synthetic */ zzkb zza;
    private zzkf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkc(zzkb zzkbVar) {
        this.zza = zzkbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        Handler handler;
        this.zza.zzc();
        if (this.zza.zzs().zza(zzat.zzbk) && this.zzb != null) {
            handler = this.zza.zzc;
            handler.removeCallbacks(this.zzb);
        }
        if (this.zza.zzs().zza(zzat.zzbw)) {
            this.zza.zzr().zzr.zza(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(long j) {
        Handler handler;
        if (this.zza.zzs().zza(zzat.zzbk)) {
            this.zzb = new zzkf(this, this.zza.zzl().currentTimeMillis(), j);
            handler = this.zza.zzc;
            handler.postDelayed(this.zzb, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }
    }
}
