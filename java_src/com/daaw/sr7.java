package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class sr7 extends iq7 implements RandomAccess, eu7 {

    /* renamed from: s */
    public static final sr7 f26578s;

    /* renamed from: q */
    public double[] f26579q;

    /* renamed from: r */
    public int f26580r;

    static {
        sr7 sr7Var = new sr7(new double[0], 0);
        f26578s = sr7Var;
        sr7Var.zzb();
    }

    public sr7() {
        this(new double[10], 0);
    }

    public sr7(double[] dArr, int i) {
        this.f26579q = dArr;
        this.f26580r = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        m19489d();
        if (i < 0 || i > (i2 = this.f26580r)) {
            throw new IndexOutOfBoundsException(m9933f(i));
        }
        double[] dArr = this.f26579q;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f26579q, i, dArr2, i + 1, this.f26580r - i);
            this.f26579q = dArr2;
        }
        this.f26579q[i] = doubleValue;
        this.f26580r++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9934e(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.daaw.iq7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m19489d();
        vs7.m6816e(collection);
        if (collection instanceof sr7) {
            sr7 sr7Var = (sr7) collection;
            int i = sr7Var.f26580r;
            if (i == 0) {
                return false;
            }
            int i2 = this.f26580r;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                double[] dArr = this.f26579q;
                if (i3 > dArr.length) {
                    this.f26579q = Arrays.copyOf(dArr, i3);
                }
                System.arraycopy(sr7Var.f26579q, 0, this.f26579q, this.f26580r, sr7Var.f26580r);
                this.f26580r = i3;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // com.daaw.us7
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ us7 mo7741b(int i) {
        if (i >= this.f26580r) {
            return new sr7(Arrays.copyOf(this.f26579q, i), this.f26580r);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m9934e(double d) {
        m19489d();
        int i = this.f26580r;
        double[] dArr = this.f26579q;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f26579q = dArr2;
        }
        double[] dArr3 = this.f26579q;
        int i2 = this.f26580r;
        this.f26580r = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sr7) {
            sr7 sr7Var = (sr7) obj;
            if (this.f26580r != sr7Var.f26580r) {
                return false;
            }
            double[] dArr = sr7Var.f26579q;
            for (int i = 0; i < this.f26580r; i++) {
                if (Double.doubleToLongBits(this.f26579q[i]) != Double.doubleToLongBits(dArr[i])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    /* renamed from: f */
    public final String m9933f(int i) {
        int i2 = this.f26580r;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m9932h(i);
        return Double.valueOf(this.f26579q[i]);
    }

    /* renamed from: h */
    public final void m9932h(int i) {
        if (i < 0 || i >= this.f26580r) {
            throw new IndexOutOfBoundsException(m9933f(i));
        }
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f26580r; i2++) {
            i = (i * 31) + vs7.m6818c(Double.doubleToLongBits(this.f26579q[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int i = this.f26580r;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f26579q[i2] == doubleValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m19489d();
        m9932h(i);
        double[] dArr = this.f26579q;
        double d = dArr[i];
        if (i < this.f26580r - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f26580r--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m19489d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f26579q;
        System.arraycopy(dArr, i2, dArr, i, this.f26580r - i2);
        this.f26580r -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        m19489d();
        m9932h(i);
        double[] dArr = this.f26579q;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26580r;
    }
}
