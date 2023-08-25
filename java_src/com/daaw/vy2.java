package com.daaw;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class vy2 extends Handler implements Runnable {
    public final wy2 p;
    public final uy2 q;
    public final int r;
    public final long s;
    public IOException t;
    public int u;
    public volatile Thread v;
    public volatile boolean w;
    public final /* synthetic */ yy2 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy2(yy2 yy2Var, Looper looper, wy2 wy2Var, uy2 uy2Var, int i, long j) {
        super(looper);
        this.x = yy2Var;
        this.p = wy2Var;
        this.q = uy2Var;
        this.r = i;
        this.s = j;
    }

    public final void a(boolean z) {
        this.w = z;
        this.t = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.p.zzb();
            if (this.v != null) {
                this.v.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.x.b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.q.j(this.p, elapsedRealtime, elapsedRealtime - this.s, true);
    }

    public final void b(int i) {
        IOException iOException = this.t;
        if (iOException != null && this.u > i) {
            throw iOException;
        }
    }

    public final void c(long j) {
        vy2 vy2Var;
        vy2Var = this.x.b;
        az2.e(vy2Var == null);
        this.x.b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            d();
        }
    }

    public final void d() {
        ExecutorService executorService;
        vy2 vy2Var;
        this.t = null;
        yy2 yy2Var = this.x;
        executorService = yy2Var.a;
        vy2Var = yy2Var.b;
        executorService.execute(vy2Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.w) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            d();
        } else if (i == 4) {
            throw ((Error) message.obj);
        } else {
            this.x.b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.s;
            if (this.p.zze()) {
                this.q.j(this.p, elapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                this.q.j(this.p, elapsedRealtime, j, false);
            } else if (i2 == 2) {
                this.q.k(this.p, elapsedRealtime, j);
            } else if (i2 != 3) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.t = iOException;
                int i3 = this.q.i(this.p, elapsedRealtime, j, iOException);
                if (i3 == 3) {
                    this.x.c = this.t;
                } else if (i3 != 2) {
                    int i4 = i3 != 1 ? 1 + this.u : 1;
                    this.u = i4;
                    c(Math.min((i4 - 1) * 1000, 5000));
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object xy2Var;
        Message obtainMessage;
        try {
            this.v = Thread.currentThread();
            if (!this.p.zze()) {
                String simpleName = this.p.getClass().getSimpleName();
                nz2.a("load:" + simpleName);
                try {
                    this.p.zzc();
                    nz2.b();
                } catch (Throwable th) {
                    nz2.b();
                    throw th;
                }
            }
            if (this.w) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.w) {
                return;
            }
            obtainMessage = obtainMessage(3, e);
            obtainMessage.sendToTarget();
        } catch (InterruptedException unused) {
            az2.e(this.p.zze());
            if (this.w) {
                return;
            }
            sendEmptyMessage(2);
        } catch (OutOfMemoryError e2) {
            if (this.w) {
                return;
            }
            xy2Var = new xy2(e2);
            obtainMessage = obtainMessage(3, xy2Var);
            obtainMessage.sendToTarget();
        } catch (Error e3) {
            if (!this.w) {
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.w) {
                return;
            }
            xy2Var = new xy2(e4);
            obtainMessage = obtainMessage(3, xy2Var);
            obtainMessage.sendToTarget();
        }
    }
}
