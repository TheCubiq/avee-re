package com.daaw;

import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public final class oq0 {
    public static final oq0 a = new oq0();
    public static final a b = new a(null, null, null);
    public static a c;

    /* loaded from: classes2.dex */
    public static final class a {
        public final Method a;
        public final Method b;
        public final Method c;

        public a(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    public final a a(na naVar) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), naVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), naVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = b;
            c = aVar2;
            return aVar2;
        }
    }

    public final String b(na naVar) {
        ug0.f(naVar, "continuation");
        a aVar = c;
        if (aVar == null) {
            aVar = a(naVar);
        }
        if (aVar == b) {
            return null;
        }
        Method method = aVar.a;
        Object invoke = method != null ? method.invoke(naVar.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = aVar.b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = aVar.c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
