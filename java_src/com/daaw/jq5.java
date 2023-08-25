package com.daaw;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.zzl;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes.dex */
public final class jq5 extends TimerTask {
    public final /* synthetic */ AlertDialog p;
    public final /* synthetic */ Timer q;
    public final /* synthetic */ zzl r;

    public jq5(AlertDialog alertDialog, Timer timer, zzl zzlVar) {
        this.p = alertDialog;
        this.q = timer;
        this.r = zzlVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.p.dismiss();
        this.q.cancel();
        zzl zzlVar = this.r;
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }
}
