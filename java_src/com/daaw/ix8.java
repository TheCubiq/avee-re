package com.daaw;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class ix8 implements Map, Serializable {
    @CheckForNull

    /* renamed from: p */
    public transient py8 f14109p;
    @CheckForNull

    /* renamed from: q */
    public transient py8 f14110q;
    @CheckForNull

    /* renamed from: r */
    public transient aq8 f14111r;

    /* renamed from: a */
    public abstract aq8 mo19267a();

    @Override // java.util.Map
    /* renamed from: b */
    public final aq8 values() {
        aq8 aq8Var = this.f14111r;
        if (aq8Var == null) {
            aq8 mo19267a = mo19267a();
            this.f14111r = mo19267a;
            return mo19267a;
        }
        return aq8Var;
    }

    /* renamed from: c */
    public abstract py8 mo19265c();

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

    /* renamed from: d */
    public abstract py8 mo19264d();

    @Override // java.util.Map
    /* renamed from: e */
    public final py8 entrySet() {
        py8 py8Var = this.f14109p;
        if (py8Var == null) {
            py8 mo19265c = mo19265c();
            this.f14109p = mo19265c;
            return mo19265c;
        }
        return py8Var;
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
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
    public final int hashCode() {
        return pa2.m13536a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        py8 py8Var = this.f14110q;
        if (py8Var == null) {
            py8 mo19264d = mo19264d();
            this.f14110q = mo19264d;
            return mo19264d;
        }
        return py8Var;
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
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
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
