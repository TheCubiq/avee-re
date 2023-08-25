package com.daaw;

import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public final class oq0 {

    /* renamed from: a */
    public static final oq0 f21821a = new oq0();

    /* renamed from: b */
    public static final C2467a f21822b = new C2467a(null, null, null);

    /* renamed from: c */
    public static C2467a f21823c;

    /* renamed from: com.daaw.oq0$a */
    /* loaded from: classes2.dex */
    public static final class C2467a {

        /* renamed from: a */
        public final Method f21824a;

        /* renamed from: b */
        public final Method f21825b;

        /* renamed from: c */
        public final Method f21826c;

        public C2467a(Method method, Method method2, Method method3) {
            this.f21824a = method;
            this.f21825b = method2;
            this.f21826c = method3;
        }
    }

    /* renamed from: a */
    public final C2467a m14088a(AbstractC2271na abstractC2271na) {
        try {
            C2467a c2467a = new C2467a(Class.class.getDeclaredMethod("getModule", new Class[0]), abstractC2271na.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), abstractC2271na.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f21823c = c2467a;
            return c2467a;
        } catch (Exception unused) {
            C2467a c2467a2 = f21822b;
            f21823c = c2467a2;
            return c2467a2;
        }
    }

    /* renamed from: b */
    public final String m14087b(AbstractC2271na abstractC2271na) {
        ug0.m8268f(abstractC2271na, "continuation");
        C2467a c2467a = f21823c;
        if (c2467a == null) {
            c2467a = m14088a(abstractC2271na);
        }
        if (c2467a == f21822b) {
            return null;
        }
        Method method = c2467a.f21824a;
        Object invoke = method != null ? method.invoke(abstractC2271na.getClass(), new Object[0]) : null;
        if (invoke == null) {
            return null;
        }
        Method method2 = c2467a.f21825b;
        Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
        if (invoke2 == null) {
            return null;
        }
        Method method3 = c2467a.f21826c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
