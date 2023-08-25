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

    /* renamed from: s */
    public final transient Map f10130s;

    /* renamed from: t */
    public transient int f10131t;

    public g07(Map map) {
        sy6.m9704e(map.isEmpty());
        this.f10130s = map;
    }

    /* renamed from: k */
    public static /* synthetic */ int m22114k(g07 g07Var) {
        int i = g07Var.f10131t;
        g07Var.f10131t = i + 1;
        return i;
    }

    /* renamed from: l */
    public static /* synthetic */ int m22113l(g07 g07Var) {
        int i = g07Var.f10131t;
        g07Var.f10131t = i - 1;
        return i;
    }

    /* renamed from: m */
    public static /* synthetic */ int m22112m(g07 g07Var, int i) {
        int i2 = g07Var.f10131t + i;
        g07Var.f10131t = i2;
        return i2;
    }

    /* renamed from: n */
    public static /* synthetic */ int m22111n(g07 g07Var, int i) {
        int i2 = g07Var.f10131t - i;
        g07Var.f10131t = i2;
        return i2;
    }

    /* renamed from: s */
    public static /* synthetic */ void m22106s(g07 g07Var, Object obj) {
        Object obj2;
        try {
            obj2 = g07Var.f10130s.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            g07Var.f10131t -= size;
        }
    }

    @Override // com.daaw.w27
    /* renamed from: a */
    public final boolean mo6568a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f10130s.get(obj);
        if (collection != null) {
            if (collection.add(obj2)) {
                this.f10131t++;
                return true;
            }
            return false;
        }
        Collection mo22115h = mo22115h();
        if (mo22115h.add(obj2)) {
            this.f10131t++;
            this.f10130s.put(obj, mo22115h);
            return true;
        }
        throw new AssertionError("New Collection violated the Collection spec");
    }

    @Override // com.daaw.j07
    /* renamed from: c */
    public final Collection mo19180c() {
        return new i07(this);
    }

    @Override // com.daaw.j07
    /* renamed from: d */
    public final Iterator mo19179d() {
        return new nz6(this);
    }

    /* renamed from: h */
    public abstract Collection mo22115h();

    /* renamed from: i */
    public abstract Collection mo15651i(Collection collection);

    /* renamed from: j */
    public abstract Collection mo15650j(Object obj, Collection collection);

    /* renamed from: o */
    public final List m22110o(Object obj, List list, @CheckForNull d07 d07Var) {
        return list instanceof RandomAccess ? new zz6(this, obj, list, d07Var) : new f07(this, obj, list, d07Var);
    }

    /* renamed from: q */
    public final Map m22108q() {
        Map map = this.f10130s;
        return map instanceof NavigableMap ? new xz6(this, (NavigableMap) map) : map instanceof SortedMap ? new a07(this, (SortedMap) map) : new tz6(this, map);
    }

    /* renamed from: r */
    public final Set m22107r() {
        Map map = this.f10130s;
        return map instanceof NavigableMap ? new yz6(this, (NavigableMap) map) : map instanceof SortedMap ? new b07(this, (SortedMap) map) : new wz6(this, map);
    }

    @Override // com.daaw.w27
    public final int zzh() {
        return this.f10131t;
    }

    @Override // com.daaw.w27
    public final void zzr() {
        for (Collection collection : this.f10130s.values()) {
            collection.clear();
        }
        this.f10130s.clear();
        this.f10131t = 0;
    }
}
