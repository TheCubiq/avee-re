package com.daaw;
/* loaded from: classes2.dex */
public final class jv0 implements InterfaceC2710qf {

    /* renamed from: a */
    public final Class<?> f15439a;

    /* renamed from: b */
    public final String f15440b;

    public jv0(Class<?> cls, String str) {
        ug0.m8268f(cls, "jClass");
        ug0.m8268f(str, "moduleName");
        this.f15439a = cls;
        this.f15440b = str;
    }

    @Override // com.daaw.InterfaceC2710qf
    /* renamed from: a */
    public Class<?> mo11353a() {
        return this.f15439a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof jv0) && ug0.m8273a(mo11353a(), ((jv0) obj).mo11353a());
    }

    public int hashCode() {
        return mo11353a().hashCode();
    }

    public String toString() {
        return mo11353a().toString() + " (Kotlin reflection is not available)";
    }
}
