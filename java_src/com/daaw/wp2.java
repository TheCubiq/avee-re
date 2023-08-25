package com.daaw;

import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes2.dex */
public final class wp2 implements Iterable, gl2 {

    /* renamed from: p */
    public final String f31435p;

    public wp2(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f31435p = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016f  */
    @Override // com.daaw.gl2
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gl2 mo2708d(String str, w07 w07Var, List list) {
        String str2;
        String str3;
        String str4;
        String str5;
        char c;
        String str6;
        String str7;
        String str8;
        String str9;
        wp2 wp2Var;
        int i;
        gl2 tb2Var;
        double doubleValue;
        Matcher matcher;
        double min;
        double min2;
        int i2;
        int i3;
        w07 w07Var2;
        int i4;
        String str10;
        String str11;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str)) {
            str2 = "toLocaleUpperCase";
            str3 = "toUpperCase";
        } else {
            str3 = "toUpperCase";
            str2 = "toLocaleUpperCase";
            if (!str3.equals(str) && !str2.equals(str)) {
                str4 = "hasOwnProperty";
                if (!"trim".equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
                switch (str.hashCode()) {
                    case -1789698943:
                        String str12 = "charAt";
                        String str13 = str4;
                        str5 = "toString";
                        boolean equals = str.equals(str13);
                        str6 = str13;
                        str10 = str12;
                        if (equals) {
                            c = 2;
                            str7 = str13;
                            str8 = str12;
                            break;
                        }
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case -1776922004:
                        String str14 = "charAt";
                        str5 = "toString";
                        if (str.equals(str5)) {
                            c = 14;
                            str7 = str4;
                            str8 = str14;
                            break;
                        } else {
                            str6 = str4;
                            str10 = str14;
                            c = 65535;
                            str7 = str6;
                            str8 = str10;
                            break;
                        }
                    case -1464939364:
                        String str15 = "charAt";
                        str11 = str15;
                        if (str.equals("toLocaleLowerCase")) {
                            c = '\f';
                            str9 = str15;
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case -1361633751:
                        String str16 = "charAt";
                        boolean equals2 = str.equals(str16);
                        str11 = str16;
                        if (equals2) {
                            str7 = str4;
                            str5 = "toString";
                            c = 0;
                            str8 = str16;
                            break;
                        }
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case -1354795244:
                        if (str.equals("concat")) {
                            str8 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            c = 1;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case -1137582698:
                        if (str.equals("toLowerCase")) {
                            c = '\r';
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case -906336856:
                        if (str.equals("search")) {
                            c = 7;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case -726908483:
                        if (str.equals(str2)) {
                            c = 11;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case -467511597:
                        if (str.equals("lastIndexOf")) {
                            c = 4;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case -399551817:
                        if (str.equals(str3)) {
                            c = 15;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case 3568674:
                        if (str.equals("trim")) {
                            c = 16;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case 103668165:
                        if (str.equals("match")) {
                            c = 5;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case 109526418:
                        if (str.equals("slice")) {
                            c = '\b';
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case 109648666:
                        if (str.equals("split")) {
                            c = '\t';
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case 530542161:
                        if (str.equals("substring")) {
                            c = '\n';
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case 1094496948:
                        if (str.equals("replace")) {
                            c = 6;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    case 1943291465:
                        if (str.equals("indexOf")) {
                            c = 3;
                            str9 = "charAt";
                            str7 = str4;
                            str5 = "toString";
                            str8 = str9;
                            break;
                        }
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                    default:
                        str11 = "charAt";
                        str6 = str4;
                        str5 = "toString";
                        str10 = str11;
                        c = 65535;
                        str7 = str6;
                        str8 = str10;
                        break;
                }
                String str17 = AdError.UNDEFINED_DOMAIN;
                String str18 = str7;
                String str19 = str8;
                switch (c) {
                    case 0:
                        ou7.m13914j(str19, 1, list);
                        int m13923a = !list.isEmpty() ? (int) ou7.m13923a(w07Var.m6608b((gl2) list.get(0)).zzh().doubleValue()) : 0;
                        String str20 = this.f31435p;
                        return (m13923a < 0 || m13923a >= str20.length()) ? gl2.f11427n : new wp2(String.valueOf(str20.charAt(m13923a)));
                    case 1:
                        wp2Var = this;
                        if (!list.isEmpty()) {
                            StringBuilder sb = new StringBuilder(wp2Var.f31435p);
                            for (int i5 = 0; i5 < list.size(); i5++) {
                                sb.append(w07Var.m6608b((gl2) list.get(i5)).zzi());
                            }
                            return new wp2(sb.toString());
                        }
                        return wp2Var;
                    case 2:
                        ou7.m13916h(str18, 1, list);
                        String str21 = this.f31435p;
                        gl2 m6608b = w07Var.m6608b((gl2) list.get(0));
                        if (!"length".equals(m6608b.zzi())) {
                            double doubleValue2 = m6608b.zzh().doubleValue();
                            if (doubleValue2 != Math.floor(doubleValue2) || (i = (int) doubleValue2) < 0 || i >= str21.length()) {
                                return gl2.f11426m;
                            }
                        }
                        return gl2.f11425l;
                    case 3:
                        ou7.m13914j("indexOf", 2, list);
                        String str22 = this.f31435p;
                        if (list.size() > 0) {
                            str17 = w07Var.m6608b((gl2) list.get(0)).zzi();
                        }
                        tb2Var = new tb2(Double.valueOf(str22.indexOf(str17, (int) ou7.m13923a(list.size() < 2 ? 0.0d : w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue()))));
                        return tb2Var;
                    case 4:
                        ou7.m13914j("lastIndexOf", 2, list);
                        String str23 = this.f31435p;
                        if (list.size() > 0) {
                            str17 = w07Var.m6608b((gl2) list.get(0)).zzi();
                        }
                        String str24 = str17;
                        tb2Var = new tb2(Double.valueOf(str23.lastIndexOf(str24, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue()) ? Double.POSITIVE_INFINITY : ou7.m13923a(doubleValue)))));
                        return tb2Var;
                    case 5:
                        ou7.m13914j("match", 1, list);
                        Matcher matcher2 = Pattern.compile(list.size() <= 0 ? "" : w07Var.m6608b((gl2) list.get(0)).zzi()).matcher(this.f31435p);
                        return matcher2.find() ? new z72(Arrays.asList(new wp2(matcher2.group()))) : gl2.f11421h;
                    case 6:
                        wp2Var = this;
                        ou7.m13914j("replace", 2, list);
                        gl2 gl2Var = gl2.f11420g;
                        if (!list.isEmpty()) {
                            str17 = w07Var.m6608b((gl2) list.get(0)).zzi();
                            if (list.size() > 1) {
                                gl2Var = w07Var.m6608b((gl2) list.get(1));
                            }
                        }
                        String str25 = str17;
                        String str26 = wp2Var.f31435p;
                        int indexOf = str26.indexOf(str25);
                        if (indexOf >= 0) {
                            if (gl2Var instanceof ad2) {
                                gl2Var = ((ad2) gl2Var).mo5780a(w07Var, Arrays.asList(new wp2(str25), new tb2(Double.valueOf(indexOf)), wp2Var));
                            }
                            tb2Var = new wp2(str26.substring(0, indexOf) + gl2Var.zzi() + str26.substring(indexOf + str25.length()));
                            return tb2Var;
                        }
                        return wp2Var;
                    case 7:
                        ou7.m13914j("search", 1, list);
                        if (!list.isEmpty()) {
                            str17 = w07Var.m6608b((gl2) list.get(0)).zzi();
                        }
                        return Pattern.compile(str17).matcher(this.f31435p).find() ? new tb2(Double.valueOf(matcher.start())) : new tb2(Double.valueOf(-1.0d));
                    case '\b':
                        ou7.m13914j("slice", 2, list);
                        String str27 = this.f31435p;
                        double m13923a2 = ou7.m13923a(!list.isEmpty() ? w07Var.m6608b((gl2) list.get(0)).zzh().doubleValue() : 0.0d);
                        if (m13923a2 < 0.0d) {
                            double length = str27.length();
                            Double.isNaN(length);
                            min = Math.max(length + m13923a2, 0.0d);
                        } else {
                            min = Math.min(m13923a2, str27.length());
                        }
                        int i6 = (int) min;
                        double m13923a3 = ou7.m13923a(list.size() > 1 ? w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue() : str27.length());
                        if (m13923a3 < 0.0d) {
                            double length2 = str27.length();
                            Double.isNaN(length2);
                            min2 = Math.max(length2 + m13923a3, 0.0d);
                        } else {
                            min2 = Math.min(m13923a3, str27.length());
                        }
                        tb2Var = new wp2(str27.substring(i6, Math.max(0, ((int) min2) - i6) + i6));
                        return tb2Var;
                    case '\t':
                        ou7.m13914j("split", 2, list);
                        String str28 = this.f31435p;
                        if (str28.length() == 0) {
                            return new z72(Arrays.asList(this));
                        }
                        ArrayList arrayList = new ArrayList();
                        if (list.isEmpty()) {
                            arrayList.add(this);
                        } else {
                            String zzi = w07Var.m6608b((gl2) list.get(0)).zzi();
                            long m13920d = list.size() > 1 ? ou7.m13920d(w07Var.m6608b((gl2) list.get(1)).zzh().doubleValue()) : 2147483647L;
                            if (m13920d == 0) {
                                return new z72();
                            }
                            String[] split = str28.split(Pattern.quote(zzi), ((int) m13920d) + 1);
                            int length3 = split.length;
                            if (!zzi.isEmpty() || length3 <= 0) {
                                i2 = length3;
                                i3 = 0;
                            } else {
                                boolean isEmpty = split[0].isEmpty();
                                i2 = length3 - 1;
                                i3 = isEmpty;
                                if (!split[i2].isEmpty()) {
                                    i2 = length3;
                                    i3 = isEmpty;
                                }
                            }
                            if (length3 > m13920d) {
                                i2--;
                            }
                            while (i3 < i2) {
                                arrayList.add(new wp2(split[i3]));
                                i3++;
                            }
                        }
                        return new z72(arrayList);
                    case '\n':
                        ou7.m13914j("substring", 2, list);
                        String str29 = this.f31435p;
                        if (list.isEmpty()) {
                            w07Var2 = w07Var;
                            i4 = 0;
                        } else {
                            w07Var2 = w07Var;
                            i4 = (int) ou7.m13923a(w07Var2.m6608b((gl2) list.get(0)).zzh().doubleValue());
                        }
                        int m13923a4 = list.size() > 1 ? (int) ou7.m13923a(w07Var2.m6608b((gl2) list.get(1)).zzh().doubleValue()) : str29.length();
                        int min3 = Math.min(Math.max(i4, 0), str29.length());
                        int min4 = Math.min(Math.max(m13923a4, 0), str29.length());
                        tb2Var = new wp2(str29.substring(Math.min(min3, min4), Math.max(min3, min4)));
                        return tb2Var;
                    case 11:
                        ou7.m13916h(str2, 0, list);
                        return new wp2(this.f31435p.toUpperCase());
                    case '\f':
                        ou7.m13916h("toLocaleLowerCase", 0, list);
                        return new wp2(this.f31435p.toLowerCase());
                    case '\r':
                        ou7.m13916h("toLowerCase", 0, list);
                        return new wp2(this.f31435p.toLowerCase(Locale.ENGLISH));
                    case 14:
                        wp2Var = this;
                        ou7.m13916h(str5, 0, list);
                        return wp2Var;
                    case 15:
                        ou7.m13916h(str3, 0, list);
                        return new wp2(this.f31435p.toUpperCase(Locale.ENGLISH));
                    case 16:
                        ou7.m13916h(str3, 0, list);
                        return new wp2(this.f31435p.trim());
                    default:
                        throw new IllegalArgumentException("Command not supported");
                }
            }
        }
        str4 = "hasOwnProperty";
        switch (str.hashCode()) {
            case -1789698943:
                break;
            case -1776922004:
                break;
            case -1464939364:
                break;
            case -1361633751:
                break;
            case -1354795244:
                break;
            case -1137582698:
                break;
            case -906336856:
                break;
            case -726908483:
                break;
            case -467511597:
                break;
            case -399551817:
                break;
            case 3568674:
                break;
            case 103668165:
                break;
            case 109526418:
                break;
            case 109648666:
                break;
            case 530542161:
                break;
            case 1094496948:
                break;
            case 1943291465:
                break;
        }
        String str172 = AdError.UNDEFINED_DOMAIN;
        String str182 = str7;
        String str192 = str8;
        switch (c) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wp2) {
            return this.f31435p.equals(((wp2) obj).f31435p);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31435p.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new so2(this);
    }

    public final String toString() {
        String str = this.f31435p;
        return "\"" + str + "\"";
    }

    @Override // com.daaw.gl2
    public final gl2 zzd() {
        return new wp2(this.f31435p);
    }

    @Override // com.daaw.gl2
    public final Boolean zzg() {
        return Boolean.valueOf(!this.f31435p.isEmpty());
    }

    @Override // com.daaw.gl2
    public final Double zzh() {
        double d;
        if (this.f31435p.isEmpty()) {
            d = 0.0d;
        } else {
            try {
                return Double.valueOf(this.f31435p);
            } catch (NumberFormatException unused) {
                d = Double.NaN;
            }
        }
        return Double.valueOf(d);
    }

    @Override // com.daaw.gl2
    public final String zzi() {
        return this.f31435p;
    }

    @Override // com.daaw.gl2
    public final Iterator zzl() {
        return new nn2(this);
    }
}
