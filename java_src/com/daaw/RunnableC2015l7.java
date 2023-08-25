package com.daaw;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.daaw.C1914k7;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
@TargetApi(18)
/* renamed from: com.daaw.l7 */
/* loaded from: classes.dex */
public class RunnableC2015l7 implements Runnable {

    /* renamed from: p */
    public C1914k7 f17095p;

    /* renamed from: q */
    public volatile HandlerC2016a f17096q;

    /* renamed from: s */
    public boolean f17098s;

    /* renamed from: t */
    public boolean f17099t;

    /* renamed from: r */
    public Object f17097r = new Object();

    /* renamed from: u */
    public AtomicInteger f17100u = new AtomicInteger();

    /* renamed from: com.daaw.l7$a */
    /* loaded from: classes.dex */
    public static class HandlerC2016a extends Handler {

        /* renamed from: a */
        public WeakReference<RunnableC2015l7> f17101a;

        public HandlerC2016a(RunnableC2015l7 runnableC2015l7) {
            this.f17101a = new WeakReference<>(runnableC2015l7);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            Object obj = message.obj;
            RunnableC2015l7 runnableC2015l7 = this.f17101a.get();
            if (runnableC2015l7 == null) {
                return;
            }
            if (i == 1) {
                runnableC2015l7.m17114f();
                Looper.myLooper().quit();
            } else if (i == 2) {
                if (runnableC2015l7.m17115e((C1914k7.C1915a) obj, false)) {
                    return;
                }
                runnableC2015l7.f17100u.incrementAndGet();
            } else {
                throw new RuntimeException("Unhandled msg what=" + i);
            }
        }
    }

    public RunnableC2015l7(C1914k7 c1914k7) {
        this.f17095p = c1914k7;
        synchronized (this.f17097r) {
            if (this.f17099t) {
                return;
            }
            this.f17099t = true;
            new Thread(this, "AudioTextureMovieEncoder2B").start();
            while (!this.f17098s) {
                try {
                    this.f17097r.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    /* renamed from: d */
    public void m17116d(C1914k7.C1915a c1915a) {
        synchronized (this.f17097r) {
            if (this.f17098s) {
                this.f17096q.sendMessage(this.f17096q.obtainMessage(2, c1915a));
            }
        }
    }

    /* renamed from: e */
    public final boolean m17115e(C1914k7.C1915a c1915a, boolean z) {
        int i = 0;
        while (i < 2) {
            try {
                boolean m18013b = this.f17095p.m18013b(c1915a, z, i == 0);
                this.f17095p.m18014a(false, false);
                if (m18013b) {
                    return true;
                }
                lz1.m16363c("############### [" + i + "] encode tried failed ");
                i++;
            } catch (Exception e) {
                lz1.m16364b(e, "");
            }
        }
        lz1.m16363c("encode failed, INFO_TRY_AGAIN_LATER?");
        lz1.m16363c("encode failed, presentationTimeUs: " + c1915a.f15727c + " length: " + c1915a.f15726b);
        return false;
    }

    /* renamed from: f */
    public final void m17114f() {
        try {
            m17115e(new C1914k7.C1915a(), true);
            this.f17095p.m18011d();
        } catch (IllegalStateException e) {
            lz1.m16364b(e, "");
        }
    }

    /* renamed from: g */
    public boolean m17113g() {
        boolean z;
        synchronized (this.f17097r) {
            z = this.f17099t;
        }
        return z;
    }

    /* renamed from: h */
    public void m17112h(wf1 wf1Var) {
        int i = this.f17100u.get();
        if (i > 0) {
            wf1Var.m6094c("audioEncodeFrameFailed (" + i + ")");
        }
    }

    /* renamed from: i */
    public void m17111i() {
        this.f17096q.sendMessage(this.f17096q.obtainMessage(1));
    }

    @Override // java.lang.Runnable
    public void run() {
        Looper.prepare();
        synchronized (this.f17097r) {
            this.f17096q = new HandlerC2016a(this);
            this.f17098s = true;
            this.f17097r.notify();
        }
        Looper.loop();
        synchronized (this.f17097r) {
            this.f17099t = false;
            this.f17098s = false;
            this.f17096q = null;
        }
    }
}
