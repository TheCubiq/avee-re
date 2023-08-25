package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes2.dex */
public final class xd extends nh {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(xd.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    public final boolean c() {
        return c.compareAndSet(this, 0, 1);
    }
}
