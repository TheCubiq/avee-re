package com.daaw;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class g92 implements gl2 {

    /* renamed from: p */
    public final boolean f10358p;

    public g92(Boolean bool) {
        this.f10358p = bool == null ? false : bool.booleanValue();
    }

    @Override // com.daaw.gl2
    /* renamed from: d */
    public final gl2 mo2708d(String str, w07 w07Var, List list) {
        if ("toString".equals(str)) {
            return new wp2(Boolean.toString(this.f10358p));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f10358p), str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g92) && this.f10358p == ((g92) obj).f10358p;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f10358p).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f10358p);
    }

    @Override // com.daaw.gl2
    public final gl2 zzd() {
        return new g92(Boolean.valueOf(this.f10358p));
    }

    @Override // com.daaw.gl2
    public final Boolean zzg() {
        return Boolean.valueOf(this.f10358p);
    }

    @Override // com.daaw.gl2
    public final Double zzh() {
        return Double.valueOf(true != this.f10358p ? 0.0d : 1.0d);
    }

    @Override // com.daaw.gl2
    public final String zzi() {
        return Boolean.toString(this.f10358p);
    }

    @Override // com.daaw.gl2
    public final Iterator zzl() {
        return null;
    }
}
