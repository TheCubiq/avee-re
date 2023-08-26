package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhe implements Runnable {
    private final /* synthetic */ zzhd zzajt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhe(zzhd zzhdVar) {
        this.zzajt = zzhdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzajt.disconnect();
    }
}
