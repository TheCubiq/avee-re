package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzit implements Runnable {
    private final /* synthetic */ zzin zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zzim zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzit(zzim zzimVar, zzin zzinVar, long j) {
        this.zzc = zzimVar;
        this.zza = zzinVar;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza(this.zza, false, this.zzb);
        this.zzc.zza = null;
        this.zzc.zzg().zza((zzin) null);
    }
}
