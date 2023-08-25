package com.daaw;

import android.annotation.SuppressLint;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class jm1 {

    /* renamed from: a */
    public static long f15199a;

    /* renamed from: b */
    public static Method f15200b;

    /* renamed from: a */
    public static void m18417a(String str) {
        km1.m17667a(str);
    }

    /* renamed from: b */
    public static void m18416b() {
        km1.m17666b();
    }

    /* renamed from: c */
    public static void m18415c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to call ");
        sb.append(str);
        sb.append(" via reflection");
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    public static boolean m18414d() {
        try {
            if (f15200b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m18413e();
    }

    /* renamed from: e */
    public static boolean m18413e() {
        try {
            if (f15200b == null) {
                f15199a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f15200b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f15200b.invoke(null, Long.valueOf(f15199a))).booleanValue();
        } catch (Exception e) {
            m18415c("isTagEnabled", e);
            return false;
        }
    }
}
