package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class mq7 extends iq7 implements RandomAccess, eu7 {

    /* renamed from: s */
    public static final mq7 f19080s;

    /* renamed from: q */
    public boolean[] f19081q;

    /* renamed from: r */
    public int f19082r;

    static {
        mq7 mq7Var = new mq7(new boolean[0], 0);
        f19080s = mq7Var;
        mq7Var.zzb();
    }

    public mq7() {
        this(new boolean[10], 0);
    }

    public mq7(boolean[] zArr, int i) {
        this.f19081q = zArr;
        this.f19082r = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m19489d();
        if (i < 0 || i > (i2 = this.f19082r)) {
            throw new IndexOutOfBoundsException(m15836f(i));
        }
        boolean[] zArr = this.f19081q;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f19081q, i, zArr2, i + 1, this.f19082r - i);
            this.f19081q = zArr2;
        }
        this.f19081q[i] = booleanValue;
        this.f19082r++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m15837e(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.daaw.iq7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m19489d();
        vs7.m6816e(collection);
        if (collection instanceof mq7) {
            mq7 mq7Var = (mq7) collection;
            int i = mq7Var.f19082r;
            if (i == 0) {
                return false;
            }
            int i2 = this.f19082r;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                boolean[] zArr = this.f19081q;
                if (i3 > zArr.length) {
                    this.f19081q = Arrays.copyOf(zArr, i3);
                }
                System.arraycopy(mq7Var.f19081q, 0, this.f19081q, this.f19082r, mq7Var.f19082r);
                this.f19082r = i3;
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
        if (i >= this.f19082r) {
            return new mq7(Arrays.copyOf(this.f19081q, i), this.f19082r);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m15837e(boolean z) {
        m19489d();
        int i = this.f19082r;
        boolean[] zArr = this.f19081q;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f19081q = zArr2;
        }
        boolean[] zArr3 = this.f19081q;
        int i2 = this.f19082r;
        this.f19082r = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mq7) {
            mq7 mq7Var = (mq7) obj;
            if (this.f19082r != mq7Var.f19082r) {
                return false;
            }
            boolean[] zArr = mq7Var.f19081q;
            for (int i = 0; i < this.f19082r; i++) {
                if (this.f19081q[i] != zArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    /* renamed from: f */
    public final String m15836f(int i) {
        int i2 = this.f19082r;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m15835h(i);
        return Boolean.valueOf(this.f19081q[i]);
    }

    /* renamed from: h */
    public final void m15835h(int i) {
        if (i < 0 || i >= this.f19082r) {
            throw new IndexOutOfBoundsException(m15836f(i));
        }
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f19082r; i2++) {
            i = (i * 31) + vs7.m6820a(this.f19081q[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Boolean) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            int i = this.f19082r;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f19081q[i2] == booleanValue) {
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
        m15835h(i);
        boolean[] zArr = this.f19081q;
        boolean z = zArr[i];
        if (i < this.f19082r - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f19082r--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m19489d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f19081q;
        System.arraycopy(zArr, i2, zArr, i, this.f19082r - i2);
        this.f19082r -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        m19489d();
        m15835h(i);
        boolean[] zArr = this.f19081q;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19082r;
    }
}
