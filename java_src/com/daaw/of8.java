package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class of8 implements Iterator {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
