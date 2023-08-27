package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzjk implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ zzn zze;
    private final /* synthetic */ zziv zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjk(zziv zzivVar, AtomicReference atomicReference, String str, String str2, String str3, zzn zznVar) {
        this.zzf = zzivVar;
        this.zza = atomicReference;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzep zzepVar;
        synchronized (this.zza) {
            try {
                zzepVar = this.zzf.zzb;
            } catch (RemoteException e) {
                this.zzf.zzq().zze().zza("(legacy) Failed to get conditional properties; remote exception", zzex.zza(this.zzb), this.zzc, e);
                this.zza.set(Collections.emptyList());
                this.zza.notify();
            }
            if (zzepVar == null) {
                this.zzf.zzq().zze().zza("(legacy) Failed to get conditional properties; not connected to service", zzex.zza(this.zzb), this.zzc, this.zzd);
                this.zza.set(Collections.emptyList());
                this.zza.notify();
                return;
            }
            if (TextUtils.isEmpty(this.zzb)) {
                this.zza.set(zzepVar.zza(this.zzc, this.zzd, this.zze));
            } else {
                this.zza.set(zzepVar.zza(this.zzb, this.zzc, this.zzd));
            }
            this.zzf.zzaj();
            this.zza.notify();
        }
    }
}
