package com.daaw;
/* loaded from: classes.dex */
public final class q37 extends y17 {
    public final transient Object[] r;
    public final transient int s;
    public final transient int t;

    public q37(Object[] objArr, int i, int i2) {
        this.r = objArr;
        this.s = i;
        this.t = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sy6.a(i, this.t, "index");
        Object obj = this.r[i + i + this.s];
        obj.getClass();
        return obj;
    }

    @Override // com.daaw.t17
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.t;
    }
}
