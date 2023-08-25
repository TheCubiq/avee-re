package com.daaw;

import java.util.Iterator;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class d72 extends py8 {

    /* renamed from: r */
    public final transient ix8 f6574r;

    /* renamed from: s */
    public final transient rt8 f6575s;

    public d72(ix8 ix8Var, rt8 rt8Var) {
        this.f6574r = ix8Var;
        this.f6575s = rt8Var;
    }

    @Override // com.daaw.aq8, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.f6574r.get(obj) != null;
    }

    @Override // com.daaw.aq8
    /* renamed from: d */
    public final int mo9611d(Object[] objArr, int i) {
        return this.f6575s.mo9611d(objArr, 0);
    }

    @Override // com.daaw.py8, com.daaw.aq8
    /* renamed from: h */
    public final rt8 mo10948h() {
        return this.f6575s;
    }

    @Override // com.daaw.aq8, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.f6575s.listIterator(0);
    }

    @Override // com.daaw.aq8
    /* renamed from: j */
    public final ub2 mo10947j() {
        return this.f6575s.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6574r.size();
    }
}
