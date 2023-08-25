package com.daaw;

import java.util.Locale;
/* loaded from: classes.dex */
public final class kq1 {

    /* renamed from: a */
    public final String[] f16690a;

    /* renamed from: b */
    public final int[] f16691b;

    /* renamed from: c */
    public final String[] f16692c;

    /* renamed from: d */
    public final int f16693d;

    public kq1(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.f16690a = strArr;
        this.f16691b = iArr;
        this.f16692c = strArr2;
        this.f16693d = i;
    }

    /* renamed from: b */
    public static kq1 m17487b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new kq1(strArr, iArr, strArr2, m17486c(str, strArr, iArr, strArr2));
    }

    /* renamed from: c */
    public static int m17486c(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String str2;
        strArr[0] = "";
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int indexOf = str.indexOf("$", i);
            char c = 65535;
            if (indexOf == -1) {
                strArr[i2] = strArr[i2] + str.substring(i);
                i = str.length();
            } else if (indexOf != i) {
                strArr[i2] = strArr[i2] + str.substring(i, indexOf);
                i = indexOf;
            } else if (str.startsWith("$$", i)) {
                strArr[i2] = strArr[i2] + "$";
                i += 2;
            } else {
                int i3 = i + 1;
                int indexOf2 = str.indexOf("$", i3);
                String substring = str.substring(i3, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i2] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d")) {
                            str2 = str2 + "d";
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.hashCode();
                    switch (substring.hashCode()) {
                        case -1950496919:
                            if (substring.equals("Number")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 2606829:
                            if (substring.equals("Time")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 38199441:
                            if (substring.equals("Bandwidth")) {
                                c = 2;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            iArr[i2] = 2;
                            break;
                        case 1:
                            iArr[i2] = 4;
                            break;
                        case 2:
                            iArr[i2] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    strArr2[i2] = str2;
                }
                i2++;
                strArr[i2] = "";
                i = indexOf2 + 1;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public String m17488a(String str, long j, int i, long j2) {
        String format;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.f16693d;
            if (i2 >= i3) {
                sb.append(this.f16690a[i3]);
                return sb.toString();
            }
            sb.append(this.f16690a[i2]);
            int[] iArr = this.f16691b;
            if (iArr[i2] == 1) {
                sb.append(str);
            } else {
                if (iArr[i2] == 2) {
                    format = String.format(Locale.US, this.f16692c[i2], Long.valueOf(j));
                } else if (iArr[i2] == 3) {
                    format = String.format(Locale.US, this.f16692c[i2], Integer.valueOf(i));
                } else if (iArr[i2] == 4) {
                    format = String.format(Locale.US, this.f16692c[i2], Long.valueOf(j2));
                }
                sb.append(format);
            }
            i2++;
        }
    }
}
