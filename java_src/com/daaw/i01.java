package com.daaw;

import java.lang.annotation.Annotation;
/* loaded from: classes2.dex */
public final class i01<T> {

    /* renamed from: a */
    public final Class<? extends Annotation> f13121a;

    /* renamed from: b */
    public final Class<T> f13122b;

    /* renamed from: com.daaw.i01$a */
    /* loaded from: classes2.dex */
    public @interface InterfaceC1648a {
    }

    public i01(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f13121a = cls;
        this.f13122b = cls2;
    }

    /* renamed from: a */
    public static <T> i01<T> m20272a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new i01<>(cls, cls2);
    }

    /* renamed from: b */
    public static <T> i01<T> m20271b(Class<T> cls) {
        return new i01<>(InterfaceC1648a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i01.class != obj.getClass()) {
            return false;
        }
        i01 i01Var = (i01) obj;
        if (this.f13122b.equals(i01Var.f13122b)) {
            return this.f13121a.equals(i01Var.f13121a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f13122b.hashCode() * 31) + this.f13121a.hashCode();
    }

    public String toString() {
        if (this.f13121a == InterfaceC1648a.class) {
            return this.f13122b.getName();
        }
        return "@" + this.f13121a.getName() + " " + this.f13122b.getName();
    }
}
