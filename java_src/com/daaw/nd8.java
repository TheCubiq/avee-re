package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes2.dex */
public final class nd8 extends LinkedHashMap {

    /* renamed from: q */
    public static final nd8 f20068q;

    /* renamed from: p */
    public boolean f20069p;

    static {
        nd8 nd8Var = new nd8();
        f20068q = nd8Var;
        nd8Var.f20069p = false;
    }

    public nd8() {
        this.f20069p = true;
    }

    public nd8(Map map) {
        super(map);
        this.f20069p = true;
    }

    /* renamed from: a */
    public static nd8 m15217a() {
        return f20068q;
    }

    /* renamed from: f */
    public static int m15212f(Object obj) {
        return obj instanceof byte[] ? gb8.m21819b((byte[]) obj) : obj.hashCode();
    }

    /* renamed from: b */
    public final nd8 m15216b() {
        return isEmpty() ? new nd8() : new nd8(this);
    }

    /* renamed from: c */
    public final void m15215c() {
        this.f20069p = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m15211i();
        super.clear();
    }

    /* renamed from: d */
    public final void m15214d(nd8 nd8Var) {
        m15211i();
        if (nd8Var.isEmpty()) {
            return;
        }
        putAll(nd8Var);
    }

    /* renamed from: e */
    public final boolean m15213e() {
        return this.f20069p;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                return true;
            }
            if (size() != map.size()) {
                return false;
            }
            Iterator it = entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!map.containsKey(entry.getKey())) {
                    return false;
                }
                Object value = entry.getValue();
                Object obj2 = map.get(entry.getKey());
                if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                    equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                    continue;
                } else {
                    equals = value.equals(obj2);
                    continue;
                }
                if (!equals) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i += m15212f(entry.getValue()) ^ m15212f(entry.getKey());
        }
        return i;
    }

    /* renamed from: i */
    public final void m15211i() {
        if (!this.f20069p) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m15211i();
        gb8.m21816e(obj);
        gb8.m21816e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m15211i();
        for (Object obj : map.keySet()) {
            gb8.m21816e(obj);
            gb8.m21816e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m15211i();
        return super.remove(obj);
    }
}
