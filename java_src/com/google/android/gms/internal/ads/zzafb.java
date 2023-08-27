package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzafb implements Runnable {
    private final /* synthetic */ zzafa zzcgj;
    private final /* synthetic */ zzaji zzwg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafb(zzafa zzafaVar, zzaji zzajiVar) {
        this.zzcgj = zzafaVar;
        this.zzwg = zzajiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzadj zzadjVar;
        zzvs zzvsVar;
        zzvs zzvsVar2;
        zzadjVar = this.zzcgj.zzccf;
        zzadjVar.zza(this.zzwg);
        zzvsVar = this.zzcgj.zzcgi;
        if (zzvsVar != null) {
            zzvsVar2 = this.zzcgj.zzcgi;
            zzvsVar2.release();
            this.zzcgj.zzcgi = null;
        }
    }
}
