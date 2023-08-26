package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzci;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbr implements View.OnTouchListener {
    private final /* synthetic */ zzbp zzaba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbr(zzbp zzbpVar) {
        this.zzaba = zzbpVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzci zzciVar;
        zzci zzciVar2;
        zzciVar = this.zzaba.zzaay;
        if (zzciVar != null) {
            zzciVar2 = this.zzaba.zzaay;
            zzciVar2.zza(motionEvent);
            return false;
        }
        return false;
    }
}
