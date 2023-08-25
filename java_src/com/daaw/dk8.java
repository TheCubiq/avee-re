package com.daaw;

import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public abstract class dk8 extends bd2 {

    /* renamed from: p */
    public final int f7219p;

    /* renamed from: q */
    public int f7220q;

    public dk8(int i, int i2) {
        jf8.m18535b(i2, i, "index");
        this.f7219p = i;
        this.f7220q = i2;
    }

    /* renamed from: a */
    public abstract Object mo22357a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7220q < this.f7219p;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7220q > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f7220q;
            this.f7220q = i + 1;
            return mo22357a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7220q;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f7220q - 1;
            this.f7220q = i;
            return mo22357a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7220q - 1;
    }
}
