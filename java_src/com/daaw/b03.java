package com.daaw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
/* loaded from: classes.dex */
public final class b03 implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: u */
    public static final b03 f4206u = new b03();

    /* renamed from: p */
    public volatile long f4207p;

    /* renamed from: q */
    public final Handler f4208q;

    /* renamed from: r */
    public final HandlerThread f4209r;

    /* renamed from: s */
    public Choreographer f4210s;

    /* renamed from: t */
    public int f4211t;

    public b03() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f4209r = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f4208q = handler;
        handler.sendEmptyMessage(0);
    }

    /* renamed from: a */
    public static b03 m26528a() {
        return f4206u;
    }

    /* renamed from: b */
    public final void m26527b() {
        this.f4208q.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void m26526c() {
        this.f4208q.sendEmptyMessage(2);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f4207p = j;
        this.f4210s.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f4210s = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            int i2 = this.f4211t + 1;
            this.f4211t = i2;
            if (i2 == 1) {
                this.f4210s.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            int i3 = this.f4211t - 1;
            this.f4211t = i3;
            if (i3 == 0) {
                this.f4210s.removeFrameCallback(this);
                this.f4207p = 0L;
            }
            return true;
        }
    }
}
