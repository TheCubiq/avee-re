package com.daaw;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class fz7 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ long f10115p;

    /* renamed from: q */
    public final /* synthetic */ p28 f10116q;

    public fz7(p28 p28Var, long j) {
        this.f10116q = p28Var;
        this.f10115p = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10116q.m13678z(this.f10115p, true);
        this.f10116q.f25143a.m24047L().m5465S(new AtomicReference());
    }
}
