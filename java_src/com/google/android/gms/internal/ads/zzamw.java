package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
final class zzamw extends Thread {
    private final /* synthetic */ String zzcce;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzamw(zzamv zzamvVar, String str) {
        this.zzcce = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzanf().zzcz(this.zzcce);
    }
}
