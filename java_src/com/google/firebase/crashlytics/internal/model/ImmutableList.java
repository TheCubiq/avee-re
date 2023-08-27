package com.google.firebase.crashlytics.internal.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class ImmutableList<E> implements List<E>, RandomAccess {
    private final List<E> immutableList;

    public static <E> ImmutableList<E> from(E... eArr) {
        return new ImmutableList<>(Arrays.asList(eArr));
    }

    public static <E> ImmutableList<E> from(List<E> list) {
        return new ImmutableList<>(list);
    }

    private ImmutableList(List<E> list) {
        this.immutableList = Collections.unmodifiableList(list);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.immutableList.size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.immutableList.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.immutableList.contains(obj);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return this.immutableList.iterator();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.immutableList.toArray();
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.immutableList.toArray(tArr);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e) {
        return this.immutableList.add(e);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.immutableList.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.immutableList.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return this.immutableList.addAll(collection);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends E> collection) {
        return this.immutableList.addAll(i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return this.immutableList.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return this.immutableList.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.immutableList.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.immutableList.equals(obj);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.immutableList.hashCode();
    }

    @Override // java.util.List
    public E get(int i) {
        return this.immutableList.get(i);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        return this.immutableList.set(i, e);
    }

    @Override // java.util.List
    public void add(int i, E e) {
        this.immutableList.add(i, e);
    }

    @Override // java.util.List
    public E remove(int i) {
        return this.immutableList.remove(i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.immutableList.indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.immutableList.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return this.immutableList.listIterator();
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i) {
        return this.immutableList.listIterator(i);
    }

    @Override // java.util.List
    public List<E> subList(int i, int i2) {
        return this.immutableList.subList(i, i2);
    }
}
