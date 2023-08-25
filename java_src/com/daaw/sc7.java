package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
/* loaded from: classes.dex */
public final class sc7 extends BroadcastReceiver implements Runnable {
    public final vd7 p;
    public final Handler q;
    public final /* synthetic */ ye7 r;

    public sc7(ye7 ye7Var, Handler handler, vd7 vd7Var) {
        this.r = ye7Var;
        this.q = handler;
        this.p = vd7Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.q.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
