package com.daaw;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class xi2 implements gl2 {
    @Override // com.daaw.gl2
    public final gl2 d(String str, w07 w07Var, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof xi2;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.daaw.gl2
    public final gl2 zzd() {
        return gl2.h;
    }

    @Override // com.daaw.gl2
    public final Boolean zzg() {
        return Boolean.FALSE;
    }

    @Override // com.daaw.gl2
    public final Double zzh() {
        return Double.valueOf(0.0d);
    }

    @Override // com.daaw.gl2
    public final String zzi() {
        return "null";
    }

    @Override // com.daaw.gl2
    public final Iterator zzl() {
        return null;
    }
}
