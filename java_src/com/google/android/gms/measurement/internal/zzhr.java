package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
final class zzhr implements Runnable {
    private final /* synthetic */ zzhd zza;
    private final /* synthetic */ zzhe zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhr(zzhe zzheVar, zzhd zzhdVar) {
        this.zzb = zzheVar;
        this.zza = zzhdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza(this.zza);
    }
}
