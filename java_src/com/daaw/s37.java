package com.daaw;

import java.util.Iterator;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class s37 extends d27 {

    /* renamed from: w */
    public static final Object[] f25841w;

    /* renamed from: x */
    public static final s37 f25842x;

    /* renamed from: r */
    public final transient Object[] f25843r;

    /* renamed from: s */
    public final transient int f25844s;

    /* renamed from: t */
    public final transient Object[] f25845t;

    /* renamed from: u */
    public final transient int f25846u;

    /* renamed from: v */
    public final transient int f25847v;

    static {
        Object[] objArr = new Object[0];
        f25841w = objArr;
        f25842x = new s37(objArr, 0, objArr, 0, 0);
    }

    public s37(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f25843r = objArr;
        this.f25844s = i;
        this.f25845t = objArr2;
        this.f25846u = i2;
        this.f25847v = i3;
    }

    @Override // com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Object[] objArr = this.f25845t;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int m12803b = q17.m12803b(obj);
        while (true) {
            int i = m12803b & this.f25846u;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m12803b = i + 1;
        }
    }

    @Override // com.daaw.t17
    /* renamed from: d */
    public final int mo2850d(Object[] objArr, int i) {
        System.arraycopy(this.f25843r, 0, objArr, i, this.f25847v);
        return i + this.f25847v;
    }

    @Override // com.daaw.t17
    /* renamed from: e */
    public final int mo5648e() {
        return this.f25847v;
    }

    @Override // com.daaw.t17
    /* renamed from: f */
    public final int mo5647f() {
        return 0;
    }

    @Override // com.daaw.d27, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f25844s;
    }

    @Override // com.daaw.d27, com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo2849h().listIterator(0);
    }

    @Override // com.daaw.d27, com.daaw.t17
    /* renamed from: j */
    public final c47 mo2848j() {
        return mo2849h().listIterator(0);
    }

    @Override // com.daaw.t17
    /* renamed from: m */
    public final Object[] mo5645m() {
        return this.f25843r;
    }

    @Override // com.daaw.d27
    /* renamed from: o */
    public final y17 mo10727o() {
        return y17.m4264q(this.f25843r, this.f25847v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25847v;
    }

    @Override // com.daaw.d27
    /* renamed from: w */
    public final boolean mo10726w() {
        return true;
    }
}
