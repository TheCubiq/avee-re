package com.daaw;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
@TargetApi(18)
/* loaded from: classes.dex */
public class wk1 implements Runnable {

    /* renamed from: p */
    public os1 f31285p;

    /* renamed from: q */
    public volatile HandlerC3446a f31286q;

    /* renamed from: r */
    public Object f31287r = new Object();

    /* renamed from: s */
    public boolean f31288s;

    /* renamed from: t */
    public boolean f31289t;

    /* renamed from: com.daaw.wk1$a */
    /* loaded from: classes.dex */
    public static class HandlerC3446a extends Handler {

        /* renamed from: a */
        public WeakReference<wk1> f31290a;

        public HandlerC3446a(wk1 wk1Var) {
            this.f31290a = new WeakReference<>(wk1Var);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            wk1 wk1Var = this.f31290a.get();
            if (wk1Var == null) {
                return;
            }
            if (i == 1) {
                wk1Var.m6033e();
                Looper.myLooper().quit();
            } else if (i == 2) {
                wk1Var.m6034d();
            } else {
                throw new RuntimeException("Unhandled msg what=" + i);
            }
        }
    }

    public wk1(os1 os1Var) {
        this.f31285p = os1Var;
        synchronized (this.f31287r) {
            if (this.f31289t) {
                return;
            }
            this.f31289t = true;
            new Thread(this, "TextureMovieEncoder").start();
            while (!this.f31288s) {
                try {
                    this.f31287r.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: c */
    public void m6035c() {
        synchronized (this.f31287r) {
            if (this.f31288s) {
                this.f31286q.sendMessage(this.f31286q.obtainMessage(2));
            }
        }
    }

    /* renamed from: d */
    public final void m6034d() {
        try {
            this.f31285p.m14017a(false);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("handleFrameAvailable exception: ");
            sb.append(e.getMessage());
        }
    }

    /* renamed from: e */
    public final void m6033e() {
        try {
            this.f31285p.m14017a(true);
            this.f31285p.m14014d();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("exception: ");
            sb.append(e.getMessage());
        }
    }

    /* renamed from: f */
    public boolean m6032f() {
        boolean z;
        synchronized (this.f31287r) {
            z = this.f31289t;
        }
        return z;
    }

    /* renamed from: g */
    public void m6031g() {
        this.f31286q.sendMessage(this.f31286q.obtainMessage(1));
    }

    @Override // java.lang.Runnable
    public void run() {
        Looper.prepare();
        synchronized (this.f31287r) {
            this.f31286q = new HandlerC3446a(this);
            this.f31288s = true;
            this.f31287r.notify();
        }
        Looper.loop();
        synchronized (this.f31287r) {
            this.f31289t = false;
            this.f31288s = false;
            this.f31286q = null;
        }
    }
}
