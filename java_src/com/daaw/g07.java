package com.daaw;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class g07 extends j07 implements Serializable {
    public final transient Map s;
    public transient int t;

    public g07(Map map) {
        sy6.e(map.isEmpty());
        this.s = map;
    }

    public static /* synthetic */ int k(g07 g07Var) {
        int i = g07Var.t;
        g07Var.t = i + 1;
        return i;
    }

    public static /* synthetic */ int l(g07 g07Var) {
        int i = g07Var.t;
        g07Var.t = i - 1;
        return i;
    }

    public static /* synthetic */ int m(g07 g07Var, int i) {
        int i2 = g07Var.t + i;
        g07Var.t = i2;
        return i2;
    }

    public static /* synthetic */ int n(g07 g07Var, int i) {
        int i2 = g07Var.t - i;
        g07Var.t = i2;
        return i2;
    }

    public static /* synthetic */ void s(g07 g07Var, Object obj) {
        Object obj2;
        try {
            obj2 = g07Var.s.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            g07Var.t -= size;
        }
    }

    @Override // com.daaw.w27
    public final boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.s.get(obj);
        if (collection != null) {
            if (collection.add(obj2)) {
                this.t++;
                return true;
            }
            return false;
        }
        Collection h = h();
        if (h.add(obj2)) {
            this.t++;
            this.s.put(obj, h);
            return true;
        }
        throw new AssertionError("New Collection violated the Collection spec");
    }

    @Override // com.daaw.j07
    public final Collection c() {
        return new i07(this);
    }

    @Override // com.daaw.j07
    public final Iterator d() {
        return new nz6(this);
    }

    public abstract Collection h();

    public abstract Collection i(Collection collection);

    public abstract Collection j(Object obj, Collection collection);

    public final List o(Object obj, List list, @CheckForNull d07 d07Var) {
        return list instanceof RandomAccess ? new zz6(this, obj, list, d07Var) : new f07(this, obj, list, d07Var);
    }

    public final Map q() {
        Map map = this.s;
        return map instanceof NavigableMap ? new xz6(this, (NavigableMap) map) : map instanceof SortedMap ? new a07(this, (SortedMap) map) : new tz6(this, map);
    }

    public final Set r() {
        Map map = this.s;
        return map instanceof NavigableMap ? new yz6(this, (NavigableMap) map) : map instanceof SortedMap ? new b07(this, (SortedMap) map) : new wz6(this, map);
    }

    @Override // com.daaw.w27
    public final int zzh() {
        return this.t;
    }

    @Override // com.daaw.w27
    public final void zzr() {
        for (Collection collection : this.s.values()) {
            collection.clear();
        }
        this.s.clear();
        this.t = 0;
    }
}
