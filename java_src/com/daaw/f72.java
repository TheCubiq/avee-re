package com.daaw;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class f72<T> implements c82<T> {
    public final CountDownLatch a = new CountDownLatch(1);

    public /* synthetic */ f72(i62 i62Var) {
    }

    public final void a() {
        this.a.await();
    }

    @Override // com.daaw.zt0
    public final void b() {
        this.a.countDown();
    }

    @Override // com.daaw.gu0
    public final void c(Exception exc) {
        this.a.countDown();
    }

    public final boolean d(long j, TimeUnit timeUnit) {
        return this.a.await(j, timeUnit);
    }

    @Override // com.daaw.ku0
    public final void onSuccess(T t) {
        this.a.countDown();
    }
}
