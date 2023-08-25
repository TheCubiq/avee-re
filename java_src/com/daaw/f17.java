package com.daaw;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class f17 extends AbstractSet {

    /* renamed from: p */
    public final /* synthetic */ i17 f9010p;

    public f17(i17 i17Var) {
        this.f9010p = i17Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f9010p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.f9010p.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i17 i17Var = this.f9010p;
        Map m20185n = i17Var.m20185n();
        return m20185n != null ? m20185n.keySet().iterator() : new n07(i17Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Object m20173z;
        Object obj2;
        Map m20185n = this.f9010p.m20185n();
        if (m20185n != null) {
            return m20185n.keySet().remove(obj);
        }
        m20173z = this.f9010p.m20173z(obj);
        obj2 = i17.f13180y;
        return m20173z != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9010p.size();
    }
}
