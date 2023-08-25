package com.daaw;

import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class a47 implements Iterator {

    /* renamed from: p */
    public final Iterator f2884p;

    public a47(Iterator it) {
        Objects.requireNonNull(it);
        this.f2884p = it;
    }

    /* renamed from: a */
    public abstract Object mo12795a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2884p.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo12795a(this.f2884p.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f2884p.remove();
    }
}
