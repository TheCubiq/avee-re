package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class rt7 extends LinkedHashMap {

    /* renamed from: q */
    public static final rt7 f25593q;

    /* renamed from: p */
    public boolean f25594p;

    static {
        rt7 rt7Var = new rt7();
        f25593q = rt7Var;
        rt7Var.f25594p = false;
    }

    public rt7() {
        this.f25594p = true;
    }

    public rt7(Map map) {
        super(map);
        this.f25594p = true;
    }

    /* renamed from: a */
    public static rt7 m10955a() {
        return f25593q;
    }

    /* renamed from: f */
    public static int m10950f(Object obj) {
        if (obj instanceof byte[]) {
            return vs7.m6819b((byte[]) obj);
        }
        if (obj instanceof ns7) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* renamed from: b */
    public final rt7 m10954b() {
        return isEmpty() ? new rt7() : new rt7(this);
    }

    /* renamed from: c */
    public final void m10953c() {
        this.f25594p = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m10949i();
        super.clear();
    }

    /* renamed from: d */
    public final void m10952d(rt7 rt7Var) {
        m10949i();
        if (rt7Var.isEmpty()) {
            return;
        }
        putAll(rt7Var);
    }

    /* renamed from: e */
    public final boolean m10951e() {
        return this.f25594p;
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
            i += m10950f(entry.getValue()) ^ m10950f(entry.getKey());
        }
        return i;
    }

    /* renamed from: i */
    public final void m10949i() {
        if (!this.f25594p) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m10949i();
        vs7.m6816e(obj);
        vs7.m6816e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m10949i();
        for (Object obj : map.keySet()) {
            vs7.m6816e(obj);
            vs7.m6816e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m10949i();
        return super.remove(obj);
    }
}
