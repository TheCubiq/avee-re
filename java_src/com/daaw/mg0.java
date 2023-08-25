package com.daaw;

import java.util.Iterator;
/* loaded from: classes2.dex */
public abstract class mg0 implements Iterator<Integer> {
    public abstract int a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
