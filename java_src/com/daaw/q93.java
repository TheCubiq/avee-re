package com.daaw;

import android.text.TextUtils;
/* loaded from: classes.dex */
public final class q93 extends r93 {
    /* renamed from: b */
    public static final String m12691b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && str.charAt(i2) == ',') {
            i2++;
        }
        while (length > 0) {
            int i3 = length - 1;
            if (str.charAt(i3) != ',') {
                break;
            }
            length = i3;
        }
        if (length < i2) {
            return null;
        }
        if (i2 != 0) {
            i = i2;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i, length);
    }

    @Override // com.daaw.r93
    /* renamed from: a */
    public final String mo11550a(String str, String str2) {
        String m12691b = m12691b(str);
        String m12691b2 = m12691b(str2);
        if (TextUtils.isEmpty(m12691b)) {
            return m12691b2;
        }
        if (TextUtils.isEmpty(m12691b2)) {
            return m12691b;
        }
        return m12691b + "," + m12691b2;
    }
}
