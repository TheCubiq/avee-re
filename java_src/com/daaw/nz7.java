package com.daaw;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class nz7 extends AbstractList {
    public static final oz7 r = oz7.b(nz7.class);
    public final List p;
    public final Iterator q;

    public nz7(List list, Iterator it) {
        this.p = list;
        this.q = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (this.p.size() > i) {
            return this.p.get(i);
        }
        if (this.q.hasNext()) {
            this.p.add(this.q.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new mz7(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        oz7 oz7Var = r;
        oz7Var.a("potentially expensive size() call");
        oz7Var.a("blowup running");
        while (this.q.hasNext()) {
            this.p.add(this.q.next());
        }
        return this.p.size();
    }
}
