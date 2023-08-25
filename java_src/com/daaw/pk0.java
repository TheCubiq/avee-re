package com.daaw;
/* loaded from: classes.dex */
public class pk0 {
    public static String a(String str) {
        if (str == null) {
            return null;
        }
        String[] strArr = new String[2];
        br1.B(str, 58, strArr);
        if ("local".equals(strArr[0])) {
            return strArr[1];
        }
        return null;
    }
}
