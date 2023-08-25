package com.daaw;

import android.util.Log;
import java.util.Locale;
/* loaded from: classes.dex */
public final class cg2 {
    public static final boolean a = Log.isLoggable("Volley", 2);
    public static final String b = cg2.class.getName();

    public static void a(String str, Object... objArr) {
        e(str, objArr);
    }

    public static void b(String str, Object... objArr) {
        e(str, objArr);
    }

    public static void c(Throwable th, String str, Object... objArr) {
        e(str, objArr);
    }

    public static void d(String str, Object... objArr) {
        if (a) {
            e(str, objArr);
        }
    }

    public static String e(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(b)) {
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
