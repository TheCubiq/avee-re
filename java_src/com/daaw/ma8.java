package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class ma8 extends z48 implements RandomAccess, xa8, ne8 {

    /* renamed from: s */
    public static final ma8 f18733s;

    /* renamed from: q */
    public int[] f18734q;

    /* renamed from: r */
    public int f18735r;

    static {
        ma8 ma8Var = new ma8(new int[0], 0);
        f18733s = ma8Var;
        ma8Var.zzb();
    }

    public ma8() {
        this(new int[10], 0);
    }

    public ma8(int[] iArr, int i) {
        this.f18734q = iArr;
        this.f18735r = i;
    }

    /* renamed from: f */
    public static ma8 m16125f() {
        return f18733s;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        m2816d();
        if (i < 0 || i > (i2 = this.f18735r)) {
            throw new IndexOutOfBoundsException(m16124h(i));
        }
        int[] iArr = this.f18734q;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f18734q, i, iArr2, i + 1, this.f18735r - i);
            this.f18734q = iArr2;
        }
        this.f18734q[i] = intValue;
        this.f18735r++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m16123i(((Integer) obj).intValue());
        return true;
    }

    @Override // com.daaw.z48, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m2816d();
        gb8.m21816e(collection);
        if (collection instanceof ma8) {
            ma8 ma8Var = (ma8) collection;
            int i = ma8Var.f18735r;
            if (i == 0) {
                return false;
            }
            int i2 = this.f18735r;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                int[] iArr = this.f18734q;
                if (i3 > iArr.length) {
                    this.f18734q = Arrays.copyOf(iArr, i3);
                }
                System.arraycopy(ma8Var.f18734q, 0, this.f18734q, this.f18735r, ma8Var.f18735r);
                this.f18735r = i3;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // com.daaw.db8
    /* renamed from: c */
    public final xa8 mo5295b(int i) {
        if (i >= this.f18735r) {
            return new ma8(Arrays.copyOf(this.f18734q, i), this.f18735r);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final int m16126e(int i) {
        m16122j(i);
        return this.f18734q[i];
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ma8) {
            ma8 ma8Var = (ma8) obj;
            if (this.f18735r != ma8Var.f18735r) {
                return false;
            }
            int[] iArr = ma8Var.f18734q;
            for (int i = 0; i < this.f18735r; i++) {
                if (this.f18734q[i] != iArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m16122j(i);
        return Integer.valueOf(this.f18734q[i]);
    }

    /* renamed from: h */
    public final String m16124h(int i) {
        int i2 = this.f18735r;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f18735r; i2++) {
            i = (i * 31) + this.f18734q[i2];
        }
        return i;
    }

    /* renamed from: i */
    public final void m16123i(int i) {
        m2816d();
        int i2 = this.f18735r;
        int[] iArr = this.f18734q;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f18734q = iArr2;
        }
        int[] iArr3 = this.f18734q;
        int i3 = this.f18735r;
        this.f18735r = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.f18735r;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f18734q[i2] == intValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: j */
    public final void m16122j(int i) {
        if (i < 0 || i >= this.f18735r) {
            throw new IndexOutOfBoundsException(m16124h(i));
        }
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m2816d();
        m16122j(i);
        int[] iArr = this.f18734q;
        int i3 = iArr[i];
        if (i < this.f18735r - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f18735r--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m2816d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f18734q;
        System.arraycopy(iArr, i2, iArr, i, this.f18735r - i2);
        this.f18735r -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m2816d();
        m16122j(i);
        int[] iArr = this.f18734q;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18735r;
    }
}
