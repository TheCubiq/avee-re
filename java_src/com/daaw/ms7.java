package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class ms7 extends iq7 implements RandomAccess, qs7, eu7 {
    public static final ms7 s;
    public int[] q;
    public int r;

    static {
        ms7 ms7Var = new ms7(new int[0], 0);
        s = ms7Var;
        ms7Var.zzb();
    }

    public ms7() {
        this(new int[10], 0);
    }

    public ms7(int[] iArr, int i) {
        this.q = iArr;
        this.r = i;
    }

    public static ms7 f() {
        return s;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        d();
        if (i < 0 || i > (i2 = this.r)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int[] iArr = this.q;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.q, i, iArr2, i + 1, this.r - i);
            this.q = iArr2;
        }
        this.q[i] = intValue;
        this.r++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }

    @Override // com.daaw.iq7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        vs7.e(collection);
        if (collection instanceof ms7) {
            ms7 ms7Var = (ms7) collection;
            int i = ms7Var.r;
            if (i == 0) {
                return false;
            }
            int i2 = this.r;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                int[] iArr = this.q;
                if (i3 > iArr.length) {
                    this.q = Arrays.copyOf(iArr, i3);
                }
                System.arraycopy(ms7Var.q, 0, this.q, this.r, ms7Var.r);
                this.r = i3;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // com.daaw.us7
    /* renamed from: c */
    public final qs7 b(int i) {
        if (i >= this.r) {
            return new ms7(Arrays.copyOf(this.q, i), this.r);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i) {
        j(i);
        return this.q[i];
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ms7) {
            ms7 ms7Var = (ms7) obj;
            if (this.r != ms7Var.r) {
                return false;
            }
            int[] iArr = ms7Var.q;
            for (int i = 0; i < this.r; i++) {
                if (this.q[i] != iArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        j(i);
        return Integer.valueOf(this.q[i]);
    }

    public final String h(int i) {
        int i2 = this.r;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.r; i2++) {
            i = (i * 31) + this.q[i2];
        }
        return i;
    }

    @Override // com.daaw.qs7
    public final void i(int i) {
        d();
        int i2 = this.r;
        int[] iArr = this.q;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.q = iArr2;
        }
        int[] iArr3 = this.q;
        int i3 = this.r;
        this.r = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.r;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.q[i2] == intValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void j(int i) {
        if (i < 0 || i >= this.r) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        d();
        j(i);
        int[] iArr = this.q;
        int i3 = iArr[i];
        if (i < this.r - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.r--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.q;
        System.arraycopy(iArr, i2, iArr, i, this.r - i2);
        this.r -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        d();
        j(i);
        int[] iArr = this.q;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r;
    }
}
