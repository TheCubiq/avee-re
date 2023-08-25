package com.daaw;

import com.daaw.v9;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes2.dex */
public abstract class bm1 {

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract bm1 a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j);
    }

    /* loaded from: classes2.dex */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new v9.b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
