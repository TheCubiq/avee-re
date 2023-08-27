package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzapa implements Runnable {
    private final /* synthetic */ zzaov zzcxf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapa(zzaov zzaovVar) {
        this.zzcxf = zzaovVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzapf zzapfVar;
        zzapf zzapfVar2;
        zzapfVar = this.zzcxf.zzcxd;
        if (zzapfVar != null) {
            zzapfVar2 = this.zzcxf.zzcxd;
            zzapfVar2.zzsu();
        }
    }
}
