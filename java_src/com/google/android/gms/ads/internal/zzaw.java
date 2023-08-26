package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzaqw;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes.dex */
final class zzaw implements com.google.android.gms.ads.internal.gmsg.zzv<zzaqw> {
    private final /* synthetic */ CountDownLatch zzwd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaw(CountDownLatch countDownLatch) {
        this.zzwd = countDownLatch;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzv
    public final /* synthetic */ void zza(zzaqw zzaqwVar, Map map) {
        zzakb.zzdk("Adapter returned an ad, but assets substitution failed");
        this.zzwd.countDown();
        zzaqwVar.destroy();
    }
}
