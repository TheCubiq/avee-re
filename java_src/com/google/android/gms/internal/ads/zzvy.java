package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzvy implements zzaom {
    private final /* synthetic */ zzvs zzbqv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvy(zzvw zzvwVar, zzvs zzvsVar) {
        this.zzbqv = zzvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void run() {
        zzakb.v("Rejecting reference for JS Engine.");
        this.zzbqv.reject();
    }
}
