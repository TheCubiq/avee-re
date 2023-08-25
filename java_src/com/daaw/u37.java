package com.daaw;

import java.io.Serializable;
import java.util.Objects;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class u37 extends l37 implements Serializable {

    /* renamed from: p */
    public final l37 f28520p;

    public u37(l37 l37Var) {
        this.f28520p = l37Var;
    }

    @Override // com.daaw.l37
    /* renamed from: a */
    public final l37 mo8593a() {
        return this.f28520p;
    }

    @Override // com.daaw.l37, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f28520p.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u37) {
            return this.f28520p.equals(((u37) obj).f28520p);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f28520p.hashCode();
    }

    public final String toString() {
        l37 l37Var = this.f28520p;
        Objects.toString(l37Var);
        return l37Var.toString().concat(".reverse()");
    }
}
