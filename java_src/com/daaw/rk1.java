package com.daaw;

import android.text.TextUtils;
import java.util.Locale;
/* loaded from: classes.dex */
public final class rk1 {
    public static final Locale a = new Locale("", "");

    /* loaded from: classes.dex */
    public static class a {
        public static int a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    public static int a(Locale locale) {
        return a.a(locale);
    }
}
