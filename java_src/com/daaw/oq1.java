package com.daaw;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public class oq1 {

    /* renamed from: a */
    public static AtomicReference<ll1> f21827a = new AtomicReference<>();

    /* renamed from: a */
    public static long m14086a(long j) {
        Calendar m14076k = m14076k();
        m14076k.setTimeInMillis(j);
        return m14083d(m14076k).getTimeInMillis();
    }

    @TargetApi(24)
    /* renamed from: b */
    public static DateFormat m14085b(Locale locale) {
        return m14084c("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: c */
    public static DateFormat m14084c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m14077j());
        return instanceForSkeleton;
    }

    /* renamed from: d */
    public static Calendar m14083d(Calendar calendar) {
        Calendar m14075l = m14075l(calendar);
        Calendar m14076k = m14076k();
        m14076k.set(m14075l.get(1), m14075l.get(2), m14075l.get(5));
        return m14076k;
    }

    /* renamed from: e */
    public static java.text.DateFormat m14082e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m14079h());
        return dateInstance;
    }

    /* renamed from: f */
    public static java.text.DateFormat m14081f(Locale locale) {
        return m14082e(0, locale);
    }

    /* renamed from: g */
    public static ll1 m14080g() {
        ll1 ll1Var = f21827a.get();
        return ll1Var == null ? ll1.m16875c() : ll1Var;
    }

    /* renamed from: h */
    public static TimeZone m14079h() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: i */
    public static Calendar m14078i() {
        Calendar m16877a = m14080g().m16877a();
        m16877a.set(11, 0);
        m16877a.set(12, 0);
        m16877a.set(13, 0);
        m16877a.set(14, 0);
        m16877a.setTimeZone(m14079h());
        return m16877a;
    }

    @TargetApi(24)
    /* renamed from: j */
    public static android.icu.util.TimeZone m14077j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: k */
    public static Calendar m14076k() {
        return m14075l(null);
    }

    /* renamed from: l */
    public static Calendar m14075l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m14079h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(24)
    /* renamed from: m */
    public static DateFormat m14074m(Locale locale) {
        return m14084c("yMMMEd", locale);
    }
}
