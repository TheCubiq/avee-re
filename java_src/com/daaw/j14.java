package com.daaw;

import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class j14 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ l14 f14175a;

    public j14(l14 l14Var) {
        this.f14175a = l14Var;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final void mo2151a(Object obj) {
        AtomicInteger atomicInteger;
        atomicInteger = this.f14175a.f16959b;
        atomicInteger.set(1);
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        AtomicInteger atomicInteger;
        atomicInteger = this.f14175a.f16959b;
        atomicInteger.set(-1);
    }
}
