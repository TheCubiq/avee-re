package com.daaw;

import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class a47 implements Iterator {
    public final Iterator p;

    public a47(Iterator it) {
        Objects.requireNonNull(it);
        this.p = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.p.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.p.remove();
    }
}
