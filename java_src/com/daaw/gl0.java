package com.daaw;

import com.daaw.i9;
import com.google.auto.value.AutoValue;
import java.util.List;
@AutoValue
/* loaded from: classes.dex */
public abstract class gl0 {

    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract gl0 a();

        public abstract a b(uf ufVar);

        public abstract a c(List<cl0> list);

        public abstract a d(Integer num);

        public abstract a e(String str);

        public abstract a f(h01 h01Var);

        public abstract a g(long j);

        public abstract a h(long j);

        public a i(int i) {
            return d(Integer.valueOf(i));
        }

        public a j(String str) {
            return e(str);
        }
    }

    public static a a() {
        return new i9.b();
    }

    public abstract uf b();

    public abstract List<cl0> c();

    public abstract Integer d();

    public abstract String e();

    public abstract h01 f();

    public abstract long g();

    public abstract long h();
}
