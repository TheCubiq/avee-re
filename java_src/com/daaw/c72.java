package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class c72 implements Iterator {
    public int p = 0;
    public final /* synthetic */ z72 q;

    public c72(z72 z72Var) {
        this.q = z72Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.p < this.q.j();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.p < this.q.j()) {
            z72 z72Var = this.q;
            int i = this.p;
            this.p = i + 1;
            return z72Var.k(i);
        }
        int i2 = this.p;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }
}
