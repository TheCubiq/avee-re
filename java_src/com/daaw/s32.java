package com.daaw;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class s32 {

    /* renamed from: a */
    public String f25826a;

    /* renamed from: b */
    public final long f25827b;

    /* renamed from: c */
    public final Map f25828c;

    public s32(String str, long j, Map map) {
        this.f25826a = str;
        this.f25827b = j;
        HashMap hashMap = new HashMap();
        this.f25828c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    /* renamed from: a */
    public final long m10741a() {
        return this.f25827b;
    }

    /* renamed from: b */
    public final s32 clone() {
        return new s32(this.f25826a, this.f25827b, new HashMap(this.f25828c));
    }

    /* renamed from: c */
    public final Object m10739c(String str) {
        if (this.f25828c.containsKey(str)) {
            return this.f25828c.get(str);
        }
        return null;
    }

    /* renamed from: d */
    public final String m10738d() {
        return this.f25826a;
    }

    /* renamed from: e */
    public final Map m10737e() {
        return this.f25828c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s32) {
            s32 s32Var = (s32) obj;
            if (this.f25827b == s32Var.f25827b && this.f25826a.equals(s32Var.f25826a)) {
                return this.f25828c.equals(s32Var.f25828c);
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public final void m10736f(String str) {
        this.f25826a = str;
    }

    /* renamed from: g */
    public final void m10735g(String str, Object obj) {
        if (obj == null) {
            this.f25828c.remove(str);
        } else {
            this.f25828c.put(str, obj);
        }
    }

    public final int hashCode() {
        int hashCode = this.f25826a.hashCode();
        long j = this.f25827b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f25828c.hashCode();
    }

    public final String toString() {
        String str = this.f25826a;
        long j = this.f25827b;
        String obj = this.f25828c.toString();
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + obj + "}";
    }
}
