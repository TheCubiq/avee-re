package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class c88 extends z48 implements RandomAccess, ne8 {
    public static final c88 s;
    public double[] q;
    public int r;

    static {
        c88 c88Var = new c88(new double[0], 0);
        s = c88Var;
        c88Var.zzb();
    }

    public c88() {
        this(new double[10], 0);
    }

    public c88(double[] dArr, int i) {
        this.q = dArr;
        this.r = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        d();
        if (i < 0 || i > (i2 = this.r)) {
            throw new IndexOutOfBoundsException(f(i));
        }
        double[] dArr = this.q;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.q, i, dArr2, i + 1, this.r - i);
            this.q = dArr2;
        }
        this.q[i] = doubleValue;
        this.r++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.daaw.z48, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        gb8.e(collection);
        if (collection instanceof c88) {
            c88 c88Var = (c88) collection;
            int i = c88Var.r;
            if (i == 0) {
                return false;
            }
            int i2 = this.r;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                double[] dArr = this.q;
                if (i3 > dArr.length) {
                    this.q = Arrays.copyOf(dArr, i3);
                }
                System.arraycopy(c88Var.q, 0, this.q, this.r, c88Var.r);
                this.r = i3;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // com.daaw.db8
    public final /* bridge */ /* synthetic */ db8 b(int i) {
        if (i >= this.r) {
            return new c88(Arrays.copyOf(this.q, i), this.r);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(double d) {
        d();
        int i = this.r;
        double[] dArr = this.q;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.q = dArr2;
        }
        double[] dArr3 = this.q;
        int i2 = this.r;
        this.r = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c88) {
            c88 c88Var = (c88) obj;
            if (this.r != c88Var.r) {
                return false;
            }
            double[] dArr = c88Var.q;
            for (int i = 0; i < this.r; i++) {
                if (Double.doubleToLongBits(this.q[i]) != Double.doubleToLongBits(dArr[i])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final String f(int i) {
        int i2 = this.r;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        h(i);
        return Double.valueOf(this.q[i]);
    }

    public final void h(int i) {
        if (i < 0 || i >= this.r) {
            throw new IndexOutOfBoundsException(f(i));
        }
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.r; i2++) {
            i = (i * 31) + gb8.c(Double.doubleToLongBits(this.q[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i = this.r;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.q[i2] == doubleValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        d();
        h(i);
        double[] dArr = this.q;
        double d = dArr[i];
        if (i < this.r - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.r--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.q;
        System.arraycopy(dArr, i2, dArr, i, this.r - i2);
        this.r -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        d();
        h(i);
        double[] dArr = this.q;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r;
    }
}
