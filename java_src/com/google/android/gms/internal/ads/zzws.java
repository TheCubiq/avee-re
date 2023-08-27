package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzws implements zzaom {
    private final /* synthetic */ zzvs zzbrl;
    private final /* synthetic */ zzaoj zzbrn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzws(zzwq zzwqVar, zzaoj zzaojVar, zzvs zzvsVar) {
        this.zzbrn = zzaojVar;
        this.zzbrl = zzvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final void run() {
        this.zzbrn.setException(new zzwe("Unable to obtain a JavascriptEngine."));
        this.zzbrl.release();
    }
}
