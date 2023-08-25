package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class c88 extends z48 implements RandomAccess, ne8 {

    /* renamed from: s */
    public static final c88 f5624s;

    /* renamed from: q */
    public double[] f5625q;

    /* renamed from: r */
    public int f5626r;

    static {
        c88 c88Var = new c88(new double[0], 0);
        f5624s = c88Var;
        c88Var.zzb();
    }

    public c88() {
        this(new double[10], 0);
    }

    public c88(double[] dArr, int i) {
        this.f5625q = dArr;
        this.f5626r = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        m2816d();
        if (i < 0 || i > (i2 = this.f5626r)) {
            throw new IndexOutOfBoundsException(m25508f(i));
        }
        double[] dArr = this.f5625q;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f5625q, i, dArr2, i + 1, this.f5626r - i);
            this.f5625q = dArr2;
        }
        this.f5625q[i] = doubleValue;
        this.f5626r++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m25509e(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.daaw.z48, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m2816d();
        gb8.m21816e(collection);
        if (collection instanceof c88) {
            c88 c88Var = (c88) collection;
            int i = c88Var.f5626r;
            if (i == 0) {
                return false;
            }
            int i2 = this.f5626r;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                double[] dArr = this.f5625q;
                if (i3 > dArr.length) {
                    this.f5625q = Arrays.copyOf(dArr, i3);
                }
                System.arraycopy(c88Var.f5625q, 0, this.f5625q, this.f5626r, c88Var.f5626r);
                this.f5626r = i3;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // com.daaw.db8
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ db8 mo5295b(int i) {
        if (i >= this.f5626r) {
            return new c88(Arrays.copyOf(this.f5625q, i), this.f5626r);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m25509e(double d) {
        m2816d();
        int i = this.f5626r;
        double[] dArr = this.f5625q;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f5625q = dArr2;
        }
        double[] dArr3 = this.f5625q;
        int i2 = this.f5626r;
        this.f5626r = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c88) {
            c88 c88Var = (c88) obj;
            if (this.f5626r != c88Var.f5626r) {
                return false;
            }
            double[] dArr = c88Var.f5625q;
            for (int i = 0; i < this.f5626r; i++) {
                if (Double.doubleToLongBits(this.f5625q[i]) != Double.doubleToLongBits(dArr[i])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    /* renamed from: f */
    public final String m25508f(int i) {
        int i2 = this.f5626r;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m25507h(i);
        return Double.valueOf(this.f5625q[i]);
    }

    /* renamed from: h */
    public final void m25507h(int i) {
        if (i < 0 || i >= this.f5626r) {
            throw new IndexOutOfBoundsException(m25508f(i));
        }
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f5626r; i2++) {
            i = (i * 31) + gb8.m21818c(Double.doubleToLongBits(this.f5625q[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i = this.f5626r;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f5625q[i2] == doubleValue) {
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
        m2816d();
        m25507h(i);
        double[] dArr = this.f5625q;
        double d = dArr[i];
        if (i < this.f5626r - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f5626r--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m2816d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f5625q;
        System.arraycopy(dArr, i2, dArr, i, this.f5626r - i2);
        this.f5626r -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m2816d();
        m25507h(i);
        double[] dArr = this.f5625q;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5626r;
    }
}
