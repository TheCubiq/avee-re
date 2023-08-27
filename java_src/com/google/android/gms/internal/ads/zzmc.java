package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes2.dex */
final class zzmc implements Runnable {
    private final /* synthetic */ Context val$context;
    private final /* synthetic */ zzmb zzath;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmc(zzmb zzmbVar, Context context) {
        this.zzath = zzmbVar;
        this.val$context = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzath.getRewardedVideoAdInstance(this.val$context);
    }
}
