package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class re8 extends z48 implements RandomAccess {
    public static final re8 s;
    public Object[] q;
    public int r;

    static {
        re8 re8Var = new re8(new Object[0], 0);
        s = re8Var;
        re8Var.zzb();
    }

    public re8(Object[] objArr, int i) {
        this.q = objArr;
        this.r = i;
    }

    public static re8 e() {
        return s;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        d();
        if (i < 0 || i > (i2 = this.r)) {
            throw new IndexOutOfBoundsException(f(i));
        }
        Object[] objArr = this.q;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.q, i, objArr2, i + 1, this.r - i);
            this.q = objArr2;
        }
        this.q[i] = obj;
        this.r++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        int i = this.r;
        Object[] objArr = this.q;
        if (i == objArr.length) {
            this.q = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.q;
        int i2 = this.r;
        this.r = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.daaw.db8
    public final /* bridge */ /* synthetic */ db8 b(int i) {
        if (i >= this.r) {
            return new re8(Arrays.copyOf(this.q, i), this.r);
        }
        throw new IllegalArgumentException();
    }

    public final String f(int i) {
        int i2 = this.r;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h(i);
        return this.q[i];
    }

    public final void h(int i) {
        if (i < 0 || i >= this.r) {
            throw new IndexOutOfBoundsException(f(i));
        }
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        d();
        h(i);
        Object[] objArr = this.q;
        Object obj = objArr[i];
        if (i < this.r - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.r--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        d();
        h(i);
        Object[] objArr = this.q;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r;
    }
}
