package com.daaw;
/* loaded from: classes.dex */
public final class du7 {
    public static final cu7 a;
    public static final cu7 b;

    static {
        cu7 cu7Var;
        try {
            cu7Var = (cu7) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            cu7Var = null;
        }
        a = cu7Var;
        b = new cu7();
    }

    public static cu7 a() {
        return a;
    }

    public static cu7 b() {
        return b;
    }
}
