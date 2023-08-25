package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class th2 implements gl2, og2 {
    public final Map p = new HashMap();

    public final List a() {
        return new ArrayList(this.p.keySet());
    }

    @Override // com.daaw.gl2
    public gl2 d(String str, w07 w07Var, List list) {
        return "toString".equals(str) ? new wp2(toString()) : fe2.a(this, new wp2(str), w07Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof th2) {
            return this.p.equals(((th2) obj).p);
        }
        return false;
    }

    @Override // com.daaw.og2
    public final gl2 f(String str) {
        return this.p.containsKey(str) ? (gl2) this.p.get(str) : gl2.g;
    }

    @Override // com.daaw.og2
    public final void h(String str, gl2 gl2Var) {
        if (gl2Var == null) {
            this.p.remove(str);
        } else {
            this.p.put(str, gl2Var);
        }
    }

    public final int hashCode() {
        return this.p.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.p.isEmpty()) {
            for (String str : this.p.keySet()) {
                sb.append(String.format("%s: %s,", str, this.p.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // com.daaw.gl2
    public final gl2 zzd() {
        Map map;
        String str;
        gl2 zzd;
        th2 th2Var = new th2();
        for (Map.Entry entry : this.p.entrySet()) {
            if (entry.getValue() instanceof og2) {
                map = th2Var.p;
                str = (String) entry.getKey();
                zzd = (gl2) entry.getValue();
            } else {
                map = th2Var.p;
                str = (String) entry.getKey();
                zzd = ((gl2) entry.getValue()).zzd();
            }
            map.put(str, zzd);
        }
        return th2Var;
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
        return "[object Object]";
    }

    @Override // com.daaw.gl2
    public final Iterator zzl() {
        return fe2.b(this.p);
    }

    @Override // com.daaw.og2
    public final boolean zzt(String str) {
        return this.p.containsKey(str);
    }
}
