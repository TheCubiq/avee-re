package com.daaw;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class r57 extends q57 {

    /* renamed from: a */
    public final AtomicReferenceFieldUpdater f24868a;

    /* renamed from: b */
    public final AtomicIntegerFieldUpdater f24869b;

    public r57(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.f24868a = atomicReferenceFieldUpdater;
        this.f24869b = atomicIntegerFieldUpdater;
    }

    @Override // com.daaw.q57
    /* renamed from: a */
    public final int mo9517a(u57 u57Var) {
        return this.f24869b.decrementAndGet(u57Var);
    }

    @Override // com.daaw.q57
    /* renamed from: b */
    public final void mo9516b(u57 u57Var, @CheckForNull Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f24868a;
        while (!C1773j.m19216a(atomicReferenceFieldUpdater, u57Var, null, set2) && atomicReferenceFieldUpdater.get(u57Var) == null) {
        }
    }
}
