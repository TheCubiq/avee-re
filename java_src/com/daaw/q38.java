package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
/* loaded from: classes2.dex */
public final class q38 {
    /* renamed from: a */
    public static String m12790a(String str, String[] strArr, String[] strArr2) {
        ry0.m10830j(strArr);
        ry0.m10830j(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m12789b(Context context, String str, String str2) {
        ry0.m10830j(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = ji6.m18489a(context);
        }
        return ji6.m18488b("google_app_id", resources, str2);
    }
}
