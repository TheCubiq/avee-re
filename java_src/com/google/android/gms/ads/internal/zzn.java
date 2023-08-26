package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
/* loaded from: classes.dex */
final class zzn implements View.OnTouchListener {
    private final /* synthetic */ zzl zzwp;
    private final /* synthetic */ zzx zzwq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzl zzlVar, zzx zzxVar) {
        this.zzwp = zzlVar;
        this.zzwq = zzxVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.zzwq.recordClick();
        if (this.zzwp.zzwn != null) {
            this.zzwp.zzwn.zzpi();
            return false;
        }
        return false;
    }
}
