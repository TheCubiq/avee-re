package com.daaw;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.daaw.kj */
/* loaded from: classes2.dex */
public final class C1953kj<T> implements eb1<T> {

    /* renamed from: a */
    public final AtomicReference<eb1<T>> f16407a;

    public C1953kj(eb1<? extends T> eb1Var) {
        ug0.m8268f(eb1Var, "sequence");
        this.f16407a = new AtomicReference<>(eb1Var);
    }

    @Override // com.daaw.eb1
    public Iterator<T> iterator() {
        eb1<T> andSet = this.f16407a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
