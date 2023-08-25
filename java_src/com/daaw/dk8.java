package com.daaw;

import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public abstract class dk8 extends bd2 {
    public final int p;
    public int q;

    public dk8(int i, int i2) {
        jf8.b(i2, i, "index");
        this.p = i;
        this.q = i2;
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.q < this.p;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.q > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.q;
            this.q = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.q;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.q - 1;
            this.q = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.q - 1;
    }
}
