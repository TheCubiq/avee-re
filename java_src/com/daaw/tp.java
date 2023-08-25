package com.daaw;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes2.dex */
public class tp {
    public static String a(long j) {
        return b(j, Locale.getDefault());
    }

    public static String b(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? oq1.b(locale).format(new Date(j)) : oq1.f(locale).format(new Date(j));
    }

    public static String c(Context context, long j) {
        return DateUtils.formatDateTime(context, j - TimeZone.getDefault().getOffset(j), 36);
    }

    public static String d(long j) {
        return e(j, Locale.getDefault());
    }

    public static String e(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? oq1.m(locale).format(new Date(j)) : oq1.f(locale).format(new Date(j));
    }
}
