package com.daaw;

import com.daaw.C0940c9;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
@AutoValue
/* renamed from: com.daaw.by */
/* loaded from: classes.dex */
public abstract class AbstractC0896by {

    @AutoValue.Builder
    /* renamed from: com.daaw.by$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0897a {
        /* renamed from: a */
        public final AbstractC0897a m25742a(String str, int i) {
            mo25499e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final AbstractC0897a m25741b(String str, long j) {
            mo25499e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final AbstractC0897a m25740c(String str, String str2) {
            mo25499e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract AbstractC0896by mo25500d();

        /* renamed from: e */
        public abstract Map<String, String> mo25499e();

        /* renamed from: f */
        public abstract AbstractC0897a mo25498f(Map<String, String> map);

        /* renamed from: g */
        public abstract AbstractC0897a mo25497g(Integer num);

        /* renamed from: h */
        public abstract AbstractC0897a mo25496h(C3475ww c3475ww);

        /* renamed from: i */
        public abstract AbstractC0897a mo25495i(long j);

        /* renamed from: j */
        public abstract AbstractC0897a mo25494j(String str);

        /* renamed from: k */
        public abstract AbstractC0897a mo25493k(long j);
    }

    /* renamed from: a */
    public static AbstractC0897a m25748a() {
        return new C0940c9.C0942b().mo25498f(new HashMap());
    }

    /* renamed from: b */
    public final String m25747b(String str) {
        String str2 = mo25506c().get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: c */
    public abstract Map<String, String> mo25506c();

    /* renamed from: d */
    public abstract Integer mo25505d();

    /* renamed from: e */
    public abstract C3475ww mo25504e();

    /* renamed from: f */
    public abstract long mo25503f();

    /* renamed from: g */
    public final int m25746g(String str) {
        String str2 = mo25506c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long m25745h(String str) {
        String str2 = mo25506c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map<String, String> m25744i() {
        return Collections.unmodifiableMap(mo25506c());
    }

    /* renamed from: j */
    public abstract String mo25502j();

    /* renamed from: k */
    public abstract long mo25501k();

    /* renamed from: l */
    public AbstractC0897a m25743l() {
        return new C0940c9.C0942b().mo25494j(mo25502j()).mo25497g(mo25505d()).mo25496h(mo25504e()).mo25495i(mo25503f()).mo25493k(mo25501k()).mo25498f(new HashMap(mo25506c()));
    }
}
