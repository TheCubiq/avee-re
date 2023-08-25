package com.daaw;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class jz6 {
    @CheckForNull
    public static final Object a;
    @CheckForNull
    public static final Method b;
    @CheckForNull
    public static final Method c;

    static {
        Object b2 = b();
        a = b2;
        b = b2 == null ? null : c("getStackTraceElement", Throwable.class, Integer.TYPE);
        c = b2 != null ? d(b2) : null;
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @CheckForNull
    public static Object b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @CheckForNull
    public static Method c(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @CheckForNull
    public static Method d(Object obj) {
        try {
            Method c2 = c("getStackTraceDepth", Throwable.class);
            if (c2 == null) {
                return null;
            }
            c2.invoke(obj, new Throwable());
            return c2;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }
}
