package com.daaw;

import java.util.Iterator;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class p37 extends d27 {
    public final transient b27 r;
    public final transient y17 s;

    public p37(b27 b27Var, y17 y17Var) {
        this.r = b27Var;
        this.s = y17Var;
    }

    @Override // com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.r.get(obj) != null;
    }

    @Override // com.daaw.t17
    public final int d(Object[] objArr, int i) {
        return this.s.d(objArr, i);
    }

    @Override // com.daaw.d27, com.daaw.t17
    public final y17 h() {
        return this.s;
    }

    @Override // com.daaw.d27, com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.s.listIterator(0);
    }

    @Override // com.daaw.d27, com.daaw.t17
    public final c47 j() {
        return this.s.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.r.size();
    }
}
