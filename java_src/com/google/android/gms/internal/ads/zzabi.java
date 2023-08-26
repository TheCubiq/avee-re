package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzabi implements Runnable {
    private final /* synthetic */ zzabh zzbzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabi(zzabh zzabhVar) {
        this.zzbzk = zzabhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbzk.onStop();
    }
}
