package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class cd8 extends z48 implements RandomAccess, ab8, ne8 {

    /* renamed from: s */
    public static final cd8 f5748s;

    /* renamed from: q */
    public long[] f5749q;

    /* renamed from: r */
    public int f5750r;

    static {
        cd8 cd8Var = new cd8(new long[0], 0);
        f5748s = cd8Var;
        cd8Var.zzb();
    }

    public cd8() {
        this(new long[10], 0);
    }

    public cd8(long[] jArr, int i) {
        this.f5749q = jArr;
        this.f5750r = i;
    }

    /* renamed from: e */
    public static cd8 m25415e() {
        return f5748s;
    }

    @Override // com.daaw.ab8
    /* renamed from: a */
    public final long mo25416a(int i) {
        m25412j(i);
        return this.f5749q[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        m2816d();
        if (i < 0 || i > (i2 = this.f5750r)) {
            throw new IndexOutOfBoundsException(m25413h(i));
        }
        long[] jArr = this.f5749q;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f5749q, i, jArr2, i + 1, this.f5750r - i);
            this.f5749q = jArr2;
        }
        this.f5749q[i] = longValue;
        this.f5750r++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m25414f(((Long) obj).longValue());
        return true;
    }

    @Override // com.daaw.z48, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m2816d();
        gb8.m21816e(collection);
        if (collection instanceof cd8) {
            cd8 cd8Var = (cd8) collection;
            int i = cd8Var.f5750r;
            if (i == 0) {
                return false;
            }
            int i2 = this.f5750r;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                long[] jArr = this.f5749q;
                if (i3 > jArr.length) {
                    this.f5749q = Arrays.copyOf(jArr, i3);
                }
                System.arraycopy(cd8Var.f5749q, 0, this.f5749q, this.f5750r, cd8Var.f5750r);
                this.f5750r = i3;
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
            if (this.f5750r != cd8Var.f5750r) {
                return false;
            }
            long[] jArr = cd8Var.f5749q;
            for (int i = 0; i < this.f5750r; i++) {
                if (this.f5749q[i] != jArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    /* renamed from: f */
    public final void m25414f(long j) {
        m2816d();
        int i = this.f5750r;
        long[] jArr = this.f5749q;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f5749q = jArr2;
        }
        long[] jArr3 = this.f5749q;
        int i2 = this.f5750r;
        this.f5750r = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m25412j(i);
        return Long.valueOf(this.f5749q[i]);
    }

    /* renamed from: h */
    public final String m25413h(int i) {
        int i2 = this.f5750r;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f5750r; i2++) {
            i = (i * 31) + gb8.m21818c(this.f5749q[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i = this.f5750r;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f5749q[i2] == longValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: j */
    public final void m25412j(int i) {
        if (i < 0 || i >= this.f5750r) {
            throw new IndexOutOfBoundsException(m25413h(i));
        }
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m2816d();
        m25412j(i);
        long[] jArr = this.f5749q;
        long j = jArr[i];
        if (i < this.f5750r - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f5750r--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m2816d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f5749q;
        System.arraycopy(jArr, i2, jArr, i, this.f5750r - i2);
        this.f5750r -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m2816d();
        m25412j(i);
        long[] jArr = this.f5749q;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5750r;
    }

    @Override // com.daaw.db8
    /* renamed from: zze */
    public final ab8 mo5295b(int i) {
        if (i >= this.f5750r) {
            return new cd8(Arrays.copyOf(this.f5749q, i), this.f5750r);
        }
        throw new IllegalArgumentException();
    }
}
