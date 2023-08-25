package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class km2 implements gl2 {

    /* renamed from: p */
    public final String f16454p;

    /* renamed from: q */
    public final ArrayList f16455q;

    public km2(String str, List list) {
        this.f16454p = str;
        ArrayList arrayList = new ArrayList();
        this.f16455q = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: a */
    public final String m17665a() {
        return this.f16454p;
    }

    /* renamed from: b */
    public final ArrayList m17664b() {
        return this.f16455q;
    }

    @Override // com.daaw.gl2
    /* renamed from: d */
    public final gl2 mo2708d(String str, w07 w07Var, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof km2) {
            km2 km2Var = (km2) obj;
            String str = this.f16454p;
            if (str == null ? km2Var.f16454p == null : str.equals(km2Var.f16454p)) {
                return this.f16455q.equals(km2Var.f16455q);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f16454p;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f16455q.hashCode();
    }

    @Override // com.daaw.gl2
    public final gl2 zzd() {
        return this;
    }

    @Override // com.daaw.gl2
    public final Boolean zzg() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.daaw.gl2
    public final Double zzh() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.daaw.gl2
    public final String zzi() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.daaw.gl2
    public final Iterator zzl() {
        return null;
    }
}
