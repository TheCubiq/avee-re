package com.daaw;
/* loaded from: classes.dex */
public final class yr7 {
    public static final wr7 a = new xr7();
    public static final wr7 b;

    static {
        wr7 wr7Var;
        try {
            wr7Var = (wr7) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            wr7Var = null;
        }
        b = wr7Var;
    }

    public static wr7 a() {
        wr7 wr7Var = b;
        if (wr7Var != null) {
            return wr7Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static wr7 b() {
        return a;
    }
}
