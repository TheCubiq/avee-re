package com.daaw;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class ol8 {

    /* renamed from: a */
    public final Handler f21646a = new Handler(Looper.myLooper());

    /* renamed from: b */
    public final AudioTrack.StreamEventCallback f21647b;

    /* renamed from: c */
    public final /* synthetic */ sl8 f21648c;

    public ol8(sl8 sl8Var) {
        this.f21648c = sl8Var;
        this.f21647b = new ml8(this, sl8Var);
    }

    /* renamed from: a */
    public final void m14173a(AudioTrack audioTrack) {
        final Handler handler = this.f21646a;
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.daaw.kl8
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.f21647b);
    }

    /* renamed from: b */
    public final void m14172b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f21647b);
        this.f21646a.removeCallbacksAndMessages(null);
    }
}
