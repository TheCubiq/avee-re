package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class ms7 extends iq7 implements RandomAccess, qs7, eu7 {

    /* renamed from: s */
    public static final ms7 f19132s;

    /* renamed from: q */
    public int[] f19133q;

    /* renamed from: r */
    public int f19134r;

    static {
        ms7 ms7Var = new ms7(new int[0], 0);
        f19132s = ms7Var;
        ms7Var.zzb();
    }

    public ms7() {
        this(new int[10], 0);
    }

    public ms7(int[] iArr, int i) {
        this.f19133q = iArr;
        this.f19134r = i;
    }

    /* renamed from: f */
    public static ms7 m15789f() {
        return f19132s;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        m19489d();
        if (i < 0 || i > (i2 = this.f19134r)) {
            throw new IndexOutOfBoundsException(m15788h(i));
        }
        int[] iArr = this.f19133q;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f19133q, i, iArr2, i + 1, this.f19134r - i);
            this.f19133q = iArr2;
        }
        this.f19133q[i] = intValue;
        this.f19134r++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo12226i(((Integer) obj).intValue());
        return true;
    }

    @Override // com.daaw.iq7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m19489d();
        vs7.m6816e(collection);
        if (collection instanceof ms7) {
            ms7 ms7Var = (ms7) collection;
            int i = ms7Var.f19134r;
            if (i == 0) {
                return false;
            }
            int i2 = this.f19134r;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                int[] iArr = this.f19133q;
                if (i3 > iArr.length) {
                    this.f19133q = Arrays.copyOf(iArr, i3);
                }
                System.arraycopy(ms7Var.f19133q, 0, this.f19133q, this.f19134r, ms7Var.f19134r);
                this.f19134r = i3;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // com.daaw.us7
    /* renamed from: c */
    public final qs7 mo7741b(int i) {
        if (i >= this.f19134r) {
            return new ms7(Arrays.copyOf(this.f19133q, i), this.f19134r);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final int m15790e(int i) {
        m15787j(i);
        return this.f19133q[i];
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ms7) {
            ms7 ms7Var = (ms7) obj;
            if (this.f19134r != ms7Var.f19134r) {
                return false;
            }
            int[] iArr = ms7Var.f19133q;
            for (int i = 0; i < this.f19134r; i++) {
                if (this.f19133q[i] != iArr[i]) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m15787j(i);
        return Integer.valueOf(this.f19133q[i]);
    }

    /* renamed from: h */
    public final String m15788h(int i) {
        int i2 = this.f19134r;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f19134r; i2++) {
            i = (i * 31) + this.f19133q[i2];
        }
        return i;
    }

    @Override // com.daaw.qs7
    /* renamed from: i */
    public final void mo12226i(int i) {
        m19489d();
        int i2 = this.f19134r;
        int[] iArr = this.f19133q;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f19133q = iArr2;
        }
        int[] iArr3 = this.f19133q;
        int i3 = this.f19134r;
        this.f19134r = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int i = this.f19134r;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f19133q[i2] == intValue) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    /* renamed from: j */
    public final void m15787j(int i) {
        if (i < 0 || i >= this.f19134r) {
            throw new IndexOutOfBoundsException(m15788h(i));
        }
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        m19489d();
        m15787j(i);
        int[] iArr = this.f19133q;
        int i3 = iArr[i];
        if (i < this.f19134r - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f19134r--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m19489d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f19133q;
        System.arraycopy(iArr, i2, iArr, i, this.f19134r - i2);
        this.f19134r -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        m19489d();
        m15787j(i);
        int[] iArr = this.f19133q;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19134r;
    }
}
