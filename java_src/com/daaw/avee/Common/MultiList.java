package com.daaw.avee.Common;

import com.daaw.avee.Common.Func.Func;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import junit.framework.Assert;
/* loaded from: classes.dex */
public class MultiList<L1, L2> implements List<Tuple2<L1, L2>> {
    private List<L1> list1;
    private List<L2> list2;

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return 0;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return 0;
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

    public Tuple2<L1, L2> set(int i, Tuple2<L1, L2> tuple2) {
        return null;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        add(i, (Tuple2) ((Tuple2) obj));
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return add((Tuple2) ((Tuple2) obj));
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return set(i, (Tuple2) ((Tuple2) obj));
    }

    /* loaded from: classes.dex */
    public static class Factory<L1, L2> implements Func<MultiList<L1, L2>> {
        @Override // com.daaw.avee.Common.Func.Func
        public MultiList<L1, L2> onInvoke() {
            return new MultiList<>();
        }
    }

    public MultiList() {
        this.list1 = new ArrayList();
        this.list2 = new ArrayList();
    }

    public MultiList(int i) {
        this.list1 = new ArrayList(i);
        this.list2 = new ArrayList(i);
    }

    public MultiList(List<L1> list, List<L2> list2) {
        this.list1 = list;
        this.list2 = list2;
    }

