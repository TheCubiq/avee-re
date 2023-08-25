package com.daaw;

import java.util.AbstractMap;
/* loaded from: classes.dex */
public final class n37 extends y17 {
    public final /* synthetic */ o37 r;

    public n37(o37 o37Var) {
        this.r = o37Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.r.t;
        sy6.a(i, i2, "index");
        o37 o37Var = this.r;
        int i3 = i + i;
        objArr = o37Var.s;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = o37Var.s;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.daaw.t17
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.r.t;
        return i;
    }
}
