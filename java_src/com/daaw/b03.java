package com.daaw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
/* loaded from: classes.dex */
public final class b03 implements Choreographer.FrameCallback, Handler.Callback {
    public static final b03 u = new b03();
    public volatile long p;
    public final Handler q;
    public final HandlerThread r;
    public Choreographer s;
    public int t;

    public b03() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.r = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.q = handler;
        handler.sendEmptyMessage(0);
    }

    public static b03 a() {
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
        this.s.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.s = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.t + 1;
            this.t = i2;
            if (i2 == 1) {
                this.s.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.t - 1;
            this.t = i3;
            if (i3 == 0) {
                this.s.removeFrameCallback(this);
                this.p = 0L;
            }
            return true;
        }
    }
}
