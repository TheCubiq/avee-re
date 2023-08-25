package com.daaw;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class h62 extends py8 {

    /* renamed from: r */
    public final transient ix8 f12093r;

    /* renamed from: s */
    public final transient Object[] f12094s;

    /* renamed from: t */
    public final transient int f12095t;

    public h62(ix8 ix8Var, Object[] objArr, int i, int i2) {
        this.f12093r = ix8Var;
        this.f12094s = objArr;
        this.f12095t = i2;
    }

    @Override // com.daaw.aq8, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f12093r.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.aq8
    /* renamed from: d */
    public final int mo9611d(Object[] objArr, int i) {
        return mo10948h().mo9611d(objArr, 0);
    }

    @Override // com.daaw.aq8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return mo10948h().listIterator(0);
    }

    @Override // com.daaw.aq8
    /* renamed from: j */
    public final ub2 mo10947j() {
        return mo10948h().listIterator(0);
    }

    @Override // com.daaw.py8
    /* renamed from: n */
    public final rt8 mo12850n() {
        return new a52(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12095t;
    }
}
