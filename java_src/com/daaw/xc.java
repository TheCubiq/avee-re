package com.daaw;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Locale;
/* loaded from: classes.dex */
public class xc {
    public static boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @SuppressLint({"RestrictedApi"})
    @Deprecated
    public static boolean b() {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 || (i >= 30 && a("S", Build.VERSION.CODENAME));
    }
}
