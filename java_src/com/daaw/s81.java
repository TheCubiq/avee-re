package com.daaw;

import android.app.job.JobInfo;
import com.daaw.C2424o9;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
@AutoValue
/* loaded from: classes.dex */
public abstract class s81 {

    /* renamed from: com.daaw.s81$a */
    /* loaded from: classes.dex */
    public static class C2920a {

        /* renamed from: a */
        public InterfaceC0951cg f25993a;

        /* renamed from: b */
        public Map<cz0, AbstractC2921b> f25994b = new HashMap();

        /* renamed from: a */
        public C2920a m10539a(cz0 cz0Var, AbstractC2921b abstractC2921b) {
            this.f25994b.put(cz0Var, abstractC2921b);
            return this;
        }

        /* renamed from: b */
        public s81 m10538b() {
            Objects.requireNonNull(this.f25993a, "missing required property: clock");
            if (this.f25994b.keySet().size() >= cz0.values().length) {
                Map<cz0, AbstractC2921b> map = this.f25994b;
                this.f25994b = new HashMap();
                return s81.m10546d(this.f25993a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        /* renamed from: c */
        public C2920a m10537c(InterfaceC0951cg interfaceC0951cg) {
            this.f25993a = interfaceC0951cg;
            return this;
        }
    }

    @AutoValue
    /* renamed from: com.daaw.s81$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2921b {

        @AutoValue.Builder
        /* renamed from: com.daaw.s81$b$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC2922a {
            /* renamed from: a */
            public abstract AbstractC2921b mo10532a();

            /* renamed from: b */
            public abstract AbstractC2922a mo10531b(long j);

            /* renamed from: c */
            public abstract AbstractC2922a mo10530c(Set<EnumC2923c> set);

            /* renamed from: d */
            public abstract AbstractC2922a mo10529d(long j);
        }

        /* renamed from: a */
        public static AbstractC2922a m10536a() {
            return new C2424o9.C2426b().mo10530c(Collections.emptySet());
        }

        /* renamed from: b */
        public abstract long mo10535b();

        /* renamed from: c */
        public abstract Set<EnumC2923c> mo10534c();

        /* renamed from: d */
        public abstract long mo10533d();
    }

    /* renamed from: com.daaw.s81$c */
    /* loaded from: classes.dex */
    public enum EnumC2923c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: b */
    public static C2920a m10548b() {
        return new C2920a();
    }

    /* renamed from: d */
    public static s81 m10546d(InterfaceC0951cg interfaceC0951cg, Map<cz0, AbstractC2921b> map) {
        return new C2267n9(interfaceC0951cg, map);
    }

    /* renamed from: f */
    public static s81 m10544f(InterfaceC0951cg interfaceC0951cg) {
        return m10548b().m10539a(cz0.DEFAULT, AbstractC2921b.m10536a().mo10531b(30000L).mo10529d(86400000L).mo10532a()).m10539a(cz0.HIGHEST, AbstractC2921b.m10536a().mo10531b(1000L).mo10529d(86400000L).mo10532a()).m10539a(cz0.VERY_LOW, AbstractC2921b.m10536a().mo10531b(86400000L).mo10529d(86400000L).mo10530c(m10541i(EnumC2923c.DEVICE_IDLE)).mo10532a()).m10537c(interfaceC0951cg).m10538b();
    }

    /* renamed from: i */
    public static <T> Set<T> m10541i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    /* renamed from: a */
    public final long m10549a(int i, long j) {
        int i2 = i - 1;
        double max = Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * i2));
        double pow = Math.pow(3.0d, i2);
        double d = j;
        Double.isNaN(d);
        return (long) (pow * d * max);
    }

    /* renamed from: c */
    public JobInfo.Builder m10547c(JobInfo.Builder builder, cz0 cz0Var, long j, int i) {
        builder.setMinimumLatency(m10543g(cz0Var, j, i));
        m10540j(builder, mo10542h().get(cz0Var).mo10534c());
        return builder;
    }

    /* renamed from: e */
    public abstract InterfaceC0951cg mo10545e();

    /* renamed from: g */
    public long m10543g(cz0 cz0Var, long j, int i) {
        long mo21345a = j - mo10545e().mo21345a();
        AbstractC2921b abstractC2921b = mo10542h().get(cz0Var);
        return Math.min(Math.max(m10549a(i, abstractC2921b.mo10535b()), mo21345a), abstractC2921b.mo10533d());
    }

    /* renamed from: h */
    public abstract Map<cz0, AbstractC2921b> mo10542h();

    /* renamed from: j */
    public final void m10540j(JobInfo.Builder builder, Set<EnumC2923c> set) {
        if (set.contains(EnumC2923c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(EnumC2923c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(EnumC2923c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
