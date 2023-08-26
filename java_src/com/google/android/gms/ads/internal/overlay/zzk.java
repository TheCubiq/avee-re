package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
final class zzk implements Runnable {
    private final /* synthetic */ Drawable zzbyj;
    private final /* synthetic */ zzj zzbyk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzk(zzj zzjVar, Drawable drawable) {
        this.zzbyk = zzjVar;
        this.zzbyj = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbyk.zzbyg.mActivity.getWindow().setBackgroundDrawable(this.zzbyj);
    }
}
