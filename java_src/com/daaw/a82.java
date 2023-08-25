package com.daaw;
/* loaded from: classes2.dex */
public final class a82 extends rt8 {
    public final transient Object[] r;
    public final transient int s;
    public final transient int t;

    public a82(Object[] objArr, int i, int i2) {
        this.r = objArr;
        this.s = i;
        this.t = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jf8.a(i, this.t, "index");
        Object obj = this.r[i + i + this.s];
        obj.getClass();
        return obj;
    }

    @Override // com.daaw.aq8
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.t;
    }
}
