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

    /* renamed from: p */
    public final List<E> f21531p;

    public of0(List<E> list) {
        this.f21531p = Collections.unmodifiableList(list);
    }

    /* renamed from: d */
    public static <E> of0<E> m14316d(List<E> list) {
        return new of0<>(list);
    }

    /* renamed from: e */
    public static <E> of0<E> m14315e(E... eArr) {
        return new of0<>(Arrays.asList(eArr));
    }

    @Override // java.util.List
    public void add(int i, E e) {
        this.f21531p.add(i, e);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e) {
        return this.f21531p.add(e);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        return this.f21531p.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.f21531p.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f21531p.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f21531p.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f21531p.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f21531p.equals(obj);
    }

    @Override // java.util.List
    public E get(int i) {
        return this.f21531p.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f21531p.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f21531p.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f21531p.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.f21531p.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f21531p.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.f21531p.listIterator();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return this.f21531p.listIterator(i);
    }

    @Override // java.util.List
    public E remove(int i) {
        return this.f21531p.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f21531p.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.f21531p.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.f21531p.retainAll(collection);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        return this.f21531p.set(i, e);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f21531p.size();
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return this.f21531p.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f21531p.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f21531p.toArray(tArr);
    }
}
