package com.daaw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import java.util.Objects;
/* loaded from: classes.dex */
public final class by8 implements Choreographer.FrameCallback, Handler.Callback {
    public static final by8 u = new by8();
    public volatile long p = -9223372036854775807L;
    public final Handler q;
    public final HandlerThread r;
    public Choreographer s;
    public int t;

    public by8() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.r = handlerThread;
        handlerThread.start();
        Handler c = it5.c(handlerThread.getLooper(), this);
        this.q = c;
        c.sendEmptyMessage(0);
    }

    public static by8 a() {
        return u;
    }

    public final void b() {
        this.q.sendEmptyMessage(1);
    }

    public final void c() {
        this.q.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.p = j;
        Choreographer choreographer = this.s;
        Objects.requireNonNull(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.s = Choreographer.getInstance();
            } catch (RuntimeException e) {
                s95.f("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        } else if (i == 1) {
            Choreographer choreographer = this.s;
            if (choreographer != null) {
                int i2 = this.t + 1;
                this.t = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            Choreographer choreographer2 = this.s;
            if (choreographer2 != null) {
                int i3 = this.t - 1;
                this.t = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.p = -9223372036854775807L;
                }
            }
            return true;
        }
    }
}
