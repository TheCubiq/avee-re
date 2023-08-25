package com.daaw;
/* loaded from: classes2.dex */
public final class u88 {

    /* renamed from: a */
    public static final o88 f28799a = new r88();

    /* renamed from: b */
    public static final o88 f28800b;

    static {
        o88 o88Var;
        try {
            o88Var = (o88) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            o88Var = null;
        }
        f28800b = o88Var;
    }

    /* renamed from: a */
    public static o88 m8413a() {
        o88 o88Var = f28800b;
        if (o88Var != null) {
            return o88Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* renamed from: b */
    public static o88 m8412b() {
        return f28799a;
    }
}
