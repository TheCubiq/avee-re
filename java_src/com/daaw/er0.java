package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public class er0<L1, L2> implements List<lo1<L1, L2>> {
    public List<L1> p;
    public List<L2> q;

    /* loaded from: classes.dex */
    public static class a<L1, L2> implements w40<er0<L1, L2>> {
        @Override // com.daaw.w40
        /* renamed from: b */
        public er0<L1, L2> a() {
            return new er0<>();
        }
    }

    /* loaded from: classes.dex */
    public static class b<L1, L2> implements Iterator<lo1<L1, L2>> {
        public Iterator<L1> p;
        public Iterator<L2> q;

        public b(Iterator<L1> it, Iterator<L2> it2) {
            this.p = it;
            this.q = it2;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public lo1<L1, L2> next() {
            return new lo1<>(this.p.next(), this.q.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.p.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.p.remove();
            this.q.remove();
        }
    }

    /* loaded from: classes.dex */
    public static class c<L1, L2> implements ListIterator<lo1<L1, L2>> {
        public ListIterator<L1> p;
        public ListIterator<L2> q;

        public c(ListIterator<L1> listIterator, ListIterator<L2> listIterator2) {
            this.p = listIterator;
            this.q = listIterator2;
        }

        @Override // java.util.ListIterator
        /* renamed from: a */
        public void add(lo1<L1, L2> lo1Var) {
            this.p.add(lo1Var.a);
            this.q.add(lo1Var.b);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b */
        public lo1<L1, L2> next() {
            return new lo1<>(this.p.next(), this.q.next());
        }

        @Override // java.util.ListIterator
        /* renamed from: c */
        public lo1<L1, L2> previous() {
            return new lo1<>(this.p.previous(), this.q.previous());
        }

        @Override // java.util.ListIterator
        /* renamed from: d */
        public void set(lo1<L1, L2> lo1Var) {
            this.p.set(lo1Var.a);
            this.q.set(lo1Var.b);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.p.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.p.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.p.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.p.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.p.remove();
            this.q.remove();
        }
    }

    public er0() {
        this.p = new ArrayList();
        this.q = new ArrayList();
    }

    public er0(int i) {
        this.p = new ArrayList(i);
        this.q = new ArrayList(i);
    }

    public er0(List<L1> list, List<L2> list2) {
        this.p = list;
        this.q = list2;
    }

    public static <L1, L2> er0<L1, L2> m(List<L1> list, L2 l2) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(l2);
        }
        return new er0<>(list, arrayList);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends lo1<L1, L2>> collection) {
        if (collection instanceof er0) {
            er0 er0Var = (er0) collection;
            return this.q.addAll(i, er0Var.q) | this.p.addAll(i, er0Var.p);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends lo1<L1, L2>> collection) {
        if (collection instanceof er0) {
            er0 er0Var = (er0) collection;
            return this.q.addAll(er0Var.q) | this.p.addAll(er0Var.p);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.p.clear();
        this.q.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override // java.util.List
    /* renamed from: d */
    public void add(int i, lo1<L1, L2> lo1Var) {
        this.p.add(i, lo1Var.a);
        this.q.add(i, lo1Var.b);
    }

    @Override // java.util.List, java.util.Collection
    /* renamed from: e */
    public boolean add(lo1<L1, L2> lo1Var) {
        this.p.add(lo1Var.a);
        this.q.add(lo1Var.b);
        return true;
    }

    public boolean f(L1 l1, L2 l2) {
        this.p.add(l1);
        this.q.add(l2);
        return true;
    }

    public boolean h(int i, Collection<? extends L1> collection, Collection<? extends L2> collection2) {
        boolean addAll = this.p.addAll(i, collection);
        boolean addAll2 = this.q.addAll(i, collection2);
        q6.a(this.p.size(), this.q.size());
        return addAll2 | addAll;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.p.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<lo1<L1, L2>> iterator() {
        return new b(this.p.iterator(), this.q.iterator());
    }

    public boolean j(L1 l1) {
        return this.p.contains(l1);
    }

    public boolean k(L2 l2) {
        return this.q.contains(l2);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return 0;
    }

    @Override // java.util.List
    public ListIterator<lo1<L1, L2>> listIterator() {
        return new c(this.p.listIterator(), this.q.listIterator());
    }

    @Override // java.util.List
    public ListIterator<lo1<L1, L2>> listIterator(int i) {
        return new c(this.p.listIterator(i), this.q.listIterator(i));
    }

    @Override // java.util.List
    /* renamed from: n */
    public lo1<L1, L2> get(int i) {
        return new lo1<>(this.p.get(i), this.q.get(i));
    }

    public L1 o(int i) {
        return this.p.get(i);
    }

    public L2 p(int i) {
        return this.q.get(i);
    }

    public Iterator<L1> q() {
        return this.p.iterator();
    }

    public c<L1, L2> r() {
        return new c<>(this.p.listIterator(), this.q.listIterator());
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override // java.util.List
    /* renamed from: s */
    public lo1<L1, L2> remove(int i) {
        return new lo1<>(this.p.remove(i), this.q.remove(i));
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        q6.a(this.p.size(), this.q.size());
        return this.p.size();
    }

    @Override // java.util.List
    /* renamed from: t */
    public lo1<L1, L2> set(int i, lo1<L1, L2> lo1Var) {
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[this.p.size()];
        for (int i = 0; i < this.p.size(); i++) {
            objArr[i] = new lo1(this.p.get(i), this.q.get(i));
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int i = 0;
        if (tArr.length < size()) {
            T[] tArr2 = (T[]) new Object[this.p.size()];
            while (i < this.p.size()) {
                tArr2[i] = new lo1(this.p.get(i), this.q.get(i));
                i++;
            }
            return tArr2;
        }
        while (i < this.p.size()) {
            tArr[i] = new lo1(this.p.get(i), this.q.get(i));
            i++;
        }
        if (tArr.length > size()) {
            tArr[size()] = 0;
        }
        return tArr;
    }

    @Override // java.util.List
    /* renamed from: u */
    public er0<L1, L2> subList(int i, int i2) {
        return new er0<>(this.p.subList(i, i2), this.q.subList(i, i2));
    }

    public er0<L1, L2> v() {
        return new er0<>(Collections.unmodifiableList(this.p), Collections.unmodifiableList(this.q));
    }

    public List<L1> w() {
        return Collections.unmodifiableList(this.p);
    }

    public List<L2> x() {
        return Collections.unmodifiableList(this.q);
    }
}
