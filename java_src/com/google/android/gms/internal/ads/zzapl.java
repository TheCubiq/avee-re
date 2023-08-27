package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzapl implements Runnable {
    private final /* synthetic */ zzapi zzcyd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapl(zzapi zzapiVar) {
        this.zzcyd = zzapiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzcyd.zza("surfaceDestroyed", new String[0]);
    }
}
