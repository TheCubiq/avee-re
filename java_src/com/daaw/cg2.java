package com.daaw;

import android.util.Log;
import java.util.Locale;
/* loaded from: classes.dex */
public final class cg2 {

    /* renamed from: a */
    public static final boolean f5792a = Log.isLoggable("Volley", 2);

    /* renamed from: b */
    public static final String f5793b = cg2.class.getName();

    /* renamed from: a */
    public static void m25392a(String str, Object... objArr) {
        m25388e(str, objArr);
    }

    /* renamed from: b */
    public static void m25391b(String str, Object... objArr) {
        m25388e(str, objArr);
    }

    /* renamed from: c */
    public static void m25390c(Throwable th, String str, Object... objArr) {
        m25388e(str, objArr);
    }

    /* renamed from: d */
    public static void m25389d(String str, Object... objArr) {
        if (f5792a) {
            m25388e(str, objArr);
        }
    }

    /* renamed from: e */
    public static String m25388e(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(f5793b)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, format);
    }
}
