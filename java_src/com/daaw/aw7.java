package com.daaw;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class aw7 implements Iterator {
    public final Iterator p;
    public final /* synthetic */ bw7 q;

    public aw7(bw7 bw7Var) {
        ct7 ct7Var;
        this.q = bw7Var;
        ct7Var = bw7Var.p;
        this.p = ct7Var.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.p.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
