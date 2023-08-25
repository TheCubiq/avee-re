package com.daaw;

import java.util.AbstractList;
import java.util.List;
/* loaded from: classes.dex */
public final class ss7 extends AbstractList {
    public final List p;
    public final rs7 q;

    public ss7(List list, rs7 rs7Var) {
        this.p = list;
        this.q = rs7Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        y43 a = y43.a(((Integer) this.p.get(i)).intValue());
        return a == null ? y43.AD_FORMAT_TYPE_UNSPECIFIED : a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.p.size();
    }
}
