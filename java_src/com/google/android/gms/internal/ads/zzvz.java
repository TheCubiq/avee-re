package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzvz implements zzaoo<zzuu> {
    final /* synthetic */ zzvw zzbqw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvz(zzvw zzvwVar) {
        this.zzbqw = zzvwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final /* synthetic */ void zze(zzuu zzuuVar) {
        final zzuu zzuuVar2 = zzuuVar;
        zzaoe.zzcvy.execute(new Runnable(this, zzuuVar2) { // from class: com.google.android.gms.internal.ads.zzwa
            private final zzvz zzbqx;
            private final zzuu zzbqy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbqx = this;
                this.zzbqy = zzuuVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzalo zzaloVar;
                zzvz zzvzVar = this.zzbqx;
                zzuu zzuuVar3 = this.zzbqy;
                zzaloVar = zzvzVar.zzbqw.zzbpz;
                zzaloVar.zze(zzuuVar3);
                zzuuVar3.destroy();
            }
        });
    }
}
