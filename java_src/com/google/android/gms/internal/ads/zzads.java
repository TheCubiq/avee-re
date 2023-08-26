package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzads implements Runnable {
    private final /* synthetic */ zzadk zzccn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzads(zzadk zzadkVar) {
        this.zzccn = zzadkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.zzccn.zzbzh;
        synchronized (obj) {
            if (this.zzccn.zzccj == null) {
                return;
            }
            this.zzccn.onStop();
            this.zzccn.zzc(2, "Timed out waiting for ad response.");
        }
    }
}
