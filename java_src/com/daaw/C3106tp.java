package com.daaw;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/* renamed from: com.daaw.tp */
/* loaded from: classes2.dex */
public class C3106tp {
    /* renamed from: a */
    public static String m8894a(long j) {
        return m8893b(j, Locale.getDefault());
    }

    /* renamed from: b */
    public static String m8893b(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? oq1.m14085b(locale).format(new Date(j)) : oq1.m14081f(locale).format(new Date(j));
    }

    /* renamed from: c */
    public static String m8892c(Context context, long j) {
        return DateUtils.formatDateTime(context, j - TimeZone.getDefault().getOffset(j), 36);
    }

    /* renamed from: d */
    public static String m8891d(long j) {
        return m8890e(j, Locale.getDefault());
    }

    /* renamed from: e */
    public static String m8890e(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? oq1.m14074m(locale).format(new Date(j)) : oq1.m14081f(locale).format(new Date(j));
    }
}
