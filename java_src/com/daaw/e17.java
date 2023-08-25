package com.daaw;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class e17 implements Iterator {
    public int p;
    public int q;
    public int r;
    public final /* synthetic */ i17 s;

    public /* synthetic */ e17(i17 i17Var, n07 n07Var) {
        int i;
        this.s = i17Var;
        i = i17Var.t;
        this.p = i;
        this.q = i17Var.g();
        this.r = -1;
    }

    public abstract Object a(int i);

    public final void b() {
        int i;
        i = this.s.t;
        if (i != this.p) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.q >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        if (hasNext()) {
            int i = this.q;
            this.r = i;
            Object a = a(i);
            this.q = this.s.h(this.q);
            return a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        b();
        sy6.i(this.r >= 0, "no calls to next() since the last call to remove()");
        this.p += 32;
        i17 i17Var = this.s;
        i17Var.remove(i17.i(i17Var, this.r));
        this.q--;
        this.r = -1;
    }
}
