package com.daaw;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class q00 {

    /* renamed from: a */
    public final String f23583a;

    /* renamed from: b */
    public final Map<Class<?>, Object> f23584b;

    /* renamed from: com.daaw.q00$b */
    /* loaded from: classes2.dex */
    public static final class C2678b {

        /* renamed from: a */
        public final String f23585a;

        /* renamed from: b */
        public Map<Class<?>, Object> f23586b = null;

        public C2678b(String str) {
            this.f23585a = str;
        }

        /* renamed from: a */
        public q00 m12812a() {
            return new q00(this.f23585a, this.f23586b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f23586b)));
        }

        /* renamed from: b */
        public <T extends Annotation> C2678b m12811b(T t) {
            if (this.f23586b == null) {
                this.f23586b = new HashMap();
            }
            this.f23586b.put(t.annotationType(), t);
            return this;
        }
    }

    public q00(String str, Map<Class<?>, Object> map) {
        this.f23583a = str;
        this.f23584b = map;
    }

    /* renamed from: a */
    public static C2678b m12816a(String str) {
        return new C2678b(str);
    }

    /* renamed from: d */
    public static q00 m12813d(String str) {
        return new q00(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String m12815b() {
        return this.f23583a;
    }

    /* renamed from: c */
    public <T extends Annotation> T m12814c(Class<T> cls) {
        return (T) this.f23584b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q00) {
            q00 q00Var = (q00) obj;
            return this.f23583a.equals(q00Var.f23583a) && this.f23584b.equals(q00Var.f23584b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f23583a.hashCode() * 31) + this.f23584b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f23583a + ", properties=" + this.f23584b.values() + "}";
    }
}
