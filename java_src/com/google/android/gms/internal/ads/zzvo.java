package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzvo implements zzaoo<zzuu> {
    private final /* synthetic */ zzvf zzbqk;
    private final /* synthetic */ zzvw zzbqn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvo(zzvf zzvfVar, zzvw zzvwVar) {
        this.zzbqk = zzvfVar;
        this.zzbqn = zzvwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final /* synthetic */ void zze(zzuu zzuuVar) {
        Object obj;
        zzvw zzvwVar;
        zzvw zzvwVar2;
        zzvw zzvwVar3;
        obj = this.zzbqk.mLock;
        synchronized (obj) {
            this.zzbqk.zzbqb = 0;
            zzvwVar = this.zzbqk.zzbqa;
            if (zzvwVar != null) {
                zzvw zzvwVar4 = this.zzbqn;
                zzvwVar2 = this.zzbqk.zzbqa;
                if (zzvwVar4 != zzvwVar2) {
                    zzakb.v("New JS engine is loaded, marking previous one as destroyable.");
                    zzvwVar3 = this.zzbqk.zzbqa;
                    zzvwVar3.zzmb();
                }
            }
            this.zzbqk.zzbqa = this.zzbqn;
        }
    }
}
