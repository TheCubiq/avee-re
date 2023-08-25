package com.daaw;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class f17 extends AbstractSet {
    public final /* synthetic */ i17 p;

    public f17(i17 i17Var) {
        this.p = i17Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.p.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.p.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i17 i17Var = this.p;
        Map n = i17Var.n();
        return n != null ? n.keySet().iterator() : new n07(i17Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Object z;
        Object obj2;
        Map n = this.p.n();
        if (n != null) {
            return n.keySet().remove(obj);
        }
        z = this.p.z(obj);
        obj2 = i17.y;
        return z != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.p.size();
    }
}
