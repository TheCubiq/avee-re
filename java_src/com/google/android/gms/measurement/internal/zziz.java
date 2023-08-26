package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zziz implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzn zzb;
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zziv zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziz(zziv zzivVar, AtomicReference atomicReference, zzn zznVar, boolean z) {
        this.zzd = zzivVar;
        this.zza = atomicReference;
        this.zzb = zznVar;
        this.zzc = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzep zzepVar;
        synchronized (this.zza) {
            try {
                zzepVar = this.zzd.zzb;
            } catch (RemoteException e) {
                this.zzd.zzq().zze().zza("Failed to get all user properties; remote exception", e);
                this.zza.notify();
            }
            if (zzepVar == null) {
                this.zzd.zzq().zze().zza("Failed to get all user properties; not connected to service");
                this.zza.notify();
                return;
            }
            this.zza.set(zzepVar.zza(this.zzb, this.zzc));
            this.zzd.zzaj();
            this.zza.notify();
        }
    }
}
