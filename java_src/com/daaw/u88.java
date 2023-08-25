package com.daaw;
/* loaded from: classes2.dex */
public final class u88 {
    public static final o88 a = new r88();
    public static final o88 b;

    static {
        o88 o88Var;
        try {
            o88Var = (o88) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            o88Var = null;
        }
        b = o88Var;
    }

    public static o88 a() {
        o88 o88Var = b;
        if (o88Var != null) {
            return o88Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static o88 b() {
        return a;
    }
}
