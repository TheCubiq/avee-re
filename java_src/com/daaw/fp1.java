package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
/* loaded from: classes.dex */
public final class fp1 {
    public static boolean a(Context context, int i) {
        if (b(context, i, "com.google.android.gms")) {
            try {
                return d80.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
        return false;
    }

    @TargetApi(19)
    public static boolean b(Context context, int i, String str) {
        return ez1.a(context).h(i, str);
    }
}
