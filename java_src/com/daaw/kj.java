package com.daaw;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class kj<T> implements eb1<T> {
    public final AtomicReference<eb1<T>> a;

    public kj(eb1<? extends T> eb1Var) {
        ug0.f(eb1Var, "sequence");
        this.a = new AtomicReference<>(eb1Var);
    }

    @Override // com.daaw.eb1
    public Iterator<T> iterator() {
        eb1<T> andSet = this.a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
