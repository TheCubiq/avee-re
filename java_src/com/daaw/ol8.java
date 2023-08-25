package com.daaw;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ol8 {
    public final Handler a = new Handler(Looper.myLooper());
    public final AudioTrack.StreamEventCallback b;
    public final /* synthetic */ sl8 c;

    public ol8(sl8 sl8Var) {
        this.c = sl8Var;
        this.b = new ml8(this, sl8Var);
    }

    public final void a(AudioTrack audioTrack) {
        final Handler handler = this.a;
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.daaw.kl8
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
