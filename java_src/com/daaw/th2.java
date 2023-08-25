package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class th2 implements gl2, og2 {

    /* renamed from: p */
    public final Map f27647p = new HashMap();

    /* renamed from: a */
    public final List m9113a() {
        return new ArrayList(this.f27647p.keySet());
    }

    @Override // com.daaw.gl2
    /* renamed from: d */
    public gl2 mo2708d(String str, w07 w07Var, List list) {
        return "toString".equals(str) ? new wp2(toString()) : fe2.m22750a(this, new wp2(str), w07Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof th2) {
            return this.f27647p.equals(((th2) obj).f27647p);
        }
        return false;
    }

    @Override // com.daaw.og2
    /* renamed from: f */
    public final gl2 mo2706f(String str) {
        return this.f27647p.containsKey(str) ? (gl2) this.f27647p.get(str) : gl2.f11420g;
    }

    @Override // com.daaw.og2
    /* renamed from: h */
    public final void mo2705h(String str, gl2 gl2Var) {
        if (gl2Var == null) {
            this.f27647p.remove(str);
        } else {
            this.f27647p.put(str, gl2Var);
        }
    }

    public final int hashCode() {
        return this.f27647p.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f27647p.isEmpty()) {
            for (String str : this.f27647p.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f27647p.get(str)));
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
        for (Map.Entry entry : this.f27647p.entrySet()) {
            if (entry.getValue() instanceof og2) {
                map = th2Var.f27647p;
                str = (String) entry.getKey();
                zzd = (gl2) entry.getValue();
            } else {
                map = th2Var.f27647p;
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
        return fe2.m22749b(this.f27647p);
    }

    @Override // com.daaw.og2
    public final boolean zzt(String str) {
        return this.f27647p.containsKey(str);
    }
}
