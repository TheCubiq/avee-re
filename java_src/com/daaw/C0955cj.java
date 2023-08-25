package com.daaw;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
/* renamed from: com.daaw.cj */
/* loaded from: classes.dex */
public final class C0955cj {

    /* renamed from: com.daaw.cj$a */
    /* loaded from: classes.dex */
    public static class C0956a {
        /* renamed from: a */
        public static LocaleList m25364a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    /* renamed from: a */
    public static rk0 m25365a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? rk0.m11219i(C0956a.m25364a(configuration)) : rk0.m11227a(configuration.locale);
    }
}
