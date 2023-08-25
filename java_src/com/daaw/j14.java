package com.daaw;

import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class j14 implements o67 {
    public final /* synthetic */ l14 a;

    public j14(l14 l14Var) {
        this.a = l14Var;
    }

    @Override // com.daaw.o67
    public final void a(Object obj) {
        AtomicInteger atomicInteger;
        atomicInteger = this.a.b;
        atomicInteger.set(1);
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        AtomicInteger atomicInteger;
        atomicInteger = this.a.b;
        atomicInteger.set(-1);
    }
}
