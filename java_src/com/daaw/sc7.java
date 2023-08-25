package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
/* loaded from: classes.dex */
public final class sc7 extends BroadcastReceiver implements Runnable {

    /* renamed from: p */
    public final vd7 f26076p;

    /* renamed from: q */
    public final Handler f26077q;

    /* renamed from: r */
    public final /* synthetic */ ye7 f26078r;

    public sc7(ye7 ye7Var, Handler handler, vd7 vd7Var) {
        this.f26078r = ye7Var;
        this.f26077q = handler;
        this.f26076p = vd7Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f26077q.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
