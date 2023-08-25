package com.daaw;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class h17 extends AbstractCollection {
    public final /* synthetic */ i17 p;

    public h17(i17 i17Var) {
        this.p = i17Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        i17 i17Var = this.p;
        Map n = i17Var.n();
        return n != null ? n.values().iterator() : new p07(i17Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.p.size();
    }
}
