package com.daaw;

import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class u37 extends l37 implements Serializable {
    public final l37 p;

    public u37(l37 l37Var) {
        this.p = l37Var;
    }

    @Override // com.daaw.l37
    public final l37 a() {
        return this.p;
    }

    @Override // com.daaw.l37, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.p.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u37) {
            return this.p.equals(((u37) obj).p);
        }
        return false;
    }

    public final int hashCode() {
        return -this.p.hashCode();
    }

    public final String toString() {
        l37 l37Var = this.p;
        Objects.toString(l37Var);
        return l37Var.toString().concat(".reverse()");
    }
}
