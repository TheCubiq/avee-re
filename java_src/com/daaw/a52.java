package com.daaw;

import java.util.AbstractMap;
/* loaded from: classes2.dex */
public final class a52 extends rt8 {
    public final /* synthetic */ h62 r;

    public a52(h62 h62Var) {
        this.r = h62Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.r.t;
        jf8.a(i, i2, "index");
        h62 h62Var = this.r;
        int i3 = i + i;
        objArr = h62Var.s;
        Object obj = objArr[i3];
        obj.getClass();
        objArr2 = h62Var.s;
        Object obj2 = objArr2[i3 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.daaw.aq8
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
