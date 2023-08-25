package com.daaw;

import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class z37 extends d27 {

    /* renamed from: r */
    public final transient Object f34428r;

    public z37(Object obj) {
        Objects.requireNonNull(obj);
        this.f34428r = obj;
    }

    @Override // com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.f34428r.equals(obj);
    }

    @Override // com.daaw.t17
    /* renamed from: d */
    public final int mo2850d(Object[] objArr, int i) {
        objArr[i] = this.f34428r;
        return i + 1;
    }

    @Override // com.daaw.d27, com.daaw.t17
    /* renamed from: h */
    public final y17 mo2849h() {
        return y17.m4259v(this.f34428r);
    }

    @Override // com.daaw.d27, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f34428r.hashCode();
    }

    @Override // com.daaw.d27, com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new j27(this.f34428r);
    }

    @Override // com.daaw.d27, com.daaw.t17
    /* renamed from: j */
    public final c47 mo2848j() {
        return new j27(this.f34428r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return '[' + this.f34428r.toString() + ']';
    }
}
