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

    /* renamed from: a */
    public final ExecutorService f15145a;

    /* renamed from: b */
    public HandlerC1835b<? extends InterfaceC1836c> f15146b;

    /* renamed from: c */
    public IOException f15147c;

    /* renamed from: com.daaw.jk0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1834a<T extends InterfaceC1836c> {
        /* renamed from: k */
        void mo11472k(T t, long j, long j2, boolean z);

        /* renamed from: o */
        void mo11469o(T t, long j, long j2);

        /* renamed from: r */
        int mo11468r(T t, long j, long j2, IOException iOException);
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.daaw.jk0$b */
    /* loaded from: classes.dex */
    public final class HandlerC1835b<T extends InterfaceC1836c> extends Handler implements Runnable {

        /* renamed from: p */
        public final int f15148p;

        /* renamed from: q */
        public final T f15149q;

        /* renamed from: r */
        public final long f15150r;

        /* renamed from: s */
        public InterfaceC1834a<T> f15151s;

        /* renamed from: t */
        public IOException f15152t;

        /* renamed from: u */
        public int f15153u;

        /* renamed from: v */
        public volatile Thread f15154v;

        /* renamed from: w */
        public volatile boolean f15155w;

        /* renamed from: x */
        public volatile boolean f15156x;

        public HandlerC1835b(Looper looper, T t, InterfaceC1834a<T> interfaceC1834a, int i, long j) {
            super(looper);
            this.f15149q = t;
            this.f15151s = interfaceC1834a;
            this.f15148p = i;
            this.f15150r = j;
        }

        /* renamed from: a */
        public void m18460a(boolean z) {
            this.f15156x = z;
            this.f15152t = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f15155w = true;
                this.f15149q.mo6739b();
                if (this.f15154v != null) {
                    this.f15154v.interrupt();
                }
            }
            if (z) {
                m18458c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f15151s.mo11472k(this.f15149q, elapsedRealtime, elapsedRealtime - this.f15150r, true);
                this.f15151s = null;
            }
        }

        /* renamed from: b */
        public final void m18459b() {
            this.f15152t = null;
            jk0.this.f15145a.execute(jk0.this.f15146b);
        }

        /* renamed from: c */
        public final void m18458c() {
            jk0.this.f15146b = null;
        }

        /* renamed from: d */
        public final long m18457d() {
            return Math.min((this.f15153u - 1) * 1000, 5000);
        }

        /* renamed from: e */
        public void m18456e(int i) {
            IOException iOException = this.f15152t;
            if (iOException != null && this.f15153u > i) {
                throw iOException;
            }
        }

        /* renamed from: f */
        public void m18455f(long j) {
            C2914s6.m10685f(jk0.this.f15146b == null);
            jk0.this.f15146b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                m18459b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f15156x) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                m18459b();
            } else if (i == 4) {
                throw ((Error) message.obj);
            } else {
                m18458c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.f15150r;
                if (this.f15155w) {
                    this.f15151s.mo11472k(this.f15149q, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    this.f15151s.mo11472k(this.f15149q, elapsedRealtime, j, false);
                } else if (i2 == 2) {
                    try {
                        this.f15151s.mo11469o(this.f15149q, elapsedRealtime, j);
                    } catch (RuntimeException e) {
                        jk0.this.f15147c = new C1839f(e);
                    }
                } else if (i2 != 3) {
                } else {
                    IOException iOException = (IOException) message.obj;
                    this.f15152t = iOException;
                    int mo11468r = this.f15151s.mo11468r(this.f15149q, elapsedRealtime, j, iOException);
                    if (mo11468r == 3) {
                        jk0.this.f15147c = this.f15152t;
                    } else if (mo11468r != 2) {
                        this.f15153u = mo11468r != 1 ? 1 + this.f15153u : 1;
                        m18455f(m18457d());
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            C1839f c1839f;
            Message obtainMessage;
            try {
                this.f15154v = Thread.currentThread();
                if (!this.f15155w) {
                    mm1.m15937a("load:" + this.f15149q.getClass().getSimpleName());
                    try {
                        this.f15149q.mo6740a();
                        mm1.m15935c();
                    } catch (Throwable th) {
                        mm1.m15935c();
                        throw th;
                    }
                }
                if (this.f15156x) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e) {
                if (this.f15156x) {
                    return;
                }
                obtainMessage = obtainMessage(3, e);
                obtainMessage.sendToTarget();
            } catch (InterruptedException unused) {
                C2914s6.m10685f(this.f15155w);
                if (this.f15156x) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (Exception e2) {
                if (this.f15156x) {
                    return;
                }
                c1839f = new C1839f(e2);
                obtainMessage = obtainMessage(3, c1839f);
                obtainMessage.sendToTarget();
            } catch (OutOfMemoryError e3) {
                if (this.f15156x) {
                    return;
                }
                c1839f = new C1839f(e3);
                obtainMessage = obtainMessage(3, c1839f);
                obtainMessage.sendToTarget();
            } catch (Error e4) {
                if (!this.f15156x) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            }
        }
    }

    /* renamed from: com.daaw.jk0$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1836c {
        /* renamed from: a */
        void mo6740a();

        /* renamed from: b */
        void mo6739b();
    }

    /* renamed from: com.daaw.jk0$d */
    /* loaded from: classes.dex */
    public interface InterfaceC1837d {
        /* renamed from: h */
        void mo11474h();
    }

    /* renamed from: com.daaw.jk0$e */
    /* loaded from: classes.dex */
    public static final class RunnableC1838e implements Runnable {

        /* renamed from: p */
        public final InterfaceC1837d f15158p;

        public RunnableC1838e(InterfaceC1837d interfaceC1837d) {
            this.f15158p = interfaceC1837d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15158p.mo11474h();
        }
    }

    /* renamed from: com.daaw.jk0$f */
    /* loaded from: classes.dex */
    public static final class C1839f extends IOException {
        public C1839f(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public jk0(String str) {
        this.f15145a = sq1.m10033L(str);
    }

    @Override // com.daaw.lk0
    /* renamed from: a */
    public void mo16893a() {
        m18464h(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public void m18466f() {
        this.f15146b.m18460a(false);
    }

    /* renamed from: g */
    public boolean m18465g() {
        return this.f15146b != null;
    }

    /* renamed from: h */
    public void m18464h(int i) {
        IOException iOException = this.f15147c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC1835b<? extends InterfaceC1836c> handlerC1835b = this.f15146b;
        if (handlerC1835b != null) {
            if (i == Integer.MIN_VALUE) {
                i = handlerC1835b.f15148p;
            }
            handlerC1835b.m18456e(i);
        }
    }

    /* renamed from: i */
    public void m18463i() {
        m18462j(null);
    }

    /* renamed from: j */
    public void m18462j(InterfaceC1837d interfaceC1837d) {
        HandlerC1835b<? extends InterfaceC1836c> handlerC1835b = this.f15146b;
        if (handlerC1835b != null) {
            handlerC1835b.m18460a(true);
        }
        if (interfaceC1837d != null) {
            this.f15145a.execute(new RunnableC1838e(interfaceC1837d));
        }
        this.f15145a.shutdown();
    }

    /* renamed from: k */
    public <T extends InterfaceC1836c> long m18461k(T t, InterfaceC1834a<T> interfaceC1834a, int i) {
        Looper myLooper = Looper.myLooper();
        C2914s6.m10685f(myLooper != null);
        this.f15147c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC1835b(myLooper, t, interfaceC1834a, i, elapsedRealtime).m18455f(0L);
        return elapsedRealtime;
    }
}
