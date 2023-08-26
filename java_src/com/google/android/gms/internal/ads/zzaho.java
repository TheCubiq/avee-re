package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzaho implements Runnable {
    private final /* synthetic */ zzxq zzclu;
    private final /* synthetic */ zzahn zzclv;
    private final /* synthetic */ zzjj zzyh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaho(zzahn zzahnVar, zzjj zzjjVar, zzxq zzxqVar) {
        this.zzclv = zzahnVar;
        this.zzyh = zzjjVar;
        this.zzclu = zzxqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzclv.zza(this.zzyh, this.zzclu);
    }
}
