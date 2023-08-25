package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes2.dex */
public final class g98 extends z48 implements RandomAccess, ne8 {
    public static final g98 s;
    public float[] q;
    public int r;

    static {
        g98 g98Var = new g98(new float[0], 0);
        s = g98Var;
        g98Var.zzb();
    }

    public g98() {
        this(new float[10], 0);
    }

    public g98(float[] fArr, int i) {
        this.q = fArr;
        this.r = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        d();
        if (i < 0 || i > (i2 = this.r)) {
            throw new IndexOutOfBoundsException(f(i));
        }
        float[] fArr = this.q;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.q, i, fArr2, i + 1, this.r - i);
            this.q = fArr2;
        }
        this.q[i] = floatValue;
        this.r++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Float) obj).floatValue());
        return true;
    }

    @Override // com.daaw.z48, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        gb8.e(collection);
        if (collection instanceof g98) {
            g98 g98Var = (g98) collection;
            int i = g98Var.r;
            if (i == 0) {
                return false;
            }
            int i2 = this.r;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                float[] fArr = this.q;
                if (i3 > fArr.length) {
                    this.q = Arrays.copyOf(fArr, i3);
                }
                System.arraycopy(g98Var.q, 0, this.q, this.r, g98Var.r);
                this.r = i3;
                ((AbstractList) this).modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
        return super.addAll(collection);
    }

    @Override // com.daaw.db8
    public final /* bridge */ /* synthetic */ db8 b(int i) {
        if (i >= this.r) {
            return new g98(Arrays.copyOf(this.q, i), this.r);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(float f) {
        d();
        int i = this.r;
        float[] fArr = this.q;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.q = fArr2;
        }
        float[] fArr3 = this.q;
        int i2 = this.r;
        this.r = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g98) {
            g98 g98Var = (g98) obj;
            if (this.r != g98Var.r) {
                return false;
            }
            float[] fArr = g98Var.q;
            for (int i = 0; i < this.r; i++) {
                if (Float.floatToIntBits(this.q[i]) != Float.floatToIntBits(fArr[i])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    public final String f(int i) {
        int i2 = this.r;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        h(i);
        return Float.valueOf(this.q[i]);
    }

    public final void h(int i) {
        if (i < 0 || i >= this.r) {
            throw new IndexOutOfBoundsException(f(i));
        }
    }

    @Override // com.daaw.z48, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.r; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.q[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i = this.r;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.q[i2] == floatValue) {
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
        d();
        h(i);
        float[] fArr = this.q;
        float f = fArr[i];
        if (i < this.r - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.r--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.q;
        System.arraycopy(fArr, i2, fArr, i, this.r - i2);
        this.r -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        d();
        h(i);
        float[] fArr = this.q;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.r;
    }
}
