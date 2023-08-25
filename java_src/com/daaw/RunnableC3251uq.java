package com.daaw;

import com.daaw.AbstractC1233ey;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
/* renamed from: com.daaw.uq */
/* loaded from: classes2.dex */
public final class RunnableC3251uq extends AbstractC1233ey implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: v */
    public static final RunnableC3251uq f29423v;

    /* renamed from: w */
    public static final long f29424w;

    static {
        Long l;
        RunnableC3251uq runnableC3251uq = new RunnableC3251uq();
        f29423v = runnableC3251uq;
        AbstractC1150dy.m23820b0(runnableC3251uq, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f29424w = timeUnit.toNanos(l.longValue());
    }

    /* renamed from: A0 */
    public final synchronized boolean m7836A0() {
        if (m7828z0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: B0 */
    public final void m7835B0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // com.daaw.AbstractC1344fy
    /* renamed from: f0 */
    public Thread mo7834f0() {
        Thread thread = _thread;
        return thread == null ? m7830x0() : thread;
    }

    @Override // com.daaw.AbstractC1344fy
    /* renamed from: g0 */
    public void mo7833g0(long j, AbstractC1233ey.AbstractRunnableC1234a abstractRunnableC1234a) {
        m7835B0();
    }

    @Override // com.daaw.AbstractC1233ey
    /* renamed from: l0 */
    public void mo7832l0(Runnable runnable) {
        if (m7829y0()) {
            m7835B0();
        }
        super.mo7832l0(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m23030o0;
        cl1.f5936a.m25249c(this);
        C2803r.m11892a();
        try {
            if (!m7836A0()) {
                if (m23030o0) {
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long m23029p0 = m23029p0();
                if (m23029p0 == Long.MAX_VALUE) {
                    C2803r.m11892a();
                    long nanoTime = System.nanoTime();
                    if (j == Long.MAX_VALUE) {
                        j = f29424w + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        m7831w0();
                        C2803r.m11892a();
                        if (m23030o0()) {
                            return;
                        }
                        mo7834f0();
                        return;
                    }
                    m23029p0 = f31.m22945d(m23029p0, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (m23029p0 > 0) {
                    if (m7828z0()) {
                        _thread = null;
                        m7831w0();
                        C2803r.m11892a();
                        if (m23030o0()) {
                            return;
                        }
                        mo7834f0();
                        return;
                    }
                    C2803r.m11892a();
                    LockSupport.parkNanos(this, m23029p0);
                }
            }
        } finally {
            _thread = null;
            m7831w0();
            C2803r.m11892a();
            if (!m23030o0()) {
                mo7834f0();
            }
        }
    }

    @Override // com.daaw.AbstractC1233ey, com.daaw.AbstractC1150dy
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    /* renamed from: w0 */
    public final synchronized void m7831w0() {
        if (m7828z0()) {
            debugStatus = 3;
            m23027r0();
            notifyAll();
        }
    }

    /* renamed from: x0 */
    public final synchronized Thread m7830x0() {
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

    /* renamed from: y0 */
    public final boolean m7829y0() {
        return debugStatus == 4;
    }

    /* renamed from: z0 */
    public final boolean m7828z0() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }
}
