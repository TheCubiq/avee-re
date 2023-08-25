package com.daaw;

import com.daaw.C2158m9;
import com.daaw.jw0;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes2.dex */
public abstract class kw0 {

    /* renamed from: a */
    public static kw0 f16785a = m17394a().mo16155a();

    @AutoValue.Builder
    /* renamed from: com.daaw.kw0$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1990a {
        /* renamed from: a */
        public abstract kw0 mo16155a();

        /* renamed from: b */
        public abstract AbstractC1990a mo16154b(String str);

        /* renamed from: c */
        public abstract AbstractC1990a mo16153c(long j);

        /* renamed from: d */
        public abstract AbstractC1990a mo16152d(String str);

        /* renamed from: e */
        public abstract AbstractC1990a mo16151e(String str);

        /* renamed from: f */
        public abstract AbstractC1990a mo16150f(String str);

        /* renamed from: g */
        public abstract AbstractC1990a mo16149g(jw0.EnumC1884a enumC1884a);

        /* renamed from: h */
        public abstract AbstractC1990a mo16148h(long j);
    }

    /* renamed from: a */
    public static AbstractC1990a m17394a() {
        return new C2158m9.C2160b().mo16148h(0L).mo16149g(jw0.EnumC1884a.ATTEMPT_MIGRATION).mo16153c(0L);
    }

    /* renamed from: b */
    public abstract String mo16163b();

    /* renamed from: c */
    public abstract long mo16162c();

    /* renamed from: d */
    public abstract String mo16161d();

    /* renamed from: e */
    public abstract String mo16160e();

    /* renamed from: f */
    public abstract String mo16159f();

    /* renamed from: g */
    public abstract jw0.EnumC1884a mo16158g();

    /* renamed from: h */
    public abstract long mo16157h();

    /* renamed from: i */
    public boolean m17393i() {
        return mo16158g() == jw0.EnumC1884a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean m17392j() {
        return mo16158g() == jw0.EnumC1884a.NOT_GENERATED || mo16158g() == jw0.EnumC1884a.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean m17391k() {
        return mo16158g() == jw0.EnumC1884a.REGISTERED;
    }

    /* renamed from: l */
    public boolean m17390l() {
        return mo16158g() == jw0.EnumC1884a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean m17389m() {
        return mo16158g() == jw0.EnumC1884a.ATTEMPT_MIGRATION;
    }

    /* renamed from: n */
    public abstract AbstractC1990a mo16156n();

    /* renamed from: o */
    public kw0 m17388o(String str, long j, long j2) {
        return mo16156n().mo16154b(str).mo16153c(j).mo16148h(j2).mo16155a();
    }

    /* renamed from: p */
    public kw0 m17387p() {
        return mo16156n().mo16154b(null).mo16155a();
    }

    /* renamed from: q */
    public kw0 m17386q(String str) {
        return mo16156n().mo16151e(str).mo16149g(jw0.EnumC1884a.REGISTER_ERROR).mo16155a();
    }

    /* renamed from: r */
    public kw0 m17385r() {
        return mo16156n().mo16149g(jw0.EnumC1884a.NOT_GENERATED).mo16155a();
    }

    /* renamed from: s */
    public kw0 m17384s(String str, String str2, long j, String str3, long j2) {
        return mo16156n().mo16152d(str).mo16149g(jw0.EnumC1884a.REGISTERED).mo16154b(str3).mo16150f(str2).mo16153c(j2).mo16148h(j).mo16155a();
    }

    /* renamed from: t */
    public kw0 m17383t(String str) {
        return mo16156n().mo16152d(str).mo16149g(jw0.EnumC1884a.UNREGISTERED).mo16155a();
    }
}
