package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzjj;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbm implements Runnable {
    private final /* synthetic */ WeakReference zzaas;
    private final /* synthetic */ zzbl zzaat;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbm(zzbl zzblVar, WeakReference weakReference) {
        this.zzaat = zzblVar;
        this.zzaas = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjj zzjjVar;
        zzbl.zza(this.zzaat, false);
        zza zzaVar = (zza) this.zzaas.get();
        if (zzaVar != null) {
            zzjjVar = this.zzaat.zzaao;
            if (zzaVar.zzc(zzjjVar)) {
                zzaVar.zzb(zzjjVar);
                return;
            }
            zzakb.zzdj("Ad is not visible. Not refreshing ad.");
            zzaVar.zzvv.zzg(zzjjVar);
        }
    }
}
