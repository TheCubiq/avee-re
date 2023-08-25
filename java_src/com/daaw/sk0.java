package com.daaw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
/* loaded from: classes.dex */
public final class sk0 implements tk0 {
    public static final Locale[] c = new Locale[0];
    public static final Locale d = new Locale("en", "XA");
    public static final Locale e = new Locale("ar", "XB");
    public static final Locale f = rk0.b("en-Latn");
    public final Locale[] a;
    public final String b;

    public sk0(Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.a = c;
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
                    c(sb2, locale2);
                    if (i < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.a = (Locale[]) arrayList.toArray(new Locale[0]);
            sb = sb2.toString();
        }
        this.b = sb;
    }

    public static void c(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // com.daaw.tk0
    public String a() {
        return this.b;
    }

    @Override // com.daaw.tk0
    public Object b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sk0)) {
            return false;
        }
        Locale[] localeArr = ((sk0) obj).a;
        if (this.a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.a;
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
            Locale[] localeArr = this.a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale locale : this.a) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    @Override // com.daaw.tk0
    public boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // com.daaw.tk0
    public int size() {
        return this.a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.a;
            if (i >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i]);
            if (i < this.a.length - 1) {
                sb.append(',');
            }
            i++;
        }
    }
}
