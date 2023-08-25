package com.daaw;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
/* loaded from: classes.dex */
public final class fp1 {
    /* renamed from: a */
    public static boolean m22425a(Context context, int i) {
        if (m22424b(context, i, "com.google.android.gms")) {
            try {
                return d80.m24607a(context).m24606b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
        return false;
    }

    @TargetApi(19)
    /* renamed from: b */
    public static boolean m22424b(Context context, int i, String str) {
        return ez1.m22979a(context).m19339h(i, str);
    }
}
