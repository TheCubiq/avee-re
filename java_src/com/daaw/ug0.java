package com.daaw;

import java.util.Arrays;
/* loaded from: classes2.dex */
public class ug0 {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) j(new IllegalStateException(str + " must not be null")));
    }

    public static void c(Object obj) {
        if (obj == null) {
            m();
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            n(str);
        }
    }

    public static void e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) j(new NullPointerException(str + " must not be null")));
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            q(str);
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            p(str);
        }
    }

    public static int h(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static String i(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static <T extends Throwable> T j(T t) {
        return (T) k(t, ug0.class.getName());
    }

    public static <T extends Throwable> T k(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static String l(String str, Object obj) {
        return str + obj;
    }

    public static void m() {
        throw ((NullPointerException) j(new NullPointerException()));
    }

    public static void n(String str) {
        throw ((NullPointerException) j(new NullPointerException(str)));
    }

    public static void o() {
        throw ((ni0) j(new ni0()));
    }

    public static void p(String str) {
        throw ((IllegalArgumentException) j(new IllegalArgumentException(i(str))));
    }

    public static void q(String str) {
        throw ((NullPointerException) j(new NullPointerException(i(str))));
    }

    public static void r(String str) {
        throw ((kp1) j(new kp1(str)));
    }

    public static void s(String str) {
        r("lateinit property " + str + " has not been initialized");
    }
}
