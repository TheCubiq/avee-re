package com.daaw;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class h17 extends AbstractCollection {

    /* renamed from: p */
    public final /* synthetic */ i17 f11957p;

    public h17(i17 i17Var) {
        this.f11957p = i17Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f11957p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        i17 i17Var = this.f11957p;
        Map m20185n = i17Var.m20185n();
        return m20185n != null ? m20185n.values().iterator() : new p07(i17Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f11957p.size();
    }
}
