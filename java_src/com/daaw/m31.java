package com.daaw;
/* loaded from: classes2.dex */
public class m31 {

    /* renamed from: a */
    public static final n31 f18420a;

    /* renamed from: b */
    public static final di0[] f18421b;

    static {
        n31 n31Var = null;
        try {
            n31Var = (n31) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (n31Var == null) {
            n31Var = new n31();
        }
        f18420a = n31Var;
        f18421b = new di0[0];
    }

    /* renamed from: a */
    public static di0 m16243a(Class cls) {
        return f18420a.m15548a(cls);
    }

    /* renamed from: b */
    public static ei0 m16242b(Class cls) {
        return f18420a.m15547b(cls, "");
    }

    /* renamed from: c */
    public static fi0 m16241c(oz0 oz0Var) {
        return f18420a.m15546c(oz0Var);
    }

    /* renamed from: d */
    public static String m16240d(si0 si0Var) {
        return f18420a.m15544e(si0Var);
    }
}
