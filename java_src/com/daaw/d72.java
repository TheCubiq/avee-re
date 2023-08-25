package com.daaw;

import java.util.Iterator;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class d72 extends py8 {
    public final transient ix8 r;
    public final transient rt8 s;

    public d72(ix8 ix8Var, rt8 rt8Var) {
        this.r = ix8Var;
        this.s = rt8Var;
    }

    @Override // com.daaw.aq8, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.r.get(obj) != null;
    }

    @Override // com.daaw.aq8
    public final int d(Object[] objArr, int i) {
        return this.s.d(objArr, 0);
    }

    @Override // com.daaw.py8, com.daaw.aq8
    public final rt8 h() {
        return this.s;
    }

    @Override // com.daaw.aq8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.s.listIterator(0);
    }

    @Override // com.daaw.aq8
    public final ub2 j() {
        return this.s.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.r.size();
    }
}
