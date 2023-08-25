package com.daaw;

import com.daaw.f9;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes2.dex */
public abstract class ig0 {

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract ig0 a();

        public abstract a b(bm1 bm1Var);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(b bVar);

        public abstract a f(String str);
    }

    /* loaded from: classes2.dex */
    public enum b {
        OK,
        BAD_CONFIG
    }

    public static a a() {
        return new f9.b();
    }

    public abstract bm1 b();

    public abstract String c();

    public abstract String d();

    public abstract b e();

    public abstract String f();
}
