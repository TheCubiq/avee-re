package com.daaw;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class mz7 implements Iterator {
    public int p = 0;
    public final /* synthetic */ nz7 q;

    public mz7(nz7 nz7Var) {
        this.q = nz7Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p < this.q.p.size() || this.q.q.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.p >= this.q.p.size()) {
            nz7 nz7Var = this.q;
            nz7Var.p.add(nz7Var.q.next());
            return next();
        }
        List list = this.q.p;
        int i = this.p;
        this.p = i + 1;
        return list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
