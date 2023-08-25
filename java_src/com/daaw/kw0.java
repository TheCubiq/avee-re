package com.daaw;

import com.daaw.jw0;
import com.daaw.m9;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes2.dex */
public abstract class kw0 {
    public static kw0 a = a().a();

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract kw0 a();

        public abstract a b(String str);

        public abstract a c(long j);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(jw0.a aVar);

        public abstract a h(long j);
    }

    public static a a() {
        return new m9.b().h(0L).g(jw0.a.ATTEMPT_MIGRATION).c(0L);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract jw0.a g();

    public abstract long h();

    public boolean i() {
        return g() == jw0.a.REGISTER_ERROR;
    }

    public boolean j() {
        return g() == jw0.a.NOT_GENERATED || g() == jw0.a.ATTEMPT_MIGRATION;
    }

    public boolean k() {
        return g() == jw0.a.REGISTERED;
    }

    public boolean l() {
        return g() == jw0.a.UNREGISTERED;
    }

    public boolean m() {
        return g() == jw0.a.ATTEMPT_MIGRATION;
    }

    public abstract a n();

    public kw0 o(String str, long j, long j2) {
        return n().b(str).c(j).h(j2).a();
    }

    public kw0 p() {
        return n().b(null).a();
    }

    public kw0 q(String str) {
        return n().e(str).g(jw0.a.REGISTER_ERROR).a();
    }

    public kw0 r() {
        return n().g(jw0.a.NOT_GENERATED).a();
    }

    public kw0 s(String str, String str2, long j, String str3, long j2) {
        return n().d(str).g(jw0.a.REGISTERED).b(str3).f(str2).c(j2).h(j).a();
    }

    public kw0 t(String str) {
        return n().d(str).g(jw0.a.UNREGISTERED).a();
    }
}
