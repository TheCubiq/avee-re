package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzpr implements zzox {
    private final /* synthetic */ View zzbkc;
    private final /* synthetic */ zzpp zzbkj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpr(zzpp zzppVar, View view) {
        this.zzbkj = zzppVar;
        this.zzbkc = view;
    }

    @Override // com.google.android.gms.internal.ads.zzox
    public final void zzc(MotionEvent motionEvent) {
        this.zzbkj.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzox
    public final void zzki() {
        boolean zza;
        zza = this.zzbkj.zza(zzpp.zzbjs);
        if (zza) {
            this.zzbkj.onClick(this.zzbkc);
        }
    }
}
