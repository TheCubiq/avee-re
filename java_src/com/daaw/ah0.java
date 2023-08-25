package com.daaw;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes2.dex */
public final class ah0 extends oh0 {

    /* renamed from: u */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3192u = AtomicIntegerFieldUpdater.newUpdater(ah0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: t */
    public final z40<Throwable, lp1> f3193t;

    /* JADX WARN: Multi-variable type inference failed */
    public ah0(z40<? super Throwable, lp1> z40Var) {
        this.f3193t = z40Var;
    }

    @Override // com.daaw.z40
    /* renamed from: b */
    public /* bridge */ /* synthetic */ lp1 mo2829b(Throwable th) {
        mo8198s(th);
        return lp1.f17593a;
    }

    @Override // com.daaw.AbstractC2552ph
    /* renamed from: s */
    public void mo8198s(Throwable th) {
        if (f3192u.compareAndSet(this, 0, 1)) {
            this.f3193t.mo2829b(th);
        }
    }
}
