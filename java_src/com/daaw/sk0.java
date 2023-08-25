package com.daaw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
/* loaded from: classes.dex */
public final class sk0 implements tk0 {

    /* renamed from: c */
    public static final Locale[] f26325c = new Locale[0];

    /* renamed from: d */
    public static final Locale f26326d = new Locale("en", "XA");

    /* renamed from: e */
    public static final Locale f26327e = new Locale("ar", "XB");

    /* renamed from: f */
    public static final Locale f26328f = rk0.m11226b("en-Latn");

    /* renamed from: a */
    public final Locale[] f26329a;

    /* renamed from: b */
    public final String f26330b;

    public sk0(Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.f26329a = f26325c;
            sb = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < localeArr.length; i++) {
                Locale locale = localeArr[i];
                if (locale == null) {
                    throw new NullPointerException("list[" + i + "] is null");
                }
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m10274c(sb2, locale2);
                    if (i < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.f26329a = (Locale[]) arrayList.toArray(new Locale[0]);
            sb = sb2.toString();
        }
        this.f26330b = sb;
    }

    /* renamed from: c */
    public static void m10274c(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // com.daaw.tk0
    /* renamed from: a */
    public String mo8083a() {
        return this.f26330b;
    }

    @Override // com.daaw.tk0
    /* renamed from: b */
    public Object mo8082b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sk0)) {
            return false;
        }
        Locale[] localeArr = ((sk0) obj).f26329a;
        if (this.f26329a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f26329a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    @Override // com.daaw.tk0
    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f26329a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale locale : this.f26329a) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    @Override // com.daaw.tk0
    public boolean isEmpty() {
        return this.f26329a.length == 0;
    }

    @Override // com.daaw.tk0
    public int size() {
        return this.f26329a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f26329a;
            if (i >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i]);
            if (i < this.f26329a.length - 1) {
                sb.append(',');
            }
            i++;
        }
    }
}
