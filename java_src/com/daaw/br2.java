package com.daaw;

import com.google.android.gms.ads.AdError;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class br2 implements gl2 {
    @Override // com.daaw.gl2
    /* renamed from: d */
    public final gl2 mo2708d(String str, w07 w07Var, List list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof br2;
    }

    @Override // com.daaw.gl2
    public final gl2 zzd() {
        return gl2.f11420g;
    }

    @Override // com.daaw.gl2
    public final Boolean zzg() {
        return Boolean.FALSE;
    }

    @Override // com.daaw.gl2
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.daaw.gl2
    public final String zzi() {
        return AdError.UNDEFINED_DOMAIN;
    }

    @Override // com.daaw.gl2
    public final Iterator zzl() {
        return null;
    }
}
