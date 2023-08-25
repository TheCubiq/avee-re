package com.daaw;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class kz6 extends d47 {

    /* renamed from: p */
    public final int f16907p;

    /* renamed from: q */
    public int f16908q;

    public kz6(int i, int i2) {
        sy6.m9707b(i2, i, "index");
        this.f16907p = i;
        this.f16908q = i2;
    }

    /* renamed from: a */
    public abstract Object mo6590a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f16908q < this.f16907p;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f16908q > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f16908q;
            this.f16908q = i + 1;
            return mo6590a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f16908q;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f16908q - 1;
            this.f16908q = i;
            return mo6590a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f16908q - 1;
    }
}
