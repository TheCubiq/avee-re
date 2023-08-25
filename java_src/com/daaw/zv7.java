package com.daaw;

import java.util.ListIterator;
/* loaded from: classes.dex */
public final class zv7 implements ListIterator {

    /* renamed from: p */
    public final ListIterator f35599p;

    /* renamed from: q */
    public final /* synthetic */ int f35600q;

    /* renamed from: r */
    public final /* synthetic */ bw7 f35601r;

    public zv7(bw7 bw7Var, int i) {
        ct7 ct7Var;
        this.f35601r = bw7Var;
        this.f35600q = i;
        ct7Var = bw7Var.f5236p;
        this.f35599p = ct7Var.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f35599p.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f35599p.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f35599p.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f35599p.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f35599p.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f35599p.previousIndex();
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
