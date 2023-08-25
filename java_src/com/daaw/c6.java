package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class c6<T> implements Iterator<T> {
    public final T[] p;
    public int q;

    public c6(T[] tArr) {
        ug0.f(tArr, "array");
        this.p = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.q < this.p.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.p;
            int i = this.q;
            this.q = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.q--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
