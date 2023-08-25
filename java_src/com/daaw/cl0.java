package com.daaw;

import com.daaw.h9;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes.dex */
public abstract class cl0 {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract cl0 a();

        public abstract a b(Integer num);

        public abstract a c(long j);

        public abstract a d(long j);

        public abstract a e(ls0 ls0Var);

        public abstract a f(byte[] bArr);

        public abstract a g(String str);

        public abstract a h(long j);
    }

    public static a a() {
        return new h9.b();
    }

    public static a i(String str) {
        return a().g(str);
    }

    public static a j(byte[] bArr) {
        return a().f(bArr);
    }

    public abstract Integer b();

    public abstract long c();

    public abstract long d();

    public abstract ls0 e();

    public abstract byte[] f();

    public abstract String g();

    public abstract long h();
}
