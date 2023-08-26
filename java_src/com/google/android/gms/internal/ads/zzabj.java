package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzabj implements Runnable {
    private final /* synthetic */ zzajh zzaam;
    private final /* synthetic */ zzabh zzbzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabj(zzabh zzabhVar, zzajh zzajhVar) {
        this.zzbzk = zzabhVar;
        this.zzaam = zzajhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzbzk.mLock) {
            zzabh zzabhVar = this.zzbzk;
            zzabhVar.zzbzd.zzb(this.zzaam);
        }
    }
}
