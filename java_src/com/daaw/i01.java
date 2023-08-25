package com.daaw;

import java.lang.annotation.Annotation;
/* loaded from: classes2.dex */
public final class i01<T> {
    public final Class<? extends Annotation> a;
    public final Class<T> b;

    /* loaded from: classes2.dex */
    public @interface a {
    }

    public i01(Class<? extends Annotation> cls, Class<T> cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static <T> i01<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new i01<>(cls, cls2);
    }

    public static <T> i01<T> b(Class<T> cls) {
        return new i01<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i01.class != obj.getClass()) {
            return false;
        }
        i01 i01Var = (i01) obj;
        if (this.b.equals(i01Var.b)) {
            return this.a.equals(i01Var.a);
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        if (this.a == a.class) {
            return this.b.getName();
        }
        return "@" + this.a.getName() + " " + this.b.getName();
    }
}
