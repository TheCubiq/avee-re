package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class g62 implements Iterator {
    public final /* synthetic */ Iterator p;
    public final /* synthetic */ Iterator q;

    public g62(z72 z72Var, Iterator it, Iterator it2) {
        this.p = it;
        this.q = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.p.hasNext()) {
            return true;
        }
        return this.q.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.p.hasNext()) {
            return new wp2(((Integer) this.p.next()).toString());
        }
        if (this.q.hasNext()) {
            return new wp2((String) this.q.next());
        }
        throw new NoSuchElementException();
    }
}
