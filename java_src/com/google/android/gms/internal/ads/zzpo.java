package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
/* loaded from: classes2.dex */
final class zzpo implements zzox {
    private final /* synthetic */ View zzbkc;
    private final /* synthetic */ zzpn zzbkd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpo(zzpn zzpnVar, View view) {
        this.zzbkd = zzpnVar;
        this.zzbkc = view;
    }

    @Override // com.google.android.gms.internal.ads.zzox
    public final void zzc(MotionEvent motionEvent) {
        this.zzbkd.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzox
    public final void zzki() {
        this.zzbkd.onClick(this.zzbkc);
    }
}
