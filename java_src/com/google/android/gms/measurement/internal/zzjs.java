package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
final class zzjs implements Runnable {
    private final /* synthetic */ zzjp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjs(zzjp zzjpVar) {
        this.zza = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziv.zza(this.zza.zza, (zzep) null);
        this.zza.zza.zzam();
    }
}
