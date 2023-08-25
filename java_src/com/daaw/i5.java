package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
/* loaded from: classes.dex */
public class i5 {
    public static int a = 1;
    public static int b = 2;
    public static int c = 3;
    public static int d = 4;

    public static boolean a(Context context, Activity activity) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            boolean z = context.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
            boolean z2 = context.checkSelfPermission("android.permission.RECORD_AUDIO") == 0;
            String[] strArr = null;
            if (!z && !z2) {
                strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.RECORD_AUDIO"};
                i = d;
            } else if (!z) {
                strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
                i = a;
            } else if (z2) {
                i = 0;
            } else {
                strArr = new String[]{"android.permission.RECORD_AUDIO"};
                i = b;
            }
            if (strArr != null) {
                if (activity != null) {
                    q0.o(activity, strArr, i);
                }
                return false;
            }
        }
        return true;
    }

    public static boolean b(Context context, Activity activity) {
        if (Build.VERSION.SDK_INT < 23 || context.checkSelfPermission("android.permission.WRITE_SETTINGS") == 0) {
            return true;
        }
        if (activity != null) {
            q0.o(activity, new String[]{"android.permission.WRITE_SETTINGS"}, c);
            return false;
        }
        return false;
    }
}
