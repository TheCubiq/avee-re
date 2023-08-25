package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class k58 extends z48 implements RandomAccess, ne8 {

    /* renamed from: s */
    public static final k58 f15691s;

    /* renamed from: q */
    public boolean[] f15692q;

    /* renamed from: r */
    public int f15693r;

    static {
        k58 k58Var = new k58(new boolean[0], 0);
        f15691s = k58Var;
        k58Var.zzb();
    }

    public k58() {
        this(new boolean[10], 0);
    }

    public k58(boolean[] zArr, int i) {
        this.f15692q = zArr;
        this.f15693r = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m2816d();
        if (i < 0 || i > (i2 = this.f15693r)) {
            throw new IndexOutOfBoundsException(m18040f(i));
        }
        boolean[] zArr = this.f15692q;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f15692q, i, zArr2, i + 1, this.f15693r - i);
            this.f15692q = zArr2;
        }
        this.f15692q[i] = booleanValue;
        this.f15693r++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m18041e(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.daaw.z48, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m2816d();
        gb8.m21816e(collection);
        if (collection instanceof k58) {
            k58 k58Var = (k58) collection;
            int i = k58Var.f15693r;
            if (i == 0) {
                return false;
            }
            int i2 = this.f15693r;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                boolean[] zArr = this.f15692q;
                if (i3 > zArr.length) {
                    this.f15692q = Arrays.copyOf(zArr, i3);
                }
                System.arraycopy(k58Var.f15692q, 0, this.f15692q, this.f15693r, k58Var.f15693r);
                this.f15693r = i3;
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
        if (i >= this.f15693r) {
            return new k58(Arrays.copyOf(this.f15692q, i), this.f15693r);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m18041e(boolean z) {
        m2816d();
        int i = this.f15693r;
        boolean[] zArr = this.f15692q;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f15692q = zArr2;
        }
        boolean[] zArr3 = this.f15692q;
        int i2 = this.f15693r;
        this.f15693r = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k58) {
            k58 k58Var = (k58) obj;
            if (this.f15693r != k58Var.f15693r) {
                return false;
            }
            boolean[] zArr = k58Var.f15692q;
            for (int i = 0; i < this.f15693r; i++) {
                if (this.f15692q[i] != zArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    /* renamed from: f */
    public final String m18040f(int i) {
        int i2 = this.f15693r;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m18039h(i);
        return Boolean.valueOf(this.f15692q[i]);
    }

    /* renamed from: h */
    public final void m18039h(int i) {
        if (i < 0 || i >= this.f15693r) {
            throw new IndexOutOfBoundsException(m18040f(i));
        }
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f15693r; i2++) {
            i = (i * 31) + gb8.m21820a(this.f15692q[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i = this.f15693r;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f15692q[i2] == booleanValue) {
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
        m18039h(i);
        boolean[] zArr = this.f15692q;
        boolean z = zArr[i];
        if (i < this.f15693r - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f15693r--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m2816d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f15692q;
        System.arraycopy(zArr, i2, zArr, i, this.f15693r - i2);
        this.f15693r -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m2816d();
        m18039h(i);
        boolean[] zArr = this.f15692q;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15693r;
    }
}
