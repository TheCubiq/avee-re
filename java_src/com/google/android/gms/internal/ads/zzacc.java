package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzacc implements Runnable {
    private final /* synthetic */ AtomicInteger zzcay;
    private final /* synthetic */ int zzcaz;
    private final /* synthetic */ zzaoj zzcba;
    private final /* synthetic */ List zzcbb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzacc(AtomicInteger atomicInteger, int i, zzaoj zzaojVar, List list) {
        this.zzcay = atomicInteger;
        this.zzcaz = i;
        this.zzcba = zzaojVar;
        this.zzcbb = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List zzk;
        if (this.zzcay.incrementAndGet() >= this.zzcaz) {
            try {
                zzaoj zzaojVar = this.zzcba;
                zzk = zzabv.zzk(this.zzcbb);
                zzaojVar.set(zzk);
            } catch (InterruptedException | ExecutionException e) {
                zzakb.zzc("Unable to convert list of futures to a future of list", e);
            }
        }
    }
}
