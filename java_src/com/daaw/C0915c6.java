package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: com.daaw.c6 */
/* loaded from: classes2.dex */
public final class C0915c6<T> implements Iterator<T> {

    /* renamed from: p */
    public final T[] f5516p;

    /* renamed from: q */
    public int f5517q;

    public C0915c6(T[] tArr) {
        ug0.m8268f(tArr, "array");
        this.f5516p = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5517q < this.f5516p.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f5516p;
            int i = this.f5517q;
            this.f5517q = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f5517q--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
