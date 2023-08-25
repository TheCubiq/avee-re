package com.daaw;
/* loaded from: classes2.dex */
public final class jv0 implements qf {
    public final Class<?> a;
    public final String b;

    public jv0(Class<?> cls, String str) {
        ug0.f(cls, "jClass");
        ug0.f(str, "moduleName");
        this.a = cls;
        this.b = str;
    }

    @Override // com.daaw.qf
    public Class<?> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof jv0) && ug0.a(a(), ((jv0) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
