package com.daaw;

import com.daaw.ey;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes2.dex */
public final class uq extends ey implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final uq v;
    public static final long w;

    static {
        Long l;
        uq uqVar = new uq();
        v = uqVar;
        dy.b0(uqVar, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        w = timeUnit.toNanos(l.longValue());
    }

    public final synchronized boolean A0() {
        if (z0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    public final void B0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // com.daaw.fy
    public Thread f0() {
        Thread thread = _thread;
        return thread == null ? x0() : thread;
    }

    @Override // com.daaw.fy
    public void g0(long j, ey.a aVar) {
        B0();
    }

    @Override // com.daaw.ey
    public void l0(Runnable runnable) {
        if (y0()) {
            B0();
        }
        super.l0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean o0;
        cl1.a.c(this);
        r.a();
        try {
            if (!A0()) {
                if (o0) {
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long p0 = p0();
                if (p0 == Long.MAX_VALUE) {
                    r.a();
                    long nanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = w + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        w0();
                        r.a();
                        if (o0()) {
                            return;
                        }
                        f0();
                        return;
                    }
                    p0 = f31.d(p0, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (p0 > 0) {
                    if (z0()) {
                        _thread = null;
                        w0();
                        r.a();
                        if (o0()) {
                            return;
                        }
                        f0();
                        return;
                    }
                    r.a();
                    LockSupport.parkNanos(this, p0);
                }
            }
        } finally {
            _thread = null;
            w0();
            r.a();
            if (!o0()) {
                f0();
            }
        }
    }

    @Override // com.daaw.ey, com.daaw.dy
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void w0() {
        if (z0()) {
            debugStatus = 3;
            r0();
            notifyAll();
        }
    }

    public final synchronized Thread x0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean y0() {
        return debugStatus == 4;
    }

    public final boolean z0() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }
}
