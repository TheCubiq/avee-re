package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzvu implements zzaoo<zzwb> {
    private final /* synthetic */ zzvs zzbqs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvu(zzvs zzvsVar) {
        this.zzbqs = zzvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaoo
    public final /* synthetic */ void zze(zzwb zzwbVar) {
        zzvw zzvwVar;
        zzakb.v("Releasing engine reference.");
        zzvwVar = this.zzbqs.zzbqq;
        zzvwVar.zzma();
    }
}
