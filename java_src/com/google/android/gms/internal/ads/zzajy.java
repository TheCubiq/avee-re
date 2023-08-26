package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzajy implements Runnable {
    private final /* synthetic */ zzajx zzcqt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajy(zzajx zzajxVar) {
        this.zzcqt = zzajxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzcqt.zzcqr = Thread.currentThread();
        this.zzcqt.zzdn();
    }
}
