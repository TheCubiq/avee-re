package com.daaw;
/* loaded from: classes.dex */
public final class tt7 {
    public static final st7 a;
    public static final st7 b;

    static {
        st7 st7Var;
        try {
            st7Var = (st7) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            st7Var = null;
        }
        a = st7Var;
        b = new st7();
    }

    public static st7 a() {
        return a;
    }

    public static st7 b() {
        return b;
    }
}
