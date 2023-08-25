package com.daaw;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class h62 extends py8 {
    public final transient ix8 r;
    public final transient Object[] s;
    public final transient int t;

    public h62(ix8 ix8Var, Object[] objArr, int i, int i2) {
        this.r = ix8Var;
        this.s = objArr;
        this.t = i2;
    }

    @Override // com.daaw.aq8, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.r.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.aq8
    public final int d(Object[] objArr, int i) {
        return h().d(objArr, 0);
    }

    @Override // com.daaw.aq8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // com.daaw.aq8
    public final ub2 j() {
        return h().listIterator(0);
    }

    @Override // com.daaw.py8
    public final rt8 n() {
        return new a52(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.t;
    }
}
