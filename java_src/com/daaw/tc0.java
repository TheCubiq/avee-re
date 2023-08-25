package com.daaw;

import android.annotation.SuppressLint;
import android.icu.util.ULocale;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
/* loaded from: classes.dex */
public final class tc0 {

    /* renamed from: a */
    public static Method f27360a;

    /* renamed from: b */
    public static Method f27361b;

    /* renamed from: com.daaw.tc0$a */
    /* loaded from: classes.dex */
    public static class C3046a {
        /* renamed from: a */
        public static String m9339a(Locale locale) {
            return locale.getScript();
        }
    }

    /* renamed from: com.daaw.tc0$b */
    /* loaded from: classes.dex */
    public static class C3047b {
        /* renamed from: a */
        public static ULocale m9338a(Object obj) {
            return ULocale.addLikelySubtags((ULocale) obj);
        }

        /* renamed from: b */
        public static ULocale m9337b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        /* renamed from: c */
        public static String m9336c(Object obj) {
            return ((ULocale) obj).getScript();
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (i < 24) {
                try {
                    f27361b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
                    return;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
            return;
        }
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            f27360a = cls.getMethod("getScript", String.class);
            f27361b = cls.getMethod("addLikelySubtags", String.class);
        } catch (Exception unused) {
            f27360a = null;
            f27361b = null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: a */
    public static String m9342a(Locale locale) {
        String locale2 = locale.toString();
        try {
            Method method = f27361b;
            if (method != null) {
                return (String) method.invoke(null, locale2);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return locale2;
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* renamed from: b */
    public static String m9341b(String str) {
        try {
            Method method = f27360a;
            if (method != null) {
                return (String) method.invoke(null, str);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    /* renamed from: c */
    public static String m9340c(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return C3047b.m9336c(C3047b.m9338a(C3047b.m9337b(locale)));
        }
        if (i >= 21) {
            try {
                return C3046a.m9339a((Locale) f27361b.invoke(null, locale));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return C3046a.m9339a(locale);
            }
        }
        String m9342a = m9342a(locale);
        if (m9342a != null) {
            return m9341b(m9342a);
        }
        return null;
    }
}
