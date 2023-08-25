package com.daaw;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
/* loaded from: classes.dex */
public final class cj {

    /* loaded from: classes.dex */
    public static class a {
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static rk0 a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? rk0.i(a.a(configuration)) : rk0.a(configuration.locale);
    }
}
