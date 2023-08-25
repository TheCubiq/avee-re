package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class z72 implements Iterable, gl2, og2 {

    /* renamed from: p */
    public final SortedMap f34551p;

    /* renamed from: q */
    public final Map f34552q;

    public z72() {
        this.f34551p = new TreeMap();
        this.f34552q = new TreeMap();
    }

    public z72(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                m2696s(i, (gl2) list.get(i));
            }
        }
    }

    @Override // com.daaw.gl2
    /* renamed from: d */
    public final gl2 mo2708d(String str, w07 w07Var, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? sz2.m9694a(str, this, w07Var, list) : fe2.m22750a(this, new wp2(str), w07Var, list);
    }

    /* renamed from: e */
    public final int m2707e() {
        return this.f34551p.size();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z72) {
            z72 z72Var = (z72) obj;
            if (m2704j() != z72Var.m2704j()) {
                return false;
            }
            if (this.f34551p.isEmpty()) {
                return z72Var.f34551p.isEmpty();
            }
            for (int intValue = ((Integer) this.f34551p.firstKey()).intValue(); intValue <= ((Integer) this.f34551p.lastKey()).intValue(); intValue++) {
                if (!m2703k(intValue).equals(z72Var.m2703k(intValue))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.og2
    /* renamed from: f */
    public final gl2 mo2706f(String str) {
        gl2 gl2Var;
        return "length".equals(str) ? new tb2(Double.valueOf(m2704j())) : (!zzt(str) || (gl2Var = (gl2) this.f34552q.get(str)) == null) ? gl2.f11420g : gl2Var;
    }

    @Override // com.daaw.og2
    /* renamed from: h */
    public final void mo2705h(String str, gl2 gl2Var) {
        if (gl2Var == null) {
            this.f34552q.remove(str);
        } else {
            this.f34552q.put(str, gl2Var);
        }
    }

    public final int hashCode() {
        return this.f34551p.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c72(this);
    }

    /* renamed from: j */
    public final int m2704j() {
        if (this.f34551p.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f34551p.lastKey()).intValue() + 1;
    }

    /* renamed from: k */
    public final gl2 m2703k(int i) {
        gl2 gl2Var;
        if (i < m2704j()) {
            return (!m2695t(i) || (gl2Var = (gl2) this.f34551p.get(Integer.valueOf(i))) == null) ? gl2.f11420g : gl2Var;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    /* renamed from: m */
    public final String m2702m(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f34551p.isEmpty()) {
            for (int i = 0; i < m2704j(); i++) {
                gl2 m2703k = m2703k(i);
                sb.append(str);
                if (!(m2703k instanceof br2) && !(m2703k instanceof xi2)) {
                    sb.append(m2703k.zzi());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    /* renamed from: n */
    public final Iterator m2701n() {
        return this.f34551p.keySet().iterator();
    }

    /* renamed from: o */
    public final List m2700o() {
        ArrayList arrayList = new ArrayList(m2704j());
        for (int i = 0; i < m2704j(); i++) {
            arrayList.add(m2703k(i));
        }
        return arrayList;
    }

    /* renamed from: p */
    public final void m2699p() {
        this.f34551p.clear();
    }

    /* renamed from: q */
    public final void m2698q(int i, gl2 gl2Var) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i);
        } else if (i >= m2704j()) {
            m2696s(i, gl2Var);
        } else {
            for (int intValue = ((Integer) this.f34551p.lastKey()).intValue(); intValue >= i; intValue--) {
                SortedMap sortedMap = this.f34551p;
                Integer valueOf = Integer.valueOf(intValue);
                gl2 gl2Var2 = (gl2) sortedMap.get(valueOf);
                if (gl2Var2 != null) {
                    m2696s(intValue + 1, gl2Var2);
                    this.f34551p.remove(valueOf);
                }
            }
            m2696s(i, gl2Var);
        }
    }

    /* renamed from: r */
    public final void m2697r(int i) {
        int intValue = ((Integer) this.f34551p.lastKey()).intValue();
        if (i > intValue || i < 0) {
            return;
        }
        this.f34551p.remove(Integer.valueOf(i));
        if (i == intValue) {
            SortedMap sortedMap = this.f34551p;
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf(i2);
            if (sortedMap.containsKey(valueOf) || i2 < 0) {
                return;
            }
            this.f34551p.put(valueOf, gl2.f11420g);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) this.f34551p.lastKey()).intValue()) {
                return;
            }
            SortedMap sortedMap2 = this.f34551p;
            Integer valueOf2 = Integer.valueOf(i);
            gl2 gl2Var = (gl2) sortedMap2.get(valueOf2);
            if (gl2Var != null) {
                this.f34551p.put(Integer.valueOf(i - 1), gl2Var);
                this.f34551p.remove(valueOf2);
            }
        }
    }

    @RequiresNonNull({"elements"})
    /* renamed from: s */
    public final void m2696s(int i, gl2 gl2Var) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        } else if (gl2Var == null) {
            this.f34551p.remove(Integer.valueOf(i));
        } else {
            this.f34551p.put(Integer.valueOf(i), gl2Var);
        }
    }

    /* renamed from: t */
    public final boolean m2695t(int i) {
        if (i < 0 || i > ((Integer) this.f34551p.lastKey()).intValue()) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        }
        return this.f34551p.containsKey(Integer.valueOf(i));
    }

    public final String toString() {
        return m2702m(",");
    }

    @Override // com.daaw.gl2
    public final gl2 zzd() {
        SortedMap sortedMap;
        Integer num;
        gl2 zzd;
        z72 z72Var = new z72();
        for (Map.Entry entry : this.f34551p.entrySet()) {
            if (entry.getValue() instanceof og2) {
                sortedMap = z72Var.f34551p;
                num = (Integer) entry.getKey();
                zzd = (gl2) entry.getValue();
            } else {
                sortedMap = z72Var.f34551p;
                num = (Integer) entry.getKey();
                zzd = ((gl2) entry.getValue()).zzd();
            }
            sortedMap.put(num, zzd);
        }
        return z72Var;
    }

    @Override // com.daaw.gl2
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.daaw.gl2
    public final Double zzh() {
        return this.f34551p.size() == 1 ? m2703k(0).zzh() : this.f34551p.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.daaw.gl2
    public final String zzi() {
        return m2702m(",");
    }

    @Override // com.daaw.gl2
    public final Iterator zzl() {
        return new g62(this, this.f34551p.keySet().iterator(), this.f34552q.keySet().iterator());
    }

    @Override // com.daaw.og2
    public final boolean zzt(String str) {
        return "length".equals(str) || this.f34552q.containsKey(str);
    }
}
