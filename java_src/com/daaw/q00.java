package com.daaw;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class q00 {
    public final String a;
    public final Map<Class<?>, Object> b;

    /* loaded from: classes2.dex */
    public static final class b {
        public final String a;
        public Map<Class<?>, Object> b = null;

        public b(String str) {
            this.a = str;
        }

        public q00 a() {
            return new q00(this.a, this.b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.b)));
        }

        public <T extends Annotation> b b(T t) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(t.annotationType(), t);
            return this;
        }
    }

    public q00(String str, Map<Class<?>, Object> map) {
        this.a = str;
        this.b = map;
    }

    public static b a(String str) {
        return new b(str);
    }

    public static q00 d(String str) {
        return new q00(str, Collections.emptyMap());
    }

    public String b() {
        return this.a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (T) this.b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q00) {
            q00 q00Var = (q00) obj;
            return this.a.equals(q00Var.a) && this.b.equals(q00Var.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
