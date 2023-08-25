package com.daaw;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class oa2 implements gl2 {
    public final gl2 p;
    public final String q;

    public oa2() {
        throw null;
    }

    public oa2(String str) {
        this.p = gl2.g;
        this.q = str;
    }

    public oa2(String str, gl2 gl2Var) {
        this.p = gl2Var;
        this.q = str;
    }

    public final gl2 a() {
        return this.p;
    }

    public final String b() {
        return this.q;
    }

    @Override // com.daaw.gl2
    public final gl2 d(String str, w07 w07Var, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oa2) {
            oa2 oa2Var = (oa2) obj;
            return this.q.equals(oa2Var.q) && this.p.equals(oa2Var.p);
        }
        return false;
    }

    public final int hashCode() {
        return (this.q.hashCode() * 31) + this.p.hashCode();
    }

    @Override // com.daaw.gl2
    public final gl2 zzd() {
        return new oa2(this.q, this.p.zzd());
    }

    @Override // com.daaw.gl2
    public final Boolean zzg() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.daaw.gl2
    public final Double zzh() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.daaw.gl2
    public final String zzi() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // com.daaw.gl2
    public final Iterator zzl() {
        return null;
    }
}
