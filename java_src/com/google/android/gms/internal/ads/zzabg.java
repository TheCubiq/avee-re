package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
final class zzabg implements Runnable {
    private final /* synthetic */ zzabf zzbzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzabg(zzabf zzabfVar) {
        this.zzbzj = zzabfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.zzbzj.zzbzi;
        if (atomicBoolean.get()) {
            zzakb.e("Timed out waiting for WebView to finish loading.");
            this.zzbzj.cancel();
        }
    }
}
