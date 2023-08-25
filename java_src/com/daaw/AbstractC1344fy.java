package com.daaw;

import com.daaw.AbstractC1233ey;
import java.util.concurrent.locks.LockSupport;
/* renamed from: com.daaw.fy */
/* loaded from: classes2.dex */
public abstract class AbstractC1344fy extends AbstractC1150dy {
    /* renamed from: f0 */
    public abstract Thread mo7834f0();

    /* renamed from: g0 */
    public void mo7833g0(long j, AbstractC1233ey.AbstractRunnableC1234a abstractRunnableC1234a) {
        RunnableC3251uq.f29423v.m23026s0(j, abstractRunnableC1234a);
    }

    /* renamed from: h0 */
    public final void m22138h0() {
        Thread mo7834f0 = mo7834f0();
        if (Thread.currentThread() != mo7834f0) {
            C2803r.m11892a();
            LockSupport.unpark(mo7834f0);
        }
    }
}
