package com.daaw;
/* loaded from: classes2.dex */
public final class le8 {
    public static final je8 a;
    public static final je8 b;

    static {
        je8 je8Var;
        try {
            je8Var = (je8) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            je8Var = null;
        }
        a = je8Var;
        b = new je8();
    }

    public static je8 a() {
        return a;
    }

    public static je8 b() {
        return b;
    }
}
