package com.daaw;

import java.util.Iterator;
/* loaded from: classes.dex */
public final class aw7 implements Iterator {

    /* renamed from: p */
    public final Iterator f4068p;

    /* renamed from: q */
    public final /* synthetic */ bw7 f4069q;

    public aw7(bw7 bw7Var) {
        ct7 ct7Var;
        this.f4069q = bw7Var;
        ct7Var = bw7Var.f5236p;
        this.f4068p = ct7Var.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4068p.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f4068p.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
