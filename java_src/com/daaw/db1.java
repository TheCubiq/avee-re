package com.daaw;

import com.daaw.p9;
import com.google.auto.value.AutoValue;
@AutoValue
/* loaded from: classes.dex */
public abstract class db1 {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract db1 a();

        public abstract a b(bx bxVar);

        public abstract a c(xx<?> xxVar);

        public abstract a d(hn1<?, byte[]> hn1Var);

        public abstract a e(sn1 sn1Var);

        public abstract a f(String str);
    }

    public static a a() {
        return new p9.b();
    }

    public abstract bx b();

    public abstract xx<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    public abstract hn1<?, byte[]> e();

    public abstract sn1 f();

    public abstract String g();
}
