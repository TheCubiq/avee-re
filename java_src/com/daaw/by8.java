package com.daaw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import java.util.Objects;
/* loaded from: classes.dex */
public final class by8 implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: u */
    public static final by8 f5279u = new by8();

    /* renamed from: p */
    public volatile long f5280p = -9223372036854775807L;

    /* renamed from: q */
    public final Handler f5281q;

    /* renamed from: r */
    public final HandlerThread f5282r;

    /* renamed from: s */
    public Choreographer f5283s;

    /* renamed from: t */
    public int f5284t;

    public by8() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.f5282r = handlerThread;
        handlerThread.start();
        Handler m19401c = it5.m19401c(handlerThread.getLooper(), this);
        this.f5281q = m19401c;
        m19401c.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static by8 m25728a() {
        return f5279u;
    }

    /* renamed from: b */
    public final void m25727b() {
        this.f5281q.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void m25726c() {
        this.f5281q.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f5280p = j;
        Choreographer choreographer = this.f5283s;
        Objects.requireNonNull(choreographer);
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            try {
                this.f5283s = Choreographer.getInstance();
            } catch (RuntimeException e) {
                s95.m10492f("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        } else if (i == 1) {
            Choreographer choreographer = this.f5283s;
            if (choreographer != null) {
                int i2 = this.f5284t + 1;
                this.f5284t = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            Choreographer choreographer2 = this.f5283s;
            if (choreographer2 != null) {
                int i3 = this.f5284t - 1;
                this.f5284t = i3;
                if (i3 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f5280p = -9223372036854775807L;
                }
            }
            return true;
        }
    }
}
