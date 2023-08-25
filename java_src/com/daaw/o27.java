package com.daaw;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class o27 extends AbstractSequentialList implements Serializable {
    public final List p;
    public final ey6 q;

    public o27(List list, ey6 ey6Var) {
        this.p = list;
        this.q = ey6Var;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.p.clear();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new n27(this, this.p.listIterator(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p.size();
    }
}
