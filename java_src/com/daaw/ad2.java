package com.daaw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public abstract class ad2 implements gl2, og2 {
    public final String p;
    public final Map q = new HashMap();

    public ad2(String str) {
        this.p = str;
    }

    public abstract gl2 a(w07 w07Var, List list);

    public final String b() {
        return this.p;
    }

    @Override // com.daaw.gl2
    public final gl2 d(String str, w07 w07Var, List list) {
        return "toString".equals(str) ? new wp2(this.p) : fe2.a(this, new wp2(str), w07Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ad2) {
            ad2 ad2Var = (ad2) obj;
            String str = this.p;
            if (str != null) {
                return str.equals(ad2Var.p);
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.og2
    public final gl2 f(String str) {
        return this.q.containsKey(str) ? (gl2) this.q.get(str) : gl2.g;
    }

    @Override // com.daaw.og2
    public final void h(String str, gl2 gl2Var) {
        if (gl2Var == null) {
            this.q.remove(str);
        } else {
            this.q.put(str, gl2Var);
        }
    }

    public final int hashCode() {
        String str = this.p;
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
        return this.p;
    }

    @Override // com.daaw.gl2
    public final Iterator zzl() {
        return fe2.b(this.q);
    }

    @Override // com.daaw.og2
    public final boolean zzt(String str) {
        return this.q.containsKey(str);
    }
}
