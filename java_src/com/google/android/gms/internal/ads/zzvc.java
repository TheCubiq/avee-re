package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzvc implements Runnable {
    private final /* synthetic */ zzuw zzbpu;
    private final /* synthetic */ String zzbpv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzvc(zzuw zzuwVar, String str) {
        this.zzbpu = zzuwVar;
        this.zzbpv = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaqw zzaqwVar;
        zzaqwVar = this.zzbpu.zzbnd;
        zzaqwVar.loadUrl(this.zzbpv);
    }
}
