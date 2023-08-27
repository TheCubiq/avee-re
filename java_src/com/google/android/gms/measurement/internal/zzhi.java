package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzhi implements Runnable {
    private final /* synthetic */ zzhe zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhi(zzhe zzheVar) {
        this.zza = zzheVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zza();
    }
}
