package com.daaw;

import java.util.Iterator;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class s37 extends d27 {
    public static final Object[] w;
    public static final s37 x;
    public final transient Object[] r;
    public final transient int s;
    public final transient Object[] t;
    public final transient int u;
    public final transient int v;

    static {
        Object[] objArr = new Object[0];
        w = objArr;
        x = new s37(objArr, 0, objArr, 0, 0);
    }

    public s37(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.r = objArr;
        this.s = i;
        this.t = objArr2;
        this.u = i2;
        this.v = i3;
    }

    @Override // com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.t;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b = q17.b(obj);
        while (true) {
            int i = b & this.u;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b = i + 1;
        }
    }

    @Override // com.daaw.t17
    public final int d(Object[] objArr, int i) {
        System.arraycopy(this.r, 0, objArr, i, this.v);
        return i + this.v;
    }

    @Override // com.daaw.t17
    public final int e() {
        return this.v;
    }

    @Override // com.daaw.t17
    public final int f() {
        return 0;
    }

    @Override // com.daaw.d27, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.s;
    }

    @Override // com.daaw.d27, com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // com.daaw.d27, com.daaw.t17
    public final c47 j() {
        return h().listIterator(0);
    }

    @Override // com.daaw.t17
    public final Object[] m() {
        return this.r;
    }

    @Override // com.daaw.d27
    public final y17 o() {
        return y17.q(this.r, this.v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.v;
    }

    @Override // com.daaw.d27
    public final boolean w() {
        return true;
    }
}
