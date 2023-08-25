package com.daaw;

import java.util.Locale;
/* renamed from: com.daaw.wk */
/* loaded from: classes2.dex */
public class C3445wk implements Cloneable {

    /* renamed from: p */
    public final String[] f31281p;

    /* renamed from: q */
    public final String[] f31282q;

    /* renamed from: r */
    public final gx0[] f31283r;

    /* renamed from: s */
    public String f31284s;

    public C3445wk(String[] strArr, String[] strArr2, gx0[] gx0VarArr, String str) {
        if (strArr.length <= 0) {
            throw new IllegalArgumentException("Empty extension array");
        }
        if (strArr2.length <= 0) {
            throw new IllegalArgumentException("Empty MIME type array");
        }
        this.f31281p = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            this.f31281p[i] = strArr[i].toLowerCase(Locale.ENGLISH);
        }
        this.f31282q = new String[strArr2.length];
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            this.f31282q[i2] = strArr2[i2].toLowerCase(Locale.ENGLISH);
        }
        this.f31284s = str;
        this.f31283r = gx0VarArr == null ? new gx0[0] : (gx0[]) gx0VarArr.clone();
    }

    /* renamed from: a */
    public boolean m6038a(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        boolean z = false;
        for (String str2 : this.f31281p) {
            z = z || lowerCase.endsWith(str2);
        }
        return z;
    }

    public Object clone() {
        return super.clone();
    }
}
