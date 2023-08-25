package com.daaw;
/* loaded from: classes.dex */
public final class q37 extends y17 {

    /* renamed from: r */
    public final transient Object[] f23655r;

    /* renamed from: s */
    public final transient int f23656s;

    /* renamed from: t */
    public final transient int f23657t;

    public q37(Object[] objArr, int i, int i2) {
        this.f23655r = objArr;
        this.f23656s = i;
        this.f23657t = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        sy6.m9708a(i, this.f23657t, "index");
        Object obj = this.f23655r[i + i + this.f23656s];
        obj.getClass();
        return obj;
    }

    @Override // com.daaw.t17
    /* renamed from: k */
    public final boolean mo5646k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23657t;
    }
}
