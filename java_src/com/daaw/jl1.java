package com.daaw;
/* loaded from: classes.dex */
public final class jl1 implements g00<cg> {

    /* loaded from: classes.dex */
    public static final class a {
        public static final jl1 a = new jl1();
    }

    public static jl1 a() {
        return a.a;
    }

    public static cg b() {
        return (cg) qy0.c(il1.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.daaw.a01
    /* renamed from: c */
    public cg get() {
        return b();
    }
}
