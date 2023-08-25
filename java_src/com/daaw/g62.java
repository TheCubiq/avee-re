package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class g62 implements Iterator {

    /* renamed from: p */
    public final /* synthetic */ Iterator f10303p;

    /* renamed from: q */
    public final /* synthetic */ Iterator f10304q;

    public g62(z72 z72Var, Iterator it, Iterator it2) {
        this.f10303p = it;
        this.f10304q = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f10303p.hasNext()) {
            return true;
        }
        return this.f10304q.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f10303p.hasNext()) {
            return new wp2(((Integer) this.f10303p.next()).toString());
        }
        if (this.f10304q.hasNext()) {
            return new wp2((String) this.f10304q.next());
        }
        throw new NoSuchElementException();
    }
}
