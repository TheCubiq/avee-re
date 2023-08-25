package com.daaw;

import android.app.job.JobInfo;
import com.daaw.o9;
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

    /* loaded from: classes.dex */
    public static class a {
        public cg a;
        public Map<cz0, b> b = new HashMap();

        public a a(cz0 cz0Var, b bVar) {
            this.b.put(cz0Var, bVar);
            return this;
        }

        public s81 b() {
            Objects.requireNonNull(this.a, "missing required property: clock");
            if (this.b.keySet().size() >= cz0.values().length) {
                Map<cz0, b> map = this.b;
                this.b = new HashMap();
                return s81.d(this.a, map);
            }
            throw new IllegalStateException("Not all priorities have been configured");
        }

        public a c(cg cgVar) {
            this.a = cgVar;
            return this;
        }
    }

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class b {

        @AutoValue.Builder
        /* loaded from: classes.dex */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j);

            public abstract a c(Set<c> set);

            public abstract a d(long j);
        }

        public static a a() {
            return new o9.b().c(Collections.emptySet());
        }

        public abstract long b();

        public abstract Set<c> c();

        public abstract long d();
    }

    /* loaded from: classes.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public static a b() {
        return new a();
    }

    public static s81 d(cg cgVar, Map<cz0, b> map) {
        return new n9(cgVar, map);
    }

    public static s81 f(cg cgVar) {
        return b().a(cz0.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(cz0.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(cz0.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(cgVar).b();
    }

    public static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    public final long a(int i, long j) {
        int i2 = i - 1;
        double max = Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * i2));
        double pow = Math.pow(3.0d, i2);
        double d = j;
        Double.isNaN(d);
        return (long) (pow * d * max);
    }

    public JobInfo.Builder c(JobInfo.Builder builder, cz0 cz0Var, long j, int i) {
        builder.setMinimumLatency(g(cz0Var, j, i));
        j(builder, h().get(cz0Var).c());
        return builder;
    }

    public abstract cg e();

    public long g(cz0 cz0Var, long j, int i) {
        long a2 = j - e().a();
        b bVar = h().get(cz0Var);
        return Math.min(Math.max(a(i, bVar.b()), a2), bVar.d());
    }

    public abstract Map<cz0, b> h();

    public final void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
