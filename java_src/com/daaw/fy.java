package com.daaw;

import com.daaw.ey;
import java.util.concurrent.locks.LockSupport;
/* loaded from: classes2.dex */
public abstract class fy extends dy {
    public abstract Thread f0();

    public void g0(long j, ey.a aVar) {
        uq.v.s0(j, aVar);
    }

    public final void h0() {
        Thread f0 = f0();
        if (Thread.currentThread() != f0) {
            r.a();
            LockSupport.unpark(f0);
        }
    }
}
