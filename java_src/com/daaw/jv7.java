package com.daaw;

import java.util.Map;
/* loaded from: classes.dex */
public final class jv7 implements Map.Entry, Comparable {
    public final Comparable p;
    public Object q;
    public final /* synthetic */ pv7 r;

    public jv7(pv7 pv7Var, Comparable comparable, Object obj) {
        this.r = pv7Var;
        this.p = comparable;
        this.q = obj;
    }

    public static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final Comparable a() {
        return this.p;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.p.compareTo(((jv7) obj).p);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return b(this.p, entry.getKey()) && b(this.q, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.p;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.q;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.p;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.q;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.r.n();
        Object obj2 = this.q;
        this.q = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.p);
        String valueOf2 = String.valueOf(this.q);
        return valueOf + "=" + valueOf2;
    }
}
