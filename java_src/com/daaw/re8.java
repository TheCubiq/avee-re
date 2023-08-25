package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class re8 extends z48 implements RandomAccess {

    /* renamed from: s */
    public static final re8 f25223s;

    /* renamed from: q */
    public Object[] f25224q;

    /* renamed from: r */
    public int f25225r;

    static {
        re8 re8Var = new re8(new Object[0], 0);
        f25223s = re8Var;
        re8Var.zzb();
    }

    public re8(Object[] objArr, int i) {
        this.f25224q = objArr;
        this.f25225r = i;
    }

    /* renamed from: e */
    public static re8 m11356e() {
        return f25223s;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m2816d();
        if (i < 0 || i > (i2 = this.f25225r)) {
            throw new IndexOutOfBoundsException(m11355f(i));
        }
        Object[] objArr = this.f25224q;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f25224q, i, objArr2, i + 1, this.f25225r - i);
            this.f25224q = objArr2;
        }
        this.f25224q[i] = obj;
        this.f25225r++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m2816d();
        int i = this.f25225r;
        Object[] objArr = this.f25224q;
        if (i == objArr.length) {
            this.f25224q = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f25224q;
        int i2 = this.f25225r;
        this.f25225r = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.daaw.db8
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ db8 mo5295b(int i) {
        if (i >= this.f25225r) {
            return new re8(Arrays.copyOf(this.f25224q, i), this.f25225r);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    public final String m11355f(int i) {
        int i2 = this.f25225r;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m11354h(i);
        return this.f25224q[i];
    }

    /* renamed from: h */
    public final void m11354h(int i) {
        if (i < 0 || i >= this.f25225r) {
            throw new IndexOutOfBoundsException(m11355f(i));
        }
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        m2816d();
        m11354h(i);
        Object[] objArr = this.f25224q;
        Object obj = objArr[i];
        if (i < this.f25225r - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f25225r--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m2816d();
        m11354h(i);
        Object[] objArr = this.f25224q;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25225r;
    }
}
