package com.daaw;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public class oq1 {
    public static AtomicReference<ll1> a = new AtomicReference<>();

    public static long a(long j) {
        Calendar k = k();
        k.setTimeInMillis(j);
        return d(k).getTimeInMillis();
    }

    @TargetApi(24)
    public static DateFormat b(Locale locale) {
        return c("MMMEd", locale);
    }

    @TargetApi(24)
    public static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(j());
        return instanceForSkeleton;
    }

    public static Calendar d(Calendar calendar) {
        Calendar l = l(calendar);
        Calendar k = k();
        k.set(l.get(1), l.get(2), l.get(5));
        return k;
    }

    public static java.text.DateFormat e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(h());
        return dateInstance;
    }

    public static java.text.DateFormat f(Locale locale) {
        return e(0, locale);
    }

    public static ll1 g() {
        ll1 ll1Var = a.get();
        return ll1Var == null ? ll1.c() : ll1Var;
    }

    public static TimeZone h() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar i() {
        Calendar a2 = g().a();
        a2.set(11, 0);
        a2.set(12, 0);
        a2.set(13, 0);
        a2.set(14, 0);
        a2.setTimeZone(h());
        return a2;
    }

    @TargetApi(24)
    public static android.icu.util.TimeZone j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar k() {
        return l(null);
    }

    public static Calendar l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(24)
    public static DateFormat m(Locale locale) {
        return c("yMMMEd", locale);
    }
}
