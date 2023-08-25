package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class gu7 extends iq7 implements RandomAccess {

    /* renamed from: s */
    public static final gu7 f11740s;

    /* renamed from: q */
    public Object[] f11741q;

    /* renamed from: r */
    public int f11742r;

    static {
        gu7 gu7Var = new gu7(new Object[0], 0);
        f11740s = gu7Var;
        gu7Var.zzb();
    }

    public gu7(Object[] objArr, int i) {
        this.f11741q = objArr;
        this.f11742r = i;
    }

    /* renamed from: e */
    public static gu7 m21213e() {
        return f11740s;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m19489d();
        if (i < 0 || i > (i2 = this.f11742r)) {
            throw new IndexOutOfBoundsException(m21212f(i));
        }
        Object[] objArr = this.f11741q;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f11741q, i, objArr2, i + 1, this.f11742r - i);
            this.f11741q = objArr2;
        }
        this.f11741q[i] = obj;
        this.f11742r++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m19489d();
        int i = this.f11742r;
        Object[] objArr = this.f11741q;
        if (i == objArr.length) {
            this.f11741q = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f11741q;
        int i2 = this.f11742r;
        this.f11742r = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.daaw.us7
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ us7 mo7741b(int i) {
        if (i >= this.f11742r) {
            return new gu7(Arrays.copyOf(this.f11741q, i), this.f11742r);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public final String m21212f(int i) {
        int i2 = this.f11742r;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m21211h(i);
        return this.f11741q[i];
    }

    /* renamed from: h */
    public final void m21211h(int i) {
        if (i < 0 || i >= this.f11742r) {
            throw new IndexOutOfBoundsException(m21212f(i));
        }
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m19489d();
        m21211h(i);
        Object[] objArr = this.f11741q;
        Object obj = objArr[i];
        if (i < this.f11742r - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f11742r--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m19489d();
        m21211h(i);
        Object[] objArr = this.f11741q;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11742r;
    }
}
