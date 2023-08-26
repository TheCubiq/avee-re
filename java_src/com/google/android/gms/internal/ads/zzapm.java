package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzapm implements Runnable {
    private final /* synthetic */ zzapi zzcyd;
    private final /* synthetic */ boolean zzcye;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapm(zzapi zzapiVar, boolean z) {
        this.zzcyd = zzapiVar;
        this.zzcye = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzcyd.zza("windowVisibilityChanged", "isVisible", String.valueOf(this.zzcye));
    }
}