    public static <L1, L2> MultiList<L1, L2> fromList1FillWith2(List<L1> list, L2 l2) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(l2);
        }
        return new MultiList<>(list, arrayList);
    }

    public static <L1, L2> MultiList<L1, L2> fromList2FillWith1(List<L2> list, L1 l1) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(l1);
        }
        return new MultiList<>(arrayList, list);
    }

    public MultiList<L1, L2> CreateClone() {
        ArrayList arrayList = new ArrayList(this.list1.size());
        ArrayList arrayList2 = new ArrayList(this.list2.size());
        arrayList.addAll(this.list1);
        arrayList2.addAll(this.list2);
        return new MultiList<>(arrayList, arrayList2);
    }

    public void add(int i, L1 l1, L2 l2) {
        this.list1.add(i, l1);
        this.list2.add(i, l2);
    }

    public boolean add(L1 l1, L2 l2) {
        this.list1.add(l1);
        this.list2.add(l2);
        return true;
    }

    public boolean addAll(int i, Collection<? extends L1> collection, Collection<? extends L2> collection2) {
        boolean addAll = this.list1.addAll(i, collection);
        boolean addAll2 = this.list2.addAll(i, collection2);
        Assert.assertEquals(this.list1.size(), this.list2.size());
        return addAll2 | addAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.list1.clear();
        this.list2.clear();
    }

    public boolean contains1(L1 l1) {
        return this.list1.contains(l1);
    }

    public boolean contains2(L2 l2) {
        return this.list2.contains(l2);
    }

    public L1 get1(int i) {
        return this.list1.get(i);
    }

    public L2 get2(int i) {
        return this.list2.get(i);
    }

    public int indexOf1(L1 l1) {
        return this.list1.indexOf(l1);
    }

    public int indexOf2(L2 l2) {
        return this.list2.indexOf(l2);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.list1.isEmpty();
    }

    public ListIterator<L1, L2> multiListIterator() {
        return new ListIterator<>(this.list1.listIterator(), this.list2.listIterator());
    }

    public void set(int i, L1 l1, L2 l2) {
        this.list1.set(i, l1);
        this.list2.set(i, l2);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        Assert.assertEquals(this.list1.size(), this.list2.size());
        return this.list1.size();
    }

    @Override // java.util.List
    public MultiList<L1, L2> subList(int i, int i2) {
        return new MultiList<>(this.list1.subList(i, i2), this.list2.subList(i, i2));
    }

    public void swap(int i, int i2) {
        Collections.swap(this.list1, i, i2);
        Collections.swap(this.list2, i, i2);
    }

    public List<L1> unmodifiableList1() {
        return Collections.unmodifiableList(this.list1);
    }

    public List<L2> unmodifiableList2() {
        return Collections.unmodifiableList(this.list2);
    }

    public MultiList<L1, L2> unmodifiableList() {
        return new MultiList<>(Collections.unmodifiableList(this.list1), Collections.unmodifiableList(this.list2));
    }

    public void add(int i, Tuple2<L1, L2> tuple2) {
        this.list1.add(i, tuple2.obj1);
        this.list2.add(i, tuple2.obj2);
    }

    public boolean add(Tuple2<L1, L2> tuple2) {
        this.list1.add(tuple2.obj1);
        this.list2.add(tuple2.obj2);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends Tuple2<L1, L2>> collection) {
        if (collection instanceof MultiList) {
            MultiList multiList = (MultiList) collection;
            return this.list2.addAll(i, multiList.list2) | this.list1.addAll(i, multiList.list1);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends Tuple2<L1, L2>> collection) {
        if (collection instanceof MultiList) {
            MultiList multiList = (MultiList) collection;
            return this.list2.addAll(multiList.list2) | this.list1.addAll(multiList.list1);
        }
        return false;
    }

    @Override // java.util.List
    public Tuple2<L1, L2> get(int i) {
        return new Tuple2<>(this.list1.get(i), this.list2.get(i));
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<Tuple2<L1, L2>> iterator() {
        return new Iterator(this.list1.iterator(), this.list2.iterator());
    }

    public java.util.Iterator<L1> iterator1() {
        return this.list1.iterator();
    }

    public java.util.Iterator<L2> iterator2() {
        return this.list2.iterator();
    }

    @Override // java.util.List
    public java.util.ListIterator<Tuple2<L1, L2>> listIterator(int i) {
        return new ListIterator(this.list1.listIterator(i), this.list2.listIterator(i));
    }

    @Override // java.util.List
    public java.util.ListIterator<Tuple2<L1, L2>> listIterator() {
        return new ListIterator(this.list1.listIterator(), this.list2.listIterator());
    }

    @Override // java.util.List
    public Tuple2<L1, L2> remove(int i) {
        return new Tuple2<>(this.list1.remove(i), this.list2.remove(i));
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[this.list1.size()];
        for (int i = 0; i < this.list1.size(); i++) {
            objArr[i] = new Tuple2(this.list1.get(i), this.list2.get(i));
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int i = 0;
        if (tArr.length < size()) {
            T[] tArr2 = (T[]) new Object[this.list1.size()];
            while (i < this.list1.size()) {
                tArr2[i] = new Tuple2(this.list1.get(i), this.list2.get(i));
                i++;
            }
            return tArr2;
        }
        while (i < this.list1.size()) {
            tArr[i] = new Tuple2(this.list1.get(i), this.list2.get(i));
            i++;
        }
        if (tArr.length > size()) {
            tArr[size()] = 0;
        }
        return tArr;
    }

    /* loaded from: classes.dex */
    public static class ListIterator<L1, L2> implements java.util.ListIterator<Tuple2<L1, L2>> {
        java.util.ListIterator<L1> iterator1;
        java.util.ListIterator<L2> iterator2;

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(Object obj) {
            add((Tuple2) ((Tuple2) obj));
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(Object obj) {
            set((Tuple2) ((Tuple2) obj));
        }

        public ListIterator(java.util.ListIterator<L1> listIterator, java.util.ListIterator<L2> listIterator2) {
            this.iterator1 = listIterator;
            this.iterator2 = listIterator2;
        }

        public void add(L1 l1, L2 l2) {
            this.iterator1.add(l1);
            this.iterator2.add(l2);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.iterator1.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.iterator1.hasPrevious();
        }

        public L1 next1() {
            this.iterator2.next();
            return this.iterator1.next();
        }

        public L2 next2() {
            this.iterator1.next();
            return this.iterator2.next();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.iterator1.nextIndex();
        }

        public L1 previous1() {
            this.iterator2.previous();
            return this.iterator1.previous();
        }

        public L2 previous2() {
            this.iterator1.previous();
            return this.iterator2.previous();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.iterator1.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.iterator1.remove();
            this.iterator2.remove();
        }

        public void set(L1 l1, L2 l2) {
            this.iterator1.set(l1);
            this.iterator2.set(l2);
        }

        public void add(Tuple2<L1, L2> tuple2) {
            this.iterator1.add(tuple2.obj1);
            this.iterator2.add(tuple2.obj2);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Tuple2<L1, L2> next() {
            return new Tuple2<>(this.iterator1.next(), this.iterator2.next());
        }

        @Override // java.util.ListIterator
        public Tuple2<L1, L2> previous() {
            return new Tuple2<>(this.iterator1.previous(), this.iterator2.previous());
        }

        public void set(Tuple2<L1, L2> tuple2) {
            this.iterator1.set(tuple2.obj1);
            this.iterator2.set(tuple2.obj2);
        }
    }

    /* loaded from: classes.dex */
    public static class Iterator<L1, L2> implements java.util.Iterator<Tuple2<L1, L2>> {
        java.util.Iterator<L1> iterator1;
        java.util.Iterator<L2> iterator2;

        public Iterator(java.util.Iterator<L1> it, java.util.Iterator<L2> it2) {
            this.iterator1 = it;
            this.iterator2 = it2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.iterator1.hasNext();
        }

        public L1 next1() {
            this.iterator2.next();
            return this.iterator1.next();
        }

        public L2 next2() {
            this.iterator1.next();
            return this.iterator2.next();
        }

        @Override // java.util.Iterator
        public Tuple2<L1, L2> next() {
            return new Tuple2<>(this.iterator1.next(), this.iterator2.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.iterator1.remove();
            this.iterator2.remove();
        }
    }
}
