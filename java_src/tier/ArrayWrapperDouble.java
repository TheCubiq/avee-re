package tier;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes2.dex */
public class ArrayWrapperDouble implements List<Double> {
    private double[] array;
    private int offset;

    @Override // java.util.List, java.util.Collection
    public boolean add(Double d) {
        return false;
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends Double> collection) {
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return false;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return null;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return 0;
    }

    @Override // java.util.List
    public ListIterator<Double> listIterator() {
        return null;
    }

    @Override // java.util.List
    public ListIterator<Double> listIterator(int i) {
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Double remove(int i) {
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        return false;
    }

    @Override // java.util.List
    public List<Double> subList(int i, int i2) {
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return new Object[0];
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return new Object[0];
    }

    public ArrayWrapperDouble(double[] dArr) {
        this.array = dArr;
        this.offset = 0;
    }

    public ArrayWrapperDouble(double[] dArr, int i) {
        this.array = dArr;
        this.offset = i;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.array.length - this.offset;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public Double get(int i) {
        return Double.valueOf(this.array[this.offset + i]);
    }

    @Override // java.util.List
    public Double set(int i, Double d) {
        this.array[this.offset + i] = d.doubleValue();
        return d;
    }

    @Override // java.util.List
    public void add(int i, Double d) {
        this.array[this.offset + i] = d.doubleValue();
    }
}
