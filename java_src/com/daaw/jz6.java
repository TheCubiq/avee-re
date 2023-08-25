package com.daaw;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class jz6 {
    @CheckForNull

    /* renamed from: a */
    public static final Object f15556a;
    @CheckForNull

    /* renamed from: b */
    public static final Method f15557b;
    @CheckForNull

    /* renamed from: c */
    public static final Method f15558c;

    static {
        Object m18126b = m18126b();
        f15556a = m18126b;
        f15557b = m18126b == null ? null : m18125c("getStackTraceElement", Throwable.class, Integer.TYPE);
        f15558c = m18126b != null ? m18124d(m18126b) : null;
    }

    /* renamed from: a */
    public static String m18127a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @CheckForNull
    /* renamed from: b */
    public static Object m18126b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @CheckForNull
    /* renamed from: c */
    public static Method m18125c(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @CheckForNull
    /* renamed from: d */
    public static Method m18124d(Object obj) {
        try {
            Method m18125c = m18125c("getStackTraceDepth", Throwable.class);
            if (m18125c == null) {
                return null;
            }
            m18125c.invoke(obj, new Throwable());
            return m18125c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}
