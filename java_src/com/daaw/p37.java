package com.daaw;

import java.util.Iterator;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class p37 extends d27 {

    /* renamed from: r */
    public final transient b27 f22576r;

    /* renamed from: s */
    public final transient y17 f22577s;

    public p37(b27 b27Var, y17 y17Var) {
        this.f22576r = b27Var;
        this.f22577s = y17Var;
    }

    @Override // com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.f22576r.get(obj) != null;
    }

    @Override // com.daaw.t17
    /* renamed from: d */
    public final int mo2850d(Object[] objArr, int i) {
        return this.f22577s.mo2850d(objArr, i);
    }

    @Override // com.daaw.d27, com.daaw.t17
    /* renamed from: h */
    public final y17 mo2849h() {
        return this.f22577s;
    }

    @Override // com.daaw.d27, com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f22577s.listIterator(0);
    }

    @Override // com.daaw.d27, com.daaw.t17
    /* renamed from: j */
    public final c47 mo2848j() {
        return this.f22577s.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f22576r.size();
    }
}
