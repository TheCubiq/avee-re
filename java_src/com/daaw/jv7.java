package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class jv7 implements Map.Entry, Comparable {

    /* renamed from: p */
    public final Comparable f15467p;

    /* renamed from: q */
    public Object f15468q;

    /* renamed from: r */
    public final /* synthetic */ pv7 f15469r;

    public jv7(pv7 pv7Var, Comparable comparable, Object obj) {
        this.f15469r = pv7Var;
        this.f15467p = comparable;
        this.f15468q = obj;
    }

    /* renamed from: b */
    public static final boolean m18211b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable m18212a() {
        return this.f15467p;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f15467p.compareTo(((jv7) obj).f15467p);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return m18211b(this.f15467p, entry.getKey()) && m18211b(this.f15468q, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f15467p;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15468q;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f15467p;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f15468q;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f15469r.m13002n();
        Object obj2 = this.f15468q;
        this.f15468q = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15467p);
        String valueOf2 = String.valueOf(this.f15468q);
        return valueOf + "=" + valueOf2;
    }
}
