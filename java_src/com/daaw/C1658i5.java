package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
/* renamed from: com.daaw.i5 */
/* loaded from: classes.dex */
public class C1658i5 {

    /* renamed from: a */
    public static int f13254a = 1;

    /* renamed from: b */
    public static int f13255b = 2;

    /* renamed from: c */
    public static int f13256c = 3;

    /* renamed from: d */
    public static int f13257d = 4;

    /* renamed from: a */
    public static boolean m20123a(Context context, Activity activity) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            boolean z = context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
            boolean z2 = context.checkSelfPermission("android.permission.RECORD_AUDIO") == 0;
            String[] strArr = null;
            if (!z && !z2) {
                strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.RECORD_AUDIO"};
                i = f13257d;
            } else if (!z) {
                strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
                i = f13254a;
            } else if (z2) {
                i = 0;
            } else {
                strArr = new String[]{"android.permission.RECORD_AUDIO"};
                i = f13255b;
            }
            if (strArr != null) {
                if (activity != null) {
                    C2670q0.m12827o(activity, strArr, i);
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m20122b(Context context, Activity activity) {
        if (Build.VERSION.SDK_INT < 23 || context.checkSelfPermission("android.permission.WRITE_SETTINGS") == 0) {
            return true;
        }
        if (activity != null) {
            C2670q0.m12827o(activity, new String[]{"android.permission.WRITE_SETTINGS"}, f13256c);
            return false;
        }
        return false;
    }
}
