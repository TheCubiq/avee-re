package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzmb;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzjb implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzn zzb;
    private final /* synthetic */ zziv zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjb(zziv zzivVar, AtomicReference atomicReference, zzn zznVar) {
        this.zzc = zzivVar;
        this.zza = atomicReference;
        this.zzb = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzep zzepVar;
        synchronized (this.zza) {
            try {
            } catch (RemoteException e) {
                this.zzc.zzq().zze().zza("Failed to get app instance id", e);
                this.zza.notify();
            }
            if (zzmb.zzb() && this.zzc.zzs().zza(zzat.zzco) && !this.zzc.zzr().zzw().zze()) {
                this.zzc.zzq().zzj().zza("Analytics storage consent denied; will not get app instance id");
                this.zzc.zze().zza((String) null);
                this.zzc.zzr().zzj.zza(null);
                this.zza.set(null);
                this.zza.notify();
                return;
            }
            zzepVar = this.zzc.zzb;
            if (zzepVar == null) {
                this.zzc.zzq().zze().zza("Failed to get app instance id");
                this.zza.notify();
                return;
            }
            this.zza.set(zzepVar.zzc(this.zzb));
            String str = (String) this.zza.get();
            if (str != null) {
                this.zzc.zze().zza(str);
                this.zzc.zzr().zzj.zza(str);
            }
            this.zzc.zzaj();
            this.zza.notify();
        }
    }
}
