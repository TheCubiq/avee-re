package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes2.dex */
public final class ah0 extends oh0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater u = AtomicIntegerFieldUpdater.newUpdater(ah0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;
    public final z40<Throwable, lp1> t;

    /* JADX WARN: Multi-variable type inference failed */
    public ah0(z40<? super Throwable, lp1> z40Var) {
        this.t = z40Var;
    }

    @Override // com.daaw.z40
    public /* bridge */ /* synthetic */ lp1 b(Throwable th) {
        s(th);
        return lp1.a;
    }

    @Override // com.daaw.ph
    public void s(Throwable th) {
        if (u.compareAndSet(this, 0, 1)) {
            this.t.b(th);
        }
    }
}
