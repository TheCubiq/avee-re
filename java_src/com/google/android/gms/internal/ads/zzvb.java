package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzvb implements Runnable {
    private final /* synthetic */ String zzbpt;
    private final /* synthetic */ zzuw zzbpu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvb(zzuw zzuwVar, String str) {
        this.zzbpu = zzuwVar;
        this.zzbpt = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaqw zzaqwVar;
        zzaqwVar = this.zzbpu.zzbnd;
        zzaqwVar.loadData(this.zzbpt, "text/html", "UTF-8");
    }
}
