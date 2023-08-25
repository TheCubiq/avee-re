package com.daaw;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class o37 extends d27 {
    public final transient b27 r;
    public final transient Object[] s;
    public final transient int t;

    public o37(b27 b27Var, Object[] objArr, int i, int i2) {
        this.r = b27Var;
        this.s = objArr;
        this.t = i2;
    }

    @Override // com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.util.Set
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

    @Override // com.daaw.t17
    public final int d(Object[] objArr, int i) {
        return h().d(objArr, i);
    }

    @Override // com.daaw.d27, com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // com.daaw.d27, com.daaw.t17
    public final c47 j() {
        return h().listIterator(0);
    }

    @Override // com.daaw.d27
    public final y17 o() {
        return new n37(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.t;
    }
}
