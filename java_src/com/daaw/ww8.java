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
    public final xw8 p;
    public final long q;
    public tw8 r;
    public IOException s;
    public int t;
    public Thread u;
    public boolean v;
    public volatile boolean w;
    public final /* synthetic */ bx8 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww8(bx8 bx8Var, Looper looper, xw8 xw8Var, tw8 tw8Var, int i, long j) {
        super(looper);
        this.x = bx8Var;
        this.p = xw8Var;
        this.r = tw8Var;
        this.q = j;
    }

    public final void a(boolean z) {
        this.w = z;
        this.s = null;
        if (hasMessages(0)) {
            this.v = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.v = true;
                this.p.zzg();
                Thread thread = this.u;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.x.b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            tw8 tw8Var = this.r;
            Objects.requireNonNull(tw8Var);
            tw8Var.f(this.p, elapsedRealtime, elapsedRealtime - this.q, true);
            this.r = null;
        }
    }

    public final void b(int i) {
        IOException iOException = this.s;
        if (iOException != null && this.t > i) {
            throw iOException;
        }
    }

    public final void c(long j) {
        ww8 ww8Var;
        ww8Var = this.x.b;
        uo4.f(ww8Var == null);
        this.x.b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            d();
        }
    }

    public final void d() {
        ExecutorService executorService;
        ww8 ww8Var;
        this.s = null;
        bx8 bx8Var = this.x;
        executorService = bx8Var.a;
        ww8Var = bx8Var.b;
        Objects.requireNonNull(ww8Var);
        executorService.execute(ww8Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        int i2;
        int i3;
        long j;
        if (this.w) {
            return;
        }
        int i4 = message.what;
        if (i4 == 0) {
            d();
        } else if (i4 == 3) {
            throw ((Error) message.obj);
        } else {
            this.x.b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.q;
            tw8 tw8Var = this.r;
            Objects.requireNonNull(tw8Var);
            if (this.v) {
                tw8Var.f(this.p, elapsedRealtime, j2, false);
                return;
            }
            int i5 = message.what;
            if (i5 == 1) {
                try {
                    tw8Var.d(this.p, elapsedRealtime, j2);
                } catch (RuntimeException e) {
                    s95.c("LoadTask", "Unexpected exception handling load completed", e);
                    this.x.c = new ax8(e);
                }
            } else if (i5 != 2) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.s = iOException;
                int i6 = this.t + 1;
                this.t = i6;
                vw8 m = tw8Var.m(this.p, elapsedRealtime, j2, iOException, i6);
                i = m.a;
                if (i == 3) {
                    this.x.c = this.s;
                    return;
                }
                i2 = m.a;
                if (i2 != 2) {
                    i3 = m.a;
                    if (i3 == 1) {
                        this.t = 1;
                    }
                    j = m.b;
                    c(j != -9223372036854775807L ? m.b : Math.min((this.t - 1) * 1000, 5000));
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
                z = !this.v;
                this.u = Thread.currentThread();
            }
            if (z) {
                int i = it5.a;
                Trace.beginSection("load:" + this.p.getClass().getSimpleName());
                try {
                    this.p.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.u = null;
                Thread.interrupted();
            }
            if (this.w) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.w) {
                return;
            }
            obtainMessage = obtainMessage(2, e);
            obtainMessage.sendToTarget();
        } catch (Error e2) {
            if (!this.w) {
                s95.c("LoadTask", "Unexpected error loading stream", e2);
                obtainMessage(3, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (this.w) {
                return;
            }
            s95.c("LoadTask", "Unexpected exception loading stream", e3);
            ax8Var = new ax8(e3);
            obtainMessage = obtainMessage(2, ax8Var);
            obtainMessage.sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.w) {
                return;
            }
            s95.c("LoadTask", "OutOfMemory error loading stream", e4);
            ax8Var = new ax8(e4);
            obtainMessage = obtainMessage(2, ax8Var);
            obtainMessage.sendToTarget();
        }
    }
}
