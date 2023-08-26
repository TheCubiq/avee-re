package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzabp implements Runnable {
    private final /* synthetic */ zzajh zzbzl;
    private final /* synthetic */ zzabo zzbzm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabp(zzabo zzaboVar, zzajh zzajhVar) {
        this.zzbzm = zzaboVar;
        this.zzbzl = zzajhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzabm zzabmVar;
        zzabmVar = this.zzbzm.zzbzd;
        zzabmVar.zzb(this.zzbzl);
    }
}
