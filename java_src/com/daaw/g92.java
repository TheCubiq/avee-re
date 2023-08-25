package com.daaw;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class g92 implements gl2 {
    public final boolean p;

    public g92(Boolean bool) {
        this.p = bool == null ? false : bool.booleanValue();
    }

    @Override // com.daaw.gl2
    public final gl2 d(String str, w07 w07Var, List list) {
        if ("toString".equals(str)) {
            return new wp2(Boolean.toString(this.p));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.p), str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g92) && this.p == ((g92) obj).p;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.p).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.p);
    }

    @Override // com.daaw.gl2
    public final gl2 zzd() {
        return new g92(Boolean.valueOf(this.p));
    }

    @Override // com.daaw.gl2
    public final Boolean zzg() {
        return Boolean.valueOf(this.p);
    }

    @Override // com.daaw.gl2
    public final Double zzh() {
        return Double.valueOf(true != this.p ? 0.0d : 1.0d);
    }

    @Override // com.daaw.gl2
    public final String zzi() {
        return Boolean.toString(this.p);
    }

    @Override // com.daaw.gl2
    public final Iterator zzl() {
        return null;
    }
}
