package com.daaw;

import android.content.Context;
/* loaded from: classes2.dex */
public class jg0 {

    /* renamed from: a */
    public String f15078a;

    /* renamed from: b */
    public static String m18528b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* renamed from: a */
    public synchronized String m18529a(Context context) {
        if (this.f15078a == null) {
            this.f15078a = m18528b(context);
        }
        return "".equals(this.f15078a) ? null : this.f15078a;
    }
}
