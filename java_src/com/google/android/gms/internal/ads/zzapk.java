package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzapk implements Runnable {
    private final /* synthetic */ zzapi zzcyd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapk(zzapi zzapiVar) {
        this.zzcyd = zzapiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzcyd.zza("surfaceCreated", new String[0]);
    }
}
