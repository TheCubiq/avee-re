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
    public final Object p;
    public Collection q;
    @CheckForNull
    public final d07 r;
    @CheckForNull
    public final Collection s;
    public final /* synthetic */ g07 t;

    public d07(g07 g07Var, Object obj, @CheckForNull Collection collection, d07 d07Var) {
        this.t = g07Var;
        this.p = obj;
        this.q = collection;
        this.r = d07Var;
        this.s = d07Var == null ? null : d07Var.q;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.q.isEmpty();
        boolean add = this.q.add(obj);
        if (add) {
            g07.k(this.t);
            if (isEmpty) {
                d();
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
        boolean addAll = this.q.addAll(collection);
        if (addAll) {
            g07.m(this.t, this.q.size() - size);
            if (size == 0) {
                d();
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
        this.q.clear();
        g07.n(this.t, size);
        e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        zzb();
        return this.q.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.q.containsAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        Map map;
        d07 d07Var = this.r;
        if (d07Var != null) {
            d07Var.d();
            return;
        }
        map = this.t.s;
        map.put(this.p, this.q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        Map map;
        d07 d07Var = this.r;
        if (d07Var != null) {
            d07Var.e();
        } else if (this.q.isEmpty()) {
            map = this.t.s;
            map.remove(this.p);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.q.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.q.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new c07(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object obj) {
        zzb();
        boolean remove = this.q.remove(obj);
        if (remove) {
            g07.l(this.t);
            e();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.q.removeAll(collection);
        if (removeAll) {
            g07.m(this.t, this.q.size() - size);
            e();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.q.retainAll(collection);
        if (retainAll) {
            g07.m(this.t, this.q.size() - size);
            e();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.q.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.q.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        Map map;
        d07 d07Var = this.r;
        if (d07Var != null) {
            d07Var.zzb();
            if (this.r.q != this.s) {
                throw new ConcurrentModificationException();
            }
        } else if (this.q.isEmpty()) {
            map = this.t.s;
            Collection collection = (Collection) map.get(this.p);
            if (collection != null) {
                this.q = collection;
            }
        }
    }
}
