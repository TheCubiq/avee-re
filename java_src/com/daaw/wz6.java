package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public class wz6 extends s27 {

    /* renamed from: q */
    public final /* synthetic */ g07 f31698q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz6(g07 g07Var, Map map) {
        super(map);
        this.f31698q = g07Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        l27.m17193b(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f25818p.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.f25818p.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f25818p.keySet().hashCode();
    }

    @Override // com.daaw.s27, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new vz6(this, this.f25818p.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.f25818p.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            g07.m22111n(this.f31698q, size);
            return size > 0;
        }
        return false;
    }
}
