package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public enum k27 implements Iterator {
    INSTANCE;

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
        sy6.m9700i(false, "no calls to next() since the last call to remove()");
    }
}
