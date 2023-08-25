package com.daaw;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class f72<T> implements c82<T> {

    /* renamed from: a */
    public final CountDownLatch f9211a = new CountDownLatch(1);

    public /* synthetic */ f72(i62 i62Var) {
    }

    /* renamed from: a */
    public final void m22877a() {
        this.f9211a.await();
    }

    @Override // com.daaw.zt0
    /* renamed from: b */
    public final void mo1920b() {
        this.f9211a.countDown();
    }

    @Override // com.daaw.gu0
    /* renamed from: c */
    public final void mo5820c(Exception exc) {
        this.f9211a.countDown();
    }

    /* renamed from: d */
    public final boolean m22876d(long j, TimeUnit timeUnit) {
        return this.f9211a.await(j, timeUnit);
    }

    @Override // com.daaw.ku0
    public final void onSuccess(T t) {
        this.f9211a.countDown();
    }
}
