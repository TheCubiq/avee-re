package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdd implements Runnable {
    private final /* synthetic */ zzcz zzsl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdd(zzcz zzczVar) {
        this.zzsl = zzczVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznk.initialize(this.zzsl.zzrt);
    }
}
