package com.daaw;

import java.util.AbstractMap;
/* loaded from: classes.dex */
public final class n37 extends y17 {

    /* renamed from: r */
    public final /* synthetic */ o37 f19453r;

    public n37(o37 o37Var) {
        this.f19453r = o37Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.f19453r.f21016t;
        sy6.m9708a(i, i2, "index");
        o37 o37Var = this.f19453r;
        int i3 = i + i;
        objArr = o37Var.f21015s;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = o37Var.f21015s;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.daaw.t17
    /* renamed from: k */
    public final boolean mo5646k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f19453r.f21016t;
        return i;
    }
}
