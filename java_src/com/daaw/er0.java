package com.daaw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public class er0<L1, L2> implements List<lo1<L1, L2>> {

    /* renamed from: p */
    public List<L1> f8707p;

    /* renamed from: q */
    public List<L2> f8708q;

    /* renamed from: com.daaw.er0$a */
    /* loaded from: classes.dex */
    public static class C1213a<L1, L2> implements w40<er0<L1, L2>> {
        @Override // com.daaw.w40
        /* renamed from: b */
        public er0<L1, L2> mo3478a() {
            return new er0<>();
        }
    }

    /* renamed from: com.daaw.er0$b */
    /* loaded from: classes.dex */
    public static class C1214b<L1, L2> implements Iterator<lo1<L1, L2>> {

        /* renamed from: p */
        public Iterator<L1> f8709p;

        /* renamed from: q */
        public Iterator<L2> f8710q;

        public C1214b(Iterator<L1> it, Iterator<L2> it2) {
            this.f8709p = it;
            this.f8710q = it2;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public lo1<L1, L2> next() {
            return new lo1<>(this.f8709p.next(), this.f8710q.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8709p.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f8709p.remove();
            this.f8710q.remove();
        }
    }

    /* renamed from: com.daaw.er0$c */
    /* loaded from: classes.dex */
    public static class C1215c<L1, L2> implements ListIterator<lo1<L1, L2>> {

        /* renamed from: p */
        public ListIterator<L1> f8711p;

        /* renamed from: q */
        public ListIterator<L2> f8712q;

        public C1215c(ListIterator<L1> listIterator, ListIterator<L2> listIterator2) {
            this.f8711p = listIterator;
            this.f8712q = listIterator2;
        }

        @Override // java.util.ListIterator
        /* renamed from: a */
        public void add(lo1<L1, L2> lo1Var) {
            this.f8711p.add(lo1Var.f17576a);
            this.f8712q.add(lo1Var.f17577b);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b */
        public lo1<L1, L2> next() {
            return new lo1<>(this.f8711p.next(), this.f8712q.next());
        }

        @Override // java.util.ListIterator
        /* renamed from: c */
        public lo1<L1, L2> previous() {
            return new lo1<>(this.f8711p.previous(), this.f8712q.previous());
        }

        @Override // java.util.ListIterator
        /* renamed from: d */
        public void set(lo1<L1, L2> lo1Var) {
            this.f8711p.set(lo1Var.f17576a);
            this.f8712q.set(lo1Var.f17577b);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f8711p.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f8711p.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f8711p.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f8711p.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f8711p.remove();
            this.f8712q.remove();
        }
    }

    public er0() {
        this.f8707p = new ArrayList();
        this.f8708q = new ArrayList();
    }

    public er0(int i) {
        this.f8707p = new ArrayList(i);
        this.f8708q = new ArrayList(i);
    }

    public er0(List<L1> list, List<L2> list2) {
        this.f8707p = list;
        this.f8708q = list2;
    }

    /* renamed from: m */
    public static <L1, L2> er0<L1, L2> m23270m(List<L1> list, L2 l2) {
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
            return this.f8708q.addAll(i, er0Var.f8708q) | this.f8707p.addAll(i, er0Var.f8707p);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends lo1<L1, L2>> collection) {
        if (collection instanceof er0) {
            er0 er0Var = (er0) collection;
            return this.f8708q.addAll(er0Var.f8708q) | this.f8707p.addAll(er0Var.f8707p);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f8707p.clear();
        this.f8708q.clear();
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
        this.f8707p.add(i, lo1Var.f17576a);
        this.f8708q.add(i, lo1Var.f17577b);
    }

    @Override // java.util.List, java.util.Collection
    /* renamed from: e */
    public boolean add(lo1<L1, L2> lo1Var) {
        this.f8707p.add(lo1Var.f17576a);
        this.f8708q.add(lo1Var.f17577b);
        return true;
    }

    /* renamed from: f */
    public boolean m23274f(L1 l1, L2 l2) {
        this.f8707p.add(l1);
        this.f8708q.add(l2);
        return true;
    }

    /* renamed from: h */
    public boolean m23273h(int i, Collection<? extends L1> collection, Collection<? extends L2> collection2) {
        boolean addAll = this.f8707p.addAll(i, collection);
        boolean addAll2 = this.f8708q.addAll(i, collection2);
        C2691q6.m12757a(this.f8707p.size(), this.f8708q.size());
        return addAll2 | addAll;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f8707p.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<lo1<L1, L2>> iterator() {
        return new C1214b(this.f8707p.iterator(), this.f8708q.iterator());
    }

    /* renamed from: j */
    public boolean m23272j(L1 l1) {
        return this.f8707p.contains(l1);
    }

    /* renamed from: k */
    public boolean m23271k(L2 l2) {
        return this.f8708q.contains(l2);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return 0;
    }

    @Override // java.util.List
    public ListIterator<lo1<L1, L2>> listIterator() {
        return new C1215c(this.f8707p.listIterator(), this.f8708q.listIterator());
    }

    @Override // java.util.List
    public ListIterator<lo1<L1, L2>> listIterator(int i) {
        return new C1215c(this.f8707p.listIterator(i), this.f8708q.listIterator(i));
    }

    @Override // java.util.List
    /* renamed from: n */
    public lo1<L1, L2> get(int i) {
        return new lo1<>(this.f8707p.get(i), this.f8708q.get(i));
    }

    /* renamed from: o */
    public L1 m23268o(int i) {
        return this.f8707p.get(i);
    }

    /* renamed from: p */
    public L2 m23267p(int i) {
        return this.f8708q.get(i);
    }

    /* renamed from: q */
    public Iterator<L1> m23266q() {
        return this.f8707p.iterator();
    }

    /* renamed from: r */
    public C1215c<L1, L2> m23265r() {
        return new C1215c<>(this.f8707p.listIterator(), this.f8708q.listIterator());
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
        return new lo1<>(this.f8707p.remove(i), this.f8708q.remove(i));
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        C2691q6.m12757a(this.f8707p.size(), this.f8708q.size());
        return this.f8707p.size();
    }

    @Override // java.util.List
    /* renamed from: t */
    public lo1<L1, L2> set(int i, lo1<L1, L2> lo1Var) {
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[this.f8707p.size()];
        for (int i = 0; i < this.f8707p.size(); i++) {
            objArr[i] = new lo1(this.f8707p.get(i), this.f8708q.get(i));
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int i = 0;
        if (tArr.length < size()) {
            T[] tArr2 = (T[]) new Object[this.f8707p.size()];
            while (i < this.f8707p.size()) {
                tArr2[i] = new lo1(this.f8707p.get(i), this.f8708q.get(i));
                i++;
            }
            return tArr2;
        }
        while (i < this.f8707p.size()) {
            tArr[i] = new lo1(this.f8707p.get(i), this.f8708q.get(i));
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
        return new er0<>(this.f8707p.subList(i, i2), this.f8708q.subList(i, i2));
    }

    /* renamed from: v */
    public er0<L1, L2> m23261v() {
        return new er0<>(Collections.unmodifiableList(this.f8707p), Collections.unmodifiableList(this.f8708q));
    }

    /* renamed from: w */
    public List<L1> m23260w() {
        return Collections.unmodifiableList(this.f8707p);
    }

    /* renamed from: x */
    public List<L2> m23259x() {
        return Collections.unmodifiableList(this.f8708q);
    }
}
