package com.daaw;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
@TargetApi(18)
/* loaded from: classes.dex */
public class wk1 implements Runnable {
    public os1 p;
    public volatile a q;
    public Object r = new Object();
    public boolean s;
    public boolean t;

    /* loaded from: classes.dex */
    public static class a extends Handler {
        public WeakReference<wk1> a;

        public a(wk1 wk1Var) {
            this.a = new WeakReference<>(wk1Var);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            wk1 wk1Var = this.a.get();
            if (wk1Var == null) {
                return;
            }
            if (i == 1) {
                wk1Var.e();
                Looper.myLooper().quit();
            } else if (i == 2) {
                wk1Var.d();
            } else {
                throw new RuntimeException("Unhandled msg what=" + i);
            }
        }
    }

    public wk1(os1 os1Var) {
        this.p = os1Var;
        synchronized (this.r) {
            if (this.t) {
                return;
            }
            this.t = true;
            new Thread(this, "TextureMovieEncoder").start();
            while (!this.s) {
                try {
                    this.r.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public void c() {
        synchronized (this.r) {
            if (this.s) {
                this.q.sendMessage(this.q.obtainMessage(2));
            }
        }
    }

    public final void d() {
        try {
            this.p.a(false);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("handleFrameAvailable exception: ");
            sb.append(e.getMessage());
        }
    }

    public final void e() {
        try {
            this.p.a(true);
            this.p.d();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("exception: ");
            sb.append(e.getMessage());
        }
    }

    public boolean f() {
        boolean z;
        synchronized (this.r) {
            z = this.t;
        }
        return z;
    }

    public void g() {
        this.q.sendMessage(this.q.obtainMessage(1));
    }

    @Override // java.lang.Runnable
    public void run() {
        Looper.prepare();
        synchronized (this.r) {
            this.q = new a(this);
            this.s = true;
            this.r.notify();
        }
        Looper.loop();
        synchronized (this.r) {
            this.t = false;
            this.s = false;
            this.q = null;
        }
    }
}
