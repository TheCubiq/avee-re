package com.daaw;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public class l07 extends AbstractCollection {
    public final Collection p;
    public final ty6 q;

    public l07(Collection collection, ty6 ty6Var) {
        this.p = collection;
        this.q = ty6Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        sy6.e(this.q.zza(obj));
        return this.p.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            sy6.e(this.q.zza(obj));
        }
        return this.p.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        h27.a(this.p, this.q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (m07.a(this.p, obj)) {
            return this.q.zza(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Collection<Object> collection = this.p;
        ty6 ty6Var = this.q;
        sy6.c(ty6Var, "predicate");
        int i = 0;
        for (Object obj : collection) {
            if (ty6Var.zza(obj)) {
                return i == -1;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.p.iterator();
        ty6 ty6Var = this.q;
        Objects.requireNonNull(it);
        Objects.requireNonNull(ty6Var);
        return new i27(it, ty6Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object obj) {
        return contains(obj) && this.p.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.p.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.q.zza(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.p.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.q.zza(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (Object obj : this.p) {
            if (this.q.zza(obj)) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        l27.c(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        l27.c(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
