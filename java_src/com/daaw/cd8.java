package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class cd8 extends z48 implements RandomAccess, ab8, ne8 {
    public static final cd8 s;
    public long[] q;
    public int r;

    static {
        cd8 cd8Var = new cd8(new long[0], 0);
        s = cd8Var;
        cd8Var.zzb();
    }

    public cd8() {
        this(new long[10], 0);
    }

    public cd8(long[] jArr, int i) {
        this.q = jArr;
        this.r = i;
    }

    public static cd8 e() {
        return s;
    }

    @Override // com.daaw.ab8
    public final long a(int i) {
        j(i);
        return this.q[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        d();
        if (i < 0 || i > (i2 = this.r)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        long[] jArr = this.q;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.q, i, jArr2, i + 1, this.r - i);
            this.q = jArr2;
        }
        this.q[i] = longValue;
        this.r++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }

    @Override // com.daaw.z48, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        gb8.e(collection);
        if (collection instanceof cd8) {
            cd8 cd8Var = (cd8) collection;
            int i = cd8Var.r;
            if (i == 0) {
                return false;
            }
            int i2 = this.r;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                long[] jArr = this.q;
                if (i3 > jArr.length) {
                    this.q = Arrays.copyOf(jArr, i3);
                }
                System.arraycopy(cd8Var.q, 0, this.q, this.r, cd8Var.r);
                this.r = i3;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cd8) {
            cd8 cd8Var = (cd8) obj;
            if (this.r != cd8Var.r) {
                return false;
            }
            long[] jArr = cd8Var.q;
            for (int i = 0; i < this.r; i++) {
                if (this.q[i] != jArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final void f(long j) {
        d();
        int i = this.r;
        long[] jArr = this.q;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.q = jArr2;
        }
        long[] jArr3 = this.q;
        int i2 = this.r;
        this.r = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        j(i);
        return Long.valueOf(this.q[i]);
    }

    public final String h(int i) {
        int i2 = this.r;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.r; i2++) {
            i = (i * 31) + gb8.c(this.q[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i = this.r;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.q[i2] == longValue) {
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

    @Override // com.daaw.z48, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        d();
        j(i);
        long[] jArr = this.q;
        long j = jArr[i];
        if (i < this.r - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.r--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.q;
        System.arraycopy(jArr, i2, jArr, i, this.r - i2);
        this.r -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        d();
        j(i);
        long[] jArr = this.q;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r;
    }

    @Override // com.daaw.db8
    /* renamed from: zze */
    public final ab8 b(int i) {
        if (i >= this.r) {
            return new cd8(Arrays.copyOf(this.q, i), this.r);
        }
        throw new IllegalArgumentException();
    }
}
