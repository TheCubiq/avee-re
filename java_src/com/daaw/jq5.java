package com.daaw;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
public final class jq5 extends TimerTask {

    /* renamed from: p */
    public final /* synthetic */ AlertDialog f15334p;

    /* renamed from: q */
    public final /* synthetic */ Timer f15335q;

    /* renamed from: r */
    public final /* synthetic */ zzl f15336r;

    public jq5(AlertDialog alertDialog, Timer timer, zzl zzlVar) {
        this.f15334p = alertDialog;
        this.f15335q = timer;
        this.f15336r = zzlVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f15334p.dismiss();
        this.f15335q.cancel();
        zzl zzlVar = this.f15336r;
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }
}
