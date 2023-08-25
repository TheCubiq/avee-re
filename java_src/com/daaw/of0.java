package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class of0<E> implements List<E>, RandomAccess {
    public final List<E> p;

    public of0(List<E> list) {
        this.p = Collections.unmodifiableList(list);
    }

    public static <E> of0<E> d(List<E> list) {
        return new of0<>(list);
    }

    public static <E> of0<E> e(E... eArr) {
        return new of0<>(Arrays.asList(eArr));
    }

    @Override // java.util.List
    public void add(int i, E e) {
        this.p.add(i, e);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e) {
        return this.p.add(e);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        return this.p.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.p.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.p.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.p.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.p.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.p.equals(obj);
    }

    @Override // java.util.List
    public E get(int i) {
        return this.p.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.p.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.p.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.p.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.p.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.p.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.p.listIterator();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return this.p.listIterator(i);
    }

    @Override // java.util.List
    public E remove(int i) {
        return this.p.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.p.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.p.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.p.retainAll(collection);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        return this.p.set(i, e);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.p.size();
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return this.p.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.p.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.p.toArray(tArr);
    }
}
