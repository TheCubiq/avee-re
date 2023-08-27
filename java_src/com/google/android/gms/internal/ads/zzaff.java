package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzaff implements Runnable {
    private final /* synthetic */ zzafa zzcgj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaff(zzafa zzafaVar) {
        this.zzcgj = zzafaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzvs zzvsVar;
        zzvs zzvsVar2;
        zzvsVar = this.zzcgj.zzcgi;
        if (zzvsVar != null) {
            zzvsVar2 = this.zzcgj.zzcgi;
            zzvsVar2.release();
            this.zzcgj.zzcgi = null;
        }
    }
}
