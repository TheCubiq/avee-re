package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
/* loaded from: classes2.dex */
public final class q38 {
    public static String a(String str, String[] strArr, String[] strArr2) {
        ry0.j(strArr);
        ry0.j(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    public static String b(Context context, String str, String str2) {
        ry0.j(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = ji6.a(context);
        }
        return ji6.b("google_app_id", resources, str2);
    }
}
