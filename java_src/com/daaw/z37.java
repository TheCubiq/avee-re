package com.daaw;

import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class z37 extends d27 {
    public final transient Object r;

    public z37(Object obj) {
        Objects.requireNonNull(obj);
        this.r = obj;
    }

    @Override // com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.r.equals(obj);
    }

    @Override // com.daaw.t17
    public final int d(Object[] objArr, int i) {
        objArr[i] = this.r;
        return i + 1;
    }

    @Override // com.daaw.d27, com.daaw.t17
    public final y17 h() {
        return y17.v(this.r);
    }

    @Override // com.daaw.d27, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.r.hashCode();
    }

    @Override // com.daaw.d27, com.daaw.t17, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new j27(this.r);
    }

    @Override // com.daaw.d27, com.daaw.t17
    public final c47 j() {
        return new j27(this.r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return '[' + this.r.toString() + ']';
    }
}
