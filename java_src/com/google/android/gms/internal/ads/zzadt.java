package com.google.android.gms.internal.ads;

import android.os.Handler;
/* loaded from: classes2.dex */
final class zzadt implements Runnable {
    private final /* synthetic */ zzadk zzccn;
    private final /* synthetic */ zzaol zzcco;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzadt(zzadk zzadkVar, zzaol zzaolVar) {
        this.zzccn = zzadkVar;
        this.zzcco = zzaolVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        zzaeg zzaegVar;
        Runnable runnable;
        obj = this.zzccn.zzbzh;
        synchronized (obj) {
            zzadk zzadkVar = this.zzccn;
            zzadk zzadkVar2 = this.zzccn;
            zzaegVar = this.zzccn.zzccg;
            zzadkVar.zzccj = zzadkVar2.zza(zzaegVar.zzacr, this.zzcco);
            if (this.zzccn.zzccj == null) {
                this.zzccn.zzc(0, "Could not start the ad request service.");
                Handler handler = zzakk.zzcrm;
                runnable = this.zzccn.zzbzg;
                handler.removeCallbacks(runnable);
            }
        }
    }
}
