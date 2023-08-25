package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class v47 extends r47 {
    public final AtomicReferenceFieldUpdater<b57, Thread> a;
    public final AtomicReferenceFieldUpdater<b57, b57> b;
    public final AtomicReferenceFieldUpdater<c57, b57> c;
    public final AtomicReferenceFieldUpdater<c57, u47> d;
    public final AtomicReferenceFieldUpdater<c57, Object> e;

    public v47(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }

    @Override // com.daaw.r47
    public final u47 a(c57 c57Var, u47 u47Var) {
        return this.d.getAndSet(c57Var, u47Var);
    }

    @Override // com.daaw.r47
    public final b57 b(c57 c57Var, b57 b57Var) {
        return this.c.getAndSet(c57Var, b57Var);
    }

    @Override // com.daaw.r47
    public final void c(b57 b57Var, @CheckForNull b57 b57Var2) {
        this.b.lazySet(b57Var, b57Var2);
    }

    @Override // com.daaw.r47
    public final void d(b57 b57Var, Thread thread) {
        this.a.lazySet(b57Var, thread);
    }

    @Override // com.daaw.r47
    public final boolean e(c57 c57Var, @CheckForNull u47 u47Var, u47 u47Var2) {
        return d57.a(this.d, c57Var, u47Var, u47Var2);
    }

    @Override // com.daaw.r47
    public final boolean f(c57 c57Var, @CheckForNull Object obj, Object obj2) {
        return d57.a(this.e, c57Var, obj, obj2);
    }

    @Override // com.daaw.r47
    public final boolean g(c57 c57Var, @CheckForNull b57 b57Var, @CheckForNull b57 b57Var2) {
        return d57.a(this.c, c57Var, b57Var, b57Var2);
    }
}
