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

    /* renamed from: p */
    public final wy2 f30707p;

    /* renamed from: q */
    public final uy2 f30708q;

    /* renamed from: r */
    public final int f30709r;

    /* renamed from: s */
    public final long f30710s;

    /* renamed from: t */
    public IOException f30711t;

    /* renamed from: u */
    public int f30712u;

    /* renamed from: v */
    public volatile Thread f30713v;

    /* renamed from: w */
    public volatile boolean f30714w;

    /* renamed from: x */
    public final /* synthetic */ yy2 f30715x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy2(yy2 yy2Var, Looper looper, wy2 wy2Var, uy2 uy2Var, int i, long j) {
        super(looper);
        this.f30715x = yy2Var;
        this.f30707p = wy2Var;
        this.f30708q = uy2Var;
        this.f30709r = i;
        this.f30710s = j;
    }

    /* renamed from: a */
    public final void m6667a(boolean z) {
        this.f30714w = z;
        this.f30711t = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.f30707p.zzb();
            if (this.f30713v != null) {
                this.f30713v.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.f30715x.f34256b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f30708q.mo7646j(this.f30707p, elapsedRealtime, elapsedRealtime - this.f30710s, true);
    }

    /* renamed from: b */
    public final void m6666b(int i) {
        IOException iOException = this.f30711t;
        if (iOException != null && this.f30712u > i) {
            throw iOException;
        }
    }

    /* renamed from: c */
    public final void m6665c(long j) {
        vy2 vy2Var;
        vy2Var = this.f30715x.f34256b;
        az2.m26583e(vy2Var == null);
        this.f30715x.f34256b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            m6664d();
        }
    }

    /* renamed from: d */
    public final void m6664d() {
        ExecutorService executorService;
        vy2 vy2Var;
        this.f30711t = null;
        yy2 yy2Var = this.f30715x;
        executorService = yy2Var.f34255a;
        vy2Var = yy2Var.f34256b;
        executorService.execute(vy2Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f30714w) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            m6664d();
        } else if (i == 4) {
            throw ((Error) message.obj);
        } else {
            this.f30715x.f34256b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f30710s;
            if (this.f30707p.zze()) {
                this.f30708q.mo7646j(this.f30707p, elapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                this.f30708q.mo7646j(this.f30707p, elapsedRealtime, j, false);
            } else if (i2 == 2) {
                this.f30708q.mo7645k(this.f30707p, elapsedRealtime, j);
            } else if (i2 != 3) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.f30711t = iOException;
                int mo7647i = this.f30708q.mo7647i(this.f30707p, elapsedRealtime, j, iOException);
                if (mo7647i == 3) {
                    this.f30715x.f34257c = this.f30711t;
                } else if (mo7647i != 2) {
                    int i3 = mo7647i != 1 ? 1 + this.f30712u : 1;
                    this.f30712u = i3;
                    m6665c(Math.min((i3 - 1) * 1000, 5000));
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object xy2Var;
        Message obtainMessage;
        try {
            this.f30713v = Thread.currentThread();
            if (!this.f30707p.zze()) {
                String simpleName = this.f30707p.getClass().getSimpleName();
                nz2.m14710a("load:" + simpleName);
                try {
                    this.f30707p.zzc();
                    nz2.m14709b();
                } catch (Throwable th) {
                    nz2.m14709b();
                    throw th;
                }
            }
            if (this.f30714w) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.f30714w) {
                return;
            }
            obtainMessage = obtainMessage(3, e);
            obtainMessage.sendToTarget();
        } catch (InterruptedException unused) {
            az2.m26583e(this.f30707p.zze());
            if (this.f30714w) {
                return;
            }
            sendEmptyMessage(2);
        } catch (OutOfMemoryError e2) {
            if (this.f30714w) {
                return;
            }
            xy2Var = new xy2(e2);
            obtainMessage = obtainMessage(3, xy2Var);
            obtainMessage.sendToTarget();
        } catch (Error e3) {
            if (!this.f30714w) {
                obtainMessage(4, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.f30714w) {
                return;
            }
            xy2Var = new xy2(e4);
            obtainMessage = obtainMessage(3, xy2Var);
            obtainMessage.sendToTarget();
        }
    }
}
