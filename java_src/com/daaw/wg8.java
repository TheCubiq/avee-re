package com.daaw;

import java.util.Iterator;
/* loaded from: classes2.dex */
public final class wg8 implements Iterator {

    /* renamed from: p */
    public final Iterator f31240p;

    /* renamed from: q */
    public final /* synthetic */ yg8 f31241q;

    public wg8(yg8 yg8Var) {
        ac8 ac8Var;
        this.f31241q = yg8Var;
        ac8Var = yg8Var.f33675p;
        this.f31240p = ac8Var.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31240p.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f31240p.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
