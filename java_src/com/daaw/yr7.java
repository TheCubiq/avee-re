package com.daaw;
/* loaded from: classes.dex */
public final class yr7 {

    /* renamed from: a */
    public static final wr7 f33989a = new xr7();

    /* renamed from: b */
    public static final wr7 f33990b;

    static {
        wr7 wr7Var;
        try {
            wr7Var = (wr7) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            wr7Var = null;
        }
        f33990b = wr7Var;
    }

    /* renamed from: a */
    public static wr7 m3374a() {
        wr7 wr7Var = f33990b;
        if (wr7Var != null) {
            return wr7Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static wr7 m3373b() {
        return f33989a;
    }
}
