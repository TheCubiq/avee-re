package com.daaw;

import java.util.ListIterator;
/* loaded from: classes2.dex */
public final class ug8 implements ListIterator {

    /* renamed from: p */
    public final ListIterator f29056p;

    /* renamed from: q */
    public final /* synthetic */ int f29057q;

    /* renamed from: r */
    public final /* synthetic */ yg8 f29058r;

    public ug8(yg8 yg8Var, int i) {
        ac8 ac8Var;
        this.f29058r = yg8Var;
        this.f29057q = i;
        ac8Var = yg8Var.f33675p;
        this.f29056p = ac8Var.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f29056p.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f29056p.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f29056p.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f29056p.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f29056p.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f29056p.previousIndex();
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
