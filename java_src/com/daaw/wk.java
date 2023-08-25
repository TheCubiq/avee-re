package com.daaw;

import java.util.Locale;
/* loaded from: classes2.dex */
public class wk implements Cloneable {
    public final String[] p;
    public final String[] q;
    public final gx0[] r;
    public String s;

    public wk(String[] strArr, String[] strArr2, gx0[] gx0VarArr, String str) {
        if (strArr.length <= 0) {
            throw new IllegalArgumentException("Empty extension array");
        }
        if (strArr2.length <= 0) {
            throw new IllegalArgumentException("Empty MIME type array");
        }
        this.p = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            this.p[i] = strArr[i].toLowerCase(Locale.ENGLISH);
        }
        this.q = new String[strArr2.length];
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            this.q[i2] = strArr2[i2].toLowerCase(Locale.ENGLISH);
        }
        this.s = str;
        this.r = gx0VarArr == null ? new gx0[0] : (gx0[]) gx0VarArr.clone();
    }

    public boolean a(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        boolean z = false;
        for (String str2 : this.p) {
            z = z || lowerCase.endsWith(str2);
        }
        return z;
    }

    public Object clone() {
        return super.clone();
    }
}
