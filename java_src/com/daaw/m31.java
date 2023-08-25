package com.daaw;
/* loaded from: classes2.dex */
public class m31 {
    public static final n31 a;
    public static final di0[] b;

    static {
        n31 n31Var = null;
        try {
            n31Var = (n31) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (n31Var == null) {
            n31Var = new n31();
        }
        a = n31Var;
        b = new di0[0];
    }

    public static di0 a(Class cls) {
        return a.a(cls);
    }

    public static ei0 b(Class cls) {
        return a.b(cls, "");
    }

    public static fi0 c(oz0 oz0Var) {
        return a.c(oz0Var);
    }

    public static String d(si0 si0Var) {
        return a.e(si0Var);
    }
}
