package com.daaw;

import android.content.Context;
/* loaded from: classes2.dex */
public class jg0 {
    public String a;

    public static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    public synchronized String a(Context context) {
        if (this.a == null) {
            this.a = b(context);
        }
        return "".equals(this.a) ? null : this.a;
    }
}
