package com.daaw;
/* loaded from: classes.dex */
public class qg0 {
    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        String[] strArr = new String[2];
        br1.B(str, 58, strArr);
        if ("internalres".equals(strArr[0])) {
            return fs.b().a(strArr[1], 0);
        }
        return 0;
    }
}
