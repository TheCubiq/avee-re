package com.daaw;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class j27 extends c47 {
    public boolean p;
    public final /* synthetic */ Object q;

    public j27(Object obj) {
        this.q = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.p;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.p) {
            throw new NoSuchElementException();
        }
        this.p = true;
        return this.q;
    }
}
