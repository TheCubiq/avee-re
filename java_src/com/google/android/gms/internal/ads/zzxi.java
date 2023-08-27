package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
final class zzxi implements Callable<zzxe> {
    private final /* synthetic */ zzxb zzbuj;
    private final /* synthetic */ zzxh zzbuk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxi(zzxh zzxhVar, zzxb zzxbVar) {
        this.zzbuk = zzxhVar;
        this.zzbuj = zzxbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: zzmn */
    public final zzxe call() throws Exception {
        Object obj;
        boolean z;
        long j;
        long j2;
        obj = this.zzbuk.mLock;
        synchronized (obj) {
            z = this.zzbuk.zzbuf;
            if (z) {
                return null;
            }
            zzxb zzxbVar = this.zzbuj;
            j = this.zzbuk.mStartTime;
            j2 = this.zzbuk.zzbud;
            return zzxbVar.zza(j, j2);
        }
    }
}
