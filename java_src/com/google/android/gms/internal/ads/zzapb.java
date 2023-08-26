package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzapb implements Runnable {
    private final /* synthetic */ zzaov zzcxf;
    private final /* synthetic */ int zzcxi;
    private final /* synthetic */ int zzcxj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapb(zzaov zzaovVar, int i, int i2) {
        this.zzcxf = zzaovVar;
        this.zzcxi = i;
        this.zzcxj = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzapf zzapfVar;
        zzapf zzapfVar2;
        zzapfVar = this.zzcxf.zzcxd;
        if (zzapfVar != null) {
            zzapfVar2 = this.zzcxf.zzcxd;
            zzapfVar2.zzf(this.zzcxi, this.zzcxj);
        }
    }
}
