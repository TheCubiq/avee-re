package com.daaw;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class o17 extends p17 implements Map {
    /* renamed from: b */
    public abstract Map mo14649b();

    /* renamed from: c */
    public final int m14648c() {
        return y37.m4144a(entrySet());
    }

    @Override // java.util.Map
    public final void clear() {
        mo14649b().clear();
    }

    public boolean containsKey(@CheckForNull Object obj) {
        return mo14649b().containsKey(obj);
    }

    /* renamed from: e */
    public final boolean m14647e(@CheckForNull Object obj) {
        q27 q27Var = new q27(entrySet().iterator());
        if (obj == null) {
            while (q27Var.hasNext()) {
                if (q27Var.next() == null) {
                    return true;
                }
            }
        } else {
            while (q27Var.hasNext()) {
                if (obj.equals(q27Var.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract Set entrySet();

    /* renamed from: g */
    public final boolean m14646g(@CheckForNull Object obj) {
        return v27.m7539b(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        return mo14649b().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        mo14649b().putAll(map);
    }

    @Override // java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        return mo14649b().remove(obj);
    }

    public int size() {
        return mo14649b().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return mo14649b().values();
    }
}
