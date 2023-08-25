package com.daaw;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public class d07 extends AbstractCollection {

    /* renamed from: p */
    public final Object f6351p;

    /* renamed from: q */
    public Collection f6352q;
    @CheckForNull

    /* renamed from: r */
    public final d07 f6353r;
    @CheckForNull

    /* renamed from: s */
    public final Collection f6354s;

    /* renamed from: t */
    public final /* synthetic */ g07 f6355t;

    public d07(g07 g07Var, Object obj, @CheckForNull Collection collection, d07 d07Var) {
        this.f6355t = g07Var;
        this.f6351p = obj;
        this.f6352q = collection;
        this.f6353r = d07Var;
        this.f6354s = d07Var == null ? null : d07Var.f6352q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.f6352q.isEmpty();
        boolean add = this.f6352q.add(obj);
        if (add) {
            g07.m22114k(this.f6355t);
            if (isEmpty) {
                m24805d();
                return true;
            }
            return add;
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f6352q.addAll(collection);
        if (addAll) {
            g07.m22112m(this.f6355t, this.f6352q.size() - size);
            if (size == 0) {
                m24805d();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f6352q.clear();
        g07.m22111n(this.f6355t, size);
        m24804e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        zzb();
        return this.f6352q.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f6352q.containsAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m24805d() {
        Map map;
        d07 d07Var = this.f6353r;
        if (d07Var != null) {
            d07Var.m24805d();
            return;
        }
        map = this.f6355t.f10130s;
        map.put(this.f6351p, this.f6352q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m24804e() {
        Map map;
        d07 d07Var = this.f6353r;
        if (d07Var != null) {
            d07Var.m24804e();
        } else if (this.f6352q.isEmpty()) {
            map = this.f6355t.f10130s;
            map.remove(this.f6351p);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f6352q.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f6352q.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new c07(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object obj) {
        zzb();
        boolean remove = this.f6352q.remove(obj);
        if (remove) {
            g07.m22113l(this.f6355t);
            m24804e();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f6352q.removeAll(collection);
        if (removeAll) {
            g07.m22112m(this.f6355t, this.f6352q.size() - size);
            m24804e();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.f6352q.retainAll(collection);
        if (retainAll) {
            g07.m22112m(this.f6355t, this.f6352q.size() - size);
            m24804e();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f6352q.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f6352q.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Map map;
        d07 d07Var = this.f6353r;
        if (d07Var != null) {
            d07Var.zzb();
            if (this.f6353r.f6352q != this.f6354s) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f6352q.isEmpty()) {
            map = this.f6355t.f10130s;
            Collection collection = (Collection) map.get(this.f6351p);
            if (collection != null) {
                this.f6352q = collection;
            }
        }
    }
}
