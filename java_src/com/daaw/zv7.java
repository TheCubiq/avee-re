package com.daaw;

import java.util.ListIterator;
/* loaded from: classes.dex */
public final class zv7 implements ListIterator {
    public final ListIterator p;
    public final /* synthetic */ int q;
    public final /* synthetic */ bw7 r;

    public zv7(bw7 bw7Var, int i) {
        ct7 ct7Var;
        this.r = bw7Var;
        this.q = i;
        ct7Var = bw7Var.p;
        this.p = ct7Var.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.p.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.p.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.p.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.p.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.p.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.p.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
