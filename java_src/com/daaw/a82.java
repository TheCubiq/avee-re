package com.daaw;
/* loaded from: classes2.dex */
public final class a82 extends rt8 {

    /* renamed from: r */
    public final transient Object[] f2988r;

    /* renamed from: s */
    public final transient int f2989s;

    /* renamed from: t */
    public final transient int f2990t;

    public a82(Object[] objArr, int i, int i2) {
        this.f2988r = objArr;
        this.f2989s = i;
        this.f2990t = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jf8.m18536a(i, this.f2990t, "index");
        Object obj = this.f2988r[i + i + this.f2989s];
        obj.getClass();
        return obj;
    }

    @Override // com.daaw.aq8
    /* renamed from: k */
    public final boolean mo9608k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2990t;
    }
}
