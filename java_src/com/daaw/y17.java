package com.daaw;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class y17 extends t17 implements List, RandomAccess {
    public static final d47 q = new w17(m37.t, 0);

    public static v17 o() {
        return new v17(4);
    }

    public static y17 p(Object[] objArr) {
        return q(objArr, objArr.length);
    }

    public static y17 q(Object[] objArr, int i) {
        return i == 0 ? m37.t : new m37(objArr, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static y17 r(Iterable iterable) {
        Objects.requireNonNull(iterable);
        return s(iterable);
    }

    public static y17 s(Collection collection) {
        if (!(collection instanceof t17)) {
            Object[] array = collection.toArray();
            int length = array.length;
            k37.b(array, length);
            return q(array, length);
        }
        y17 h = ((t17) collection).h();
        if (h.k()) {
            Object[] array2 = h.toArray();
            return q(array2, array2.length);
        }
        return h;
    }

    public static y17 t(Object[] objArr) {
        if (objArr.length == 0) {
            return m37.t;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        k37.b(objArr2, length);
        return q(objArr2, length);
    }

    public static y17 u() {
        return m37.t;
    }

    public static y17 v(Object obj) {
        Object[] objArr = {obj};
        k37.b(objArr, 1);
        return q(objArr, 1);
    }

    public static y17 w(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        k37.b(objArr, 2);
        return q(objArr, 2);
    }

    public static y17 x(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {"2011", "1009", "3010"};
        k37.b(objArr, 3);
        return q(objArr, 3);
    }

    public static y17 y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        k37.b(objArr, 5);
        return q(objArr, 5);
    }

    public static y17 z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        k37.b(objArr, 6);
        return q(objArr, 6);
    }

    @Override // java.util.List
    /* renamed from: A */
    public final d47 listIterator(int i) {
        sy6.b(i, size(), "index");
        return isEmpty() ? q : new w17(this, i);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.daaw.t17
    public int d(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (ky6.a(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!ky6.a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.daaw.t17
    @Deprecated
    public final y17 h() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.daaw.t17
    public final c47 j() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: n */
    public y17 subList(int i, int i2) {
        sy6.g(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? m37.t : new x17(this, i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
