package com.daaw;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
/* loaded from: classes.dex */
public final class tc0 {
    public static Method a;
    public static Method b;

    /* loaded from: classes.dex */
    public static class a {
        public static String a(Locale locale) {
            return locale.getScript();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static ULocale a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        public static ULocale b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        public static String c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (i < 24) {
                try {
                    b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                    return;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
            return;
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            a = cls.getMethod("getScript", String.class);
            b = cls.getMethod("addLikelySubtags", String.class);
        } catch (Exception unused) {
            a = null;
            b = null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static String a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = b;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static String b(String str) {
        try {
            Method method = a;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    public static String c(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return b.c(b.a(b.b(locale)));
        }
        if (i >= 21) {
            try {
                return a.a((Locale) b.invoke(null, locale));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return a.a(locale);
            }
        }
        String a2 = a(locale);
        if (a2 != null) {
            return b(a2);
        }
        return null;
    }
}
