package com.daaw;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class o17 extends p17 implements Map {
    public abstract Map b();

    public final int c() {
        return y37.a(entrySet());
    }

    @Override // java.util.Map
    public final void clear() {
        b().clear();
    }

    public boolean containsKey(@CheckForNull Object obj) {
        return b().containsKey(obj);
    }

    public final boolean e(@CheckForNull Object obj) {
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

    public final boolean g(@CheckForNull Object obj) {
        return v27.b(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        return b().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b().putAll(map);
    }

    @Override // java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        return b().remove(obj);
    }

    public int size() {
        return b().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return b().values();
    }
}
