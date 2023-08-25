package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class g98 extends z48 implements RandomAccess, ne8 {

    /* renamed from: s */
    public static final g98 f10913s;

    /* renamed from: q */
    public float[] f10914q;

    /* renamed from: r */
    public int f10915r;

    static {
        g98 g98Var = new g98(new float[0], 0);
        f10913s = g98Var;
        g98Var.zzb();
    }

    public g98() {
        this(new float[10], 0);
    }

    public g98(float[] fArr, int i) {
        this.f10914q = fArr;
        this.f10915r = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        m2816d();
        if (i < 0 || i > (i2 = this.f10915r)) {
            throw new IndexOutOfBoundsException(m21876f(i));
        }
        float[] fArr = this.f10914q;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f10914q, i, fArr2, i + 1, this.f10915r - i);
            this.f10914q = fArr2;
        }
        this.f10914q[i] = floatValue;
        this.f10915r++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m21877e(((Float) obj).floatValue());
        return true;
    }

    @Override // com.daaw.z48, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m2816d();
        gb8.m21816e(collection);
        if (collection instanceof g98) {
            g98 g98Var = (g98) collection;
            int i = g98Var.f10915r;
            if (i == 0) {
                return false;
            }
            int i2 = this.f10915r;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                float[] fArr = this.f10914q;
                if (i3 > fArr.length) {
                    this.f10914q = Arrays.copyOf(fArr, i3);
                }
                System.arraycopy(g98Var.f10914q, 0, this.f10914q, this.f10915r, g98Var.f10915r);
                this.f10915r = i3;
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
        if (i >= this.f10915r) {
            return new g98(Arrays.copyOf(this.f10914q, i), this.f10915r);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m21877e(float f) {
        m2816d();
        int i = this.f10915r;
        float[] fArr = this.f10914q;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f10914q = fArr2;
        }
        float[] fArr3 = this.f10914q;
        int i2 = this.f10915r;
        this.f10915r = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g98) {
            g98 g98Var = (g98) obj;
            if (this.f10915r != g98Var.f10915r) {
                return false;
            }
            float[] fArr = g98Var.f10914q;
            for (int i = 0; i < this.f10915r; i++) {
                if (Float.floatToIntBits(this.f10914q[i]) != Float.floatToIntBits(fArr[i])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    /* renamed from: f */
    public final String m21876f(int i) {
        int i2 = this.f10915r;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m21875h(i);
        return Float.valueOf(this.f10914q[i]);
    }

    /* renamed from: h */
    public final void m21875h(int i) {
        if (i < 0 || i >= this.f10915r) {
            throw new IndexOutOfBoundsException(m21876f(i));
        }
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f10915r; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f10914q[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i = this.f10915r;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f10914q[i2] == floatValue) {
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
        m21875h(i);
        float[] fArr = this.f10914q;
        float f = fArr[i];
        if (i < this.f10915r - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f10915r--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m2816d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f10914q;
        System.arraycopy(fArr, i2, fArr, i, this.f10915r - i2);
        this.f10915r -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m2816d();
        m21875h(i);
        float[] fArr = this.f10914q;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10915r;
    }
}
