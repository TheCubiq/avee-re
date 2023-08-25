package com.daaw;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class cs7 extends iq7 implements RandomAccess, eu7 {

    /* renamed from: s */
    public static final cs7 f6167s;

    /* renamed from: q */
    public float[] f6168q;

    /* renamed from: r */
    public int f6169r;

    static {
        cs7 cs7Var = new cs7(new float[0], 0);
        f6167s = cs7Var;
        cs7Var.zzb();
    }

    public cs7() {
        this(new float[10], 0);
    }

    public cs7(float[] fArr, int i) {
        this.f6168q = fArr;
        this.f6169r = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        m19489d();
        if (i < 0 || i > (i2 = this.f6169r)) {
            throw new IndexOutOfBoundsException(m24987f(i));
        }
        float[] fArr = this.f6168q;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f6168q, i, fArr2, i + 1, this.f6169r - i);
            this.f6168q = fArr2;
        }
        this.f6168q[i] = floatValue;
        this.f6169r++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m24988e(((Float) obj).floatValue());
        return true;
    }

    @Override // com.daaw.iq7, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m19489d();
        vs7.m6816e(collection);
        if (collection instanceof cs7) {
            cs7 cs7Var = (cs7) collection;
            int i = cs7Var.f6169r;
            if (i == 0) {
                return false;
            }
            int i2 = this.f6169r;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                float[] fArr = this.f6168q;
                if (i3 > fArr.length) {
                    this.f6168q = Arrays.copyOf(fArr, i3);
                }
                System.arraycopy(cs7Var.f6168q, 0, this.f6168q, this.f6169r, cs7Var.f6169r);
                this.f6169r = i3;
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
        if (i >= this.f6169r) {
            return new cs7(Arrays.copyOf(this.f6168q, i), this.f6169r);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: e */
    public final void m24988e(float f) {
        m19489d();
        int i = this.f6169r;
        float[] fArr = this.f6168q;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f6168q = fArr2;
        }
        float[] fArr3 = this.f6168q;
        int i2 = this.f6169r;
        this.f6169r = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cs7) {
            cs7 cs7Var = (cs7) obj;
            if (this.f6169r != cs7Var.f6169r) {
                return false;
            }
            float[] fArr = cs7Var.f6168q;
            for (int i = 0; i < this.f6169r; i++) {
                if (Float.floatToIntBits(this.f6168q[i]) != Float.floatToIntBits(fArr[i])) {
                    return false;
                }
            }
            return true;
        }
        return super.equals(obj);
    }

    /* renamed from: f */
    public final String m24987f(int i) {
        int i2 = this.f6169r;
        return "Index:" + i + ", Size:" + i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m24986h(i);
        return Float.valueOf(this.f6168q[i]);
    }

    /* renamed from: h */
    public final void m24986h(int i) {
        if (i < 0 || i >= this.f6169r) {
            throw new IndexOutOfBoundsException(m24987f(i));
        }
    }

    @Override // com.daaw.iq7, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f6169r; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f6168q[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int i = this.f6169r;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.f6168q[i2] == floatValue) {
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
        m24986h(i);
        float[] fArr = this.f6168q;
        float f = fArr[i];
        if (i < this.f6169r - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f6169r--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m19489d();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f6168q;
        System.arraycopy(fArr, i2, fArr, i, this.f6169r - i2);
        this.f6169r -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        m19489d();
        m24986h(i);
        float[] fArr = this.f6168q;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6169r;
    }
}
