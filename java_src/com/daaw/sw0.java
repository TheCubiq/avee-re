package com.daaw;

import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public class sw0 {

    /* renamed from: com.daaw.sw0$a */
    /* loaded from: classes2.dex */
    public static final class C2986a {

        /* renamed from: a */
        public static final C2986a f26708a = new C2986a();

        /* renamed from: b */
        public static final Method f26709b;

        /* renamed from: c */
        public static final Method f26710c;

        /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[LOOP:0: B:3:0x0015->B:13:0x003f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[EDGE_INSN: B:24:0x0043->B:15:0x0043 ?: BREAK  , SYNTHETIC] */
        static {
            Method method;
            Method method2;
            boolean z;
            Method[] methods = Throwable.class.getMethods();
            ug0.m8269e(methods, "throwableMethods");
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (ug0.m8273a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    ug0.m8269e(parameterTypes, "it.parameterTypes");
                    if (ug0.m8273a(C2410o6.m14535i(parameterTypes), Throwable.class)) {
                        z = true;
                        if (!z) {
                            break;
                        }
                        i2++;
                    }
                }
                z = false;
                if (!z) {
                }
            }
            f26709b = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (ug0.m8273a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            f26710c = method;
        }
    }

    /* renamed from: a */
    public void mo9797a(Throwable th, Throwable th2) {
        ug0.m8268f(th, "cause");
        ug0.m8268f(th2, "exception");
        Method method = C2986a.f26709b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    /* renamed from: b */
    public z21 mo9796b() {
        return new i00();
    }
}
