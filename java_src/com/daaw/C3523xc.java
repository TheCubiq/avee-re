package com.daaw;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.Locale;
/* renamed from: com.daaw.xc */
/* loaded from: classes.dex */
public class C3523xc {
    /* renamed from: a */
    public static boolean m5292a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @SuppressLint({"RestrictedApi"})
    @Deprecated
    /* renamed from: b */
    public static boolean m5291b() {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 || (i >= 30 && m5292a("S", Build.VERSION.CODENAME));
    }
}
