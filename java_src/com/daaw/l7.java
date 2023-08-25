package com.daaw;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.daaw.k7;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
@TargetApi(18)
/* loaded from: classes.dex */
public class l7 implements Runnable {
    public k7 p;
    public volatile a q;
    public boolean s;
    public boolean t;
    public Object r = new Object();
    public AtomicInteger u = new AtomicInteger();

    /* loaded from: classes.dex */
    public static class a extends Handler {
        public WeakReference<l7> a;

        public a(l7 l7Var) {
            this.a = new WeakReference<>(l7Var);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            Object obj = message.obj;
            l7 l7Var = this.a.get();
            if (l7Var == null) {
                return;
            }
            if (i == 1) {
                l7Var.f();
                Looper.myLooper().quit();
            } else if (i == 2) {
                if (l7Var.e((k7.a) obj, false)) {
                    return;
                }
                l7Var.u.incrementAndGet();
            } else {
                throw new RuntimeException("Unhandled msg what=" + i);
            }
        }
    }

    public l7(k7 k7Var) {
        this.p = k7Var;
        synchronized (this.r) {
            if (this.t) {
                return;
            }
            this.t = true;
            new Thread(this, "AudioTextureMovieEncoder2B").start();
            while (!this.s) {
                try {
                    this.r.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public void d(k7.a aVar) {
        synchronized (this.r) {
            if (this.s) {
                this.q.sendMessage(this.q.obtainMessage(2, aVar));
            }
        }
    }

    public final boolean e(k7.a aVar, boolean z) {
        int i = 0;
        while (i < 2) {
            try {
                boolean b = this.p.b(aVar, z, i == 0);
                this.p.a(false, false);
                if (b) {
                    return true;
                }
                lz1.c("############### [" + i + "] encode tried failed ");
                i++;
            } catch (Exception e) {
                lz1.b(e, "");
            }
        }
        lz1.c("encode failed, INFO_TRY_AGAIN_LATER?");
        lz1.c("encode failed, presentationTimeUs: " + aVar.c + " length: " + aVar.b);
        return false;
    }

    public final void f() {
        try {
            e(new k7.a(), true);
            this.p.d();
        } catch (IllegalStateException e) {
            lz1.b(e, "");
        }
    }

    public boolean g() {
        boolean z;
        synchronized (this.r) {
            z = this.t;
        }
        return z;
    }

    public void h(wf1 wf1Var) {
        int i = this.u.get();
        if (i > 0) {
            wf1Var.c("audioEncodeFrameFailed (" + i + ")");
        }
    }

    public void i() {
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
