package com.daaw;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class k17 extends l37 implements Serializable {
    public final Comparator p;

    public k17(Comparator comparator) {
        Objects.requireNonNull(comparator);
        this.p = comparator;
    }

    @Override // com.daaw.l37, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.p.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k17) {
            return this.p.equals(((k17) obj).p);
        }
        return false;
    }

    public final int hashCode() {
        return this.p.hashCode();
    }

    public final String toString() {
        return this.p.toString();
    }
}
