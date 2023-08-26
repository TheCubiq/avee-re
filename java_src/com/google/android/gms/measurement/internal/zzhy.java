package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzhy implements Runnable {
    private final /* synthetic */ Boolean zza;
    private final /* synthetic */ zzhe zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhy(zzhe zzheVar, Boolean bool) {
        this.zzb = zzheVar;
        this.zza = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza(this.zza, true);
    }
}
