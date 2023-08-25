package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class mt7 extends iq7 implements RandomAccess, ts7, eu7 {
    public static final mt7 s;
    public long[] q;
    public int r;

    static {
        mt7 mt7Var = new mt7(new long[0], 0);
        s = mt7Var;
        mt7Var.zzb();
    }

    public mt7() {
        this(new long[10], 0);
    }

    public mt7(long[] jArr, int i) {
        this.q = jArr;
        this.r = i;
    }

    public static mt7 f() {
        return s;
    }

    @Override // com.daaw.us7
    /* renamed from: a */
    public final ts7 b(int i) {
        if (i >= this.r) {
            return new mt7(Arrays.copyOf(this.q, i), this.r);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        d();
        if (i < 0 || i > (i2 = this.r)) {
            throw new IndexOutOfBoundsException(j(i));
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

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Long) obj).longValue());
        return true;
    }

    @Override // com.daaw.iq7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        vs7.e(collection);
        if (collection instanceof mt7) {
            mt7 mt7Var = (mt7) collection;
            int i = mt7Var.r;
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
                System.arraycopy(mt7Var.q, 0, this.q, this.r, mt7Var.r);
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

    public final long e(int i) {
        k(i);
        return this.q[i];
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mt7) {
            mt7 mt7Var = (mt7) obj;
            if (this.r != mt7Var.r) {
                return false;
            }
            long[] jArr = mt7Var.q;
            for (int i = 0; i < this.r; i++) {
                if (this.q[i] != jArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        k(i);
        return Long.valueOf(this.q[i]);
    }

    public final void h(long j) {
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

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.r; i2++) {
            i = (i * 31) + vs7.c(this.q[i2]);
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

    public final String j(int i) {
        int i2 = this.r;
        return "Index:" + i + ", Size:" + i2;
    }

    public final void k(int i) {
        if (i < 0 || i >= this.r) {
            throw new IndexOutOfBoundsException(j(i));
        }
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        d();
        k(i);
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
        k(i);
        long[] jArr = this.q;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r;
    }
}
