package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzade implements Runnable {
    private final /* synthetic */ zzanf zzccd;
    private final /* synthetic */ String zzcce;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzade(zzadb zzadbVar, zzanf zzanfVar, String str) {
        this.zzccd = zzanfVar;
        this.zzcce = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzccd.zzcz(this.zzcce);
    }
}
