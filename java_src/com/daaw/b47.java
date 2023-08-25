package com.daaw;

import java.util.ListIterator;
/* loaded from: classes.dex */
public abstract class b47 extends a47 implements ListIterator {
    public b47(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f2884p).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f2884p).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo12795a(((ListIterator) this.f2884p).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f2884p).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
