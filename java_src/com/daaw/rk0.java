package com.daaw;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;
/* loaded from: classes.dex */
public final class rk0 {

    /* renamed from: b */
    public static final rk0 f25389b = m11227a(new Locale[0]);

    /* renamed from: a */
    public final tk0 f25390a;

    /* renamed from: com.daaw.rk0$a */
    /* loaded from: classes.dex */
    public static class C2867a {

        /* renamed from: a */
        public static final Locale[] f25391a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        /* renamed from: a */
        public static Locale m11218a(String str) {
            return Locale.forLanguageTag(str);
        }

        /* renamed from: b */
        public static boolean m11217b(Locale locale) {
            for (Locale locale2 : f25391a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        public static boolean m11216c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || m11217b(locale) || m11217b(locale2)) {
                return false;
            }
            String m9340c = tc0.m9340c(locale);
            if (m9340c.isEmpty()) {
                String country = locale.getCountry();
                return country.isEmpty() || country.equals(locale2.getCountry());
            }
            return m9340c.equals(tc0.m9340c(locale2));
        }
    }

    /* renamed from: com.daaw.rk0$b */
    /* loaded from: classes.dex */
    public static class C2868b {
        /* renamed from: a */
        public static LocaleList m11215a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        /* renamed from: b */
        public static LocaleList m11214b() {
            return LocaleList.getAdjustedDefault();
        }

        /* renamed from: c */
        public static LocaleList m11213c() {
            return LocaleList.getDefault();
        }
    }

    public rk0(tk0 tk0Var) {
        this.f25390a = tk0Var;
    }

    /* renamed from: a */
    public static rk0 m11227a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? m11219i(C2868b.m11215a(localeArr)) : new rk0(new sk0(localeArr));
    }

    /* renamed from: b */
    public static Locale m11226b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: c */
    public static rk0 m11225c(String str) {
        if (str == null || str.isEmpty()) {
            return m11223e();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Build.VERSION.SDK_INT >= 21 ? C2867a.m11218a(split[i]) : m11226b(split[i]);
        }
        return m11227a(localeArr);
    }

    /* renamed from: e */
    public static rk0 m11223e() {
        return f25389b;
    }

    /* renamed from: i */
    public static rk0 m11219i(LocaleList localeList) {
        return new rk0(new uk0(localeList));
    }

    /* renamed from: d */
    public Locale m11224d(int i) {
        return this.f25390a.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof rk0) && this.f25390a.equals(((rk0) obj).f25390a);
    }

    /* renamed from: f */
    public boolean m11222f() {
        return this.f25390a.isEmpty();
    }

    /* renamed from: g */
    public int m11221g() {
        return this.f25390a.size();
    }

    /* renamed from: h */
    public String m11220h() {
        return this.f25390a.mo8083a();
    }

    public int hashCode() {
        return this.f25390a.hashCode();
    }

    public String toString() {
        return this.f25390a.toString();
    }
}
