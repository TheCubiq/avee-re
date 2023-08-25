package com.daaw;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class rt7 extends LinkedHashMap {
    public static final rt7 q;
    public boolean p;

    static {
        rt7 rt7Var = new rt7();
        q = rt7Var;
        rt7Var.p = false;
    }

    public rt7() {
        this.p = true;
    }

    public rt7(Map map) {
        super(map);
        this.p = true;
    }

    public static rt7 a() {
        return q;
    }

    public static int f(Object obj) {
        if (obj instanceof byte[]) {
            return vs7.b((byte[]) obj);
        }
        if (obj instanceof ns7) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public final rt7 b() {
        return isEmpty() ? new rt7() : new rt7(this);
    }

    public final void c() {
        this.p = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
    }

    public final void d(rt7 rt7Var) {
        i();
        if (rt7Var.isEmpty()) {
            return;
        }
        putAll(rt7Var);
    }

    public final boolean e() {
        return this.p;
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
            i += f(entry.getValue()) ^ f(entry.getKey());
        }
        return i;
    }

    public final void i() {
        if (!this.p) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        i();
        vs7.e(obj);
        vs7.e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        i();
        for (Object obj : map.keySet()) {
            vs7.e(obj);
            vs7.e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        return super.remove(obj);
    }
}
