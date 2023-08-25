package com.daaw;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class b27 implements Map, Serializable {
    @CheckForNull

    /* renamed from: p */
    public transient d27 f4233p;
    @CheckForNull

    /* renamed from: q */
    public transient d27 f4234q;
    @CheckForNull

    /* renamed from: r */
    public transient t17 f4235r;

    /* renamed from: c */
    public static b27 m26519c(Map map) {
        Set entrySet = map.entrySet();
        a27 a27Var = new a27(entrySet instanceof Collection ? entrySet.size() : 4);
        a27Var.m27747b(entrySet);
        return a27Var.m27746c();
    }

    /* renamed from: d */
    public static b27 m26518d() {
        return r37.f24812v;
    }

    /* renamed from: a */
    public abstract t17 mo11788a();

    @Override // java.util.Map
    /* renamed from: b */
    public final t17 values() {
        t17 t17Var = this.f4235r;
        if (t17Var == null) {
            t17 mo11788a = mo11788a();
            this.f4235r = mo11788a;
            return mo11788a;
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

    /* renamed from: e */
    public abstract d27 mo11787e();

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return v27.m7539b(this, obj);
    }

    /* renamed from: f */
    public abstract d27 mo11786f();

    @Override // java.util.Map
    /* renamed from: g */
    public final d27 entrySet() {
        d27 d27Var = this.f4233p;
        if (d27Var == null) {
            d27 mo11787e = mo11787e();
            this.f4233p = mo11787e;
            return mo11787e;
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
        d27 d27Var = this.f4234q;
        if (d27Var == null) {
            d27 mo11786f = mo11786f();
            this.f4234q = mo11786f;
            return mo11786f;
        }
        return d27Var;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return y37.m4144a(entrySet());
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
        k07.m18089a(size, "size");
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
