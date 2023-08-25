package com.daaw;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class r57 extends q57 {
    public final AtomicReferenceFieldUpdater a;
    public final AtomicIntegerFieldUpdater b;

    public r57(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicIntegerFieldUpdater;
    }

    @Override // com.daaw.q57
    public final int a(u57 u57Var) {
        return this.b.decrementAndGet(u57Var);
    }

    @Override // com.daaw.q57
    public final void b(u57 u57Var, @CheckForNull Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.a;
        while (!j.a(atomicReferenceFieldUpdater, u57Var, null, set2) && atomicReferenceFieldUpdater.get(u57Var) == null) {
        }
    }
}
