package com.daaw;
/* loaded from: classes2.dex */
public final class rd8 {
    public static final pd8 a;
    public static final pd8 b;

    static {
        pd8 pd8Var;
        try {
            pd8Var = (pd8) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            pd8Var = null;
        }
        a = pd8Var;
        b = new pd8();
    }

    public static pd8 a() {
        return a;
    }

    public static pd8 b() {
        return b;
    }
}
