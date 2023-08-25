package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class km2 implements gl2 {
    public final String p;
    public final ArrayList q;

    public km2(String str, List list) {
        this.p = str;
        ArrayList arrayList = new ArrayList();
        this.q = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.p;
    }

    public final ArrayList b() {
        return this.q;
    }

    @Override // com.daaw.gl2
    public final gl2 d(String str, w07 w07Var, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof km2) {
            km2 km2Var = (km2) obj;
            String str = this.p;
            if (str == null ? km2Var.p == null : str.equals(km2Var.p)) {
                return this.q.equals(km2Var.q);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.p;
        return ((str != null ? str.hashCode() : 0) * 31) + this.q.hashCode();
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
