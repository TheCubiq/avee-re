package com.daaw;

import java.util.Map;
/* loaded from: classes2.dex */
public final class uf8 implements Map.Entry, Comparable {

    /* renamed from: p */
    public final Comparable f29031p;

    /* renamed from: q */
    public Object f29032q;

    /* renamed from: r */
    public final /* synthetic */ gg8 f29033r;

    public uf8(gg8 gg8Var, Comparable comparable, Object obj) {
        this.f29033r = gg8Var;
        this.f29031p = comparable;
        this.f29032q = obj;
    }

    /* renamed from: b */
    public static final boolean m8274b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: a */
    public final Comparable m8275a() {
        return this.f29031p;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f29031p.compareTo(((uf8) obj).f29031p);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return m8274b(this.f29031p, entry.getKey()) && m8274b(this.f29032q, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f29031p;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f29032q;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f29031p;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f29032q;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f29033r.m21643n();
        Object obj2 = this.f29032q;
        this.f29032q = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f29031p);
        String valueOf2 = String.valueOf(this.f29032q);
        return valueOf + "=" + valueOf2;
    }
}
