package com.daaw;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class ww8 extends Handler implements Runnable {

    /* renamed from: p */
    public final xw8 f31616p;

    /* renamed from: q */
    public final long f31617q;

    /* renamed from: r */
    public tw8 f31618r;

    /* renamed from: s */
    public IOException f31619s;

    /* renamed from: t */
    public int f31620t;

    /* renamed from: u */
    public Thread f31621u;

    /* renamed from: v */
    public boolean f31622v;

    /* renamed from: w */
    public volatile boolean f31623w;

    /* renamed from: x */
    public final /* synthetic */ bx8 f31624x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww8(bx8 bx8Var, Looper looper, xw8 xw8Var, tw8 tw8Var, int i, long j) {
        super(looper);
        this.f31624x = bx8Var;
        this.f31616p = xw8Var;
        this.f31618r = tw8Var;
        this.f31617q = j;
    }

    /* renamed from: a */
    public final void m5745a(boolean z) {
        this.f31623w = z;
        this.f31619s = null;
        if (hasMessages(0)) {
            this.f31622v = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.f31622v = true;
                this.f31616p.zzg();
                Thread thread = this.f31621u;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.f31624x.f5268b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            tw8 tw8Var = this.f31618r;
            Objects.requireNonNull(tw8Var);
            tw8Var.mo3300f(this.f31616p, elapsedRealtime, elapsedRealtime - this.f31617q, true);
            this.f31618r = null;
        }
    }

    /* renamed from: b */
    public final void m5744b(int i) {
        IOException iOException = this.f31619s;
        if (iOException != null && this.f31620t > i) {
            throw iOException;
        }
    }

    /* renamed from: c */
    public final void m5743c(long j) {
        ww8 ww8Var;
        ww8Var = this.f31624x.f5268b;
        uo4.m7872f(ww8Var == null);
        this.f31624x.f5268b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m5742d();
        }
    }

    /* renamed from: d */
    public final void m5742d() {
        ExecutorService executorService;
        ww8 ww8Var;
        this.f31619s = null;
        bx8 bx8Var = this.f31624x;
        executorService = bx8Var.f5267a;
        ww8Var = bx8Var.f5268b;
        Objects.requireNonNull(ww8Var);
        executorService.execute(ww8Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        int i2;
        int i3;
        long j;
        if (this.f31623w) {
            return;
        }
        int i4 = message.what;
        if (i4 == 0) {
            m5742d();
        } else if (i4 == 3) {
            throw ((Error) message.obj);
        } else {
            this.f31624x.f5268b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.f31617q;
            tw8 tw8Var = this.f31618r;
            Objects.requireNonNull(tw8Var);
            if (this.f31622v) {
                tw8Var.mo3300f(this.f31616p, elapsedRealtime, j2, false);
                return;
            }
            int i5 = message.what;
            if (i5 == 1) {
                try {
                    tw8Var.mo3302d(this.f31616p, elapsedRealtime, j2);
                } catch (RuntimeException e) {
                    s95.m10495c("LoadTask", "Unexpected exception handling load completed", e);
                    this.f31624x.f5269c = new ax8(e);
                }
            } else if (i5 != 2) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.f31619s = iOException;
                int i6 = this.f31620t + 1;
                this.f31620t = i6;
                vw8 mo3293m = tw8Var.mo3293m(this.f31616p, elapsedRealtime, j2, iOException, i6);
                i = mo3293m.f30684a;
                if (i == 3) {
                    this.f31624x.f5269c = this.f31619s;
                    return;
                }
                i2 = mo3293m.f30684a;
                if (i2 != 2) {
                    i3 = mo3293m.f30684a;
                    if (i3 == 1) {
                        this.f31620t = 1;
                    }
                    j = mo3293m.f30685b;
                    m5743c(j != -9223372036854775807L ? mo3293m.f30685b : Math.min((this.f31620t - 1) * 1000, 5000));
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object ax8Var;
        Message obtainMessage;
        boolean z;
        try {
            synchronized (this) {
                z = !this.f31622v;
                this.f31621u = Thread.currentThread();
            }
            if (z) {
                int i = it5.f13991a;
                Trace.beginSection("load:" + this.f31616p.getClass().getSimpleName());
                try {
                    this.f31616p.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.f31621u = null;
                Thread.interrupted();
            }
            if (this.f31623w) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.f31623w) {
                return;
            }
            obtainMessage = obtainMessage(2, e);
            obtainMessage.sendToTarget();
        } catch (Error e2) {
            if (!this.f31623w) {
                s95.m10495c("LoadTask", "Unexpected error loading stream", e2);
                obtainMessage(3, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (this.f31623w) {
                return;
            }
            s95.m10495c("LoadTask", "Unexpected exception loading stream", e3);
            ax8Var = new ax8(e3);
            obtainMessage = obtainMessage(2, ax8Var);
            obtainMessage.sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.f31623w) {
                return;
            }
            s95.m10495c("LoadTask", "OutOfMemory error loading stream", e4);
            ax8Var = new ax8(e4);
            obtainMessage = obtainMessage(2, ax8Var);
            obtainMessage.sendToTarget();
        }
    }
}
