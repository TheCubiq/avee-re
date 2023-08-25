package com.daaw;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public final class oa2 implements gl2 {

    /* renamed from: p */
    public final gl2 f21192p;

    /* renamed from: q */
    public final String f21193q;

    public oa2() {
        throw null;
    }

    public oa2(String str) {
        this.f21192p = gl2.f11420g;
        this.f21193q = str;
    }

    public oa2(String str, gl2 gl2Var) {
        this.f21192p = gl2Var;
        this.f21193q = str;
    }

    /* renamed from: a */
    public final gl2 m14433a() {
        return this.f21192p;
    }

    /* renamed from: b */
    public final String m14432b() {
        return this.f21193q;
    }

    @Override // com.daaw.gl2
    /* renamed from: d */
    public final gl2 mo2708d(String str, w07 w07Var, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oa2) {
            oa2 oa2Var = (oa2) obj;
            return this.f21193q.equals(oa2Var.f21193q) && this.f21192p.equals(oa2Var.f21192p);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f21193q.hashCode() * 31) + this.f21192p.hashCode();
    }

    @Override // com.daaw.gl2
    public final gl2 zzd() {
        return new oa2(this.f21193q, this.f21192p.zzd());
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
