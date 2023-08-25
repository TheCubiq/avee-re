package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes2.dex */
public class nh {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(nh.class, "_handled");
    private volatile /* synthetic */ int _handled;
    public final Throwable a;

    public nh(Throwable th, boolean z) {
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    public /* synthetic */ nh(Throwable th, boolean z, int i, pq pqVar) {
        this(th, (i & 2) != 0 ? false : z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return aq.a(this) + '[' + this.a + ']';
    }
}
