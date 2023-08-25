package com.daaw;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class jk0 implements lk0 {
    public final ExecutorService a;
    public b<? extends c> b;
    public IOException c;

    /* loaded from: classes.dex */
    public interface a<T extends c> {
        void k(T t, long j, long j2, boolean z);

        void o(T t, long j, long j2);

        int r(T t, long j, long j2, IOException iOException);
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public final class b<T extends c> extends Handler implements Runnable {
        public final int p;
        public final T q;
        public final long r;
        public a<T> s;
        public IOException t;
        public int u;
        public volatile Thread v;
        public volatile boolean w;
        public volatile boolean x;

        public b(Looper looper, T t, a<T> aVar, int i, long j) {
            super(looper);
            this.q = t;
            this.s = aVar;
            this.p = i;
            this.r = j;
        }

        public void a(boolean z) {
            this.x = z;
            this.t = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.w = true;
                this.q.b();
                if (this.v != null) {
                    this.v.interrupt();
                }
            }
            if (z) {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.s.k(this.q, elapsedRealtime, elapsedRealtime - this.r, true);
                this.s = null;
            }
        }

        public final void b() {
            this.t = null;
            jk0.this.a.execute(jk0.this.b);
        }

        public final void c() {
            jk0.this.b = null;
        }

        public final long d() {
            return Math.min((this.u - 1) * 1000, 5000);
        }

        public void e(int i) {
            IOException iOException = this.t;
            if (iOException != null && this.u > i) {
                throw iOException;
            }
        }

        public void f(long j) {
            s6.f(jk0.this.b == null);
            jk0.this.b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.x) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                b();
            } else if (i == 4) {
                throw ((Error) message.obj);
            } else {
                c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.r;
                if (this.w) {
                    this.s.k(this.q, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    this.s.k(this.q, elapsedRealtime, j, false);
                } else if (i2 == 2) {
                    try {
                        this.s.o(this.q, elapsedRealtime, j);
                    } catch (RuntimeException e) {
                        jk0.this.c = new f(e);
                    }
                } else if (i2 != 3) {
                } else {
                    IOException iOException = (IOException) message.obj;
                    this.t = iOException;
                    int r = this.s.r(this.q, elapsedRealtime, j, iOException);
                    if (r == 3) {
                        jk0.this.c = this.t;
                    } else if (r != 2) {
                        this.u = r != 1 ? 1 + this.u : 1;
                        f(d());
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar;
            Message obtainMessage;
            try {
                this.v = Thread.currentThread();
                if (!this.w) {
                    mm1.a("load:" + this.q.getClass().getSimpleName());
                    try {
                        this.q.a();
                        mm1.c();
                    } catch (Throwable th) {
                        mm1.c();
                        throw th;
                    }
                }
                if (this.x) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.x) {
                    return;
                }
                obtainMessage = obtainMessage(3, e);
                obtainMessage.sendToTarget();
            } catch (InterruptedException unused) {
                s6.f(this.w);
                if (this.x) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (Exception e2) {
                if (this.x) {
                    return;
                }
                fVar = new f(e2);
                obtainMessage = obtainMessage(3, fVar);
                obtainMessage.sendToTarget();
            } catch (OutOfMemoryError e3) {
                if (this.x) {
                    return;
                }
                fVar = new f(e3);
                obtainMessage = obtainMessage(3, fVar);
                obtainMessage.sendToTarget();
            } catch (Error e4) {
                if (!this.x) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface d {
        void h();
    }

    /* loaded from: classes.dex */
    public static final class e implements Runnable {
        public final d p;

        public e(d dVar) {
            this.p = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.p.h();
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends IOException {
        public f(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public jk0(String str) {
        this.a = sq1.L(str);
    }

    @Override // com.daaw.lk0
    public void a() {
        h(Integer.MIN_VALUE);
    }

    public void f() {
        this.b.a(false);
    }

    public boolean g() {
        return this.b != null;
    }

    public void h(int i) {
        IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        b<? extends c> bVar = this.b;
        if (bVar != null) {
            if (i == Integer.MIN_VALUE) {
                i = bVar.p;
            }
            bVar.e(i);
        }
    }

    public void i() {
        j(null);
    }

    public void j(d dVar) {
        b<? extends c> bVar = this.b;
        if (bVar != null) {
            bVar.a(true);
        }
        if (dVar != null) {
            this.a.execute(new e(dVar));
        }
        this.a.shutdown();
    }

    public <T extends c> long k(T t, a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        s6.f(myLooper != null);
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new b(myLooper, t, aVar, i, elapsedRealtime).f(0L);
        return elapsedRealtime;
    }
}
