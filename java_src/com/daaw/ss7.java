package com.daaw;

import java.util.AbstractList;
import java.util.List;
/* loaded from: classes.dex */
public final class ss7 extends AbstractList {

    /* renamed from: p */
    public final List f26609p;

    /* renamed from: q */
    public final rs7 f26610q;

    public ss7(List list, rs7 rs7Var) {
        this.f26609p = list;
        this.f26610q = rs7Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        y43 m4129a = y43.m4129a(((Integer) this.f26609p.get(i)).intValue());
        return m4129a == null ? y43.AD_FORMAT_TYPE_UNSPECIFIED : m4129a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26609p.size();
    }
}
