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
    public final SortedMap p;
    public final Map q;

    public z72() {
        this.p = new TreeMap();
        this.q = new TreeMap();
    }

    public z72(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                s(i, (gl2) list.get(i));
            }
        }
    }

    @Override // com.daaw.gl2
    public final gl2 d(String str, w07 w07Var, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? sz2.a(str, this, w07Var, list) : fe2.a(this, new wp2(str), w07Var, list);
    }

    public final int e() {
        return this.p.size();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z72) {
            z72 z72Var = (z72) obj;
            if (j() != z72Var.j()) {
                return false;
            }
            if (this.p.isEmpty()) {
                return z72Var.p.isEmpty();
            }
            for (int intValue = ((Integer) this.p.firstKey()).intValue(); intValue <= ((Integer) this.p.lastKey()).intValue(); intValue++) {
                if (!k(intValue).equals(z72Var.k(intValue))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.og2
    public final gl2 f(String str) {
        gl2 gl2Var;
        return "length".equals(str) ? new tb2(Double.valueOf(j())) : (!zzt(str) || (gl2Var = (gl2) this.q.get(str)) == null) ? gl2.g : gl2Var;
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
        return this.p.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c72(this);
    }

    public final int j() {
        if (this.p.isEmpty()) {
            return 0;
        }
        return ((Integer) this.p.lastKey()).intValue() + 1;
    }

    public final gl2 k(int i) {
        gl2 gl2Var;
        if (i < j()) {
            return (!t(i) || (gl2Var = (gl2) this.p.get(Integer.valueOf(i))) == null) ? gl2.g : gl2Var;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final String m(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.p.isEmpty()) {
            for (int i = 0; i < j(); i++) {
                gl2 k = k(i);
                sb.append(str);
                if (!(k instanceof br2) && !(k instanceof xi2)) {
                    sb.append(k.zzi());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final Iterator n() {
        return this.p.keySet().iterator();
    }

    public final List o() {
        ArrayList arrayList = new ArrayList(j());
        for (int i = 0; i < j(); i++) {
            arrayList.add(k(i));
        }
        return arrayList;
    }

    public final void p() {
        this.p.clear();
    }

    public final void q(int i, gl2 gl2Var) {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i);
        } else if (i >= j()) {
            s(i, gl2Var);
        } else {
            for (int intValue = ((Integer) this.p.lastKey()).intValue(); intValue >= i; intValue--) {
                SortedMap sortedMap = this.p;
                Integer valueOf = Integer.valueOf(intValue);
                gl2 gl2Var2 = (gl2) sortedMap.get(valueOf);
                if (gl2Var2 != null) {
                    s(intValue + 1, gl2Var2);
                    this.p.remove(valueOf);
                }
            }
            s(i, gl2Var);
        }
    }

    public final void r(int i) {
        int intValue = ((Integer) this.p.lastKey()).intValue();
        if (i > intValue || i < 0) {
            return;
        }
        this.p.remove(Integer.valueOf(i));
        if (i == intValue) {
            SortedMap sortedMap = this.p;
            int i2 = i - 1;
            Integer valueOf = Integer.valueOf(i2);
            if (sortedMap.containsKey(valueOf) || i2 < 0) {
                return;
            }
            this.p.put(valueOf, gl2.g);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) this.p.lastKey()).intValue()) {
                return;
            }
            SortedMap sortedMap2 = this.p;
            Integer valueOf2 = Integer.valueOf(i);
            gl2 gl2Var = (gl2) sortedMap2.get(valueOf2);
            if (gl2Var != null) {
                this.p.put(Integer.valueOf(i - 1), gl2Var);
                this.p.remove(valueOf2);
            }
        }
    }

    @RequiresNonNull({"elements"})
    public final void s(int i, gl2 gl2Var) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        } else if (gl2Var == null) {
            this.p.remove(Integer.valueOf(i));
        } else {
            this.p.put(Integer.valueOf(i), gl2Var);
        }
    }

    public final boolean t(int i) {
        if (i < 0 || i > ((Integer) this.p.lastKey()).intValue()) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        }
        return this.p.containsKey(Integer.valueOf(i));
    }

    public final String toString() {
        return m(",");
    }

    @Override // com.daaw.gl2
    public final gl2 zzd() {
        SortedMap sortedMap;
        Integer num;
        gl2 zzd;
        z72 z72Var = new z72();
        for (Map.Entry entry : this.p.entrySet()) {
            if (entry.getValue() instanceof og2) {
                sortedMap = z72Var.p;
                num = (Integer) entry.getKey();
                zzd = (gl2) entry.getValue();
            } else {
                sortedMap = z72Var.p;
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
        return this.p.size() == 1 ? k(0).zzh() : this.p.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.daaw.gl2
    public final String zzi() {
        return m(",");
    }

    @Override // com.daaw.gl2
    public final Iterator zzl() {
        return new g62(this, this.p.keySet().iterator(), this.q.keySet().iterator());
    }

    @Override // com.daaw.og2
    public final boolean zzt(String str) {
        return "length".equals(str) || this.q.containsKey(str);
    }
}
