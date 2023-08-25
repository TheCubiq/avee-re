package com.daaw;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class k17 extends l37 implements Serializable {

    /* renamed from: p */
    public final Comparator f15602p;

    public k17(Comparator comparator) {
        Objects.requireNonNull(comparator);
        this.f15602p = comparator;
    }

    @Override // com.daaw.l37, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f15602p.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k17) {
            return this.f15602p.equals(((k17) obj).f15602p);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15602p.hashCode();
    }

    public final String toString() {
        return this.f15602p.toString();
    }
}
