package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzir implements Runnable {
    private final /* synthetic */ zzim zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzir(zzim zzimVar) {
        this.zza = zzimVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzin zzinVar;
        zzim zzimVar = this.zza;
        zzinVar = zzimVar.zzh;
        zzimVar.zza = zzinVar;
    }
}
