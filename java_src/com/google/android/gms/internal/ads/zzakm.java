package com.google.android.gms.internal.ads;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzakm implements Runnable {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzakk zzcru;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakm(zzakk zzakkVar, Context context) {
        this.zzcru = zzakkVar;
        this.val$context = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        obj = this.zzcru.mLock;
        synchronized (obj) {
            this.zzcru.zzcpq = zzakk.zzam(this.val$context);
            obj2 = this.zzcru.mLock;
            obj2.notifyAll();
        }
    }
}
