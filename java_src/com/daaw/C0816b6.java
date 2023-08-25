package com.daaw;

import java.util.Collection;
import java.util.Iterator;
/* renamed from: com.daaw.b6 */
/* loaded from: classes2.dex */
public final class C0816b6<T> implements Collection<T> {

    /* renamed from: p */
    public final T[] f4321p;

    /* renamed from: q */
    public final boolean f4322q;

    public C0816b6(T[] tArr, boolean z) {
        ug0.m8268f(tArr, "values");
        this.f4321p = tArr;
        this.f4322q = z;
    }

    @Override // java.util.Collection
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return C2410o6.m14540d(this.f4321p, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        ug0.m8268f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public int m26484d() {
        return this.f4321p.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f4321p.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return C1053d6.m24638a(this.f4321p);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return m26484d();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C1827jg.m18531a(this.f4321p, this.f4322q);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        ug0.m8268f(tArr, "array");
        return (T[]) C1534hg.m20819b(this, tArr);
    }
}
