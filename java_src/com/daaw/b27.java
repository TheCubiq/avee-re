package com.daaw;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class b27 implements Map, Serializable {
    @CheckForNull
    public transient d27 p;
    @CheckForNull
    public transient d27 q;
    @CheckForNull
    public transient t17 r;

    public static b27 c(Map map) {
        Set entrySet = map.entrySet();
        a27 a27Var = new a27(entrySet instanceof Collection ? entrySet.size() : 4);
        a27Var.b(entrySet);
        return a27Var.c();
    }

    public static b27 d() {
        return r37.v;
    }

    public abstract t17 a();

    @Override // java.util.Map
    /* renamed from: b */
    public final t17 values() {
        t17 t17Var = this.r;
        if (t17Var == null) {
            t17 a = a();
            this.r = a;
            return a;
        }
        return t17Var;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    public abstract d27 e();

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return v27.b(this, obj);
    }

    public abstract d27 f();

    @Override // java.util.Map
    /* renamed from: g */
    public final d27 entrySet() {
        d27 d27Var = this.p;
        if (d27Var == null) {
            d27 e = e();
            this.p = e;
            return e;
        }
        return d27Var;
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* renamed from: h */
    public final d27 keySet() {
        d27 d27Var = this.q;
        if (d27Var == null) {
            d27 f = f();
            this.q = f;
            return f;
        }
        return d27Var;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return y37.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        k07.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
