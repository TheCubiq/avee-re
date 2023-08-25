package com.daaw;

import android.os.Build;
import android.util.Log;
/* loaded from: classes.dex */
public final class nl0 {
    /* renamed from: a */
    public static String m15089a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    /* renamed from: b */
    public static void m15088b(String str, String str2, Object obj) {
        if (Log.isLoggable(m15085e(str), 3)) {
            String.format(str2, obj);
        }
    }

    /* renamed from: c */
    public static void m15087c(String str, String str2, Object... objArr) {
        if (Log.isLoggable(m15085e(str), 3)) {
            String.format(str2, objArr);
        }
    }

    /* renamed from: d */
    public static void m15086d(String str, String str2, Throwable th) {
        m15085e(str);
    }

    /* renamed from: e */
    public static String m15085e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m15089a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: f */
    public static void m15084f(String str, String str2, Object obj) {
        if (Log.isLoggable(m15085e(str), 4)) {
            String.format(str2, obj);
        }
    }

    /* renamed from: g */
    public static void m15083g(String str, String str2, Object obj) {
        if (Log.isLoggable(m15085e(str), 5)) {
            String.format(str2, obj);
        }
    }
}
