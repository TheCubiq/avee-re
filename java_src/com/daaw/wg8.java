package com.daaw;

import java.util.Iterator;
/* loaded from: classes2.dex */
public final class wg8 implements Iterator {
    public final Iterator p;
    public final /* synthetic */ yg8 q;

    public wg8(yg8 yg8Var) {
        ac8 ac8Var;
        this.q = yg8Var;
        ac8Var = yg8Var.p;
        this.p = ac8Var.iterator();
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
