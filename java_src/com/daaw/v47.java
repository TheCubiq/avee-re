package com.daaw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class v47 extends r47 {

    /* renamed from: a */
    public final AtomicReferenceFieldUpdater<b57, Thread> f29864a;

    /* renamed from: b */
    public final AtomicReferenceFieldUpdater<b57, b57> f29865b;

    /* renamed from: c */
    public final AtomicReferenceFieldUpdater<c57, b57> f29866c;

    /* renamed from: d */
    public final AtomicReferenceFieldUpdater<c57, u47> f29867d;

    /* renamed from: e */
    public final AtomicReferenceFieldUpdater<c57, Object> f29868e;

    public v47(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f29864a = atomicReferenceFieldUpdater;
        this.f29865b = atomicReferenceFieldUpdater2;
        this.f29866c = atomicReferenceFieldUpdater3;
        this.f29867d = atomicReferenceFieldUpdater4;
        this.f29868e = atomicReferenceFieldUpdater5;
    }

    @Override // com.daaw.r47
    /* renamed from: a */
    public final u47 mo5533a(c57 c57Var, u47 u47Var) {
        return this.f29867d.getAndSet(c57Var, u47Var);
    }

    @Override // com.daaw.r47
    /* renamed from: b */
    public final b57 mo5532b(c57 c57Var, b57 b57Var) {
        return this.f29866c.getAndSet(c57Var, b57Var);
    }

    @Override // com.daaw.r47
    /* renamed from: c */
    public final void mo5531c(b57 b57Var, @CheckForNull b57 b57Var2) {
        this.f29865b.lazySet(b57Var, b57Var2);
    }

    @Override // com.daaw.r47
    /* renamed from: d */
    public final void mo5530d(b57 b57Var, Thread thread) {
        this.f29864a.lazySet(b57Var, thread);
    }

    @Override // com.daaw.r47
    /* renamed from: e */
    public final boolean mo5529e(c57 c57Var, @CheckForNull u47 u47Var, u47 u47Var2) {
        return d57.m24639a(this.f29867d, c57Var, u47Var, u47Var2);
    }

    @Override // com.daaw.r47
    /* renamed from: f */
    public final boolean mo5528f(c57 c57Var, @CheckForNull Object obj, Object obj2) {
        return d57.m24639a(this.f29868e, c57Var, obj, obj2);
    }

    @Override // com.daaw.r47
    /* renamed from: g */
    public final boolean mo5527g(c57 c57Var, @CheckForNull b57 b57Var, @CheckForNull b57 b57Var2) {
        return d57.m24639a(this.f29866c, c57Var, b57Var, b57Var2);
    }
}
