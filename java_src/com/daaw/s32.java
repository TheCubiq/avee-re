package com.daaw;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class s32 {
    public String a;
    public final long b;
    public final Map c;

    public s32(String str, long j, Map map) {
        this.a = str;
        this.b = j;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public final long a() {
        return this.b;
    }

    /* renamed from: b */
    public final s32 clone() {
        return new s32(this.a, this.b, new HashMap(this.c));
    }

    public final Object c(String str) {
        if (this.c.containsKey(str)) {
            return this.c.get(str);
        }
        return null;
    }

    public final String d() {
        return this.a;
    }

    public final Map e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s32) {
            s32 s32Var = (s32) obj;
            if (this.b == s32Var.b && this.a.equals(s32Var.a)) {
                return this.c.equals(s32Var.c);
            }
            return false;
        }
        return false;
    }

    public final void f(String str) {
        this.a = str;
    }

    public final void g(String str, Object obj) {
        if (obj == null) {
            this.c.remove(str);
        } else {
            this.c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c.hashCode();
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        String obj = this.c.toString();
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + obj + "}";
    }
}
