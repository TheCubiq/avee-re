package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class mt7 extends iq7 implements RandomAccess, ts7, eu7 {

    /* renamed from: s */
    public static final mt7 f19148s;

    /* renamed from: q */
    public long[] f19149q;

    /* renamed from: r */
    public int f19150r;

    static {
        mt7 mt7Var = new mt7(new long[0], 0);
        f19148s = mt7Var;
        mt7Var.zzb();
    }

    public mt7() {
        this(new long[10], 0);
    }

    public mt7(long[] jArr, int i) {
        this.f19149q = jArr;
        this.f19150r = i;
    }

    /* renamed from: f */
    public static mt7 m15768f() {
        return f19148s;
    }

    @Override // com.daaw.us7
    /* renamed from: a */
    public final ts7 mo7741b(int i) {
        if (i >= this.f19150r) {
            return new mt7(Arrays.copyOf(this.f19149q, i), this.f19150r);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        m19489d();
        if (i < 0 || i > (i2 = this.f19150r)) {
            throw new IndexOutOfBoundsException(m15766j(i));
        }
        long[] jArr = this.f19149q;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f19149q, i, jArr2, i + 1, this.f19150r - i);
            this.f19149q = jArr2;
        }
        this.f19149q[i] = longValue;
        this.f19150r++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m15767h(((Long) obj).longValue());
        return true;
    }

    @Override // com.daaw.iq7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m19489d();
        vs7.m6816e(collection);
        if (collection instanceof mt7) {
            mt7 mt7Var = (mt7) collection;
            int i = mt7Var.f19150r;
            if (i == 0) {
                return false;
            }
            int i2 = this.f19150r;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                long[] jArr = this.f19149q;
                if (i3 > jArr.length) {
                    this.f19149q = Arrays.copyOf(jArr, i3);
                }
                System.arraycopy(mt7Var.f19149q, 0, this.f19149q, this.f19150r, mt7Var.f19150r);
                this.f19150r = i3;
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

    /* renamed from: e */
    public final long m15769e(int i) {
        m15765k(i);
        return this.f19149q[i];
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mt7) {
            mt7 mt7Var = (mt7) obj;
            if (this.f19150r != mt7Var.f19150r) {
                return false;
            }
            long[] jArr = mt7Var.f19149q;
            for (int i = 0; i < this.f19150r; i++) {
                if (this.f19149q[i] != jArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m15765k(i);
        return Long.valueOf(this.f19149q[i]);
    }

    /* renamed from: h */
    public final void m15767h(long j) {
        m19489d();
        int i = this.f19150r;
        long[] jArr = this.f19149q;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f19149q = jArr2;
        }
        long[] jArr3 = this.f19149q;
        int i2 = this.f19150r;
        this.f19150r = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f19150r; i2++) {
            i = (i * 31) + vs7.m6818c(this.f19149q[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int i = this.f19150r;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f19149q[i2] == longValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: j */
    public final String m15766j(int i) {
        int i2 = this.f19150r;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: k */
    public final void m15765k(int i) {
        if (i < 0 || i >= this.f19150r) {
            throw new IndexOutOfBoundsException(m15766j(i));
        }
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m19489d();
        m15765k(i);
        long[] jArr = this.f19149q;
        long j = jArr[i];
        if (i < this.f19150r - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f19150r--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m19489d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f19149q;
        System.arraycopy(jArr, i2, jArr, i, this.f19150r - i2);
        this.f19150r -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        m19489d();
        m15765k(i);
        long[] jArr = this.f19149q;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19150r;
    }
}
