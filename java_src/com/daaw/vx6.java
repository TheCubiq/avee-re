package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class vx6 implements Iterator {
    @CheckForNull

    /* renamed from: p */
    public Object f30701p;

    /* renamed from: q */
    public int f30702q = 2;

    @CheckForNull
    /* renamed from: a */
    public abstract Object mo6673a();

    @CheckForNull
    /* renamed from: b */
    public final Object m6672b() {
        this.f30702q = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        sy6.m9701h(this.f30702q != 4);
        int i = this.f30702q;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 0) {
                if (i2 != 2) {
                    this.f30702q = 4;
                    this.f30701p = mo6673a();
                    if (this.f30702q != 3) {
                        this.f30702q = 1;
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f30702q = 2;
            Object obj = this.f30701p;
            this.f30701p = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
