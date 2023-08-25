package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public class wz6 extends s27 {
    public final /* synthetic */ g07 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz6(g07 g07Var, Map map) {
        super(map);
        this.q = g07Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        l27.b(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.p.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.p.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.p.keySet().hashCode();
    }

    @Override // com.daaw.s27, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new vz6(this, this.p.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.p.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            g07.n(this.q, size);
            return size > 0;
        }
        return false;
    }
}
