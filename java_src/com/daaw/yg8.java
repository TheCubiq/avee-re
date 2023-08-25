package com.daaw;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class yg8 extends AbstractList implements RandomAccess, ac8 {
    public final ac8 p;

    public yg8(ac8 ac8Var) {
        this.p = ac8Var;
    }

    @Override // com.daaw.ac8
    public final void g(y68 y68Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((xb8) this.p).get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new wg8(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new ug8(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p.size();
    }

    @Override // com.daaw.ac8
    public final ac8 zze() {
        return this;
    }

    @Override // com.daaw.ac8
    public final Object zzf(int i) {
        return this.p.zzf(i);
    }

    @Override // com.daaw.ac8
    public final List zzh() {
        return this.p.zzh();
    }
}
