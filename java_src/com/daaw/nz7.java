package com.daaw;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class nz7 extends AbstractList {

    /* renamed from: r */
    public static final oz7 f20868r = oz7.m13793b(nz7.class);

    /* renamed from: p */
    public final List f20869p;

    /* renamed from: q */
    public final Iterator f20870q;

    public nz7(List list, Iterator it) {
        this.f20869p = list;
        this.f20870q = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (this.f20869p.size() > i) {
            return this.f20869p.get(i);
        }
        if (this.f20870q.hasNext()) {
            this.f20869p.add(this.f20870q.next());
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
        oz7 oz7Var = f20868r;
        oz7Var.mo13794a("potentially expensive size() call");
        oz7Var.mo13794a("blowup running");
        while (this.f20870q.hasNext()) {
            this.f20869p.add(this.f20870q.next());
        }
        return this.f20869p.size();
    }
}
