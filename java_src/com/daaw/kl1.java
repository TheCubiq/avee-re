package com.daaw;
/* loaded from: classes.dex */
public final class kl1 implements g00<cg> {

    /* loaded from: classes.dex */
    public static final class a {
        public static final kl1 a = new kl1();
    }

    public static kl1 a() {
        return a.a;
    }

    public static cg c() {
        return (cg) qy0.c(il1.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.daaw.a01
    /* renamed from: b */
    public cg get() {
        return c();
    }
}
