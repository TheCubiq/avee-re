package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes2.dex */
public final class du<T> extends h91<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater s = AtomicIntegerFieldUpdater.newUpdater(du.class, "_decision");
    private volatile /* synthetic */ int _decision;

    @Override // com.daaw.h91, com.daaw.uh0
    public void h(Object obj) {
        i0(obj);
    }

    @Override // com.daaw.h91, com.daaw.f
    public void i0(Object obj) {
        if (l0()) {
            return;
        }
        cu.c(vg0.a(this.r), rh.a(obj, this.r), null, 2, null);
    }

    public final boolean l0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!s.compareAndSet(this, 0, 2));
        return true;
    }
}
