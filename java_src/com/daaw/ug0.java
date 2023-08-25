package com.daaw;

import java.util.Arrays;
/* loaded from: classes2.dex */
public class ug0 {
    /* renamed from: a */
    public static boolean m8273a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m8272b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) m8264j(new IllegalStateException(str + " must not be null")));
    }

    /* renamed from: c */
    public static void m8271c(Object obj) {
        if (obj == null) {
            m8261m();
        }
    }

    /* renamed from: d */
    public static void m8270d(Object obj, String str) {
        if (obj == null) {
            m8260n(str);
        }
    }

    /* renamed from: e */
    public static void m8269e(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m8264j(new NullPointerException(str + " must not be null")));
    }

    /* renamed from: f */
    public static void m8268f(Object obj, String str) {
        if (obj == null) {
            m8257q(str);
        }
    }

    /* renamed from: g */
    public static void m8267g(Object obj, String str) {
        if (obj == null) {
            m8258p(str);
        }
    }

    /* renamed from: h */
    public static int m8266h(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: i */
    public static String m8265i(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: j */
    public static <T extends Throwable> T m8264j(T t) {
        return (T) m8263k(t, ug0.class.getName());
    }

    /* renamed from: k */
    public static <T extends Throwable> T m8263k(T t, String str) {
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

    /* renamed from: l */
    public static String m8262l(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: m */
    public static void m8261m() {
        throw ((NullPointerException) m8264j(new NullPointerException()));
    }

    /* renamed from: n */
    public static void m8260n(String str) {
        throw ((NullPointerException) m8264j(new NullPointerException(str)));
    }

    /* renamed from: o */
    public static void m8259o() {
        throw ((ni0) m8264j(new ni0()));
    }

    /* renamed from: p */
    public static void m8258p(String str) {
        throw ((IllegalArgumentException) m8264j(new IllegalArgumentException(m8265i(str))));
    }

    /* renamed from: q */
    public static void m8257q(String str) {
        throw ((NullPointerException) m8264j(new NullPointerException(m8265i(str))));
    }

    /* renamed from: r */
    public static void m8256r(String str) {
        throw ((kp1) m8264j(new kp1(str)));
    }

    /* renamed from: s */
    public static void m8255s(String str) {
        m8256r("lateinit property " + str + " has not been initialized");
    }
}
