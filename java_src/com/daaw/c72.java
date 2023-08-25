package com.daaw;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes2.dex */
public final class c72 implements Iterator {

    /* renamed from: p */
    public int f5598p = 0;

    /* renamed from: q */
    public final /* synthetic */ z72 f5599q;

    public c72(z72 z72Var) {
        this.f5599q = z72Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5598p < this.f5599q.m2704j();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.f5598p < this.f5599q.m2704j()) {
            z72 z72Var = this.f5599q;
            int i = this.f5598p;
            this.f5598p = i + 1;
            return z72Var.m2703k(i);
        }
        int i2 = this.f5598p;
        throw new NoSuchElementException("Out of bounds index: " + i2);
    }
}
