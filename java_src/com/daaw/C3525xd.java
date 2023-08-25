package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* renamed from: com.daaw.xd */
/* loaded from: classes2.dex */
public final class C3525xd extends C2292nh {

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f32575c = AtomicIntegerFieldUpdater.newUpdater(C3525xd.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    /* renamed from: c */
    public final boolean m5228c() {
        return f32575c.compareAndSet(this, 0, 1);
    }
}
