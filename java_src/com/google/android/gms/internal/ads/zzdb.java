package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdb implements Runnable {
    private final /* synthetic */ zzcz zzsl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdb(zzcz zzczVar) {
        this.zzsl = zzczVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzsl.zzal();
    }
}
