package com.daaw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class ad2 implements gl2, og2 {

    /* renamed from: p */
    public final String f3097p;

    /* renamed from: q */
    public final Map f3098q = new HashMap();

    public ad2(String str) {
        this.f3097p = str;
    }

    /* renamed from: a */
    public abstract gl2 mo5780a(w07 w07Var, List list);

    /* renamed from: b */
    public final String m27518b() {
        return this.f3097p;
    }

    @Override // com.daaw.gl2
    /* renamed from: d */
    public final gl2 mo2708d(String str, w07 w07Var, List list) {
        return "toString".equals(str) ? new wp2(this.f3097p) : fe2.m22750a(this, new wp2(str), w07Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ad2) {
            ad2 ad2Var = (ad2) obj;
            String str = this.f3097p;
            if (str != null) {
                return str.equals(ad2Var.f3097p);
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.og2
    /* renamed from: f */
    public final gl2 mo2706f(String str) {
        return this.f3098q.containsKey(str) ? (gl2) this.f3098q.get(str) : gl2.f11420g;
    }

    @Override // com.daaw.og2
    /* renamed from: h */
    public final void mo2705h(String str, gl2 gl2Var) {
        if (gl2Var == null) {
            this.f3098q.remove(str);
        } else {
            this.f3098q.put(str, gl2Var);
        }
    }

    public final int hashCode() {
        String str = this.f3097p;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.daaw.gl2
    public gl2 zzd() {
        return this;
    }

    @Override // com.daaw.gl2
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.daaw.gl2
    public final Double zzh() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.daaw.gl2
    public final String zzi() {
        return this.f3097p;
    }

    @Override // com.daaw.gl2
    public final Iterator zzl() {
        return fe2.m22749b(this.f3098q);
    }

    @Override // com.daaw.og2
    public final boolean zzt(String str) {
        return this.f3098q.containsKey(str);
    }
}
